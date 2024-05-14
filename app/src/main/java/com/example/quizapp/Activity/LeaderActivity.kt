package com.example.quizapp.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.quizapp.Adapter.LeaderAdapter
import com.example.quizapp.Domain.UserModel
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityLeaderBinding

class LeaderActivity : AppCompatActivity() {
    lateinit var  binding: ActivityLeaderBinding
    private val leaderAdapter by lazy { LeaderAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window: Window = this@LeaderActivity.window
        window.statusBarColor = ContextCompat.getColor(this@LeaderActivity, R.color.grey)

        binding.apply {

            // ToDo: Set bottomNav to Leaderboard
            bottomNav.selectedItemId = R.id.board
            bottomNav.setOnItemSelectedListener {
                if (it.itemId == R.id.home) {
                    startActivity(Intent(this@LeaderActivity, MainActivity::class.java))
                }
                true
            }

            var list: MutableList<UserModel> = loadData()

            leaderAdapter.differ.submitList(list)

            leaderRecyclerView.apply {
                //LayoutManager = LinearLayoutManager(this@LeaderActivity)
                adapter = leaderAdapter
            }
        }


    }

    private fun loadData(): MutableList<UserModel> { // ToDo: after get data from firebase
        //example
        val users = mutableListOf<UserModel>()
        users.add(UserModel(1, "Mehmet Utku Mese", "mutkumese@gmail.com", "https://avatars.githubusercontent.com/u/94257756?v=4", 5749))
        users.add(UserModel(2, "Mehmet Utku Mese", "mutkumese@gmail.com", "https://avatars.githubusercontent.com/u/94257756?v=4", 5749))
        users.add(UserModel(3, "Mehmet Utku Mese", "mutkumese@gmail.com", "https://avatars.githubusercontent.com/u/94257756?v=4", 5749))
        users.add(UserModel(4, "Mehmet Utku Mese", "mutkumese@gmail.com", "https://avatars.githubusercontent.com/u/94257756?v=4", 5749))
        users.add(UserModel(5, "Mehmet Utku Mese", "mutkumese@gmail.com", "https://avatars.githubusercontent.com/u/94257756?v=4", 5749))
        users.add(UserModel(6, "Mehmet Utku Mese", "mutkumese@gmail.com", "https://avatars.githubusercontent.com/u/94257756?v=4", 5749))
        users.add(UserModel(7, "Mehmet Utku Mese", "mutkumese@gmail.com", "https://avatars.githubusercontent.com/u/94257756?v=4", 5749))
        users.add(UserModel(8, "Mehmet Utku Mese", "mutkumese@gmail.com", "https://avatars.githubusercontent.com/u/94257756?v=4", 5749))
        users.add(UserModel(9, "Mehmet Utku Mese", "mutkumese@gmail.com", "https://avatars.githubusercontent.com/u/94257756?v=4", 5749))
        return users
    }
}
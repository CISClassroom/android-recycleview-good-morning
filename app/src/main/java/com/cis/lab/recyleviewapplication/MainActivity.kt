package com.cis.lab.recyleviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var linearLayout = LinearLayoutManager(this , RecyclerView.VERTICAL,false)
        var gridLayout = GridLayoutManager(this,2)

        recyclerView.layoutManager = linearLayout

        val users = ArrayList<User>()

        users.add(User("กฤษฎา  ท่าสะอาด","นาย",R.drawable.oil))
        users.add(User("เมธาวี สารีผล","นาย",R.drawable.junior))
        users.add(User("รุ่งโรจน์ พลเยี่ยม","นาย",R.drawable.o))
        users.add(User("พัชรี  แอแป","นางสาว",R.drawable.peet))
        users.add(User("สุรเดช บัวแดง","นาย",R.drawable.f))


        var adapter = UserAdapter(users)
        recyclerView.adapter = adapter
    }
}
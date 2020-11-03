package com.example.utssemester5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.adapter = adapter(data, { onItem: datafakultas -> onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: datafakultas) {
        val showDetailActivityIntent = Intent(this, detailfakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgfak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.namafak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descfak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descdetail)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<datafakultas> {
        val faklist = ArrayList<datafakultas>()
        faklist.add(
                datafakultas(
                        R.drawable.logoupnbaru,
                        "Fakultas Ekonomi dan Bisnis",
                        "\t Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas yang ada pada UPN 'Veteran' Jawa Timur.",
                        "Program Studi :\n" +
                                "\t\t 1. S1 Ekonomi Pembangunan\n" +
                                "\t\t 2. S1 Akuntansi\n" +
                                "\t\t 3. S1 Manajemen"
                )
        )
        faklist.add(
                datafakultas(
                        R.drawable.logoupnbaru,
                        "Fakultas Pertanian",
                        "\t Fakultas Pertanian merupakan salah satu dari 7 Fakultas yang ada pada UPN 'Veteran' Jawa Timur.",
                        "Program Studi :\n" +
                                "\t\t 1. S1 Agroteknologi\n" +
                                "\t\t 2. S1 Agribisnis"
                )
        )
        faklist.add(
                datafakultas(
                        R.drawable.logoupnbaru,
                        "Fakultas Teknik",
                        "\t Fakultas Teknik merupakan salah satu dari 7 Fakultas yang ada pada UPN 'Veteran' Jawa Timur.",
                        "Program Studi :\n" +
                                "\t\t 1. S1 Teknik Kimia\n" +
                                "\t\t 2. S1 Teknik Industri\n" +
                                "\t\t 3. S1 Teknik Sipil\n" +
                                "\t\t 4. S1 Teknik Lingkungan\n" +
                                "\t\t 5. S1 Teknologi Pangan"
                )
        )
        faklist.add(
            datafakultas(
                R.drawable.logoupnbaru,
                "Fakultas Ilmu Komputer",
                "\t Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas yang ada pada UPN 'Veteran' Jawa Timur.",
                "Program Studi :\n" +
                        "\t\t 1. Teknik Informatika\n" +
                        "\t\t 2. Sistem Informasi"
            )
        )

        faklist.add(
            datafakultas(
                R.drawable.img_2002_1,
                "Short Profile",
                "Nama   \t: Arrandi Muhamad Riesta\n"+
                        "TTL    \t: Sidoarjo, 12 Juni 2000\n" +
                        "Alamat \t: Sukodono, Sidoarjo\n" +
                        "No. HP \t: +62 852 3127 4554\n" +
                        "Email  \t: arrandimuhamadriesta12@gmail.com\n" +
                        "Github \t: https://github.com/arrandimr\n",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. SDN Anggaswangi II \n" +
                        "\t\t 2. SMPN 1 Sukodono \n" +
                        "\t\t 3. SMK YPM 3 Taman \n\n" +
                        "Penghargaan : -"
            )
        )
        return faklist
    }
}
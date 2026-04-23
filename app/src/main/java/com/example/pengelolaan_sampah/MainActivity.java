package com.example.pengelolaan_sampah;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inisialisasi Button
        MaterialButton btnRequestJemput = findViewById(R.id.btnRequestJemput);
        MaterialButton btnRiwayat = findViewById(R.id.btnRiwayat);
        MaterialButton btnProfil = findViewById(R.id.btnProfil);

        // Set OnClickListener
        btnRequestJemput.setOnClickListener(v -> {
            // Intent ke halaman Request Jemput
            Toast.makeText(MainActivity.this, "Membuka Buat Request Jemput", Toast.LENGTH_SHORT).show();
            // startActivity(new Intent(MainActivity.this, RequestJemputActivity.class));
        });

        btnRiwayat.setOnClickListener(v -> {
            // Intent ke halaman Riwayat
            Toast.makeText(MainActivity.this, "Membuka Riwayat Saya", Toast.LENGTH_SHORT).show();
            // startActivity(new Intent(MainActivity.this, RiwayatActivity.class));
        });

        btnProfil.setOnClickListener(v -> {
            // Intent ke halaman Profil
            Toast.makeText(MainActivity.this, "Membuka Profil & Laporan", Toast.LENGTH_SHORT).show();
            // startActivity(new Intent(MainActivity.this, ProfilActivity.class));
        });
    }
}
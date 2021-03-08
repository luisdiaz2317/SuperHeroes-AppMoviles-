package com.example.superheroe

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.superheroe.databinding.ActivityVerDatosBinding

class verDatosActivity : AppCompatActivity() {
    private lateinit var viewBinding:ActivityVerDatosBinding

    companion object{ //Crear variables estaticas
        const val HEROE_KEY = "heroe_key"
        const val POWER_KEY = "power_key"
        const val IMAGEN_KEY = "imagen_key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityVerDatosBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val intent:Bundle = intent.extras!! //maneja informacion en tuplas claves valor, intent recibe todos los datos
        viewBinding.tvNameEnviado.text =  intent.getString(HEROE_KEY)
        viewBinding.rbProgressEnviado.rating = intent.getFloat(POWER_KEY)
        viewBinding.photoEnviada.setImageBitmap(intent.getParcelable<Bitmap>(IMAGEN_KEY))
    }
}
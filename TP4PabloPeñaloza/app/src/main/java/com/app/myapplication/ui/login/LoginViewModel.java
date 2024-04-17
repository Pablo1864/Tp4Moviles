package com.app.myapplication.ui.login;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    public boolean authenticate(String username, String password) {
        // Verificamos las credenciales aquí
        return username.equals("pablo") && password.equals("peñaloza");
    }
}



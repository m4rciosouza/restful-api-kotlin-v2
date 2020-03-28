package com.kazale.pontointeligente.api.pontointeligenteapi.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtilsTest {

    private val SENHA = "123456"
    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun testGerarHashSenha() {
        val hash = SenhaUtils().gerarBCrypt(SENHA)
        Assertions.assertTrue(bCryptEncoder.matches(SENHA, hash))
    }

}

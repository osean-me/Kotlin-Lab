package com.study.kotlin.account.application.port.input

interface SendMoneyUseCase {

    fun sendMoney(command: SendMoneyCommand): Boolean
}

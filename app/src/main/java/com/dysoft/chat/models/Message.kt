package com.dysoft.chat.models

class Message(
    private var senderId: String,
    private var recipientId:String,
    private var content: String,
    private var timestamp: Long,
    private var received: Boolean){
    //Getters
    fun getSenderId():String{
        return senderId
    }
    fun getRecipientId():String{
        return recipientId
    }
    fun getContent():String{
        return content
    }
    fun getTimestamp():Long{
        return timestamp
    }
    fun isReceived():Boolean{
        return received
    }
    //Setters
    fun setSenderId(senderId: String):Message{
        this.senderId = senderId
        return this
    }
    fun setRecipientId(recipientId: String):Message{
        this.recipientId = recipientId
        return this
    }
    fun setContent(content: String):Message{
        this.content = content
        return this
    }
    fun setReceived(received: Boolean):Message{
        this.received = received
        return this
    }
}
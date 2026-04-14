package com.gauravsimha27.offlinechat.domain.repository;

import kotlinx.coroutines.flow.Flow;
import com.gauravsimha27.offlinechat.data.local.entity.ChatMessage;

interface ChatRepository {
    fun sendMessage(message: ChatMessage): Flow<Boolean>
    fun getConversation(conversationId: String): Flow<List<ChatMessage>>
    fun getAllMessages(): Flow<List<ChatMessage>>
    fun markAsRead(messageId: String): Flow<Boolean>
    fun deleteMessage(messageId: String): Flow<Boolean>
}
package data

import kotlinx.serialization.*

@Serializable
@SerialName("MessageResponse")
data class MessageResponse(
    val ok: Boolean,
    val message: String
)
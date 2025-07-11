package com.plcoding.cryptocurrencyappyt.data.remote.dto


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import com.plcoding.cryptocurrencyappyt.domain.model.Coin

@Keep
data class CoinDto(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("symbol")
    val symbol: String?,
    @SerializedName("rank")
    val rank: Int?,
    @SerializedName("is_new")
    val isNew: Boolean?,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("type")
    val type: String?
)

fun CoinDto.toCoin() : Coin {
    return Coin(
        id = id,
        name = name,
        symbol = symbol,
        rank = rank,
        isActive = isActive
    )
}
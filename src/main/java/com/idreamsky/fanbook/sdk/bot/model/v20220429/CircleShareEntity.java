package com.idreamsky.fanbook.sdk.bot.model.v20220429;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class CircleShareEntity implements Serializable {

    @SerializedName("user")
    private User user;

    @SerializedName("post")
    private CirclePostContent post;
}

package com.huami.assistant.ocr.model.train;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes5.dex */
public class TrainResult {

    @SerializedName("data")
    public OcrData data;

    @SerializedName("error_msg")
    public String errorMsg;

    @SerializedName("errorCode")
    public int error_code;
}

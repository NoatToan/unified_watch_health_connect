package com.huami.assistant.ocr.model.train;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class OcrData {

    @SerializedName("isStructured")
    public boolean isStructured;

    @SerializedName("logId")
    public String logId;

    @SerializedName(QQLogin.KEY_RESULT)
    public List<WordItem> ret;

    @SerializedName("scores")
    public float scores;

    @SerializedName("templateSign")
    public String templateSign;
}

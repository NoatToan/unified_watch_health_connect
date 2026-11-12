package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Block implements JSONSerializable {
    public static final ByteArray BLANK = ByteArray.wrap(Coder.hexStringToBytes("00000000000000000000000000000000"));

    @SerializedName(RealNameWebViewActivity.NUMBER)
    private int number;

    @SerializedName("value")
    private String value;

    public Block(int i, String str) {
        this.number = i;
        this.value = str;
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RealNameWebViewActivity.NUMBER, this.number);
            jSONObject.put("value", this.value);
        } catch (JSONException unused) {
            LogUtils.d("Block parse failed");
        }
        return jSONObject;
    }
}

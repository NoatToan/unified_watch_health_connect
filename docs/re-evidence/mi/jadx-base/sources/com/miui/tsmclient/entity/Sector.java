package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Sector implements JSONSerializable {

    @SerializedName("blocks")
    private List<Block> blocks;

    @SerializedName("countOfTestKeys")
    private int mCountOfVerifiedKey;

    @SerializedName(RealNameWebViewActivity.NUMBER)
    private int number;

    public Sector(int i, List<Block> list) {
        this.number = i;
        this.blocks = list;
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RealNameWebViewActivity.NUMBER, this.number);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.blocks.size(); i++) {
                jSONArray.put(this.blocks.get(i).serialize());
            }
            jSONObject.put("blockList", jSONArray);
        } catch (JSONException unused) {
            LogUtils.d("Sector parse failed");
        }
        return jSONObject;
    }

    public void setCountOfVerifiedKey(int i) {
        this.mCountOfVerifiedKey = i;
    }
}

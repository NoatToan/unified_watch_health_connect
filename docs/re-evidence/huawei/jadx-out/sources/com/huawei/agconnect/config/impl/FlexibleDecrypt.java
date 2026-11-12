package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class FlexibleDecrypt implements AesDecrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IDecrypt f4947c;

    @Override // com.huawei.agconnect.config.AesDecrypt
    public IDecrypt decryptComponent() {
        String strA = ResourcesUtils.a(this.f4945a, this.f4946b, "agc_plugin_", "crypto_component");
        if (strA == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Hex.decodeHexString(strA), "utf-8"));
            return new DecryptLocalResource(new AesParam(jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
        } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
            Log.e("AGC_FlexibleDecrypt", "FlexibleDecrypt exception: " + e.getMessage());
            return null;
        }
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public String decrypt(String str, String str2) {
        if (this.f4947c == null) {
            this.f4947c = decryptComponent();
        }
        if (this.f4947c == null) {
            Log.w("AGC_FlexibleDecrypt", "decrypt Flexible Decrypt error, use old instead");
            this.f4947c = new FixedDecrypt(this.f4945a, this.f4946b).decryptComponent();
        }
        return this.f4947c.decrypt(ResourcesUtils.a(this.f4945a, this.f4946b, "agc_plugin_", str), str2);
    }

    public FlexibleDecrypt(Context context, String str) {
        Log.d("AGC_FlexibleDecrypt", "init");
        this.f4945a = context;
        this.f4946b = str;
    }
}

package com.huawei.multisimsdk.multidevicemanager.model;

import android.content.Context;
import android.os.Message;
import android.util.Base64;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import defpackage.obf;
import defpackage.oco;
import defpackage.ocq;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseAuthenAbs {
    private static final String TAG = "BaseAuthenAbs";
    public AuthParam mAuthParam;
    public Context mContext;
    public Message mMessage;

    public abstract void startAuthLogin();

    public BaseAuthenAbs(Context context, AuthParam authParam, Message message) {
        this.mContext = context;
        this.mAuthParam = authParam;
        this.mMessage = message;
    }

    protected String getAuthenParam(Context context, AuthParam authParam) {
        int iD = oco.d();
        try {
            ocq.e(TAG, "Build BaseAuthenAbs JsonObj start");
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ReqSN", iD);
            jSONObject.put("ReqName", "DevAuth");
            jSONObject.put("AuthType", "GBA");
            if (context != null && authParam != null) {
                String strE = obf.e(context, authParam.getSlotId());
                jSONObject.put("Identity", Base64.encodeToString(String.format(Locale.ROOT, "0%1$s@nai.epc.mnc%2$s.mcc%3$s.3gppnetwork.org", strE, oco.a(strE), oco.b(strE)).getBytes(), 0).trim());
                jSONObject.put("DeviceID", new JSONObject());
            }
            jSONArray.put(jSONObject);
            if (ocq.f44154c.booleanValue()) {
                ocq.e(TAG, "Build BaseAuthenAbs JsonObj result:" + jSONArray.toString());
            }
            return jSONArray.toString();
        } catch (JSONException unused) {
            ocq.c(TAG, "Build BaseAuthenAbs JsonObj occured JSONException");
            return null;
        }
    }
}

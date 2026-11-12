package com.xiaomi.smarthome.core.server.internal.bluetooth.wugan;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BleWuganBean {
    private String confirmMessage;
    private String did;
    private boolean isPreBind;
    private String random;
    private String sn;
    private long uid;

    public BleWuganBean(JSONObject jSONObject) {
        this.isPreBind = jSONObject.optBoolean("is_pre_bind");
        this.uid = jSONObject.optLong("uid");
        this.sn = jSONObject.optString("sn");
        this.did = jSONObject.optString("did");
        this.random = jSONObject.optString("random");
        this.confirmMessage = jSONObject.optString("confirm_message");
    }

    public String getConfirmMessage() {
        return this.confirmMessage;
    }

    public String getDid() {
        return this.did;
    }

    public String getDidOrSN() {
        if (!TextUtils.isEmpty(this.did)) {
            return this.did;
        }
        MiJiaLog.writeLogOnAll(LogType.KUAILIAN, "Wugan", "did 为空, sn: " + this.sn);
        return this.sn;
    }

    public String getRandom() {
        return this.random;
    }

    public String getSn() {
        return this.sn;
    }

    public long getUid() {
        return this.uid;
    }

    public boolean isPreBind() {
        return this.isPreBind;
    }

    public void setConfirmMessage(String str) {
        this.confirmMessage = str;
    }

    public void setDid(String str) {
        this.did = str;
    }

    public void setPreBind(boolean z) {
        this.isPreBind = z;
    }

    public void setRandom(String str) {
        this.random = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setUid(long j) {
        this.uid = j;
    }

    public BleWuganBean(boolean z, long j, String str, String str2, String str3) {
        this.isPreBind = z;
        this.uid = j;
        this.did = str;
        this.random = str2;
        this.confirmMessage = str3;
    }
}

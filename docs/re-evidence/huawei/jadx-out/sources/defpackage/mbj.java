package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mbj {
    private int e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41333c = 20;
    private int d = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41332b = 0;

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lowPowerNumber", this.e);
            jSONObject.put("intervalTime", this.f41333c);
            jSONObject.put("protocolWaitingTime", this.d);
            jSONObject.put("errCode", this.f41332b);
        } catch (JSONException unused) {
            LogUtil.j("AccessConfigInfo", "getConfigJson JSONException");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public void d(int i) {
        this.e = i;
    }

    public void c(int i) {
        this.f41333c = i;
    }

    public void e(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.f41332b = i;
    }

    public String toString() {
        return "AccessConfigInfo{lowPowerNumber=" + this.e + ", intervalTime=" + this.f41333c + ", protocolWaitingTime=" + this.d + ", errorCode=" + this.f41332b + "}";
    }
}

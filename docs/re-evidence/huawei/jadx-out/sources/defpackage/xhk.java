package defpackage;

import android.os.RemoteException;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xhk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xho f52994b = xho.d();

    public void b(xht xhtVar, xhr xhrVar) {
        if (xhtVar == null || xhrVar == null || !xhrVar.aw()) {
            LogUtil.e("Unite_KitResponseManagement", "toKitFileConsultInfo callback is null");
            return;
        }
        LogUtil.b("Unite_KitResponseManagement", "enter toKitFileConsultInfo");
        try {
            try {
                xhrVar.p().onResponse(10001, d(0, xhtVar.c(), xhrVar.u(), xhrVar.x().getBytes("UTF-8")));
            } catch (RemoteException unused) {
                LogUtil.d("Unite_KitResponseManagement", "toKitFileConsultInfo remote exception");
            }
        } catch (UnsupportedEncodingException unused2) {
            LogUtil.d("Unite_KitResponseManagement", "UnsupportedEncodingException : no support utf-8");
            try {
                xhrVar.p().onResponse(10001, "");
            } catch (RemoteException unused3) {
                LogUtil.d("Unite_KitResponseManagement", "toKitFileConsultInfo remote exception");
            }
        }
    }

    public void d(xhr xhrVar, byte[] bArr, int i, int i2) {
        if (xhrVar == null || !xhrVar.aw()) {
            LogUtil.e("Unite_KitResponseManagement", "toKitFrameData callback is null.");
            return;
        }
        String strD = xhw.d(xhw.b(xhrVar), i);
        xhp xhpVar = this.f52994b.b().get(strD);
        if (xhpVar == null) {
            LogUtil.e("Unite_KitResponseManagement", "toKitFrameData retryFileInfo is null.");
            return;
        }
        if (i2 != xhpVar.b() + 1) {
            LogUtil.e("Unite_KitResponseManagement", "this frame has return to kit, return.");
            return;
        }
        xhpVar.b(i2);
        this.f52994b.b().put(strD, xhpVar);
        LogUtil.b("Unite_KitResponseManagement", "toKitFrameData enter");
        xhrVar.m(xhrVar.ar() + 1);
        String strC = c(0, xhrVar.ar(), bArr);
        LogUtil.b("Unite_KitResponseManagement", "toKitFrameData:", lnb.e(strC));
        try {
            xhrVar.p().onResponse(10002, strC);
        } catch (RemoteException unused) {
            LogUtil.d("Unite_KitResponseManagement", "toKitFrameData remote exception");
        } catch (Exception unused2) {
            LogUtil.d("Unite_KitResponseManagement", "toKitFrameData occur exception");
        }
    }

    public String c(int i, int i2, byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
            jSONObject.put("index", i2);
            jSONObject.put("value", cph.d(bArr));
        } catch (JSONException unused) {
            LogUtil.d("Unite_KitResponseManagement", "toFileTransferInfoJson exception");
        }
        LogUtil.b("Unite_KitResponseManagement", "toFileTransferInfoJson json is ", jSONObject.toString());
        return jSONObject.toString();
    }

    private String d(int i, int i2, long j, byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
            jSONObject.put("maxTransferUnit", i2);
            jSONObject.put("fileSize", j);
            jSONObject.put("crc", cph.d(bArr));
        } catch (JSONException unused) {
            LogUtil.d("Unite_KitResponseManagement", "toFileConsultInfoJson exception");
        }
        LogUtil.b("Unite_KitResponseManagement", "toFileConsultInfoJson json is ", jSONObject.toString());
        return jSONObject.toString();
    }
}

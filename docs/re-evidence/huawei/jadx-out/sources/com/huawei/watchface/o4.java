package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.ILoginCallback;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.huawei.wisecloud.drmclient.exception.HwDrmException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30533c;
    public String d;
    public String e;

    public class a implements ILoginCallback {
        public a(o4 o4Var) {
        }

        @Override // com.huawei.watchface.utils.callback.ILoginCallback
        public void onLoginFailed(Object obj) {
            HwLog.i("TryOutWatchFaceInfo", "setDownloadInfo() onLoginSuccess. ");
        }

        @Override // com.huawei.watchface.utils.callback.ILoginCallback
        public void onLoginSuccess(Object obj) {
            HwLog.i("TryOutWatchFaceInfo", "setDownloadInfo() onLoginSuccess. ");
        }
    }

    public String a() {
        return this.f30533c;
    }

    public String b() {
        return this.e;
    }

    public int c() {
        return this.f30531a;
    }

    public String a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        this.f30532b = jSONObject.optString("resultinfo");
        try {
            this.f30531a = jSONObject.getInt("resultcode");
            str2 = "";
        } catch (JSONException e) {
            str2 = HwLog.printException((Exception) e) + ",mResultInfo=" + this.f30532b;
            this.f30531a = -1;
        }
        HwLog.i("TryOutWatchFaceInfo", "setDownloadInfo resultcode : " + this.f30531a + "  tryoutResultInfo:" + this.f30532b);
        this.f30533c = jSONObject.optString("downUrl");
        this.d = jSONObject.optString("licenseResp");
        this.e = jSONObject.optString(WatchFaceConstant.HASHCODE);
        try {
            k0.c(Environment.getApplicationContext(), this.d);
        } catch (HwDrmException e2) {
            HwLog.e("TryOutWatchFaceInfo", "setDownloadInfo -- HwDrmException：" + HwLog.printException((Exception) e2));
        }
        if (this.f30531a == 0 && (TextUtils.isEmpty(this.f30533c) || TextUtils.isEmpty(this.d))) {
            HwLog.w("TryOutWatchFaceInfo", "setDownloadInfo error : resultcode is success but downUrl or mLicenseRes is null or error");
            return "resultcode is success but downUrl or mLicenseRes is null or error";
        }
        if (-2 != this.f30531a) {
            return str2;
        }
        String stringById = DensityUtil.getStringById(R.string.IDS_watchface_pay_failed);
        HwLog.w("TryOutWatchFaceInfo", "setDownloadInfo error auth failed.");
        HwWatchFaceApi.getInstance(Environment.getApplicationContext()).loginByHealthHms(Environment.getApplicationContext(), new a(this));
        return stringById;
    }
}

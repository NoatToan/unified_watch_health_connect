package com.huawei.watchface;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.secure.android.common.encrypt.hash.HMACSHA256;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.ui.main.stories.nps.component.NpsConstantValue;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.webview.JsInterfaceMarketing;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes45.dex */
public class r4 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30557c;
    public String d;
    public String e;
    public String f;

    public r4(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f30555a = str2;
        this.f30556b = str3;
        this.f30557c = str4;
        this.d = str5;
        this.e = str;
        this.f = str6;
    }

    private String buildRequestParams() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adType", this.e);
            jSONObject.put("campId", this.f30557c);
            String deviceDigest = JsInterfaceMarketing.getDeviceDigest();
            jSONObject.put("deviceDigest", deviceDigest);
            jSONObject.put("uniqueId", this.f30555a);
            jSONObject.put("adName", this.f30556b);
            jSONObject.put("appId", "200002");
            String strG = g();
            jSONObject.put("seq", strG);
            String strGenerateUUID = MobileInfoHelper.generateUUID();
            jSONObject.put("auth", a(strGenerateUUID, strG, deviceDigest));
            jSONObject.put("requestId", strGenerateUUID);
            HwLog.i("UploadEncourageStatusThread", "buildRequestParams : " + jSONObject.length());
            return jSONObject.toString();
        } catch (Exception e) {
            HwLog.i("UploadEncourageStatusThread", "JSONException : " + HwLog.printException(e));
            return null;
        }
    }

    public final String a(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append("adName").append(this.f30556b).append("adType").append(this.e).append("appId200002campId").append(this.f30557c).append("deviceDigest").append(str3).append("requestId").append(str).append("seq").append(str2).append("uniqueId").append(this.f30555a);
        return "security:" + o0.a(HMACSHA256.hmacEncrypt(CommonUtils.j(stringBuffer.toString()), o0.a(b.a(DensityUtil.getStringById(CommonUtils.H() ? R.string.authKey : R.string.authKeyBelowAndroidO)))));
    }

    public x b(String str) {
        x xVar = new x();
        if (TextUtils.isEmpty(str)) {
            HwLog.e("UploadEncourageStatusThread", "dealReceive json is empty");
            return xVar;
        }
        try {
            xVar.retCode = new JSONObject(str).optString("retCode");
            return xVar;
        } catch (Exception e) {
            HwLog.e("UploadEncourageStatusThread", "dealReceive exception: " + HwLog.printException(e));
            return xVar;
        }
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public boolean d() {
        return false;
    }

    public String f() {
        return a(WatchFaceHttpUtil.v(), buildRequestParams(), getReqHeaders());
    }

    public final String g() {
        return "888888" + j4.a() + "4444";
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public LinkedHashMap getReqHeaders() {
        LinkedHashMap linkedHashMapE = e();
        String strGenerateDeviceIDWithSeparator = MobileInfoHelper.generateDeviceIDWithSeparator();
        if (strGenerateDeviceIDWithSeparator.contains(":")) {
            linkedHashMapE.put("x-deviceid", SafeString.substring(strGenerateDeviceIDWithSeparator, 0, strGenerateDeviceIDWithSeparator.indexOf(":")));
        }
        linkedHashMapE.put("token", this.d);
        if (WatchFaceHttpUtil.A() != null) {
            linkedHashMapE.put(HwPayConstant.KEY_SIGN, WatchFaceHttpUtil.A().getSign());
        }
        linkedHashMapE.put(ProfileRequestConstants.X_APPID_KEY, NpsConstantValue.QUERY_SYSTEM_BUSY);
        linkedHashMapE.put("x-devicetype", SafeString.substring(strGenerateDeviceIDWithSeparator, strGenerateDeviceIDWithSeparator.indexOf("=") + 1));
        linkedHashMapE.put("x-account-brand-id", "0");
        linkedHashMapE.put("x-packagename", Environment.getApplicationContext().getPackageName());
        linkedHashMapE.put("osVersion", Build.VERSION.RELEASE);
        if (!TextUtils.isEmpty(this.f)) {
            StringBuffer stringBuffer = new StringBuffer(200);
            stringBuffer.append("campid=").append(this.f30557c).append(",operator=").append(this.f).append(",isVIP=1");
            linkedHashMapE.put("x-camp-params", stringBuffer.toString());
        }
        return linkedHashMapE;
    }
}

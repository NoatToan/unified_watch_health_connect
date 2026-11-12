package com.huawei.watchface.mvp.model.thread;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.R;
import com.huawei.watchface.a4;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.b;
import com.huawei.watchface.c5;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignBean;
import com.huawei.watchface.q0;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultcode"), @d0(name = "resultinfo"), @d0(name = HwPayConstant.KEY_SIGN, needAnony = true)})
public class GetSignThread extends BaseHttpRequest<WatchFaceSignBean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30352a = 0;

    private String f() {
        StringBuilder sb = new StringBuilder(2048);
        sb.append("firmware=6.0.1");
        HwLog.i("GetSignThread", "getSignParams deviceType:" + this.f30352a);
        if (this.f30352a == 0) {
            sb.append("&screen=");
            sb.append(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceScreen());
            sb.append("&phoneType=");
            sb.append(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
            sb.append("&buildNumber=");
            sb.append(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
            sb.append(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getSoftVersion());
        } else {
            sb.append("&screen=");
            sb.append(a4.a());
            sb.append("&phoneType=");
            sb.append(MobileInfoHelper.getDeviceName());
            sb.append("&buildNumber=");
            sb.append(MobileInfoHelper.getDeviceName());
            sb.append(MobileInfoHelper.getBuildNumber());
        }
        sb.append("&locale=");
        sb.append(LanguageUtils.a(false));
        sb.append("&type=");
        sb.append(g());
        String commonCountryCode = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode();
        sb.append("&isoCode=");
        if (TextUtils.isEmpty(commonCountryCode)) {
            commonCountryCode = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode();
        }
        sb.append(commonCountryCode);
        sb.append("&userId=");
        sb.append(q0.e());
        sb.append("&versionCode=");
        sb.append(CommonUtils.getVersionCode());
        return sb.toString();
    }

    public void a(int i) {
        this.f30352a = i;
    }

    public WatchFaceSignBean b(String str) {
        return c(str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004f A[Catch: JsonSyntaxException -> 0x0056, TRY_LEAVE, TryCatch #0 {JsonSyntaxException -> 0x0056, blocks: (B:9:0x0023, B:11:0x002d, B:12:0x004f), top: B:26:0x0023 }] */
    public final WatchFaceSignBean c(String str) {
        WatchFaceSignBean watchFaceSignBean;
        HwLog.i("GetSignThread", "dealSignReceive");
        if (TextUtils.isEmpty(str)) {
            HwLog.i("GetSignThread", "dealSignReceive receive is empty.");
            return null;
        }
        int iC = -1;
        try {
            watchFaceSignBean = (WatchFaceSignBean) c5.a().a(str, WatchFaceSignBean.class);
            if (watchFaceSignBean != null) {
                try {
                    if (TextUtils.isEmpty(watchFaceSignBean.getSign())) {
                        HwLog.w("GetSignThread", "dealSignReceive error is watch face unknown!");
                    } else {
                        b(watchFaceSignBean);
                        a(watchFaceSignBean);
                        iC = IntegerUtils.c(watchFaceSignBean.getResultCode(), 10);
                        HwLog.i("GetSignThread", "dealSignReceive errorCode :" + iC);
                    }
                } catch (JsonSyntaxException unused) {
                    HwLog.e("GetSignThread", "WatchFaceSignBean is error JsonSyntaxException!");
                }
            } else {
                HwLog.w("GetSignThread", "dealSignReceive error is watch face unknown!");
            }
        } catch (JsonSyntaxException unused2) {
            watchFaceSignBean = null;
        }
        if (iC == 0) {
            if (this.f30352a == 0) {
                WatchFaceHttpUtil.b(watchFaceSignBean);
            } else {
                WatchFaceHttpUtil.a(watchFaceSignBean);
            }
            return watchFaceSignBean;
        }
        HwLog.w("GetSignThread", "dealSignReceive errorCode:" + iC);
        return null;
    }

    public String e() {
        HwLog.i("GetSignThread", "getResponse url");
        return a(WatchFaceHttpUtil.D(), f(), b());
    }

    public final String g() {
        return Environment.sIsAarInTheme ? "1" : "5";
    }

    public final void a(WatchFaceSignBean watchFaceSignBean) {
        if (watchFaceSignBean == null) {
            HwLog.w("GetSignThread", "setSignEncryptSecret() watchFaceSignBean is null.");
        } else {
            watchFaceSignBean.setEncryptSecret(b.a(DensityUtil.getStringById(CommonUtils.H() ? R.string.encryptSecret : R.string.encryptSecretBelowAndroidO)));
        }
    }

    public final void b(WatchFaceSignBean watchFaceSignBean) {
        String strSubstring;
        if (watchFaceSignBean == null) {
            HwLog.w("GetSignThread", "setSignUserId() watchFaceSignBean is null.");
            return;
        }
        String sign = watchFaceSignBean.getSign();
        if (TextUtils.isEmpty(sign)) {
            HwLog.w("GetSignThread", "setSignUserId() sign is empty.");
            return;
        }
        try {
            strSubstring = SafeString.substring(sign, sign.indexOf("@") + 1);
        } catch (IndexOutOfBoundsException unused) {
            HwLog.w("GetSignThread", "setSignUserId() IndexOutOfBoundsException.");
            strSubstring = "";
        }
        watchFaceSignBean.setUserId(strSubstring);
    }

    private LinkedHashMap b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(true, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 0));
        linkedHashMap.put(ProfileRequestConstants.X_APPID_KEY, "10003");
        linkedHashMap.put("x-devicemodel", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        linkedHashMap.put("deviceid", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdAsTheme(true));
        linkedHashMap.put("deviceType", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceType());
        linkedHashMap.put("terminalType", "1");
        linkedHashMap.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        return linkedHashMap;
    }
}

package com.huawei.hwdevice.phoneprocess.hihealthkit;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.eeq;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class AuthSupport {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, IAuthCallback> f17425b = new HashMap();

    public interface IAuthCallback {
        void onResult(int i, String str);
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AuthSupport f17426b = new AuthSupport();
    }

    public static AuthSupport c() {
        return a.f17426b;
    }

    public void e(String str, IAuthCallback iAuthCallback) {
        if (TextUtils.isEmpty(str) || iAuthCallback == null) {
            ReleaseLogUtil.a("R_AuthSupport", "addAuthTask() deviceIdentify is empty or callback is null");
        } else {
            this.f17425b.put(str, iAuthCallback);
        }
    }

    private IAuthCallback a(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("R_AuthSupport", "getAuthTaskCallback() deviceIdentify is empty");
            return null;
        }
        if (!this.f17425b.containsKey(str)) {
            ReleaseLogUtil.a("R_AuthSupport", "getAuthTaskCallback() deviceIdentify does not exist");
            return null;
        }
        return this.f17425b.get(str);
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("R_AuthSupport", "removeAuthTaskCallback() deviceIdentify is empty");
        } else if (this.f17425b.containsKey(str)) {
            this.f17425b.remove(str);
            LogUtil.a("AuthSupport", "removeAuthTaskCallback success");
        } else {
            ReleaseLogUtil.a("R_AuthSupport", "removeAuthTaskCallback() deviceIdentify does not exist");
        }
    }

    public void b(DeviceInfo deviceInfo, byte[] bArr) {
        ReleaseLogUtil.d("R_AuthSupport", "enter handleWearKitAuthValue");
        if (bArr == null || bArr.length <= 0) {
            ReleaseLogUtil.a("R_AuthSupport", "handleWearKitAuthValue() Received data is null");
            return;
        }
        if (deviceInfo == null) {
            ReleaseLogUtil.a("R_AuthSupport", "handleWearKitAuthValue() Received deviceInfo is null");
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("AuthSupport", "handleWearKitAuthValue: ", strE);
        if (strE != null && strE.length() >= 4) {
            try {
                List<eew> listE = new eet().b(strE.substring(4)).e();
                if (listE == null) {
                    ReleaseLogUtil.a("R_AuthSupport", "handleWearKitAuthValue() tlvList is null");
                    a(deviceInfo.getDeviceIdentify(), 1, "tlvList is null");
                    return;
                }
                int iV = 0;
                for (eew eewVar : listE) {
                    if (CommonUtil.v(eewVar.e()) == 1) {
                        iV = CommonUtil.v(eewVar.b());
                    }
                }
                LogUtil.a("AuthSupport", "handleWearKitAuthValue() authorizationStatus: ", Integer.valueOf(iV));
                a(deviceInfo.getDeviceIdentify(), iV, "get authorization status success");
                return;
            } catch (eeu | NumberFormatException e) {
                ReleaseLogUtil.a("R_AuthSupport", "handleWearKitAuthValue() Exception: ", e.getMessage());
                a(deviceInfo.getDeviceIdentify(), 1, "failed to parse data");
                return;
            }
        }
        ReleaseLogUtil.e("R_AuthSupport", "handleWearKitAuthValue data is null, or data length less 4");
        a(deviceInfo.getDeviceIdentify(), 1, "tlvHex is null, or length less than 4");
    }

    private void a(String str, int i, String str2) {
        IAuthCallback iAuthCallbackA = a(str);
        if (iAuthCallbackA != null) {
            iAuthCallbackA.onResult(i, str2);
            e(str);
        } else {
            ReleaseLogUtil.e("R_AuthSupport", "responseAuthResultAndRemoveCallback() callback is null");
        }
    }
}

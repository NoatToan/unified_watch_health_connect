package com.huawei.hwdevice.outofprocess.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.huawei.datatype.DataDeviceInfo;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.lmf;
import defpackage.mhs;
import defpackage.ohc;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class HwWatchFaceUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HwWatchFaceUtil f17416c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f17418b = new IBaseResponseCallback() { // from class: com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil.1
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("HwWatchFaceUtil", "mGetFirmwareVersionCallback, errorCode:", Integer.valueOf(i));
            if (i == 0 && (obj instanceof DataDeviceInfo)) {
                DataDeviceInfo dataDeviceInfo = (DataDeviceInfo) obj;
                LogUtil.a("HwWatchFaceUtil", "mGetFirmwareVersionCallback, firmware:", dataDeviceInfo.getDeviceSoftVersion());
                HwWatchFaceUtil.this.f17417a = dataDeviceInfo.getDeviceSoftVersion();
            }
        }
    };

    public interface TouchSupportCallback {
        void touchSupportResult(int i);
    }

    public static HwWatchFaceUtil d() {
        HwWatchFaceUtil hwWatchFaceUtil;
        synchronized (e) {
            if (f17416c == null) {
                f17416c = new HwWatchFaceUtil();
            }
            hwWatchFaceUtil = f17416c;
        }
        return hwWatchFaceUtil;
    }

    public void c(String str) {
        this.f17417a = str;
    }

    public String e() {
        String str;
        Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
        String strA = LanguageUtil.a(configuration.locale);
        String country = configuration.locale.getCountry();
        if ("my".equals(strA) && Locale.getDefault().getScript() != null && "Qaag".equals(Locale.getDefault().getScript())) {
            country = "ZG";
        }
        if ("en".equals(strA) && Locale.getDefault().getScript() != null && "Qaag".equals(Locale.getDefault().getScript())) {
            country = "GB";
        }
        String script = configuration.locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            if ("Hans".equalsIgnoreCase(script)) {
                str = "CN";
            } else if ("Hant".equalsIgnoreCase(script)) {
                str = "TW";
            } else {
                LogUtil.j("HwWatchFaceUtil", "script default");
            }
            country = str;
            strA = MLAsrConstants.LAN_ZH;
        }
        StringBuffer stringBuffer = new StringBuffer(strA);
        stringBuffer.append("_");
        stringBuffer.append(country);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c() {
        boolean z;
        String switchSettingFromDb = mhs.a().getSwitchSettingFromDb("onehop_grs_countryCode");
        String switchSettingFromDb2 = mhs.a().getSwitchSettingFromDb("onehop_grs_watchFaceGrsUrl");
        if (TextUtils.isEmpty(switchSettingFromDb) || TextUtils.isEmpty(switchSettingFromDb2)) {
            switchSettingFromDb2 = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainContentcenterDbankcdnNew", GRSManager.c(BaseApplication.getContext()).d());
        }
        boolean z2 = WatchFaceUtil.isSupportWatchFaceMarket() || WatchFaceUtil.isSupportMyWatch();
        String string = Arrays.toString(Thread.currentThread().getStackTrace());
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("watchFaceInitAar", "stackTraceMessage, OneHop ability :" + string);
        if (!z2 || TextUtils.isEmpty(switchSettingFromDb2)) {
            z = false;
        } else {
            LogUtil.a("HwWatchFaceUtil", "can get isGetGrsAbility");
            z = true;
        }
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager != null) {
            boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.nfc");
            boolean zH = Utils.h();
            LogUtil.a("HwWatchFaceUtil", "PackageManager isSupportNfc:", Boolean.valueOf(zHasSystemFeature), ",isAllowLogin:", Boolean.valueOf(zH));
            if (zHasSystemFeature && zH && z && b()) {
                return 1;
            }
        }
        return 0;
    }

    public static void b(final TouchSupportCallback touchSupportCallback) {
        if (!Utils.i()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil.3
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("HwWatchFaceUtil", "getOpenCardAbility");
                    TouchSupportCallback touchSupportCallback2 = touchSupportCallback;
                    if (touchSupportCallback2 != null) {
                        touchSupportCallback2.touchSupportResult(HwWatchFaceUtil.c());
                    }
                }
            });
        } else if (touchSupportCallback != null) {
            touchSupportCallback.touchSupportResult(0);
        }
    }

    public static boolean b() {
        boolean z = false;
        try {
            Class.forName("ohc");
            String strA = ohc.d().a();
            LogUtil.a("HwWatchFaceUtil", "HwOneHopSdk versionCodeString :", strA);
            if (TextUtils.isEmpty(strA)) {
                return false;
            }
            String[] strArrSplit = strA.split("\\.");
            if (strArrSplit.length > 3) {
                z = (CommonUtil.e(strArrSplit[1], 0) != 2 || CommonUtil.e(strArrSplit[2], 0) < 1) ? CommonUtil.e(strArrSplit[1], 0) > 2 : true;
            }
            LogUtil.a("HwWatchFaceUtil", "isHandoffServiceSupported:", Boolean.valueOf(z));
            return z;
        } catch (ClassNotFoundException unused) {
            LogUtil.e("HwWatchFaceUtil", "isHandoffServiceSupported can not find HwHandoffSdk");
            return false;
        }
    }

    public static void a(Map<String, Object> map, String str) {
        if (map == null || str == null) {
            LogUtil.j("HwWatchFaceUtil", "resultMap or eventId is null.");
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(str, linkedHashMap);
    }

    public static void e(Context context, Intent intent, String str) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.a("HwWatchFaceUtil", str, ": ActivityNotFoundException");
        }
    }

    public void a(int i) {
        LogUtil.a("HwWatchFaceUtil", "gotoWatchFaceBiEvent, type:", Integer.valueOf(i));
        String strValue = AnalyticsValue.WATCH_FACE_RECORD_1090056.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
    }
}

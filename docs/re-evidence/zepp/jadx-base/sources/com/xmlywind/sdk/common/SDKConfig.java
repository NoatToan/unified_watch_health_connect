package com.xmlywind.sdk.common;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.watch.dataflow.chart.util.AnimUtil;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.e.f;
import com.xmlywind.sdk.common.e.j;
import com.xmlywind.sdk.common.e.l;
import com.xmlywind.sdk.common.e.m;
import com.xmlywind.sdk.common.models.ssp.pb.Android;
import com.xmlywind.sdk.common.models.ssp.pb.Common;
import com.xmlywind.sdk.common.models.ssp.pb.CommonEndpointsConfig;
import com.xmlywind.sdk.common.models.ssp.pb.DialogSetting;
import com.xmlywind.sdk.common.models.ssp.pb.NativeConfig;
import com.xmlywind.sdk.common.models.ssp.pb.RvConfig;
import com.xmlywind.sdk.common.models.ssp.pb.RvEndpointsConfig;
import com.xmlywind.sdk.common.models.ssp.pb.SdkConfigResponse;
import com.xmlywind.sdk.common.models.ssp.pb.SdkConfigV2;
import com.xmlywind.sdk.common.utils.d;
import com.xmlywind.sdk.common.utils.p;
import com.xmlywind.volley.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class SDKConfig {
    private static SDKConfig a = null;
    private static boolean b = false;
    private final Handler c;
    private final Runnable d;
    private final String e;
    private boolean f;
    private long g;
    private SdkConfigV2 h;
    private SdkConfigV2 i;
    private a j;

    public interface a {
        void onUpdate();
    }

    private SDKConfig() {
        StringBuilder sb = new StringBuilder();
        sb.append("3.5.20|");
        sb.append(Constants.IS_TEST.booleanValue() ? "1" : "0");
        this.e = sb.toString();
        this.g = 0L;
        this.h = null;
        this.i = null;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new Runnable() { // from class: com.xmlywind.sdk.common.SDKConfig.1
            @Override // java.lang.Runnable
            public void run() {
                SDKConfig.this.c();
            }
        };
        this.f = true;
        a();
        b();
    }

    private void a() {
        String str;
        if (this.i == null) {
            SdkConfigV2.Builder builder = new SdkConfigV2.Builder();
            Common.Builder builder2 = new Common.Builder();
            Android.Builder builder3 = new Android.Builder();
            CommonEndpointsConfig.Builder builder4 = new CommonEndpointsConfig.Builder();
            if (Constants.IS_TEST.booleanValue()) {
                builder4.log("https://dctest.sigmob.cn/log");
                builder4.ads("https://adstage.sigmob.cn/ad/v3");
                builder4.hb_ads("https://adstage.sigmob.cn/hb/ad");
                str = "https://adstage.sigmob.cn/strategy/v3";
            } else {
                builder4.log("https://dc.sigmob.cn/log");
                builder4.ads("https://adservice.sigmob.cn/ad/v3");
                builder4.hb_ads("https://adservice.sigmob.cn/hb/ad");
                str = "https://adservice.sigmob.cn/strategy/v3";
            }
            builder4.strategy(str);
            builder2.endpoints(builder4.build());
            RvConfig.Builder builder5 = new RvConfig.Builder();
            RvEndpointsConfig.Builder builder6 = new RvEndpointsConfig.Builder();
            builder5.cacheTop(4);
            builder5.finished(Float.valueOf(1.0f));
            builder5.showClose(9999);
            builder5.ifMute(0);
            builder5.loadTimeout(45);
            builder5.loadExpired(7200);
            builder5.endpoints(builder6.build());
            builder2.rv_config(builder5.build());
            builder2.configRefresh(1000);
            Boolean bool = Boolean.TRUE;
            builder3.disable_boot_mark(bool);
            builder2.disable_up_location(bool);
            builder3.disableUpAppInfo(bool);
            builder3.oaid_api_is_disable(bool);
            Boolean bool2 = Boolean.FALSE;
            builder2.is_gdpr_region(bool2);
            builder2.enable_debug_level(bool2);
            builder3.enable_permission(bool2);
            builder3.enable_report_crash(bool2);
            builder.common_config(builder2.build());
            builder.android_config(builder3.build());
            this.i = builder.build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SdkConfigV2 sdkConfigV2) {
        Common common;
        if (sdkConfigV2 == null || (common = sdkConfigV2.common_config) == null) {
            return;
        }
        this.h = sdkConfigV2;
        b = common.is_gdpr_region.booleanValue();
        this.g = this.h.common_config.configRefresh.intValue() * 1000;
        a aVar = this.j;
        if (aVar != null) {
            aVar.onUpdate();
        }
    }

    private void b() {
        Throwable th;
        if (com.xmlywind.sdk.common.a.n() != null) {
            ObjectInputStream objectInputStream = null;
            String string = p.a(com.xmlywind.sdk.common.a.n().af()).getString("sdkConfigVer", null);
            File file = new File(d.a() + "/config");
            if (this.e.equals(string)) {
                try {
                    if (file.exists()) {
                        try {
                            ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(file));
                            try {
                                a(SdkConfigV2.ADAPTER.decode(objectInputStream2));
                                objectInputStream2.close();
                            } catch (Throwable th2) {
                                th = th2;
                                objectInputStream = objectInputStream2;
                                try {
                                    a(this.i);
                                    SigmobLog.e(th.getMessage());
                                    if (objectInputStream == null) {
                                        return;
                                    } else {
                                        objectInputStream.close();
                                    }
                                } catch (Throwable th3) {
                                    if (objectInputStream != null) {
                                        try {
                                            objectInputStream.close();
                                        } catch (Throwable th4) {
                                            SigmobLog.e(th4.getMessage());
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        return;
                    }
                } catch (Throwable th6) {
                    SigmobLog.e(th6.getMessage());
                    return;
                }
            }
        }
        a(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SdkConfigV2 sdkConfigV2) throws Throwable {
        if (sdkConfigV2 == null) {
            return;
        }
        File file = new File(d.a() + "/config");
        if (file.exists()) {
            file.delete();
        }
        file.getParentFile().mkdirs();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(file));
                    try {
                        sdkConfigV2.encode(objectOutputStream2);
                        p.a(com.xmlywind.sdk.common.a.n().af()).edit().putString("sdkConfigVer", this.e).apply();
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        e = e;
                        objectOutputStream = objectOutputStream2;
                        SigmobLog.e(e.getMessage());
                        if (objectOutputStream == null) {
                        } else {
                            objectOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e2) {
                                SigmobLog.e(e2.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            SigmobLog.e(e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (com.xmlywind.sdk.common.a.n() == null) {
            return;
        }
        if (com.xmlywind.sdk.common.a.n().aj() && com.xmlywind.sdk.common.a.b()) {
            d();
        } else {
            SigmobLog.d("Can't load an ad because there is no network connectivity.");
            e();
        }
    }

    private void d() {
        l lVarA = f.a();
        j jVar = new j(getConfigUrl(), new j.a() { // from class: com.xmlywind.sdk.common.SDKConfig.2
            @Override // com.xmlywind.sdk.common.e.j.a
            public void a(SdkConfigResponse sdkConfigResponse) throws Throwable {
                SigmobLog.d(sdkConfigResponse.toString());
                SdkConfigV2 sdkConfigV2 = sdkConfigResponse.config_v2;
                if (sdkConfigV2 != null) {
                    SDKConfig.this.a(sdkConfigV2);
                    SDKConfig.this.b(sdkConfigV2);
                } else {
                    SigmobLog.e(sdkConfigResponse.error_message);
                }
                SDKConfig.this.e();
            }

            @Override // com.xmlywind.volley.n.a
            public void onErrorResponse(s sVar) {
                SigmobLog.e(sVar.toString());
                SDKConfig.this.e();
            }
        });
        if (lVarA == null) {
            SigmobLog.e("queue is null");
            e();
        } else {
            lVarA.a(jVar);
            SigmobLog.i("update sdk config");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        f();
        if (this.f) {
            this.c.postDelayed(this.d, Math.max(30000L, this.g));
        }
    }

    private void f() {
        this.c.removeCallbacks(this.d);
    }

    public static String getConfigUrl() {
        StringBuilder sb;
        String str;
        if (Constants.IS_TEST.booleanValue()) {
            sb = new StringBuilder();
            str = "https://adstage.sigmob.cn/config?";
        } else {
            sb = new StringBuilder();
            str = "https://adservice.sigmob.cn/config?";
        }
        sb.append(str);
        sb.append(m.a());
        return sb.toString();
    }

    public static String getGDPRRegionURL() {
        StringBuilder sb;
        String str;
        if (Constants.IS_TEST.booleanValue()) {
            sb = new StringBuilder();
            str = "https://adstage.sigmob.cn/extconfig?";
        } else {
            sb = new StringBuilder();
            str = "https://adservice.sigmob.cn/extconfig?";
        }
        sb.append(str);
        sb.append(m.a());
        return sb.toString();
    }

    public static int getRequireAdapterVersion(int i) {
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 15:
            case 18:
                return 3100;
            case 2:
            case 3:
            case 8:
            case 10:
            case 14:
            case 17:
            default:
                return -1;
            case 13:
            case 16:
            case 19:
                return AnimUtil.DURATION_LOADING;
        }
    }

    public static boolean isGDPRRegion() {
        return b;
    }

    public static SDKConfig sharedInstance() {
        if (a == null) {
            synchronized (SDKConfig.class) {
                if (a == null) {
                    a = new SDKConfig();
                }
            }
        }
        return a;
    }

    public boolean enableAntiFraud() {
        return (getCommonConfig() == null || getCommonConfig().anti_fraud_log == null || getCommonConfig().anti_fraud_log.events == null) ? false : true;
    }

    public boolean enableExitOnVideoClose() {
        return getCommonConfig().rv_config.enableExitOnVideoClose.booleanValue();
    }

    public boolean enableReport_log() {
        return false;
    }

    public boolean filterAntiEvent(String str) {
        if (!enableAntiFraud() || getCommonConfig().anti_fraud_log.events == null) {
            return false;
        }
        return getCommonConfig().anti_fraud_log.events.contains(str);
    }

    public long getADTrackerExpiredTime() {
        long jIntValue = getCommonConfig().tracking_expiration_time.intValue();
        if (jIntValue < 180) {
            jIntValue = 180;
        }
        return jIntValue * 1000;
    }

    public int getAdTrackerMaxRetryNum() {
        return 20;
    }

    public int getAdTrackerRetryInterval() {
        int iIntValue = getCommonConfig().tracking_retry_interval.intValue();
        if (iIntValue < 10) {
            iIntValue = 10;
        }
        return iIntValue * 1000;
    }

    public String getAdsUrl() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        String str3 = getCommonConfig().endpoints.ads;
        if (TextUtils.isEmpty(str3)) {
            if (Constants.IS_TEST.booleanValue()) {
                sb2 = new StringBuilder();
                str2 = "https://adstage.sigmob.cn/ad/v3?";
            } else {
                sb2 = new StringBuilder();
                str2 = "https://adservice.sigmob.cn/ad/v3?";
            }
            sb2.append(str2);
            sb2.append(m.a());
            return sb2.toString();
        }
        if (str3.indexOf(63) == -1) {
            sb = new StringBuilder();
            sb.append(str3);
            str = "?";
        } else {
            sb = new StringBuilder();
            sb.append(str3);
            str = com.alipay.sdk.m.s.a.l;
        }
        sb.append(str);
        sb.append(m.a());
        return sb.toString();
    }

    public Android getAndroidConfig() {
        return getSdkConfig().android_config;
    }

    public int getApk_expired_time() {
        if (getSdkConfig() != null) {
            return getAndroidConfig().apk_expired_time.intValue();
        }
        return 0;
    }

    public int getAutoLoadInterval() {
        int iIntValue = getCommonConfig().auto_load_interval.intValue();
        if (iIntValue <= 0 || iIntValue >= 30) {
            return iIntValue;
        }
        return 30;
    }

    public int getCacheTop() {
        return getCommonConfig().rv_config.cacheTop.intValue();
    }

    public DialogSetting getCloseDialogSetting() {
        if (getRvConfig() != null) {
            return getRvConfig().close_dialog_setting;
        }
        return null;
    }

    public int getClosePosition() {
        return getCommonConfig().rv_config.endcardClosePosition.intValue();
    }

    public Common getCommonConfig() {
        return getSdkConfig().common_config;
    }

    public int getDisable_up_OAid() {
        if (getSdkConfig() != null) {
            return getAndroidConfig().disable_up_oaid.intValue();
        }
        return 0;
    }

    public float getFinished() {
        return getCommonConfig().rv_config.finished.floatValue();
    }

    public String getHbAdsUrl() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        String str3 = getCommonConfig().endpoints.hb_ads;
        if (TextUtils.isEmpty(str3)) {
            if (Constants.IS_TEST.booleanValue()) {
                sb2 = new StringBuilder();
                str2 = "https://adstage.sigmob.cn/hb/ad?";
            } else {
                sb2 = new StringBuilder();
                str2 = "https://adservice.sigmob.cn/hb/ad?";
            }
            sb2.append(str2);
            sb2.append(m.a());
            return sb2.toString();
        }
        if (str3.indexOf(63) == -1) {
            sb = new StringBuilder();
            sb.append(str3);
            str = "?";
        } else {
            sb = new StringBuilder();
            sb.append(str3);
            str = com.alipay.sdk.m.s.a.l;
        }
        sb.append(str);
        sb.append(m.a());
        return sb.toString();
    }

    public long getLoadExpired() {
        long jIntValue = getCommonConfig().rv_config.loadExpired.intValue();
        if (jIntValue < 1) {
            jIntValue = TimeUtils.TIME_2_HOURS;
        }
        return jIntValue * 1000;
    }

    public long getLoadPeriodTime() {
        Integer num = getCommonConfig().rv_config.loadPeriodTime;
        if (num == null || num.intValue() < 1) {
            return 0L;
        }
        return num.intValue() * 1000;
    }

    public List<Integer> getLogBlackList() {
        return getCommonConfig().dclog_blacklist;
    }

    public String getLogUrl() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        String str3 = getCommonConfig().endpoints.log;
        if (TextUtils.isEmpty(str3)) {
            if (Constants.IS_TEST.booleanValue()) {
                sb2 = new StringBuilder();
                str2 = "https://dctest.sigmob.cn/log?";
            } else {
                sb2 = new StringBuilder();
                str2 = "https://dc.sigmob.cn/log?";
            }
            sb2.append(str2);
            sb2.append(m.a());
            return sb2.toString();
        }
        if (str3.indexOf(63) == -1) {
            sb = new StringBuilder();
            sb.append(str3);
            str = "?";
        } else {
            sb = new StringBuilder();
            sb.append(str3);
            str = com.alipay.sdk.m.s.a.l;
        }
        sb.append(str);
        sb.append(m.a());
        return sb.toString();
    }

    public int getMaxSendLogRecords() {
        int iIntValue = getCommonConfig().max_send_log_records.intValue();
        if (iIntValue < 10) {
            return 10;
        }
        return iIntValue;
    }

    public int getMotionCount() {
        if (!enableAntiFraud() || getCommonConfig().anti_fraud_log.motion_config == null) {
            return 0;
        }
        return getCommonConfig().anti_fraud_log.motion_config.count.intValue();
    }

    public int getMotionInterval() {
        if (!enableAntiFraud() || getCommonConfig().anti_fraud_log.motion_config == null) {
            return 0;
        }
        return getCommonConfig().anti_fraud_log.motion_config.interval.intValue();
    }

    public int getMotionQueueMax() {
        if (!enableAntiFraud() || getCommonConfig().anti_fraud_log.motion_config == null) {
            return 0;
        }
        return getCommonConfig().anti_fraud_log.motion_config.queue_max.intValue() + (-50) < getCommonConfig().anti_fraud_log.motion_config.count.intValue() * 2 ? (getCommonConfig().anti_fraud_log.motion_config.count.intValue() * 2) + 50 : getCommonConfig().anti_fraud_log.motion_config.queue_max.intValue();
    }

    public int getNativeAdCacheTop() {
        NativeConfig nativeConfig = getCommonConfig().native_config;
        if (nativeConfig != null) {
            return nativeConfig.cacheTop.intValue();
        }
        return 50;
    }

    public boolean getOaidApiDisable() {
        if (getSdkConfig() != null) {
            return getAndroidConfig().oaid_api_is_disable.booleanValue();
        }
        return true;
    }

    public RvConfig getRvConfig() {
        return getCommonConfig().rv_config;
    }

    public SdkConfigV2 getSdkConfig() {
        SdkConfigV2 sdkConfigV2;
        return (Constants.IS_MOCK.booleanValue() || (sdkConfigV2 = this.h) == null) ? this.i : sdkConfigV2;
    }

    public int getSendLogInterval() {
        int iIntValue = getCommonConfig().send_log_interval.intValue();
        if (iIntValue < 3) {
            return 3;
        }
        return iIntValue;
    }

    public int getShowClose() {
        return getCommonConfig().rv_config.skipPercent.intValue();
    }

    public int getSkipPosition() {
        return getCommonConfig().rv_config.videoClosePosition.intValue();
    }

    public int getSkipSeconds() {
        return getCommonConfig().rv_config.skipSeconds.intValue();
    }

    public int getSoundPostion() {
        return getCommonConfig().rv_config.mutePostion.intValue();
    }

    public int getSplashCacheTop() {
        Integer num;
        if (getCommonConfig().splash_config == null || (num = getCommonConfig().splash_config.cacheTop) == null || num.intValue() == 0) {
            return 50;
        }
        return num.intValue();
    }

    public long getSplashExpiredTime() {
        Integer num = getCommonConfig().splash_config != null ? getCommonConfig().splash_config.material_expired_time : null;
        if (num == null || num.intValue() == 0) {
            return 172800000L;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = num.intValue();
        if (iIntValue >= 0) {
            iIntValue2 = iIntValue2 * 24 * 60 * 60 * 1000;
        }
        return iIntValue2;
    }

    public int getSplashShowDuration() {
        if (getCommonConfig().splash_config == null || getCommonConfig().splash_config.showDuration.intValue() < 3) {
            return 3;
        }
        return getCommonConfig().splash_config.showDuration.intValue();
    }

    public String getStrategyUrl() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        String str3 = getCommonConfig().endpoints.strategy;
        if (TextUtils.isEmpty(str3)) {
            if (Constants.IS_TEST.booleanValue()) {
                sb2 = new StringBuilder();
                str2 = "https://adstage.sigmob.cn/strategy/v3?";
            } else {
                sb2 = new StringBuilder();
                str2 = "https://adservice.sigmob.cn/strategy/v3?";
            }
            sb2.append(str2);
            sb2.append(m.a());
            return sb2.toString();
        }
        if (str3.indexOf(63) == -1) {
            sb = new StringBuilder();
            sb.append(str3);
            str = "?";
        } else {
            sb = new StringBuilder();
            sb.append(str3);
            str = com.alipay.sdk.m.s.a.l;
        }
        sb.append(str);
        sb.append(m.a());
        return sb.toString();
    }

    public int ifMute() {
        Integer num = getCommonConfig().rv_config.ifMute;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public boolean isDisableBootMark() {
        if (getSdkConfig() == null || getAndroidConfig() == null) {
            return true;
        }
        return getAndroidConfig().disable_boot_mark.booleanValue();
    }

    public boolean isDisableUpAppInfo() {
        if (getSdkConfig() == null || getAndroidConfig().disableUpAppInfo == null) {
            return true;
        }
        return getAndroidConfig().disableUpAppInfo.booleanValue();
    }

    public boolean isDisable_up_location() {
        if (getSdkConfig() == null || getCommonConfig().disable_up_location == null) {
            return true;
        }
        return getCommonConfig().disable_up_location.booleanValue();
    }

    public boolean isEnableWifiScanList() {
        Android androidConfig = getAndroidConfig();
        return androidConfig != null && androidConfig.up_wifi_list_interval.intValue() >= 60;
    }

    public boolean isEnable_debug_level() {
        if (getSdkConfig() == null || getCommonConfig().enable_debug_level == null) {
            return false;
        }
        return getCommonConfig().enable_debug_level.booleanValue();
    }

    public boolean isEnable_permission() {
        if (getSdkConfig() == null || getAndroidConfig().enable_permission == null) {
            return false;
        }
        return getAndroidConfig().enable_permission.booleanValue();
    }

    public boolean isEnable_report_crash() {
        if (getSdkConfig() == null || getAndroidConfig().enable_report_crash == null) {
            return false;
        }
        return getAndroidConfig().enable_report_crash.booleanValue();
    }

    public long loadAdTimeout() {
        int iIntValue = getCommonConfig().load_timeout.intValue();
        if (iIntValue < 45) {
            iIntValue = 45;
        }
        return iIntValue * 1000;
    }

    public SDKConfig setOnSDKUpdateListener(a aVar) {
        this.j = aVar;
        return a;
    }

    public void startUpdate() {
        f();
        this.c.post(this.d);
    }
}

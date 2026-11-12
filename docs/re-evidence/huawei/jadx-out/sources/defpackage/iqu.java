package defpackage;

import android.os.Looper;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class iqu {
    public static void g() {
        ReleaseLogUtil.c("SystemInfoToCloudUtil", "updateSystemInfoToCloud enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: iqt
            @Override // java.lang.Runnable
            public final void run() {
                iqu.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
        dfg dfgVarF = f();
        if (dfgVarF == null) {
            dfgVarF = new dfg();
        }
        LogUtil.b("SystemInfoToCloudUtil", "updateSystemInfoToCloud sampleConfig's language = ", dfgVarF.e(), ", timeZone = ", dfgVarF.c());
        String strC = HiDateUtil.c((String) null);
        String strA = LanguageUtil.a();
        LogUtil.b("SystemInfoToCloudUtil", "updateSystemInfoToCloud device's language = ", strA, ", timeZone = ", strC);
        if (strA.equals(dfgVarF.e()) && strC.equals(dfgVarF.c())) {
            ReleaseLogUtil.c("SystemInfoToCloudUtil", "updateSystemInfoToCloud sampleConfig's systemInfo is same as device");
            return;
        }
        dfgVarF.e(strA);
        dfgVarF.c(strC);
        a(dfgVarF);
    }

    public static void a() {
        ReleaseLogUtil.c("SystemInfoToCloudUtil", "saveLanguageToCloud enter");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ReleaseLogUtil.c("SystemInfoToCloudUtil", "saveLanguageToCloud switch thread");
            ThreadPoolManager.c().execute(new Runnable() { // from class: irc
                @Override // java.lang.Runnable
                public final void run() {
                    iqu.a();
                }
            });
            return;
        }
        dfg dfgVarF = f();
        if (dfgVarF == null) {
            dfgVarF = new dfg();
        }
        LogUtil.b("SystemInfoToCloudUtil", "saveLanguageToCloud sampleConfig's language = ", dfgVarF.e());
        String strA = LanguageUtil.a();
        LogUtil.b("SystemInfoToCloudUtil", "saveLanguageToCloud device's language = ", strA);
        if (strA.equals(dfgVarF.e())) {
            ReleaseLogUtil.c("SystemInfoToCloudUtil", "saveLocaleToCloud sampleConfig's language is same as devices");
        } else {
            dfgVarF.e(strA);
            a(dfgVarF);
        }
    }

    public static void b() {
        ReleaseLogUtil.c("SystemInfoToCloudUtil", "saveTimeZoneToCloud enter");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ReleaseLogUtil.c("SystemInfoToCloudUtil", "saveTimeZoneToCloud switch thread");
            ThreadPoolManager.c().execute(new Runnable() { // from class: irb
                @Override // java.lang.Runnable
                public final void run() {
                    iqu.b();
                }
            });
            return;
        }
        dfg dfgVarF = f();
        if (dfgVarF == null) {
            dfgVarF = new dfg();
        }
        LogUtil.b("SystemInfoToCloudUtil", "saveTimeZoneToCloud sampleConfig's timeZone = ", dfgVarF.c());
        String strC = HiDateUtil.c((String) null);
        LogUtil.b("SystemInfoToCloudUtil", "saveTimeZoneToCloud device's timeZone = ", strC);
        if (strC.equals(dfgVarF)) {
            ReleaseLogUtil.c("SystemInfoToCloudUtil", "saveLocaleToCloud sampleConfig's timeZone is same as devices");
        } else {
            dfgVarF.c(strC);
            a(dfgVarF);
        }
    }

    private static dfg f() {
        ReleaseLogUtil.c("SystemInfoToCloudUtil", "getSystemInfoFromSampleConfig enter");
        ArrayList arrayList = new ArrayList();
        HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
        builder.c(String.valueOf(0));
        builder.d(String.valueOf(0));
        builder.e("9001");
        builder.a("900100017");
        arrayList.add(builder.d());
        HiSampleConfigProcessOption hiSampleConfigProcessOption = new HiSampleConfigProcessOption();
        hiSampleConfigProcessOption.setProcessType(2);
        hiSampleConfigProcessOption.setDeviceUniqueId(FoundationCommonUtil.getAndroidId(BaseApplication.b()));
        hiSampleConfigProcessOption.setSampleConfigKeyList(arrayList);
        final dfg[] dfgVarArr = new dfg[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthManager.d(BaseApplication.b()).getSampleConfig(hiSampleConfigProcessOption, new HiDataReadResultListener() { // from class: iqu.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.c("SystemInfoToCloudUtil", "getSystemInfoFromSampleConfig end errorCode = ", Integer.valueOf(i), ", data = ", obj);
                if (njy.b(obj, HiSampleConfig.class)) {
                    List list = (List) obj;
                    dfgVarArr[0] = njy.e(list) ? null : (dfg) HiJsonUtil.d(((HiSampleConfig) list.get(0)).getConfigData(), dfg.class);
                }
                countDownLatch.countDown();
            }
        });
        try {
            ReleaseLogUtil.c("SystemInfoToCloudUtil", "getSystemInfoFromSampleConfig isCountDownZero = ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            ReleaseLogUtil.d("SystemInfoToCloudUtil", "getSystemInfoFromSampleConfig exception");
        }
        return dfgVarArr[0];
    }

    private static void a(dfg dfgVar) {
        a(HiJsonUtil.d(dfgVar), new HiDataOperateListener() { // from class: iqv
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                iqu.c(i, obj);
            }
        });
    }

    static /* synthetic */ void c(int i, Object obj) {
        ReleaseLogUtil.c("SystemInfoToCloudUtil", "saveSystemInfoToSampleConfig end errorCode = ", Integer.valueOf(i));
        if (i == 0) {
            i();
        }
    }

    private static void a(String str, HiDataOperateListener hiDataOperateListener) {
        ReleaseLogUtil.c("SystemInfoToCloudUtil", "saveSystemInfoToSampleConfig enter");
        HiSampleConfig.Builder builder = new HiSampleConfig.Builder();
        builder.e(System.currentTimeMillis());
        builder.i(String.valueOf(0));
        builder.e(FoundationCommonUtil.getAndroidId(BaseApplication.b()));
        builder.f(String.valueOf(0));
        builder.h("9001");
        builder.a("900100017");
        builder.b(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiSampleConfig(builder));
        HiHealthManager.d(BaseApplication.b()).setSampleConfig(arrayList, hiDataOperateListener);
    }

    private static void i() {
        ReleaseLogUtil.c("SystemInfoToCloudUtil", "syncSampleConfig enter");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
    }
}

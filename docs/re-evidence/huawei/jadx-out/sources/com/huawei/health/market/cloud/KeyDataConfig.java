package com.huawei.health.market.cloud;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils;
import com.huawei.health.market.cloud.KeyDataConfig;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hms.network.embedded.q0;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.fga;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class KeyDataConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f8167b;

    public interface KeyDataConfigCallback {
        void onResult(boolean z);
    }

    static {
        f8167b = CommonUtil.bg() ? "keepLiveA" : "keepLiveB";
    }

    public static void e(final Context context, final KeyDataConfigCallback keyDataConfigCallback) {
        RemoteConfigUtils.b(f8167b, new RemoteConfigUtils.ConfigCallback() { // from class: com.huawei.health.market.cloud.KeyDataConfig.3
            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onSuccess(String str) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("KeyDataConfig", "configValue is empty");
                        KeyDataConfig.e(keyDataConfigCallback, false);
                        return;
                    }
                    e eVar = (e) new Gson().fromJson(str, e.class);
                    if (eVar != null) {
                        KeyDataConfig.b(eVar, context, keyDataConfigCallback);
                    } else {
                        LogUtil.j("KeyDataConfig", "model is null");
                        KeyDataConfig.e(keyDataConfigCallback, false);
                    }
                } catch (Exception e2) {
                    LogUtil.j("KeyDataConfig", "parse config exception: ", e2.getMessage());
                    KeyDataConfig.e(keyDataConfigCallback, false);
                }
            }

            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onFailure(Exception exc, String str) {
                LogUtil.j("KeyDataConfig", "fetch config failed: ", exc.getMessage());
                KeyDataConfig.e(keyDataConfigCallback, false);
            }
        }, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(KeyDataConfigCallback keyDataConfigCallback, boolean z) {
        if (keyDataConfigCallback != null) {
            keyDataConfigCallback.onResult(z);
        }
    }

    private static int d() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        int iC = SharedPreferenceManager.c(String.valueOf(10000), "extraNum" + accountInfo, 0);
        if (iC == 0) {
            iC = new SecureRandom().nextInt(10) + 1;
            SharedPreferenceManager.d(String.valueOf(10000), "extraNum" + accountInfo, iC);
        }
        LogUtil.a("KeyDataConfig", "getExNum: ", Integer.valueOf(iC));
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final e eVar, final Context context, final KeyDataConfigCallback keyDataConfigCallback) {
        final int iD = d();
        if (a(eVar, iD) || b(eVar, iD) || d(eVar, iD) || e(eVar, iD) || c(eVar, iD) || g(eVar, iD) || f(eVar, iD)) {
            e(keyDataConfigCallback, true);
        } else {
            e(eVar, iD, context, new KeyDataConfigCallback() { // from class: fwu
                @Override // com.huawei.health.market.cloud.KeyDataConfig.KeyDataConfigCallback
                public final void onResult(boolean z) {
                    KeyDataConfig.b(keyDataConfigCallback, eVar, iD, context, z);
                }
            });
        }
    }

    public static /* synthetic */ void b(KeyDataConfigCallback keyDataConfigCallback, e eVar, int i, Context context, boolean z) {
        if (z) {
            e(keyDataConfigCallback, true);
        } else {
            b(eVar, i, context, keyDataConfigCallback);
        }
    }

    private static boolean a(e eVar, int i) {
        a aVarD = eVar.d("key1");
        return aVarD != null && d(aVarD, i) && c(aVarD.b(), String.valueOf(Calendar.getInstance().get(11)));
    }

    private static boolean b(e eVar, int i) {
        a aVarD = eVar.d("key2");
        return aVarD != null && d(aVarD, i) && c(aVarD.b(), String.valueOf(a()));
    }

    private static boolean d(e eVar, int i) {
        a aVarD = eVar.d("key3");
        return aVarD != null && d(aVarD, i) && c(aVarD.b(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005));
    }

    private static boolean e(e eVar, int i) {
        a aVarD = eVar.d("key4");
        return aVarD != null && d(aVarD, i) && c(aVarD.b(), Build.MODEL);
    }

    private static boolean f(e eVar, int i) {
        a aVarD = eVar.d("key9");
        return aVarD != null && d(aVarD, i) && c(aVarD.b(), String.valueOf(Build.VERSION.SDK_INT));
    }

    private static boolean c(e eVar, int i) {
        a aVarD = eVar.d("key7");
        if (aVarD == null || !d(aVarD, i) || a(aVarD.b()) != 1) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return ContextCompat.checkSelfPermission(BaseApplication.getContext(), "android.permission.ACTIVITY_RECOGNITION") != 0;
        }
        LogUtil.a("KeyDataConfig", "SDK_INT < Build.VERSION_CODES.Q");
        return false;
    }

    private static boolean g(e eVar, int i) {
        a aVarD = eVar.d("key8");
        if (aVarD == null || !d(aVarD, i) || a(aVarD.b()) != 1) {
            return false;
        }
        Context context = BaseApplication.getContext();
        Object systemService = context.getSystemService("power");
        if (systemService instanceof PowerManager) {
            return !((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return false;
    }

    private static void e(e eVar, int i, Context context, final KeyDataConfigCallback keyDataConfigCallback) {
        a aVarD = eVar.d("key5");
        if (aVarD == null || !d(aVarD, i) || a(aVarD.b()) != 1) {
            e(keyDataConfigCallback, false);
            return;
        }
        HealthOpenSDK healthOpenSDKE = fga.d(context).e();
        if (healthOpenSDKE == null) {
            LogUtil.j("KeyDataConfig", "isNotiStateMatched healthOpenSDK == null");
            e(keyDataConfigCallback, false);
        } else {
            healthOpenSDKE.d(new IExecuteResult() { // from class: com.huawei.health.market.cloud.KeyDataConfig.1
                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onSuccess(Object obj) {
                    boolean z;
                    if (obj instanceof Bundle) {
                        z = ((Bundle) obj).getBoolean("stepsNotifiState");
                        LogUtil.a("KeyDataConfig", "isNotiStateMatched notiState: ", Boolean.valueOf(z));
                    } else {
                        z = true;
                    }
                    KeyDataConfig.e(keyDataConfigCallback, !z);
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onFailed(Object obj) {
                    LogUtil.j("KeyDataConfig", "isNotiStateMatched onFailed");
                    KeyDataConfig.e(keyDataConfigCallback, false);
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onServiceException(Object obj) {
                    LogUtil.j("KeyDataConfig", "isNotiStateMatched onServiceException");
                    KeyDataConfig.e(keyDataConfigCallback, false);
                }
            });
        }
    }

    private static void b(e eVar, int i, Context context, final KeyDataConfigCallback keyDataConfigCallback) {
        final a aVarD = eVar.d("key6");
        if (aVarD == null || !d(aVarD, i)) {
            e(keyDataConfigCallback, false);
            return;
        }
        String[] strArrB = aVarD.b();
        if (strArrB == null || strArrB.length == 0) {
            e(keyDataConfigCallback, false);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis);
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(context).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.market.cloud.KeyDataConfig.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0015  */
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                int size;
                if (obj instanceof SparseArray) {
                    Object obj2 = ((SparseArray) obj).get(i2);
                    if (obj2 instanceof List) {
                        size = ((List) obj2).size();
                    } else {
                        size = Integer.MAX_VALUE;
                    }
                } else {
                    size = Integer.MAX_VALUE;
                }
                LogUtil.a("KeyDataConfig", "isKey6Matched time: ", Integer.valueOf(size));
                KeyDataConfig.e(keyDataConfigCallback, size <= KeyDataConfig.a(aVarD.b()));
            }
        });
    }

    private static boolean d(a aVar, int i) {
        return i <= aVar.d();
    }

    private static int a() {
        int iE = CommonUtil.e(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1006), 0);
        if (iE == 0) {
            return 0;
        }
        int iA = (DateFormatUtil.a(System.currentTimeMillis()) - iE) / 10000;
        LogUtil.j("KeyDataConfig", "getSourceDay: ", Integer.valueOf(iA));
        return iA;
    }

    private static boolean c(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        return CommonUtil.e(strArr[0], 0);
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("num")
        private int f8172c;

        @SerializedName(q0.j)
        private String[] d;

        @SerializedName("name")
        private String e;

        private a() {
        }

        public String c() {
            return this.e;
        }

        public String[] b() {
            return this.d;
        }

        public int d() {
            return this.f8172c;
        }

        public String toString() {
            return "KeyDataItem{name='" + this.e + "', num=" + this.f8172c + ", values=" + Arrays.toString(this.d) + '}';
        }
    }

    public static class e {

        @SerializedName("conditions")
        private List<a> e = Collections.EMPTY_LIST;

        private e() {
        }

        public a d(String str) {
            if (this.e == null || TextUtils.isEmpty(str)) {
                return null;
            }
            for (a aVar : this.e) {
                if (str.equals(aVar.c())) {
                    return aVar;
                }
            }
            return null;
        }

        public String toString() {
            return "KeyDataConfigModel{conditions=" + this.e + '}';
        }
    }

    public static boolean e() {
        RemoteConfigUtils.a("isOpen", new RemoteConfigUtils.ConfigCallback() { // from class: com.huawei.health.market.cloud.KeyDataConfig.2
            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onFailure(Exception exc, String str) {
            }

            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onSuccess(String str) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("KeyDataConfig", "configValue is empty");
                        return;
                    }
                    b bVar = (b) new Gson().fromJson(str, b.class);
                    if (bVar == null) {
                        LogUtil.j("KeyDataConfig", "model is null");
                    } else {
                        SharedPreferenceManager.a(String.valueOf(10008), "KeepLiveUtilIsOpen", bVar.d());
                    }
                } catch (Exception e2) {
                    LogUtil.j("KeyDataConfig", "parse config exception: ", e2.getMessage());
                }
            }
        });
        return SharedPreferenceManager.b(String.valueOf(10008), "KeepLiveUtilIsOpen", true);
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("keyIsOpen")
        private boolean f8173a = true;

        private b() {
        }

        public boolean d() {
            return this.f8173a;
        }
    }
}

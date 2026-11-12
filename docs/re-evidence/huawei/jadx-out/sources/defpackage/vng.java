package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.notification.HealthCommondReceiver;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class vng {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f51361b = String.valueOf(PrebakedEffectId.RT_HEARTBEAT);

    public static void b(final WeightTargetDifferences weightTargetDifferences, final ResponseCallback<Object> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HealthWeight_WeightUtils", "saveWeightTargetDifferences callback is null");
        } else {
            xkb.d("900300011", HiJsonUtil.d(weightTargetDifferences), new HiDataOperateListener() { // from class: vnk
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    vng.e(weightTargetDifferences, responseCallback, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void e(WeightTargetDifferences weightTargetDifferences, ResponseCallback responseCallback, int i, Object obj) {
        if (i == 0) {
            iuo.b(weightTargetDifferences);
        }
        responseCallback.onResponse(i, weightTargetDifferences);
    }

    public static boolean a(WeightTargetDifferences weightTargetDifferences) {
        boolean zE = lua.e();
        LogUtil.a("HealthWeight_WeightUtils", "saveWeightTargetDifferences isPullAllStatus ", Boolean.valueOf(zE));
        if (Utils.h() && !zE) {
            return false;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        b(weightTargetDifferences, (ResponseCallback<Object>) new ResponseCallback() { // from class: vnr
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                vng.b(atomicBoolean, countDownLatch, i, obj);
            }
        });
        try {
            LogUtil.a("HealthWeight_WeightUtils", "saveWeightTargetDifferences await ", Boolean.valueOf(countDownLatch.await(1000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e) {
            LogUtil.e("HealthWeight_WeightUtils", "saveWeightTargetDifferences interruptedException ", LogAnonymous.b(e));
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.weight_goal_daily_diff");
        hiUserPreference.setValue(String.valueOf(UnitUtil.d(weightTargetDifferences.c() / 1000.0d, 2)));
        HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
        return atomicBoolean.get();
    }

    static /* synthetic */ void b(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i, Object obj) {
        atomicBoolean.set(i == 0);
        countDownLatch.countDown();
    }

    public static WeightTargetDifferences e() {
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        c((ResponseCallback<WeightTargetDifferences>) new ResponseCallback() { // from class: vnm
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                vng.d(atomicReference, countDownLatch, i, (WeightTargetDifferences) obj);
            }
        });
        try {
            LogUtil.a("HealthWeight_WeightUtils", "getWeightTargetDifferences await ", Boolean.valueOf(countDownLatch.await(1000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e) {
            LogUtil.e("HealthWeight_WeightUtils", "getWeightTargetDifferences interruptedException ", LogAnonymous.b(e));
        }
        return (WeightTargetDifferences) atomicReference.get();
    }

    static /* synthetic */ void d(AtomicReference atomicReference, CountDownLatch countDownLatch, int i, WeightTargetDifferences weightTargetDifferences) {
        if (i == 0) {
            atomicReference.set(weightTargetDifferences);
        }
        countDownLatch.countDown();
    }

    public static void c(final ResponseCallback<WeightTargetDifferences> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HealthWeight_WeightUtils", "getWeightTargetDifferences callback is null");
        } else {
            vdo.c("900300011", new HiDataReadResultListener() { // from class: vng.4
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    if (!njy.b(obj, HiSampleConfig.class)) {
                        responseCallback.onResponse(-1, null);
                        return;
                    }
                    List list = (List) obj;
                    if (njy.e(list)) {
                        responseCallback.onResponse(-1, null);
                        return;
                    }
                    HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                    if (hiSampleConfig == null) {
                        responseCallback.onResponse(-1, null);
                        return;
                    }
                    String configData = hiSampleConfig.getConfigData();
                    if (TextUtils.isEmpty(configData)) {
                        responseCallback.onResponse(-1, null);
                        return;
                    }
                    WeightTargetDifferences weightTargetDifferences = (WeightTargetDifferences) HiJsonUtil.d(configData, WeightTargetDifferences.class);
                    if (weightTargetDifferences == null) {
                        responseCallback.onResponse(-1, null);
                    } else {
                        iuo.b(weightTargetDifferences);
                        responseCallback.onResponse(0, weightTargetDifferences);
                    }
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    LogUtil.a("HealthWeight_WeightUtils", "getWeightTargetDifferences intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
                }
            });
        }
    }

    public static WeightTargetDifferences e(WeightTargetDifferences weightTargetDifferences) {
        if (weightTargetDifferences == null) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getWeightTargetDifferences differences is null");
            return null;
        }
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (mainUser == null) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getWeightTargetDifferences user is null differences ", weightTargetDifferences);
            return weightTargetDifferences;
        }
        float f = mainUser.f();
        float fN = mainUser.n();
        if (f <= 0.0f || fN <= 0.0f) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getWeightTargetDifferences startWeight ", Float.valueOf(f), " goalWeight ", Float.valueOf(fN));
            return weightTargetDifferences;
        }
        int i = AnonymousClass2.f51363a[weightTargetDifferences.e().ordinal()];
        if (i == 1) {
            LogUtil.a("HealthWeight_WeightUtils", "getWeightTargetDifferences WEIGHT_KEE");
            return weightTargetDifferences;
        }
        if (i != 2) {
            if (i != 3) {
                ReleaseLogUtil.d("HealthWeight_WeightUtils", "getWeightTargetDifferences default differences ", weightTargetDifferences);
            } else if (f < fN) {
                LogUtil.a("HealthWeight_WeightUtils", "getWeightTargetDifferences WEIGHT_GAIN");
                return weightTargetDifferences;
            }
        } else if (f > fN) {
            LogUtil.a("HealthWeight_WeightUtils", "getWeightTargetDifferences WEIGHT_LOSS");
            return weightTargetDifferences;
        }
        LogUtil.j("HealthWeight_WeightUtils", "getWeightTargetDifferences differences ", weightTargetDifferences, " startWeight ", Float.valueOf(f), " goalWeight ", Float.valueOf(fN));
        weightTargetDifferences.e(e(weightTargetDifferences.a(), weightTargetDifferences.b(), f - fN));
        a(weightTargetDifferences);
        return weightTargetDifferences;
    }

    /* JADX INFO: renamed from: vng$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51363a;

        static {
            int[] iArr = new int[WeightTargetDifferences.WeightTargetType.values().length];
            f51363a = iArr;
            try {
                iArr[WeightTargetDifferences.WeightTargetType.WEIGHT_KEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51363a[WeightTargetDifferences.WeightTargetType.WEIGHT_LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51363a[WeightTargetDifferences.WeightTargetType.WEIGHT_GAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static int a(double d, double d2) {
        double dDoubleValue;
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
        try {
            int iE = UnitUtil.e();
            if (iE == 1) {
                dDoubleValue = numberFormat.parse(UnitUtil.e(BigDecimal.valueOf(UnitUtil.j(d)).subtract(BigDecimal.valueOf((int) UnitUtil.j(d2))).doubleValue(), 1, 1)).doubleValue();
            } else if (iE == 3) {
                dDoubleValue = numberFormat.parse(UnitUtil.e(BigDecimal.valueOf(UnitUtil.h(d)).subtract(BigDecimal.valueOf((int) UnitUtil.h(d2))).doubleValue(), 1, 1)).doubleValue();
            } else {
                dDoubleValue = numberFormat.parse(UnitUtil.e(BigDecimal.valueOf(d).subtract(BigDecimal.valueOf(d2)).doubleValue(), 1, 1)).doubleValue();
            }
            int i = (int) (dDoubleValue * 10.0d);
            if (i > 5290) {
                return 5290;
            }
            return i;
        } catch (ParseException e) {
            LogUtil.e("HealthWeight_WeightUtils", "parse weight data exception", e.getMessage());
            return 0;
        }
    }

    public static int e(double d) {
        return a(d, 10.0d);
    }

    public static HealthDevice a() {
        return new HealthDevice() { // from class: vng.3
            @Override // com.huawei.health.device.model.HealthDevice
            public String getAddress() {
                return null;
            }

            @Override // com.huawei.health.device.model.HealthDevice
            public String getDeviceName() {
                return null;
            }

            @Override // com.huawei.health.device.model.HealthDevice
            public String getUniqueId() {
                return "-1";
            }
        };
    }

    public static double c(int i) {
        return e(i, false);
    }

    public static double e(int i, boolean z) {
        return c(10.0d, i, z);
    }

    public static double c(double d, int i, boolean z) {
        int iE = UnitUtil.e();
        if (iE == 1) {
            double dDoubleValue = new BigDecimal(((double) ((int) UnitUtil.j(d))) + (((double) i) * 0.1d)).setScale(1, 4).doubleValue();
            return z ? UnitUtil.b(dDoubleValue) : dDoubleValue;
        }
        if (iE == 3) {
            double dDoubleValue2 = new BigDecimal(((double) ((int) UnitUtil.h(d))) + (((double) i) * 0.1d)).setScale(1, 4).doubleValue();
            return z ? UnitUtil.i(dDoubleValue2) : dDoubleValue2;
        }
        return new BigDecimal(d + (((double) i) * 0.1d)).setScale(1, 4).doubleValue();
    }

    public static ArrayList<String> d(int i, int i2) {
        ArrayList<String> arrayList = new ArrayList<>();
        int iE = UnitUtil.e();
        if (iE == 1) {
            for (int iJ = (int) UnitUtil.j(i); iJ < ((int) UnitUtil.j(i2)); iJ++) {
                arrayList.add(UnitUtil.e(iJ, 1, 0));
            }
        } else if (iE == 3) {
            for (int iH = (int) UnitUtil.h(i); iH < ((int) UnitUtil.h(i2)); iH++) {
                arrayList.add(UnitUtil.e(iH, 1, 0));
            }
        } else {
            while (i < i2) {
                arrayList.add(UnitUtil.e(i, 1, 0));
                i++;
            }
        }
        return arrayList;
    }

    public static ArrayList<String> c() {
        return d(10, 251);
    }

    public static long c(double d, double d2, boolean z) {
        double d3 = d / d2;
        return lsl.d(System.currentTimeMillis(), ((int) (z ? d3 * 7.0d : Math.ceil(d3 * 7.0d))) - 1);
    }

    public static double e(long j, long j2, double d) {
        return (d * 1000.0d) / ((double) lsl.b(DateFormatUtil.a(j), DateFormatUtil.a(j2)));
    }

    public static int a(double d, double d2, double d3) {
        if (d == 0.0d || d2 <= 0.0d || d3 <= 0.0d) {
            return 0;
        }
        return Math.abs((int) Math.ceil(((d3 - d2) * 1000.0d) / d));
    }

    public static int a(WeightTargetDifferences weightTargetDifferences, double d, double d2) {
        if (weightTargetDifferences == null || d <= 0.0d || d2 <= 0.0d) {
            return 0;
        }
        long jA = weightTargetDifferences.a();
        long jB = weightTargetDifferences.b();
        if (CommonUtil.b(jA) || CommonUtil.b(jB)) {
            return a(weightTargetDifferences.c(), d, d2);
        }
        return lsl.b(DateFormatUtil.a(jA), DateFormatUtil.a(jB));
    }

    private static void g(final ResponseCallback<Double> responseCallback) {
        nkf.a().a(new ResponseCallback<Float>() { // from class: vng.1
            @Override // com.huawei.hwbasemgr.ResponseCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, Float f) {
                LogUtil.j("HealthWeight_WeightUtils", "getWeightGoal data ", f);
                if (f == null) {
                    responseCallback.onResponse(i, Double.valueOf(0.0d));
                } else {
                    responseCallback.onResponse(i, Double.valueOf(CommonUtils.a(String.valueOf(f))));
                }
            }
        });
    }

    public static void d(final ResponseCallback<Double> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HealthWeight_WeightUtils", "getStartWeight callback is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vnn
                @Override // java.lang.Runnable
                public final void run() {
                    vng.h(responseCallback);
                }
            });
        }
    }

    static /* synthetic */ void h(ResponseCallback responseCallback) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("custom.start_weight_base");
        if (userPreference == null) {
            responseCallback.onResponse(-1, Double.valueOf(0.0d));
        } else {
            responseCallback.onResponse(0, Double.valueOf(CommonUtils.a(userPreference.getValue())));
        }
    }

    public static void e(ResponseCallback<Double> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HealthWeight_WeightUtils", "getTargetWeight callback is null");
        } else {
            g(responseCallback);
        }
    }

    public static void a(final ResponseCallback<HashMap<String, Double>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HealthWeight_WeightUtils", "getStartWeightAndTargetWeight callback is null");
        } else {
            g(new ResponseCallback() { // from class: vnj
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    vng.e(responseCallback, i, (Double) obj);
                }
            });
        }
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, int i, Double d) {
        HashMap map = new HashMap(2);
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        map.put("targetWeight", Double.valueOf(dDoubleValue));
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("custom.start_weight_base");
        double dA = userPreference != null ? CommonUtils.a(userPreference.getValue()) : 0.0d;
        map.put("startWeight", Double.valueOf(dA));
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        LogUtil.a("HealthWeight_WeightUtils", "getStartWeightAndTargetWeight mainUser ", mainUser, " targetWeight ", Double.valueOf(dDoubleValue), " startWeight ", Double.valueOf(dA));
        if (mainUser != null) {
            mainUser.c((float) dDoubleValue);
            mainUser.a((float) dA);
        }
        responseCallback.onResponse(i, map);
    }

    public static float e(float f, double d, int i) {
        float fFloatValue;
        double d2 = f;
        if (d2 % d == 0.0d) {
            return f + ((float) d);
        }
        if (i == 0) {
            fFloatValue = (float) Math.ceil(d2);
        } else {
            fFloatValue = new BigDecimal(d2).setScale(i, 0).floatValue();
        }
        return a(d, fFloatValue);
    }

    private static float a(double d, float f) {
        for (int i = 0; i < 4; i++) {
            if (d == 4.0d) {
                f += 1.0f;
            }
            if (d == 0.4d) {
                f = Math.round((f + 0.1f) * 10.0f) / 10.0f;
            }
            if (d == 0.04d) {
                f = Math.round((f + 0.01f) * 100.0f) / 100.0f;
            }
            if (b(f, d)) {
                return f;
            }
        }
        return f;
    }

    public static float d(float f, double d, int i) {
        float fFloatValue;
        double d2 = f;
        if (d2 % d == 0.0d) {
            return f - ((float) d);
        }
        if (i == 0) {
            fFloatValue = (float) Math.floor(d2);
        } else {
            fFloatValue = new BigDecimal(d2).setScale(i, 1).floatValue();
        }
        return e(d, fFloatValue);
    }

    private static float e(double d, float f) {
        for (int i = 0; i < 4; i++) {
            if (d == 4.0d) {
                f -= 1.0f;
            }
            if (d == 0.4d) {
                f = Math.round((f - 0.1f) * 10.0f) / 10.0f;
            }
            if (d == 0.04d) {
                f = Math.round((f - 0.01f) * 100.0f) / 100.0f;
            }
            if (b(f, d)) {
                return f;
            }
        }
        return f;
    }

    private static boolean b(float f, double d) {
        if (Double.compare(d, 0.4d) == 0) {
            d *= 10.0d;
            f *= 10.0f;
        }
        if (Double.compare(d, 0.04d) == 0) {
            d *= 100.0d;
            f *= 100.0f;
        }
        return ((double) f) % d == 0.0d;
    }

    public static void a(String[] strArr) {
        SharedPreferenceManager.d(f51361b, strArr);
    }

    public static void a(int i, String str, String str2) {
        SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(i), str, str2, new StorageParams());
    }

    public static String b(int i, String str) {
        return SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(i), str);
    }

    public static void a(String str, String str2) {
        SharedPreferenceManager.c(f51361b, str, str2);
    }

    public static String d(String str) {
        return b(str, "");
    }

    public static String b(String str, String str2) {
        return SharedPreferenceManager.b(f51361b, str, str2);
    }

    public static void d(String str, boolean z) {
        SharedPreferenceManager.a(f51361b, str, z);
    }

    public static boolean e(String str) {
        return c(str, false);
    }

    public static boolean c(String str, boolean z) {
        return SharedPreferenceManager.b(f51361b, str, z);
    }

    public static void b(String str, float f) {
        SharedPreferenceManager.c(f51361b, str, f);
    }

    public static float a(String str) {
        return e(str, -1.0f);
    }

    public static float e(String str, float f) {
        return SharedPreferenceManager.a(f51361b, str, f);
    }

    public static boolean b() {
        if (pqg.d().getModelType() == 1) {
            return true;
        }
        LogUtil.e("HealthWeight_WeightUtils", "phone model not support ai body shape analysis, return");
        return false;
    }

    public static String c(String str) {
        return (TextUtils.isEmpty(str) || "NULL".equals(str)) ? LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011) : str;
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getUserIdForH5 uid ", str);
            return "";
        }
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        String strI = mainUser != null ? mainUser.i() : "";
        LogUtil.a("HealthWeight_WeightUtils", "getUserIdForH5 mainUserId ", strI, " uid ", str);
        return str.equals(strI) ? "" : str;
    }

    private static void b(String str, int i, boolean z) {
        LogUtil.a("HealthWeight_WeightUtils", "goToWeight path ", str, " flags ", Integer.valueOf(i), " isDeepLink ", Boolean.valueOf(z));
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "goToWeight path ", str);
            return;
        }
        Context contextA = a(BaseApplication.j());
        if (z) {
            AppRouter.e(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.weight?h5pro=true&path=" + str)).e(268435456).b(contextA);
        } else {
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addPath(str);
            if (i > -1) {
                builder.setActivityStartFlag(i);
            }
            ddv.b().loadH5ProApp(contextA, "com.huawei.health.h5.weight", builder);
        }
    }

    public static void e(Bundle bundle) {
        long j;
        String string;
        String string2;
        String string3;
        LogUtil.a("HealthWeight_WeightUtils", "goToWeight bundle ", bundle);
        String str = "";
        int i = -1;
        boolean z = false;
        if (bundle == null) {
            j = 0;
            string = "";
            string2 = string;
            string3 = string2;
        } else {
            if (!bundle.containsKey("uid")) {
                string = "";
            } else {
                string = bundle.getString("uid");
            }
            if (!bundle.containsKey("from")) {
                string2 = "";
            } else {
                string2 = bundle.getString("from");
            }
            if (!bundle.containsKey("entranceType")) {
                string3 = "";
            } else {
                string3 = bundle.getString("entranceType");
            }
            j = bundle.containsKey("lastDataTime") ? bundle.getLong("lastDataTime") : 0L;
            i = bundle.containsKey(ParamConstants.Param.FLAGS) ? bundle.getInt(ParamConstants.Param.FLAGS) : -1;
            if (bundle.containsKey(FaqConstants.FAQ_IS_DEEPLICK)) {
                z = bundle.getBoolean(FaqConstants.FAQ_IS_DEEPLICK);
            }
        }
        if (!z) {
            str = Constants.H5PRO_PAGE_PREFIX;
        }
        String strB = b(string);
        String str2 = str + "home?isMainUser=" + TextUtils.isEmpty(strB) + "&uid=" + strB;
        if (j > 0) {
            str2 = str2 + "&lastDataTime=" + j;
        }
        if (!TextUtils.isEmpty(string2)) {
            str2 = str2 + "&from=" + string2;
        }
        if (!TextUtils.isEmpty(string3)) {
            str2 = str2 + "&entranceType=" + string3;
        }
        b(str2, i, z);
    }

    public static void c(String str, Bundle bundle) {
        if (bundle != null) {
            bundle.putString("from", str);
        }
        e(bundle);
    }

    public static void a(String str, Intent intent) {
        String stringExtra = "";
        long longExtra = 0;
        int intExtra = -1;
        boolean booleanExtra = false;
        if (intent != null) {
            stringExtra = intent.hasExtra("weight_user_id") ? intent.getStringExtra("weight_user_id") : "";
            longExtra = intent.hasExtra("lastDataTime") ? intent.getLongExtra("lastDataTime", 0L) : 0L;
            intExtra = intent.hasExtra(ParamConstants.Param.FLAGS) ? intent.getIntExtra(ParamConstants.Param.FLAGS, -1) : -1;
            if (intent.hasExtra(FaqConstants.FAQ_IS_DEEPLICK)) {
                booleanExtra = intent.getBooleanExtra(FaqConstants.FAQ_IS_DEEPLICK, false);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("uid", stringExtra);
        bundle.putString("from", str);
        bundle.putLong("lastDataTime", longExtra);
        bundle.putInt(ParamConstants.Param.FLAGS, intExtra);
        bundle.putBoolean(FaqConstants.FAQ_IS_DEEPLICK, booleanExtra);
        e(bundle);
    }

    public static void c(Map<String, Object> map) {
        StringBuffer stringBuffer = new StringBuffer("#/DataPage?dimension=0&tabId=bodyFat");
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                stringBuffer.append("&").append(entry.getKey()).append("=").append(entry.getValue());
            }
        }
        b(stringBuffer.toString(), -1, false);
    }

    public static Context a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        Activity activityJ = BaseApplication.j();
        ReleaseLogUtil.d("HealthWeight_WeightUtils", "getActivity topActivity ", activityJ);
        return activityJ == null ? BaseApplication.b() : activityJ;
    }

    public static void a(final float f, final long j, final ResponseCallback<Object> responseCallback) {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vnl
                @Override // java.lang.Runnable
                public final void run() {
                    vng.a(f, j, (ResponseCallback<Object>) responseCallback);
                }
            });
            return;
        }
        if (Float.isNaN(f) || Float.compare(f, 0.0f) != 1) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "autoUpdateUserWeight weight ", Float.valueOf(f), " measureTime ", Long.valueOf(j), " callback ", responseCallback);
            return;
        }
        final dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser == null) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "autoUpdateUserWeight user is null weight ", Float.valueOf(f), " measureTime ", Long.valueOf(j), " callback ", responseCallback);
            return;
        }
        long jI = CommonUtils.i(lua.b(String.valueOf(10000), "update_user_weight_time" + currentUser.i()));
        LogUtil.a("HealthWeight_WeightUtils", "autoUpdateUserWeight lastModifyTime ", Long.valueOf(jI), " measureTime ", Long.valueOf(j), " weight ", Float.valueOf(f), " user ", currentUser);
        if (jI > j) {
            return;
        }
        currentUser.e(f);
        MultiUsersManager.INSTANCE.saveUser(currentUser, new IBaseResponseCallback() { // from class: vnp
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                vng.b(responseCallback, currentUser, i, obj);
            }
        });
    }

    static /* synthetic */ void b(ResponseCallback responseCallback, dnj dnjVar, int i, Object obj) {
        ReleaseLogUtil.d("HealthWeight_WeightUtils", "autoUpdateUserWeight onResponse errorCode ", Integer.valueOf(i), " object ", obj, " callback ", responseCallback);
        if (responseCallback == null) {
            return;
        }
        responseCallback.onResponse(i, dnjVar);
    }

    public static void b(List<HiHealthData> list, ArrayList<dnb> arrayList, dnj dnjVar) {
        if (arrayList == null) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "buildWeightListFromHiHealthData weightList is null");
            return;
        }
        if (njy.e(list)) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "buildWeightListFromHiHealthData list ", list);
            return;
        }
        boolean zO = Utils.o();
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            dnb dnbVarC = c(it.next(), zO, dnjVar);
            if (dnbVarC != null && !arrayList.contains(dnbVarC)) {
                arrayList.add(dnbVarC);
            }
        }
    }

    private static dnb c(HiHealthData hiHealthData, boolean z, dnj dnjVar) {
        if (hiHealthData.getDouble("bodyWeight") <= 0.0d) {
            return null;
        }
        dnb dnbVarD = d(hiHealthData.getInt("trackdata_deviceType"));
        b(hiHealthData, dnbVarD, z, dnjVar);
        d(hiHealthData, dnbVarD);
        dnbVarD.e(hiHealthData.getDouble("bodyFat"));
        dnbVarD.v(hiHealthData.getDouble(BleConstants.IMPEDANCE));
        dnbVarD.aa(hiHealthData.getDouble(BleConstants.MOISTURE));
        dnbVarD.ag(hiHealthData.getDouble(BleConstants.MOISTURE_RATE));
        dnbVarD.l(hiHealthData.getDouble(BleConstants.VISCERAL_FAT_LEVEL));
        dnbVarD.h(hiHealthData.getDouble(BleConstants.BONE_SALT));
        dnbVarD.b(hiHealthData.getDouble(BleConstants.BASAL_METABOLISM));
        dnbVarD.p(hiHealthData.getDouble(BleConstants.MUSCLE_MASS));
        dnbVarD.s(etn.a(hiHealthData));
        dnbVarD.j(hiHealthData.getDouble(BleConstants.BODY_SCORE));
        dnbVarD.a(hiHealthData.getDouble(BleConstants.BODY_AGE));
        dnbVarD.o(hiHealthData.getDouble(IndoorEquipManagerApi.KEY_HEART_RATE));
        dnbVarD.t(hiHealthData.getDouble("pressure"));
        dnbVarD.ab(hiHealthData.getDouble("skeletalMusclelMass"));
        dnbVarD.f(hiHealthData.getInt("pole"));
        dnbVarD.k(hiHealthData.getDouble("leftArmFatMass"));
        dnbVarD.q(hiHealthData.getDouble("leftArmMuscleMass"));
        dnbVarD.n(hiHealthData.getDouble("leftLegFatMass"));
        dnbVarD.m(hiHealthData.getDouble("leftLegMuscleMass"));
        dnbVarD.y(hiHealthData.getDouble("rightArmFatMass"));
        dnbVarD.ad(hiHealthData.getDouble("rightArmMuscleMass"));
        dnbVarD.x(hiHealthData.getDouble("rightLegFatMass"));
        dnbVarD.w(hiHealthData.getDouble("rightLegMuscleMass"));
        dnbVarD.ac(hiHealthData.getDouble("trunkFatMass"));
        dnbVarD.z(hiHealthData.getDouble("trunkMuscleMass"));
        dnbVarD.ae(hiHealthData.getDouble("waistHipRatio"));
        dnbVarD.ah(hiHealthData.getDouble("waistHipRatioUser"));
        dnbVarD.u(hiHealthData.getDouble("rasm"));
        dnbVarD.i(hiHealthData.getDouble("bodySize"));
        dnbVarD.f(hiHealthData.getDouble("bodyShape"));
        dnbVarD.g(hiHealthData.getDouble("fatBalance"));
        dnbVarD.r(hiHealthData.getDouble("muscleBalance"));
        dnbVarD.c(hiHealthData.getString("device_uniquecode"));
        dnbVarD.b(hiHealthData.getClientId());
        dnbVarD.b(hiHealthData.getModifiedTime());
        dnbVarD.e(hiHealthData.getStartTime());
        dnbVarD.d(hiHealthData.getEndTime());
        return dnbVarD;
    }

    private static dnb d(int i) {
        dnb usrVar;
        if (dxm.e(i)) {
            usrVar = new uss();
        } else if (i == 133) {
            usrVar = new ust();
        } else {
            usrVar = new usr();
        }
        usrVar.d(i);
        return usrVar;
    }

    public static void b(HiHealthData hiHealthData, dnb dnbVar, boolean z, dnj dnjVar) {
        if (hiHealthData == null || dnbVar == null) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "setWeightBeanBaseData data ", hiHealthData, " bean ", dnbVar, " isOversea ", Boolean.valueOf(z));
            return;
        }
        dnbVar.af(hiHealthData.getDouble("bodyWeight"));
        int i = hiHealthData.getInt("height");
        boolean z2 = dnjVar != null && dnjVar.e() > 0 && dnjVar.c() > 0;
        if (i <= 0) {
            if (z2) {
                dnbVar.c(dnjVar.e());
            } else {
                dnbVar.c(ioy.c());
            }
            LogUtil.j("HealthWeight_WeightUtils", "setWeightBeanBaseData height ", Integer.valueOf(i), " bean ", dnbVar);
        } else {
            dnbVar.c(i);
        }
        dnbVar.b(hiHealthData.getClientId());
        dnbVar.b(hiHealthData.getModifiedTime());
        double dC = hiHealthData.getDouble(BleConstants.BMI);
        if (!ezh.c(dC, z)) {
            dC = exz.c(dnbVar.av(), dnbVar.r());
        }
        dnbVar.c(dC);
        int i2 = hiHealthData.getInt("age");
        if (i2 <= 0) {
            if (z2) {
                dnbVar.e(dnjVar.c());
            } else {
                dnbVar.e(ioy.d());
            }
            LogUtil.j("HealthWeight_WeightUtils", "setWeightBeanBaseData age ", Integer.valueOf(i2), " bean ", dnbVar);
        } else {
            dnbVar.e(i2);
        }
        int i3 = hiHealthData.getInt(CommonConstant.KEY_GENDER);
        if (i3 <= 0 && i2 <= 0 && i <= 0 && (dnbVar instanceof usr)) {
            if (z2) {
                dnbVar.c(dnjVar.d());
            } else {
                int i4 = ioy.e() != 1 ? 1 : 0;
                dnbVar.c((byte) i4);
                i3 = i4;
            }
            LogUtil.j("HealthWeight_WeightUtils", "setWeightBeanBaseData gender ", Integer.valueOf(i3), " bean ", dnbVar);
        } else {
            dnbVar.c((byte) (i3 != 0 ? 1 : 0));
        }
        dnbVar.d(hiHealthData.getDouble(BleConstants.BODY_FAT_RATE));
    }

    private static void d(HiHealthData hiHealthData, dnb dnbVar) {
        String[] strArr = {"lfrfImpedance", "lhrhImpedance", "lhlfImpedance", "lhrfImpedance", "rhlfImpedance", "rhrfImpedance"};
        double[] dArr = new double[6];
        for (int i = 0; i < 6; i++) {
            dArr[i] = hiHealthData.getDouble(strArr[i]);
        }
        dnbVar.c(dArr);
        if (dxm.b(hiHealthData)) {
            String[] strArr2 = {"lfrfHfImpedance", "lhrhHfImpedance", "lhlfHfImpedance", "lhrfHfImpedance", "rhlfHfImpedance", "rhrfHfImpedance"};
            double[] dArr2 = new double[6];
            for (int i2 = 0; i2 < 6; i2++) {
                dArr2[i2] = hiHealthData.getDouble(strArr2[i2]);
            }
            dnbVar.d(dArr2);
            dnbVar.a(2);
        }
    }

    /* JADX INFO: renamed from: vng$5, reason: invalid class name */
    class AnonymousClass5 implements HiAggregateListener {
        final /* synthetic */ ResponseCallback d;

        AnonymousClass5(ResponseCallback responseCallback) {
            this.d = responseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(final List<HiHealthData> list, final int i, int i2) {
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_QUERY_85070010.value(), i);
            if (njy.e(list)) {
                this.d.onResponse(i, null);
                return;
            }
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final ResponseCallback responseCallback = this.d;
            threadPoolManagerC.execute(new Runnable() { // from class: vnq
                @Override // java.lang.Runnable
                public final void run() {
                    vng.AnonymousClass5.b(list, responseCallback, i);
                }
            });
        }

        static /* synthetic */ void b(List list, ResponseCallback responseCallback, int i) {
            ArrayList arrayList = new ArrayList();
            vng.b((List<HiHealthData>) list, (ArrayList<dnb>) arrayList, (dnj) null);
            responseCallback.onResponse(i, arrayList);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("HealthWeight_WeightUtils", "onResultIntent intentType ", Integer.valueOf(i), " anchor ", Integer.valueOf(i3), " errorCode ", Integer.valueOf(i2));
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_QUERY_85070010.value(), i2);
            this.d.onResponse(i2, null);
        }
    }

    public static void b(HiAggregateOption hiAggregateOption, ResponseCallback<List<dnb>> responseCallback) {
        if (hiAggregateOption == null || responseCallback == null) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getWeighList option ", hiAggregateOption, " callback ", responseCallback);
        } else {
            HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new AnonymousClass5(responseCallback));
        }
    }

    public static void b(final ResponseCallback<Pair<Long, vij>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getWeightMeasureAlarm callback is null");
        } else {
            xkb.c("900300062", new ResponseCallback() { // from class: vnh
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    vng.b(responseCallback, i, (Pair) obj);
                }
            });
        }
    }

    static /* synthetic */ void b(ResponseCallback responseCallback, int i, Pair pair) {
        if (pair == null) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getSampleConfigForHealth pair is null");
            responseCallback.onResponse(i, null);
            return;
        }
        Long l = (Long) pair.first;
        l.longValue();
        String str = (String) pair.second;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getWeightMeasureAlarm configData ", str);
            responseCallback.onResponse(i, new Pair(l, null));
            return;
        }
        vij vijVar = (vij) HiJsonUtil.d(str, vij.class);
        if (vijVar == null) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getWeightMeasureAlarm reminderBean is null");
            responseCallback.onResponse(i, new Pair(l, null));
        } else {
            LogUtil.a("HealthWeight_WeightUtils", "getWeightMeasureAlarm modifiedTime ", l, " configData ", str);
            responseCallback.onResponse(i, new Pair(l, vijVar));
        }
    }

    public static void d() {
        ReleaseLogUtil.c("HealthWeight_WeightUtils", "scheduleWeightMeasureNextReminder enter");
        a(300012, "WEIGHT_MEASURE_REMIND_ACTION");
        b((ResponseCallback<Pair<Long, vij>>) new ResponseCallback() { // from class: vno
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                vng.b(i, (Pair) obj);
            }
        });
    }

    static /* synthetic */ void b(int i, Pair pair) {
        if (i != 0) {
            ReleaseLogUtil.c("HealthWeight_WeightUtils", "scheduleDrinkWaterNextReminder getDrinkWaterAlarm error: ", Integer.valueOf(i));
            return;
        }
        if (pair == null) {
            ReleaseLogUtil.c("HealthWeight_WeightUtils", "getWeightMeasureAlarm result is null");
            return;
        }
        vij vijVar = (vij) pair.second;
        if (vijVar == null) {
            ReleaseLogUtil.c("HealthWeight_WeightUtils", "getWeightMeasureAlarm weightReminderBean is null");
            return;
        }
        if (!vijVar.a()) {
            LogUtil.a("HealthWeight_WeightUtils", "getWeightMeasureAlarm enable false");
            return;
        }
        List<vid> listC = vijVar.c();
        if (CollectionUtils.a(listC)) {
            ReleaseLogUtil.d("HealthWeight_WeightUtils", "getWeightMeasureAlarm reminderPlanList is null");
            return;
        }
        int iB = listC.get(0).b();
        int iD = listC.get(0).d();
        long jD = d(iB, iD, vijVar.d());
        LogUtil.a("HealthWeight_WeightUtils", "NextWeightMeasureReminder :", Long.valueOf(jD));
        if (jD == -1) {
            return;
        }
        xjk.c(300012, c("WEIGHT_MEASURE_REMIND_ACTION", iB, iD), 201326592, 0, jD);
    }

    private static long d(int i, int i2, int i3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i4 = 0; i4 < 7; i4++) {
            long jD = lsl.d(jCurrentTimeMillis, i4);
            if (c(i3, jD)) {
                long jA = lsl.a(jD, i, i2);
                if (i4 != 0 || jA > jCurrentTimeMillis) {
                    return jA;
                }
            }
        }
        return -1L;
    }

    private static boolean c(int i, long j) {
        int iE = lsl.e(j);
        return (i & (1 << (iE == 1 ? 6 : iE + (-2)))) != 0;
    }

    public static void a(int i, String str) {
        LogUtil.a("HealthWeight_WeightUtils", "cancelReminders enter, requestCode:", Integer.valueOf(i), ",action:", str);
        xjk.d(i, c(str, -1, -1), 201326592);
    }

    private static Intent c(String str, int i, int i2) {
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) HealthCommondReceiver.class);
        intent.setPackage(BaseApplication.d());
        intent.setAction(str);
        intent.putExtra("HOUR_OF_DAY", i);
        intent.putExtra("MINUTE", i2);
        return intent;
    }

    public static void g() {
        LogUtil.a("HealthWeight_WeightUtils", "sendWeightMeasureNotify enter");
        String strF = qre.f(R.string.IDS_weight_measure_reminder_title);
        String strF2 = qre.f(R.string.IDS_weight_measure_reminder_content);
        lsb.d().e(20200321);
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        Context contextB = BaseApplication.b();
        Intent intent = new Intent(com.huawei.hms.support.api.entity.common.CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.weight?h5pro=true&urlType=4&pName=com.huawei.health&path=ManualInput&isImmerse&showStatusBar&statusBarTextBlack"));
        intent.setFlags(67108864);
        intent.addFlags(536870912);
        builderC.setContentTitle(strF).setContentText(strF2).setContentIntent(PendingIntent.getActivity(contextB, 0, intent, 201326592));
        builderC.setAutoCancel(true);
        imr.b(20200321, builderC, strF2);
    }
}

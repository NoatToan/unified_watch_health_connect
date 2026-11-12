package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class dek {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f31707b = {0.4786f, 0.49f, 0.4775f, 0.6337f, 0.6143f, 0.5453f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f31708c = {0.7973f, 0.8222f, 0.8488f, 0.7918f, 0.8186f, 0.8736f};

    public static int d(int i) {
        switch (i) {
            case 6:
                return 1;
            case 7:
                return 2;
            case 8:
                return 5;
            case 9:
                return 6;
            default:
                return 0;
        }
    }

    public static void b(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            LogUtil.j("PaceRangeUtils", "saveEachPaceRange paceRangeValues is null.");
            return;
        }
        int[] iArr2 = (int[]) iArr.clone();
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.UserPreference_RunningPaceZone_Config");
        hiUserPreference.setValue(Arrays.toString(iArr2));
        HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference, true);
    }

    public static void c(boolean z) {
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("setting_auto_calc_key_status");
        hiUserPreference.setValue(z ? "1" : "0");
        HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference, true);
    }

    public static boolean c() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("setting_auto_calc_key_status");
        if (userPreference == null) {
            LogUtil.j("PaceRangeUtils", "getAutoCalcKeyStatus userPreference is null.");
            return false;
        }
        String value = userPreference.getValue();
        if (TextUtils.isEmpty(value)) {
            LogUtil.j("PaceRangeUtils", "getAutoCalcKeyStatus keyStatus is null.");
            return false;
        }
        return "1".equals(value);
    }

    public static int c(int i, float f) {
        if (i >= 0) {
            float[] fArr = f31707b;
            if (i <= fArr.length) {
                return (int) ((1.0d / (((double) fArr[i]) * Math.pow(f, f31708c[i]))) * 3600.0d);
            }
        }
        LogUtil.j("PaceRangeUtils", "getPaceSecondsByRunning index is error");
        return 0;
    }

    public static String b(Context context, int i, float f, double d) {
        double dC = ((double) c(i, f)) * d;
        if (dC == 0.0d) {
            return context.getResources().getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        return hcc.d(context, (float) dC);
    }

    public static void b(Context context, int i, int i2, long j) {
        String[] strArr = {String.valueOf(i), String.valueOf(i2), String.valueOf(j)};
        StorageParams storageParams = new StorageParams();
        if (UnitUtil.f()) {
            SharedPreferenceManager.e(context, Integer.toString(10000), "USER_SAVE_ACHIEVEMENT_IMPERIAL_KEY", Arrays.toString(strArr), storageParams);
            SharedPreferenceManager.e(context, Integer.toString(10000), "USER_SAVE_ACHIEVEMENT_METRIC_KEY", "", storageParams);
        } else {
            SharedPreferenceManager.e(context, Integer.toString(10000), "USER_SAVE_ACHIEVEMENT_METRIC_KEY", Arrays.toString(strArr), storageParams);
            SharedPreferenceManager.e(context, Integer.toString(10000), "USER_SAVE_ACHIEVEMENT_IMPERIAL_KEY", "", storageParams);
        }
    }

    public static double e(double d, int i) {
        double d2 = ((double) i) / 60.0d;
        LogUtil.a("PaceRangeUtils", "getVo2Max minute =", Double.valueOf(d2));
        if (CommonUtil.b(d2)) {
            LogUtil.j("PaceRangeUtils", "getVo2Max minute near zero");
            return 0.0d;
        }
        double d3 = d / d2;
        return (((0.182258d * d3) - 4.6d) + ((1.04E-4d * d3) * d3)) / (((Math.exp((-0.012778d) * d2) * 0.1894393d) + 0.8d) + (Math.exp(d2 * (-0.1932695d)) * 0.2989558d));
    }

    public static int b(double d) {
        return b(0.67d, d);
    }

    public static int a(double d) {
        return b(0.76d, d);
    }

    public static int e(double d) {
        return b(0.8d, d);
    }

    public static int d(double d) {
        return b(0.91d, d);
    }

    public static int i(double d) {
        return b(1.06d, d);
    }

    public static int c(double d) {
        return b(1.15d, d);
    }

    public static SparseArray<ddz> d(Context context) {
        if (context == null) {
            LogUtil.j("PaceRangeUtils", "createDistanceKmData context null");
            return new SparseArray<>(5);
        }
        ddz ddzVar = new ddz();
        ddzVar.e(context.getResources().getQuantityString(R.plurals.sug_km, 3, UnitUtil.e(3.0d, 1, 0)));
        ddzVar.b(3000.0d);
        ddzVar.c(420);
        ddzVar.e(3599);
        ddzVar.b(0);
        ddz ddzVar2 = new ddz();
        ddzVar2.e(context.getResources().getQuantityString(R.plurals.sug_km, 5, UnitUtil.e(5.0d, 1, 0)));
        ddzVar2.b(5000.0d);
        ddzVar2.c(900);
        ddzVar2.e(7199);
        ddzVar2.b(1);
        ddz ddzVar3 = new ddz();
        ddzVar3.e(context.getResources().getQuantityString(R.plurals.sug_km, 10, UnitUtil.e(10.0d, 1, 0)));
        ddzVar3.b(10000.0d);
        ddzVar3.c(1800);
        ddzVar3.e(10799);
        ddzVar3.b(2);
        SparseArray<ddz> sparseArray = new SparseArray<>(5);
        sparseArray.put(0, ddzVar);
        sparseArray.put(1, ddzVar2);
        sparseArray.put(2, ddzVar3);
        b(context, sparseArray);
        return sparseArray;
    }

    public static SparseArray<ddz> b(Context context) {
        if (context == null) {
            LogUtil.j("PaceRangeUtils", "createDistanceMileData context null");
            return new SparseArray<>(4);
        }
        ddz ddzVar = new ddz();
        ddzVar.e(context.getResources().getQuantityString(R.plurals.sug_mile, 1, UnitUtil.e(1.0d, 1, 0)));
        ddzVar.b(((float) UnitUtil.c(1.0d, 3)) * 1000.0f);
        ddzVar.c(120);
        ddzVar.e(1859);
        ddzVar.b(3);
        ddz ddzVar2 = new ddz();
        ddzVar2.e(context.getResources().getQuantityString(R.plurals.sug_mile, 2, UnitUtil.e(2.0d, 1, 0)));
        ddzVar2.b(((float) UnitUtil.c(2.0d, 3)) * 1000.0f);
        ddzVar2.c(240);
        ddzVar2.e(3599);
        ddzVar2.b(4);
        SparseArray<ddz> sparseArray = new SparseArray<>(4);
        sparseArray.put(3, ddzVar);
        sparseArray.put(4, ddzVar2);
        b(context, sparseArray);
        return sparseArray;
    }

    private static void b(Context context, SparseArray<ddz> sparseArray) {
        ddz ddzVar = new ddz();
        ddzVar.e(context.getString(R.string.IDS_start_track_show_distance_half_marathon));
        ddzVar.b(21097.5d);
        ddzVar.c(2700);
        ddzVar.e(21599);
        ddzVar.b(5);
        ddz ddzVar2 = new ddz();
        ddzVar2.e(context.getString(R.string.IDS_start_track_show_distance_marathon));
        ddzVar2.b(42195.0d);
        ddzVar2.c(4500);
        ddzVar2.e(28799);
        ddzVar2.b(6);
        sparseArray.put(5, ddzVar);
        sparseArray.put(6, ddzVar2);
    }

    private static int b(double d, double d2) {
        double d3 = (((5.000663d * d2) + 29.54d) - ((0.007546d * d2) * d2)) * d;
        if (CommonUtil.b(d3)) {
            LogUtil.j("PaceRangeUtils", "vo2ToVel speedFromVo2Max near zero");
            return 0;
        }
        return (int) Math.round((1000.0d / d3) * 60.0d);
    }
}

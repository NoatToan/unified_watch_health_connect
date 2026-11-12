package com.huawei.health.sport.utils;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.servicesapi.R;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.een;
import defpackage.ied;
import defpackage.lon;
import defpackage.lsy;
import defpackage.njy;
import defpackage.pjg;
import defpackage.pps;
import defpackage.pqg;
import defpackage.qqt;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public class SportSupportUtil {

    /* JADX INFO: loaded from: classes31.dex */
    public interface OnFitnessGetFilterTabListener {
        void onFilterTabSuccess(boolean z);
    }

    public static boolean a(int i) {
        return i == 258 || i == 264;
    }

    public static boolean b(int i) {
        return i == 258 || i == 264 || i == 257;
    }

    public static int c(int i) {
        if (i == 258) {
            return 1;
        }
        if (i != 259) {
            return i != 264 ? 0 : 5;
        }
        return 3;
    }

    public static boolean e(int i) {
        return i == 400000 || i == 400001 || i == 400002 || i == 400003;
    }

    public static boolean f(int i) {
        if (i == 264 || i == 265 || i == 273 || i == 274) {
            return true;
        }
        switch (i) {
            case 257:
            case 258:
            case 259:
            case 260:
                return true;
            default:
                switch (i) {
                    case 281:
                    case 282:
                    case 283:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean g(int i) {
        return i == 258 || i == 264 || i == 259;
    }

    public static boolean g() {
        return (l() || m() || b() || k()) ? false : true;
    }

    public static boolean l() {
        return (s() || qrs.ah(BaseApplication.b())) ? false : true;
    }

    public static boolean m() {
        return a() || d();
    }

    public static boolean a() {
        return f() && !l();
    }

    public static boolean f() {
        return (!VersionControlUtil.isSupportOperationAccount() || Utils.k() || CommonUtil.ca()) ? false : true;
    }

    public static boolean d() {
        return b() && f();
    }

    public static boolean k() {
        if (s()) {
            return false;
        }
        return i() || n();
    }

    public static boolean n() {
        return Utils.c() == 1;
    }

    public static boolean i() {
        if (pps.e().d() != -1) {
            return c() || e();
        }
        return false;
    }

    public static boolean j() {
        int modelType = pqg.d().getModelType();
        LogUtil.a("Track_SportSupportUtil", "isSupportAiSportExam the modelType = ", Integer.valueOf(modelType));
        if (modelType != -1) {
            return c() || e();
        }
        return false;
    }

    public static boolean e() {
        return c(1, 90);
    }

    public static boolean c() {
        return c(0, 270);
    }

    private static boolean c(final int i, final int i2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Boolean boolD = d(i, i2);
        if (boolD != null) {
            return boolD.booleanValue();
        }
        ThreadPoolManager.c().a("Track_SportSupportUtilgetCamera", new Runnable() { // from class: hap
            @Override // java.lang.Runnable
            public final void run() {
                SportSupportUtil.c(i, i2, countDownLatch);
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            ReleaseLogUtil.c("Track_SportSupportUtil", "exception happens = ", e.getMessage());
        }
        Boolean boolD2 = d(i, i2);
        if (boolD2 == null) {
            return false;
        }
        return boolD2.booleanValue();
    }

    public static /* synthetic */ void c(int i, int i2, CountDownLatch countDownLatch) {
        Boolean boolE = e(i, i2);
        if (boolE != null) {
            b(i, i2, boolE.booleanValue());
        }
        countDownLatch.countDown();
    }

    private static Boolean e(int i, int i2) {
        Object systemService = BaseApplication.b().getSystemService("camera");
        if (!(systemService instanceof CameraManager)) {
            LogUtil.j("Track_SportSupportUtil", "initCameraInfo object instanceof CameraManager false");
            return null;
        }
        CameraManager cameraManager = (CameraManager) systemService;
        try {
            for (String str : cameraManager.getCameraIdList()) {
                if (!StringUtils.g(str)) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    if (num != null && num.intValue() == i && num2 != null && num2.intValue() == i2) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            LogUtil.e("Track_SportSupportUtil", "check front camera  CameraAccessException ", LogAnonymous.b(e));
            return null;
        }
    }

    private static void b(int i, int i2, boolean z) {
        String strB = qqt.b(new a(String.valueOf(z), System.currentTimeMillis() + TimeUnit.DAYS.toMillis(3L)));
        SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(20002), b(i, i2), strB, null);
    }

    private static Boolean d(int i, int i2) {
        a aVar = (a) qqt.e(SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(20002), b(i, i2)), a.class);
        if (aVar == null || !aVar.c()) {
            return null;
        }
        return Boolean.valueOf(aVar.d());
    }

    private static String b(int i, int i2) {
        return "hascamera_" + i + "_" + i2;
    }

    public static boolean d(int i) {
        return b(i) || i == 283 || e(i);
    }

    public static boolean b() {
        if (CommonUtil.az()) {
            return false;
        }
        if (!Utils.o()) {
            return LanguageUtil.l(BaseApplication.b());
        }
        if (Utils.k()) {
            return false;
        }
        return pjg.b("2");
    }

    public static void e(OnFitnessGetFilterTabListener onFitnessGetFilterTabListener) {
        if (onFitnessGetFilterTabListener == null) {
            LogUtil.j("Track_SportSupportUtil", "isFitnessOpen, getFilterTabListener is null.");
            return;
        }
        if (!Utils.o()) {
            onFitnessGetFilterTabListener.onFilterTabSuccess(LanguageUtil.l(BaseApplication.b()));
        } else {
            if (Utils.k()) {
                onFitnessGetFilterTabListener.onFilterTabSuccess(false);
                return;
            }
            boolean zB = pjg.b("2");
            LogUtil.a("Track_SportSupportUtil", "isFitnessOpen : ", Boolean.valueOf(zB));
            onFitnessGetFilterTabListener.onFilterTabSuccess(zB);
        }
    }

    public static boolean h() {
        return !LanguageUtil.l(BaseApplication.b()) || Utils.o();
    }

    public static boolean o() {
        return !s() && !LoginInit.getInstance(BaseApplication.b()).isKidAccount() && p() && r();
    }

    private static boolean r() {
        return !Utils.k();
    }

    private static boolean p() {
        boolean zBu = CommonUtil.bu();
        boolean zCa = CommonUtil.ca();
        ReleaseLogUtil.c("Track_SportSupportUtil", "isSupportGolfConfig isReleaseVersion = ", Boolean.valueOf(zBu), ", isDemoVersion = ", Boolean.valueOf(zCa));
        if (!zBu && !zCa) {
            return true;
        }
        String strD = lon.c().d("support_golf_tab");
        ReleaseLogUtil.c("Track_SportSupportUtil", "isSupportGolfConfig supportValue = ", strD);
        return "true".equals(strD);
    }

    public static boolean d(MotionPathSimplify motionPathSimplify) {
        return motionPathSimplify != null && 1 == motionPathSimplify.getExtendDataInt("extra_Sport_Type");
    }

    private static boolean s() {
        return EnvironmentInfo.m();
    }

    public static void c(final String str, final UiCallback<String> uiCallback) {
        if (str == null) {
            LogUtil.j("Track_SportSupportUtil", "getCoachGenderFromDb key == null");
            return;
        }
        if (uiCallback == null) {
            LogUtil.j("Track_SportSupportUtil", "getCoachGenderFromDb callback == null");
        } else if (ied.c()) {
            uiCallback.onSuccess(String.valueOf(0));
        } else {
            lsy.a(new Runnable() { // from class: han
                @Override // java.lang.Runnable
                public final void run() {
                    SportSupportUtil.e(str, uiCallback);
                }
            });
        }
    }

    public static /* synthetic */ void e(String str, UiCallback uiCallback) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference(str);
        if (userPreference == null) {
            uiCallback.onFailure(0, "getCoachGenderFromDb userPreference is null");
        } else if (TextUtils.isEmpty(userPreference.getValue())) {
            uiCallback.onFailure(0, "getCoachGenderFromDb userinfo is null");
        } else {
            uiCallback.onSuccess(userPreference.getValue());
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("expires")
        private long f8806a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("value")
        private String f8807c;

        public a(String str, long j) {
            this.f8807c = str;
            this.f8806a = j;
        }

        public String d() {
            return this.f8807c;
        }

        public boolean c() {
            return this.f8806a > System.currentTimeMillis();
        }
    }

    public static String b(final String str, String str2, String str3) {
        final StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("Track_SportSupportUtil", "deviceIdListStr is null in getShareLocalDevice");
            return sb.toString();
        }
        final ArrayList<String> arrayListC = c(str2);
        if (njy.e(arrayListC)) {
            LogUtil.j("Track_SportSupportUtil", "No local connected device in getShareLocalDevice");
            return sb.toString();
        }
        final ArrayList<String> arrayListC2 = c(str3);
        final Context context = com.huawei.hwcommonmodel.application.BaseApplication.getContext();
        final String str4 = " | ";
        IntStream.range(0, arrayListC.size()).mapToObj(new IntFunction() { // from class: ham
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return SportSupportUtil.a(i, (ArrayList<String>) arrayListC2, (ArrayList<String>) arrayListC);
            }
        }).sorted(new Comparator() { // from class: hal
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SportSupportUtil.c(str, (String) ((Pair) obj).first, (String) ((Pair) obj2).first);
            }
        }).forEach(new Consumer() { // from class: hao
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                SportSupportUtil.a(str, context, sb, str4, (Pair) obj);
            }
        });
        int length = sb.length() - 3;
        if (length >= 0 && " | ".equals(sb.substring(length))) {
            return sb.substring(0, length);
        }
        LogUtil.j("Track_SportSupportUtil", "The local connected device to show is ", sb.toString());
        return sb.toString();
    }

    public static /* synthetic */ void a(String str, Context context, StringBuilder sb, String str2, Pair pair) {
        String strB;
        if (str.equals("deviceId")) {
            if (!StringUtils.a((String) pair.first)) {
                return;
            } else {
                strB = een.b(Integer.parseInt((String) pair.first), context, context.getPackageName(), "", (String) pair.second);
            }
        } else if (StringUtils.g((String) pair.first)) {
            return;
        } else {
            strB = een.b(0, context, context.getPackageName(), (String) pair.first, (String) pair.second);
        }
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        sb.append(strB);
        sb.append(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pair<String, String> a(int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (i < arrayList.size()) {
            return new Pair<>(arrayList2.get(i), arrayList.get(i));
        }
        return new Pair<>(arrayList2.get(i), "");
    }

    private static ArrayList<String> c(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            arrayList = (ArrayList) qqt.c(str, new TypeToken<ArrayList<String>>() { // from class: com.huawei.health.sport.utils.SportSupportUtil.1
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("Track_SportSupportUtil", "getShareDevice json syntax exception: ", str);
        }
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(String str, String str2, String str3) {
        String strB = b(str, str2);
        String strB2 = b(str, str3);
        if ("06D".equals(strB) || "A12".equals(strB2)) {
            return -1;
        }
        return ("A12".equals(strB) || "06D".equals(strB2)) ? 1 : 0;
    }

    private static String b(String str, String str2) {
        List<ProductMapInfo> listC = ProductMap.c(str, str2);
        if (njy.b(listC)) {
            return listC.get(0).e();
        }
        return "";
    }

    public static int a(int i, int i2) {
        if (i2 == 46) {
            return R.drawable.track_share_short_ic_huaweiwatch_1;
        }
        if (i2 == 41) {
            return R.drawable.track_share_short_ic_ertongwatch;
        }
        if (i == 3 || i == 4) {
            return R.drawable.track_share_short_ic_hshouhuan;
        }
        if (i == 5) {
            return R.drawable.track_share_short_ic_huaweiwatch_1;
        }
        if (i != 6) {
            return 0;
        }
        return R.drawable.track_share_short_ic_erji;
    }
}

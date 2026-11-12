package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.core.content.ContextCompat;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basichealthmodel.HealthModelH5ProService;
import com.huawei.basichealthmodel.bean.ConfigBean;
import com.huawei.basichealthmodel.bean.TaskConfigBean;
import com.huawei.basichealthmodel.devicelink.bean.TaskBean;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.healthlife.constant.WearTaskEnum;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessCommon;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.openservice.OpenServiceUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes.dex */
public class cbg {
    private static final int[] f = {R.drawable.health_life_icon_task_step, R.drawable.health_life_icon_task_intensity, R.drawable.health_life_icon_task_workout, R.drawable.health_life_icon_task_breath, R.drawable.health_life_icon_task_wake_up, R.drawable.health_life_icon_task_sleep, R.drawable.health_life_icon_task_smile, R.drawable.health_life_icon_task_mindfulness, R.drawable.health_life_icon_task_drink_water, R.drawable.health_life_icon_task_medicine, R.drawable.health_life_icon_task_blood_pressure, R.drawable.health_life_icon_task_diet, R.drawable.health_life_icon_task_weight};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1423b = {com.huawei.basichealthmodel.R.color.health_life_task_step, com.huawei.basichealthmodel.R.color.health_life_task_intensity, com.huawei.basichealthmodel.R.color.health_life_task_workout, com.huawei.basichealthmodel.R.color.health_life_task_breath, com.huawei.basichealthmodel.R.color.health_life_task_wake_up, com.huawei.basichealthmodel.R.color.health_life_task_sleep, com.huawei.basichealthmodel.R.color.health_life_task_smile, com.huawei.basichealthmodel.R.color.health_life_task_mindfulness, com.huawei.basichealthmodel.R.color.health_life_task_drink_water, com.huawei.basichealthmodel.R.color.health_life_task_medicine, com.huawei.basichealthmodel.R.color.health_life_task_blood_pressure, com.huawei.basichealthmodel.R.color.health_life_task_diet, com.huawei.basichealthmodel.R.color.health_life_task_weight};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f1422a = {com.huawei.basichealthmodel.R.color.health_life_task_background_step, com.huawei.basichealthmodel.R.color.health_life_task_background_intensity, com.huawei.basichealthmodel.R.color.health_life_task_background_workout, com.huawei.basichealthmodel.R.color.health_life_task_background_breath, com.huawei.basichealthmodel.R.color.health_life_task_background_wake_up, com.huawei.basichealthmodel.R.color.health_life_task_background_sleep, com.huawei.basichealthmodel.R.color.health_life_task_background_smile, com.huawei.basichealthmodel.R.color.health_life_task_background_mindfulness, com.huawei.basichealthmodel.R.color.health_life_task_background_drink_water, com.huawei.basichealthmodel.R.color.health_life_task_background_medicine, com.huawei.basichealthmodel.R.color.health_life_task_background_blood_pressure, com.huawei.basichealthmodel.R.color.health_life_task_background_diet, com.huawei.basichealthmodel.R.color.health_life_task_background_weight};
    private static final int[] i = {70200, 63000, 63001, 54000, 25200, 82800, 36000, 79200, FitnessCommon.GTM_800_OFFSET_IN_SECOND, 28801, 25201, 30600, 32400};
    private static final int[] d = {47101, 47102, 47103, 47104, 47105, 47107, 47108, 47109};
    private static final String[] e = {"TOTAL", OpenServiceUtil.Location.STEP, "RUN", "CYCLE", "FITNESS", "CLIMB", "SWIM", "UNKNOWHIGH"};
    private static final int[] g = {70200, 63000, 54000, 25200, 82800, FitnessCommon.GTM_800_OFFSET_IN_SECOND, 28801, 25201, 32400, 82815, 82816, 82817, 82818, 82818};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f1424c = {0.0f, 0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f};
    private static SparseIntArray l = new SparseIntArray();
    private static SparseIntArray o = new SparseIntArray();
    private static SparseIntArray h = new SparseIntArray();
    private static SparseIntArray j = new SparseIntArray();

    private static boolean b(int i2, int i3, int i4, int i5) {
        if (i2 >= 0 && i3 >= 0 && i4 > 0) {
            if (i2 == 0 && i3 == 0) {
                return true;
            }
            if (i2 == 0) {
                return i5 <= 0 && i3 >= i4;
            }
            if (i3 == 0) {
                boolean z = i2 <= i4;
                if (i5 <= 0) {
                    return z;
                }
                return z && i2 > i5;
            }
            boolean z2 = i4 >= i2 && i4 <= i3;
            if (i5 <= 0) {
                return z2;
            }
            if (z2 && ((i5 < i2 || i5 > i3) && i2 > i5)) {
                return true;
            }
        }
        return false;
    }

    private static int e(long j2, long j3, long j4) {
        if (j2 < j3) {
            return 0;
        }
        return j2 > j4 ? 2 : 1;
    }

    public static boolean i(int i2) {
        return i2 == 6 || i2 == 7;
    }

    public static void b(CountDownLatch countDownLatch, String str) {
        if (countDownLatch == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "setCountDownLatchAwait countDownLatch is null");
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            LogUtil.j("HL_BasicHealthModelUtils", "setCountDownLatchAwait tag ", str, " interruptedException ", LogAnonymous.b(e2));
        }
    }

    public static void b(ThreadPoolManager threadPoolManager, Runnable runnable) {
        if (threadPoolManager == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "restartExecute threadPoolManager is null");
        } else {
            threadPoolManager.e(runnable);
            threadPoolManager.execute(runnable);
        }
    }

    public static void c(ThreadPoolManager threadPoolManager, String str, Runnable runnable) {
        if (threadPoolManager == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "restartTagExecute threadPoolManager is null");
        } else if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_BasicHealthModelUtils", "restartTagExecute tag is empty");
            b(threadPoolManager, runnable);
        } else {
            threadPoolManager.d(str, (Runnable) null);
            threadPoolManager.a(str, runnable);
        }
    }

    public static boolean f(String str) {
        File file;
        if (!TextUtils.isEmpty(str) && (file = FileUtils.getFile(str)) != null && file.exists()) {
            try {
                if (!xjl.a(file, new File(phs.d).getCanonicalPath())) {
                    LogUtil.j("HL_BasicHealthModelUtils", "isInvalidFile isValidFile false path ", str);
                    return true;
                }
                if (!file.isDirectory()) {
                    return file.length() <= 0;
                }
                File[] fileArrListFiles = file.listFiles();
                return fileArrListFiles == null || fileArrListFiles.length <= 0;
            } catch (IOException e2) {
                ReleaseLogUtil.b("HL_BasicHealthModelUtils", "isInvalidFile exception ", ExceptionUtils.c(e2));
            }
        }
        return true;
    }

    public static void d(Handler handler, int i2) {
        d(handler, i2, (Object) null);
    }

    public static void d(Handler handler, int i2, Object obj) {
        if (handler == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "sendMessage handler is null");
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i2;
        if (obj != null) {
            messageObtainMessage.obj = obj;
        }
        handler.sendMessage(messageObtainMessage);
    }

    public static void a(Handler handler, int i2, Bundle bundle) {
        if (handler == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "sendMessageWithBundle handler is null");
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i2;
        if (bundle != null) {
            messageObtainMessage.setData(bundle);
        }
        handler.sendMessage(messageObtainMessage);
    }

    public static void d(HealthTextView healthTextView, int i2, float f2) {
        if (healthTextView == null) {
            ReleaseLogUtil.d("HL_BasicHealthModelUtils", "setTextSize textView is null dimensionResourcesId ", Integer.valueOf(i2), " zoomFactor ", Float.valueOf(f2));
        } else {
            healthTextView.setZoomSize(i2, f2);
        }
    }

    public static boolean aa() {
        long jI = CommonUtils.i(ao());
        return jI <= 0 || DateFormatUtil.a(System.currentTimeMillis()) != DateFormatUtil.a(jI);
    }

    private static String ao() {
        String strG = ccy.g(Utils.o() ? "health_model_plugin_time_oversea" : "health_model_plugin_time");
        LogUtil.a("HL_BasicHealthModelUtils", "getPluginTime pluginTime ", strG);
        return strG;
    }

    public static void d(long j2) {
        ccy.c(Utils.o() ? "health_model_plugin_time_oversea" : "health_model_plugin_time", String.valueOf(j2));
        LogUtil.a("HL_BasicHealthModelUtils", "setPluginTime time ", Long.valueOf(j2));
    }

    public static boolean ae() {
        return String.valueOf(true).equals(ccy.c("is_support_health_model_new"));
    }

    public static boolean ai() {
        HiUserPreference hiUserPreferenceD = d("health_model_is_support_health_model_new");
        if (hiUserPreferenceD == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "isUseNewHealthModel hiUserPreference is null");
            an();
            return false;
        }
        String value = hiUserPreferenceD.getValue();
        boolean z = CommonUtils.j(value) > 30000001;
        ccy.d("is_support_health_model_new", String.valueOf(z));
        LogUtil.a("HL_BasicHealthModelUtils", "isUseNewHealthModel value ", value, " HandlerExecutor.isMainTread() ", Boolean.valueOf(HandlerExecutor.c()));
        if (!z) {
            an();
        }
        return z;
    }

    public static void an() {
        if (HandlerExecutor.c()) {
            b(ThreadPoolManager.c(), new Runnable() { // from class: cbm
                @Override // java.lang.Runnable
                public final void run() {
                    cbg.an();
                }
            });
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("health_model_is_support_health_model_new");
        hiUserPreference.setValue(String.valueOf(30000001));
        LogUtil.a("HL_BasicHealthModelUtils", "setHealthModelVersion isSuccess ", Boolean.valueOf(HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference)));
    }

    public static boolean x() {
        String strC = ccy.c("health_model_is_agree_protocol");
        LogUtil.a("HL_BasicHealthModelUtils", "isAgreeProtocolForSharedPreference data ", strC);
        return String.valueOf(true).equals(strC);
    }

    public static HiUserPreference d(String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        List<HiUserPreference> userPreferenceList = HiHealthManager.d(BaseApplication.b()).getUserPreferenceList(arrayList);
        if (njy.e(userPreferenceList)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getHiUserPreference hiUserPreferenceList is empty");
            return null;
        }
        return userPreferenceList.get(0);
    }

    public static void ak() {
        if (HandlerExecutor.c()) {
            b(ThreadPoolManager.c(), new Runnable() { // from class: cbp
                @Override // java.lang.Runnable
                public final void run() {
                    cbg.ak();
                }
            });
            return;
        }
        if (y()) {
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("health_model_is_agree_protocol");
        hiUserPreference.setValue(String.valueOf(true));
        boolean userPreference = HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
        ccy.d("health_model_is_agree_protocol", String.valueOf(true));
        LogUtil.a("HL_BasicHealthModelUtils", "setAgreeProtocol isSuccess ", Boolean.valueOf(userPreference));
        al();
    }

    public static boolean y() {
        HiUserPreference hiUserPreferenceD = d("health_model_is_agree_protocol");
        if (hiUserPreferenceD == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "isAgreeUserProtocol hiUserPreference is null");
            return false;
        }
        String value = hiUserPreferenceD.getValue();
        boolean z = !TextUtils.isEmpty(value);
        ccy.d("health_model_is_agree_protocol", String.valueOf(z));
        LogUtil.a("HL_BasicHealthModelUtils", "isAgreeUserProtocol value ", value);
        return z;
    }

    public static void al() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10026);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
    }

    @Deprecated
    public static String q() {
        return lua.d();
    }

    public static boolean h(HealthLifeBean healthLifeBean) {
        return healthLifeBean != null && healthLifeBean.getId() > 0;
    }

    public static boolean ac() {
        int iR = r();
        return iR > 0 && DateFormatUtil.a(System.currentTimeMillis()) >= iR;
    }

    public static String j() {
        String strC = ccy.c("health_model_join_time");
        LogUtil.a("HL_BasicHealthModelUtils", "getJoinTime joinTime ", strC);
        return strC;
    }

    public static boolean ah() {
        int iW = w();
        return iW > 0 && DateFormatUtil.a(System.currentTimeMillis()) >= iW;
    }

    public static void m(int i2) {
        ccy.d("dataSource", String.valueOf(i2));
    }

    public static String h() {
        String strC = ccy.c("dataSource");
        LogUtil.a("HL_BasicHealthModelUtils", "getDataSource dataSource ", strC);
        return strC;
    }

    public static boolean z() {
        return CommonUtils.j(h()) == 1;
    }

    public static int k() {
        if (z()) {
            return 1;
        }
        return CommonUtils.j(ccy.c("health_model_challenge_id"));
    }

    public static boolean ab() {
        boolean z = z();
        int iJ = CommonUtils.j(ccy.c("health_model_challenge_id"));
        boolean z2 = iJ > 200001;
        LogUtil.a("HL_BasicHealthModelUtils", "isGenerateWeekReport isDoctorPlan=", Boolean.valueOf(z), ",planId=", Integer.valueOf(iJ));
        return z || z2;
    }

    public static void b(boolean z) {
        ccy.d("isSubscribeBloodPressure", String.valueOf(z));
    }

    public static boolean af() {
        return String.valueOf(true).equals(ccy.c("isSubscribeBloodPressure"));
    }

    public static int w() {
        return ccy.d();
    }

    public static int r() {
        return ccy.c();
    }

    private static int e(double d2, int i2) {
        if (i2 > -1) {
            return i2;
        }
        double d3 = UnitUtil.d(d2, 2);
        if (d3 - UnitUtil.d(d2, 0) == 0.0d) {
            return 0;
        }
        return d3 - UnitUtil.d(d2, 1) == 0.0d ? 1 : 2;
    }

    public static double d(double d2, int i2) {
        return UnitUtil.d(d2, e(d2, i2));
    }

    public static String d(double d2, int i2, int i3) {
        String strE = UnitUtil.e(d(d2, i3), i2, e(d2, i3));
        return i2 == 2 ? b(strE) : strE;
    }

    public static String b(String str) {
        Context contextB = BaseApplication.b();
        if (!LanguageUtil.x(contextB) && !LanguageUtil.br(contextB)) {
            return str;
        }
        return "\u200f" + str;
    }

    public static boolean a(String str, int i2) {
        return e(str, i2, -1);
    }

    public static boolean e(String str, int i2, int i3) {
        int[] iArrH = h(str);
        int length = iArrH.length;
        if (length <= 0) {
            return false;
        }
        if (length == 1) {
            int i4 = iArrH[0];
            if (i4 < 0) {
                return false;
            }
            return i4 == 0 || i4 == i2;
        }
        return b(iArrH[0], iArrH[1], i2, i3);
    }

    private static int[] h(String str) {
        if (TextUtils.isEmpty(str)) {
            return new int[]{0};
        }
        String[] strArrSplit = str.split(Constants.LINK);
        int length = strArrSplit.length;
        if (length == 0) {
            return new int[]{0};
        }
        if (length == 1) {
            return new int[]{g(strArrSplit[0])};
        }
        return new int[]{g(strArrSplit[0]), g(strArrSplit[1])};
    }

    private static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Math.max(0, Math.abs(Integer.parseInt(str)));
        } catch (NumberFormatException e2) {
            LogUtil.e("HL_BasicHealthModelUtils", "getVersion NumberFormatException ", LogAnonymous.b(e2));
            return -1;
        }
    }

    public static ArrayList<Integer> a() {
        return ffv.b(com.huawei.basichealthmodel.R.array.blood_pressure_plan);
    }

    public static boolean v() {
        return a().contains(Integer.valueOf(CommonUtil.j(ccy.c("health_model_challenge_id"))));
    }

    public static Calendar s() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static long c(int i2, int i3) {
        Calendar calendarS = s();
        calendarS.set(11, i2);
        calendarS.set(12, i3);
        return calendarS.getTimeInMillis();
    }

    public static List<Integer> j(int i2) {
        int iA;
        long[] jArrB = lsl.b(DateFormatUtil.d(i2), TimeZone.getDefault(), 1, 0);
        long jW = jArrB[0];
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(DateFormatUtil.a(jW)));
        int iA2 = DateFormatUtil.a(jArrB[1]);
        for (int i3 = 0; i3 < 5 && (iA = DateFormatUtil.a((jW = lsl.w(jW)))) < iA2; i3++) {
            arrayList.add(Integer.valueOf(iA));
        }
        arrayList.add(Integer.valueOf(iA2));
        return arrayList;
    }

    public static void b(String str, String str2, HiAggregateListener hiAggregateListener) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(str, str2, HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(d);
        hiAggregateOption.setConstantsKey(e);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(1);
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, hiAggregateListener);
    }

    public static int a(HiHealthData hiHealthData) {
        double d2;
        if (hiHealthData == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "getIntensityStatus hiHealthData is null");
            return -1;
        }
        int i2 = hiHealthData.getInt("TOTAL");
        if (i2 <= 0) {
            return 0;
        }
        double d3 = hiHealthData.getInt("RUN");
        double d4 = hiHealthData.getInt(OpenServiceUtil.Location.STEP);
        double d5 = hiHealthData.getInt("CYCLE");
        double d6 = hiHealthData.getInt("FITNESS");
        double d7 = hiHealthData.getInt("SWIM") + hiHealthData.getInt("CLIMB") + hiHealthData.getInt("UNKNOWHIGH");
        double d8 = d3 + d4 + d5 + d6 + d7;
        double d9 = i2;
        if (d9 > d8) {
            d2 = d9 - d8;
            d8 = d9;
        } else {
            d2 = 0.0d;
        }
        double dA = a(d3, d8);
        double dA2 = a(d5, d8);
        double dA3 = a(d6, d8);
        double dA4 = a(d7 + d2, d8);
        double d10 = dA + dA2 + dA3 + dA4;
        if (d10 > 100.0d) {
            double d11 = d10 - 100.0d;
            if (Double.compare(dA, dA2) >= 0 && Double.compare(dA, dA3) >= 0 && Double.compare(dA, dA4) >= 0) {
                dA -= d11;
            } else if (Double.compare(dA3, dA) >= 0 && Double.compare(dA3, dA2) >= 0 && Double.compare(dA3, dA4) >= 0) {
                dA3 -= d11;
            } else if (Double.compare(dA2, dA) >= 0 && Double.compare(dA2, dA3) >= 0 && Double.compare(dA2, dA4) >= 0) {
                dA2 -= d11;
            } else if (Double.compare(dA4, dA) < 0 || Double.compare(dA4, dA2) < 0 || Double.compare(dA4, dA3) < 0) {
                LogUtil.d("HL_BasicHealthModelUtils", "getIntensityStatus run ", Double.valueOf(dA), " cycle ", Double.valueOf(dA2), " fitness ", Double.valueOf(dA3), " other ", Double.valueOf(dA4));
            } else {
                dA4 -= d11;
            }
        }
        double dRound = Math.round((d4 / d8) * 100.0d);
        if (d4 > 0.0d) {
            dRound = (((100.0d - dA) - dA2) - dA3) - dA4;
        }
        if (dRound < 0.0d) {
            dRound = 0.0d;
        }
        return ((int) d(dA, 0)) + ((int) d(dRound, 0)) >= (((int) d(dA2, 0)) + ((int) d(dA3, 0))) + ((int) d(dA4, 0)) ? 300 : 301;
    }

    private static double a(double d2, double d3) {
        double dRound = Math.round((d2 / d3) * 100.0d);
        if (dRound >= 1.0d || d2 <= 0.0d) {
            return dRound;
        }
        return 1.0d;
    }

    public static boolean ad() {
        return b(0L);
    }

    public static boolean b(long j2) {
        String strC = ccy.c("blood_pressure_day_of_week");
        String binaryString = Integer.toBinaryString(CommonUtil.j(strC));
        LogUtil.a("HL_BasicHealthModelUtils", "isBloodPressureRest doyOfWeek ", strC, " binary ", binaryString);
        if (TextUtils.isEmpty(binaryString)) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        if (j2 != 0) {
            calendar.setTimeInMillis(j2);
        }
        int i2 = calendar.get(7);
        String str = String.format(Locale.ENGLISH, "%07d", Integer.valueOf(CommonUtil.j(binaryString)));
        if (i2 == 1) {
            i2 = 8;
        }
        int i3 = i2 - 1;
        char cCharAt = str.charAt(str.length() - i3);
        LogUtil.a("HL_BasicHealthModelUtils", "isBloodPressureRest time ", Long.valueOf(j2), " dayOfWeek ", str, " currentDayOfWeek ", Integer.valueOf(i3), " charAt ", Character.valueOf(cCharAt));
        return cCharAt != '1';
    }

    public static void e(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("HL_BasicHealthModelUtils", "jumpH5App context ", context, " h5PackageName ", str);
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.setImmerse().showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        if (!TextUtils.isEmpty(str2)) {
            builder.addPath(str2);
        }
        ddv.b().loadH5ProApp(context, str, builder);
    }

    public static void d(Context context, long j2, long j3) {
        String str;
        if (j2 != 0 && j3 != 0) {
            str = "#/sleepDataInput?pullFrom=2&bedTime=" + j2 + "&risingTime=" + j3;
        } else {
            str = "#/sleepDataInput?pullFrom=2";
        }
        ddv.b().initH5Pro();
        H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.sleepdetection", new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("SleepDetection", pjo.b().getJsModule()).addPath(str).setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(1).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final String str, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        if (HandlerExecutor.c()) {
            b(ThreadPoolManager.c(), new Runnable() { // from class: cbo
                @Override // java.lang.Runnable
                public final void run() {
                    cbg.c(str, str2, iBaseResponseCallback);
                }
            });
            return;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "getUserSampleConfigList callback is null");
        } else if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("HL_BasicHealthModelUtils", "getUserSampleConfigList isNetworkConnected false");
            iBaseResponseCallback.a(-1, null);
        } else {
            LogUtil.a("HL_BasicHealthModelUtils", "getUserSampleConfigList type ", str, " id ", str2);
            bwk.d().e(str, str2, iBaseResponseCallback);
        }
    }

    private static List<dfl> ap() {
        String strC = ccy.c("bloodPressureMeasurePlan");
        LogUtil.a("HL_BasicHealthModelUtils", "getBloodPressureAlarmInfoListForLocal value ", strC);
        if (TextUtils.isEmpty(strC)) {
            List<dfl> listAm = am();
            ArrayList arrayList = new ArrayList();
            if (njy.b(listAm)) {
                arrayList.addAll(listAm);
                e((dfl) arrayList.get(0));
            }
            if (njy.e(arrayList)) {
                LogUtil.j("HL_BasicHealthModelUtils", "getBloodPressureAlarmInfoListForLocal bloodPressureAlarmInfoList ", arrayList);
                arrayList.addAll(g());
            }
            return arrayList;
        }
        return a(strC);
    }

    public static List<dfl> d() {
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("HL_BasicHealthModelUtils", "getBloodPressureAlarmInfoList isNetworkConnected false");
            return ap();
        }
        final ArrayList arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        c(MatterDataContans.TYPE_HEALTH, "900300001", new IBaseResponseCallback() { // from class: cbh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                cbg.b(arrayList, countDownLatch, i2, obj);
            }
        });
        b(countDownLatch, "getBloodPressureAlarmInfoList");
        return arrayList;
    }

    static /* synthetic */ void b(List list, CountDownLatch countDownLatch, int i2, Object obj) {
        String strB;
        LogUtil.a("HL_BasicHealthModelUtils", "getBloodPressureAlarmInfoList errorCode ", Integer.valueOf(i2), " object ", obj);
        if (i2 != 0 || !njy.b(obj, fez.class)) {
            list.addAll(ap());
            countDownLatch.countDown();
            return;
        }
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                strB = "";
                break;
            }
            fez fezVar = (fez) it.next();
            if (fezVar != null && !TextUtils.isEmpty(fezVar.b())) {
                strB = fezVar.b();
                break;
            }
        }
        if (TextUtils.isEmpty(strB)) {
            list.addAll(ap());
            countDownLatch.countDown();
            return;
        }
        list.addAll(dfp.d((dfm) HiJsonUtil.d(strB, dfm.class)));
        if (njy.e(list)) {
            list.addAll(ap());
            countDownLatch.countDown();
        } else {
            e((List<dfl>) list);
            e((dfl) list.get(0));
            countDownLatch.countDown();
        }
    }

    public static void e(dfl dflVar) {
        if (dflVar == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "setBloodPressureAlarmInfoDaysOfWeek bloodPressureAlarmInfo is null");
        } else {
            ccy.d("blood_pressure_day_of_week", String.valueOf(dflVar.a()));
        }
    }

    public static List<dfl> a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getBloodPressureAlarmInfoList json ", str);
            return new ArrayList();
        }
        List<dfl> arrayList = new ArrayList<>();
        try {
            arrayList = (List) HiJsonUtil.d(str, new TypeToken<List<dfl>>() { // from class: com.huawei.basichealthmodel.util.BasicHealthModelUtils$1
            }.getType());
        } catch (JsonParseException e2) {
            LogUtil.e("HL_BasicHealthModelUtils", "getBloodPressureAlarmInfoList JsonParseException ", LogAnonymous.b(e2));
        }
        e(arrayList);
        LogUtil.a("HL_BasicHealthModelUtils", "getBloodPressureAlarmInfoList list ", arrayList);
        return arrayList;
    }

    public static void e(List<dfl> list) {
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "compare list is empty");
        } else {
            Collections.sort(list, new Comparator() { // from class: cbu
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return cbg.e((dfl) obj, (dfl) obj2);
                }
            });
        }
    }

    static /* synthetic */ int e(dfl dflVar, dfl dflVar2) {
        if (dflVar == null || dflVar2 == null) {
            return 0;
        }
        int iC = dflVar.c();
        int iC2 = dflVar2.c();
        if (iC == iC2) {
            return dflVar.e() - dflVar2.e();
        }
        if ((iC > 2 && iC2 > 2) || (iC < 2 && iC2 < 2)) {
            return iC - iC2;
        }
        if (iC < 2) {
            return 1;
        }
        return iC2 < 2 ? -1 : 0;
    }

    private static List<dfl> am() {
        HiUserPreference hiUserPreferenceD = d("BloodPressureMeasurePlan");
        if (hiUserPreferenceD == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "getBloodPressureAlarmInfoListForHiUserPreference preference is null");
            return new ArrayList();
        }
        return a(hiUserPreferenceD.getValue());
    }

    public static List<dfl> g() {
        ArrayList arrayList = new ArrayList();
        dfl dflVar = new dfl(0, 7, 0, 0);
        dflVar.b(false);
        dflVar.b(127);
        arrayList.add(dflVar);
        dfl dflVar2 = new dfl(9, 22, 0, 9);
        dflVar2.b(false);
        dflVar2.b(127);
        arrayList.add(dflVar2);
        e(dflVar);
        LogUtil.a("HL_BasicHealthModelUtils", "getDefaultBloodPlan bloodPressureAlarmInfoList ", arrayList);
        return arrayList;
    }

    public static boolean h(int i2) {
        if (Boolean.TRUE.toString().equals(ccy.c("is_exist_reward_clover"))) {
            LogUtil.a("HL_BasicHealthModelUtils", "isNeedRewardClover IS_EXIST_REWARD_CLOVER");
            return false;
        }
        if (z()) {
            LogUtil.a("HL_BasicHealthModelUtils", "isNeedRewardClover isDoctorPlan");
            return false;
        }
        boolean z = CommonUtils.j(ccy.c("health_model_challenge_join")) > 0;
        boolean z2 = CommonUtils.j(ccy.c("health_model_challenge_id")) >= 200001;
        if (z && z2) {
            LogUtil.a("HL_BasicHealthModelUtils", "isNeedRewardClover isJoinChallenge");
            return false;
        }
        boolean z3 = bxc.d(r(), i2, 1) > 0;
        ccy.d("is_exist_reward_clover", String.valueOf(z3));
        LogUtil.a("HL_BasicHealthModelUtils", "isNeedRewardClover isExistRewardClover = ", Boolean.valueOf(z3));
        return !z3;
    }

    public static boolean b(int i2) {
        ArrayList<Integer> arrayListJ = ffv.j();
        if (njy.e(arrayListJ)) {
            LogUtil.j("HL_BasicHealthModelUtils", "checkSupportForTaskId taskIdList is empty");
            return false;
        }
        return arrayListJ.contains(Integer.valueOf(i2));
    }

    public static long e(long j2, String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getTimeMillisForTimeAndOffsetMinute time is empty");
            return 0L;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length <= 1) {
            LogUtil.j("HL_BasicHealthModelUtils", "getTimeMillisForTimeAndOffsetMinute length is default min time length");
            return 0L;
        }
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            calendar.set(11, Integer.parseInt(strArrSplit[0]));
            calendar.set(12, Integer.parseInt(strArrSplit[1]) + i2);
            return calendar.getTimeInMillis();
        } catch (NumberFormatException unused) {
            LogUtil.e("HL_BasicHealthModelUtils", "getTimeMillisForTimeAndOffsetMinute NumberFormatException");
            return 0L;
        }
    }

    public static List<Integer> e(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList(2);
        }
        String[] strArrSplit = str.split(Constants.LINK);
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < Math.min(2, strArrSplit.length); i2++) {
            int iB = CommonUtil.b(BaseApplication.b(), strArrSplit[i2], -1);
            if (iB == -1) {
                return new ArrayList(2);
            }
            arrayList.add(Integer.valueOf(iB));
        }
        return arrayList;
    }

    public static Calendar i(String str) {
        Calendar calendarS = s();
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length >= 2) {
                calendarS.set(11, CommonUtil.j(strArrSplit[0]));
                calendarS.set(12, CommonUtil.j(strArrSplit[1]));
                return calendarS;
            }
        }
        return calendarS;
    }

    public static List<Calendar> c(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_BasicHealthModelUtils", "convertTimestampInterval timestampInterval is empty");
            return new ArrayList(2);
        }
        ArrayList arrayList = new ArrayList(2);
        if (str.contains(Constants.LINK)) {
            strArrSplit = str.split(Constants.LINK);
        } else {
            strArrSplit = str.split(",");
        }
        for (String str2 : strArrSplit) {
            long jF = qrs.f(str2);
            if (jF == 0) {
                LogUtil.j("HL_BasicHealthModelUtils", "convertTimestampInterval timestamp is invalid");
                return new ArrayList(2);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jF);
            arrayList.add(c(calendar));
        }
        return arrayList;
    }

    public static Calendar c(Calendar calendar) {
        if (calendar == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "setTodayDate calendar is null");
            return s();
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, calendar.get(11));
        calendar2.set(12, calendar.get(12));
        calendar2.set(13, calendar.get(13));
        calendar2.set(14, calendar.get(14));
        return calendar2;
    }

    public static void l(int i2) {
        ccy.d("health_life_last_sync_date", String.valueOf(i2));
    }

    public static void aj() {
        ccq.a("HL_BasicHealthModelUtils", (ResponseCallback<ffd>) new ResponseCallback() { // from class: cbr
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                cbg.a(i2, (ffd) obj);
            }
        });
    }

    static /* synthetic */ void a(int i2, ffd ffdVar) {
        LogUtil.a("HL_BasicHealthModelUtils", "setChallengeId errorCode ", Integer.valueOf(i2), " object ", ffdVar);
        if (ffdVar == null) {
            return;
        }
        ccy.d("health_model_challenge_id", String.valueOf(ffdVar.c()));
        ccy.d("health_model_current_challenge_join_time", String.valueOf(ffdVar.b()));
    }

    public static ArrayList<Integer> c() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListE = e();
        boolean zV = v();
        for (Integer num : arrayListE) {
            int iIntValue = num.intValue();
            if (!zV || iIntValue != 2) {
                if (zV || iIntValue != 3) {
                    arrayList.add(num);
                }
            }
        }
        LogUtil.a("HL_BasicHealthModelUtils", "getBasicTaskIdForChallenge source basicIdList ", arrayList.toString());
        return arrayList;
    }

    public static ArrayList<Integer> e() {
        return ffv.b(R.array.basic_task_id);
    }

    public static String e(HealthLifeBean healthLifeBean) {
        int iA;
        if (healthLifeBean == null) {
            return "";
        }
        int id = healthLifeBean.getId();
        boolean z = id == 6;
        boolean z2 = id == 7;
        if ((!z && !z2) || (iA = a(healthLifeBean)) == 0 || (iA == 2 && z2)) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        String strValueOf = String.valueOf(calendar.get(11));
        if (!TextUtils.isEmpty(strValueOf) && strValueOf.length() < 2) {
            strValueOf = "0" + strValueOf;
        }
        String strValueOf2 = String.valueOf(calendar.get(12));
        if (!TextUtils.isEmpty(strValueOf2) && strValueOf2.length() < 2) {
            strValueOf2 = "0" + strValueOf2;
        }
        return DateFormatUtil.a(System.currentTimeMillis()) + " " + strValueOf + ":" + strValueOf2;
    }

    public static int a(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            return 1;
        }
        int id = healthLifeBean.getId();
        String target = healthLifeBean.getTarget();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jE = e(jCurrentTimeMillis, target, 60);
        if (id == 6) {
            return e(jCurrentTimeMillis, e(jCurrentTimeMillis, target, -60), jE);
        }
        if (id != 7) {
            return 1;
        }
        int recordDay = healthLifeBean.getRecordDay();
        long jA = lsl.a(jCurrentTimeMillis, cfu.a(recordDay, target) < cfu.e(recordDay, 20, 0) ? 19 : 20, 0);
        long jR = lsl.r(jCurrentTimeMillis);
        long jC = lsl.c(jCurrentTimeMillis);
        long j2 = jC - jR;
        if (jE - jCurrentTimeMillis > j2) {
            LogUtil.a("HL_BasicHealthModelUtils", "getTimeLimit startTimeOfCurrentDay ", Long.valueOf(jR), " endTimeOfCurrentDay ", Long.valueOf(jC), " ondDayTimeMillis ", Long.valueOf(j2), " start ", Long.valueOf(jA), " end ", Long.valueOf(jE), " currentTimeMillis ", Long.valueOf(jCurrentTimeMillis));
            jE -= j2;
            jA -= j2;
        }
        return e(jCurrentTimeMillis, jA, jE);
    }

    public static void c(final int i2, final ResponseCallback<ffc> responseCallback) {
        if (HandlerExecutor.c()) {
            b(ThreadPoolManager.c(), new Runnable() { // from class: cbn
                @Override // java.lang.Runnable
                public final void run() {
                    cbg.c(i2, (ResponseCallback<ffc>) responseCallback);
                }
            });
            return;
        }
        if (responseCallback == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "queryWeekHealthReport callback is null");
            return;
        }
        if (!o(i2)) {
            responseCallback.onResponse(-1, null);
        } else if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("HL_BasicHealthModelUtils", "queryWeekHealthReport isNetworkConnected false");
            responseCallback.onResponse(-1, null);
        } else {
            LogUtil.a("HL_BasicHealthModelUtils", "queryWeekHealthReport startDate ", Integer.valueOf(i2));
            bwk.d().c(i2, new IBaseResponseCallback() { // from class: cbl
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i3, Object obj) {
                    cbg.a(responseCallback, i3, obj);
                }
            });
        }
    }

    static /* synthetic */ void a(ResponseCallback responseCallback, int i2, Object obj) {
        if (!(obj instanceof ffp)) {
            LogUtil.j("HL_BasicHealthModelUtils", "queryWeekHealthReport errorCode ", Integer.valueOf(i2), " object ", obj);
            responseCallback.onResponse(i2, null);
            return;
        }
        ffc ffcVarD = ((ffp) obj).d();
        if (ffcVarD == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "queryWeekHealthReport weekReport is null");
            responseCallback.onResponse(i2, null);
        } else {
            responseCallback.onResponse(i2, ffcVarD);
        }
    }

    private static boolean o(int i2) {
        int iR = r();
        if (iR <= 0) {
            return false;
        }
        int iA = DateFormatUtil.a(lsl.e(System.currentTimeMillis(), 1, 0));
        int iA2 = DateFormatUtil.a(lsl.e(DateFormatUtil.d(i2), 1, 0));
        LogUtil.a("HL_BasicHealthModelUtils", "isSupportQueryWeekHealthReport startDate ", Integer.valueOf(i2), " startDateOfWeek ", Integer.valueOf(iA2), " joinTime ", Integer.valueOf(iR), " currentStartDateOfWeek ", Integer.valueOf(iA));
        if (iA2 >= iA) {
            return false;
        }
        return iR <= iA2 || lsl.a(DateFormatUtil.d(iA2), DateFormatUtil.d(iR)) <= 3;
    }

    public static float c(List<HealthLifeBean> list, int i2, int i3) {
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getCloverScale list is empty");
            return 0.0f;
        }
        HealthLifeBean healthLifeBean = list.get(0);
        if (healthLifeBean == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "getCloverScale bean is null");
            return 0.0f;
        }
        if (i3 <= 0 || i3 > healthLifeBean.getRecordDay()) {
            return e(c(list, i2) / d(list, i2));
        }
        return a(g(list, i2), e(list, i2));
    }

    public static boolean e(List<HealthLifeBean> list, int i2) {
        int id;
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "isCompletedBasic list is empty");
            return false;
        }
        ArrayList<Integer> arrayListC = c(list);
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && healthLifeBean.getType() == i2 && (id = healthLifeBean.getId()) != 1 && id != 100001 && b(id) && arrayListC.contains(Integer.valueOf(id))) {
                if (healthLifeBean.getComplete() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList<Integer> c(List<HealthLifeBean> list) {
        ArrayList<Integer> arrayListE = e();
        ArrayList<Integer> arrayList = new ArrayList<>(3);
        if (njy.b(list)) {
            for (HealthLifeBean healthLifeBean : list) {
                if (healthLifeBean != null && healthLifeBean.getTaskType() == 1) {
                    int id = healthLifeBean.getId();
                    if (arrayListE.contains(Integer.valueOf(id))) {
                        arrayList.add(Integer.valueOf(id));
                    }
                }
            }
        }
        if (arrayList.size() != 3) {
            arrayList.clear();
            boolean zD = d(list);
            for (Integer num : arrayListE) {
                int iIntValue = num.intValue();
                if (!zD || iIntValue != 2) {
                    if (zD || iIntValue != 3) {
                        arrayList.add(num);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean d(List<HealthLifeBean> list) {
        HealthLifeBean healthLifeBean;
        boolean z = false;
        if (njy.e(list) || (healthLifeBean = list.get(0)) == null) {
            return false;
        }
        int recordDay = healthLifeBean.getRecordDay();
        int iJ = CommonUtils.j(ccy.c("health_model_current_challenge_join_time"));
        boolean zV = v();
        if (recordDay == DateFormatUtil.a(System.currentTimeMillis())) {
            z = zV;
        } else if (zV && iJ > 0 && recordDay >= iJ) {
            z = true;
        }
        if (z) {
            return true;
        }
        for (HealthLifeBean healthLifeBean2 : list) {
            if (healthLifeBean2 != null && healthLifeBean2.getId() == 2) {
                return z;
            }
        }
        return true;
    }

    public static float a(float f2, boolean z) {
        if (z) {
            return 1.0f;
        }
        return e(f2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    private static float g(List<HealthLifeBean> list, int i2) {
        boolean z;
        int iA;
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getStepScale list is empty");
            return 0.0f;
        }
        Iterator<HealthLifeBean> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            HealthLifeBean next = it.next();
            if (next != null && next.getType() == i2 && next.getTaskType() == 1) {
                LogUtil.a("HL_BasicHealthModelUtils", "getStepScale isBasicType bean ", next.toString());
                z = true;
                break;
            }
        }
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                if (z) {
                    if (healthLifeBean.getType() == i2 && healthLifeBean.getTaskType() == 1) {
                        LogUtil.a("HL_BasicHealthModelUtils", "getStepScale bean ", healthLifeBean.toString());
                        if (healthLifeBean.getComplete() > 0) {
                            return 1.0f;
                        }
                        iA = qrs.a(healthLifeBean.getTarget());
                        if (iA <= 0) {
                            return 0.0f;
                        }
                        return qrs.a(healthLifeBean.getResult()) / iA;
                    }
                } else if (healthLifeBean.getType() == i2 && healthLifeBean.getId() == 2) {
                    LogUtil.a("HL_BasicHealthModelUtils", "getStepScale bean ", healthLifeBean.toString());
                    if (healthLifeBean.getComplete() > 0) {
                        return 1.0f;
                    }
                    iA = qrs.a(healthLifeBean.getTarget());
                    if (iA <= 0) {
                        return 0.0f;
                    }
                    return qrs.a(healthLifeBean.getResult()) / iA;
                }
            }
        }
        return 0.0f;
    }

    public static int c(List<HealthLifeBean> list, int i2) {
        int id;
        int i3 = 0;
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getCompleted list is empty");
            return 0;
        }
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && healthLifeBean.getType() == i2 && (id = healthLifeBean.getId()) != 1 && id != 100001 && b(id) && healthLifeBean.getComplete() > 0) {
                i3++;
            }
        }
        return i3;
    }

    public static int d(List<HealthLifeBean> list, int i2) {
        int id;
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getTotal list is empty");
            return 1;
        }
        int i3 = 0;
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && (id = healthLifeBean.getId()) != 1 && id != 100001 && healthLifeBean.getType() == i2) {
                i3++;
            }
        }
        return Math.max(i3, 1);
    }

    public static float e(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        return (float) Math.min((Math.floor(f2 * 10.0f) * 0.06000000238418579d) + 0.4000000059604645d, 0.9100000262260437d);
    }

    public static float d(List<HealthLifeBean> list, int i2, int i3) {
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getCloverScaleToDevice list is empty");
            return 0.0f;
        }
        HealthLifeBean healthLifeBean = list.get(0);
        if (healthLifeBean == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "getCloverScaleToDevice bean is null");
            return 0.0f;
        }
        if (i3 <= 0 || i3 > healthLifeBean.getRecordDay()) {
            return e(c(list, i2) / d(list, i2));
        }
        if (j(list, i2)) {
            return 1.0f;
        }
        return h(list, i2);
    }

    public static boolean j(List<HealthLifeBean> list, int i2) {
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "isCompletedBasic list is empty");
            return false;
        }
        ArrayList<Integer> arrayListC = c(list);
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                int id = healthLifeBean.getId();
                boolean zContains = healthLifeBean.getTaskType() == 1;
                if (!zContains) {
                    zContains = arrayListC.contains(Integer.valueOf(id));
                }
                if (zContains && healthLifeBean.getType() == i2 && b(id)) {
                    if (healthLifeBean.getComplete() > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static float h(List<HealthLifeBean> list, int i2) {
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getActiveScale list is empty");
            return 0.0f;
        }
        ArrayList<Integer> arrayListC = c(list);
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                boolean zContains = healthLifeBean.getTaskType() == 1;
                if (!zContains) {
                    zContains = arrayListC.contains(Integer.valueOf(healthLifeBean.getId()));
                }
                if (zContains && healthLifeBean.getType() == i2) {
                    if (healthLifeBean.getComplete() > 0) {
                        return 1.0f;
                    }
                    return d(qrs.a(healthLifeBean.getTarget()), qrs.a(healthLifeBean.getResult()));
                }
            }
        }
        return 0.0f;
    }

    private static float d(int i2, int i3) {
        if (i3 <= 0) {
            return f1424c[0];
        }
        float f2 = i3;
        float f3 = i2 * 0.1f;
        if (f2 <= f3 - 1.0f) {
            return f1424c[1];
        }
        int i4 = 1;
        while (true) {
            float[] fArr = f1424c;
            if (i4 >= fArr.length - 1) {
                return fArr[fArr.length - 1];
            }
            if (f2 >= i4 * f3 && f2 <= ((i4 + 1) * f3) - 1.0f) {
                return fArr[i4];
            }
            i4++;
        }
    }

    public static String d(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "getTaskResultString bundle is null");
            return "";
        }
        int complete = healthLifeBean.getComplete();
        if (complete == 3) {
            return qre.f(R.string.IDS_makeup);
        }
        int id = healthLifeBean.getId();
        int recordDay = healthLifeBean.getRecordDay();
        String target = healthLifeBean.getTarget();
        if (recordDay <= 0 || ((!b(id) && !WearTaskEnum.isHasTaskId(id)) || TextUtils.isEmpty(target))) {
            LogUtil.j("HL_BasicHealthModelUtils", "getTaskResultString recordDay ", Integer.valueOf(recordDay), " id ", Integer.valueOf(id), " targetText ", target);
            return "";
        }
        String result = healthLifeBean.getResult();
        boolean zI = i(id);
        if (complete > 0 && !c(zI, recordDay, id, result, target)) {
            if (complete == 4) {
                return qre.f(com.huawei.basichealthmodel.R.string.IDS_rewards);
            }
            if (healthLifeBean.getRest() == 1) {
                return qre.f(com.huawei.basichealthmodel.R.string.IDS_relax);
            }
            LogUtil.j("HL_BasicHealthModelUtils", "getTaskResultString other status");
        }
        if (id == 19) {
            return c(result, target);
        }
        String strD = d(zI, result, id);
        if (id == 5 && ffv.c(healthLifeBean)) {
            return j(healthLifeBean);
        }
        if (id == 17) {
            double dG = qrs.g(target);
            return qre.e(com.huawei.basichealthmodel.R.plurals.IDS_h5_home_card_unit_DietCalories, (int) dG, strD, d(dG, 1, 0));
        }
        String strB = b(id, target);
        int i2 = com.huawei.basichealthmodel.R.string.IDS_splash_no_space;
        if ("--".equals(strB)) {
            strD = "--";
        }
        return qre.a(i2, strD, strB);
    }

    private static boolean c(boolean z, int i2, int i3, String str, String str2) {
        if (z) {
            return a(i2, i3, str, str2);
        }
        int iJ = CommonUtils.j(str2);
        return iJ > 0 && CommonUtils.j(str) >= iJ;
    }

    private static String c(String str, String str2) {
        String strE = UnitUtil.e(CommonUtils.j(str2), 1, 0);
        if (CommonUtils.j(str) <= 0) {
            return qre.a(com.huawei.basichealthmodel.R.string.IDS_h5_home_card_unit_StressAverage, "--", "", strE);
        }
        int iJ = CommonUtils.j(str);
        return qre.a(com.huawei.basichealthmodel.R.string.IDS_h5_home_card_unit_StressAverage, UnitUtil.e(iJ, 1, 0), k(iJ), strE);
    }

    public static String a(TaskBean taskBean, int i2) {
        if (taskBean == null) {
            return "";
        }
        if (taskBean.getTaskId() == 11 && TextUtils.isEmpty(taskBean.getTaskTarget())) {
            return qre.f(com.huawei.basichealthmodel.R.string.IDS_h5_home_optional_edit_tag);
        }
        HealthLifeBean healthLifeBean = new HealthLifeBean();
        healthLifeBean.setComplete(taskBean.getStatus());
        healthLifeBean.setId(taskBean.getTaskId());
        healthLifeBean.setRecordDay(i2);
        healthLifeBean.setTarget(taskBean.getTaskTarget());
        healthLifeBean.setResult(taskBean.getTaskValue());
        healthLifeBean.setRest(0);
        return d(healthLifeBean);
    }

    public static boolean i(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "hasCompletedForSlumber bean is null");
            return false;
        }
        return a(healthLifeBean.getRecordDay(), healthLifeBean.getId(), healthLifeBean.getResult(), healthLifeBean.getTarget());
    }

    private static boolean a(int i2, int i3, String str, String str2) {
        if (i2 <= 0 || !b(i3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("HL_BasicHealthModelUtils", "hasCompletedForSlumber recordDay ", Integer.valueOf(i2), " id ", Integer.valueOf(i3), " resultText ", str, " targetText ", str2);
            return false;
        }
        if (i3 == 6) {
            int iC = cfu.c(i2, str);
            int iA = cfu.a(i2, str2);
            LogUtil.a("HL_BasicHealthModelUtils", "hasCompletedForSlumber ID_TYPE_WAKE_UP result ", Integer.valueOf(iC), " target ", Integer.valueOf(iA));
            return Math.abs(iA - iC) <= 60;
        }
        if (i3 == 7) {
            int iC2 = cfu.c(i2, str);
            int iA2 = cfu.a(i2, str2);
            LogUtil.a("HL_BasicHealthModelUtils", "hasCompletedForSlumber ID_TYPE_SLEEP result ", Integer.valueOf(iC2), " target ", Integer.valueOf(iA2));
            if (iC2 <= iA2 + 60) {
                return true;
            }
        }
        return false;
    }

    private static String d(boolean z, String str, int i2) {
        if (z) {
            String strD = ffv.d(str);
            if (TextUtils.isEmpty(strD)) {
                return "--";
            }
            return qrk.a(BaseApplication.b(), i(strD).getTimeInMillis(), 1);
        }
        if (i2 == 10) {
            return d(Math.min(CommonUtils.a(str), 6000.0d) / 1000.0d, 1, -1);
        }
        if (i2 == 15) {
            return d(qrs.g(str) / 1000.0d, 1, 0);
        }
        if (i2 == 18) {
            if (CommonUtils.j(str) <= 0) {
                return "--";
            }
            return d((CommonUtils.a(str) / 60.0d) / 60.0d, 1, 1);
        }
        return d(CommonUtils.j(str), 1, -1);
    }

    private static String j(HealthLifeBean healthLifeBean) {
        int iC = ((grv) HiJsonUtil.d(healthLifeBean.getExtendInfo(), grv.class)).c();
        return qre.a(com.huawei.basichealthmodel.R.string.IDS_health_life_pressure_grade, Integer.valueOf(iC), k(iC));
    }

    private static String k(int i2) {
        if (i2 >= 1 && i2 <= 29) {
            return qre.f(R.string.IDS_hw_pressure_relaxed);
        }
        if (i2 > 29 && i2 < 60) {
            return qre.f(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_normal);
        }
        if (i2 >= 60 && i2 < 80) {
            return qre.f(com.huawei.basichealthmodel.R.string.IDS_health_life_grade_med);
        }
        return qre.f(R.string.IDS_details_sleep_grade_high);
    }

    public static String b(int i2, String str) {
        Context contextB = BaseApplication.b();
        switch (i2) {
            case 2:
                int iA = qrs.a(str);
                return qre.e(com.huawei.basichealthmodel.R.plurals.IDS_health_step_local, iA, d(iA, 1, 0));
            case 3:
                int iA2 = qrs.a(str);
                return qre.e(com.huawei.basichealthmodel.R.plurals.IDS_minute_no_space, iA2, Integer.valueOf(iA2));
            case 4:
            case 5:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
                int iA3 = qrs.a(str);
                if (iA3 <= 0) {
                    return "--";
                }
                return qre.e(com.huawei.basichealthmodel.R.plurals.IDS_time_no_space, iA3, Integer.valueOf(iA3));
            case 6:
            case 7:
                return qrk.a(contextB, i(str).getTimeInMillis(), 1);
            case 10:
                double d2 = d(qrs.g(str) / 1000.0d, -1);
                return qre.e(com.huawei.basichealthmodel.R.plurals.IDS_liter_no_space, UnitUtil.e(d2), d(d2, 1, -1));
            default:
                return d(i2, str);
        }
    }

    private static String d(int i2, String str) {
        if (i2 == 15) {
            double dG = qrs.g(str) / 1000.0d;
            return qre.e(com.huawei.basichealthmodel.R.plurals.IDS_kcalories_unit, (int) dG, d(dG, 1, 0));
        }
        if (i2 == 16) {
            int iA = qrs.a(str);
            return qre.e(com.huawei.basichealthmodel.R.plurals.IDS_single_circle_active_target_desc, iA, d(iA, 1, 0));
        }
        if (i2 != 18) {
            return str;
        }
        double dA = (((double) qrs.a(str)) / 60.0d) / 60.0d;
        return qre.e(com.huawei.basichealthmodel.R.plurals.IDS_single_circle_active_target_desc, (int) dA, d(dA, 1, 1));
    }

    public static SparseIntArray p() {
        SparseIntArray sparseIntArray = l;
        if (sparseIntArray == null || sparseIntArray.size() <= 0) {
            l = ffv.c(i);
        }
        return l;
    }

    public static int a(List<HealthLifeBean> list, int i2) {
        if (njy.e(list)) {
            return 2;
        }
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && i2 == healthLifeBean.getType() && healthLifeBean.getTaskType() == 1) {
                return healthLifeBean.getId();
            }
        }
        return cda.c(list) ? 3 : 2;
    }

    private static boolean h(List<HealthLifeBean> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("HL_BasicHealthModelUtils", "isPerfectClover list ", list);
            return false;
        }
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && healthLifeBean.getId() == 1) {
                if (healthLifeBean.getComplete() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(List<HealthLifeBean> list, float f2, float f3, float f4) {
        boolean zH = h(list);
        if (zH) {
            return true;
        }
        if (f2 < 1.0f || f3 < 1.0f || f4 < 1.0f) {
            return zH;
        }
        if (a(list) > 0) {
            return g(list);
        }
        return true;
    }

    public static int a(List<HealthLifeBean> list) {
        int id;
        int i2 = 0;
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getOtherTaskCount list is empty");
            return 0;
        }
        ArrayList<Integer> arrayListC = c(list);
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && (id = healthLifeBean.getId()) != 1 && id != 100001 && !arrayListC.contains(Integer.valueOf(id))) {
                i2++;
            }
        }
        return i2;
    }

    public static boolean g(List<HealthLifeBean> list) {
        int id;
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "isCompletedAllOther list is empty");
            return false;
        }
        ArrayList<Integer> arrayListC = c(list);
        boolean z = false;
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && (id = healthLifeBean.getId()) != 1 && id != 100001 && b(id) && !arrayListC.contains(Integer.valueOf(id))) {
                if (healthLifeBean.getComplete() <= 0) {
                    return false;
                }
                if (!z) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static int b() {
        int i2;
        String strQ = q();
        int iB = bxd.b(strQ);
        if (iB != 0) {
            LogUtil.j("HL_BasicHealthModelUtils", "deleteTaskConfigResult:", Integer.valueOf(iB));
            i2 = 401;
        } else {
            i2 = 0;
        }
        int iD = bxc.d(strQ);
        if (iD == 0) {
            return i2;
        }
        LogUtil.j("HL_BasicHealthModelUtils", "deleteTaskResult:", Integer.valueOf(iD));
        return 402;
    }

    public static int d(boolean z) {
        c(z);
        ccy.d("health_model_reminder", "");
        Set<String> setC = lua.c(ccy.f1481a);
        ArrayList arrayList = new ArrayList();
        for (String str : setC) {
            if (!TextUtils.isEmpty(str) && !"health_model_show_dialog_time".equals(str) && !"health_model_show_dialog_count".equals(str) && !"health_model_plugin_time".equals(str) && !"health_model_plugin_time_oversea".equals(str) && !"health_model_device_link_version".equals(str) && (z || !nio.a("health_model_is_agree_protocol").equals(str))) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ccy.c((String) it.next(), "");
        }
        ccl.d().c("HL_BasicHealthModelUtils");
        return 0;
    }

    private static void c(boolean z) {
        cfb.b();
        for (Integer num : cfb.i()) {
            cfb.d(true, num.intValue(), "");
            cfb.d(false, num.intValue(), "");
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("health_model_reminder");
        hiUserPreference.setValue("");
        LogUtil.a("HL_BasicHealthModelUtils", "resetHealthModelHiUserPreference isSuccess ", Boolean.valueOf(HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference)));
        HashMap<Integer, int[]> mapD = cfb.d();
        Iterator<Integer> it = mapD.keySet().iterator();
        while (it.hasNext()) {
            int[] iArr = mapD.get(it.next());
            if (iArr != null && iArr.length >= 1) {
                lsb.d().e(iArr[1]);
            }
        }
        if (z) {
            hiUserPreference.setKey("health_model_is_agree_protocol");
            hiUserPreference.setValue("");
            LogUtil.a("HL_BasicHealthModelUtils", "resetHealthModelHiUserPreference isSuccess ", Boolean.valueOf(HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference)));
        }
    }

    public static SparseIntArray m() {
        SparseIntArray sparseIntArray = o;
        if (sparseIntArray == null || sparseIntArray.size() <= 0) {
            o = ffv.c(f);
        }
        return o;
    }

    public static SparseIntArray n() {
        SparseIntArray sparseIntArray = h;
        if (sparseIntArray == null || sparseIntArray.size() <= 0) {
            h = ffv.c(f1423b);
        }
        return h;
    }

    public static SparseIntArray l() {
        SparseIntArray sparseIntArray = j;
        if (sparseIntArray == null || sparseIntArray.size() <= 0) {
            j = ffv.c(f1422a);
        }
        return j;
    }

    public static boolean b(List<HealthLifeBean> list, int i2) {
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getCompleted list is empty");
            return false;
        }
        HealthLifeBean healthLifeBean = list.get(0);
        if (healthLifeBean != null && healthLifeBean.getRecordDay() < w()) {
            int iD = d(list, i2);
            return iD > 0 && c(list, i2) >= iD;
        }
        return j(list, i2);
    }

    public static int a(boolean z) {
        Context contextB = BaseApplication.b();
        String strC = ccy.c("health_model_days_to_enter");
        String strC2 = ccy.c("health_model_entry_time_millis");
        long timeInMillis = s().getTimeInMillis();
        int iR = r();
        int i2 = 1;
        boolean z2 = iR > 0 && iR >= DateFormatUtil.a(timeInMillis);
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strC2) || z2) {
            c(timeInMillis);
            LogUtil.a("HL_BasicHealthModelUtils", "isContinuousEntry initContinuousEntry");
            return 1;
        }
        int iA = qrs.a(strC);
        long jF = qrs.f(strC2);
        int iA2 = lsl.a(jF, timeInMillis) - 1;
        if (iA2 == 1) {
            i2 = iA + 1;
            ccy.d("health_model_days_to_enter", String.valueOf(i2));
            ccy.d("health_model_entry_time_millis", String.valueOf(timeInMillis));
        } else if (iA2 <= 1) {
            if (iA2 >= 0) {
                LogUtil.d("HL_BasicHealthModelUtils", "isContinuousEntry today");
            } else if (z) {
                c(timeInMillis);
            }
            i2 = iA;
        } else if (z || CommonUtil.ab(contextB)) {
            c(timeInMillis);
        } else {
            i2 = iA;
        }
        if (iA2 != 0) {
            LogUtil.a("HL_BasicHealthModelUtils", "isContinuousEntry daysToEnter ", Integer.valueOf(i2), " entryTimeMillis ", Long.valueOf(jF));
        }
        return i2;
    }

    private static void c(long j2) {
        ccy.d("health_model_days_to_enter", String.valueOf(1));
        ccy.d("health_model_entry_time_millis", String.valueOf(j2));
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (z) {
            LogUtil.a(str, objArr);
        } else {
            LogUtil.d(str, objArr);
        }
    }

    public static String f() {
        return qre.f(R.string.IDS_health_clover_title);
    }

    public static TaskConfigBean d(byu byuVar, int i2) {
        TaskConfigBean taskConfigBean = new TaskConfigBean();
        List<TaskConfigBean> taskList = e(byuVar).getTaskList();
        if (taskList == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "getTaskConfig list is null");
            return taskConfigBean;
        }
        for (TaskConfigBean taskConfigBean2 : taskList) {
            if (taskConfigBean2 != null && taskConfigBean2.getId() == i2) {
                return taskConfigBean2;
            }
        }
        return taskConfigBean;
    }

    private static ConfigBean e(byu byuVar) {
        ConfigBean configBean = new ConfigBean();
        if (byuVar == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "getTaskConfigEntity manager is null");
            return configBean;
        }
        ConfigBean configBeanE = byuVar.e();
        if (configBeanE != null) {
            return configBeanE;
        }
        LogUtil.j("HL_BasicHealthModelUtils", "getTaskConfigEntity entity is null");
        return configBean;
    }

    public static int d(int i2) {
        return Math.min(Math.max(i2 - 2, 0), ffv.j().size() - 2);
    }

    public static SparseArray<HealthLifeBean> a(int i2, SparseArray<List<HealthLifeBean>> sparseArray) {
        SparseArray<HealthLifeBean> sparseArray2 = new SparseArray<>();
        if (sparseArray == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "getTaskArray sparseArray is null");
            return sparseArray2;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i3)));
        }
        Collections.sort(arrayList);
        for (Integer num : arrayList) {
            for (HealthLifeBean healthLifeBean : new ArrayList(sparseArray.get(num.intValue()))) {
                if (healthLifeBean != null && healthLifeBean.getId() == i2) {
                    sparseArray2.append(num.intValue(), healthLifeBean);
                }
            }
        }
        return sparseArray2;
    }

    public static int u() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(DateFormatUtil.d(byu.c().a(DateFormatUtil.a(System.currentTimeMillis()))));
        return calendar.get(7);
    }

    public static SparseIntArray i() {
        try {
            HashMap map = (HashMap) HiJsonUtil.d(ccy.i("intensity_week_status"), new TypeToken<HashMap<Integer, Integer>>() { // from class: com.huawei.basichealthmodel.util.BasicHealthModelUtils$2
            }.getType());
            if (map == null) {
                return new SparseIntArray();
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (Map.Entry entry : map.entrySet()) {
                if (entry != null) {
                    sparseIntArray.append(((Integer) entry.getKey()).intValue(), ((Integer) entry.getValue()).intValue());
                }
            }
            return sparseIntArray;
        } catch (JsonParseException e2) {
            LogUtil.e("HL_BasicHealthModelUtils", "getIntensityWeekStatus exception ", LogAnonymous.b(e2));
            return new SparseIntArray();
        }
    }

    public static Bitmap e(int i2, int i3) {
        try {
            return qqf.b(qqf.c(i2), new int[]{ContextCompat.getColor(BaseApplication.b(), i3)}, true);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("HL_BasicHealthModelUtils", "getBitmap NotFoundException");
            return null;
        }
    }

    public static int e(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        return (calendar.get(11) * 3600) + (calendar.get(12) * 60);
    }

    public static boolean ag() {
        return BaseApplication.h();
    }

    public static int b(List<HealthLifeBean> list) {
        int id;
        int i2 = 0;
        if (njy.e(list)) {
            LogUtil.j("HL_BasicHealthModelUtils", "getRewardsCompleted list is empty");
            return 0;
        }
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && (id = healthLifeBean.getId()) != 100001 && b(id) && healthLifeBean.getComplete() == 4) {
                i2++;
            }
        }
        return i2;
    }

    public static SparseIntArray a(final int i2, final int i3) {
        int iB;
        if (HandlerExecutor.c()) {
            b(ThreadPoolManager.c(), new Runnable() { // from class: cbt
                @Override // java.lang.Runnable
                public final void run() {
                    cbg.a(i2, i3);
                }
            });
        }
        int iB2 = bxc.b(i2, i3, 1);
        int iD = bxc.d(i2, i3) - iB2;
        int iW = w();
        if (iW <= 0 || i3 < iW) {
            iB = iB2;
        } else if (i2 >= iW) {
            iB = bxc.b(i2, i3, 100001);
            iD -= iB;
        } else {
            int iA = DateFormatUtil.a(lsl.u(DateFormatUtil.d(iW)));
            int iB3 = bxc.b(i2, iA, 1);
            int iB4 = bxc.b(iW, i3, 100001);
            LogUtil.a("HL_BasicHealthModelUtils", "getCompleteNumber startDate ", Integer.valueOf(i2), " tempEndDate ", Integer.valueOf(iA), " upgradeTime ", Integer.valueOf(iW), " energized ", Integer.valueOf(iB3), " newEnergized ", Integer.valueOf(iB4), " endDate ", Integer.valueOf(i3), " complete ", Integer.valueOf(iD));
            iB = iB3 + iB4;
            iD -= iB4;
        }
        SparseIntArray sparseIntArray = new SparseIntArray(16);
        sparseIntArray.append(1, iB2);
        sparseIntArray.append(100001, iB);
        sparseIntArray.append(0, iD);
        return sparseIntArray;
    }

    public static int d(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            ReleaseLogUtil.d("HL_BasicHealthModelUtils", "getDate hiHealthData is null");
            return 0;
        }
        return DateFormatUtil.a(hiHealthData.getStartTime());
    }

    public static long b(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            ReleaseLogUtil.d("HL_BasicHealthModelUtils", "getStartTime bean is null");
            return 0L;
        }
        return DateFormatUtil.d(healthLifeBean.getRecordDay());
    }

    public static long d(SparseArray<HealthLifeBean> sparseArray) {
        if (sparseArray == null) {
            ReleaseLogUtil.d("HL_BasicHealthModelUtils", "getStartTime sparseArray is null");
            return 0L;
        }
        int iKeyAt = sparseArray.keyAt(0);
        long jB = b(sparseArray.get(iKeyAt));
        return jB <= 0 ? DateFormatUtil.d(iKeyAt) : jB;
    }

    public static long c(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            ReleaseLogUtil.d("HL_BasicHealthModelUtils", "getEndTime bean is null");
            return 0L;
        }
        return lsl.c(b(healthLifeBean));
    }

    public static long e(SparseArray<HealthLifeBean> sparseArray) {
        if (sparseArray == null) {
            ReleaseLogUtil.d("HL_BasicHealthModelUtils", "getEndTime sparseArray is null");
            return 0L;
        }
        int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
        long jC = c(sparseArray.get(iKeyAt));
        return jC <= 0 ? lsl.c(DateFormatUtil.d(iKeyAt)) : jC;
    }

    public static void b(Context context, int i2) {
        if (context == null) {
            LogUtil.j("HL_BasicHealthModelUtils", "jumpWeekReport context or record is null");
            return;
        }
        StringBuilder sb = new StringBuilder("#/ReportDetail?from=0&startTime=");
        sb.append(i2);
        LogUtil.a("HL_BasicHealthModelUtils", "path ", sb.toString());
        ddv.b().initH5Pro();
        H5ProClient.getServiceManager().registerService(HealthModelH5ProService.class);
        e(context, "com.huawei.health.h5.blood-pressure", sb.toString());
    }

    public static SpannableString c(int i2, int i3, int i4) {
        String string;
        String strD = d(i2, 1, 0);
        Context context = com.huawei.hwcommonmodel.application.BaseApplication.getContext();
        Resources resources = context.getResources();
        String quantityString = resources.getQuantityString(com.huawei.basichealthmodel.R.plurals.IDS_health_model_mission_complete_number, i2, Integer.valueOf(i2));
        if (i4 == 1) {
            string = resources.getString(com.huawei.basichealthmodel.R.string.IDS_weekly_report_week, quantityString);
        } else if (i4 == 2) {
            string = resources.getString(com.huawei.basichealthmodel.R.string.IDS_weekly_report_week_has_percent, quantityString, d(i3, 2, 0));
        } else if (i4 == 5) {
            strD = d(i3, 2, 0);
            string = resources.getString(com.huawei.basichealthmodel.R.string.IDS_weekly_report_clover_rank, strD);
        } else if (i4 == 6) {
            string = resources.getString(com.huawei.basichealthmodel.R.string.IDS_weekly_report_no_this_year, quantityString);
        } else {
            LogUtil.j("HL_BasicHealthModelUtils", "getCloversText scene ", Integer.valueOf(i4));
            string = "";
        }
        SpannableString spannableString = new SpannableString(string);
        int iIndexOf = string.indexOf(strD);
        if (iIndexOf > -1) {
            int length = strD.length() + iIndexOf;
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.emuiColor4)), iIndexOf, length, 33);
            if (i4 == 5) {
                spannableString.setSpan(qrr.e(), iIndexOf, length, 33);
                return spannableString;
            }
            spannableString.setSpan(new qli(qrr.b()), iIndexOf, length, 33);
            if (LanguageUtil.f(context)) {
                spannableString.setSpan(new AbsoluteSizeSpan(38, true), iIndexOf, length, 33);
            }
        }
        return spannableString;
    }

    public static SparseArray<String> f(int i2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = simpleDateFormat.parse(String.valueOf(i2));
            if (date == null) {
                LogUtil.j("HL_BasicHealthModelUtils", "getWeekDateByInt date is null");
                return new SparseArray<>();
            }
            calendar.setTime(date);
            SparseArray<String> sparseArray = new SparseArray<>();
            a(sparseArray, calendar);
            return sparseArray;
        } catch (ParseException e2) {
            LogUtil.e("HL_BasicHealthModelUtils", "getWeekDateByInt ParseException ", LogAnonymous.b(e2));
            return new SparseArray<>();
        }
    }

    private static void a(SparseArray<String> sparseArray, Calendar calendar) {
        ArrayList arrayList = new ArrayList();
        calendar.setFirstDayOfWeek(1);
        calendar.add(5, calendar.getFirstDayOfWeek() - calendar.get(7));
        arrayList.add(UnitUtil.a(calendar.getTime(), 22));
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            calendar.add(5, 1);
            arrayList.add(UnitUtil.a(calendar.getTime(), 22));
        }
        while (i2 < arrayList.size()) {
            int i4 = i2 + 1;
            sparseArray.put(i4, (String) arrayList.get(i2));
            i2 = i4;
        }
    }

    public static SparseArray<String> a(int i2) {
        SparseArray<String> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(o());
        calendar.add(5, i2 * (-7));
        a(sparseArray, calendar);
        return sparseArray;
    }

    public static Date o() {
        int iA = byu.c().a(DateFormatUtil.a(System.currentTimeMillis()));
        LogUtil.a("HL_BasicHealthModelUtils", "getRealDate recordDay= ", Integer.valueOf(iA));
        return new Date(DateFormatUtil.d(iA));
    }

    public static SparseIntArray c(int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(o());
        calendar.add(5, i2 * (-7));
        return e(calendar);
    }

    public static SparseIntArray e(int i2) {
        try {
            Date date = new SimpleDateFormat("yyyyMMdd", Locale.ROOT).parse(String.valueOf(i2));
            if (date == null) {
                return new SparseIntArray();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return e(calendar);
        } catch (IllegalArgumentException | ParseException e2) {
            LogUtil.e("HL_BasicHealthModelUtils", "getWeekArrayFromInt exception ", LogAnonymous.c(e2));
            return new SparseIntArray();
        }
    }

    private static SparseIntArray e(Calendar calendar) {
        calendar.setFirstDayOfWeek(1);
        calendar.add(5, calendar.getFirstDayOfWeek() - calendar.get(7));
        SparseIntArray sparseIntArray = new SparseIntArray();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ROOT);
            for (int i2 = 1; i2 <= 7; i2++) {
                sparseIntArray.append(CommonUtils.j(simpleDateFormat.format(calendar.getTime())), i2);
                calendar.add(5, 1);
            }
        } catch (IllegalArgumentException e2) {
            LogUtil.e("HL_BasicHealthModelUtils", "getWeekDate exception ", LogAnonymous.b(e2));
        }
        return sparseIntArray;
    }

    public static int g(int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(5, i2 * (-7));
        calendar.setFirstDayOfWeek(1);
        int i3 = calendar.get(7);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        calendar.add(5, calendar.getFirstDayOfWeek() - i3);
        try {
            return Integer.parseInt(simpleDateFormat.format(calendar.getTime()));
        } catch (NumberFormatException unused) {
            LogUtil.e("HL_BasicHealthModelUtils", "getWeekMondayFormPageNumber ParseException ");
            return 0;
        }
    }

    public static SparseIntArray t() {
        ArrayList<Integer> arrayListB = ffv.b(R.array.health_life_task_id);
        if (njy.e(arrayListB)) {
            return new SparseIntArray();
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i2 = 0; i2 < arrayListB.size(); i2++) {
            sparseIntArray.append(arrayListB.get(i2).intValue(), g[i2]);
        }
        return sparseIntArray;
    }
}

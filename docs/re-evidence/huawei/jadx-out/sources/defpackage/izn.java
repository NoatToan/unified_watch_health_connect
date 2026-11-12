package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetSetingItemConstants;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class izn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38256b = SecurityConstant.f5920a;
    private static final String d = File.separator + "odm" + File.separator + "etc" + File.separator + "higeo.conf";

    public static int a(int i) {
        if (i == 264) {
            return 3;
        }
        switch (i) {
            case 257:
                return 6;
            case 258:
                return 1;
            case 259:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean b(int i) {
        return i > 0 && i < 220;
    }

    public static boolean e(int i) {
        return i == 258 || i == 264 || i == 257;
    }

    public static boolean e(int i, boolean z) {
        return (i == 258 || i == 264) && !z;
    }

    public static final String a(float f) {
        return hcc.d(BaseApplication.getContext(), f);
    }

    public static Map<Integer, Float> a(Map<Integer, Float> map) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList<Integer> arrayList2 = new ArrayList(16);
        TreeMap treeMap = new TreeMap();
        if (map == null) {
            LogUtil.d("Track_CommonUtil", "paceMap is null");
            return null;
        }
        for (Map.Entry<Integer, Float> entry : map.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue());
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            if (iIntValue < 100000) {
                if (!arrayList2.contains(key)) {
                    arrayList2.add(key);
                }
            } else {
                int i = iIntValue / 100000;
                if (i % 100 != 0) {
                    if (!arrayList2.contains(key)) {
                        arrayList2.add(key);
                    }
                } else {
                    int i2 = i / 100;
                    if (arrayList.contains(Integer.valueOf(i2))) {
                        arrayList2.add(key);
                    } else {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
            }
        }
        for (Integer num : arrayList2) {
            if (treeMap.containsKey(num)) {
                treeMap.remove(num);
            }
        }
        if (treeMap.size() != 0) {
            LogUtil.d("Track_CommonUtil", "The validate paceMap", treeMap.toString());
        }
        return treeMap;
    }

    private static float b(int i, List<njj> list) {
        int i2;
        float fD = 0.0f;
        for (int i3 = 0; i3 < 5 && (i2 = i + i3) < list.size(); i3++) {
            fD += list.get(i2).d();
        }
        return fD;
    }

    public static void e(List<njj> list, List<njj> list2, jqp jqpVar) {
        if (njy.e(list)) {
            LogUtil.j("Track_CommonUtil", "dealBikeTrackSpeedList validPaceList is empty.");
            return;
        }
        if (njy.e(list2)) {
            LogUtil.j("Track_CommonUtil", "dealBikeTrackSpeedList speedList is empty.");
            return;
        }
        if (a(jqpVar)) {
            njj njjVar = list2.get(list.size() - 1);
            Iterator<njj> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    list.add(njjVar);
                    break;
                }
            } while (!it.next().equals(njjVar));
            int size = list.size() / 5;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < size * 5) {
                float fB = b(i, list) / 5.0f;
                njj njjVar2 = new njj(list.get(i2));
                njjVar2.d(fB);
                arrayList.add(njjVar2);
                i += 5;
                i2++;
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    public static boolean a(jqp jqpVar) {
        if (jqpVar != null) {
            return jqpVar.d().requestSportType() == 259 && ((double) jqpVar.d().requestTotalDistance()) / 1000.0d >= 10.0d;
        }
        LogUtil.j("Track_CommonUtil", "isBikeTrackAndMoreThanTen trackDetailDataManager is null");
        return false;
    }

    public static final Float[] b(Map<Integer, Float> map) {
        float f;
        float f2 = 0.0f;
        if (map != null) {
            Iterator<Map.Entry<Integer, Float>> it = map.entrySet().iterator();
            boolean z = false;
            f = 0.0f;
            while (it.hasNext()) {
                float fFloatValue = it.next().getValue().floatValue();
                if (!z) {
                    z = true;
                    f2 = fFloatValue;
                    f = f2;
                }
                if (fFloatValue > f) {
                    f = fFloatValue;
                }
                if (fFloatValue < f2) {
                    f2 = fFloatValue;
                }
            }
        } else {
            f = 0.0f;
        }
        return new Float[]{Float.valueOf(f2), Float.valueOf(f)};
    }

    public static final int d(ArrayList<HeartRateData> arrayList) {
        int iAcquireHeartRate = 0;
        if (!njy.b(arrayList)) {
            return 0;
        }
        Iterator<HeartRateData> it = arrayList.iterator();
        while (it.hasNext()) {
            iAcquireHeartRate += it.next().acquireHeartRate();
        }
        return iAcquireHeartRate / arrayList.size();
    }

    public static final int b(ArrayList<HeartRateData> arrayList) {
        int iAcquireHeartRate = 0;
        if (arrayList != null) {
            for (HeartRateData heartRateData : arrayList) {
                if (heartRateData.acquireHeartRate() > iAcquireHeartRate) {
                    iAcquireHeartRate = heartRateData.acquireHeartRate();
                }
            }
        }
        return iAcquireHeartRate;
    }

    public static final int b(Context context, float f) {
        if (context == null) {
            LogUtil.a("Track_CommonUtil", "dip2px ", "context is null");
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int e(Context context, float f) {
        if (context == null) {
            LogUtil.a("Track_CommonUtil", "px2dip ", "context is null");
            return 0;
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final void c(Context context, String str) {
        LogUtil.a("Track_CommonUtil", "sendDebugInfo ", str);
        Intent intent = new Intent("com.huawei.health.autotrack.debug");
        intent.putExtra("debug_info", str);
        if (context != null) {
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, f38256b);
        }
    }

    public static final void b(Context context, String str) {
        if (context == null) {
            LogUtil.e("Track_CommonUtil", "removeTempFile context is null!");
            return;
        }
        File file = new File(context.getFilesDir(), str);
        if (file.exists()) {
            if (!file.delete()) {
                LogUtil.e("Track_CommonUtil", " delete motion path file fail!");
            } else {
                LogUtil.a("Track_CommonUtil", "remove file: ", str);
            }
        }
    }

    public static final int[] e(ArrayList<StepRateData> arrayList, long j) {
        int iAcquireStepRate;
        int iAcquireStepRate2;
        int i = 0;
        if (njy.e(arrayList)) {
            iAcquireStepRate = 0;
            iAcquireStepRate2 = 0;
        } else {
            iAcquireStepRate = 0;
            iAcquireStepRate2 = 0;
            for (StepRateData stepRateData : arrayList) {
                iAcquireStepRate += stepRateData.acquireStepRate();
                if (stepRateData.acquireStepRate() > iAcquireStepRate2) {
                    iAcquireStepRate2 = stepRateData.acquireStepRate();
                }
            }
            if (j > 0) {
                float f = ((iAcquireStepRate * 1000.0f) * 60.0f) / j;
                i = f > ((float) iAcquireStepRate2) ? iAcquireStepRate2 : (int) f;
            }
        }
        return new int[]{i, iAcquireStepRate2, iAcquireStepRate};
    }

    public static final <T> T d(String str, TypeToken<T> typeToken) {
        Gson gson = new Gson();
        try {
            if (TextUtils.isEmpty(str) || typeToken == null || typeToken.getType() == null) {
                return null;
            }
            return (T) gson.fromJson(str, typeToken.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.a("Track_CommonUtil", "Gson to List error");
            return null;
        }
    }

    public static int c(int i) {
        int i2 = R.color.track_detail_running_posture_color_normal;
        if (i == -1) {
            return R.color.track_detail_running_posture_color_poorer;
        }
        if (i == 0) {
            return R.color.track_detail_running_posture_color_suboptimal;
        }
        if (i == 1) {
            return R.color.track_detail_running_posture_color_normal;
        }
        if (i != 2) {
            return i != 3 ? i2 : R.color.track_detail_running_posture_color_excellent;
        }
        return R.color.track_detail_running_posture_color_good;
    }

    public static boolean b(Context context) {
        if (context == null) {
            LogUtil.a("Track_CommonUtil", "isOpenFreeIndoorRunning ", "context is null");
            return false;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "ihealthlabs");
        String strD = lon.c().d("support_sport_lab");
        LogUtil.a("Track_CommonUtil", "SUPPORT_SPORT_LAB: ", strD);
        if (strD == null) {
            strD = "HMA,LYA,EVR,BSA,VOG,DZH,ELE,NLE,AMZ,LIO,TAS,FRO,NEY,ANA,ELS,KUL,RAI,OCE,NOH,NOP,LAN";
        }
        if (!CommonUtil.c(strD.split(",")) || qrs.ah(BaseApplication.getContext())) {
            return false;
        }
        return "true".equals(strE);
    }

    public static boolean d() {
        String strD;
        if (!b(BaseApplication.getContext()) || (strD = lon.c().d("support_sport_lab")) == null) {
            return true;
        }
        String[] strArrSplit = strD.split(",");
        LogUtil.a("Track_CommonUtil", "closeRoad value", strD);
        if (strArrSplit.length == 0) {
            return true;
        }
        return "CLOSEREFRESH".equals(strArrSplit[0]);
    }

    public static boolean c(Context context) {
        if (context == null) {
            LogUtil.a("Track_CommonUtil", "acquireAutoPauseEnableStatus ", "context is null");
            return false;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "auto_pause_enable_status");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("Track_CommonUtil", "acquireAutoPauseEnableStatus you should set it before get");
            return false;
        }
        return Boolean.parseBoolean(strE);
    }

    public static String e(Context context) {
        if (context == null) {
            return "--";
        }
        return context.getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
    }

    public static boolean e(double d2, double d3) {
        return Math.abs(d2 - d3) < 1.0E-6d;
    }

    public static boolean a(double d2) {
        return Math.abs(d2) <= 1.0E-6d;
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "sport_listen_type");
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException unused) {
            LogUtil.e("Track_CommonUtil", "acquireSportListenerType NumberFormatException");
            return 0;
        }
    }

    public static void d(int i) {
        if (i == 257 || i == 258 || i == 259) {
            a();
        }
    }

    private static void a() {
        String[] strArrSplit;
        File file = new File(d);
        if (!file.exists()) {
            LogUtil.j("Track_CommonUtil", "printHiGeoCapability configFile is null");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                if (line.contains("higeo_enable_quickttff") && (strArrSplit = line.split("=")) != null && strArrSplit.length == 2) {
                                    ReleaseLogUtil.d("Track_CommonUtil", "printHiGeoCapability HiGeo Capability = ", Integer.valueOf(CommonUtil.j(strArrSplit[1])));
                                    break;
                                }
                            } else {
                                break;
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                } catch (Throwable th3) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    fileInputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException e) {
            LogUtil.e("Track_CommonUtil", LogAnonymous.b(e));
        }
    }

    public static float d(Context context) {
        return qrs.h(ecu.d().getDeviceSettingItemById(HwGetSetingItemConstants.RIM_SIZE, new jaq(context, new StorageParams(), Integer.toString(20002)).w(), "Track_CommonUtil")) / 1000.0f;
    }

    public static String b(MotionPathSimplify motionPathSimplify) {
        return motionPathSimplify != null ? motionPathSimplify.getExtendDataString("sportMode", "") : "";
    }

    public static int e(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public static boolean e() {
        return CommonUtil.bg() || nzz.b();
    }

    public static CharSequence c(long j, int i, int i2) {
        int[] iArrA = ezo.a(j);
        int i3 = iArrA[0];
        int i4 = iArrA[1];
        int i5 = iArrA[2];
        Context context = BaseApplication.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableStringC = gzx.c(context, "\\d+.\\d+|\\d+", gzx.d(R.plurals.IDS_hour_single_unit, i4, UnitUtil.e(i4, 1, 0)), i, i2);
        if (i3 > 0) {
            spannableStringBuilder.append((CharSequence) gzx.c(context, "\\d+.\\d+|\\d+", gzx.d(R.plurals.IDS_physiology_day, i3, UnitUtil.e(i3, 1, 0)), i, i2));
            spannableStringBuilder.append((CharSequence) spannableStringC);
        } else if (i4 > 0) {
            spannableStringBuilder.append((CharSequence) spannableStringC);
        }
        String strE = UnitUtil.e(i5, 1, 0);
        String strD = gzx.d(R.plurals.IDS_min_single_unit, i5, strE);
        if (i3 == 0 && i4 == 0) {
            strD = gzx.d(R.plurals.IDS_min_insert_unit, i5, strE);
        }
        spannableStringBuilder.append((CharSequence) gzx.c(context, "\\d+.\\d+|\\d+", strD, i, i2));
        return spannableStringBuilder;
    }

    public static CharSequence d(long j, int i, int i2) {
        Context context = BaseApplication.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        float f = j / 60000.0f;
        if (f < 60.0f) {
            double d2 = f;
            spannableStringBuilder.append((CharSequence) gzx.c(context, "\\d+.\\d+|\\d+", qre.e(R.plurals.IDS_min_unit, (int) f, UnitUtil.e(d2, 1, Math.abs(d2 - Math.floor(d2)) < 1.0E-6d ? 0 : 2)), i, i2));
            spannableStringBuilder.setSpan(new qli(qrr.c()), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        int i3 = (int) (f / 60.0f);
        int iRound = Math.round(f % 60.0f);
        if (iRound == 60) {
            i3++;
            iRound = 0;
        }
        SpannableString spannableStringC = gzx.c(context, "\\d+.\\d+|\\d+", qre.e(R.plurals.IDS_hour_unit, i3, UnitUtil.e(i3, 1, 0)), i, i2);
        if (iRound != 0) {
            spannableStringBuilder.append((CharSequence) gzx.c(context, "\\d+.\\d+|\\d+", qre.a(com.huawei.ui.commonui.R.string.IDS_two_parts, spannableStringC, qre.e(R.plurals.IDS_min_unit, iRound, UnitUtil.e(iRound, 1, 0))), i, i2));
        } else {
            spannableStringBuilder.append((CharSequence) spannableStringC);
        }
        spannableStringBuilder.setSpan(new qli(qrr.c()), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static void d(final String str, final String str2, final HiDataReadResultListener hiDataReadResultListener) {
        if (hiDataReadResultListener == null) {
            LogUtil.j("Track_CommonUtil", "getSampleConfig listener is null");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            hiDataReadResultListener.onResult("getSampleConfig type " + str + " configId " + str2, -1, -1);
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: izm
                @Override // java.lang.Runnable
                public final void run() {
                    izn.d(str, str2, hiDataReadResultListener);
                }
            });
            return;
        }
        HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
        builder.c(String.valueOf(0));
        builder.d(String.valueOf(0));
        builder.e(str);
        builder.a(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiSampleConfigKey(builder));
        HiSampleConfigProcessOption hiSampleConfigProcessOption = new HiSampleConfigProcessOption();
        hiSampleConfigProcessOption.setSampleConfigKeyList(arrayList);
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).getSampleConfig(hiSampleConfigProcessOption, hiDataReadResultListener);
    }
}

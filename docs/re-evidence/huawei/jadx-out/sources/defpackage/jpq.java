package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.google.gson.reflect.TypeToken;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.up.model.UserInfomation;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class jpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38804a = izn.e(BaseApplication.getContext());
    private static final int[] d = {R.string.IDS_motiontrack_restore_anaerobic_capacity, R.string.IDS_motiontrack_maintain_anaerobic_capacity, R.string.IDS_motiontrack_improve_anaerobic_capacity, R.string.IDS_motiontrack_enhanced_anaerobic_capacity, R.string.IDS_motiontrack_excessive_exercise};
    private static final int[] e = {R.string.IDS_training_activation, R.string.IDS_training_maintain, R.string.IDS_training_improve, R.string.IDS_training_enhanced, R.string.IDS_training_challenge};

    private static boolean a(int i, int i2, int i3, int i4) {
        return i > 80 && i > i2 && i > i4 && i > i3;
    }

    public static double c(float f) {
        if (f != 0.0f) {
            return 3600.0f / f;
        }
        return 0.0d;
    }

    public static int e(int i) {
        if (i <= 22) {
            return 1;
        }
        if (i <= 60) {
            return 3;
        }
        return i <= 100 ? 5 : 10;
    }

    public static boolean e(float f, float f2) {
        return f < Float.MAX_VALUE && f2 > Float.MIN_VALUE;
    }

    public static boolean f(int i) {
        return i == 5;
    }

    public static float g(float f) {
        if (f <= 1.0f) {
            return 1.05f;
        }
        if (f >= 5.0f) {
            return 5.5f;
        }
        return f;
    }

    public static boolean g(int i) {
        return i == 198 || i == 199 || i == 200;
    }

    public static boolean h(int i) {
        return i == 194 || i == 197 || i == 201 || i == 208 || i == 209 || i == 172 || i == 178;
    }

    public static boolean j(int i) {
        return i == 258 || i == 264 || i == 280 || i == 221 || i == 227;
    }

    private static boolean k(int i) {
        return i == 261 || i == 264 || i == 280 || i == 227 || i == 281 || i == 271 || i == 273 || i == 222 || i == 270 || i == 169 || i == 214;
    }

    private static boolean m(int i) {
        return i == 257 || i == 258 || i == 260 || i == 282;
    }

    public static boolean o(int i) {
        return i == 262 || i == 266;
    }

    public static String e(Context context, float f, int i) {
        int iFloor;
        if (context != null && (iFloor = (int) Math.floor(f - 1.0f)) >= 0) {
            int[] iArr = d;
            if (iFloor < iArr.length) {
                return context.getString(i == 0 ? iArr[iFloor] : e[iFloor]);
            }
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:21:0x03d2  */
    public static Integer[] e(UserInfomation userInfomation) {
        String str;
        Integer num;
        TreeMap treeMap;
        Map.Entry entryFloorEntry;
        if (userInfomation == null) {
            str = "Track_FragmentUtils";
            num = 22;
        } else {
            TreeMap treeMap2 = new TreeMap();
            int i = 0;
            if (userInfomation.getGender() == 0) {
                ReleaseLogUtil.d("Track_FragmentUtils", "getVO2maxRange Gender one");
                num = 22;
                treeMap = treeMap2;
                treeMap.put(0, new Integer[]{26, 32, 38, 44, 51, 57, 63, 69});
                treeMap.put(25, new Integer[]{26, 31, 36, 43, 49, 54, 60, 66});
                treeMap.put(30, new Integer[]{23, 29, 35, 41, 46, 52, 57, 62});
                treeMap.put(35, new Integer[]{23, 28, 33, 39, 44, 49, 55, 61});
                treeMap.put(40, new Integer[]{20, 26, 32, 36, 42, 47, 52, 57});
                treeMap.put(45, new Integer[]{20, 25, 30, 35, 40, 44, 49, 54});
                treeMap.put(50, new Integer[]{20, 24, 28, 33, 37, 42, 47, 52});
                treeMap.put(55, new Integer[]{17, 22, 27, 31, 35, 40, 44, 48});
                treeMap.put(60, new Integer[]{17, 21, 25, 29, 33, 37, 41, 45});
            } else {
                num = 22;
                treeMap = treeMap2;
                treeMap.put(0, new Integer[]{22, 27, 32, 37, 42, 47, 52, 57});
                treeMap.put(25, new Integer[]{21, 26, 31, 36, 41, 45, 50, 55});
                treeMap.put(30, new Integer[]{20, 25, 30, 34, 38, 43, 47, 51});
                treeMap.put(35, new Integer[]{20, 24, 28, 32, 36, 41, 45, 49});
                treeMap.put(40, new Integer[]{18, 22, 26, 30, 34, 38, 42, 46});
                treeMap.put(45, new Integer[]{18, 21, 24, 28, 32, 36, 39, 42});
                treeMap.put(50, new Integer[]{14, 19, 23, 26, 30, 33, 37, 41});
                treeMap.put(55, new Integer[]{15, 18, 21, 24, 28, 31, 34, 37});
                treeMap.put(60, new Integer[]{13, 16, 19, 22, 25, 28, 31, 34});
            }
            int ageOrDefaultValue = userInfomation.getAgeOrDefaultValue();
            if (ageOrDefaultValue < 0) {
                str = "Track_FragmentUtils";
                LogUtil.a(str, "getVO2maxRange age < 0");
                try {
                    ageOrDefaultValue = (Integer.parseInt(new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date())) - Integer.parseInt(UserInfomation.BIRTHDAY_DEFAULT)) / 10000;
                } catch (NumberFormatException e2) {
                    LogUtil.e(str, "setDataUserInfo get brithday error:", e2.getMessage());
                    ageOrDefaultValue = 0;
                }
                if (ageOrDefaultValue < 0) {
                    LogUtil.a(str, "getVO2maxRange default age < 0");
                }
                entryFloorEntry = treeMap.floorEntry(Integer.valueOf(i));
                if (entryFloorEntry != null) {
                    Integer[] numArr = (Integer[]) entryFloorEntry.getValue();
                    LogUtil.a(str, "getVO2maxRange=", Arrays.toString(numArr), "age=", Integer.valueOf(i));
                    return numArr;
                }
            } else {
                str = r8;
            }
            i = ageOrDefaultValue;
            entryFloorEntry = treeMap.floorEntry(Integer.valueOf(i));
            if (entryFloorEntry != null) {
                Integer[] numArr2 = (Integer[]) entryFloorEntry.getValue();
                LogUtil.a(str, "getVO2maxRange=", Arrays.toString(numArr2), "age=", Integer.valueOf(i));
                return numArr2;
            }
        }
        LogUtil.a(str, "getVO2maxRange error");
        return new Integer[]{num, 27, 32, 37, 42, 47, 52, 57};
    }

    public static String c(Context context, Integer[] numArr, int i, boolean z) {
        String[] stringArray;
        if (context == null || numArr == null) {
            return "";
        }
        TreeSet treeSet = new TreeSet(Arrays.asList(numArr));
        int iBinarySearch = treeSet.floor(Integer.valueOf(i)) != null ? Arrays.binarySearch(numArr, treeSet.floor(Integer.valueOf(i))) : 0;
        if (z) {
            stringArray = context.getResources().getStringArray(R.array.IDS_motiontrack_ox_ability_with_gender);
        } else {
            stringArray = context.getResources().getStringArray(R.array.IDS_motiontrack_ox_ability);
        }
        if (iBinarySearch >= stringArray.length) {
            iBinarySearch = stringArray.length - 1;
        }
        return stringArray[iBinarySearch];
    }

    public static float a(Integer[] numArr) {
        if (numArr == null || numArr.length < 5) {
            return 0.0f;
        }
        return (numArr[3].intValue() + numArr[4].intValue()) / 2.0f;
    }

    public static SpannableString b(String str, String str2, int i, int i2, Context context) {
        if (context == null || str == null || str2 == null) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new TextAppearanceSpan(context, i2), 0, spannableString.toString().length(), 33);
        Matcher matcher = Pattern.compile(str, 2).matcher(spannableString);
        while (matcher.find()) {
            spannableString.setSpan(new TextAppearanceSpan(context, i), matcher.start(), matcher.end(), 33);
        }
        return spannableString;
    }

    public static String h(float f) {
        if (f == 0.0f) {
            return f38804a;
        }
        return UnitUtil.e(3600.0f / f, 1, 2);
    }

    public static String i(float f) {
        if (UnitUtil.f()) {
            return h(f * 1.609344f);
        }
        return h(f);
    }

    public static String d(float f) {
        return izn.a(f);
    }

    public static String b(double d2) {
        double d3 = d2 / 1000.0d;
        return UnitUtil.f() ? String.valueOf(UnitUtil.e(UnitUtil.e(d3, 3), 1, 2)) : String.valueOf(UnitUtil.e(d3, 1, 2));
    }

    public static String e(long j) {
        return UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(j));
    }

    public static String b(long j) {
        return UnitUtil.b((int) TimeUnit.MILLISECONDS.toSeconds(j));
    }

    public static String e(float f) {
        if (UnitUtil.f()) {
            f = (float) UnitUtil.c(f, 3);
        }
        double d2 = f;
        if (d2 > 360000.0d || d2 <= 3.6d) {
            return f38804a;
        }
        return izn.a(f);
    }

    public static String c(double d2) {
        if (UnitUtil.f()) {
            return UnitUtil.e(UnitUtil.e(d2, 1), 1, 2);
        }
        return UnitUtil.e(d2, 1, 1);
    }

    public static String d(int i) {
        return UnitUtil.e((((double) i) * 1.0d) / 1000.0d, 1, 0);
    }

    public static String a(long j, int i) {
        if (j == 0) {
            LogUtil.e("Track_FragmentUtils", "sport time is zero");
            return f38804a;
        }
        double d2 = (((double) i) / ((j * 1.0d) / 1000.0d)) * 100.0d;
        return UnitUtil.e(d2 <= 100.0d ? d2 : 100.0d, 2, 2);
    }

    public static String b(int i) {
        return String.valueOf(UnitUtil.e(i, 1, 0));
    }

    public static String a(float f) {
        if (UnitUtil.f()) {
            f = (float) UnitUtil.e(f, 0);
        }
        return UnitUtil.e(f, 1, 0);
    }

    public static double e(double d2) {
        return UnitUtil.f() ? UnitUtil.e(d2 / 100.0d, 2) : d2 / 100.0d;
    }

    public static String j(float f) {
        float fC = f / 10.0f;
        double d2 = fC;
        if (d2 > 360000.0d || d2 <= 3.6d) {
            return f38804a;
        }
        if (UnitUtil.f()) {
            fC = (float) UnitUtil.c(d2, 2);
        }
        return izn.a(fC);
    }

    public static String f(float f) {
        return UnitUtil.e(UnitUtil.f() ? UnitUtil.e(f, 2) : f, 1, 0);
    }

    public static String d(int i, long j) {
        if (j == 0) {
            LogUtil.e("Track_FragmentUtils", "wrong time");
            return f38804a;
        }
        double dE = (i * 3.6f) / j;
        if (UnitUtil.f()) {
            dE = UnitUtil.e(dE, 3);
        }
        if (dE >= 1000.0d || dE < 0.01d) {
            return f38804a;
        }
        return UnitUtil.e(dE, 1, 2);
    }

    public static float b(List<njj> list, jqp jqpVar) {
        if (njy.e(list) || jqpVar == null) {
            LogUtil.a("Track_FragmentUtils", "getLastUseTime paceMap or manager is invalid");
            return 0.0f;
        }
        if (izn.a(jqpVar)) {
            return a(list, jqpVar);
        }
        String strE = UnitUtil.e(0.0d, 1, 0);
        if (b(jqpVar.d().requestTotalDistance()).endsWith(strE + strE)) {
            LogUtil.a("Track_FragmentUtils", "getLastUseTime distance is integer");
            return 0.0f;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(jqpVar.d().requestTotalTime());
        Iterator<njj> it = list.iterator();
        while (it.hasNext()) {
            seconds -= (long) Math.round(it.next().d());
        }
        LogUtil.a("Track_FragmentUtils", "getLastUseTime ", LogAnonymous.a(jqpVar.d().requestTotalTime()));
        if (seconds <= 0) {
            return 0.0f;
        }
        return seconds;
    }

    private static float a(List<njj> list, jqp jqpVar) {
        if (njy.e(list) || jqpVar == null) {
            LogUtil.j("Track_FragmentUtils", "requestBikeTrackLastUseTime validPaceList or manager is invalid");
            return 0.0f;
        }
        if (Double.compare(c(jqpVar), 0.0d) == 0) {
            return 0.0f;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(jqpVar.d().requestTotalTime());
        Iterator<njj> it = list.iterator();
        while (it.hasNext()) {
            seconds -= (long) (it.next().d() * 5.0f);
        }
        if (seconds <= 0) {
            return 0.0f;
        }
        return seconds;
    }

    public static double c(jqp jqpVar) {
        double dRequestTotalDistance = ((double) jqpVar.d().requestTotalDistance()) / 1000.0d;
        double d2 = dRequestTotalDistance - ((double) (izn.a(jqpVar) ? (((int) dRequestTotalDistance) / 5) * 5 : (int) dRequestTotalDistance));
        return UnitUtil.f() ? UnitUtil.e(d2, 3) : d2;
    }

    public static void b(int i, Context context) {
        e(i, context, 0);
    }

    public static void e(int i, Context context, int i2) {
        if (context == null) {
            return;
        }
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.huawei.ui.homehealth.runcard.SportNounExplainActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra(BleConstants.SPORT_TYPE, i);
        intent.putExtra("eteAlgoKey", i2);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Track_FragmentUtils", " ActivityNotFoundException.");
        }
    }

    public static boolean i(int i) {
        return i == 260 || i == 259 || i == 273 || i == 265 || nub.c(i) || i == 163 || h(i);
    }

    public static String e(jqp jqpVar, boolean z) {
        if (jqpVar == null) {
            return "";
        }
        return a((float) gzz.e(jqpVar.b().requestRealTimeSpeedList()), z);
    }

    public static String a(jqp jqpVar, boolean z) {
        if (jqpVar == null) {
            return "";
        }
        float fN = (float) gzz.n(jqpVar.b().requestRealTimeSpeedList());
        if (fN < 0.0f) {
            fN = 0.0f;
        }
        return a(fN, z);
    }

    public static int[] c(Map<String, Integer> map) {
        if (map == null) {
            LogUtil.a("Track_FragmentUtils", "score is null");
            return null;
        }
        int iIntValue = 25;
        int iIntValue2 = (!map.containsKey("jump_score") || map.get("jump_score") == null) ? 25 : map.get("jump_score").intValue();
        int iIntValue3 = (!map.containsKey("breakthrough_score") || map.get("breakthrough_score") == null) ? 25 : map.get("breakthrough_score").intValue();
        int iIntValue4 = (!map.containsKey("sport_intensity_score") || map.get("sport_intensity_score") == null) ? 25 : map.get("sport_intensity_score").intValue();
        int iIntValue5 = (!map.containsKey("run_score") || map.get("run_score") == null) ? 25 : map.get("run_score").intValue();
        if (map.containsKey("burst_score") && map.get("burst_score") != null) {
            iIntValue = map.get("burst_score").intValue();
        }
        return new int[]{iIntValue2, iIntValue4, iIntValue3, iIntValue5, iIntValue};
    }

    private static String a(float f, boolean z) {
        String strE;
        if (UnitUtil.f()) {
            strE = UnitUtil.e(UnitUtil.e(f, 3), 1, 2);
        } else {
            strE = UnitUtil.e(f, 1, 2);
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(strE);
        if (z) {
            stringBuffer.append(" ");
            if (UnitUtil.f()) {
                stringBuffer.append(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
            } else {
                stringBuffer.append(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed));
            }
        }
        return stringBuffer.toString();
    }

    public static boolean e(jqp jqpVar) {
        return (jqpVar == null || jqpVar.b() == null || !jqpVar.b().isValidSpeedList()) ? false : true;
    }

    public static boolean d(jqp jqpVar) {
        return jqpVar != null && ((float) c((float) gzz.c(jqpVar.b().requestRealTimePaceList()))) <= 120.0f;
    }

    public static boolean n(int i) {
        return m(i) || k(i);
    }

    public static boolean d(int i, int i2) {
        if (i == 274 || i == 273 || i == 265) {
            return f(i2);
        }
        return false;
    }

    public static boolean e(int i, MotionPath motionPath) {
        return motionPath != null && i == 273 && motionPath.isValidCadenceData();
    }

    public static Float[] d(ArrayList<njm> arrayList) {
        Float[] fArr = new Float[2];
        float f = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        if (arrayList == null || arrayList.size() == 0) {
            fArr[0] = fValueOf;
            fArr[1] = fValueOf;
            return fArr;
        }
        Iterator<njm> it = arrayList.iterator();
        float f2 = 0.0f;
        boolean z = false;
        while (it.hasNext()) {
            float fA = (float) it.next().a();
            if (!z) {
                z = true;
                f = fA;
                f2 = f;
            }
            if (fA > f) {
                f = fA;
            }
            if (fA < f2) {
                f2 = fA;
            }
        }
        fArr[0] = Float.valueOf(f);
        fArr[1] = Float.valueOf(f2);
        return fArr;
    }

    public static int g(List<lmb> list) {
        if (njy.e(list)) {
            return 0;
        }
        return ((lmb) Collections.max(list, new Comparator<lmb>() { // from class: jpq.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(lmb lmbVar, lmb lmbVar2) {
                return Double.compare(jpq.c(lmbVar), jpq.c(lmbVar2));
            }
        })).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double c(lmb lmbVar) {
        if (lmbVar != null && lmbVar.d() > 0) {
            return lmbVar.d();
        }
        return 0.0d;
    }

    public static int f(List<lmb> list) {
        if (njy.e(list)) {
            return 0;
        }
        return ((lmb) Collections.max(list, new Comparator<lmb>() { // from class: jpq.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(lmb lmbVar, lmb lmbVar2) {
                return Double.compare(jpq.b(lmbVar), jpq.b(lmbVar2));
            }
        })).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double b(lmb lmbVar) {
        if (lmbVar != null && lmbVar.a() > 0) {
            return lmbVar.a();
        }
        return 0.0d;
    }

    public static int c(List<lmb> list) {
        if (njy.b(list)) {
            int i = 0;
            int iA = 0;
            for (lmb lmbVar : list) {
                if (lmbVar != null) {
                    iA += lmbVar.a();
                    i++;
                }
            }
            if (i != 0) {
                return Math.round(iA / i);
            }
        }
        return 0;
    }

    public static int a(List<njh> list) {
        if (njy.b(list)) {
            int i = 0;
            int iE = 0;
            for (njh njhVar : list) {
                if (njhVar != null) {
                    iE += njhVar.e();
                    i++;
                }
            }
            if (i != 0) {
                return Math.round(iE / i);
            }
        }
        return 0;
    }

    public static int b(List<njb> list) {
        if (njy.b(list)) {
            int i = 0;
            int iA = 0;
            for (njb njbVar : list) {
                if (njbVar != null) {
                    iA += njbVar.a();
                    i++;
                }
            }
            if (i != 0) {
                return Math.round(iA / i);
            }
        }
        return 0;
    }

    public static int c(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        return d(motionPathSimplify, motionPath);
    }

    public static int e(List<njc> list) {
        if (njy.b(list)) {
            int i = 0;
            int iA = 0;
            for (njc njcVar : list) {
                if (njcVar != null && njcVar.a() > 0) {
                    iA += njcVar.a();
                    i++;
                }
            }
            if (i != 0) {
                return Math.round(iA / i);
            }
        }
        return 0;
    }

    public static int a(MotionPathSimplify motionPathSimplify) {
        return d(motionPathSimplify);
    }

    private static int d(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.e("Track_FragmentUtils", "motionPathSimplify is null");
            return 0;
        }
        float fRequestTotalSteps = motionPathSimplify.requestTotalSteps();
        long seconds = (int) TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime());
        if (seconds > 0) {
            return (int) Math.floor((fRequestTotalSteps / seconds) * 60.0f);
        }
        return 0;
    }

    private static int d(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        if (motionPathSimplify == null) {
            LogUtil.e("Track_FragmentUtils", "motionPathSimplify is null");
            return 0;
        }
        float fRequestTotalSteps = motionPathSimplify.requestTotalSteps();
        if (fRequestTotalSteps > 0.0f) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime());
            LogUtil.a("Track_FragmentUtils", "avg during =", Long.valueOf(seconds));
            if (seconds > 0) {
                return c(fRequestTotalSteps, seconds, motionPathSimplify);
            }
            return 0;
        }
        return d(motionPath);
    }

    private static int c(float f, long j, MotionPathSimplify motionPathSimplify) {
        double dFloor;
        if (motionPathSimplify.requestSportType() == 265 && motionPathSimplify.requestSportDataSource() == 5) {
            dFloor = Math.floor((f / j) * 60.0f);
        } else {
            dFloor = Math.floor(((f / 2.0f) / j) * 60.0f);
        }
        return (int) dFloor;
    }

    private static int d(MotionPath motionPath) {
        if (motionPath == null) {
            LogUtil.e("Track_FragmentUtils", "motionPath is null");
            return 0;
        }
        if (njy.e(motionPath.requestRidePostureDataList())) {
            LogUtil.j("Track_FragmentUtils", "getAverageCadence cadenceDataList is empty");
            return 0;
        }
        List<gzr> listRequestRidePostureDataList = motionPath.requestRidePostureDataList();
        int size = listRequestRidePostureDataList.size();
        int iC = 0;
        for (gzr gzrVar : listRequestRidePostureDataList) {
            if (gzrVar != null) {
                if (gzrVar.c() > 0) {
                    iC += gzrVar.c();
                } else {
                    size--;
                }
            }
        }
        if (size <= 0) {
            return 0;
        }
        return (int) Math.round(((double) iC) / ((double) size));
    }

    public static int h(List<njg> list) {
        if (njy.e(list)) {
            return 0;
        }
        return ((njg) Collections.max(list, new Comparator() { // from class: jpt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(jpq.e((njg) obj), jpq.e((njg) obj2));
            }
        })).c();
    }

    private static int e(njg njgVar) {
        if (njgVar == null) {
            return 0;
        }
        return Math.max(njgVar.c(), 0);
    }

    public static int d(List<lmb> list) {
        if (njy.b(list)) {
            int i = 0;
            int iD = 0;
            for (lmb lmbVar : list) {
                if (lmbVar != null) {
                    iD += lmbVar.d();
                    i++;
                }
            }
            if (i != 0) {
                return Math.round(iD / i);
            }
        }
        return 0;
    }

    public static String e(Context context) {
        if (context == null) {
            LogUtil.j("Track_FragmentUtils", "aquireSwimUnit  and context is null");
            return "";
        }
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
        }
        return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100);
    }

    public static ArrayList<Integer> b(jqp jqpVar) {
        List<njt> listRequestSpeedList = jqpVar.b().requestSpeedList();
        if (njy.e(listRequestSpeedList)) {
            LogUtil.e("Track_FragmentUtils", "speed list is empty");
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (njt njtVar : listRequestSpeedList) {
            if (njtVar == null) {
                LogUtil.e("Track_FragmentUtils", "speed data is null");
            } else {
                float fB = njtVar.b();
                if (fB > 19.444445f) {
                    i2++;
                } else if (fB > 13.888889f) {
                    i3++;
                } else if (fB > 8.333334f) {
                    i4++;
                } else if (fB > 2.777778f) {
                    i5++;
                }
                i++;
            }
        }
        if (i == 0) {
            LogUtil.e("Track_FragmentUtils", "speed list is empty");
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        double d2 = i;
        int iFloor = (int) Math.floor((((double) i2) / d2) * 100.0d);
        int iFloor2 = (int) Math.floor((((double) i3) / d2) * 100.0d);
        int iFloor3 = (int) Math.floor((((double) i4) / d2) * 100.0d);
        int iFloor4 = (int) Math.floor((((double) i5) / d2) * 100.0d);
        arrayList.add(Integer.valueOf(iFloor));
        arrayList.add(Integer.valueOf(iFloor2));
        arrayList.add(Integer.valueOf(iFloor3));
        arrayList.add(Integer.valueOf(iFloor4));
        int i6 = (((100 - iFloor) - iFloor2) - iFloor3) - iFloor4;
        arrayList.add(Integer.valueOf(i6));
        LogUtil.a("Track_FragmentUtils", "percentage", Integer.valueOf(i6));
        return arrayList;
    }

    public static ArrayList<Integer> a(List<Double> list, List<Integer> list2, boolean z) {
        if (njy.e(list2) || njy.e(list) || list.size() != 5) {
            LogUtil.e("Track_FragmentUtils", "rankList is empty");
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (Integer num : list2) {
            if (num.intValue() >= list.get(4).doubleValue()) {
                i++;
            } else if (num.intValue() >= list.get(3).doubleValue()) {
                i5++;
            } else if (num.intValue() >= list.get(2).doubleValue()) {
                i4++;
            } else if (num.intValue() >= list.get(1).doubleValue()) {
                i3++;
            }
            i2++;
        }
        if (i2 == 0) {
            LogUtil.e("Track_FragmentUtils", "list is empty");
            return null;
        }
        if (z) {
            return c(i2, i, i5, i4, i3);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i5));
        arrayList.add(Integer.valueOf(i4));
        arrayList.add(Integer.valueOf(i3));
        arrayList.add(Integer.valueOf((((i2 - i) - i5) - i4) - i3));
        return arrayList;
    }

    private static ArrayList<Integer> c(int i, double d2, double d3, double d4, double d5) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        double d6 = i;
        int iFloor = (int) Math.floor((d2 / d6) * 100.0d);
        int iFloor2 = (int) Math.floor((d3 / d6) * 100.0d);
        int iFloor3 = (int) Math.floor((d4 / d6) * 100.0d);
        int iFloor4 = (int) Math.floor((d5 / d6) * 100.0d);
        arrayList.add(Integer.valueOf(iFloor));
        arrayList.add(Integer.valueOf(iFloor2));
        arrayList.add(Integer.valueOf(iFloor3));
        arrayList.add(Integer.valueOf(iFloor4));
        int i2 = (((100 - iFloor) - iFloor2) - iFloor3) - iFloor4;
        arrayList.add(Integer.valueOf(i2));
        LogUtil.a("Track_FragmentUtils", "percentage", Integer.valueOf(i2));
        return arrayList;
    }

    public static int a(int i, int[] iArr) {
        if (i >= 1800 && iArr != null) {
            int i2 = iArr[0];
            int i3 = iArr[2];
            int i4 = iArr[4];
            int i5 = iArr[3];
            int i6 = iArr[1];
            if (i2 > 80 && i3 > 80 && i4 > 80 && i5 > 80 && i6 > 80) {
                return R.drawable.img_seal_mvp;
            }
            if (a(i3, i2, i5, i6) && a(i4, i2, i5, i6)) {
                return R.drawable.img_seal_shandian;
            }
            if (b(iArr) == 0) {
                return R.drawable.img_seal_jump;
            }
            if (i > 3600 && b(iArr) == 3) {
                return R.drawable.img_seal_power;
            }
            if (b(iArr) == 1) {
                return R.drawable.img_seal_gangpao;
            }
            LogUtil.a("Track_FragmentUtils", "Normal people");
        }
        return 0;
    }

    private static int b(int[] iArr) {
        int[] iArr2 = new int[5];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        Arrays.sort(iArr2);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == iArr2[4] && i2 > 80) {
                return i;
            }
        }
        return -1;
    }

    public static float c(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            return 0.0f;
        }
        if (e(motionPathSimplify)) {
            if (UnitUtil.f()) {
                return ((float) UnitUtil.c(motionPathSimplify.requestAvgPace(), 2)) / 5.0f;
            }
            return motionPathSimplify.requestAvgPace();
        }
        if (o(motionPathSimplify.requestSportType())) {
            float fRequestAvgPace = motionPathSimplify.requestAvgPace() / 10.0f;
            double d2 = fRequestAvgPace;
            if (d2 > 360000.0d || d2 <= 3.6d) {
                return 0.0f;
            }
            return UnitUtil.f() ? (float) UnitUtil.c(d2, 2) : fRequestAvgPace;
        }
        if (UnitUtil.f()) {
            return motionPathSimplify.requestAvgPace() * 1.609344f;
        }
        return motionPathSimplify.requestAvgPace();
    }

    public static boolean e(MotionPathSimplify motionPathSimplify) {
        return motionPathSimplify.requestSportType() == 274 && motionPathSimplify.requestSportDataSource() == 5;
    }

    public static String b(float f) {
        double d2 = f;
        if (d2 > 360000.0d || d2 <= 3.6d) {
            return f38804a;
        }
        return izn.a(f);
    }

    public static String d(int i, Context context) {
        if (context == null) {
            return "/";
        }
        if (i == 274) {
            if (UnitUtil.f()) {
                return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
            }
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500);
        }
        if (UnitUtil.f()) {
            return "/" + context.getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        }
        return "/" + context.getString(R.string.IDS_motiontrack_show_sport_unit_km);
    }

    public static String a(Context context, int i, String str) {
        if (context == null) {
            return "";
        }
        String string = context.getResources().getString(R.string.IDS_hwh_motiontrack_swim_segment);
        if (nub.e(i)) {
            string = context.getResources().getString(R.string.IDS_motiontrack_show_detail_ski_drop);
        }
        if (i == 220) {
            string = context.getResources().getString(R.string.IDS_motiontrack_show_detail_swing);
        }
        return ((i == 274 && str.equals("291")) || i == 283) ? context.getResources().getString(R.string.IDS_rowing_machine_grouping) : string;
    }

    public static boolean c(int i, MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify != null) {
            return i == 273 && motionPathSimplify.getExtendDataInt("crossTrainerCadence") <= 0;
        }
        LogUtil.j("Track_FragmentUtils", "isNewCrossTrainerRecode motionPathSimplify is null");
        return false;
    }

    public static String a(int i) {
        if (i <= 96) {
            return qre.e(R.plurals.IDS_sport_recovery_training_advise, i, Integer.valueOf(i));
        }
        LogUtil.a("Track_FragmentUtils", "getAfterSportSummaryFourTrainEffect unused branch.");
        return "";
    }

    public static jwb c(long j, int i) {
        ArrayList<jwb> arrayList;
        String strE = lua.e(String.valueOf(20002), "MARKER_SETTING", "");
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList = (ArrayList) HiJsonUtil.d(strE, new TypeToken<List<jwb>>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragmentutils.FragmentUtils$3
            }.getType());
            try {
                LogUtil.a("Track_FragmentUtils", "intervalListTmp is ", arrayList);
            } catch (IllegalStateException unused) {
                arrayList2 = arrayList;
                LogUtil.e("Track_FragmentUtils", "IllegalStateException exception");
                arrayList = arrayList2;
            }
        } catch (IllegalStateException unused2) {
        }
        if (njy.e(arrayList)) {
            return null;
        }
        String str = j + "_" + i;
        for (jwb jwbVar : arrayList) {
            if (jwbVar != null && str.equals(jwbVar.d())) {
                return jwbVar;
            }
        }
        return null;
    }

    public static void e(jwb jwbVar) {
        ArrayList arrayList = (ArrayList) HiJsonUtil.d(lua.e(String.valueOf(20002), "MARKER_SETTING", ""), new TypeToken<List<jwb>>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragmentutils.FragmentUtils$4
        }.getType());
        if (njy.e(arrayList)) {
            arrayList = new ArrayList();
        }
        arrayList.remove(jwbVar);
        if (arrayList.size() > 100) {
            arrayList.remove(0);
        }
        arrayList.add(jwbVar);
        lua.f(String.valueOf(20002), "MARKER_SETTING", HiJsonUtil.d(arrayList));
    }

    public static int d(long j, int i, int i2) {
        jwb jwbVarC = c(j, i);
        if (jwbVarC == null) {
            LogUtil.a("Track_FragmentUtils", "bean is null");
            return e(i2 / 1000);
        }
        return jwbVarC.e();
    }

    public static Boolean a(jqp jqpVar) {
        return Boolean.valueOf(jqpVar.d().requestSportType() != 283 || jqpVar.d().requestSportDataSource() == 5);
    }

    public static void e(SportDetailChartDataType sportDetailChartDataType, jph jphVar, final Context context, final jqp jqpVar) {
        if (jphVar == null || context == null || jqpVar == null) {
            LogUtil.j("Track_FragmentUtils", "in setRecoverHeartRateChartModel is null");
            return;
        }
        if (sportDetailChartDataType == SportDetailChartDataType.HEART_RATE_RECOVERY) {
            HwHealthBaseCombinedChart hwHealthBaseCombinedChartC = jphVar.c();
            final Resources resources = BaseApplication.getContext().getResources();
            XAxis xAxis = hwHealthBaseCombinedChartC.getXAxis();
            xAxis.setAxisMinimum(0);
            xAxis.setAxisMaximum(120);
            xAxis.setValueFormatter(new IAxisValueFormatter() { // from class: jpq.3
                @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
                public String getFormattedValue(float f, AxisBase axisBase) {
                    DecimalFormat decimalFormat = new DecimalFormat("#");
                    int iRound = Math.round(f / 60.0f);
                    if ("0".equals(decimalFormat.format(iRound))) {
                        return qrk.a(context, jqpVar.d().requestEndTime(), 1);
                    }
                    return resources.getQuantityString(R.plurals.IDS_plugin_fitnessadvice_min, iRound, Integer.valueOf(iRound));
                }
            });
            hwHealthBaseCombinedChartC.getDescription().setText("");
            hwHealthBaseCombinedChartC.refresh();
            jphVar.c(hwHealthBaseCombinedChartC);
        }
    }

    public static void b(final int i, ImageView imageView, final String str) {
        if (imageView == null) {
            LogUtil.e("Track_FragmentUtils", "explainIcon == null");
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: jpq.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.r()) {
                        LogUtil.j("Track_FragmentUtils", "downRemindClick is fast click");
                    } else {
                        dem.b().a(str);
                        jpq.l(i);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(int i) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("chartType", Integer.valueOf(i));
        map.put("dataPage", "trackDetails");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_CIRCLE_RING_GUIDE_1040121.value(), map, 0);
    }

    public static String c(Context context, int i) {
        if (context == null) {
            LogUtil.j("Track_FragmentUtils", "getDistanceAndUnit context == null");
            return "";
        }
        if (UnitUtil.f()) {
            double dE = UnitUtil.e(i, 1);
            return context.getResources().getQuantityString(R.plurals.IDS_altitude_ft, (int) dE, UnitUtil.e(dE, 1, 0));
        }
        return context.getResources().getQuantityString(R.plurals.IDS_altitude_meter, i, UnitUtil.e(i, 1, 0));
    }

    public static String d(double d2) {
        Context context = BaseApplication.getContext();
        if (Double.compare(d2, 100000.0d) >= 0 && LanguageUtil.l(context)) {
            return context.getResources().getString(R.string.IDS_skiing_ten_thousand_kcal, UnitUtil.e(d2 / 10000.0d, 1, 2));
        }
        return context.getResources().getString(R.string.IDS_plugindameon_hw_show_sport_kcal_string, UnitUtil.e(d2, 1, 0));
    }

    public static PopupWindow d(Context context, View view, String str) {
        int i;
        int i2;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.track_detail_item_bubble, null);
        if (linearLayout == null || view == null) {
            LogUtil.e("Track_FragmentUtils", "bubbleLayout is null");
            return null;
        }
        HealthBubbleLayout healthBubbleLayout = (HealthBubbleLayout) linearLayout.findViewById(R.id.item_bubble);
        ((TextView) linearLayout.findViewById(R.id.item_bubble_content)).setText(str);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int iSqrt = (int) ((2.0d - Math.sqrt(2.0d)) * 2.0d * ((double) healthBubbleLayout.getBubbleRadius()));
        if (iArr[0] < qrs.i(context) / 2) {
            if (LanguageUtil.ba(context)) {
                i2 = -(iArr[0] + view.getWidth());
                healthBubbleLayout.setArrowStartLocation(2);
            } else {
                i2 = -iArr[0];
                healthBubbleLayout.setArrowStartLocation(1);
            }
            i = (((iArr[0] - qre.b(R.dimen.health_common_12dp)) - iSqrt) - (qre.b(R.dimen.health_common_22dp) / 2)) + (view.getWidth() / 2);
        } else {
            if (LanguageUtil.ba(context)) {
                healthBubbleLayout.setArrowStartLocation(1);
            } else {
                healthBubbleLayout.setArrowStartLocation(2);
            }
            i = ((((qrs.i(context) - iArr[0]) - qre.b(R.dimen.health_common_12dp)) - iSqrt) - (qre.b(R.dimen.health_common_22dp) / 2)) - (view.getWidth() / 2);
            i2 = 0;
        }
        healthBubbleLayout.setArrowPosition(i);
        final PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(linearLayout);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.showAsDropDown(view, i2, 0);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: jpw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                popupWindow.dismiss();
            }
        });
        return popupWindow;
    }
}

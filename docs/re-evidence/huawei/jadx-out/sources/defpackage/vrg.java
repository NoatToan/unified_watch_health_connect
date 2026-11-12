package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.network.embedded.g2;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class vrg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, Integer> f51523b;

    public static int b(int i) {
        if (i != 227) {
            if (i != 262) {
                if (i != 264) {
                    if (i != 266) {
                        if (i == 291) {
                            return 287;
                        }
                        if (i != 257) {
                            if (i != 258) {
                                switch (i) {
                                    case 217:
                                    case 218:
                                    case 219:
                                        return 217;
                                    case HeartRateThresholdConfig.HEART_RATE_LIMIT /* 220 */:
                                        return 286;
                                    default:
                                        switch (i) {
                                            case 229:
                                            case 230:
                                            case 231:
                                            case 232:
                                            case 233:
                                                return 217;
                                            default:
                                                switch (i) {
                                                    case OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE /* 280 */:
                                                        break;
                                                    case 281:
                                                    case 282:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 286:
                                                                return 286;
                                                            case 287:
                                                            case 288:
                                                            case 289:
                                                                return 287;
                                                            default:
                                                                return i;
                                                        }
                                                }
                                                break;
                                        }
                                    case FitnessSportType.HW_FITNESS_SPORT_ALL /* 221 */:
                                        return 258;
                                }
                            }
                        }
                        return 257;
                    }
                }
            }
            return 262;
        }
        return 258;
    }

    private static boolean e(int i) {
        return i == 265 || i == 274 || i == 273;
    }

    static {
        HashMap map = new HashMap();
        f51523b = map;
        map.put(0, 199);
        map.put(1, 199);
        map.put(10004, 199);
        map.put(32, 0);
        map.put(30, 0);
        map.put(23, 4);
        map.put(35, 4);
        map.put(21, 4);
        map.put(22, 4);
        map.put(39, 4);
        map.put(44, 4);
        map.put(45, 4);
        map.put(42, 4);
        map.put(47, 4);
        map.put(81, 4);
        map.put(83, 4);
        map.put(90, 4);
        map.put(91, 4);
        map.put(77, 4);
        map.put(78, 4);
        map.put(36, 5);
        map.put(41, 5);
        map.put(37, 5);
        map.put(46, 5);
        map.put(51, 5);
        map.put(61, 5);
        map.put(62, 5);
        map.put(79, 5);
        map.put(80, 5);
        map.put(88, 5);
        map.put(43, 6);
        map.put(38, 6);
        map.put(436, 7);
        map.put(437, 7);
        map.put(438, 7);
        map.put(439, 7);
        map.put(440, 7);
        map.put(441, 7);
        map.put(Integer.valueOf(ErrorCode.ERROR_CODE_NO_USERINFO), 7);
        map.put(Integer.valueOf(g2.n), 7);
        map.put(Integer.valueOf(WorkoutRecord.COURSE_TYPE_YOGA), 7);
        map.put(445, 7);
        map.put(446, 7);
        map.put(447, 7);
        map.put(448, 7);
        map.put(449, 7);
    }

    static int c(int i, String str) {
        int iB;
        LogUtil.a("Track_TrackSportHistoryUtils", "sortDeviceCategory deviceType is ", Integer.valueOf(i));
        Map<Integer, Integer> map = f51523b;
        if (map.containsKey(Integer.valueOf(i))) {
            iB = map.get(Integer.valueOf(i)).intValue();
        } else {
            iB = b("deviceId", String.valueOf(i));
        }
        return iB == 0 ? b("smartProductId", str) : iB;
    }

    private static int b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        ProductMapParseUtil.a(BaseApplication.getContext());
        List<ProductMapInfo> listC = ProductMap.c(str, str2);
        if (njy.e(listC) || listC.get(0) == null || listC.get(0).e() == null) {
            LogUtil.j("Track_TrackSportHistoryUtils", "productInInfoList is null");
            return 0;
        }
        String strE = listC.get(0).e();
        LogUtil.a("Track_TrackSportHistoryUtils", "getDeviceProductName value ", str2, "productType ", strE);
        if ("06E".equals(strE)) {
            return 4;
        }
        if ("06D".equals(strE)) {
            return 5;
        }
        return "082".equals(strE) ? 6 : 0;
    }

    public static List<vrb> d(List<vqt> list, List<WorkoutRecord> list2, int i) {
        int size = list != null ? list.size() : 0;
        int size2 = list2 != null ? list2.size() : 0;
        LogUtil.a("Track_TrackSportHistoryUtils", "combineRecordListData trackListLength = ", Integer.valueOf(size), " fitnessList = ", Integer.valueOf(size2), " dataNum = ", Integer.valueOf(i));
        int iMin = i == 0 ? size + size2 : Math.min(size + size2, i);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        int i3 = 0;
        while (i2 + i3 < iMin) {
            if (i2 >= size) {
                arrayList.add(new vrb(1, list2.get(i3)));
            } else {
                if (i3 >= size2) {
                    arrayList.add(new vrb(0, list.get(i2)));
                } else {
                    vqt vqtVar = list.get(i2);
                    WorkoutRecord workoutRecord = list2.get(i3);
                    if (vqtVar.o() > workoutRecord.startTime()) {
                        arrayList.add(new vrb(0, vqtVar));
                    } else {
                        arrayList.add(new vrb(1, workoutRecord));
                    }
                }
                i2++;
            }
            i3++;
        }
        LogUtil.a("Track_TrackSportHistoryUtils", "combineRecordListData result ListLength = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static List<vqn> b(List<vqn> list, List<vqn> list2) {
        int i = 0;
        int iB = b(list, 0, true);
        int iB2 = b(list2, 0, false);
        ArrayList arrayList = new ArrayList(10);
        int i2 = 0;
        int i3 = 0;
        while (b(list, list2, i, i2)) {
            if (list.get(i).c() < list2.get(i2).c()) {
                arrayList.add(i3, list2.get(i2));
                i3++;
                i2++;
            } else {
                if (list.get(i).c() == list2.get(i2).c()) {
                    arrayList.add(i3, e(list, list2, i, i2));
                    i++;
                    i2++;
                } else {
                    arrayList.add(i3, list.get(i));
                    i++;
                }
                i3++;
            }
        }
        LogUtil.a("Track_TrackSportHistoryUtils", "temp all month data is ", Integer.valueOf(arrayList.size()));
        a(list2, iB2, arrayList, a(list, iB, arrayList, i3, i), i2);
        return arrayList;
    }

    private static boolean b(List<vqn> list, List<vqn> list2, int i, int i2) {
        if (njy.c(list, i)) {
            return njy.c(list2, i2);
        }
        return false;
    }

    private static int b(List<vqn> list, int i, boolean z) {
        if (list == null) {
            if (z) {
                LogUtil.a("Track_TrackSportHistoryUtils", "tempTrackMonthDataLength is null");
                return i;
            }
            LogUtil.a("Track_TrackSportHistoryUtils", "FitnessTrackMonthDataLength is null");
            return i;
        }
        int size = list.size();
        if (z) {
            LogUtil.a("Track_TrackSportHistoryUtils", "tempTrackMonthDataLength is ", Integer.valueOf(size));
            return size;
        }
        LogUtil.a("Track_TrackSportHistoryUtils", "tempFitnessMonthDataLength is ", Integer.valueOf(size));
        return size;
    }

    private static vqn e(List<vqn> list, List<vqn> list2, int i, int i2) {
        if (njy.e(list, i) || njy.e(list2, i2)) {
            return new vqn();
        }
        vqn vqnVar = list.get(i);
        vqn vqnVar2 = list2.get(i2);
        HashMap map = new HashMap();
        if (vqnVar.a() == null || vqnVar2.a() == null) {
            return new vqn();
        }
        map.putAll(vqnVar.a());
        map.putAll(vqnVar2.a());
        return new vqn(map, vqnVar.e() + vqnVar2.e(), vqnVar.c());
    }

    private static int a(List<vqn> list, int i, List<vqn> list2, int i2, int i3) {
        if (list != null) {
            while (i > i3) {
                list2.add(i2, list.get(i3));
                i3++;
                i2++;
            }
        }
        return i2;
    }

    public static String b(int i, Context context) {
        if (context == null) {
            return null;
        }
        if (i == 0) {
            return context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_all_exercise);
        }
        if (i != 220) {
            if (i == 262) {
                return context.getResources().getString(R.string.IDS_motiontrack_swim_tip);
            }
            if (i == 10001) {
                return context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_fitness_course);
            }
            if (i != 286) {
                if (i != 287) {
                    switch (i) {
                        case 257:
                            return context.getResources().getString(R.string.IDS_motiontrack_walk_tip);
                        case 258:
                            return context.getResources().getString(R.string.IDS_motiontrack_run_tip);
                        case 259:
                            return context.getResources().getString(R.string.IDS_hwh_start_track_sport_type_cycling);
                        default:
                            return e(i, context);
                    }
                }
                return context.getResources().getString(R.string.IDS_diving_tip);
            }
        }
        return context.getResources().getString(R.string.IDS_motiontrack_golf_tip);
    }

    private static String d(int i, Context context) {
        if (i == 0) {
            return context.getResources().getString(R.string.IDS_FitnessAdvice_all_courses);
        }
        if (i == 137) {
            return context.getResources().getString(R.string.IDS_start_fitness_type_yoga);
        }
        if (i == 283) {
            return context.getResources().getString(R.string.IDS_indoor_skipper_rope_sport_type);
        }
        return "";
    }

    public static String e(int i, Context context) {
        if (context == null) {
            LogUtil.e("Track_TrackSportHistoryUtils", "getListSportTypeName context is null");
            return null;
        }
        if (jry.a(context).b(i) == null) {
            LogUtil.e("Track_TrackSportHistoryUtils", "getSportTypeInfoById is null :sportType", Integer.valueOf(i));
            return null;
        }
        try {
            return context.getResources().getString(jby.d(jry.a(context).b(i).getSportTypeRes(), context));
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("Track_TrackSportHistoryUtils", "NotFoundException", Integer.valueOf(i));
            return "";
        }
    }

    public static int a(int i, List<Integer> list) {
        if (list == null || !list.contains(Integer.valueOf(i))) {
            return 0;
        }
        return list.indexOf(Integer.valueOf(i));
    }

    public static int d(int i, List<Integer> list) {
        if (njy.e(list, i)) {
            LogUtil.e("Track_TrackSportHistoryUtils", "sortSportType OutOfBounds");
            return 0;
        }
        return list.get(i).intValue();
    }

    public static String[] b(List<Integer> list, Context context) {
        if (context == null || njy.e(list)) {
            return new String[]{""};
        }
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_all_exercise));
        for (int i = 1; i < arrayList.size(); i++) {
            String strB = b(((Integer) arrayList.get(i)).intValue(), context);
            if (((Integer) arrayList.get(i)).intValue() != 0 && strB != null) {
                arrayList2.add(strB);
            }
        }
        if (njy.e(arrayList2)) {
            return new String[]{""};
        }
        String[] strArr = new String[arrayList2.size()];
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            strArr[i2] = (String) arrayList2.get(i2);
        }
        return strArr;
    }

    public static Drawable b(Context context, int i) {
        return e(context, i, null);
    }

    public static Drawable e(Context context, int i, String str) {
        jry jryVarA = jry.a(context);
        Drawable drawable = context.getDrawable(R.drawable.ic_health_list_outdoor_running);
        if (jryVarA.b(i) == null || jryVarA.b(i).getHistoryList() == null) {
            LogUtil.j("Track_TrackSportHistoryUtils", "getSportTypeInfoById =null sportType= ", Integer.valueOf(i));
            return drawable;
        }
        return jryVarA.b(i).getHistoryList().getItemDrawable(str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x0048 A[RETURN] */
    public static int c(Context context, int i) {
        int iA;
        jry jryVarA = jry.a(context);
        if (jryVarA.b(i) == null) {
            LogUtil.j("Track_TrackSportHistoryUtils", "getSportTypeInfoById =null sportType= ", Integer.valueOf(i));
        } else {
            iA = jryVarA.b(i).getHistoryList() != null ? a(jryVarA.b(i).getHistoryList().getItemBgColor(), context) : 0;
            if (iA == 0) {
                return iA;
            }
            LogUtil.j("Track_TrackSportHistoryUtils", "acquireSportTypeBackgroundColor = 0");
            return context.getColor(R.color.colorAccent);
        }
        if (iA == 0) {
            return iA;
        }
        LogUtil.j("Track_TrackSportHistoryUtils", "acquireSportTypeBackgroundColor = 0");
        return context.getColor(R.color.colorAccent);
    }

    private static int a(int i, Context context) {
        if (context == null) {
            LogUtil.j("Track_TrackSportHistoryUtils", "acquireBgColor  context is null");
            return 0;
        }
        if (i == 0) {
            return context.getColor(R.color.sport_type_bg_0);
        }
        if (i == 1) {
            return context.getColor(R.color.colorAccent);
        }
        if (i == 2) {
            return context.getColor(R.color.color_blood_high);
        }
        if (i == 3) {
            return context.getColor(R.color.pie_sector_running_level_color_b);
        }
        if (i == 4) {
            return context.getColor(R.color.sug_ai_run_plan_cross_text_color);
        }
        if (i == 5) {
            return context.getColor(R.color.sport_type_bg_5);
        }
        return context.getColor(R.color.colorAccent);
    }

    public static String[] c(List<Integer> list, Context context) {
        if (context == null || njy.e(list)) {
            return new String[]{""};
        }
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < list.size(); i++) {
            String strD = d(list.get(i).intValue(), context);
            if (!TextUtils.isEmpty(strD)) {
                arrayList.add(strD);
            }
        }
        if (njy.e(arrayList)) {
            return new String[]{""};
        }
        String[] strArr = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = (String) arrayList.get(i2);
        }
        return strArr;
    }

    public static String e(int i, int i2) {
        return "Track_" + i + i2;
    }

    public static int e(String str) {
        int iN = CommonUtil.n(BaseApplication.getContext(), str.substring(6, str.length() - 1));
        if (String.valueOf(iN).contains(String.valueOf(287))) {
            return 287;
        }
        if (CommonUtil.n(BaseApplication.getContext(), str.substring(str.length() - 1)) != 1) {
            return iN;
        }
        LogUtil.e("Track_TrackSportHistoryUtils", "SportKey   =  1");
        return 0;
    }

    public static HashSet<Integer> c(List<String> list) {
        HashSet<Integer> hashSet = new HashSet<>();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            int iB = b(e(it.next()));
            if (iB != 0 && !hashSet.contains(Integer.valueOf(iB))) {
                hashSet.add(Integer.valueOf(iB));
            }
        }
        return hashSet;
    }

    public static void b(vrb vrbVar, Map<String, Double> map, long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        a(vrbVar, 287, map);
        e(vrbVar, map, j, j2, i, iBaseResponseCallback);
    }

    public static Map<String, Double> c(vrb vrbVar, int i, Map<String, Double> map) {
        if (i == 262 && vrbVar.b() == 2) {
            c(vrbVar, a(vrbVar, i, map), map);
            return map;
        }
        if (vrbVar.a() == 0 && vrbVar.f() == 0) {
            if (i == 287) {
                a("Track_Duration_Sum", vrbVar.j(), map);
                return map;
            }
            List<String> listA = a(vrbVar, i, map);
            if (i == 262) {
                c(vrbVar, listA, map);
            }
        }
        return map;
    }

    private static void a(String str, double d, Map<String, Double> map) {
        if (map == null || !map.containsKey(str) || map.get(str) == null) {
            return;
        }
        map.put(str, Double.valueOf(map.get(str).doubleValue() - d));
    }

    public static List<String> d(int i) {
        jry jryVarA = jry.a(BaseApplication.getContext());
        LogUtil.a("Track_TrackSportHistoryUtils", " mSportType= ", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        HwSportTypeInfo hwSportTypeInfoB = jryVarA.b(i);
        if (hwSportTypeInfoB != null) {
            return hwSportTypeInfoB.getHistoryList().getTrackRequestDataBase(i);
        }
        LogUtil.a("Track_TrackSportHistoryUtils", "static is wrong");
        return arrayList;
    }

    private static void e(vrb vrbVar, final Map<String, Double> map, long j, long j2, int i, final IBaseResponseCallback iBaseResponseCallback) {
        float fO = vrbVar.o() / 1000.0f;
        if (map.get("Track_28721") != null) {
            map.put("Track_28721", Double.valueOf(map.get("Track_28721").doubleValue() - ((double) fO)));
        }
        final String str = "Track_28722";
        if (map.get("Track_28722") == null) {
            return;
        }
        if (map.get("Track_28722").doubleValue() == vrbVar.e() * 10.0f) {
            nkb.d().e(j, j2, i, new IBaseResponseCallback() { // from class: vrd
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                public final void onResponse(int i2, Object obj) {
                    vrg.e(map, str, iBaseResponseCallback, i2, obj);
                }
            });
        } else if (iBaseResponseCallback != null) {
            iBaseResponseCallback.onResponse(0, map);
        }
    }

    static /* synthetic */ void e(Map map, String str, IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        try {
            if ((obj instanceof Map) && !((Map) obj).isEmpty()) {
                Iterator it = ((Map) obj).entrySet().iterator();
                double dMax = 0.0d;
                while (it.hasNext()) {
                    dMax = Math.max(dMax, ((Double) ((Map.Entry) it.next()).getValue()).doubleValue());
                }
                map.put(str, Double.valueOf(dMax));
            } else {
                map.put(str, Double.valueOf(0.0d));
            }
        } catch (ClassCastException unused) {
            LogUtil.e("Track_TrackSportHistoryUtils", "deleteDiving classCastException");
            map.put(str, Double.valueOf(0.0d));
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.onResponse(0, map);
        }
    }

    private static void c(vrb vrbVar, List<String> list, Map<String, Double> map) {
        if (njy.c(list, 3)) {
            String str = list.get(3);
            if (!map.containsKey(str) || map.get(str) == null) {
                return;
            }
            map.put(str, Double.valueOf(map.get(str).doubleValue() - vrbVar.o()));
        }
    }

    private static List<String> a(vrb vrbVar, int i, Map<String, Double> map) {
        List<String> listD = d(i);
        if (vrbVar.f() != 1 && map != null && !map.isEmpty()) {
            if (vrbVar.b() == 0) {
                double dE = vrbVar.e();
                a("Track_Distance_Sum", dE, map);
                a("Track_" + i + 2, dE, map);
            }
            if (b(vrbVar, i)) {
                double dE2 = vrbVar.e();
                a("Track_Distance_Sum", dE2, map);
                a("Track_" + i + 2, dE2, map);
            }
            double dO = vrbVar.o();
            a("Track_" + i + 4, dO, map);
            a("Track_" + i + 3, vrbVar.c(), map);
            a("Track_" + i + 23, vrbVar.e(), map);
            if (i != 10001) {
                a("Track_Duration_Sum", dO, map);
                a("Track_Calorie_Sum", vrbVar.c(), map);
                a("Track_Strokes_Sum", vrbVar.e(), map);
            }
        }
        return listD;
    }

    public static boolean b(vrb vrbVar, int i) {
        return (vrbVar.b() != 0 && e(i)) || vrbVar.b() == 4;
    }

    public static CopyOnWriteArrayList<Integer> a(List<Integer> list, Context context) {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list == null) {
            LogUtil.j("Track_TrackSportHistoryUtils", "filterSportType  sportTypeList is null");
            return copyOnWriteArrayList;
        }
        for (Integer num : list) {
            if (!copyOnWriteArrayList.contains(num) && e(num.intValue(), context) != null) {
                copyOnWriteArrayList.add(num);
            }
        }
        return copyOnWriteArrayList;
    }

    public static int b(CopyOnWriteArrayList<vqu> copyOnWriteArrayList, int i, int i2) {
        vqu vquVar;
        vrb vrbVarD;
        if (njy.e(copyOnWriteArrayList, i) || copyOnWriteArrayList.get(i) == null || (vquVar = copyOnWriteArrayList.get(i)) == null || vquVar.d(i2) == null || (vrbVarD = copyOnWriteArrayList.get(i).d(i2)) == null) {
            return 0;
        }
        int iV = vrbVarD.v();
        if (vrbVarD.ai() == 2) {
            iV = 6;
        }
        LogUtil.a("Track_TrackSportHistoryUtils", "TrackType :", Integer.valueOf(iV));
        return iV;
    }
}

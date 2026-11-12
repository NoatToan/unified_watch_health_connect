package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.h5pro.vengine.H5ProExecJsValueCbk;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.servicesapi.R;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class qdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<String, Integer> f46020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, Integer> f46021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final SparseIntArray f46022c;
    private static final SparseIntArray d;
    public static Pair<Long, String> e;
    private static final SparseIntArray f;
    private static final HashMap<String, Integer> g;
    private static final HashMap<String, Integer> h;
    private static final SparseIntArray i;
    private static final SparseIntArray j;
    private static final Long k = 120000L;
    private static boolean l;
    private static boolean m;
    private static Boolean n;
    private static boolean o;
    private static boolean r;

    public static boolean e(int i2) {
        return i2 == 3;
    }

    public static boolean f(int i2) {
        return i2 == 0 || i2 == 1 || i2 == 3 || i2 == 4 || i2 == 11 || i2 == 12;
    }

    public static boolean g(int i2) {
        return i2 == 4;
    }

    public static boolean i(int i2) {
        return i2 == 6;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        HashMap<String, Integer> map = new HashMap<>();
        f46020a = map;
        HashMap<String, Integer> map2 = new HashMap<>();
        h = map2;
        HashMap<String, Integer> map3 = new HashMap<>();
        f46021b = map3;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f = sparseIntArray3;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f46022c = sparseIntArray4;
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        d = sparseIntArray5;
        HashMap<String, Integer> map4 = new HashMap<>();
        g = map4;
        sparseIntArray.append(131111, R.string.IDS_summary_131111);
        sparseIntArray.append(131112, R.string.IDS_summary_131112);
        sparseIntArray.append(131113, R.string.IDS_summary_131113);
        sparseIntArray.append(131311, R.string.IDS_summary_131311);
        sparseIntArray.append(131312, R.string.IDS_summary_131312);
        sparseIntArray.append(131313, R.string.IDS_summary_131313);
        sparseIntArray.append(131411, R.string.IDS_summary_131411);
        sparseIntArray.append(131412, R.string.IDS_summary_131412);
        sparseIntArray.append(131413, R.string.IDS_summary_131413);
        sparseIntArray.append(141111, R.string.IDS_summary_141111);
        sparseIntArray.append(141112, R.string.IDS_summary_141112);
        sparseIntArray.append(141113, R.string.IDS_summary_141113);
        sparseIntArray.append(141311, R.string.IDS_summary_141311);
        sparseIntArray.append(141312, R.string.IDS_summary_141312);
        sparseIntArray.append(141313, R.string.IDS_summary_141313);
        sparseIntArray.append(141411, R.string.IDS_summary_141411);
        sparseIntArray.append(141412, R.string.IDS_summary_141412);
        sparseIntArray.append(141413, R.string.IDS_summary_141413);
        sparseIntArray.append(151111, R.string.IDS_summary_151111);
        sparseIntArray.append(151112, R.string.IDS_summary_151112);
        sparseIntArray.append(151113, R.string.IDS_summary_151113);
        sparseIntArray.append(151311, R.string.IDS_summary_151311);
        sparseIntArray.append(151312, R.string.IDS_summary_151312);
        sparseIntArray.append(151313, R.string.IDS_summary_151313);
        sparseIntArray.append(151411, R.string.IDS_summary_151411);
        sparseIntArray.append(151412, R.string.IDS_summary_151412);
        sparseIntArray.append(151413, R.string.IDS_summary_151413);
        sparseIntArray.append(161211, R.string.IDS_summary_161211);
        sparseIntArray2.append(131211, R.plurals.IDS_summary_131211);
        sparseIntArray2.append(141211, R.plurals.IDS_summary_141211);
        sparseIntArray2.append(151211, R.plurals.IDS_summary_151211);
        sparseIntArray2.append(161212, R.plurals.IDS_summary_161212);
        sparseIntArray.append(171211, R.string.IDS_summary_171211);
        sparseIntArray.append(171212, R.string.IDS_summary_171211);
        sparseIntArray.append(171213, R.string.IDS_summary_171211);
        sparseIntArray.append(171214, R.string.IDS_summary_171211);
        sparseIntArray.append(171215, R.string.IDS_summary_171211);
        sparseIntArray.append(172211, R.string.IDS_summary_172211);
        sparseIntArray.append(172212, R.string.IDS_summary_172211);
        sparseIntArray.append(173211, R.string.IDS_summary_173211);
        sparseIntArray.append(173212, R.string.IDS_summary_173211);
        sparseIntArray.append(174211, R.string.IDS_summary_174211);
        sparseIntArray.append(174212, R.string.IDS_summary_174211);
        sparseIntArray.append(174213, R.string.IDS_summary_174211);
        sparseIntArray.append(174214, R.string.IDS_summary_174211);
        sparseIntArray.append(171311, R.string.IDS_summary_171311);
        sparseIntArray.append(171312, R.string.IDS_summary_171312);
        sparseIntArray.append(171313, R.string.IDS_summary_171313);
        sparseIntArray.append(172311, R.string.IDS_summary_172311);
        sparseIntArray.append(172312, R.string.IDS_summary_172312);
        sparseIntArray.append(172313, R.string.IDS_summary_172313);
        sparseIntArray.append(173311, R.string.IDS_summary_173311);
        sparseIntArray.append(173312, R.string.IDS_summary_173312);
        sparseIntArray.append(173313, R.string.IDS_summary_173313);
        sparseIntArray.append(174311, R.string.IDS_summary_174311);
        sparseIntArray.append(174314, R.string.IDS_summary_174311);
        sparseIntArray.append(174315, R.string.IDS_summary_174311);
        sparseIntArray.append(174312, R.string.IDS_summary_174312);
        sparseIntArray.append(174313, R.string.IDS_summary_174313);
        sparseIntArray.append(171411, R.string.IDS_summary_171411);
        sparseIntArray.append(171412, R.string.IDS_summary_171412);
        sparseIntArray.append(171413, R.string.IDS_summary_171413);
        sparseIntArray.append(172411, R.string.IDS_summary_172411);
        sparseIntArray.append(172412, R.string.IDS_summary_172412);
        sparseIntArray.append(172413, R.string.IDS_summary_172413);
        sparseIntArray.append(173411, R.string.IDS_summary_173411);
        sparseIntArray.append(173412, R.string.IDS_summary_173412);
        sparseIntArray.append(173413, R.string.IDS_summary_173413);
        sparseIntArray.append(174411, R.string.IDS_summary_174411);
        sparseIntArray.append(174412, R.string.IDS_summary_174412);
        sparseIntArray.append(174413, R.string.IDS_summary_174413);
        sparseIntArray.append(181211, R.string.IDS_summary_18121);
        sparseIntArray.append(181212, R.string.IDS_summary_18121);
        sparseIntArray.append(181213, R.string.IDS_summary_18121);
        sparseIntArray.append(181214, R.string.IDS_summary_18121);
        sparseIntArray.append(181215, R.string.IDS_summary_18121);
        sparseIntArray.append(182311, R.string.IDS_summary_182311);
        sparseIntArray.append(182312, R.string.IDS_summary_182312);
        sparseIntArray.append(182313, R.string.IDS_summary_182313);
        sparseIntArray.append(183311, R.string.IDS_summary_183311);
        sparseIntArray.append(183312, R.string.IDS_summary_183312);
        sparseIntArray.append(183313, R.string.IDS_summary_183313);
        sparseIntArray.append(182411, R.string.IDS_summary_182411);
        sparseIntArray.append(182412, R.string.IDS_summary_182412);
        sparseIntArray.append(182413, R.string.IDS_summary_182413);
        sparseIntArray.append(183411, R.string.IDS_summary_183411);
        sparseIntArray.append(183412, R.string.IDS_summary_183412);
        sparseIntArray.append(183413, R.string.IDS_summary_183413);
        sparseIntArray.append(116202, R.string.IDS_summary_116202);
        sparseIntArray.append(116204, R.string.IDS_summary_116204);
        sparseIntArray.append(116205, R.string.IDS_summary_116205);
        sparseIntArray.append(112211, R.string.IDS_summary_112211);
        sparseIntArray.append(112212, R.string.IDS_summary_112212);
        sparseIntArray.append(112213, R.string.IDS_summary_112213);
        sparseIntArray.append(113211, R.string.IDS_summary_113211);
        sparseIntArray.append(113212, R.string.IDS_summary_113212);
        sparseIntArray.append(113213, R.string.IDS_summary_113213);
        sparseIntArray.append(114211, R.string.IDS_summary_114211);
        sparseIntArray.append(114212, R.string.IDS_summary_114212);
        sparseIntArray.append(114213, R.string.IDS_summary_114213);
        sparseIntArray.append(115211, R.string.IDS_summary_115211);
        sparseIntArray.append(115213, R.string.IDS_summary_115213);
        sparseIntArray.append(115214, R.string.IDS_summary_115214);
        sparseIntArray.append(115215, R.string.IDS_summary_115215);
        sparseIntArray.append(116311, R.string.IDS_summary_116311);
        sparseIntArray.append(116312, R.string.IDS_summary_116311);
        sparseIntArray.append(116313, R.string.IDS_summary_116313);
        sparseIntArray.append(116314, R.string.IDS_summary_116313);
        sparseIntArray.append(116315, R.string.IDS_summary_116315);
        sparseIntArray.append(116411, R.string.IDS_summary_116411);
        sparseIntArray.append(116412, R.string.IDS_summary_116411);
        sparseIntArray.append(116413, R.string.IDS_summary_116413);
        sparseIntArray.append(116414, R.string.IDS_summary_116413);
        sparseIntArray.append(116415, R.string.IDS_summary_116415);
        sparseIntArray2.append(116201, R.plurals.IDS_summary_116201);
        sparseIntArray2.append(116203, R.plurals.IDS_summary_116203);
        sparseIntArray2.append(115212, R.plurals.IDS_summary_115212);
        map.put("step", Integer.valueOf(R.drawable.ic_step));
        map.put("sleep", Integer.valueOf(R.drawable.ic_sleep_pic));
        map.put("exerciseTimeLen", Integer.valueOf(R.drawable.ic_exercise_time_len));
        map.put(MessageConstant.BLOOD_PRESSURE_TYPE, Integer.valueOf(R.drawable.ic_blood_pressure));
        map.put("emotionalHealth", Integer.valueOf(R.drawable.ic_emotion));
        map.put("stress", Integer.valueOf(R.drawable.ic_stress));
        map.put("heartHealth", Integer.valueOf(R.drawable.ic_heart));
        map.put("activityRings", Integer.valueOf(R.drawable.ic_three_rings));
        map.put("calorie", Integer.valueOf(R.drawable.ic_calorie));
        map.put("activeHour", Integer.valueOf(R.drawable.ic_active_hour));
        map.put("running", Integer.valueOf(R.drawable.ic_running));
        map.put("ridden", Integer.valueOf(R.drawable.ic_ridden));
        map.put("vo2max", Integer.valueOf(R.drawable.ic_vo2max));
        map.put("readiness", Integer.valueOf(R.drawable.ic_readiness));
        map3.put("step", Integer.valueOf(R.string.IDS_acumen_step));
        map3.put("sleep", Integer.valueOf(R.string.IDS_acumen_sleep));
        map3.put("exerciseTimeLen", Integer.valueOf(R.string.IDS_acumen_exercise_duration));
        map3.put(MessageConstant.BLOOD_PRESSURE_TYPE, Integer.valueOf(R.string.IDS_acumen_blood_pressure));
        map3.put("emotionalHealth", Integer.valueOf(R.string.IDS_acumen_emotion));
        map3.put("heartHealth", Integer.valueOf(R.string.IDS_acumen_heart));
        map3.put("activityRings", Integer.valueOf(R.string.IDS_acumen_three_rings));
        map3.put("calorie", Integer.valueOf(R.string.IDS_acumen_calorie));
        map3.put("activeHour", Integer.valueOf(R.string.IDS_acumen_activity_hours));
        map3.put("running", Integer.valueOf(R.string.IDS_acumen_running));
        map3.put("ridden", Integer.valueOf(R.string.IDS_acumen_ridden));
        map2.put("step", Integer.valueOf(R.string.IDS_insights_step));
        map2.put("sleep", Integer.valueOf(R.string.IDS_insights_sleep));
        map2.put("exerciseTimeLen", Integer.valueOf(R.string.IDS_insights_exercise_duration));
        map2.put(MessageConstant.BLOOD_PRESSURE_TYPE, Integer.valueOf(R.string.IDS_insights_blood_pressure));
        map2.put("emotionalHealth", Integer.valueOf(R.string.IDS_insights_emotion));
        map2.put("heartHealth", Integer.valueOf(R.string.IDS_insights_heart));
        map2.put("activityRings", Integer.valueOf(R.string.IDS_insights_three_rings));
        map2.put("calorie", Integer.valueOf(R.string.IDS_insights_calorie));
        map2.put("activeHour", Integer.valueOf(R.string.IDS_insights_activity_hours));
        map2.put("running", Integer.valueOf(R.string.IDS_insights_running));
        map2.put("ridden", Integer.valueOf(R.string.IDS_insights_ridden));
        sparseIntArray3.append(0, R.string.IDS_insights_increase);
        sparseIntArray3.append(1, R.string.IDS_insights_decrease);
        sparseIntArray3.append(3, R.string.IDS_insights_better);
        sparseIntArray3.append(4, R.string.IDS_insights_worse);
        sparseIntArray3.append(11, R.string.IDS_insights_advance);
        sparseIntArray3.append(12, R.string.IDS_insights_later);
        sparseIntArray3.append(6, R.string.IDS_insights_exception);
        map4.put("step", 1);
        map4.put("running", 2);
        map4.put("ridden", 3);
        map4.put("activityRings", 4);
        map4.put("sleep", 5);
        map4.put("heartHealth", 6);
        map4.put("emotionalHealth", 7);
        map4.put(MessageConstant.BLOOD_PRESSURE_TYPE, 8);
        sparseIntArray4.append(0, R.mipmap.readiness_attention);
        sparseIntArray4.append(1, R.mipmap.readiness_low);
        sparseIntArray4.append(2, R.mipmap.readiness_medium);
        sparseIntArray4.append(3, R.mipmap.readiness_good);
        sparseIntArray4.append(4, R.mipmap.readiness_excellent);
        sparseIntArray5.append(0, Color.parseColor("#DE3737"));
        sparseIntArray5.append(1, Color.parseColor("#FF7500"));
        sparseIntArray5.append(2, Color.parseColor("#FFBF00"));
        sparseIntArray5.append(3, Color.parseColor("#64BB5C"));
        sparseIntArray5.append(4, Color.parseColor("#00BEB0"));
    }

    public static boolean q() {
        return Utils.h() && !Utils.b(BaseApplication.b());
    }

    public static void c(List<Integer> list, long j2) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncId(j2);
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncDataTypes(list);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public static boolean c(List<Integer> list, String str) {
        if (CollectionUtils.a(list) || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("SummaryUtil", "isSyncDataType syncDataTypeList ", list, " syncDataResultType ", str);
            return false;
        }
        int iJ = CommonUtil.j(str);
        if (iJ != 0) {
            return list.contains(Integer.valueOf(iJ)) || iJ == 20000;
        }
        List list2 = (List) HiJsonUtil.d(str, new TypeToken<List<Integer>>() { // from class: com.huawei.summary.SummaryUtil$1
        }.getType());
        if (CollectionUtils.a(list2)) {
            ReleaseLogUtil.d("SummaryUtil", "isSyncDataType syncDataResultTypeList ", list2, " syncDataResultType ", str, " syncDataTypeList ", list);
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (list.contains((Integer) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static List<Integer> k() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(20000);
        return arrayList;
    }

    public static List<Integer> a() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_RECORD.value()));
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(10007);
        arrayList.add(10010);
        arrayList.add(7);
        arrayList.add(16);
        return arrayList;
    }

    public static List<Integer> g() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_RECORD.value()));
        arrayList.add(10010);
        arrayList.add(7);
        arrayList.add(16);
        return arrayList;
    }

    public static List<Integer> b() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR.value()));
        arrayList.add(10008);
        arrayList.add(9);
        return arrayList;
    }

    public static void d(final String str, H5ProWebView h5ProWebView) {
        if (h5ProWebView == null) {
            ReleaseLogUtil.d(str, "refreshH5 mWebView is null");
        } else {
            ReleaseLogUtil.c(str, "refreshH5");
            h5ProWebView.execJs("window.nativeEvent&&window.nativeEvent('onResume')", new H5ProExecJsValueCbk() { // from class: qds
                @Override // com.huawei.health.h5pro.vengine.H5ProExecJsValueCbk
                public final void onReceiveValue(String str2) {
                    ReleaseLogUtil.c(str, "refreshH5 onReceiveValue string ", str2);
                }
            });
        }
    }

    public static void c(String str, H5ProWebView h5ProWebView, List<H5ProWebView> list) {
        if (h5ProWebView == null) {
            ReleaseLogUtil.d(str, "onDetachedFromWindow mWebView is null");
            return;
        }
        h5ProWebView.onDetachedFromWindow();
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d(str, "onDetachedFromWindow h5ProWebViewList ", list);
            return;
        }
        for (H5ProWebView h5ProWebView2 : list) {
            if (h5ProWebView2 == null) {
                ReleaseLogUtil.d(str, "onDetachedFromWindow webView is null");
            } else {
                h5ProWebView2.onDetachedFromWindow();
            }
        }
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.d("R_SummaryUtil", "isSupportShowSummary name ", str2);
            return false;
        }
        qee qeeVar = (qee) HiJsonUtil.d(str, qee.class);
        if (qeeVar == null) {
            ReleaseLogUtil.d("R_SummaryUtil", "isSupportShowSummary summaryResponse is null name ", str2);
            return false;
        }
        qdw qdwVarA = qeeVar.a();
        if (qdwVarA == null) {
            ReleaseLogUtil.d("R_SummaryUtil", "isSupportShowSummary highlights is null");
            return false;
        }
        List<qdx> listD = qdwVarA.d();
        if (CollectionUtils.a(listD)) {
            ReleaseLogUtil.d("R_SummaryUtil", "isSupportShowSummary list ", listD);
            return false;
        }
        for (qdx qdxVar : listD) {
            if (qdxVar == null) {
                ReleaseLogUtil.d("R_SummaryUtil", "isSupportShowSummary domainTopCardId is null");
            } else if (Objects.equals(str2, qdxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public static int d(qdw qdwVar, String str) {
        if (qdwVar == null) {
            ReleaseLogUtil.d("SummaryUtil", "getCardId highlights is null");
            return 0;
        }
        List<qdx> listD = qdwVar.d();
        if (CollectionUtils.a(listD)) {
            ReleaseLogUtil.d("SummaryUtil", "getCardId domainTopCardIdList ", listD);
            return 0;
        }
        for (qdx qdxVar : listD) {
            if (qdxVar == null) {
                LogUtil.e("SummaryUtil", "getCardId domainTopCardId is null");
            } else if (!TextUtils.isEmpty(str) && !str.equals(qdxVar.c())) {
                LogUtil.e("SummaryUtil", "getCardId name ", str, " domainTopCardId ", qdxVar);
            } else {
                List<Integer> listA = qdxVar.a();
                if (CollectionUtils.a(listA)) {
                    LogUtil.e("SummaryUtil", "getCardId cardIdList ", listA, " domainTopCardId ", qdxVar, " name ", str);
                } else {
                    Integer num = listA.get(0);
                    if (num == null) {
                        LogUtil.e("SummaryUtil", "getCardId cardIdInteger is null");
                    } else {
                        return num.intValue();
                    }
                }
            }
        }
        return 0;
    }

    private static qdq e(qdw qdwVar, int i2) {
        if (qdwVar == null) {
            ReleaseLogUtil.d("SummaryUtil", "getDomainCard highlights is null");
            return null;
        }
        List<qdq> listA = qdwVar.a();
        if (CollectionUtils.a(listA)) {
            ReleaseLogUtil.d("SummaryUtil", "getDomainCard domainCardList ", listA);
            return null;
        }
        for (qdq qdqVar : listA) {
            if (qdqVar == null) {
                LogUtil.e("SummaryUtil", "getCardId domainCard is null");
            } else if (i2 == qdqVar.b()) {
                return qdqVar;
            }
        }
        LogUtil.e("SummaryUtil", "getCardId domainCard is null");
        return null;
    }

    public static int a(qdw qdwVar) {
        LogUtil.b("SummaryUtil", "getBodyReadinessValue cardId 20311");
        qdq qdqVarE = e(qdwVar, 20311);
        if (qdqVarE == null || qdqVarE.c() == null) {
            return -1;
        }
        return qdqVarE.c().d();
    }

    public static int c(int i2) {
        LogUtil.b("SummaryUtil", "getBodyReadinessGrade bodyReadinessValue " + i2);
        if (i2 < 0 || i2 > 100) {
            return -1;
        }
        if (i2 >= 90) {
            return 4;
        }
        if (i2 >= 80) {
            return 3;
        }
        if (i2 >= 70) {
            return 2;
        }
        return i2 >= 60 ? 1 : 0;
    }

    public static int b(int i2) {
        return f46022c.get(i2);
    }

    public static int d(int i2) {
        return d.get(i2);
    }

    public static String d(qdw qdwVar, int i2) {
        qdq qdqVarE = e(qdwVar, i2);
        if (qdqVarE == null) {
            ReleaseLogUtil.d("SummaryUtil", "getActiveRecordText domainCard is null");
            return "";
        }
        qdr qdrVarC = qdqVarE.c();
        if (qdrVarC == null) {
            ReleaseLogUtil.d("SummaryUtil", "getActiveRecordText data is null");
            return "";
        }
        int i3 = qdrVarC.i();
        String strE = qdqVarE.e();
        String strA = qdqVarE.a();
        if (!"week".equals(strE) || TextUtils.isEmpty(strA)) {
            return qre.f(i.get(i3));
        }
        if (strA.equals("activityRingChart")) {
            int iC = qdrVarC.c();
            if (iC <= 0) {
                return qre.f(i.get(i3));
            }
            return qre.e(j.get(i3), iC, UnitUtil.e(iC, 1, 0));
        }
        Pair<Double, Integer> pairC = c(qdrVarC);
        return qre.e(j.get(i3), ((Double) pairC.first).intValue(), UnitUtil.e(((Double) pairC.first).doubleValue(), 1, ((Integer) pairC.second).intValue()));
    }

    public static String b(qdw qdwVar, int i2) {
        qdq qdqVarE = e(qdwVar, i2);
        if (qdqVarE == null) {
            ReleaseLogUtil.d("SummaryUtil", "getBloodPressureText domainCard is null");
            return "";
        }
        qdr qdrVarC = qdqVarE.c();
        if (qdrVarC == null) {
            ReleaseLogUtil.d("SummaryUtil", "getBloodPressureText data is null");
            return "";
        }
        int i3 = qdrVarC.i();
        String strE = qdqVarE.e();
        if (qdqVarE.a().equals("dualDotLineChart") && "week".equals(strE)) {
            return qre.a(i.get(i3), UnitUtil.e(qdrVarC.g(), 1, 0), UnitUtil.e(qdrVarC.a(), 1, 0));
        }
        return qre.f(i.get(i3));
    }

    public static String a(qdw qdwVar, int i2) {
        qdq qdqVarE = e(qdwVar, i2);
        if (qdqVarE == null) {
            ReleaseLogUtil.d("SummaryUtil", "getHealthHeartText domainCard is null");
            return "";
        }
        qdr qdrVarC = qdqVarE.c();
        if (qdrVarC == null) {
            ReleaseLogUtil.d("SummaryUtil", "getHealthHeartText data is null");
            return "";
        }
        int i3 = qdrVarC.i();
        Pair<Double, Integer> pairC = c(qdrVarC);
        if (i3 != 116201 && i3 != 116203 && i3 != 115212) {
            return qre.a(i.get(i3), UnitUtil.e(((Double) pairC.first).doubleValue(), i3 == 115211 ? 2 : 1, ((Integer) pairC.second).intValue()));
        }
        if (i3 == 116203 || i3 == 115212) {
            return qre.e(j.get(i3), qdrVarC.e(), UnitUtil.e(qdrVarC.e(), 1, 0));
        }
        return qre.e(j.get(i3), ((Double) pairC.first).intValue(), UnitUtil.e(((Double) pairC.first).doubleValue(), 1, ((Integer) pairC.second).intValue()));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[PHI: r0
      0x0010: PHI (r0v6 java.lang.String) = (r0v4 java.lang.String), (r0v7 java.lang.String) binds: [B:10:0x0020, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public static int e(String str, String str2) {
        String str3;
        if ("emotionalHealth".equals(str)) {
            str3 = "stress";
            if ("stress".equals(str2)) {
                str = str3;
            } else if ("running".equals(str)) {
                str3 = "vo2max";
                if ("vo2max".equals(str2)) {
                    str = str3;
                }
            }
        } else if ("running".equals(str)) {
            str3 = "vo2max";
            if ("vo2max".equals(str2)) {
                str = str3;
            }
        }
        HashMap<String, Integer> map = f46020a;
        if (map.get(str) == null) {
            return 0;
        }
        return map.get(str).intValue();
    }

    public static int c(String str) {
        HashMap<String, Integer> map = h;
        if (map.get(str) == null) {
            return 0;
        }
        if (ipc.c()) {
            HashMap<String, Integer> map2 = f46021b;
            if (map2.containsKey(str)) {
                return map2.get(str).intValue();
            }
        }
        return map.get(str).intValue();
    }

    public static int a(int i2) {
        return f.get(i2);
    }

    public static int b(String str) {
        HashMap<String, Integer> map = g;
        if (map.get(str) == null) {
            return 0;
        }
        return map.get(str).intValue();
    }

    public static String c(qdw qdwVar, int i2) {
        qdq qdqVarE = e(qdwVar, i2);
        if (qdqVarE == null) {
            ReleaseLogUtil.d("SummaryUtil", "getEmotionHealthText domainCard is null");
            return "";
        }
        qdr qdrVarC = qdqVarE.c();
        if (qdrVarC == null) {
            ReleaseLogUtil.d("SummaryUtil", "getEmotionHealthText data is null");
            return "";
        }
        int i3 = qdrVarC.i();
        String strE = qdqVarE.e();
        if ("dotLineChart".equals(qdqVarE.a()) && "week".equals(strE)) {
            int i4 = (i3 < 171211 || i3 > 171215) ? 2 : 1;
            Pair<Double, Integer> pairC = c(qdrVarC);
            return qre.a(i.get(i3), UnitUtil.e(((Double) pairC.first).doubleValue(), i4, ((Integer) pairC.second).intValue()));
        }
        return qre.f(i.get(i3));
    }

    private static Pair<Double, Integer> c(qdr qdrVar) {
        String strB = qdrVar.b();
        double d2 = 0.0d;
        int i2 = 0;
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.b("SummaryUtil", "getMeanPair mean: ", strB);
            return new Pair<>(Double.valueOf(0.0d), 0);
        }
        try {
            d2 = Integer.parseInt(strB);
        } catch (NumberFormatException e2) {
            ReleaseLogUtil.d("SummaryUtil", ExceptionUtils.c(e2));
            try {
                d2 = Double.parseDouble(strB);
                i2 = 2;
            } catch (NumberFormatException e3) {
                ReleaseLogUtil.b("SummaryUtil", ExceptionUtils.c(e3));
            }
        }
        return new Pair<>(Double.valueOf(d2), Integer.valueOf(i2));
    }

    public static void a(String str) {
        e = new Pair<>(Long.valueOf(System.currentTimeMillis()), str);
    }

    public static boolean j() {
        return lua.a(String.valueOf(10100), "healthInsightsSwitch", false);
    }

    public static void d(String str) {
        lua.f(String.valueOf(10100), Constants.HEALTH_INSIGHTS, str);
    }

    public static qee f() {
        String strE = lua.e(String.valueOf(10100), Constants.HEALTH_INSIGHTS, "");
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return (qee) HiJsonUtil.d(strE, qee.class);
    }

    public static boolean e(String str) {
        String strE = lua.e(String.valueOf(10100), Constants.HEALTH_INSIGHTS, "");
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(strE)) || TextUtils.isEmpty(str)) {
            return false;
        }
        return !str.equals(strE);
    }

    public static Pair<Long, String> h() {
        return e;
    }

    public static void s() {
        o = true;
    }

    public static boolean l() {
        return o;
    }

    public static void p() {
        m = true;
    }

    public static boolean n() {
        return m;
    }

    public static void t() {
        l = true;
    }

    public static boolean o() {
        return l;
    }

    public static void r() {
        r = true;
    }

    public static boolean m() {
        return r;
    }

    public static void y() {
        e = null;
        o = false;
        m = false;
        l = false;
        r = false;
    }

    public static List<Integer> d() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(5);
        return arrayList;
    }

    public static void w() {
        long jV = v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC = c();
        Long l2 = k;
        if (jCurrentTimeMillis - jV < l2.longValue() || jCurrentTimeMillis - jC < l2.longValue()) {
            LogUtil.e("SummaryUtil", "Less than the number of minutes since the last sync, given by the condition");
            return;
        }
        c(jCurrentTimeMillis);
        LogUtil.b("SummaryUtil", "start sync");
        a(Long.valueOf(jCurrentTimeMillis), Long.valueOf(jV));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(long j2) {
        LogUtil.b("SummaryUtil", "setLongForSharedPreferences key ", "SLEEP_SUMMARY_LAST_SYNC_TIME", " value ", Long.valueOf(j2));
        SharedPreferenceManager.c(Integer.toString(PrebakedEffectId.RT_COIN_DROP), "SLEEP_SUMMARY_LAST_SYNC_TIME", j2);
    }

    private static long v() {
        return SharedPreferenceManager.d(Integer.toString(PrebakedEffectId.RT_COIN_DROP), "SLEEP_SUMMARY_LAST_SYNC_TIME", 0L);
    }

    public static void a(final List<String> list, final int i2) {
        if (CollectionUtils.a(list)) {
            LogUtil.e("SummaryUtil", "list is empty");
        } else if (!q()) {
            LogUtil.e("SummaryUtil", "is not Support Summary");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: qdo
                @Override // java.lang.Runnable
                public final void run() {
                    qdm.c((List<String>) list, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final List<String> list, final int i2) {
        qdh.b(new ResponseCallback() { // from class: qdp
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i3, Object obj) {
                qdm.c(i2, list, i3, (qdw) obj);
            }
        });
    }

    static /* synthetic */ void c(int i2, List list, int i3, qdw qdwVar) {
        LogUtil.b("SummaryUtil", "getSummaryToCard totalCardSize ", Integer.valueOf(i2), " errorCode ", Integer.valueOf(i3), " highlights ", qdwVar);
        HashMap map = new HashMap();
        if (list.contains("activityRings")) {
            int iD = d(qdwVar, "activityRings");
            String strD = d(qdwVar, iD);
            if (!TextUtils.isEmpty(strD)) {
                map.put("activityRings", new Pair(Integer.valueOf(iD), strD));
            }
        }
        if (list.contains(MessageConstant.BLOOD_PRESSURE_TYPE)) {
            int iD2 = d(qdwVar, MessageConstant.BLOOD_PRESSURE_TYPE);
            String strB = b(qdwVar, iD2);
            if (!TextUtils.isEmpty(strB)) {
                map.put(MessageConstant.BLOOD_PRESSURE_TYPE, new Pair(Integer.valueOf(iD2), strB));
            }
        }
        if (list.contains("emotionalHealth")) {
            int iD3 = d(qdwVar, "emotionalHealth");
            String strC = c(qdwVar, iD3);
            if (!TextUtils.isEmpty(strC)) {
                map.put("emotionalHealth", new Pair(Integer.valueOf(iD3), strC));
            }
        }
        if (list.contains("heartHealth")) {
            int iD4 = d(qdwVar, "heartHealth");
            String strA = a(qdwVar, iD4);
            if (!TextUtils.isEmpty(strA)) {
                map.put("heartHealth", new Pair(Integer.valueOf(iD4), strA));
            }
        }
        d(map, i3, i2);
    }

    public static void d(HashMap<String, Pair<Integer, String>> map, int i2, int i3) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.shuffle(arrayList);
        int iRound = Math.round(i3 * 0.25f);
        if (iRound > arrayList.size()) {
            iRound = arrayList.size();
        }
        if (iRound == 0) {
            LogUtil.e("SummaryUtil", "size is zero, keyList.size is : ", Integer.valueOf(arrayList.size()), "totalSize is : ", Integer.valueOf(i3));
            return;
        }
        for (int i4 = 0; i4 < iRound; i4++) {
            map2.put((String) arrayList.get(i4), map.get(arrayList.get(i4)));
        }
        ObserverManagerUtil.e(ObserveLabels.SUMMARY_DATA_INIT, Integer.valueOf(i2), map2);
    }

    public static long c() {
        return SharedPreferenceManager.d(Integer.toString(10000), "last_cold_start_sync_time", 0L);
    }

    private static void a(Long l2, final Long l3) {
        d(l2, new HiCommonListener() { // from class: qdm.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i2, Object obj) {
                LogUtil.b("SummaryUtil", "sync success ");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i2, Object obj) {
                LogUtil.b("SummaryUtil", "sync fail , time back", l3);
                qdm.c(l3.longValue());
            }
        });
    }

    private static void d(Long l2, HiCommonListener hiCommonListener) {
        if (q()) {
            HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).synCloud(c(Boolean.TRUE.equals(n) ? g() : a(), l2), hiCommonListener);
            LogUtil.b("SummaryUtil", " syncSleepSummary start:", l2);
        }
    }

    private static HiSyncOption c(List<Integer> list, Long l2) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncId(l2.longValue());
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncDataTypes(list);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncScope(1);
        return hiSyncOption;
    }

    public static void e(Object obj) {
        n = Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
    }

    public static Boolean e() {
        return n;
    }

    public static void d(String str, boolean z) {
        HashMap map = new HashMap(3);
        map.put("event", 0);
        map.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
        map.put(ParamConstants.Param.VIEW_TYPE, "day_view");
        if (z) {
            map.put("entrance", "e1");
        }
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        if (!TextUtils.isEmpty(str)) {
            HashMap map2 = new HashMap(1);
            map2.put("pageId", str);
            lmnVar.d(map2);
        }
        lmf.d().a(BaseApplication.b(), AnalyticsValue.SUMMARY_EXPOSURE_H2010222003.value(), lmnVar, 0);
    }

    public static List<Integer> i() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_RECORD.value()));
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(10007);
        return arrayList;
    }
}

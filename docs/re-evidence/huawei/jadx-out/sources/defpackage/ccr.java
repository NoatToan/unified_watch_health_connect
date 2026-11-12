package defpackage;

import android.util.SparseArray;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.bean.ChallengeConfigBean;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class ccr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Integer> f1477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, Integer> f1478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f1479c;
    private static final Map<Integer, Integer> d;
    private static final Map<Integer, Integer> e;

    static {
        HashMap map = new HashMap();
        f1477a = map;
        HashMap map2 = new HashMap();
        e = map2;
        HashMap map3 = new HashMap();
        d = map3;
        HashMap map4 = new HashMap();
        f1478b = map4;
        HashMap map5 = new HashMap();
        f1479c = map5;
        Integer numValueOf = Integer.valueOf(AwarenessConstants.ERROR_NO_PERMISSION_CODE);
        map.put(numValueOf, Integer.valueOf(R.string.IDS_health_goal_free_matching));
        Integer numValueOf2 = Integer.valueOf(AwarenessConstants.ERROR_INVALID_FREQUENCY_CODE);
        map.put(numValueOf2, Integer.valueOf(R.string.IDS_challenge_anxiety_name));
        Integer numValueOf3 = Integer.valueOf(AwarenessConstants.ERROR_TIMEOUT_CODE);
        map.put(numValueOf3, Integer.valueOf(R.string.IDS_health_goal_weight));
        Integer numValueOf4 = Integer.valueOf(AwarenessConstants.ERROR_UNKNOWN_CODE);
        map.put(numValueOf4, Integer.valueOf(R.string.IDS_challenge_sleep_name));
        Integer numValueOf5 = Integer.valueOf(AwarenessConstants.ERROR_LIMITED_REGISTRY_CODE);
        map.put(numValueOf5, Integer.valueOf(R.string.IDS_challenge_immunity_name));
        Integer numValueOf6 = Integer.valueOf(AwarenessConstants.ERROR_CANCEL_REGISTRY_CODE);
        map.put(numValueOf6, Integer.valueOf(R.string.IDS_health_goal_blood_pressure));
        Integer numValueOf7 = Integer.valueOf(AwarenessConstants.ERROR_PARAMETER_CODE);
        map.put(numValueOf7, Integer.valueOf(R.string.IDS_health_goal_blood_pressure));
        Integer numValueOf8 = Integer.valueOf(AwarenessConstants.ERROR_REGISTER_SAME_FENCE_CODE);
        map.put(numValueOf8, Integer.valueOf(R.string.IDS_health_goal_blood_pressure));
        map2.put(numValueOf, Integer.valueOf(R.string.IDS_health_goal_free_matching_join));
        map2.put(numValueOf2, Integer.valueOf(R.string.IDS_plan_anxiety_title));
        map2.put(numValueOf3, Integer.valueOf(R.string.IDS_plan_weight_title_new));
        map2.put(numValueOf4, Integer.valueOf(R.string.IDS_plan_sleep_title));
        map2.put(numValueOf5, Integer.valueOf(R.string.IDS_plan_immunity_title));
        map2.put(numValueOf6, Integer.valueOf(R.string.IDS_blood_pressure_plan_title));
        map2.put(numValueOf7, Integer.valueOf(R.string.IDS_blood_pressure_plan_title));
        map2.put(numValueOf8, Integer.valueOf(R.string.IDS_blood_pressure_plan_title));
        map3.put(numValueOf2, Integer.valueOf(R.string.IDS_share_relieve_anxiety));
        map3.put(numValueOf3, Integer.valueOf(R.string.IDS_share_managing_weight));
        map3.put(numValueOf4, Integer.valueOf(R.string.IDS_share_improves_sleep));
        map3.put(numValueOf5, Integer.valueOf(R.string.IDS_share_immunity));
        map4.put(numValueOf, Integer.valueOf(R.string.IDS_health_goal_free_matching));
        map4.put(numValueOf2, Integer.valueOf(R.string.IDS_challenge_anxiety_name));
        map4.put(numValueOf3, Integer.valueOf(R.string.IDS_health_goal_weight));
        map4.put(numValueOf4, Integer.valueOf(R.string.IDS_challenge_sleep_name));
        map4.put(numValueOf5, Integer.valueOf(R.string.IDS_challenge_immunity_name));
        map4.put(numValueOf6, Integer.valueOf(R.string.IDS_health_goal_blood_pressure));
        map5.put(numValueOf, Integer.valueOf(R.string.IDS_health_goal_free_matching_desc));
        map5.put(numValueOf2, Integer.valueOf(R.string.IDS_health_goal_anxiety_desc));
        map5.put(numValueOf3, Integer.valueOf(R.string.IDS_health_goal_weight_desc));
        map5.put(numValueOf4, Integer.valueOf(R.string.IDS_health_goal_sleep_desc));
        map5.put(numValueOf5, Integer.valueOf(R.string.IDS_health_goal_immunity_desc));
        map5.put(numValueOf6, Integer.valueOf(R.string.IDS_health_goal_blood_pressure_desc));
    }

    public static int e() {
        SparseArray<ChallengeConfigBean> sparseArrayD = byu.c().d();
        if (sparseArrayD == null) {
            LogUtil.j("HL_HealthChallengeUtil", "load sparseArray is null");
            return 0;
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < sparseArrayD.size(); i++) {
            int iKeyAt = sparseArrayD.keyAt(i);
            if (iKeyAt != 200001) {
                arrayList.add(Integer.valueOf(iKeyAt));
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HL_HealthChallengeUtil", "load arrayList is empty");
            return 0;
        }
        return ((Integer) arrayList.get(qrf.d(arrayList.size()))).intValue();
    }

    public static ChallengeConfigBean d(int i) {
        return byu.c().c(i);
    }

    public static String b(int i, int i2) {
        Map<Integer, Integer> map = e;
        if (map.containsKey(Integer.valueOf(i))) {
            return String.format(Locale.ENGLISH, qre.f(map.get(Integer.valueOf(i)).intValue()), qre.e(R.plurals.IDS_day_no_space, i2, Integer.valueOf(i2)));
        }
        return "";
    }

    public static String a(int i) {
        Map<Integer, Integer> map = f1477a;
        if (map.containsKey(Integer.valueOf(i))) {
            return qre.f(map.get(Integer.valueOf(i)).intValue());
        }
        return "";
    }

    public static String c(int i) {
        Map<Integer, Integer> map = d;
        if (map.containsKey(Integer.valueOf(i))) {
            return qre.f(map.get(Integer.valueOf(i)).intValue());
        }
        return "";
    }

    public static String a() {
        return ccl.d().b() + "image/health_model_challenge_share.webp";
    }

    public static List<String> b(int i) {
        LogUtil.a("HL_HealthChallengeUtil", "isPlanTask challengeId= ", Integer.valueOf(i));
        ChallengeConfigBean challengeConfigBeanD = d(i);
        if (challengeConfigBeanD == null) {
            return new ArrayList();
        }
        return challengeConfigBeanD.getChallengeTaskId();
    }

    public static boolean d(int i, int i2) {
        LogUtil.a("HL_HealthChallengeUtil", "isPlanTask challengeId= ", Integer.valueOf(i), ",taskId= ", Integer.valueOf(i2));
        List<String> listB = b(i);
        return njy.b(listB) && listB.contains(String.valueOf(i2));
    }

    public static List<can> d() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayListB = ffv.b(R.array.health_plan_select_id);
        if (!njy.e(arrayListB)) {
            for (Integer num : arrayListB) {
                int iIntValue = num.intValue();
                can canVar = new can();
                canVar.d(iIntValue);
                canVar.c(qre.f(f1478b.get(num).intValue()));
                canVar.a(qre.f(f1479c.get(num).intValue()));
                canVar.c(0);
                arrayList.add(canVar);
            }
        }
        return arrayList;
    }

    public static String e(int i) {
        String str;
        ArrayList<Integer> arrayListA = cbg.a();
        if (njy.b(arrayListA) && arrayListA.contains(Integer.valueOf(i))) {
            str = "BasicSurvey";
        } else {
            str = "ManagePlan";
        }
        return Constants.H5PRO_PAGE_PREFIX + str + "?index=" + i + "&from=2";
    }
}

package defpackage;

import android.text.TextUtils;
import com.huawei.basichealthmodel.R;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cda {
    public static boolean b() {
        String strC = ccy.c("health_model_challenge_join");
        LogUtil.d("HL_HealthModelChallengeUtils", "isJoinHealthChallenge join = ", strC);
        return "1".equals(strC);
    }

    public static boolean c() {
        return (!"1".equals(ccy.c("health_model_first_join_challenge")) || String.valueOf(true).equals(ccy.c("health_model_twice_same_challenge")) || String.valueOf(AwarenessConstants.ERROR_NO_PERMISSION_CODE).equals(ccy.c("health_model_challenge_id"))) ? false : true;
    }

    public static void a() {
        ccy.d("health_model_challenge_join", "");
        ccy.d("health_model_first_join_challenge", "");
        ccy.d("health_model_twice_same_challenge", "");
        ccy.d("health_model_challenge_id", "");
        ccy.d("health_model_current_challenge_join_time", "");
    }

    public static ArrayList<Integer> d() {
        return ffv.b(R.array.health_plan_id);
    }

    public static boolean a(int i) {
        ArrayList<Integer> arrayListD = d();
        if (njy.e(arrayListD)) {
            return false;
        }
        return arrayListD.contains(Integer.valueOf(i));
    }

    public static boolean c(List<HealthLifeBean> list) {
        HealthLifeBean next;
        if (njy.e(list)) {
            LogUtil.j("HL_HealthModelChallengeUtils", "isBloodPressureGoal list is empty");
            return cbg.v();
        }
        Iterator<HealthLifeBean> it = list.iterator();
        int challengeId = 0;
        while (it.hasNext() && ((next = it.next()) == null || 5 != next.getId() || (challengeId = next.getChallengeId()) <= 0)) {
        }
        if (challengeId == 0) {
            LogUtil.a("HL_HealthModelChallengeUtils", "isBloodPressureGoal not add challengeId field");
            return cbg.v();
        }
        return cbg.a().contains(Integer.valueOf(challengeId));
    }

    public static boolean e() {
        boolean z = cbg.z();
        boolean zB = b();
        boolean zIsEmpty = TextUtils.isEmpty(ccy.c("health_model_challenge_id"));
        LogUtil.a("HL_HealthModelChallengeUtils", "isJoinHealthGoal isDoctorPlan= ", Boolean.valueOf(z), ",isJoinChallenge= ", Boolean.valueOf(zB), ",isValidGoal=", Boolean.valueOf(!zIsEmpty));
        return (zB && !zIsEmpty) || z;
    }
}

package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basichealthmodel.bean.ChallengeConfigBean;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ccg {
    public static int a() {
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

    public static ChallengeConfigBean c(int i) {
        return byu.c().c(i);
    }

    public static List<String> d(int i) {
        LogUtil.a("HL_HealthChallengeUtil", "isPlanTask challengeId= ", Integer.valueOf(i));
        ChallengeConfigBean challengeConfigBeanC = c(i);
        if (challengeConfigBeanC == null) {
            return new ArrayList();
        }
        return challengeConfigBeanC.getChallengeTaskId();
    }

    public static boolean c(int i, int i2) {
        LogUtil.a("HL_HealthChallengeUtil", "isPlanTask challengeId= ", Integer.valueOf(i), ",taskId= ", Integer.valueOf(i2));
        List<String> listD = d(i);
        return njy.b(listD) && listD.contains(String.valueOf(i2));
    }

    public static boolean d() {
        boolean z = cbg.z();
        boolean zB = cda.b();
        boolean zIsEmpty = TextUtils.isEmpty(ccy.c("health_model_challenge_id"));
        LogUtil.a("HL_HealthChallengeUtil", "isJoinHealthGoal isDoctorPlan= ", Boolean.valueOf(z), ",isJoinChallenge= ", Boolean.valueOf(zB), ",isValidGoal=", Boolean.valueOf(!zIsEmpty));
        return (zB && !zIsEmpty) || z;
    }
}

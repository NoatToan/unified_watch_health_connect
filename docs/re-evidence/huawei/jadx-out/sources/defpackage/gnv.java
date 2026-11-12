package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gnv {
    public static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        if ("RUNNING_COURSE".equals(str)) {
            arrayList.add(3);
            arrayList.add(2);
            return arrayList;
        }
        if ("FITNESS_COURSE".equals(str)) {
            arrayList.add(1);
        }
        return arrayList;
    }

    public static boolean d(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "personalized_recommend");
        LogUtil.a("PlanService_FitnessCommonUtil", "productRecommend = ", strE);
        return "1".equals(strE);
    }
}

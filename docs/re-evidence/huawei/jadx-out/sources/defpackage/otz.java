package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import java.util.Date;

/* JADX INFO: loaded from: classes13.dex */
public class otz {
    public static boolean e(MedalConfigInfo medalConfigInfo, Context context, long j, long j2) {
        if (medalConfigInfo != null && medalConfigInfo.acquireActionType() == 13) {
            return b(medalConfigInfo, context, j, j2);
        }
        return false;
    }

    private static boolean b(MedalConfigInfo medalConfigInfo, Context context, long j, long j2) {
        LogUtil.a("PLGACHIEVE_AchievePeriodMedalService", "enter dealFitnessMedal");
        if (1 == medalConfigInfo.acquireMedalUnit()) {
            int totalFitDuration = oru.a(context).getAdapter().getTotalFitDuration(new Date(oun.a(j, true)), new Date(oun.a(j2, false)));
            int iAcquireMedalLevel = medalConfigInfo.acquireMedalLevel();
            LogUtil.a("PLGACHIEVE_AchievePeriodMedalService", "dealFitnessMedal medalLevel=", Integer.valueOf(iAcquireMedalLevel), "duration=", Integer.valueOf(totalFitDuration));
            if (totalFitDuration >= iAcquireMedalLevel) {
                return true;
            }
        }
        return false;
    }
}

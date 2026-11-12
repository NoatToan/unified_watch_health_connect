package defpackage;

import com.huawei.health.suggestion.ui.fitness.module.LongCoachView;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class hke {
    public static void d(LongCoachView longCoachView, Motion motion) {
        if (longCoachView == null || motion == null) {
            LogUtil.j("Suggestion_LongViewGoHelper", "stateGo coachView == null || currMotion == null");
            return;
        }
        LogUtil.a("Suggestion_LongViewGoHelper", "state go");
        longCoachView.a().a(257);
        longCoachView.i(257);
        if (njy.e(motion.getVideoSegments(), 0)) {
            LogUtil.j("Suggestion_LongViewGoHelper", "stateGo motion getVideoSegment is empty");
            return;
        }
        int duration = motion.getVideoSegments().get(0).getDuration();
        if ("timer".equals(motion.acquireMotionType())) {
            longCoachView.setTimeView(0, duration, true);
        } else {
            longCoachView.setTimeView(0, motion.acquireRepeat(), false);
        }
    }
}

package defpackage;

import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class hit {
    private static final long d = TimeUnit.HOURS.toSeconds(1);

    public static float b(Motion motion, int i, float f) {
        float fD = hiz.d(motion, i);
        if (fD < 0.0f) {
            fD = 0.0f;
        }
        return ((((((fD * motion.acquireCalorie()) * motion.acquireDuration()) * motion.acquireGroups()) * f) / 1.0f) / 1000.0f) + 0.0f;
    }

    public static float d(Motion motion, int i, float f) {
        float fD = hiz.d(motion, i);
        if (fD < 0.0f) {
            fD = 0.0f;
        }
        return a(((fD * motion.acquireDuration()) * motion.acquireGroups()) / 1000.0f, 1.3f, f);
    }

    public static float a(float f, float f2, float f3) {
        return (((f * f2) * 1000.0f) * f3) / d;
    }

    public static float c(int i, Motion motion, float f) {
        if (CommonUtil.b(motion.acquireDuration())) {
            return 0.0f;
        }
        return (i / motion.acquireDuration()) * a(motion, f);
    }

    public static float e(int i, Motion motion, float f) {
        if (CommonUtil.b(motion.acquireDuration())) {
            return 0.0f;
        }
        return (i / motion.acquireDuration()) * a(motion.getVideoSegments().get(0).getDuration(), 1.3f, f);
    }

    public static float d(List<Motion> list, float f, boolean z) {
        float fA = 0.0f;
        if (njy.e(list)) {
            return 0.0f;
        }
        for (Motion motion : list) {
            if (z) {
                fA += a(motion, f);
            } else {
                fA += ((((motion.acquireCalorie() * motion.acquireDuration()) * motion.acquireGroups()) * f) / 1.0f) / 1000.0f;
            }
        }
        LogUtil.a("Suggestion_CaloriesCountHelper", "getTotalCalories ", Float.valueOf(fA));
        return fA;
    }

    public static float a(Motion motion, float f) {
        if (motion == null) {
            return 0.0f;
        }
        if (njy.e(motion.getVideoSegments(), 0)) {
            LogUtil.j("Suggestion_CaloriesCountHelper", "calCalories() motion videoSegment is empty");
            return 0.0f;
        }
        float fAcquireCalorie = (motion.acquireCalorie() * motion.getVideoSegments().get(0).getDuration() * f) + 0.0f;
        LogUtil.a("Suggestion_CaloriesCountHelper", "getCurrentMotionCalCalories ", Float.valueOf(fAcquireCalorie), " ", Integer.valueOf(motion.getVideoSegments().get(0).getDuration()), "motion calorie:", Float.valueOf(motion.acquireCalorie()));
        return fAcquireCalorie;
    }

    public static float e(List<Motion> list, float f) {
        LogUtil.a("Suggestion_CaloriesCountHelper", "getShouldBurnCalories weight", Float.valueOf(f), " motions:", peh.c(list));
        float fAcquireCalorie = 0.0f;
        for (Motion motion : list) {
            if (motion != null) {
                fAcquireCalorie += (((motion.acquireCalorie() * motion.acquireDuration()) * Math.max(motion.acquireGroups(), 1)) * f) / 1000.0f;
            }
        }
        return fAcquireCalorie;
    }
}

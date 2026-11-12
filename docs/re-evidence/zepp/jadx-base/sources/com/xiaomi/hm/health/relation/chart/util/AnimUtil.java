package com.xiaomi.hm.health.relation.chart.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class AnimUtil {
    public static final int DURATION_CHART_STEP_SLEEP_SWITCH = 300;
    private static final String a = "Chart.AnimUtil";

    public static class AnimSetBuilder {
        private static Animator a;
        private static ArrayList<Animator> b = new ArrayList<>();

        private AnimSetBuilder() {
        }

        private static void a() {
            a = null;
            b.clear();
        }

        public static void addAnim(Animator animator) {
            b.add(animator);
        }

        public static AnimatorSet build() {
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder builderPlay = animatorSet.play(a);
            Iterator<Animator> it2 = b.iterator();
            while (it2.hasNext()) {
                builderPlay.with(it2.next());
            }
            a();
            return animatorSet;
        }

        public static void setFirstAnim(Animator animator) {
            a = animator;
        }
    }
}

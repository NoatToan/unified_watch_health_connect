package com.huawei.threecircle;

import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes3.dex */
public class ThreeCircleConfigUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f23180c;

    public enum ThreeCircleConfig {
        STEP(0),
        CALORIE(1),
        INTENSITY(1),
        ACTIVE_HOUR(1);

        private final int mIsJoin;

        ThreeCircleConfig(int i) {
            this.mIsJoin = i;
        }

        public int getType() {
            return this.mIsJoin;
        }
    }

    public static boolean a(ThreeCircleConfig threeCircleConfig) {
        for (ThreeCircleConfig threeCircleConfig2 : ThreeCircleConfig.values()) {
            if (threeCircleConfig2 == threeCircleConfig) {
                return threeCircleConfig2.mIsJoin == 1;
            }
        }
        return false;
    }

    public static void c() {
        SharedPreferenceManager.a(Integer.toString(10000), "NEW_THREE_LEAF_CIRCLE_GUIDE_SHOWN", true);
    }

    public static boolean e() {
        return SharedPreferenceManager.b(Integer.toString(10000), "NEW_THREE_LEAF_CIRCLE_GUIDE_SHOWN", false);
    }

    public static boolean a() {
        return f23180c;
    }

    public static void a(boolean z) {
        f23180c = z;
    }
}

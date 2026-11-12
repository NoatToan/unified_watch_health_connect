package com.garmin.android.apps.connectmobile.activities.newmodel;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/g0;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g0 {
    ACTIVE("INTERVAL_ACTIVE", R.string.allday_stress_active),
    REST("INTERVAL_REST", R.string.workout_step_type_rest),
    WARMUP("INTERVAL_WARMUP", R.string.workout_step_type_warmup),
    WALK("INTERVAL_WALK", R.string.activity_options_walk_title),
    COOLDOWN("INTERVAL_COOLDOWN", R.string.workout_step_type_cooldown),
    RECOVERY("INTERVAL_RECOVERY", R.string.workout_step_type_recovery),
    OTHER("INTERVAL_OTHER", R.string.workout_step_type_other),
    DIVE_INTERVAL_DYN("DYNAMIC_APNEA_DIVE", R.string.pool_apnea_dyn),
    /* JADX INFO: Fake field, exist only in values array */
    DIVE_INTERVAL_STA("DYNAMIC_APNEA_STA", R.string.pool_apnea_sta),
    /* JADX INFO: Fake field, exist only in values array */
    DIVE_INTERVAL_REST("DYNAMIC_APNEA_REST", R.string.workout_step_type_rest);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29436c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29447b;

    g0(String str, int i14) {
        this.f29446a = str;
        this.f29447b = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF29446a() {
        return this.f29446a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/g0$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0019  */
        /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
        public static g0 a(String str) {
            for (g0 g0Var : g0.values()) {
                if (p005kotlin.jvm.internal.s.g(g0Var.f29446a, str)) {
                    if (g0Var == null) {
                        return g0.OTHER;
                    }
                    return g0Var;
                }
            }
            g0Var = null;
            if (g0Var == null) {
                return g0.OTHER;
            }
            return g0Var;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0033 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x0035 A[RETURN] */
        public static boolean b(String str) {
            for (Object obj : p13.x.k(g0.ACTIVE, g0.WALK, g0.REST, g0.WARMUP, g0.COOLDOWN, g0.RECOVERY, g0.OTHER)) {
                if (p005kotlin.jvm.internal.s.g(((g0) obj).f29446a, str)) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            obj = null;
            if (obj != null) {
                return true;
            }
            return false;
        }

        private a() {
        }
    }
}

package yg2;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197223a;

        static {
            int[] iArr = new int[mt2.l.values().length];
            try {
                iArr[mt2.l.INTERVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mt2.l.REST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mt2.l.WARM_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mt2.l.COOL_DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mt2.l.RECOVERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mt2.l.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f197223a = iArr;
        }
    }

    public static final int a(h0 h0Var) {
        h0Var.getClass();
        int i14 = a.f197223a[h0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().ordinal()];
        if (i14 == 1) {
            return R.string.lbl_go;
        }
        if (i14 == 2) {
            return R.string.workout_step_type_rest;
        }
        if (i14 != 3) {
            return i14 != 4 ? R.string.lbl_next : R.string.workout_step_type_cooldown;
        }
        return R.string.workout_step_type_warmup;
    }
}

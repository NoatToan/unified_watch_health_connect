package hq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85048a;

        static {
            int[] iArr = new int[am.x0.values().length];
            try {
                iArr[am.x0.f4326r2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[am.x0.f4329s2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[am.x0.f4322q2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[am.x0.f4309n1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[am.x0.f4293j1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[am.x0.C2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f85048a = iArr;
        }
    }

    public static final String a(Context context, am.x0 x0Var) {
        context.getClass();
        int i14 = x0Var == null ? -1 : a.f85048a[x0Var.ordinal()];
        if (i14 == 1 || i14 == 2) {
            String string = context.getString(R.string.lbl_search_moves);
            string.getClass();
            return string;
        }
        if (i14 != 3) {
            String string2 = context.getString(R.string.strength_training_search_exercises);
            string2.getClass();
            return string2;
        }
        String string3 = context.getString(R.string.lbl_poses_search);
        string3.getClass();
        return string3;
    }

    public static final String b(Context context, am.x0 x0Var) {
        context.getClass();
        int i14 = x0Var == null ? -1 : a.f85048a[x0Var.ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.lbl_activity_type_moves, dh.b.A(context, am.x0.f4326r2.f4360c));
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = context.getString(R.string.lbl_mobility_moves);
            string2.getClass();
            return string2;
        }
        if (i14 != 3) {
            String string3 = context.getString(R.string.strength_training_select_exercise);
            string3.getClass();
            return string3;
        }
        String string4 = context.getString(R.string.lbl_yoga_poses);
        string4.getClass();
        return string4;
    }

    public static final boolean c(am.x0 x0Var) {
        int i14 = x0Var == null ? -1 : a.f85048a[x0Var.ordinal()];
        return i14 == 4 || i14 == 5 || i14 == 6;
    }

    public static final boolean d(am.x0 x0Var) {
        int i14 = x0Var == null ? -1 : a.f85048a[x0Var.ordinal()];
        return i14 == 1 || i14 == 2 || i14 == 4 || i14 == 5 || i14 == 6;
    }
}

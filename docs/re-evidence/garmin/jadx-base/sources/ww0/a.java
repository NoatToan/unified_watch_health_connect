package ww0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lww0/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    REGULAR,
    IRREGULAR,
    NONE,
    PREGNANT,
    INACTIVE;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187522a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.IRREGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.PREGNANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.INACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f187522a = iArr;
        }
    }

    static {
        new C3488a(null);
    }

    public final String a(Context context) {
        int i14 = b.f187522a[ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.mct_cycle_regular);
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = context.getString(R.string.mct_cycle_irregular);
            string2.getClass();
            return string2;
        }
        if (i14 == 3) {
            String string3 = context.getString(R.string.mct_no_period);
            string3.getClass();
            return string3;
        }
        if (i14 == 4) {
            String string4 = context.getString(R.string.pregnancy_title);
            string4.getClass();
            return string4;
        }
        if (i14 != 5) {
            u0.r();
            return null;
        }
        String string5 = context.getString(R.string.pregnancy_inactive);
        string5.getClass();
        return string5;
    }

    /* JADX INFO: renamed from: ww0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww0/a$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3488a {
        public /* synthetic */ C3488a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3488a() {
        }
    }
}

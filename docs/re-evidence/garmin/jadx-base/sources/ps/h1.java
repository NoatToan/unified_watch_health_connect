package ps;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lps/h1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum h1 {
    DYN,
    STA,
    REST;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139844a;

        static {
            int[] iArr = new int[h1.values().length];
            try {
                iArr[h1.DYN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h1.STA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h1.REST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f139844a = iArr;
        }
    }

    static {
        new a(null);
    }

    public final String a(Context context) {
        context.getClass();
        String string = context.getString(b());
        string.getClass();
        return string;
    }

    public final int b() {
        int i14 = b.f139844a[ordinal()];
        if (i14 == 1) {
            return R.string.pool_apnea_dyn;
        }
        if (i14 == 2) {
            return R.string.pool_apnea_sta;
        }
        if (i14 == 3) {
            return R.string.workout_step_type_rest;
        }
        lc.u0.r();
        return 0;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/h1$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

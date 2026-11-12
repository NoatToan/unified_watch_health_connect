package ww0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lww0/h;", "Lww0/f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum h implements f {
    LIGHT,
    MEDIUM,
    HEAVY;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f187557a = new a(null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187562a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.HEAVY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f187562a = iArr;
        }
    }

    @Override // ww0.f
    public final String a(Context context) {
        int i14;
        context.getClass();
        int i15 = b.f187562a[ordinal()];
        if (i15 == 1) {
            i14 = R.string.mct_light;
        } else if (i15 == 2) {
            i14 = R.string.mct_medium;
        } else {
            if (i15 != 3) {
                u0.r();
                return null;
            }
            i14 = R.string.mct_heavy;
        }
        String string = context.getString(i14);
        string.getClass();
        return string;
    }

    @Override // ww0.f
    public final int b() {
        int i14 = b.f187562a[ordinal()];
        if (i14 == 1) {
            return R.raw.icon_mct_flow_1;
        }
        if (i14 == 2) {
            return R.raw.icon_mct_flow_2;
        }
        if (i14 == 3) {
            return R.raw.icon_mct_flow_3;
        }
        u0.r();
        return 0;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww0/h$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

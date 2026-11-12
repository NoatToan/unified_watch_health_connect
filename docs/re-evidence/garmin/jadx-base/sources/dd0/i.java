package dd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldd0/i;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f59167a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f59168b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59169a;

        static {
            int[] iArr = new int[yl2.b.values().length];
            try {
                iArr[yl2.b.C1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yl2.b.D1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yl2.b.E1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yl2.b.G1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f59169a = iArr;
        }
    }

    private i() {
    }

    public static void a() {
        a2 a2Var = a2.DEVICES;
        i2.f36769a.getClass();
        i2.a.a(a2Var, ".endVivoDevicePairing()");
        f59168b = null;
    }
}

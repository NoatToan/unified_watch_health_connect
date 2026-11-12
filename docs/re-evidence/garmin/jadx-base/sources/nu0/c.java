package nu0;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.common.collect.ImmutableList;
import java.util.List;
import org.slf4j.Logger;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127895a;

        static {
            int[] iArr = new int[u0.values().length];
            f127895a = iArr;
            try {
                iArr[u0.f203720e6.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f127895a[u0.f203739h6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private c() {
    }

    public static Logger a(String str) {
        String strConcat = "LT#".concat(str);
        int i14 = gt2.c.f79010a;
        return gt2.b.f79005a.h(strConcat);
    }

    public static boolean b(long j8, SupportedCapability supportedCapability, List<String> list) {
        return j8 > 0 && km2.a.i(j8, list, supportedCapability.ordinal());
    }

    public static boolean c(long j8) {
        SupportedCapability supportedCapability = SupportedCapability.LIVETRACK_AUTO_START;
        ImmutableList<String> immutableList = n0.f203578b;
        return b(j8, supportedCapability, immutableList) || b(j8, SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT, immutableList);
    }
}

package wb2;

import android.content.Context;
import ch.qos.logback.classic.Logger;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static y f184211c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f184212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, wb2.a> f184213b = new ConcurrentHashMap<>();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f184214a;

        static {
            int[] iArr = new int[b.values().length];
            f184214a = iArr;
            try {
                iArr[b.FULL_SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f184214a[b.DEFERRED_FILE_UPLOAD_SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f184214a[b.TIME_SYNC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        FULL_SYNC,
        DEFERRED_FILE_UPLOAD_SYNC,
        TIME_SYNC
    }

    private y() {
        int i14 = gt2.c.f79010a;
        this.f184212a = gt2.b.f79005a.i("SYNC#SyncStrategyFactory");
    }

    public static y a() {
        if (f184211c == null) {
            f184211c = new y();
        }
        return f184211c;
    }

    public final wb2.a b(String str) {
        return this.f184213b.get(str);
    }

    public final wb2.a c(b bVar, DeviceProfile deviceProfile, Context context, g0 g0Var) {
        wb2.a d0Var;
        if (deviceProfile == null) {
            return null;
        }
        int i14 = a.f184214a[bVar.ordinal()];
        if (i14 == 1) {
            d0Var = new d0(bVar, deviceProfile, context, g0Var);
        } else if (i14 != 2) {
            d0Var = i14 != 3 ? new d0(bVar, deviceProfile, context, g0Var) : new s0(bVar, deviceProfile, context, g0Var);
        } else {
            d0Var = new e(bVar, deviceProfile, context, g0Var);
        }
        String macAddress = deviceProfile.getMacAddress();
        this.f184213b.put(macAddress, d0Var);
        this.f184212a.debug("Registered device sync strategy " + d0Var + " for macAddress=" + macAddress);
        return d0Var;
    }
}

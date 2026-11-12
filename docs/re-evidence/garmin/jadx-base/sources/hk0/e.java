package hk0;

import android.content.Context;
import bs2.b7;
import bs2.ck;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.fit.FitRuntimeException;
import ds.e0;
import java.io.ByteArrayInputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.java.KoinJavaComponent;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public class e extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f84059c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Long, ck> f84060b;

    public class a implements la2.a {
        public a() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            e.this.f84060b.remove(Long.valueOf(hVar.f111673a.getF92746j()));
        }
    }

    private e(Context context) {
        super(context);
        this.f84060b = null;
        a aVar = new a();
        this.f84060b = new ConcurrentHashMap<>(3);
        da2.d.b().f58886a.b(aVar);
    }

    public static void e(Context context) {
        if (f84059c == null) {
            f84059c = new e(context);
        }
    }

    public static e f(Context context) {
        if (f84059c == null) {
            f84059c = new e(context);
        }
        return f84059c;
    }

    public static boolean g(long j8, SupportedCapability supportedCapability) {
        DeviceProfile[] deviceProfileArrA = ((l80.b) KoinJavaComponent.get(l80.b.class)).x().a(j8);
        int length = deviceProfileArrA.length;
        for (int i14 = 0; i14 < length; i14++) {
            DeviceProfile deviceProfile = deviceProfileArrA[i14];
            Configuration configuration = deviceProfile == null ? null : deviceProfile.getConfiguration();
            if (configuration != null && l2.q(supportedCapability, configuration.getCapabilityFlagsAsSet())) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(String str, SupportedCapability supportedCapability) {
        DeviceProfile deviceProfileD = ((l80.b) KoinJavaComponent.get(l80.b.class)).x().d(str);
        Configuration configuration = deviceProfileD == null ? null : deviceProfileD.getConfiguration();
        return configuration != null && l2.q(supportedCapability, configuration.getCapabilityFlagsAsSet());
    }

    public final boolean i(long j8) {
        if (j8 >= 0) {
            return g(j8, SupportedCapability.SWING_SENSOR);
        }
        i2.l(b(), "isGolfSwingSensorCapable(): FYI - Unable to execute operation. Invalid unit ID (" + j8 + ")");
        return false;
    }

    public final boolean j(String str) {
        DeviceProfile deviceProfileD = ((da2.b) s.a()).d(str);
        Configuration configuration = deviceProfileD == null ? null : deviceProfileD.getConfiguration();
        if (configuration != null) {
            return l2.q(SupportedCapability.DEVICE_INITIATES_SYNC, configuration.getCapabilityFlagsAsSet());
        }
        i2.l(b(), "isDeviceInitiatingSync(): FYI - Unable to execute operation. Invalid mac address (" + str + ").");
        return false;
    }

    public final boolean k(long j8, byte[] bArr) {
        ConcurrentHashMap<Long, ck> concurrentHashMap = this.f84060b;
        try {
            if (!concurrentHashMap.containsKey(Long.valueOf(j8))) {
                Long lValueOf = Long.valueOf(j8);
                b7 b7Var = new b7();
                b7Var.g();
                if (b7Var.f19710v != null) {
                    throw new FitRuntimeException("Can't set incompleteStream option after Decode started!");
                }
                b7Var.f19711w = false;
                concurrentHashMap.put(lValueOf, new ck(b7Var));
            }
            concurrentHashMap.get(Long.valueOf(j8)).c(new ByteArrayInputStream(bArr));
            return true;
        } catch (FitRuntimeException e4) {
            String strB = b();
            StringBuilder sbK = e0.k(j8, "FitRuntimeException for device ID [", "]: ");
            sbK.append(e4.getMessage());
            i2.i(strB, sbK.toString());
            return false;
        }
    }
}

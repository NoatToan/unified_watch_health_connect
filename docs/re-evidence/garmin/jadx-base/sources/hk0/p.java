package hk0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.LongSparseArray;
import bd0.c0;
import bd0.d0;
import bd0.e0;
import c22.u1;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.sync.AutoSyncScheduler;
import com.garmin.android.apps.connectmobile.v1;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.android.lib.connectdevicesync.DeviceSyncService;
import com.garmin.android.library.livetrack.LivetrackService;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.multilink.reliable.MLRInitializer;
import com.google.common.base.Ascii;
import fe2.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Observable;
import java.util.concurrent.ConcurrentHashMap;
import ml2.l;
import o53.e2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import wd2.g1;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public class p extends Observable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p f84079d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.lib.connectdevicesync.a f84080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f84081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wd2.g f84082c;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.garmin.android.lib.connectdevicesync.a c0991a;
            int i14 = com.garmin.android.lib.connectdevicesync.a.AbstractBinderC0990a.f49917a;
            if (iBinder == null) {
                c0991a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.garmin.android.lib.connectdevicesync.RemoteDeviceSyncService");
                c0991a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.garmin.android.lib.connectdevicesync.a)) ? new com.garmin.android.lib.connectdevicesync.a.AbstractBinderC0990a.C0991a(iBinder) : (com.garmin.android.lib.connectdevicesync.a) iInterfaceQueryLocalInterface;
            }
            p pVar = p.this;
            pVar.f84080a = c0991a;
            i2.l("TMP#GFDIService", "ACQUIRED REMOTE DEVICE SYNC SERVICE: " + pVar.f84080a);
            b bVar = pVar.f84081b;
            p pVar2 = p.f84079d;
            if (pVar2 != null && pVar2.n()) {
                try {
                    p.f84079d.f84080a.i(bVar);
                } catch (RemoteException e4) {
                    i2.g(e4, "TMP#GFDIService");
                }
            }
            if (((f12.b) KoinJavaComponent.get(f12.b.class)).c() && GCMSettingManager.x()) {
                AutoSyncScheduler.b(GarminConnectMobileApp.f28688j);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            p.this.f84080a = null;
            i2.n("TMP#GFDIService", "LOST REMOTE DEVICE SYNC SERVICE");
        }
    }

    public class b implements wb2.o {
        public b(p pVar) {
        }

        @Override // wb2.o
        public final List<String> Q(long j8) {
            return null;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    private p(Context context) {
        new ArrayList();
        a aVar = new a();
        this.f84080a = null;
        this.f84081b = new b(this);
        kg1.a.f104701a.getClass();
        MLRInitializer.initialize(kg1.a.C2003a.a().g());
        h(context);
        g(context);
        ma2.g.b(ma2.h.f117689q, new aw.a.C0186a());
        final l lVar = new l();
        Object[] objArr = {rl2.c.a.DEVICE_DRIVEN_SOCKET};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        final List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        rl2.c.f153458i.debug("registerMultilinkSubscriber");
        ml2.q qVar = ml2.q.NFC;
        eh2.e.a aVar2 = new eh2.e.a() { // from class: rl2.b
            @Override // eh2.e.a
            public final eh2.e a(Context context2, l lVar2) {
                Logger logger = c.f153458i;
                return new d(context2, lVar2, Ascii.FF, lVar, listUnmodifiableList);
            }
        };
        ConcurrentHashMap<Integer, eh2.e.a> concurrentHashMap = eh2.h.f64078a;
        if (qVar == null) {
            vb.h.s("service is null");
            throw null;
        }
        eh2.h.f64078a.put(Integer.valueOf(qVar.f119440a), aVar2);
        ed0.a.k("TMP#GFDIService");
        i2.d("TMP#GFDIService", "Starting 'DeviceSyncService'...");
        Intent intent = new Intent(context, (Class<?>) DeviceSyncService.class);
        v1.f47374a.getClass();
        v1.f(context, intent);
        i2.d("TMP#GFDIService", "Binding to 'DeviceSyncService'...");
        context.bindService(intent, aVar, 1);
    }

    public static synchronized void a(Context context) {
        g1 g1Var;
        f84079d = new p(context);
        hk0.a.e(context);
        d.e(context);
        e.e(context);
        if (!wd2.m.a().isEmpty() && (g1Var = wd2.q.f184563f.c().f184567b) != null) {
            LivetrackService livetrackService = g1Var.f184472d;
            if (livetrackService != null) {
                LongSparseArray<p1> longSparseArray = livetrackService.f50167g;
                int size = longSparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    longSparseArray.keyAt(i14);
                    p1 p1VarValueAt = longSparseArray.valueAt(i14);
                    if (!p1VarValueAt.getF70803o()) {
                        p1VarValueAt.c();
                    }
                }
            } else {
                g1Var.f184471c.error("Not initialized");
            }
        }
    }

    public static DeviceProfile b(long j8) {
        if (j8 <= 0) {
            i2.i("TMP#GFDIService", "Invalid remote device unit ID [" + j8 + "]");
            return null;
        }
        DeviceProfile[] deviceProfileArrA = f().a(j8);
        int length = deviceProfileArrA.length;
        DeviceProfile deviceProfile = null;
        Configuration configuration = null;
        for (int i14 = 0; i14 < length; i14++) {
            DeviceProfile deviceProfile2 = deviceProfileArrA[i14];
            if (deviceProfile == null) {
                configuration = deviceProfile2 == null ? null : deviceProfile2.getConfiguration();
            } else {
                Configuration configuration2 = deviceProfile.getConfiguration();
                if (configuration == null) {
                    configuration = configuration2;
                } else if (configuration2 != null) {
                    Configuration.merge(configuration, configuration2);
                }
                deviceProfile2 = new DeviceProfile(deviceProfile, configuration.getCapabilityFlagsAsSet());
            }
            deviceProfile = deviceProfile2;
        }
        return deviceProfile;
    }

    public static la2.e c() {
        return da2.d.c(GarminConnectMobileApp.f28688j).f58886a;
    }

    public static ArrayList d() {
        return new ArrayList(f().e());
    }

    public static List<String> e(long j8) {
        if (j8 < 0) {
            return Collections.EMPTY_LIST;
        }
        i2.d("TMP#GFDIService", "getMacAddresses: " + j8);
        return Arrays.asList(f().b(j8));
    }

    public static da2.b f() {
        return da2.d.c(GarminConnectMobileApp.f28688j).f58886a.f111646e;
    }

    public static void g(Context context) {
        if (lm2.h.f113619b) {
            return;
        }
        try {
            c0 c0Var = new c0(context);
            d0 d0Var = new d0();
            e0 e0Var = new e0(new ed0.l());
            o oVar = new o();
            yb2.b.a aVar = new yb2.b.a();
            lm2.h.f113623f = e0Var;
            lm2.h.f113620c = c0Var;
            lm2.h.f113621d = d0Var;
            lm2.h.f113622e = oVar;
            lm2.h.f113624g = aVar;
            lm2.h.f113619b = true;
            d0Var.a(d0Var);
            lm2.h.b(true);
        } catch (Exception e4) {
            i2.i("TMP#GFDIService", "Failed to initialize pairing module.: " + e4.getMessage());
        }
    }

    public static void h(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            yr1.m.f199104a.getClass();
            applicationContext.getClass();
            e2 e2VarH = ge1.b.h();
            x53.c cVar = s0.f129406a;
            ge1.b.T(o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH)), null, null, new yr1.l(applicationContext, null), 3);
        }
    }

    public static boolean i(long j8, SupportedCapability supportedCapability) {
        if (j8 > 0) {
            DeviceProfile deviceProfileB = b(j8);
            Configuration configuration = deviceProfileB == null ? null : deviceProfileB.getConfiguration();
            return configuration != null && l2.q(supportedCapability, configuration.getCapabilityFlagsAsSet());
        }
        i2.i("TMP#GFDIService", "Invalid remote device unit ID [" + j8 + "]");
        return false;
    }

    public static boolean j(long j8) {
        p pVar = f84079d;
        if (pVar != null && pVar.n()) {
            try {
                while (true) {
                    boolean z14 = false;
                    for (String str : u1.c(j8)) {
                        if (z14 || f84079d.f84080a.V(str)) {
                            z14 = true;
                        }
                    }
                    return z14;
                }
            } catch (RemoteException e4) {
                i2.g(e4, "TMP#GFDIService");
            }
        }
        return false;
    }

    public static boolean k(long j8) {
        String strA = u1.a(j8);
        return !TextUtils.isEmpty(strA) && l(strA);
    }

    public static boolean l(String str) {
        return f().d(str) != null;
    }

    public static boolean m(sd2.f fVar) {
        return l(fVar.d0()) || l(fVar.Q());
    }

    public final boolean n() {
        if (this.f84080a != null) {
            return true;
        }
        i2.n("TMP#GFDIService", "RemoteDeviceSyncService not alive.");
        return false;
    }
}

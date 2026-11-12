package y90;

import androidx.lifecycle.j;
import androidx.lifecycle.v;
import androidx.lifecycle.z0;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import e23.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ok2.g0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.u;
import p13.u0;
import r53.p2;
import yr1.q;
import yr1.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly90/b;", "Lyr1/r;", "Ly90/c;", "firmwareUpdateRequiredObserver", "Llc0/f;", "getBluetoothStateUseCase", "Llc0/g;", "initiateDeviceSoftwareUpdateUseCase", "Laz0/c;", "networkObserver", "<init>", "(Ly90/c;Llc0/f;Llc0/g;Laz0/c;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f195266i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y90.c f195267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lc0.g f195268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f195269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f195270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f195271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y90.a f195272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f195273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y90.a f195274h;

    /* JADX INFO: renamed from: y90.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C3634b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195275a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.USER_INITIATED_HIGHEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.USER_INITIATED_PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.USER_INITIATED_GENERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f195275a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f195276a;

        public c(l lVar) {
            lVar.getClass();
            this.f195276a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f195276a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f195276a.invoke(obj);
        }
    }

    static {
        new a(null);
        f195266i = "DeviceSetupFirmwareUpdateRequiredUseCase";
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [y90.a] */
    /* JADX WARN: Type inference failed for: r1v9, types: [y90.a] */
    public b(y90.c cVar, lc0.f fVar, lc0.g gVar, az0.c cVar2) {
        cVar.getClass();
        fVar.getClass();
        gVar.getClass();
        cVar2.getClass();
        this.f195267a = cVar;
        this.f195268b = gVar;
        this.f195269c = gt2.c.b(f195266i);
        this.f195270d = v.b(fVar.a());
        this.f195271e = new LinkedHashMap();
        final int i14 = 0;
        this.f195272f = new l(this) { // from class: y90.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f195265b;

            {
                this.f195265b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                b bVar = this.f195265b;
                switch (i15) {
                    case 0:
                        if (((Boolean) obj).booleanValue()) {
                            String str = b.f195266i;
                        } else {
                            Iterator<T> it = bVar.f195267a.a().iterator();
                            while (it.hasNext()) {
                                bVar.c(((z90.a) it.next()).getF203116a().f143493a);
                            }
                        }
                        break;
                    default:
                        az0.c.a aVar = (az0.c.a) obj;
                        String str2 = b.f195266i;
                        aVar.getClass();
                        if (aVar != az0.c.a.Available) {
                            Iterator<T> it3 = bVar.f195267a.a().iterator();
                            while (it3.hasNext()) {
                                bVar.c(((z90.a) it3.next()).getF203116a().f143493a);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        this.f195273g = v.b(cVar2.a());
        final int i15 = 1;
        this.f195274h = new l(this) { // from class: y90.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f195265b;

            {
                this.f195265b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                b bVar = this.f195265b;
                switch (i16) {
                    case 0:
                        if (((Boolean) obj).booleanValue()) {
                            String str = b.f195266i;
                        } else {
                            Iterator<T> it = bVar.f195267a.a().iterator();
                            while (it.hasNext()) {
                                bVar.c(((z90.a) it.next()).getF203116a().f143493a);
                            }
                        }
                        break;
                    default:
                        az0.c.a aVar = (az0.c.a) obj;
                        String str2 = b.f195266i;
                        aVar.getClass();
                        if (aVar != az0.c.a.Available) {
                            Iterator<T> it3 = bVar.f195267a.a().iterator();
                            while (it3.hasNext()) {
                                bVar.c(((z90.a) it3.next()).getF203116a().f143493a);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // yr1.r
    public final void B1(al2.c cVar) {
        int i14 = C3634b.f195275a[cVar.f3776b.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            long f172494b = cVar.f3775a.getF92746j();
            y90.c cVar2 = this.f195267a;
            z90.a aVarB = cVar2.b(f172494b);
            boolean z14 = aVarB instanceof z90.a.c;
            Logger logger = this.f195269c;
            if (!z14) {
                if (aVarB instanceof z90.a.d) {
                    logger.debug(v.h.u(f172494b, "start ", ", no update to current: ", ((z90.a.d) aVarB).f203117b));
                    return;
                }
                return;
            }
            z90.a.c cVar3 = (z90.a.c) aVarB;
            cVar2.c(f172494b, new z90.a.b(cVar3.f203114a));
            this.f195270d.g(new c(this.f195272f));
            String str = cVar3.f203115b;
            z90.a aVarB2 = cVar2.b(f172494b);
            String f203117b = aVarB2 != null ? aVarB2.getF203117b() : null;
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(f172494b, "start ", ", from ", str);
            sbK.append(" to ");
            sbK.append(f203117b);
            logger.debug(sbK.toString());
        }
    }

    @Override // yr1.r
    public final void F1(al2.a aVar, boolean z14) {
    }

    public final void a(long j8) {
        p2 p2Var = this.f195267a.f195277a;
        Long lValueOf = Long.valueOf(j8);
        LinkedHashMap linkedHashMap = this.f195271e;
        q qVar = (q) linkedHashMap.get(lValueOf);
        if (qVar != null) {
            qVar.e();
        }
        linkedHashMap.remove(Long.valueOf(j8));
        Map map = (Map) p2Var.getValue();
        Long lValueOf2 = Long.valueOf(j8);
        map.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        linkedHashMap2.remove(lValueOf2);
        p2Var.k(null, u0.g(linkedHashMap2));
        if (((Map) p2Var.getValue()).isEmpty()) {
            this.f195270d.k(new c(this.f195272f));
            this.f195273g.k(new c(this.f195274h));
            wr.g.w("clean ", j8, this.f195269c);
        }
    }

    public final void b(long j8) {
        DeviceProfile deviceProfile;
        boolean zContainsKey = ((Map) this.f195267a.f195277a.getValue()).containsKey(Long.valueOf(j8));
        Logger logger = this.f195269c;
        if (!zContainsKey) {
            wr.g.v("complete ", j8, ", no state to remove", logger);
            return;
        }
        String strE = org.apache.commons.lang3.e.e(j8, "Attempting to initiate software update for device with unit ID ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "InitiateDeviceSoftwareUpdateUseCase", strE);
        lc0.g gVar = this.f195268b;
        DeviceProfile[] deviceProfileArrA = ((da2.b) gVar.f111937a).a(j8);
        int length = deviceProfileArrA.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                deviceProfile = null;
                break;
            }
            deviceProfile = deviceProfileArrA[i14];
            if (deviceProfile.getConnectionType() == 1) {
                break;
            } else {
                i14++;
            }
        }
        if (deviceProfile == null) {
            deviceProfile = (DeviceProfile) u.H(deviceProfileArrA);
        }
        if (deviceProfile != null) {
            String macAddress = deviceProfile.getMacAddress();
            macAddress.getClass();
            gVar.a(macAddress);
        } else {
            String strF = a0.f(j8, "Device with unit ID ", " not connected");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "InitiateDeviceSoftwareUpdateUseCase", strF);
            int i15 = o13.q.f128596b;
            new o13.q.b(new IllegalArgumentException(a0.f(j8, "Failed to initiate software update for device with unit ID ", ", device not connected")));
        }
        a(j8);
        logger.debug("complete " + j8 + ", state removed");
    }

    public final void c(long j8) {
        y90.c cVar = this.f195267a;
        z90.a aVarB = cVar.b(j8);
        boolean z14 = aVarB instanceof z90.a.d;
        Logger logger = this.f195269c;
        if (!z14) {
            logger.debug(v.h.u(j8, "failed ", ", no update to current: ", aVarB != null ? aVarB.getF203117b() : null));
            return;
        }
        z90.a.d dVar = (z90.a.d) aVarB;
        cVar.c(j8, new z90.a.C3788a(dVar.f203116a));
        String str = dVar.f203117b;
        z90.a aVarB2 = cVar.b(j8);
        String f203117b = aVarB2 != null ? aVarB2.getF203117b() : null;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "failed ", " from ", str);
        sbK.append(" to ");
        sbK.append(f203117b);
        logger.debug(sbK.toString());
    }

    @Override // yr1.r
    public final void g5(al2.c cVar, boolean z14) {
        rs2.c cVar2 = cVar.f3775a;
        int i14 = C3634b.f195275a[cVar.f3776b.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            if (z14) {
                b(cVar2.getF92746j());
                return;
            }
            CoreTransferException coreTransferException = cVar.f3778d;
            if ((coreTransferException != null ? coreTransferException.getFailure() : null) == ok2.e.I) {
                a(cVar2.getF92746j());
            } else {
                c(cVar2.getF92746j());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly90/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

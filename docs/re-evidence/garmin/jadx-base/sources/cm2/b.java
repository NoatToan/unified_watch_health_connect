package cm2;

import android.os.SystemClock;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import da2.d;
import dt2.g;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import la2.i;
import ma2.k;
import o13.r;
import o53.b0;
import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p006l2.v0;
import p13.l0;
import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcm2/b;", "Ldt2/a;", "<init>", "()V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements dt2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27972d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f27973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CopyOnWriteArraySet<String> f27974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Long> f27975g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f27976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f27977c;

    static {
        Logger logger = LoggerFactory.getLogger("DualPairingRequestHandler");
        logger.getClass();
        f27973e = logger;
        f27974f = new CopyOnWriteArraySet<>();
        f27975g = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(v13.c cVar) throws Exception {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f27984c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f27984c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f27982a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f27984c;
        Logger logger = f27973e;
        try {
            if (i15 == 0) {
                r.b(obj);
                GDICore.CoreService.Builder builderNewBuilder = GDICore.CoreService.newBuilder();
                builderNewBuilder.setDualPairingRequest(GDICore.DualPairingRequest.getDefaultInstance());
                GDICore.DualPairingRequest.newBuilder().setRequestType(GDICore.DualPairingRequest.RequestType.PAIR_BT_CLASSIC);
                g gVar = this.f27977c;
                if (gVar == null) {
                    s.m("messenger");
                    throw null;
                }
                GDISmartProto.Smart smartA = pu2.a.a(builderNewBuilder);
                smartA.getClass();
                cVar2.f27984c = 1;
                if (gVar.c(smartA, cVar2) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            rs2.c cVar3 = this.f27976b;
            if (cVar3 == null) {
                s.m("deviceInfo");
                throw null;
            }
            logger.info("Requested BT enable for " + cVar3.getF172493a());
            ConcurrentHashMap<String, Long> concurrentHashMap = f27975g;
            rs2.c cVar4 = this.f27976b;
            if (cVar4 == null) {
                s.m("deviceInfo");
                throw null;
            }
            String f172493a = cVar4.getF172493a();
            cz2.a.f56879a.getClass();
            cz2.a.C1219a.f56881b.getClass();
            concurrentHashMap.put(f172493a, new Long(SystemClock.elapsedRealtime()));
            return Unit.INSTANCE;
        } catch (Exception e4) {
            rs2.c cVar5 = this.f27976b;
            if (cVar5 == null) {
                s.m("deviceInfo");
                throw null;
            }
            logger.error("Failed to request BT enable for " + cVar5.getF172493a(), (Throwable) e4);
            throw e4;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f27976b = cVar;
        this.f27977c = gVar;
        GDICoreExtension.registerAllExtensions(extensionRegistryLite);
        GDICore.registerAllExtensions(extensionRegistryLite);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcm2/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "blacklist", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "sentNotifications", "Ljava/util/concurrent/ConcurrentHashMap;", "", "DEFAULT_LAST_CHECK_TIMEOUT_MILLIS", "I", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static boolean a(int i14, String str) {
            str.getClass();
            if (b.f27974f.contains(str) || !oa2.a.c(str)) {
                return false;
            }
            Long l14 = b.f27975g.get(str);
            if (l14 == null) {
                return true;
            }
            long jLongValue = l14.longValue() + ((long) i14);
            cz2.a.f56879a.getClass();
            cz2.a.C1219a.f56881b.getClass();
            return jLongValue <= SystemClock.elapsedRealtime();
        }

        private a() {
        }

        /* JADX INFO: renamed from: cm2.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcm2/b$a$a;", "Lma2/k;", "", "bleConnectionId", "", "lastCheckTimeoutMillis", "Lma2/j;", "callback", "Lo53/b0;", "coroutineScope", "<init>", "(Ljava/lang/String;ILma2/j;Lo53/b0;)V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class C0429a implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f27978a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f27979b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ma2.j f27980c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final b0 f27981d;

            public /* synthetic */ C0429a(String str, int i14, ma2.j jVar, b0 b0Var, int i15, j jVar2) {
                this(str, (i15 & 2) != 0 ? DateTimeConstants.MILLIS_PER_MINUTE : i14, (i15 & 4) != 0 ? null : jVar, (i15 & 8) != 0 ? q2.l("DualPairingProbe") : b0Var);
            }

            public static Object f(String str, cm2.a aVar) {
                Object objC;
                b bVar = (b) d.b().getCapability(str, b.class);
                return (bVar == null || (objC = bVar.c(aVar)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objC;
            }

            @Override // ma2.k
            public final void a(String str, v0 v0Var) {
                str.getClass();
                ge1.b.T(this.f27981d, null, null, new cm2.a(this, str, v0Var, null), 3);
            }

            @Override // ma2.k
            public final boolean b(DeviceProfile deviceProfile) {
                deviceProfile.getClass();
                a aVar = b.f27972d;
                String f172493a = deviceProfile.getF172493a();
                f172493a.getClass();
                aVar.getClass();
                return a.a(this.f27979b, f172493a);
            }

            @Override // ma2.j
            public final void c(i iVar) {
                ma2.j jVar = this.f27980c;
                if (jVar != null) {
                    jVar.c(iVar);
                }
            }

            @Override // ma2.j
            public final void d(DeviceProfile deviceProfile) {
                String f172493a = deviceProfile != null ? deviceProfile.getF172493a() : null;
                String str = this.f27978a;
                if (s.g(str, f172493a) && !deviceProfile.getF172498f()) {
                    b.f27974f.add(str);
                }
                ma2.j jVar = this.f27980c;
                if (jVar != null) {
                    jVar.d(deviceProfile);
                }
            }

            @Override // ma2.j
            public final void e() {
                b.f27974f.add(this.f27978a);
                ma2.j jVar = this.f27980c;
                if (jVar != null) {
                    jVar.e();
                }
            }

            public C0429a(String str, int i14, ma2.j jVar, b0 b0Var) {
                str.getClass();
                b0Var.getClass();
                this.f27978a = str;
                this.f27979b = i14;
                this.f27980c = jVar;
                this.f27981d = b0Var;
            }
        }
    }
}

package hd1;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import h0.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhd1/t;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {
    public static o A;
    public static g0 B;
    public static k0 C;
    public static final Handler D;
    public static boolean E;
    public static final s F;
    public static final hd1.a G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f83397a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u53.d f83398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f83399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f83400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f83401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j0 f83402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f0 f83403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z f83404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d0 f83405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p f83406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h0 f83407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f83408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l0 f83409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static i0 f83419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static e0 f83420x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static y f83421y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static c0 f83422z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$a", "Lhd1/d;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements hd1.d {
        @Override // hd1.d
        public final void a(m mVar) {
            Iterator it = t.f83417u.iterator();
            while (it.hasNext()) {
                t.D.post(new r0(5, (hd1.d) it.next(), mVar));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$b", "Lhd1/e;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements hd1.e {
        @Override // hd1.e
        public final void a(o oVar) {
            t.A = oVar;
            Iterator it = t.f83415s.iterator();
            while (it.hasNext()) {
                t.D.post(new r0(6, (hd1.e) it.next(), oVar));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$c", "Lxf0/b;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends xf0.b {
        @Override // xf0.b
        public final void deviceConnected(pi2.g gVar) {
            Parcelable parcelable;
            gVar.getClass();
            Bundle eventData = gVar.getEventData();
            DeviceProfile deviceProfile = null;
            if (eventData != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) eventData.getParcelable("GCM_extra_device_profile", DeviceProfile.class);
                } else {
                    Parcelable parcelable2 = eventData.getParcelable("GCM_extra_device_profile");
                    parcelable = (DeviceProfile) (parcelable2 instanceof DeviceProfile ? parcelable2 : null);
                }
                deviceProfile = (DeviceProfile) parcelable;
            }
            if (deviceProfile != null) {
                a2 a2Var = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.a(a2Var, "RealTimeDataProvider onDeviceConnected " + deviceProfile);
                boolean z14 = deviceProfile.getF92746j() == t.f83399c;
                if (z14) {
                    long j8 = t.f83400d;
                    if (j8 != 0) {
                        i2.a.a(a2Var, "RealTimeDataProvider onDeviceConnected PAT unregister previously Real Time Heart Rate unitId[" + j8 + "]");
                        t.f83397a.getClass();
                        t.f();
                    }
                }
                t tVar = t.f83397a;
                String macAddress = deviceProfile.getMacAddress();
                macAddress.getClass();
                tVar.getClass();
                t.b(macAddress, z14);
            }
        }

        @Override // xf0.b
        public final void deviceDisconnected(pi2.h hVar) {
            Parcelable parcelable;
            hVar.getClass();
            Bundle eventData = hVar.getEventData();
            DeviceProfile deviceProfile = null;
            if (eventData != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) eventData.getParcelable("GCM_extra_device_profile", DeviceProfile.class);
                } else {
                    Parcelable parcelable2 = eventData.getParcelable("GCM_extra_device_profile");
                    parcelable = (DeviceProfile) (parcelable2 instanceof DeviceProfile ? parcelable2 : null);
                }
                deviceProfile = (DeviceProfile) parcelable;
            }
            if (deviceProfile != null) {
                a2 a2Var = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.a(a2Var, "RealTimeDataProvider deviceDisconnected " + deviceProfile);
                t tVar = t.f83397a;
                String macAddress = deviceProfile.getMacAddress();
                macAddress.getClass();
                tVar.getClass();
                t.e(macAddress);
                long f92746j = deviceProfile.getF92746j();
                long j8 = t.f83400d;
                if (f92746j == j8) {
                    i2.a.a(a2Var, "RealTimeDataProvider deviceDisconnected as previously registered Real Time Heart Rate unitId[" + j8 + "]");
                    t.f83400d = 0L;
                    if (t.f83410n.size() > 0) {
                        t.d();
                    }
                }
            }
            t.f83397a.getClass();
            t.g(t.f83419w, zy0.a.REAL_TIME_STEPS);
            t.g(t.f83420x, zy0.a.REAL_TIME_PUSHES);
            t.g(t.f83421y, zy0.a.REAL_TIME_FLOORS);
            t.g(t.f83422z, zy0.a.REAL_TIME_INTENSITY_MINUTES);
            t.g(t.A, zy0.a.REAL_TIME_CALORIES);
            t.g(t.B, zy0.a.REAL_TIME_RESPIRATION);
            t.g(t.C, zy0.a.REAL_TIME_TRAINING_READINESS);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$d", "Lhd1/f;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements hd1.f {
        @Override // hd1.f
        public final void a(y yVar) {
            t.f83421y = yVar;
            Iterator it = t.f83413q.iterator();
            while (it.hasNext()) {
                t.D.post(new r0(7, (hd1.f) it.next(), yVar));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$e", "Lhd1/g;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements hd1.g {
        @Override // hd1.g
        public final void a(a0 a0Var, Long l14) {
            Iterator it = t.f83410n.iterator();
            while (it.hasNext()) {
                t.D.post(new fh2.a((hd1.g) it.next(), 5, a0Var, l14));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$f", "Lhd1/h;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements hd1.h {
        @Override // hd1.h
        public final void a(c0 c0Var) {
            t.f83422z = c0Var;
            Iterator it = t.f83414r.iterator();
            while (it.hasNext()) {
                t.D.post(new r0(8, (hd1.h) it.next(), c0Var));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$g", "Lhd1/i;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements hd1.i {
        @Override // hd1.i
        public final void a(e0 e0Var) {
            t.f83420x = e0Var;
            Iterator it = t.f83412p.iterator();
            while (it.hasNext()) {
                t.D.post(new r0(9, (hd1.i) it.next(), e0Var));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$h", "Lhd1/j;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements hd1.j {
        @Override // hd1.j
        public final void a(g0 g0Var) {
            t.B = g0Var;
            Iterator it = t.f83416t.iterator();
            while (it.hasNext()) {
                t.D.post(new r0(10, (hd1.j) it.next(), g0Var));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$i", "Lhd1/k;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i implements hd1.k {
        @Override // hd1.k
        public final void a(i0 i0Var) {
            t.f83419w = i0Var;
            Iterator it = t.f83411o.iterator();
            while (it.hasNext()) {
                t.D.post(new r0(11, (hd1.k) it.next(), i0Var));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hd1/t$j", "Lhd1/l;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j implements l {
        @Override // hd1.l
        public final void a(k0 k0Var) {
            t.C = k0Var;
            Iterator it = t.f83418v.iterator();
            while (it.hasNext()) {
                t.D.post(new eh2.b((l) it.next(), 19));
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.realtimedata.RealTimeDataProvider$writeCacheData$1", f = "RealTimeDataProvider.kt", l = {602}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f83424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zy0.a f83425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(q qVar, zy0.a aVar, t13.d<? super k> dVar) {
            super(2, dVar);
            this.f83424b = qVar;
            this.f83425c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new k(this.f83424b, this.f83425c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83423a;
            if (i14 == 0) {
                o13.r.b(obj);
                hd1.a aVar2 = t.G;
                this.f83423a = 1;
                if (aVar2.a(this.f83424b, this.f83425c) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        x53.c cVar = s0.f129406a;
        f83398b = o53.c0.a(x53.b.f189152a.plus(g8.i.c()));
        f83410n = new CopyOnWriteArrayList();
        f83411o = new CopyOnWriteArrayList();
        f83412p = new CopyOnWriteArrayList();
        f83413q = new CopyOnWriteArrayList();
        f83414r = new CopyOnWriteArrayList();
        f83415s = new CopyOnWriteArrayList();
        f83416t = new CopyOnWriteArrayList();
        f83417u = new CopyOnWriteArrayList();
        f83418v = new CopyOnWriteArrayList();
        D = new Handler(Looper.getMainLooper());
        F = new s();
        c cVar2 = new c();
        e eVar = new e();
        i iVar = new i();
        g gVar = new g();
        d dVar = new d();
        f fVar = new f();
        b bVar = new b();
        h hVar = new h();
        a aVar = new a();
        j jVar = new j();
        G = (hd1.a) KoinJavaComponent.get$default(hd1.a.class, null, null, 6, null);
        f83401e = new b0(eVar);
        f83402f = new j0(iVar);
        f83403g = new f0(gVar);
        f83404h = new z(dVar);
        f83405i = new d0(fVar);
        f83406j = new p(bVar);
        f83407k = new h0(hVar);
        f83408l = new n(aVar);
        f83409m = new l0(jVar);
        f12.l.f68084a.getClass();
        f83399c = f12.l.a.a().s4();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(cVar2);
    }

    private t() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(t tVar, v13.c cVar) {
        w wVar;
        sd2.f fVar;
        Boolean boolValueOf;
        boolean z14;
        boolean z15;
        Object next;
        tVar.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f83431c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f83431c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(tVar, cVar);
            }
        } else {
            wVar = new w(tVar, cVar);
        }
        Object objE0 = wVar.f83429a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f83431c;
        Boolean boolValueOf2 = null;
        boolean z16 = true;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            x xVar = new x(null);
            wVar.f83431c = 1;
            objE0 = ge1.b.e0(bVar, xVar, wVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        List list = (List) objE0;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((sd2.f) next).getUnitID() != f83399c);
            fVar = (sd2.f) next;
        } else {
            fVar = null;
        }
        if (fVar != null && fVar.B1()) {
            a2 a2Var = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "RealTimeDataProvider", "shouldDisplayBodyBatteryRealtimeInfo: PAT is true up capable");
            return Boolean.TRUE;
        }
        if (list != null) {
            if (!list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z15 = true;
                        break;
                    }
                    if (!((sd2.f) it3.next()).B1()) {
                        z15 = false;
                        break;
                    }
                }
            } else {
                z15 = true;
                break;
            }
            boolValueOf = Boolean.valueOf(z15);
        } else {
            boolValueOf = null;
        }
        if (list != null) {
            if (!list.isEmpty()) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z14 = true;
                        break;
                    }
                    if (((sd2.f) it4.next()).B1()) {
                        z14 = false;
                        break;
                    }
                }
            } else {
                z14 = true;
                break;
            }
            boolValueOf2 = Boolean.valueOf(z14);
        }
        a2 a2Var2 = a2.DEVICES;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "RealTimeDataProvider", "shouldDisplayBodyBatteryRealtimeInfo: allDevicesSupportTrueUp: " + boolValueOf);
        i2.a.b(a2Var2, "RealTimeDataProvider", "shouldDisplayBodyBatteryRealtimeInfo: noDevicesSupportTrueUp: " + boolValueOf2);
        Boolean bool = Boolean.TRUE;
        if (!p005kotlin.jvm.internal.s.g(boolValueOf, bool) && !p005kotlin.jvm.internal.s.g(boolValueOf2, bool)) {
            z16 = false;
        }
        return Boolean.valueOf(z16);
    }

    public static void b(String str, boolean z14) {
        if (f83410n.size() > 0) {
            f12.l.f68084a.getClass();
            f12.l.a.a().u3(F);
            d();
        }
        if (z14) {
            if (f83411o.size() > 0) {
                a2 a2Var = a2.DEVICES;
                String strM = am.j.m("RealTimeDataProvider addListener stepsObserver macAddress[", str, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var, strM);
                xm2.g.f191527c.getClass();
                xm2.g gVarB = xm2.g.a.b();
                j0 j0Var = f83402f;
                j0Var.getClass();
                xm2.h hVar = xm2.h.STEPS;
                hVar.getClass();
                gVarB.a(j0Var, hVar, str);
            }
            if (f83412p.size() > 0) {
                a2 a2Var2 = a2.DEVICES;
                String strM2 = am.j.m("RealTimeDataProvider addListener pushesObserver macAddress[", str, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var2, strM2);
                xm2.g.f191527c.getClass();
                xm2.g gVarB2 = xm2.g.a.b();
                f0 f0Var = f83403g;
                f0Var.getClass();
                xm2.h hVar2 = xm2.h.PUSHES;
                hVar2.getClass();
                gVarB2.a(f0Var, hVar2, str);
            }
            if (f83413q.size() > 0) {
                a2 a2Var3 = a2.DEVICES;
                String strM3 = am.j.m("RealTimeDataProvider addListener floorsObserver macAddress[", str, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var3, strM3);
                xm2.g.f191527c.getClass();
                xm2.g gVarB3 = xm2.g.a.b();
                z zVar = f83404h;
                zVar.getClass();
                xm2.h hVar3 = xm2.h.ASCENT;
                hVar3.getClass();
                gVarB3.a(zVar, hVar3, str);
            }
            if (f83414r.size() > 0) {
                a2 a2Var4 = a2.DEVICES;
                String strM4 = am.j.m("RealTimeDataProvider addListener intensityMinutesObserver macAddress[", str, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var4, strM4);
                xm2.g.f191527c.getClass();
                xm2.g gVarB4 = xm2.g.a.b();
                d0 d0Var = f83405i;
                d0Var.getClass();
                xm2.h hVar4 = xm2.h.INTENSITY_MINUTES;
                hVar4.getClass();
                gVarB4.a(d0Var, hVar4, str);
            }
            if (f83415s.size() > 0) {
                a2 a2Var5 = a2.DEVICES;
                String strM5 = am.j.m("RealTimeDataProvider addListener caloriesObserver macAddress[", str, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var5, strM5);
                xm2.g.f191527c.getClass();
                xm2.g gVarB5 = xm2.g.a.b();
                p pVar = f83406j;
                pVar.getClass();
                xm2.h hVar5 = xm2.h.CALORIES;
                hVar5.getClass();
                gVarB5.a(pVar, hVar5, str);
            }
            if (f83416t.size() > 0) {
                a2 a2Var6 = a2.DEVICES;
                String strM6 = am.j.m("RealTimeDataProvider addListener respirationObserver macAddress[", str, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var6, strM6);
                xm2.g.f191527c.getClass();
                xm2.g gVarB6 = xm2.g.a.b();
                h0 h0Var = f83407k;
                h0Var.getClass();
                gVarB6.a(h0Var, xm2.h.RESPIRATION, str);
            }
            if (f83417u.size() > 0) {
                a2 a2Var7 = a2.DEVICES;
                String strM7 = am.j.m("RealTimeDataProvider addListener bodyBatteryObserver macAddress[", str, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var7, strM7);
                ge1.b.T(f83398b, null, null, new v(str, null), 3);
            }
            if (f83418v.size() > 0) {
                a2 a2Var8 = a2.DEVICES;
                String strM8 = am.j.m("RealTimeDataProvider addListener TrainingReadinessObserver macAddress[", str, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var8, strM8);
                xm2.g.f191527c.getClass();
                xm2.g gVarB7 = xm2.g.a.b();
                l0 l0Var = f83409m;
                l0Var.getClass();
                gVarB7.a(l0Var, xm2.h.TRAINING_READINESS, str);
            }
        }
    }

    public static String c(long j8) {
        String macAddress;
        DeviceProfile[] deviceProfileArrA = da2.d.b().f58886a.f111646e.a(j8);
        DeviceProfile deviceProfile = null;
        if (deviceProfileArrA.length == 0) {
            return null;
        }
        for (DeviceProfile deviceProfile2 : deviceProfileArrA) {
            if (deviceProfile2.getConnectionType() == 1) {
                deviceProfile = deviceProfile2;
                break;
            }
        }
        if (deviceProfile != null && (macAddress = deviceProfile.getMacAddress()) != null) {
            return macAddress;
        }
        String macAddress2 = ((DeviceProfile) p13.u.E(deviceProfileArrA)).getMacAddress();
        macAddress2.getClass();
        return macAddress2;
    }

    public static void d() {
        DeviceProfile[] deviceProfileArrA = da2.d.b().f58886a.f111646e.a(f83399c);
        DeviceProfile deviceProfile = null;
        String macAddress = null;
        if (deviceProfileArrA.length == 0) {
            a2 a2Var = a2.DEVICES;
            String strF = androidx.room.a0.f(f83399c, "RealTimeDataProvider getRealTimeHeartRateMacAddress PAT not connected unitId[", "]");
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            ArrayList arrayListE = da2.d.b().f58886a.f111646e.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListE) {
                if (((DeviceProfile) obj).getConnectionType() != 0) {
                    arrayList.add(obj);
                }
            }
            List listN0 = p13.h0.N0(arrayList, new u());
            if (!listN0.isEmpty()) {
                f83400d = ((DeviceProfile) p13.h0.b0(listN0)).getF92746j();
                macAddress = ((DeviceProfile) p13.h0.b0(listN0)).getMacAddress();
            }
        } else {
            f83400d = ((DeviceProfile) p13.u.E(deviceProfileArrA)).getF92746j();
            for (DeviceProfile deviceProfile2 : deviceProfileArrA) {
                if (deviceProfile2.getConnectionType() == 1) {
                    deviceProfile = deviceProfile2;
                    break;
                }
            }
            if (deviceProfile == null || (macAddress = deviceProfile.getMacAddress()) == null) {
                macAddress = ((DeviceProfile) p13.u.E(deviceProfileArrA)).getMacAddress();
                macAddress.getClass();
            }
        }
        if (macAddress != null) {
            a2 a2Var2 = a2.DEVICES;
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(f83400d, "RealTimeDataProvider addListener heartRateObserver macAddress[", macAddress, "] unitId[");
            sbJ.append("]");
            String string = sbJ.toString();
            i2.f36769a.getClass();
            i2.a.a(a2Var2, string);
            xm2.g.f191527c.getClass();
            xm2.g gVarB = xm2.g.a.b();
            b0 b0Var = f83401e;
            b0Var.getClass();
            gVarB.a(b0Var, xm2.h.HEART_RATE, macAddress);
        }
    }

    public static void e(String str) {
        a2 a2Var = a2.DEVICES;
        String strM = am.j.m("RealTimeDataProvider removeAllListeners macAddress[", str, "]");
        i2.f36769a.getClass();
        i2.a.a(a2Var, strM);
        f12.l.f68084a.getClass();
        f12.l.a.a().r(F);
        xm2.g.f191527c.getClass();
        xm2.g gVarB = xm2.g.a.b();
        b0 b0Var = f83401e;
        b0Var.getClass();
        gVarB.b(b0Var, xm2.h.HEART_RATE, str);
        xm2.g gVarB2 = xm2.g.a.b();
        j0 j0Var = f83402f;
        j0Var.getClass();
        xm2.h hVar = xm2.h.STEPS;
        hVar.getClass();
        gVarB2.b(j0Var, hVar, str);
        xm2.g gVarB3 = xm2.g.a.b();
        f0 f0Var = f83403g;
        f0Var.getClass();
        xm2.h hVar2 = xm2.h.PUSHES;
        hVar2.getClass();
        gVarB3.b(f0Var, hVar2, str);
        xm2.g gVarB4 = xm2.g.a.b();
        z zVar = f83404h;
        zVar.getClass();
        xm2.h hVar3 = xm2.h.ASCENT;
        hVar3.getClass();
        gVarB4.b(zVar, hVar3, str);
        xm2.g gVarB5 = xm2.g.a.b();
        d0 d0Var = f83405i;
        d0Var.getClass();
        xm2.h hVar4 = xm2.h.INTENSITY_MINUTES;
        hVar4.getClass();
        gVarB5.b(d0Var, hVar4, str);
        xm2.g gVarB6 = xm2.g.a.b();
        p pVar = f83406j;
        pVar.getClass();
        xm2.h hVar5 = xm2.h.CALORIES;
        hVar5.getClass();
        gVarB6.b(pVar, hVar5, str);
        xm2.g gVarB7 = xm2.g.a.b();
        h0 h0Var = f83407k;
        h0Var.getClass();
        gVarB7.b(h0Var, xm2.h.RESPIRATION, str);
        xm2.g gVarB8 = xm2.g.a.b();
        n nVar = f83408l;
        nVar.getClass();
        gVarB8.b(nVar, xm2.h.BODY_BATTERY, str);
        xm2.g gVarB9 = xm2.g.a.b();
        l0 l0Var = f83409m;
        l0Var.getClass();
        gVarB9.b(l0Var, xm2.h.TRAINING_READINESS, str);
    }

    public static void f() {
        f12.l.f68084a.getClass();
        f12.l.a.a().r(F);
        String strC = c(f83400d);
        if (strC != null) {
            a2 a2Var = a2.DEVICES;
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(f83400d, "RealTimeDataProvider removeListener heartRateObserver macAddress[", strC, "] unitId[");
            sbJ.append("]");
            String string = sbJ.toString();
            i2.f36769a.getClass();
            i2.a.a(a2Var, string);
            f83400d = 0L;
            xm2.g.f191527c.getClass();
            xm2.g gVarB = xm2.g.a.b();
            b0 b0Var = f83401e;
            b0Var.getClass();
            gVarB.b(b0Var, xm2.h.HEART_RATE, strC);
        }
    }

    public static void g(q qVar, zy0.a aVar) {
        ge1.b.T(f83398b, null, null, new k(qVar, aVar, null), 3);
    }
}

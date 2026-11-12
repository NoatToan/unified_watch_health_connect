package y10;

import android.os.CountDownTimer;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.t0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import gg1.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ly10/k;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/connectiq/l;", "appType", "", "deviceUnitID", "Lgg1/v0;", "serverEnvironment", "Lr10/d;", "connectIQDownloadRepo", "Lcom/garmin/android/apps/connectmobile/connectiq/b0;", "connectIQRequestManager", "Lrd2/j;", "deviceDAORetriever", "Lc22/a0;", "dispatcherProvider", "Ll80/a;", "deviceDelegate", "<init>", "(Lcom/garmin/android/apps/connectmobile/connectiq/l;JLgg1/v0;Lr10/d;Lcom/garmin/android/apps/connectmobile/connectiq/b0;Lrd2/j;Lc22/a0;Ll80/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f193901y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.connectiq.l f193902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f193903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f193904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r10.d f193905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.connectiq.b0 f193906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rd2.j f193907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c22.a0 f193908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l80.a f193909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f193910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f193911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f193912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f193913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap<String, o10.b> f193914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap<String, o10.b> f193915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashMap<String, o10.b> f193916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0<n0> f193917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f193918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0<o0> f193919r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f193920t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.j f193921v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f193922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f193923x;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193924a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.connectiq.l.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.connectiq.l.APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connectiq.l.WIDGETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connectiq.l.WATCH_FACES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connectiq.l.DATA_FIELDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connectiq.l.MUSIC_PROVIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connectiq.l.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f193924a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lsd2/f;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$databaseRecord$1", f = "ConnectIQDownloadViewModel.kt", l = {105, 105}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<t0<sd2.f>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t0 f193925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f193926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f193927c;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = k.this.new c(dVar);
            cVar.f193927c = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(t0<sd2.f> t0Var, t13.d<? super Unit> dVar) {
            return ((c) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            t0 t0Var = (t0) this.f193927c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193926b;
            if (i14 != 0) {
                if (i14 == 1) {
                    t0Var = this.f193925a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            this.f193927c = null;
            this.f193925a = t0Var;
            this.f193926b = 1;
            int i15 = k.f193901y;
            obj = k.this.F4(this);
            if (obj != aVar) {
            }
            return aVar;
            this.f193927c = null;
            this.f193925a = null;
            this.f193926b = 2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y10/k$d", "Landroid/os/CountDownTimer;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends CountDownTimer {
        public d() {
            super(AbstractComponentTracker.LINGERING_TIMEOUT, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            k.this.f193917p.m(n0.h.f193969a);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y10/k$e", "Lcom/garmin/android/apps/connectmobile/connectiq/b0$k;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements com.garmin.android.apps.connectmobile.connectiq.b0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o10.b f193930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f193931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<o10.b, Unit> f193932c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(o10.b bVar, k kVar, e23.l<? super o10.b, Unit> lVar) {
            this.f193930a = bVar;
            this.f193931b = kVar;
            this.f193932c = lVar;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.k
        public final void K3() {
            this.f193931b.f193917p.j(new n0.d(false, this.f193932c, null, null, 12, null));
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.k
        public final void R7() {
            o10.b bVar = this.f193930a;
            k kVar = this.f193931b;
            if (bVar == null) {
                kVar.f193917p.j(new n0.d(true, this.f193932c, null, null, 12, null));
                return;
            }
            n0.d dVar = new n0.d(true, this.f193932c, bVar, null, 8, null);
            kVar.getClass();
            ge1.b.T(v1.a(kVar), null, null, new d0(kVar, dVar, null), 3);
        }
    }

    static {
        new a(null);
    }

    public k(com.garmin.android.apps.connectmobile.connectiq.l lVar, long j8, v0 v0Var, r10.d dVar, com.garmin.android.apps.connectmobile.connectiq.b0 b0Var, rd2.j jVar, c22.a0 a0Var, l80.a aVar) {
        lVar.getClass();
        v0Var.getClass();
        dVar.getClass();
        b0Var.getClass();
        jVar.getClass();
        a0Var.getClass();
        aVar.getClass();
        this.f193902a = lVar;
        this.f193903b = j8;
        this.f193904c = v0Var;
        this.f193905d = dVar;
        this.f193906e = b0Var;
        this.f193907f = jVar;
        this.f193908g = a0Var;
        this.f193909h = aVar;
        this.f193912k = new ArrayList();
        this.f193913l = new ArrayList();
        this.f193914m = new LinkedHashMap<>();
        this.f193915n = new LinkedHashMap<>();
        this.f193916o = new LinkedHashMap<>();
        y0<n0> y0Var = new y0<>();
        this.f193917p = y0Var;
        this.f193918q = y0Var;
        y0<o0> y0Var2 = new y0<>();
        this.f193919r = y0Var2;
        this.f193920t = y0Var2;
        this.f193921v = androidx.lifecycle.m.a(null, new c(null), 3);
        this.f193923x = new d();
    }

    public static final Object A4(k kVar, List list, n0.d dVar, d0 d0Var) throws Throwable {
        boolean z14;
        long j8 = kVar.f193903b;
        com.garmin.android.apps.connectmobile.connectiq.l lVar = kVar.f193902a;
        LinkedHashMap<String, o10.b> linkedHashMap = kVar.f193915n;
        linkedHashMap.clear();
        LinkedHashMap<String, o10.b> linkedHashMap2 = kVar.f193914m;
        linkedHashMap2.clear();
        LinkedHashMap<String, o10.b> linkedHashMap3 = kVar.f193916o;
        linkedHashMap3.clear();
        Iterator it = list.iterator();
        boolean z15 = false;
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.connectiq.e eVar = (com.garmin.android.apps.connectmobile.connectiq.e) it.next();
            o10.b bVar = new o10.b(0, null, 0L, null, null, false, null, null, null, null, null, null, false, false, false, false, 0, 131071, null);
            UUID uuid = eVar.f31857a;
            int i14 = eVar.f31858b;
            bVar.D(uuid.toString());
            String str = lVar.f31894a;
            str.getClass();
            bVar.g0(str);
            bVar.e0(i14);
            bVar.a0(eVar.f31859c);
            String str2 = eVar.f31861e;
            str2.getClass();
            bVar.c0(str2);
            bVar.Z(true);
            bVar.G(eVar.f31860d);
            bVar.H(eVar.f31863g);
            Parcelable.Creator<com.garmin.android.apps.connectmobile.connectiq.e> creator = com.garmin.android.apps.connectmobile.connectiq.e.CREATOR;
            if (i14 != -1) {
                bVar.M(kVar.f193904c.h() + "/com.garmin.apps/content/images/garminapps/" + i14 + ".png");
            }
            if (lVar == com.garmin.android.apps.connectmobile.connectiq.l.WIDGETS) {
                if (!bVar.getDisabled()) {
                    linkedHashMap.put(bVar.f(), bVar);
                } else if (kVar.f193922w || !(bVar.getNativeAppSourceId() == 0 || bVar.getNativeAppSourceId() == -1)) {
                    bVar.Z(false);
                    eVar.f31860d = true;
                    linkedHashMap3.put(bVar.f(), bVar);
                } else {
                    linkedHashMap.put(bVar.f(), bVar);
                }
                z14 = true;
            } else {
                Boolean favorite = bVar.getFavorite();
                if (!bVar.getDisabled()) {
                    z14 = true;
                    if (favorite == null || !favorite.booleanValue()) {
                        linkedHashMap.put(bVar.f(), bVar);
                    } else {
                        linkedHashMap2.put(bVar.f(), bVar);
                    }
                } else if (bVar.getNativeAppSourceId() == 0 || bVar.getNativeAppSourceId() == -1) {
                    z14 = true;
                    if (bVar.getInstalled()) {
                        if (favorite == null || !favorite.booleanValue()) {
                            linkedHashMap.put(bVar.f(), bVar);
                        } else {
                            linkedHashMap2.put(bVar.f(), bVar);
                        }
                    }
                } else {
                    bVar.Z(false);
                    z14 = true;
                    eVar.f31860d = true;
                    linkedHashMap3.put(bVar.f(), bVar);
                }
            }
            if (!z15 && bVar.getNativeAppSourceId() == -1 && bVar.getInstalled()) {
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.HAS_CONNECT_IQ_APP_INSTALLED);
                z15 = z14;
            }
        }
        if (lVar == com.garmin.android.apps.connectmobile.connectiq.l.MUSIC_PROVIDER && !linkedHashMap.isEmpty()) {
            ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.HAS_INSTALLED_MUSIC_APPS);
        }
        DeviceProfile deviceProfileB = hk0.p.b(j8);
        Object objD4 = kVar.D4(hb2.h.b(), deviceProfileB != null ? zb0.n0.c(deviceProfileB) : "", dVar, d0Var);
        return objD4 == u13.a.COROUTINE_SUSPENDED ? objD4 : Unit.INSTANCE;
    }

    public static void J4(LinkedHashMap linkedHashMap, o10.b bVar, o10.b bVar2) {
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        ArrayList<o10.b> arrayList = new ArrayList(collectionValues);
        Collections.swap(arrayList, arrayList.indexOf(bVar), arrayList.indexOf(bVar2));
        linkedHashMap.clear();
        for (o10.b bVar3 : arrayList) {
            linkedHashMap.put(bVar3.f(), bVar3);
        }
    }

    public static final void x4(k kVar, List list) {
        LinkedHashMap<String, o10.b> linkedHashMap = kVar.f193914m;
        LinkedHashMap<String, o10.b> linkedHashMap2 = kVar.f193915n;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            o10.b bVar = (o10.b) list.get(i14);
            if (linkedHashMap2.containsKey(bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String()) || linkedHashMap.containsKey(bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String())) {
                o10.b bVar2 = linkedHashMap2.get(bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String()) != null ? linkedHashMap2.get(bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String()) : linkedHashMap.get(bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String());
                if (bVar2 != null) {
                    bVar2.c0(bVar.getName());
                    bVar2.F(bVar.getDeveloperName());
                    bVar2.g0(bVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String());
                    bVar2.f0(bVar.getSize());
                    int internalVersion = bVar.getInternalVersion();
                    if (internalVersion > bVar2.getInternalVersion()) {
                        bVar2.h0(true);
                        bVar2.a0(internalVersion);
                    }
                    bVar2.I(bVar.getHasSettings());
                    Boolean favorite = bVar.getFavorite();
                    if (favorite != null) {
                        bVar2.H(favorite.booleanValue());
                    }
                    Boolean favorite2 = bVar2.getFavorite();
                    if (favorite2 == null || !favorite2.booleanValue()) {
                        linkedHashMap2.put(bVar2.f(), bVar2);
                        linkedHashMap.remove(bVar2.f());
                    } else {
                        linkedHashMap.put(bVar2.f(), bVar2);
                    }
                }
            } else {
                kVar.f193916o.put(bVar.f(), bVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object y4(k kVar, o10.b bVar, v13.c cVar) throws Throwable {
        w wVar;
        y0<n0> y0Var = kVar.f193917p;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f194008d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f194008d = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(kVar, cVar);
            }
        } else {
            wVar = new w(kVar, cVar);
        }
        Object objE0 = wVar.f194006b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f194008d;
        if (i15 == 0) {
            o13.r.b(objE0);
            o53.z zVar = kVar.f193908g.f22991c;
            x xVar = new x(bVar, kVar, null);
            wVar.f194005a = bVar;
            wVar.f194008d = 1;
            objE0 = ge1.b.e0(zVar, xVar, wVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = wVar.f194005a;
            o13.r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            List list = (List) ((v2.b) v2Var).f47386a;
            if (list.isEmpty() || ((q10.b) list.get(0)).getStatus() != 200) {
                y0Var.m(n0.c.f193961a);
            } else {
                kVar.f193916o.remove(bVar.f());
                kVar.f193915n.put(bVar.f(), bVar);
                y0Var.m(new n0.b(kVar.E4(), kVar.G4(kVar.f193902a), true, null, 8, null));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0Var.m(n0.c.f193961a);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object z4(k kVar, v13.c cVar) {
        y yVar;
        String strD0;
        kVar.getClass();
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f194017c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f194017c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(kVar, cVar);
            }
        } else {
            yVar = new y(kVar, cVar);
        }
        Object objF4 = yVar.f194015a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f194017c;
        if (i15 == 0) {
            o13.r.b(objF4);
            yVar.f194017c = 1;
            objF4 = kVar.F4(yVar);
            if (objF4 == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF4);
        }
        sd2.f fVar = (sd2.f) objF4;
        if (fVar == null || (strD0 = fVar.Q()) == null) {
            strD0 = fVar != null ? fVar.d0() : null;
        }
        return Boolean.valueOf(kVar.f193909h.y(strD0) == al2.k.STARTED);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (I4(r7, r8, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B4(List list, n0.d dVar, v13.c cVar) throws Throwable {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f193938d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f193938d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objE0 = lVar.f193936b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f193938d;
        if (i15 != 0) {
            if (i15 == 1) {
                dVar = lVar.f193935a;
                o13.r.b(objE0);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objE0);
        o53.z zVar = this.f193908g.f22991c;
        m mVar = new m(this, list, null);
        lVar.f193935a = dVar;
        lVar.f193938d = 1;
        objE0 = ge1.b.e0(zVar, mVar, lVar);
        if (objE0 != obj) {
        }
        return obj;
        v2 v2Var = (v2) objE0;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                this.f193917p.m(n0.c.f193961a);
                return Unit.INSTANCE;
            }
            u0.r();
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f193915n);
        linkedHashMap.putAll(this.f193914m);
        linkedHashMap.putAll(this.f193916o);
        for (o10.a aVar : (Iterable) ((v2.b) v2Var).f47386a) {
            o10.b bVar = (o10.b) linkedHashMap.get(aVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String());
            if (bVar != null) {
                bVar.M(aVar.getIconUrl());
            }
        }
        lVar.f193935a = null;
        lVar.f193938d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
    
        if (B4(r10, r9, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C4(ArrayList arrayList, String str, n0.d dVar, v13.c cVar) throws Throwable {
        n nVar;
        n0.d dVar2;
        String[] strArr;
        ArrayList arrayList2;
        int i14;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i15 = nVar.f193955d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                nVar.f193955d = i15 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objE0 = nVar.f193953b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = nVar.f193955d;
        c22.a0 a0Var = this.f193908g;
        if (i16 == 0) {
            o13.r.b(objE0);
            o53.z zVar = a0Var.f22991c;
            p pVar = new p(this, arrayList, str, null);
            nVar.f193952a = dVar;
            nVar.f193955d = 1;
            objE0 = ge1.b.e0(zVar, pVar, nVar);
            if (objE0 != obj) {
            }
            return obj;
        }
        if (i16 == 1) {
            dVar = nVar.f193952a;
            o13.r.b(objE0);
        } else if (i16 == 2) {
            dVar2 = nVar.f193952a;
            o13.r.b(objE0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.f193915n);
            linkedHashMap.putAll(this.f193914m);
            linkedHashMap.putAll(this.f193916o);
            new com.garmin.android.apps.connectmobile.connectiq.j();
            strArr = (String[]) linkedHashMap.keySet().toArray(new String[0]);
            arrayList2 = new ArrayList();
            for (String str2 : strArr) {
                if (!str2.startsWith("c0ffee15-600d")) {
                    arrayList2.add(str2);
                }
            }
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            strArr2.getClass();
            List listI0 = p13.u.i0(strArr2);
            nVar.f193952a = null;
            nVar.f193955d = 3;
        } else {
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        return Unit.INSTANCE;
        v2 v2Var = (v2) objE0;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                this.f193917p.m(n0.c.f193961a);
                return Unit.INSTANCE;
            }
            u0.r();
            return null;
        }
        o53.z zVar2 = a0Var.f22990b;
        o oVar = new o(this, v2Var, null);
        nVar.f193952a = dVar;
        nVar.f193955d = 2;
        if (ge1.b.e0(zVar2, oVar, nVar) != obj) {
            dVar2 = dVar;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(this.f193915n);
            linkedHashMap2.putAll(this.f193914m);
            linkedHashMap2.putAll(this.f193916o);
            new com.garmin.android.apps.connectmobile.connectiq.j();
            strArr = (String[]) linkedHashMap2.keySet().toArray(new String[0]);
            arrayList2 = new ArrayList();
            while (i14 < r2) {
                if (!str2.startsWith("c0ffee15-600d")) {
                    arrayList2.add(str2);
                }
            }
            String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
            strArr3.getClass();
            List listI1 = p13.u.i0(strArr3);
            nVar.f193952a = null;
            nVar.f193955d = 3;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (C4(r12, r11, r10, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D4(String str, String str2, n0.d dVar, v13.c cVar) throws Throwable {
        q qVar;
        n0.d dVar2;
        long j8;
        DeviceProfile deviceProfileB;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f193986d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f193986d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objE0 = qVar.f193984b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f193986d;
        c22.a0 a0Var = this.f193908g;
        y0<n0> y0Var = this.f193917p;
        if (i15 == 0) {
            o13.r.b(objE0);
            o53.z zVar = a0Var.f22991c;
            s sVar = new s(this, str, str2, null);
            qVar.f193983a = dVar;
            qVar.f193986d = 1;
            objE0 = ge1.b.e0(zVar, sVar, qVar);
            if (objE0 != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            dVar = qVar.f193983a;
            o13.r.b(objE0);
        } else if (i15 == 2) {
            dVar2 = qVar.f193983a;
            o13.r.b(objE0);
            j8 = this.f193903b;
            if (hk0.p.k(j8) || (deviceProfileB = hk0.p.b(j8)) == null) {
                y0Var.m(n0.e.f193966a);
                return Unit.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(this.f193915n.values());
            String strC = zb0.n0.c(deviceProfileB);
            qVar.f193983a = null;
            qVar.f193986d = 3;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        return Unit.INSTANCE;
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            o53.z zVar2 = a0Var.f22990b;
            r rVar = new r(this, v2Var, null);
            qVar.f193983a = dVar;
            qVar.f193986d = 2;
            if (ge1.b.e0(zVar2, rVar, qVar) != obj) {
                dVar2 = dVar;
                j8 = this.f193903b;
                if (hk0.p.k(j8)) {
                    y0Var.m(n0.e.f193966a);
                } else {
                    y0Var.m(n0.e.f193966a);
                }
            }
            return obj;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        y0Var.m(n0.c.f193961a);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:138:0x0507  */
    /* JADX WARN: Code duplicated, block: B:140:0x0511  */
    /* JADX WARN: Code duplicated, block: B:141:0x0535  */
    /* JADX WARN: Code duplicated, block: B:144:0x0548 A[LOOP:13: B:142:0x0542->B:144:0x0548, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List<com.garmin.android.apps.connectmobile.connectiq.y>] */
    /* JADX WARN: Type inference failed for: r3v87 */
    public final List<com.garmin.android.apps.connectmobile.connectiq.y> E4() {
        ?? arrayList;
        zb0.u0 u0Var;
        int i14;
        ArrayList arrayList2 = this.f193913l;
        arrayList2.clear();
        int i15 = b.f193924a[this.f193902a.ordinal()];
        LinkedHashMap<String, o10.b> linkedHashMap = this.f193916o;
        LinkedHashMap<String, o10.b> linkedHashMap2 = this.f193915n;
        switch (i15) {
            case 1:
                arrayList = new ArrayList();
                DeviceProfile deviceProfileB = hk0.p.b(this.f193903b);
                String strValueOf = String.valueOf(deviceProfileB != null ? Integer.valueOf(deviceProfileB.getF92744h()) : null);
                Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
                boolean zIsEmpty = TextUtils.isEmpty(strValueOf);
                int i16 = R.string.connect_iq_no_applications_installed;
                if (!zIsEmpty && (u0Var = (zb0.u0) zb0.u0.f203782n6.get(strValueOf)) != null && (i14 = zb0.n0.a.f203583a[u0Var.ordinal()]) != 45 && i14 != 50) {
                    switch (i14) {
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_installed));
                            if (linkedHashMap2.isEmpty()) {
                                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_applications_installed));
                            } else if (linkedHashMap2.values().size() == 1) {
                                Collection<o10.b> collectionValues = linkedHashMap2.values();
                                collectionValues.getClass();
                                Object objW = p13.h0.W(collectionValues, 0);
                                objW.getClass();
                                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a((o10.b) objW, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                            } else {
                                Collection<o10.b> collectionValues2 = linkedHashMap2.values();
                                collectionValues2.getClass();
                                for (o10.b bVar : collectionValues2) {
                                    bVar.getClass();
                                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar, com.garmin.android.apps.connectmobile.connectiq.b.REORDERABLE, false, 4, null));
                                }
                            }
                            arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_not_installed));
                            break;
                        default:
                            if (!this.f193922w) {
                                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.e(R.string.wifi_added));
                            }
                            arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_favorites));
                            LinkedHashMap<String, o10.b> linkedHashMap3 = this.f193914m;
                            if (linkedHashMap3.isEmpty()) {
                                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(linkedHashMap2.isEmpty() ? R.string.connect_iq_no_applications_installed : R.string.ciq_favorites_apps_empty_section_text));
                            } else if (linkedHashMap3.values().size() == 1) {
                                Collection<o10.b> collectionValues3 = linkedHashMap3.values();
                                collectionValues3.getClass();
                                Object objW2 = p13.h0.W(collectionValues3, 0);
                                objW2.getClass();
                                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a((o10.b) objW2, com.garmin.android.apps.connectmobile.connectiq.b.ADDED, false, 4, null));
                            } else {
                                Collection<o10.b> collectionValues4 = linkedHashMap3.values();
                                collectionValues4.getClass();
                                for (o10.b bVar2 : collectionValues4) {
                                    bVar2.getClass();
                                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar2, com.garmin.android.apps.connectmobile.connectiq.b.ADDED_REORDERABLE, false, 4, null));
                                }
                            }
                            arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.connect_iq_more_activities_and_apps));
                            if (linkedHashMap2.isEmpty()) {
                                if (!linkedHashMap3.isEmpty()) {
                                    i16 = R.string.connect_iq_no_favorites;
                                }
                                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(i16));
                            } else if (linkedHashMap2.values().size() == 1) {
                                Collection<o10.b> collectionValues5 = linkedHashMap2.values();
                                collectionValues5.getClass();
                                Object objW3 = p13.h0.W(collectionValues5, 0);
                                objW3.getClass();
                                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a((o10.b) objW3, com.garmin.android.apps.connectmobile.connectiq.b.NOT_ADDED, false, 4, null));
                            } else {
                                Collection<o10.b> collectionValues6 = linkedHashMap2.values();
                                collectionValues6.getClass();
                                for (o10.b bVar3 : collectionValues6) {
                                    bVar3.getClass();
                                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar3, com.garmin.android.apps.connectmobile.connectiq.b.NOT_ADDED_REORDERABLE, false, 4, null));
                                }
                            }
                            if (this.f193922w) {
                                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.social_available));
                            } else {
                                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.e(R.string.pn_smart_scale_user_removed));
                            }
                            break;
                    }
                } else {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_installed));
                    if (linkedHashMap2.isEmpty()) {
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_applications_installed));
                    } else if (linkedHashMap2.values().size() == 1) {
                        Collection<o10.b> collectionValues7 = linkedHashMap2.values();
                        collectionValues7.getClass();
                        Object objW4 = p13.h0.W(collectionValues7, 0);
                        objW4.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a((o10.b) objW4, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                    } else {
                        Collection<o10.b> collectionValues8 = linkedHashMap2.values();
                        collectionValues8.getClass();
                        while (r3.hasNext()) {
                            bVar.getClass();
                            arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar, com.garmin.android.apps.connectmobile.connectiq.b.REORDERABLE, false, 4, null));
                        }
                    }
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_not_installed));
                }
                if (!linkedHashMap.isEmpty()) {
                    Collection<o10.b> collectionValues9 = linkedHashMap.values();
                    collectionValues9.getClass();
                    for (o10.b bVar4 : collectionValues9) {
                        bVar4.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar4, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                    }
                } else if (this.f193922w) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.ciq_available_apps_empty_section_text));
                } else {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_removed_apps));
                }
                if (this.f193922w) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.c(R.string.ciq_apps_button));
                }
                break;
            case 2:
                if (this.f193922w) {
                    arrayList = new ArrayList();
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.wifi_added));
                    if (linkedHashMap2.isEmpty()) {
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.ciq_glances_added_help_text));
                    } else if (linkedHashMap2.values().size() == 1) {
                        Collection<o10.b> collectionValues10 = linkedHashMap2.values();
                        collectionValues10.getClass();
                        Object objW5 = p13.h0.W(collectionValues10, 0);
                        objW5.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a((o10.b) objW5, com.garmin.android.apps.connectmobile.connectiq.b.ADDED, false));
                    } else {
                        Collection<o10.b> collectionValues11 = linkedHashMap2.values();
                        collectionValues11.getClass();
                        for (o10.b bVar5 : collectionValues11) {
                            bVar5.getClass();
                            arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar5, com.garmin.android.apps.connectmobile.connectiq.b.ADDED_REORDERABLE, false));
                        }
                    }
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.social_available));
                    if (linkedHashMap.isEmpty()) {
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.ciq_glances_available_help_text));
                    } else if (linkedHashMap.values().size() == 1) {
                        Collection<o10.b> collectionValues12 = linkedHashMap.values();
                        collectionValues12.getClass();
                        Object objW6 = p13.h0.W(collectionValues12, 0);
                        objW6.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a((o10.b) objW6, com.garmin.android.apps.connectmobile.connectiq.b.NOT_ADDED, false));
                    } else {
                        Collection<o10.b> collectionValues13 = linkedHashMap.values();
                        collectionValues13.getClass();
                        for (o10.b bVar6 : collectionValues13) {
                            bVar6.getClass();
                            arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar6, com.garmin.android.apps.connectmobile.connectiq.b.NOT_ADDED_REORDERABLE, false));
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_installed));
                    if (linkedHashMap2.isEmpty()) {
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_widgets_installed));
                    } else if (linkedHashMap2.values().size() == 1) {
                        Collection<o10.b> collectionValues14 = linkedHashMap2.values();
                        collectionValues14.getClass();
                        Object objW7 = p13.h0.W(collectionValues14, 0);
                        objW7.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a((o10.b) objW7, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                    } else {
                        Collection<o10.b> collectionValues15 = linkedHashMap2.values();
                        collectionValues15.getClass();
                        for (o10.b bVar7 : collectionValues15) {
                            bVar7.getClass();
                            arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar7, com.garmin.android.apps.connectmobile.connectiq.b.REORDERABLE, false, 4, null));
                        }
                    }
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_not_installed));
                    if (linkedHashMap.isEmpty()) {
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_removed_apps));
                    } else {
                        Collection<o10.b> collectionValues16 = linkedHashMap.values();
                        collectionValues16.getClass();
                        for (o10.b bVar8 : collectionValues16) {
                            bVar8.getClass();
                            arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar8, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                        }
                    }
                }
                break;
            case 3:
                arrayList = new ArrayList();
                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_installed));
                if (linkedHashMap2.isEmpty()) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_watch_faces_installed));
                    ge1.b.T(v1.a(this), null, null, new t(this, null), 3);
                } else {
                    Collection<o10.b> collectionValues17 = linkedHashMap2.values();
                    collectionValues17.getClass();
                    for (o10.b bVar9 : collectionValues17) {
                        bVar9.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar9, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                    }
                }
                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_not_installed));
                if (linkedHashMap.isEmpty()) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_removed_apps));
                } else {
                    Collection<o10.b> collectionValues18 = linkedHashMap.values();
                    collectionValues18.getClass();
                    for (o10.b bVar10 : collectionValues18) {
                        bVar10.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar10, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                    }
                }
                break;
            case 4:
                arrayList = new ArrayList();
                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_installed));
                if (linkedHashMap2.isEmpty()) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_data_fields_installed));
                } else {
                    Collection<o10.b> collectionValues19 = linkedHashMap2.values();
                    collectionValues19.getClass();
                    for (o10.b bVar11 : collectionValues19) {
                        bVar11.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar11, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                    }
                }
                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_not_installed));
                if (linkedHashMap.isEmpty()) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_removed_apps));
                } else {
                    Collection<o10.b> collectionValues20 = linkedHashMap.values();
                    collectionValues20.getClass();
                    for (o10.b bVar12 : collectionValues20) {
                        bVar12.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar12, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                    }
                }
                break;
            case 5:
                arrayList = new ArrayList();
                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_installed));
                if (linkedHashMap2.isEmpty()) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_music_apps_installed));
                } else {
                    Collection<o10.b> collectionValues21 = linkedHashMap2.values();
                    collectionValues21.getClass();
                    for (o10.b bVar13 : collectionValues21) {
                        bVar13.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar13, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                    }
                }
                arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.d(R.string.lbl_not_installed));
                if (linkedHashMap.isEmpty()) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.b(R.string.connect_iq_no_removed_apps));
                } else {
                    Collection<o10.b> collectionValues22 = linkedHashMap.values();
                    collectionValues22.getClass();
                    for (o10.b bVar14 : collectionValues22) {
                        bVar14.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.y.a(bVar14, com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION, false, 4, null));
                    }
                }
                break;
            case 6:
                arrayList = p13.j0.f134944a;
                break;
            default:
                u0.r();
                return null;
        }
        arrayList2.addAll((Collection) arrayList);
        return arrayList;
    }

    public final Object F4(v13.c cVar) {
        return ge1.b.e0(this.f193908g.f22991c, new u(this, null), cVar);
    }

    public final boolean G4(com.garmin.android.apps.connectmobile.connectiq.l lVar) {
        int i14 = b.f193924a[lVar.ordinal()];
        if (i14 != 1) {
            return (i14 == 2 && this.f193922w) ? false : true;
        }
        return !this.f193922w;
    }

    public final boolean H4() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f193913l) {
            if (obj instanceof com.garmin.android.apps.connectmobile.connectiq.y.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.garmin.android.apps.connectmobile.connectiq.y.a) it.next()).f32092a);
        }
        return !p13.m.b(this.f193912k.toArray(new o10.b[0]), arrayList2.toArray(new o10.b[0]));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object I4(LinkedHashMap linkedHashMap, n0.d dVar, v13.c cVar) throws Throwable {
        b0 b0Var;
        List<com.garmin.android.apps.connectmobile.connectiq.y> listE4;
        String str;
        n0.d dVar2 = dVar;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f193787e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f193787e = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object objE0 = b0Var.f193785c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f193787e;
        y0<n0> y0Var = this.f193917p;
        if (i15 == 0) {
            o13.r.b(objE0);
            for (o10.b bVar : linkedHashMap.values()) {
                String str2 = bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String();
                LinkedHashMap<String, o10.b> linkedHashMap2 = this.f193915n;
                boolean zContainsKey = linkedHashMap2.containsKey(str2);
                LinkedHashMap<String, o10.b> linkedHashMap3 = this.f193914m;
                if (zContainsKey || linkedHashMap3.containsKey(bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String())) {
                    bVar.Z(true);
                    if (bVar.getInstalled()) {
                        Boolean favorite = bVar.getFavorite();
                        if (favorite == null || !favorite.booleanValue()) {
                            linkedHashMap2.put(bVar.f(), bVar);
                        } else {
                            linkedHashMap3.put(bVar.f(), bVar);
                        }
                    }
                } else {
                    String str3 = bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String();
                    LinkedHashMap<String, o10.b> linkedHashMap4 = this.f193916o;
                    o10.b bVar2 = linkedHashMap4.get(str3);
                    if (bVar2 != null && bVar2.getDisabled()) {
                        bVar.G(true);
                    }
                    linkedHashMap4.put(bVar.f(), bVar);
                }
            }
            listE4 = E4();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE4) {
                if (obj instanceof com.garmin.android.apps.connectmobile.connectiq.y.a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(o10.b.b(((com.garmin.android.apps.connectmobile.connectiq.y.a) it.next()).f32092a));
            }
            this.f193912k = arrayList2;
            o10.b bVar3 = dVar2 != null ? dVar2.f193964c : null;
            if (bVar3 != null) {
                o53.z zVar = this.f193908g.f22990b;
                c0 c0Var = new c0(this, bVar3, null);
                b0Var.f193783a = dVar2;
                b0Var.f193784b = listE4;
                b0Var.f193787e = 1;
                objE0 = ge1.b.e0(zVar, c0Var, b0Var);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                y0Var.m(new n0.b(listE4, G4(this.f193902a), false, null, 12, null));
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        List<com.garmin.android.apps.connectmobile.connectiq.y> list = (List) b0Var.f193784b;
        n0.d dVar3 = b0Var.f193783a;
        o13.r.b(objE0);
        listE4 = list;
        dVar2 = dVar3;
        o10.b bVar4 = (o10.b) objE0;
        if (bVar4 != null && (str = bVar4.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String()) != null && (!d53.w.J(str))) {
            dVar2.f193964c = bVar4;
        }
        dVar2.f193965d = listE4;
        y0Var.m(dVar2);
        return Unit.INSTANCE;
    }

    public final void K4(o10.b bVar, e23.l<? super o10.b, Unit> lVar) {
        boolean zH4 = H4();
        y0<n0> y0Var = this.f193917p;
        if (!zH4) {
            y0Var.j(new n0.d(true, lVar, null, null, 12, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f193913l) {
            if (obj instanceof com.garmin.android.apps.connectmobile.connectiq.y.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o10.b bVar2 = ((com.garmin.android.apps.connectmobile.connectiq.y.a) it.next()).f32092a;
            arrayList2.add(new com.garmin.android.apps.connectmobile.connectiq.e(UUID.fromString(bVar2.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String()), bVar2.getInternalVersion(), bVar2.getSize(), bVar2.getDisabled(), bVar2.getNativeAppSourceId(), bVar2.A()));
        }
        e eVar = new e(bVar, this, lVar);
        int i14 = b.f193924a[this.f193902a.ordinal()];
        com.garmin.android.apps.connectmobile.connectiq.b0 b0Var = this.f193906e;
        if (i14 != 1) {
            if (i14 != 2) {
                y0Var.j(new n0.d(true, lVar, null, null, 12, null));
                return;
            } else {
                b0Var.getClass();
                b0Var.f(arrayList2, GDIConnectIQInstalledApps.AppType.WIDGET, eVar);
                return;
            }
        }
        b0Var.getClass();
        i2.d("ConnectIQRequestManager", "#updateInstalledApps " + arrayList2.size());
        ArrayList arrayList3 = new ArrayList();
        b0Var.d(GDIConnectIQInstalledApps.AppType.WIDGET, new com.garmin.android.apps.connectmobile.connectiq.e0(b0Var, arrayList3, arrayList2, new com.garmin.android.apps.connectmobile.connectiq.d0(b0Var, arrayList3, eVar)));
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        this.f193923x.cancel();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly10/k$a;", "", "<init>", "()V", "", "ICON_BASE_URL_PATH", "Ljava/lang/String;", "", "DEVICE_INSTALLED_LIST_TIMEOUT", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

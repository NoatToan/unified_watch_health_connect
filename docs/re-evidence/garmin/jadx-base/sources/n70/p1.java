package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ln70/p1;", "", "Lpc0/j;", "devicesRepo", "Llc0/f;", "getBluetoothStateUseCase", "Lzd0/i;", "getDeviceConnectionStateUseCase", "Ll80/b;", "gdiDelegate", "<init>", "(Lpc0/j;Llc0/f;Lzd0/i;Ll80/b;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc0.j f124470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lc0.f f124471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.b f124472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r53.p2 f124473d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln70/p1$a;", "", "Lo70/g;", "connectionStatus", "Lcom/garmin/android/apps/connectmobile/devices/model/u;", "homeDeviceInfo", "<init>", "(Lo70/g;Lcom/garmin/android/apps/connectmobile/devices/model/u;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o70.g f124474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.devices.model.u f124475b;

        public a(o70.g gVar, com.garmin.android.apps.connectmobile.devices.model.u uVar) {
            gVar.getClass();
            uVar.getClass();
            this.f124474a = gVar;
            this.f124475b = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f124474a == aVar.f124474a && this.f124475b.equals(aVar.f124475b);
        }

        public final int hashCode() {
            return this.f124475b.hashCode() + (this.f124474a.hashCode() * 31);
        }

        public final String toString() {
            return "DeviceInfo(connectionStatus=" + this.f124474a + ", homeDeviceInfo=" + this.f124475b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<unused var>", "Lzd0/c;", "Ln70/p1$a;", "<anonymous>", "(ZLzd0/c;Z)Ln70/p1$a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDevicesInfoUseCase$invoke$1", f = "GetDevicesInfoUseCase.kt", l = {34}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.r<Boolean, zd0.c, Boolean, t13.d<? super a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f124476a;

        public b(t13.d<? super b> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(Boolean bool, zd0.c cVar, Boolean bool2, t13.d<? super a> dVar) {
            bool.booleanValue();
            bool2.booleanValue();
            return p1.this.new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f124476a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f124476a = 1;
                Object objA = p1.a(p1.this, this);
                return objA == aVar ? aVar : objA;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ln70/p1$a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDevicesInfoUseCase$invoke$2", f = "GetDevicesInfoUseCase.kt", l = {36, 36}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super a>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r53.j f124478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f124479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f124480c;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = p1.this.new c(dVar);
            cVar.f124480c = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super a> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            r53.j jVar = (r53.j) this.f124480c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f124479b;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f124480c = null;
                this.f124478a = jVar;
                this.f124479b = 1;
                obj = p1.a(p1.this, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                jVar = this.f124478a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            this.f124480c = null;
            this.f124478a = null;
            this.f124479b = 2;
        }
    }

    public p1(pc0.j jVar, lc0.f fVar, zd0.i iVar, l80.b bVar) {
        jVar.getClass();
        fVar.getClass();
        iVar.getClass();
        bVar.getClass();
        this.f124470a = jVar;
        this.f124471b = fVar;
        this.f124472c = bVar;
        this.f124473d = r53.q2.a(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(p1 p1Var, v13.c cVar) throws Throwable {
        q1 q1Var;
        o70.g gVar;
        p1Var.getClass();
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i14 = q1Var.f124504c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q1Var.f124504c = i14 - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(p1Var, cVar);
            }
        } else {
            q1Var = new q1(p1Var, cVar);
        }
        Object objE0 = q1Var.f124502a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q1Var.f124504c;
        if (i15 == 0) {
            o13.r.b(objE0);
            pc0.j jVar = p1Var.f124470a;
            q1Var.f124504c = 1;
            x53.c cVar2 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new pc0.b0(jVar, null), q1Var);
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
        com.garmin.android.apps.connectmobile.devices.model.u uVar = (com.garmin.android.apps.connectmobile.devices.model.u) objE0;
        sd2.f fVar = uVar.f34316a;
        String strD0 = fVar != null ? fVar.d0() : null;
        if (c22.e1.a()) {
            gVar = (strD0 == null || !p1Var.f124472c.f(strD0)) ? o70.g.NO_CONNECTIVITY_DEVICE : o70.g.CONNECTED;
        } else {
            gVar = o70.g.NO_BLUETOOTH;
        }
        return new a(gVar, uVar);
    }

    public final r53.i<a> b() {
        r53.b bVarA = this.f124471b.a();
        int i14 = zd0.i.f204028a;
        return r53.s.A(new r53.v(new c(null), r53.s.l(bVarA, r53.s.f(new zd0.j(null, null)), this.f124473d, new b(null))), o53.s0.f129406a);
    }
}

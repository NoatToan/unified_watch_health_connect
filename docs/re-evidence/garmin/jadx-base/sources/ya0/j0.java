package ya0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import o53.e1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.PairingSuccessViewModel$fetchPairedDeviceInfo$1", f = "PairingSuccessViewModel.kt", l = {64, 65, 66, 67}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f195458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.i0 f195459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o53.i0 f195460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o13.p f195461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z80.f f195462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f195463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f195464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f195465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f195466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f195467j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.PairingSuccessViewModel$fetchPairedDeviceInfo$1$1", f = "PairingSuccessViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f195468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f195469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ gj1.a f195470c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i0 i0Var, gj1.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f195469b = i0Var;
            this.f195470c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f195469b, this.f195470c, dVar);
            aVar.f195468a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            f90.j jVar = this.f195469b.f195452f;
            gj1.a aVar2 = this.f195470c;
            boolean zG = aVar2 != null ? p005kotlin.jvm.internal.s.g(aVar2.getPendingActivityCapable(), Boolean.TRUE) : false;
            jVar.getClass();
            ArrayList arrayListA = f90.j.a(zG);
            a2 a2Var = a2.DEVICE_SETUP;
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((q92.x) it.next()).f143819a);
            }
            String strK = androidx.room.a0.k("Trigger consent state fetch for: ", arrayList);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PairingSuccessViewModel", strK);
            p92.o.f136619a.getClass();
            ge1.b.T(e1.f129333a, null, null, new p92.j(arrayListA, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.PairingSuccessViewModel$fetchPairedDeviceInfo$1$applyBackupCapableDeferred$1", f = "PairingSuccessViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i0 f195471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f195472b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i0 i0Var, long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f195471a = i0Var;
            this.f195472b = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f195471a, this.f195472b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f195471a.f195450d.getClass();
            sd2.f fVarI = rd2.j.i(this.f195472b, null);
            return Boolean.valueOf(fVarI != null ? fVarI.p3() : false);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lgj1/a;", "Lq90/f;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.PairingSuccessViewModel$fetchPairedDeviceInfo$1$deviceInfoDeferred$1", f = "PairingSuccessViewModel.kt", l = {52}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends gj1.a, ? extends q90.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f195473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f195474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f195475c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i0 i0Var, long j8, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f195474b = i0Var;
            this.f195475c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f195474b, this.f195475c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends gj1.a, ? extends q90.f>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f195473a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p90.p pVar = this.f195474b.f195448b;
            this.f195473a = 1;
            Object objE0 = ge1.b.e0(pVar.f136555c, new p90.q(pVar, this.f195475c, null), this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "Lz80/f;", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.PairingSuccessViewModel$fetchPairedDeviceInfo$1$deviceSettingsDeferred$1", f = "PairingSuccessViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super o13.q<? extends z80.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f195476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f195477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f195478c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i0 i0Var, long j8, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f195477b = i0Var;
            this.f195478c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f195477b, this.f195478c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.q<? extends z80.f>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f195476a;
            if (i14 == 0) {
                o13.r.b(obj);
                y80.w wVar = this.f195477b.f195449c;
                this.f195476a = 1;
                objA = wVar.a(this.f195478c, this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objA = ((o13.q) obj).f128597a;
            }
            return o13.q.a(objA);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.PairingSuccessViewModel$fetchPairedDeviceInfo$1$screenlessCapableDeferred$1", f = "PairingSuccessViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i0 f195479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f195480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i0 i0Var, long j8, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f195479a = i0Var;
            this.f195480b = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f195479a, this.f195480b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f195479a.f195450d.getClass();
            sd2.f fVarI = rd2.j.i(this.f195480b, null);
            return Boolean.valueOf(fVarI != null ? fVarI.d2() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j8, i0 i0Var, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f195466i = j8;
        this.f195467j = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j0 j0Var = new j0(this.f195466i, this.f195467j, dVar);
        j0Var.f195465h = obj;
        return j0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:31:0x0105  */
    /* JADX WARN: Code duplicated, block: B:35:0x0150  */
    /* JADX WARN: Code duplicated, block: B:36:0x015d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0161  */
    /* JADX WARN: Code duplicated, block: B:39:0x016e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0172  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.i0 i0VarJ;
        Object objC;
        o53.j0 j0Var;
        o53.i0 i0Var;
        o13.p pVar;
        Object objAwait;
        boolean zBooleanValue;
        Object objAwait2;
        o13.p pVar2;
        boolean z14;
        Object obj2;
        z80.f fVar;
        Object objAwait3;
        boolean z15;
        o13.p pVar3;
        z80.f fVar2;
        boolean zBooleanValue2;
        gj1.a aVar;
        q90.f fVar3;
        p2 p2Var;
        Object value;
        boolean zI;
        boolean zG;
        boolean zG2;
        boolean zG3;
        long j8;
        String str;
        l90.b bVar;
        boolean z16;
        o53.b0 b0Var = (o53.b0) this.f195465h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195464g;
        i0 i0Var2 = this.f195467j;
        long j14 = this.f195466i;
        if (i14 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.DEVICE_SETUP;
            String strE = org.apache.commons.lang3.e.e(j14, "Fetching device info for deviceUnitId: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PairingSuccessViewModel", strE);
            o53.z zVar = i0Var2.f195453g;
            o53.z zVar2 = i0Var2.f195453g;
            o53.j0 j0VarJ = ge1.b.j(b0Var, zVar, null, new c(i0Var2, j14, null), 2);
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, zVar2, null, new b(i0Var2, j14, null), 2);
            o53.j0 j0VarJ3 = ge1.b.j(b0Var, zVar2, null, new d(i0Var2, j14, null), 2);
            i0VarJ = ge1.b.j(b0Var, zVar2, null, new e(i0Var2, j14, null), 2);
            this.f195465h = b0Var;
            this.f195458a = j0VarJ2;
            this.f195459b = j0VarJ3;
            this.f195460c = i0VarJ;
            this.f195464g = 1;
            objC = j0VarJ.C(this);
            if (objC != aVar2) {
                j0Var = j0VarJ2;
                i0Var = j0VarJ3;
            }
            return aVar2;
        }
        if (i14 == 1) {
            o53.i0 i0Var3 = this.f195460c;
            i0Var = this.f195459b;
            j0Var = this.f195458a;
            o13.r.b(obj);
            i0VarJ = i0Var3;
            objC = obj;
        } else {
            if (i14 == 2) {
                pVar = this.f195461d;
                o53.i0 i0Var4 = this.f195460c;
                i0Var = this.f195459b;
                o13.r.b(obj);
                i0VarJ = i0Var4;
                objAwait = obj;
                zBooleanValue = ((Boolean) objAwait).booleanValue();
                this.f195465h = b0Var;
                this.f195458a = null;
                this.f195459b = null;
                this.f195460c = i0VarJ;
                this.f195461d = pVar;
                this.f195463f = zBooleanValue;
                this.f195464g = 3;
                objAwait2 = i0Var.await(this);
                if (objAwait2 != aVar2) {
                    pVar2 = pVar;
                    z14 = zBooleanValue;
                    obj2 = ((o13.q) objAwait2).f128597a;
                    if (obj2 instanceof o13.q.b) {
                        obj2 = null;
                    }
                    fVar = (z80.f) obj2;
                    this.f195465h = b0Var;
                    this.f195458a = null;
                    this.f195459b = null;
                    this.f195460c = null;
                    this.f195461d = pVar2;
                    this.f195462e = fVar;
                    this.f195463f = z14;
                    this.f195464g = 4;
                    objAwait3 = i0VarJ.await(this);
                    if (objAwait3 != aVar2) {
                        z15 = z14;
                        pVar3 = pVar2;
                        fVar2 = fVar;
                    }
                }
                return aVar2;
            }
            if (i14 == 3) {
                z14 = this.f195463f;
                pVar2 = this.f195461d;
                o53.i0 i0Var5 = this.f195460c;
                o13.r.b(obj);
                i0VarJ = i0Var5;
                objAwait2 = obj;
                obj2 = ((o13.q) objAwait2).f128597a;
                if (obj2 instanceof o13.q.b) {
                    obj2 = null;
                }
                fVar = (z80.f) obj2;
                this.f195465h = b0Var;
                this.f195458a = null;
                this.f195459b = null;
                this.f195460c = null;
                this.f195461d = pVar2;
                this.f195462e = fVar;
                this.f195463f = z14;
                this.f195464g = 4;
                objAwait3 = i0VarJ.await(this);
                if (objAwait3 != aVar2) {
                    z15 = z14;
                    pVar3 = pVar2;
                    fVar2 = fVar;
                }
                return aVar2;
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z17 = this.f195463f;
            z80.f fVar4 = this.f195462e;
            pVar3 = this.f195461d;
            o13.r.b(obj);
            z15 = z17;
            fVar2 = fVar4;
            objAwait3 = obj;
        }
        zBooleanValue2 = ((Boolean) objAwait3).booleanValue();
        aVar = (gj1.a) pVar3.f128594a;
        fVar3 = (q90.f) pVar3.f128595b;
        x53.c cVar = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new a(i0Var2, aVar, null), 3);
        a2 a2Var2 = a2.DEVICE_SETUP;
        String strF = androidx.room.a0.f(j14, "Fetched device info for deviceUnitId: ", " complete");
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "PairingSuccessViewModel", strF);
        p2Var = i0Var2.f195454h;
        do {
            value = p2Var.getValue();
            q90.c cVar2 = i0Var2.f195447a;
            zI = km2.a.i(j14, null, 113);
            if (aVar != null) {
                zG = p005kotlin.jvm.internal.s.g(aVar.getLhaBackupCapable(), Boolean.TRUE);
            } else {
                zG = false;
            }
            if (aVar != null) {
                zG2 = p005kotlin.jvm.internal.s.g(aVar.getWheelchairCapable(), Boolean.TRUE);
            } else {
                zG2 = false;
            }
            zG3 = aVar != null ? p005kotlin.jvm.internal.s.g(aVar.getPendingActivityCapable(), Boolean.TRUE) : false;
            j8 = cVar2.f143493a;
            str = cVar2.f143494b;
            bVar = cVar2.f143495c;
            z16 = cVar2.f143496d;
            q90.c.Companion companion = q90.c.INSTANCE;
            str.getClass();
            bVar.getClass();
        } while (!p2Var.b(value, new q90.g(new q90.c(j8, str, bVar, z16, fVar2, zI, z15, zG, zG2, zG3, zBooleanValue2), fVar3)));
        return Unit.INSTANCE;
        pVar = (o13.p) objC;
        this.f195465h = b0Var;
        this.f195458a = null;
        this.f195459b = i0Var;
        this.f195460c = i0VarJ;
        this.f195461d = pVar;
        this.f195464g = 2;
        objAwait = j0Var.await(this);
        if (objAwait != aVar2) {
            zBooleanValue = ((Boolean) objAwait).booleanValue();
            this.f195465h = b0Var;
            this.f195458a = null;
            this.f195459b = null;
            this.f195460c = i0VarJ;
            this.f195461d = pVar;
            this.f195463f = zBooleanValue;
            this.f195464g = 3;
            objAwait2 = i0Var.await(this);
            if (objAwait2 != aVar2) {
                pVar2 = pVar;
                z14 = zBooleanValue;
                obj2 = ((o13.q) objAwait2).f128597a;
                if (obj2 instanceof o13.q.b) {
                    obj2 = null;
                }
                fVar = (z80.f) obj2;
                this.f195465h = b0Var;
                this.f195458a = null;
                this.f195459b = null;
                this.f195460c = null;
                this.f195461d = pVar2;
                this.f195462e = fVar;
                this.f195463f = z14;
                this.f195464g = 4;
                objAwait3 = i0VarJ.await(this);
                if (objAwait3 != aVar2) {
                    z15 = z14;
                    pVar3 = pVar2;
                    fVar2 = fVar;
                    zBooleanValue2 = ((Boolean) objAwait3).booleanValue();
                    aVar = (gj1.a) pVar3.f128594a;
                    fVar3 = (q90.f) pVar3.f128595b;
                    x53.c cVar3 = s0.f129406a;
                    ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new a(i0Var2, aVar, null), 3);
                    a2 a2Var3 = a2.DEVICE_SETUP;
                    String strF2 = androidx.room.a0.f(j14, "Fetched device info for deviceUnitId: ", " complete");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "PairingSuccessViewModel", strF2);
                    p2Var = i0Var2.f195454h;
                    do {
                        value = p2Var.getValue();
                        q90.c cVar4 = i0Var2.f195447a;
                        zI = km2.a.i(j14, null, 113);
                        if (aVar != null) {
                            zG = p005kotlin.jvm.internal.s.g(aVar.getLhaBackupCapable(), Boolean.TRUE);
                        } else {
                            zG = false;
                        }
                        if (aVar != null) {
                            zG2 = p005kotlin.jvm.internal.s.g(aVar.getWheelchairCapable(), Boolean.TRUE);
                        } else {
                            zG2 = false;
                        }
                        zG3 = aVar != null ? p005kotlin.jvm.internal.s.g(aVar.getPendingActivityCapable(), Boolean.TRUE) : false;
                        j8 = cVar4.f143493a;
                        str = cVar4.f143494b;
                        bVar = cVar4.f143495c;
                        z16 = cVar4.f143496d;
                        q90.c.Companion companion2 = q90.c.INSTANCE;
                        str.getClass();
                        bVar.getClass();
                    } while (!p2Var.b(value, new q90.g(new q90.c(j8, str, bVar, z16, fVar2, zI, z15, zG, zG2, zG3, zBooleanValue2), fVar3)));
                    return Unit.INSTANCE;
                }
            }
        }
        return aVar2;
    }
}

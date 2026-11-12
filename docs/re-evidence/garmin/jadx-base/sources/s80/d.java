package s80;

import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.m1;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.l0;
import p13.y;
import r53.p2;
import r53.q2;
import rd2.j;
import y92.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls80/d;", "Ls80/c;", "Lrd2/j;", "deviceSelectQuery", "Ll80/a;", "deviceDelegate", "<init>", "(Lrd2/j;Ll80/a;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements s80.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f157879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.a f157880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f157881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f157882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f157883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f157884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f157885h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DeviceIncorrectPasscodeStatusImpl$onDeviceConnected$1", f = "DeviceIncorrectPasscodeStatusImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f157887b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157887b = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157887b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157886a;
            if (i14 == 0) {
                r.b(obj);
                y92.d dVar = (y92.d) KoinJavaComponent.get$default(y92.d.class, null, new a90.b(this.f157887b, 11), 2, null);
                this.f157886a = 1;
                if (dVar.c(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DeviceIncorrectPasscodeStatusImpl$onDeviceLocked$1", f = "DeviceIncorrectPasscodeStatusImpl.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f157888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f157889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f157890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f157891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f157892e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f157894g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f157894g = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new b(this.f157894g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            String str;
            boolean z14;
            long j8;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157892e;
            if (i14 == 0) {
                r.b(obj);
                d dVar2 = d.this;
                j jVar = dVar2.f157879b;
                long j14 = this.f157894g;
                sd2.f fVarI = j.i(j14, null);
                if (fVarI != null) {
                    String productDisplayName = fVarI.getProductDisplayName();
                    productDisplayName.getClass();
                    boolean zI1 = fVarI.i1();
                    l80.a aVar2 = dVar2.f157880c;
                    this.f157888a = productDisplayName;
                    this.f157889b = dVar2;
                    this.f157890c = zI1;
                    this.f157891d = j14;
                    this.f157892e = 1;
                    Object objX = aVar2.x(j14, this);
                    if (objX == aVar) {
                        return aVar;
                    }
                    dVar = dVar2;
                    str = productDisplayName;
                    z14 = zI1;
                    obj = objX;
                    j8 = j14;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j15 = this.f157891d;
            boolean z15 = this.f157890c;
            d dVar3 = this.f157889b;
            String str2 = this.f157888a;
            r.b(obj);
            z14 = z15;
            dVar = dVar3;
            str = str2;
            j8 = j15;
            d.k(dVar, new s80.b(j8, str, 0, z14, ((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DeviceIncorrectPasscodeStatusImpl$onDevicePasscodeMismatch$1", f = "DeviceIncorrectPasscodeStatusImpl.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f157895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f157896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f157897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f157898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f157899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f157900f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f157902h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f157903i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, int i14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f157902h = j8;
            this.f157903i = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new c(this.f157902h, this.f157903i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            long j8;
            boolean z14;
            d dVar;
            int i14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f157900f;
            if (i15 == 0) {
                r.b(obj);
                d dVar2 = d.this;
                j jVar = dVar2.f157879b;
                long j14 = this.f157902h;
                sd2.f fVarI = j.i(j14, null);
                if (fVarI != null) {
                    String productDisplayName = fVarI.getProductDisplayName();
                    productDisplayName.getClass();
                    boolean zI1 = fVarI.i1();
                    l80.a aVar2 = dVar2.f157880c;
                    this.f157895a = productDisplayName;
                    this.f157896b = dVar2;
                    this.f157898d = zI1;
                    int i16 = this.f157903i;
                    this.f157897c = i16;
                    this.f157899e = j14;
                    this.f157900f = 1;
                    obj = aVar2.x(j14, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    str = productDisplayName;
                    j8 = j14;
                    z14 = zI1;
                    dVar = dVar2;
                    i14 = i16;
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j15 = this.f157899e;
            int i17 = this.f157897c;
            boolean z15 = this.f157898d;
            d dVar3 = this.f157896b;
            String str2 = this.f157895a;
            r.b(obj);
            z14 = z15;
            str = str2;
            dVar = dVar3;
            i14 = i17;
            j8 = j15;
            d.j(dVar, new s80.b(j8, str, i14, z14, ((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: s80.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DeviceIncorrectPasscodeStatusImpl$onDevicePasscodeNotificationReceived$1", f = "DeviceIncorrectPasscodeStatusImpl.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class C2982d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f157904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f157905b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ rs2.c f157907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ w f157908e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2982d(rs2.c cVar, w wVar, t13.d<? super C2982d> dVar) {
            super(2, dVar);
            this.f157907d = cVar;
            this.f157908e = wVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C2982d(this.f157907d, this.f157908e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2982d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157905b;
            if (i14 == 0) {
                r.b(obj);
                int i15 = ((w.c) this.f157908e).f195389a;
                d dVar2 = d.this;
                this.f157904a = dVar2;
                this.f157905b = 1;
                obj = d.l(dVar2, this.f157907d, i15, this);
                if (obj == aVar) {
                    return aVar;
                }
                dVar = dVar2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = this.f157904a;
                r.b(obj);
            }
            d.j(dVar, (s80.b) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DeviceIncorrectPasscodeStatusImpl$onDevicePasscodeNotificationReceived$2", f = "DeviceIncorrectPasscodeStatusImpl.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f157909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f157910b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ rs2.c f157912d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(rs2.c cVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f157912d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new e(this.f157912d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157910b;
            if (i14 == 0) {
                r.b(obj);
                d dVar2 = d.this;
                this.f157909a = dVar2;
                this.f157910b = 1;
                Object objL = d.l(dVar2, this.f157912d, 0, this);
                if (objL == aVar) {
                    return aVar;
                }
                dVar = dVar2;
                obj = objL;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = this.f157909a;
                r.b(obj);
            }
            d.k(dVar, (s80.b) obj);
            return Unit.INSTANCE;
        }
    }

    public d(j jVar, l80.a aVar) {
        jVar.getClass();
        aVar.getClass();
        this.f157879b = jVar;
        this.f157880c = aVar;
        m1 m1VarC = g8.i.c();
        x53.c cVar = s0.f129406a;
        this.f157881d = c0.a(x53.b.f189152a.plus(m1VarC));
        l0 l0Var = l0.f134950a;
        p2 p2VarA = q2.a(l0Var);
        this.f157882e = p2VarA;
        this.f157883f = p2VarA;
        p2 p2VarA2 = q2.a(l0Var);
        this.f157884g = p2VarA2;
        this.f157885h = p2VarA2;
    }

    public static final void j(d dVar, s80.b bVar) {
        Object next;
        p2 p2Var = dVar.f157882e;
        Iterator it = ((Iterable) p2Var.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((s80.b) next).f157872a != bVar.f157872a);
        if (next != null) {
            Iterable<s80.b> iterable = (Iterable) p2Var.getValue();
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            for (s80.b bVarA : iterable) {
                if (bVarA.f157872a == bVar.f157872a) {
                    bVarA = s80.b.a(bVarA, bVar.f157874c);
                }
                arrayList.add(bVarA);
            }
            p2Var.setValue(h0.g1(arrayList));
            return;
        }
        Set setF1 = h0.f1((Iterable) p2Var.getValue());
        setF1.add(bVar);
        p2Var.k(null, setF1);
        p2 p2Var2 = dVar.f157884g;
        Iterable iterable2 = (Iterable) p2Var2.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable2) {
            if (((s80.b) obj).f157872a != bVar.f157872a) {
                arrayList2.add(obj);
            }
        }
        p2Var2.setValue(h0.g1(arrayList2));
    }

    public static final void k(d dVar, s80.b bVar) {
        Object next;
        p2 p2Var = dVar.f157884g;
        Iterator it = ((Iterable) p2Var.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((s80.b) next).f157872a != bVar.f157872a);
        if (next != null) {
            Iterable<s80.b> iterable = (Iterable) p2Var.getValue();
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            for (s80.b bVarA : iterable) {
                if (bVarA.f157872a == bVar.f157872a) {
                    bVarA = s80.b.a(bVarA, bVar.f157874c);
                }
                arrayList.add(bVarA);
            }
            p2Var.setValue(h0.g1(arrayList));
            return;
        }
        Set setF1 = h0.f1((Iterable) p2Var.getValue());
        setF1.add(bVar);
        p2Var.k(null, setF1);
        p2 p2Var2 = dVar.f157882e;
        Iterable iterable2 = (Iterable) p2Var2.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable2) {
            if (((s80.b) obj).f157872a != bVar.f157872a) {
                arrayList2.add(obj);
            }
        }
        p2Var2.setValue(h0.g1(arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final Object l(d dVar, rs2.c cVar, int i14, v13.c cVar2) {
        s80.e eVar;
        String str;
        long j8;
        ?? r14;
        dVar.getClass();
        if (cVar2 instanceof s80.e) {
            eVar = (s80.e) cVar2;
            int i15 = eVar.f157919g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f157919g = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new s80.e(dVar, cVar2);
            }
        } else {
            eVar = new s80.e(dVar, cVar2);
        }
        Object obj = eVar.f157917e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = eVar.f157919g;
        if (i16 == 0) {
            r.b(obj);
            long f172494b = cVar.getF172494b();
            String f172496d = cVar.getF172496d();
            sd2.f fVarI = j.i(cVar.getF172494b(), null);
            ?? I1 = fVarI != null ? fVarI.i1() : 0;
            l80.a aVar2 = dVar.f157880c;
            long f172494b2 = cVar.getF172494b();
            eVar.f157913a = f172496d;
            eVar.f157916d = f172494b;
            eVar.f157914b = i14;
            eVar.f157915c = I1;
            eVar.f157919g = 1;
            Object objX = aVar2.x(f172494b2, eVar);
            if (objX == aVar) {
                return aVar;
            }
            str = f172496d;
            j8 = f172494b;
            obj = objX;
            r14 = I1;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = eVar.f157915c;
            i14 = eVar.f157914b;
            long j14 = eVar.f157916d;
            String str2 = eVar.f157913a;
            r.b(obj);
            str = str2;
            j8 = j14;
            r14 = i17;
        }
        return new s80.b(j8, str, i14, r14 != 0, ((Boolean) obj).booleanValue());
    }

    @Override // s80.c
    public final void a(long j8) {
        ge1.b.T(this.f157881d, null, null, new b(j8, null), 3);
    }

    @Override // s80.c
    public final void b(long j8) {
        m(j8);
    }

    @Override // s80.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public final p2 getF157883f() {
        return this.f157883f;
    }

    @Override // s80.c
    public final void d(long j8) {
        m(j8);
    }

    @Override // s80.c
    /* JADX INFO: renamed from: e, reason: from getter */
    public final p2 getF157885h() {
        return this.f157885h;
    }

    @Override // s80.c
    public final void f(long j8) {
        ge1.b.T(this.f157881d, null, null, new a(j8, null), 3);
    }

    @Override // s80.c
    public final void g(int i14, long j8) {
        ge1.b.T(this.f157881d, null, null, new c(j8, i14, null), 3);
    }

    @Override // s80.c
    public final void h(w wVar, rs2.c cVar) {
        wVar.getClass();
        cVar.getClass();
        boolean z14 = wVar instanceof w.c;
        u53.d dVar = this.f157881d;
        if (z14) {
            ge1.b.T(dVar, null, null, new C2982d(cVar, wVar, null), 3);
            return;
        }
        if (wVar instanceof w.a) {
            ge1.b.T(dVar, null, null, new e(cVar, null), 3);
        } else if (!(wVar instanceof w.b)) {
            u0.r();
        } else {
            m(cVar.getF172494b());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // s80.c
    public final void i(long j8) {
        m(j8);
    }

    public final void m(long j8) {
        p2 p2Var = this.f157882e;
        Iterable iterable = (Iterable) p2Var.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((s80.b) obj).f157872a != j8) {
                arrayList.add(obj);
            }
        }
        p2Var.setValue(h0.g1(arrayList));
        p2 p2Var2 = this.f157884g;
        Iterable iterable2 = (Iterable) p2Var2.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterable2) {
            if (((s80.b) obj2).f157872a != j8) {
                arrayList2.add(obj2);
            }
        }
        p2Var2.setValue(h0.g1(arrayList2));
    }
}

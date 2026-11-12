package pa0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import ds.e0;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lpa0/i;", "Landroidx/lifecycle/u1;", "", "newDeviceUnitId", "", "devicePartNumber", "Lx80/b;", "deviceSetupDelegate", "<init>", "(JLjava/lang/String;Lx80/b;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f136735g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f136736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x80.b f136738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f136739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f136740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f136741f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.lte.LteSubscriptionViewModel$transferSubscription$2", f = "LteSubscriptionViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136742a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f136744c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.lte.LteSubscriptionViewModel$transferSubscription$2$1", f = "LteSubscriptionViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f136745a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f136746b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f136747c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, long j8, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f136746b = iVar;
                this.f136747c = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f136746b, this.f136747c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f136745a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f136745a = 1;
                    if (i.x4(this.f136746b, this.f136747c, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f136744c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new b(this.f136744c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136742a;
            if (i14 == 0) {
                r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(i.this, this.f136744c, null);
                this.f136742a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lpa0/h;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.lte.LteSubscriptionViewModel$uiState$1", f = "LteSubscriptionViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<r53.j<? super h>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136748a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super h> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136748a;
            if (i14 == 0) {
                r.b(obj);
                this.f136748a = 1;
                int i15 = i.f136735g;
                i iVar = i.this;
                iVar.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new k(iVar, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
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

    static {
        new a(null);
    }

    public i(long j8, String str, x80.b bVar) {
        bVar.getClass();
        this.f136736a = j8;
        this.f136737b = str;
        this.f136738c = bVar;
        p2 p2VarA = q2.a(new h(null, null, null, 7, null));
        this.f136739d = p2VarA;
        this.f136740e = s.K(new v(new c(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new h(null, null, null, 7, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (r12.y4(r6, r9) == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(i iVar, long j8, v13.c cVar) {
        j jVar;
        long j14;
        Object value;
        Object value2;
        String str;
        p2 p2Var = iVar.f136739d;
        long j15 = iVar.f136736a;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f136753d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f136753d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(iVar, cVar);
            }
        } else {
            jVar = new j(iVar, cVar);
        }
        j jVar2 = jVar;
        Object objE = jVar2.f136751b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar2.f136753d;
        if (i15 != 0) {
            if (i15 == 1) {
                j14 = jVar2.f136750a;
                r.b(objE);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objE);
            }
            return Unit.INSTANCE;
        }
        r.b(objE);
        a2 a2Var = a2.DEVICE_SETUP;
        StringBuilder sbK = e0.k(j8, "Requesting LTE subscription transfer: oldDevice=", " -> newDevice=");
        sbK.append(j15);
        String string = sbK.toString();
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LteSubscriptionViewModel", string);
        x80.b bVar = iVar.f136738c;
        long j16 = iVar.f136736a;
        jVar2.f136750a = j8;
        jVar2.f136753d = 1;
        objE = bVar.e(j8, j16, jVar2);
        if (objE != obj) {
            j14 = j8;
        }
        return obj;
        j90.j jVar3 = (j90.j) objE;
        if (!(jVar3 instanceof j90.j.b)) {
            if (!(jVar3 instanceof j90.j.a)) {
                u0.r();
                return null;
            }
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, h.a((h) value, null, new m.b(((j90.j.a) jVar3).f97826a), null, 5)));
            return Unit.INSTANCE;
        }
        iVar.f136738c.j(j15, j14);
        do {
            value2 = p2Var.getValue();
            str = ((j90.j.b) jVar3).f97827a;
        } while (!p2Var.b(value2, h.a((h) value2, null, new m.f(str), str, 1)));
        jVar2.f136750a = j14;
        jVar2.f136753d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r9.n(r7, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y4(String str, v13.c cVar) {
        l lVar;
        Object value;
        Object value2;
        Object value3;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f136758c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f136758c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objI = lVar.f136756a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f136758c;
        p2 p2Var = this.f136739d;
        long j8 = this.f136736a;
        x80.b bVar = this.f136738c;
        if (i15 == 0) {
            r.b(objI);
            a2 a2Var = a2.DEVICE_SETUP;
            String strN = fb1.c.n("Polling LTE transfer job status: jobId=", str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "LteSubscriptionViewModel", strN);
            lVar.f136758c = 1;
            objI = bVar.i(str, lVar);
            if (objI != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            r.b(objI);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objI);
        }
        bVar.r(String.valueOf(j8));
        do {
            value3 = p2Var.getValue();
        } while (!p2Var.b(value3, h.a((h) value3, null, m.a.f136759a, null, 1)));
        return Unit.INSTANCE;
        j90.i iVar = (j90.i) objI;
        if (iVar instanceof j90.i.a) {
            lVar.f136758c = 2;
        } else if (iVar instanceof j90.i.c) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, h.a((h) value2, null, m.h.f136766a, null, 5)));
        } else {
            if (!(iVar instanceof j90.i.b)) {
                u0.r();
                return null;
            }
            bVar.r(String.valueOf(j8));
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, h.a((h) value, null, new m.b(false), null, 5)));
        }
        return Unit.INSTANCE;
    }

    public final void z4(long j8) {
        p2 p2Var;
        Object value;
        this.f136741f = Long.valueOf(j8);
        do {
            p2Var = this.f136739d;
            value = p2Var.getValue();
        } while (!p2Var.b(value, h.a((h) value, null, m.e.f136763a, null, 5)));
        ge1.b.T(v1.a(this), null, null, new b(j8, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpa0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

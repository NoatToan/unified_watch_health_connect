package aa2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.net.SyslogConstants;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Laa2/u;", "Landroidx/lifecycle/u1;", "Lca2/a;", "devicePasscodeFlow", "Lz92/a;", "devicePasscodeOwnerData", "Ly92/e;", "devicePasscodeSource", "Ly92/d;", "devicePasscodeRepository", "<init>", "(Lca2/a;Lz92/a;Ly92/e;Ly92/d;)V", "a", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f2388g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ca2.a f2389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z92.a f2390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y92.e f2391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y92.d f2392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f2393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f2394f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2395a;

        static {
            int[] iArr = new int[ca2.b.values().length];
            try {
                iArr[ca2.b.f26605d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ca2.b.f26609h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ca2.b.f26607f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ca2.b.f26606e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ca2.b.f26608g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2395a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Laa2/t;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.device.passcode.presentation.DevicePasscodeViewModel$passcodeUIState$1", f = "DevicePasscodeViewModel.kt", l = {44}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements e23.p<r53.j<? super t>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2396a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super t> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f2396a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f2396a = 1;
                if (u.x4(u.this, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.device.passcode.presentation.DevicePasscodeViewModel$resetPasscode$2", f = "DevicePasscodeViewModel.kt", l = {150}, m = "invokeSuspend", v = 1)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2398a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objD;
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f2398a;
            u uVar = u.this;
            if (i14 == 0) {
                o13.r.b(obj);
                y92.d dVar = uVar.f2392d;
                this.f2398a = 1;
                objD = dVar.d(this);
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objD = obj;
            }
            boolean zBooleanValue = ((Boolean) objD).booleanValue();
            if (!zBooleanValue) {
                x92.a.f189663a.getClass();
                x92.a.b("DevicePasscodeViewModel", "Failed to reset passcode");
            }
            p2 p2Var = uVar.f2393e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, t.a((t) value, null, null, null, null, 0, false, false, false, false, false, !zBooleanValue, false, 9727)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.device.passcode.presentation.DevicePasscodeViewModel$updatePasscodeFlow$2", f = "DevicePasscodeViewModel.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 1)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2400a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f2400a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f2400a = 1;
                if (u.x4(u.this, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.device.passcode.presentation.DevicePasscodeViewModel$verifyPasscode$2", f = "DevicePasscodeViewModel.kt", l = {285}, m = "invokeSuspend", v = 1)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2402a;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2404a;

            static {
                int[] iArr = new int[ca2.b.values().length];
                try {
                    iArr[ca2.b.f26605d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ca2.b.f26609h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f2404a = iArr;
            }
        }

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0087  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objF;
            Object value;
            t tVar;
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f2402a;
            u uVar = u.this;
            if (i14 == 0) {
                o13.r.b(obj);
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeViewModel", "Verifying passcode");
                y92.d dVar = uVar.f2392d;
                String str = ((t) uVar.f2393e.getValue()).f2375b;
                this.f2402a = 1;
                objF = dVar.f(str, this);
                if (objF == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objF = obj;
            }
            z92.b bVar = (z92.b) objF;
            boolean z15 = bVar != null ? bVar.f203141a : false;
            z92.b.a aVar2 = bVar != null ? bVar.f203142b : null;
            int i15 = bVar != null ? bVar.f203143c : -1;
            boolean z16 = aVar2 == z92.b.a.PASSCODE_MISMATCH;
            boolean z17 = aVar2 == z92.b.a.WALLET_BLOCKED;
            boolean z18 = aVar2 == z92.b.a.WALLET_LOCKED;
            p2 p2Var = uVar.f2393e;
            do {
                value = p2Var.getValue();
                tVar = (t) value;
                int i16 = a.f2404a[tVar.f2374a.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        z14 = false;
                    } else {
                        z14 = z16;
                    }
                } else if (z17 || z18) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } while (!p2Var.b(value, t.a(tVar, null, z15 ? tVar.f2375b : "", null, null, i15 == -1 ? tVar.f2378e : i15, z16, z14, z17, z18, false, (z15 || z16 || z17 || z18) ? false : true, false, 13325)));
            if (z15) {
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeViewModel", "Passcode verified successfully, responseCode: " + aVar2 + " remainingRetries: " + i15);
                uVar.A4(ca2.c.a(((t) uVar.f2393e.getValue()).f2374a));
            } else {
                x92.a.f189663a.getClass();
                x92.a.b("DevicePasscodeViewModel", "Failed to verify passcode, responseCode: " + aVar2);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f2388g = 8;
    }

    public u(ca2.a aVar, z92.a aVar2, y92.e eVar, y92.d dVar) {
        aVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        dVar.getClass();
        this.f2389a = aVar;
        this.f2390b = aVar2;
        this.f2391c = eVar;
        this.f2392d = dVar;
        p2 p2VarA = q2.a(new t(aVar.f26604d, null, null, null, 0, false, false, false, false, true, false, false, false, false, 15870, null));
        this.f2393e = p2VarA;
        r53.v vVar = new r53.v(new c(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f2394f = r53.s.K(vVar, aVarA, k2.a.f150706c, new t(this.f2389a.f26604d, null, null, null, 0, false, false, false, false, true, false, false, false, false, 15870, null));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0175  */
    /* JADX WARN: Code duplicated, block: B:82:0x0194  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x012d -> B:13:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:53:0x0106
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object x4(aa2.u r30, v13.c r31) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa2.u.x4(aa2.u, v13.c):java.lang.Object");
    }

    public final void A4(ca2.b bVar) {
        p2 p2Var;
        Object value;
        t tVarA;
        do {
            p2Var = this.f2393e;
            value = p2Var.getValue();
            t tVar = (t) value;
            int i14 = bVar == null ? -1 : b.f2395a[bVar.ordinal()];
            if (i14 == -1) {
                tVarA = t.a(tVar, null, null, null, null, 0, false, false, false, false, false, false, false, 15359);
            } else if (i14 == 1 || i14 == 2) {
                tVarA = t.a(tVar, bVar, "", null, null, 0, false, false, false, false, false, false, false, 16380);
            } else if (i14 == 3 || i14 == 4) {
                tVarA = t.a(tVar, bVar, null, "", null, 0, false, false, false, false, false, false, false, 16378);
            } else {
                if (i14 != 5) {
                    u0.r();
                    return;
                }
                tVarA = t.a(tVar, bVar, null, null, "", 0, false, false, false, false, false, false, false, 16374);
            }
        } while (!p2Var.b(value, tVarA));
    }

    public final void B4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f2393e;
            value = p2Var.getValue();
        } while (!p2Var.b(value, t.a((t) value, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
        ge1.b.T(v1.a(this), null, null, new f(null), 3);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        this.f2392d.onCleared();
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f2393e;
            value = p2Var.getValue();
        } while (!p2Var.b(value, t.a((t) value, null, null, null, null, 0, false, false, false, false, true, false, false, 15775)));
        ge1.b.T(v1.a(this), null, null, new d(null), 3);
    }

    public final void z4(ca2.a aVar) {
        p2 p2Var;
        Object value;
        aVar.getClass();
        x92.a.f189663a.getClass();
        x92.a.a("DevicePasscodeViewModel", "Updating passcode flow to " + aVar);
        this.f2389a = aVar;
        do {
            p2Var = this.f2393e;
            value = p2Var.getValue();
        } while (!p2Var.b(value, new t(aVar.f26604d, null, null, null, 0, false, false, false, false, true, false, false, false, false, 15870, null)));
        ge1.b.T(v1.a(this), null, null, new e(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laa2/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

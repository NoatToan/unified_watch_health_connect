package wi2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.auth.cmc.data.network.CMCNoMFATokenException;
import com.garmin.auth.cmc.data.network.CMCNoNetworkException;
import com.garmin.auth.cmc.data.network.CMCUnknownHostException;
import lc.u0;
import o53.a0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lwi2/e;", "Landroidx/lifecycle/u1;", "Lqi2/c;", "configuration", "Lvi2/c;", "autoLoginUseCase", "Lvi2/b;", "childRegistrationUseCase", "Lvi2/e;", "globalSignOutUseCase", "Lxi2/c;", "networkObserver", "<init>", "(Lqi2/c;Lvi2/c;Lvi2/b;Lvi2/e;Lxi2/c;)V", "b", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f185639m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qi2.c f185640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vi2.c f185641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vi2.b f185642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vi2.e f185643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final si2.a f185644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p13.k<ti2.b> f185645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q53.b f185646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q53.b f185647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f185648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f185649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f185650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zy2.k f185651l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalViewModel$1", f = "CMCPortalViewModel.kt", l = {112, 113}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185652a;

        /* JADX INFO: renamed from: wi2.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C3448a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f185654a;

            public C3448a(e eVar) {
                this.f185654a = eVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Object objH;
                return (s.g((Boolean) obj, Boolean.FALSE) && (objH = this.f185654a.f185647h.h(ti2.c.e.f164610a, dVar)) == u13.a.COROUTINE_SUSPENDED) ? objH : Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to wi2.e$a for r5v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r5.f185652a
                wi2.e r2 = wi2.e.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 == r3) goto L15
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
            L13:
                r6 = 0
                return r6
            L15:
                o13.r.b(r6)
                goto L3b
            L19:
                o13.r.b(r6)
                goto L29
            L1d:
                o13.r.b(r6)
                r5.f185652a = r4
                java.lang.Object r6 = wi2.e.x4(r2, r5)
                if (r6 != r0) goto L29
                goto L3a
            L29:
                r53.b2 r6 = r2.f185650k
                wi2.e$a$a r1 = new wi2.e$a$a
                r1.<init>(r2)
                r5.f185652a = r3
                r53.o2<T> r6 = r6.f150540a
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L3b
            L3a:
                return r0
            L3b:
                o2.c.f()
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: wi2.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f185655a;

        static {
            int[] iArr = new int[ti2.k.values().length];
            try {
                iArr[ti2.k.PAGE_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ti2.k.DOB_COLLECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ti2.k.USER_EXIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ti2.k.SESSION_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ti2.k.BOOTSTRAP_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f185655a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalViewModel$onNewEvent$1", f = "CMCPortalViewModel.kt", l = {249}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185656a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185656a;
            if (i14 == 0) {
                o13.r.b(obj);
                e eVar = e.this;
                q53.b bVar = eVar.f185646g;
                ti2.b bVarFirst = eVar.f185645f.first();
                this.f185656a = 1;
                if (bVar.h(bVarFirst, this) == aVar) {
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
        new b(null);
    }

    public e(qi2.c cVar, vi2.c cVar2, vi2.b bVar, vi2.e eVar, xi2.c cVar3) {
        cVar.getClass();
        cVar2.getClass();
        bVar.getClass();
        eVar.getClass();
        cVar3.getClass();
        this.f185640a = cVar;
        this.f185641b = cVar2;
        this.f185642c = bVar;
        this.f185643d = eVar;
        this.f185644e = new si2.a();
        this.f185645f = new p13.k<>();
        this.f185646g = q53.l.a(-2, 6, null);
        this.f185647h = q53.l.a(-2, 6, null);
        this.f185648i = q2.a(new wi2.d(null, 1, null));
        this.f185650k = r53.s.K(r53.s.s(r53.s.f(new xi2.b(cVar3, null))), v1.a(this), k2.a.a(k2.f150703a, 2), null);
        xi2.a.f191145a.getClass();
        this.f185651l = xi2.a.a("PortalViewModel");
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        if (r2.h(r0, r4) == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r2.h(r0, r4) == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
    
        if (r2.h(r0, r4) == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010c, code lost:
    
        if (r2.h(r6, r4) == r5) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(e eVar, v13.c cVar) throws Throwable {
        g gVar;
        Object value;
        Object obj;
        Object value2;
        String str;
        Object value3;
        qi2.c cVar2 = eVar.f185640a;
        zy2.k kVar = eVar.f185651l;
        q53.b bVar = eVar.f185647h;
        p2 p2Var = eVar.f185648i;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f185664d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f185664d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(eVar, cVar);
            }
        } else {
            gVar = new g(eVar, cVar);
        }
        Object objE0 = gVar.f185662b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f185664d;
        if (i15 == 0) {
            o13.r.b(objE0);
            kVar.debug("generateITAutoLoginUrl: " + cVar2);
            do {
                value = p2Var.getValue();
                ((wi2.d) value).getClass();
            } while (!p2Var.b(value, new wi2.d(null)));
            vi2.c cVar3 = eVar.f185641b;
            gVar.f185664d = 1;
            cVar3.getClass();
            x53.c cVar4 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a.plus(new a0("CMC#GenerateAutoLoginUseCase")), new vi2.d(cVar2, null), gVar);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objE0);
        } else {
            if (i15 != 2 && i15 != 3 && i15 != 4 && i15 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = gVar.f185661a;
            o13.r.b(objE0);
        }
        kVar.a(((ui2.f.a) obj).f171439a, "generateITAutoLoginUrl");
        do {
            value3 = p2Var.getValue();
            ((wi2.d) value3).getClass();
        } while (!p2Var.b(value3, new wi2.d(null)));
        return Unit.INSTANCE;
        obj = (ui2.f) objE0;
        if (obj instanceof ui2.f.b) {
            do {
                value2 = p2Var.getValue();
                str = (String) ((ui2.f.b) obj).f171440a;
                ((wi2.d) value2).getClass();
            } while (!p2Var.b(value2, new wi2.d(str)));
        } else {
            if (!(obj instanceof ui2.f.a)) {
                u0.r();
                return null;
            }
            ui2.f.a aVar2 = (ui2.f.a) obj;
            Exception exc = aVar2.f171439a;
            if (exc instanceof CMCNoNetworkException) {
                ti2.c.e eVar2 = ti2.c.e.f164610a;
                gVar.f185661a = aVar2;
                gVar.f185664d = 2;
            } else if (exc instanceof CMCUnknownHostException) {
                ti2.c.C3088c c3088c = ti2.c.C3088c.f164608a;
                gVar.f185661a = aVar2;
                gVar.f185664d = 3;
            } else if (exc instanceof CMCNoMFATokenException) {
                ti2.c.f fVar = ti2.c.f.f164611a;
                gVar.f185661a = aVar2;
                gVar.f185664d = 4;
            } else {
                String message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                ti2.c.b bVar2 = new ti2.c.b(message);
                gVar.f185661a = aVar2;
                gVar.f185664d = 5;
            }
        }
        return Unit.INSTANCE;
    }

    public final void A4(ti2.b bVar) {
        p13.k<ti2.b> kVar = this.f185645f;
        boolean zIsEmpty = kVar.isEmpty();
        kVar.addLast(bVar);
        this.f185651l.debug("onNewEvent: " + bVar);
        if (zIsEmpty) {
            ge1.b.T(v1.a(this), null, null, new d(null), 3);
        }
    }

    public final ti2.b y4() {
        int i14 = this.f185649j;
        ti2.b bVar = i14 == 0 ? ti2.b.g.f164602a : ti2.b.i.f164604a;
        int i15 = i14 + 1;
        this.f185649j = i15;
        this.f185651l.debug("handleBootstrapError: count #" + i15 + ", emit event " + bVar);
        return bVar;
    }

    public final void z4() {
        ge1.b.T(v1.a(this), null, null, new k(this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwi2/e$b;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}

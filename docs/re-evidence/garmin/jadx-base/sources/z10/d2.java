package z10;

import c22.s3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lz10/d2;", "Landroidx/lifecycle/u1;", "Lhl/a;", "screenAccessRole", "Le20/a;", "consentRepo", "<init>", "(Lhl/a;Le20/a;)V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d2 extends androidx.lifecycle.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hl.a f200956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e20.a f200957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.y0<a1> f200958c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.LivetrackConsentEnforceViewModel$checkConsent$1", f = "LivetrackConsentEnforceViewModel.kt", l = {56, 62}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f200959a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q92.x f200961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q92.x xVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f200961c = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d2.this.new b(this.f200961c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r9 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            if (r9.c(r6, r8) == r0) goto L25;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            q92.v vVarN;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f200959a;
            d2 d2Var = d2.this;
            q92.x xVar = this.f200961c;
            if (i14 == 0) {
                o13.r.b(obj);
                hl.a aVar2 = d2Var.f200956a;
                if (aVar2 instanceof hl.a.b) {
                    s92.l lVar = new s92.l(String.valueOf(((hl.a.b) d2Var.f200956a).f84252b));
                    p92.o oVar = p92.o.f136619a;
                    this.f200959a = 1;
                    obj = oVar.k(xVar, lVar, this);
                } else {
                    if (!(aVar2 instanceof hl.a.c)) {
                        lc.u0.r();
                        return null;
                    }
                    p92.o oVar2 = p92.o.f136619a;
                    oVar2.getClass();
                    if (p92.o.n(xVar) == null || s3.b()) {
                        d2Var.f200958c.m(new a1.b(xVar, null));
                        this.f200959a = 2;
                    }
                    p92.o.f136619a.getClass();
                    vVarN = p92.o.n(xVar);
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                vVarN = (q92.v) obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                p92.o.f136619a.getClass();
                vVarN = p92.o.n(xVar);
            }
            if (vVarN != null ? q92.c.c(vVarN) : true) {
                d2Var.y4(xVar, null);
            } else {
                d2Var.f200958c.m(new a1.a(xVar, null));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public d2(hl.a aVar, e20.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f200956a = aVar;
        this.f200957b = aVar2;
        this.f200958c = new androidx.lifecycle.y0<>();
    }

    public final void x4(q92.x xVar) {
        xVar.getClass();
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new b(xVar, null), 3);
    }

    public final void y4(q92.x xVar, q92.v vVar) {
        xVar.getClass();
        this.f200958c.m(new a1.g(xVar, vVar));
    }

    public final void z4(q92.x xVar) {
        xVar.getClass();
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new g2(this, xVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz10/d2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

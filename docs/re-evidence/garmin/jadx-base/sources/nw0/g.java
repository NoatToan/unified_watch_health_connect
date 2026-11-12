package nw0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.m2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lnw0/g;", "Landroidx/lifecycle/u1;", "Lrv0/a;", "repository", "Ltv0/d;", "delegate", "Ltv0/b;", "getAutoLoggableBehaviors", "<init>", "(Lrv0/a;Ltv0/d;Ltv0/b;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f128025j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rv0.a f128026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv0.d f128027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv0.b f128028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f128029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f128030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f128031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f128032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f128033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f128034i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lpv0/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingAutoLogBehaviorsViewModel$allBehaviours$1", f = "LifestyleLoggingAutoLogBehaviorsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super List<? extends pv0.d>>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super List<? extends pv0.d>> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = g.f128025j;
            g gVar = g.this;
            gVar.getClass();
            a2 a2Var = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "LifestyleLoggingAutoLogBehaviorsViewModel", "Loading auto-loggable behaviours");
            ArrayList arrayListG = pv0.f.g(pv0.f.b((List) gVar.f128032g.f150540a.getValue()));
            gVar.f128028c.getClass();
            ArrayList arrayListA = tv0.b.a(arrayListG, true);
            p2 p2Var = gVar.f128033h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, arrayListA));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lnw0/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingAutoLogBehaviorsViewModel$uiState$1", f = "LifestyleLoggingAutoLogBehaviorsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super nw0.a>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super nw0.a> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = g.f128025j;
            g gVar = g.this;
            gVar.getClass();
            w9.a aVarA = v1.a(gVar);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            ge1.b.T(aVarA, bVar, null, new h(gVar, null), 2);
            gVar.f128027b.b(new f(gVar, 0));
            ge1.b.T(v1.a(gVar), bVar, null, new i(gVar, null), 2);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public g(rv0.a aVar, tv0.d dVar, tv0.b bVar) {
        aVar.getClass();
        dVar.getClass();
        bVar.getClass();
        this.f128026a = aVar;
        this.f128027b = dVar;
        this.f128028c = bVar;
        p2 p2VarA = q2.a(new nw0.a(false, false, false, 7, null));
        this.f128029d = p2VarA;
        r53.v vVar = new r53.v(new c(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        this.f128030e = r53.s.K(vVar, aVarA, m2Var, p2VarA.getValue());
        p2 p2VarA2 = q2.a(p13.j0.f134944a);
        this.f128031f = p2VarA2;
        this.f128032g = r53.s.K(new r53.v(new b(null), p2VarA2), v1.a(this), m2Var, p2VarA2.getValue());
        p2 p2VarA3 = q2.a(j53.l.b());
        this.f128033h = p2VarA3;
        this.f128034i = r53.s.d(p2VarA3);
    }

    public final void x4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f128029d;
            value = p2Var.getValue();
        } while (!p2Var.b(value, nw0.a.a((nw0.a) value, z14, false, false, 6)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnw0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package nw0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lnw0/r;", "Landroidx/lifecycle/u1;", "Ltv0/a;", "addCustomBehaviour", "Ltv0/w;", "toggleBehaviourSelection", "Ltv0/i;", "saveBehaviourChangesUseCase", "Ltv0/t;", "showAllowAutoLoggingUseCase", "Lrv0/a;", "lifestyleLoggingRepository", "<init>", "(Ltv0/a;Ltv0/w;Ltv0/i;Ltv0/t;Lrv0/a;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f128099k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv0.a f128100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv0.w f128101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv0.i f128102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tv0.t f128103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rv0.a f128104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f128105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f128106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f128107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f128108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<pv0.d> f128109j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lnw0/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehavioursViewModel$editBehavioursUiState$1", f = "LifestyleLoggingEditBehavioursViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super d>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super d> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r rVar = r.this;
            rVar.getClass();
            w9.a aVarA = v1.a(rVar);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            ge1.b.T(aVarA, bVar, null, new t(rVar, null), 2);
            ge1.b.T(v1.a(rVar), bVar, null, new s(rVar, null), 2);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public r(tv0.a aVar, tv0.w wVar, tv0.i iVar, tv0.t tVar, rv0.a aVar2) {
        aVar.getClass();
        wVar.getClass();
        iVar.getClass();
        tVar.getClass();
        aVar2.getClass();
        this.f128100a = aVar;
        this.f128101b = wVar;
        this.f128102c = iVar;
        this.f128103d = tVar;
        this.f128104e = aVar2;
        p2 p2VarA = q2.a(new d(null, null, null, false, false, false, false, 127, null));
        this.f128105f = p2VarA;
        r53.v vVar = new r53.v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f128106g = r53.s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
        p13.j0 j0Var = p13.j0.f134944a;
        p2 p2VarA2 = q2.a(j0Var);
        this.f128107h = p2VarA2;
        this.f128108i = r53.s.d(p2VarA2);
        this.f128109j = j0Var;
    }

    public static final void x4(r rVar) {
        Object value;
        p2 p2Var = rVar.f128105f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, d.a((d) value, e0.a.f128017a, null, null, false, false, false, false, 126)));
    }

    public static final void y4(r rVar) {
        Object value;
        p2 p2Var = rVar.f128105f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, d.a((d) value, null, h0.a.f128042a, null, false, false, false, false, 125)));
    }

    public final void A4(boolean z14) {
        while (true) {
            p2 p2Var = this.f128105f;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, d.a((d) value, null, null, null, z15, false, false, false, 119))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    public final void B4(j0 j0Var) {
        while (true) {
            p2 p2Var = this.f128105f;
            Object value = p2Var.getValue();
            j0 j0Var2 = j0Var;
            if (p2Var.b(value, d.a((d) value, null, null, j0Var2, false, false, false, false, 123))) {
                return;
            } else {
                j0Var = j0Var2;
            }
        }
    }

    public final void C4(boolean z14) {
        while (true) {
            p2 p2Var = this.f128105f;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, d.a((d) value, null, null, null, false, false, false, z15, 63))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    public final void D4(long j8) {
        Object value;
        Object value2;
        Object next;
        p2 p2Var = this.f128107h;
        List list = (List) p2Var.getValue();
        this.f128101b.getClass();
        List listA = tv0.w.a(j8, list);
        boolean zEquals = listA.equals(list);
        p2 p2Var2 = this.f128105f;
        boolean z14 = true;
        if (zEquals) {
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, d.a((d) value, null, null, null, false, true, false, false, 111)));
            return;
        }
        if (!pv0.f.e(listA)) {
            A4(true);
            return;
        }
        do {
            value2 = p2Var.getValue();
        } while (!p2Var.b(value2, listA));
        boolean z15 = ((d) p2Var2.getValue()).f128015f;
        this.f128103d.getClass();
        if (z15) {
            z14 = false;
        } else {
            Iterator it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((pv0.d) next).f141358a != j8);
            pv0.d dVar = (pv0.d) next;
            if (dVar != null ? pv0.f.f(dVar) : false) {
                ArrayList arrayListA = tv0.b.a(pv0.f.g(pv0.f.b(listA)), true);
                if (arrayListA.isEmpty()) {
                    z14 = false;
                } else {
                    Iterator it3 = arrayListA.iterator();
                    while (it3.hasNext()) {
                        if (((pv0.w) it3.next()).f141457a == j8) {
                        }
                    }
                    z14 = false;
                }
            } else {
                z14 = false;
            }
        }
        C4(z14);
    }

    public final void z4(long j8) {
        Object value;
        p2 p2Var = this.f128107h;
        i53.f fVarY1 = i53.a.j((List) p2Var.getValue()).Y1(new j82.d(j8, 14));
        if (!pv0.f.e(fVarY1)) {
            A4(true);
            return;
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, fVarY1));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnw0/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

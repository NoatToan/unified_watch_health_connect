package kk1;

import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.k;
import e23.p;
import ek1.v;
import hk1.a0;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p92.o;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkk1/g;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "savedStateHandle", "Lp92/o;", "garminConsent", "Lek1/v;", "updateAppPermissionListUseCase", "Lek1/i;", "getThirdPartyAppDataUseCase", "Lc22/k;", "appConfigurationDelegate", "<init>", "(Landroidx/lifecycle/j1;Lp92/o;Lek1/v;Lek1/i;Lc22/k;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f105147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f105148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ek1.i f105149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f105150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f105151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s92.g f105152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f105153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f105154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f105155i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lkk1/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.details.ThirdPartyAppDetailsViewModel$uiState$1", f = "ThirdPartyAppDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<r53.j<? super j>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super j> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            g gVar = g.this;
            gVar.getClass();
            ge1.b.T(v1.a(gVar), null, null, new f(gVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    public g(j1 j1Var, o oVar, v vVar, ek1.i iVar, k kVar) {
        j1Var.getClass();
        oVar.getClass();
        vVar.getClass();
        iVar.getClass();
        kVar.getClass();
        this.f105147a = oVar;
        this.f105148b = vVar;
        this.f105149c = iVar;
        this.f105150d = kVar;
        lk1.f.INSTANCE.getClass();
        this.f105153g = ((lk1.f) gl.b.S(j1Var, s0.f105811a.b(lk1.f.class), lk1.f.f113148c)).f113149b;
        int i14 = 62;
        p005kotlin.jvm.internal.j jVar = null;
        boolean z14 = true;
        boolean z15 = false;
        boolean z16 = false;
        i53.d dVar = null;
        hk1.c cVar = null;
        boolean z17 = false;
        p2 p2VarA = q2.a(new j(z14, z15, z16, dVar, cVar, z17, i14, jVar));
        this.f105154h = p2VarA;
        r53.v vVar2 = new r53.v(new a(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f105155i = s.K(vVar2, aVarA, k2.a.f150706c, new j(z14, z15, z16, dVar, cVar, z17, i14, jVar));
    }
}

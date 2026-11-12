package g2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg2/l1;", "Lh4/r$c;", "Lh5/y1;", "Lkotlin/Function0;", "Lg2/i0;", "itemProviderLambda", "Lg2/h1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "", "userScrollEnabled", "reverseScrolling", "<init>", "(Le23/a;Lg2/h1;Ly1/b2;ZZ)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1 extends h4.r.c implements h5.y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<? extends i0> f75156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h1 f75157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p008y1.b2 f75158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p5.n f75161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1 f75162g = new j1(this, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j1 f75163h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75164a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f75166c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f75166c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l1.this.new a(this.f75166c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75164a;
            if (i14 == 0) {
                o13.r.b(obj);
                h1 h1Var = l1.this.f75157b;
                this.f75164a = 1;
                if (h1Var.b(this.f75166c, this) == aVar) {
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

    public l1(e23.a<? extends i0> aVar, h1 h1Var, p008y1.b2 b2Var, boolean z14, boolean z15) {
        this.f75156a = aVar;
        this.f75157b = h1Var;
        this.f75158c = b2Var;
        this.f75159d = z14;
        this.f75160e = z15;
        U1();
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        p5.h0.D(k0Var);
        p5.d0 d0Var = p5.d0.f135959a;
        d0Var.getClass();
        k0Var.a(p5.d0.O, this.f75162g);
        p008y1.b2 b2Var = this.f75158c;
        p008y1.b2 b2Var2 = p008y1.b2.Vertical;
        p5.n nVar = this.f75161f;
        if (b2Var == b2Var2) {
            if (nVar == null) {
                p005kotlin.jvm.internal.s.m("scrollAxisRange");
                throw null;
            }
            p5.h0.F(k0Var, nVar);
        } else {
            if (nVar == null) {
                p005kotlin.jvm.internal.s.m("scrollAxisRange");
                throw null;
            }
            p5.h0.r(k0Var, nVar);
        }
        j1 j1Var = this.f75163h;
        if (j1Var != null) {
            p5.p.f136057a.getClass();
            k0Var.a(p5.p.f136063g, new p5.a(null, j1Var));
        }
        k1 k1Var = new k1(this, 2);
        p5.p.f136057a.getClass();
        k0Var.a(p5.p.D, new p5.a(null, new p5.g0(k1Var)));
        p5.d dVarD = this.f75157b.d();
        d0Var.getClass();
        p5.j0<p5.d> j0Var = p5.d0.f135965g;
        k23.l<Object> lVar = p5.h0.f136016a[24];
        j0Var.getClass();
        k0Var.a(j0Var, dVarD);
    }

    public final void U1() {
        this.f75161f = new p5.n(new k1(this, 0), new k1(this, 1), this.f75160e);
        this.f75163h = this.f75159d ? new j1(this, 1) : null;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }
}

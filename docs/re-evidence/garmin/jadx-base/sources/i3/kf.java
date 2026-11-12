package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li3/kf;", "Lh4/r$c;", "Lh5/c0;", "Lp3/x3;", "", "Li3/wf;", "tabPositionsState", "", "selectedTabIndex", "", "followContentSize", "Ls1/f0;", "Lg6/f;", "animationSpec", "<init>", "(Lp3/x3;IZLs1/f0;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kf extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p3.x3<? extends List<wf>> f88724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s1.f0<g6.f> f88727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s1.b<g6.f, s1.n> f88728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1.b<g6.f, s1.n> f88729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g6.f f88730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g6.f f88731h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", f = "TabRow.kt", l = {715}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f88732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1.b<g6.f, s1.n> f88733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f88734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kf f88735d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s1.b<g6.f, s1.n> bVar, float f14, kf kfVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f88733b = bVar;
            this.f88734c = f14;
            this.f88735d = kfVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f88733b, this.f88734c, this.f88735d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f88732a;
            if (i14 == 0) {
                o13.r.b(obj);
                g6.f fVarA = g6.f.a(this.f88734c);
                s1.f0<g6.f> f0Var = this.f88735d.f88727d;
                this.f88732a = 1;
                if (s1.b.c(this.f88733b, fVarA, f0Var, null, this, 12) == aVar) {
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
    @v13.e(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", f = "TabRow.kt", l = {731}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f88736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1.b<g6.f, s1.n> f88737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f88738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kf f88739d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s1.b<g6.f, s1.n> bVar, float f14, kf kfVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f88737b = bVar;
            this.f88738c = f14;
            this.f88739d = kfVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f88737b, this.f88738c, this.f88739d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f88736a;
            if (i14 == 0) {
                o13.r.b(obj);
                g6.f fVarA = g6.f.a(this.f88738c);
                s1.f0<g6.f> f0Var = this.f88739d.f88727d;
                this.f88736a = 1;
                if (s1.b.c(this.f88737b, fVarA, f0Var, null, this, 12) == aVar) {
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

    public kf(p3.x3<? extends List<wf>> x3Var, int i14, boolean z14, s1.f0<g6.f> f0Var) {
        this.f88724a = x3Var;
        this.f88725b = i14;
        this.f88726c = z14;
        this.f88727d = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        if (this.f88724a.getF182175a().isEmpty()) {
            return f5.b1.h0(b1Var, 0, 0, new bf(1));
        }
        boolean z14 = this.f88726c;
        p3.x3<? extends List<wf>> x3Var = this.f88724a;
        float f14 = z14 ? x3Var.getF182175a().get(this.f88725b).contentWidth : x3Var.getF182175a().get(this.f88725b).f90135b;
        g6.f fVar = this.f88731h;
        if (fVar != null) {
            s1.b<g6.f, s1.n> bVar = this.f88729f;
            if (bVar == null) {
                g6.f.a aVar = g6.f.f75994b;
                bVar = new s1.b<>(fVar, s1.e2.f155570c, null, null, 12, null);
                this.f88729f = bVar;
            }
            if (!g6.f.c(f14, ((g6.f) bVar.f155491e.getF182175a()).f75997a)) {
                ge1.b.T(getCoroutineScope(), null, null, new a(bVar, f14, this, null), 3);
            }
        } else {
            this.f88731h = g6.f.a(f14);
        }
        float f15 = this.f88724a.getF182175a().get(this.f88725b).f90134a;
        g6.f fVar2 = this.f88730g;
        if (fVar2 != null) {
            s1.b<g6.f, s1.n> bVar2 = this.f88728e;
            if (bVar2 == null) {
                s1.b<g6.f, s1.n> bVar3 = new s1.b<>(fVar2, s1.e2.f155570c, null, null, 12, null);
                this.f88728e = bVar3;
                bVar2 = bVar3;
            }
            if (!g6.f.c(f15, ((g6.f) bVar2.f155491e.getF182175a()).f75997a)) {
                ge1.b.T(getCoroutineScope(), null, null, new b(bVar2, f15, this, null), 3);
            }
        } else {
            this.f88730g = g6.f.a(f15);
        }
        g6.o f69049a = b1Var.getF69049a();
        g6.o oVar = g6.o.Ltr;
        s1.b<g6.f, s1.n> bVar4 = this.f88728e;
        if (f69049a != oVar) {
            if (bVar4 != null) {
                f15 = bVar4.e().f75997a;
            }
            f15 = -f15;
        } else if (bVar4 != null) {
            f15 = bVar4.e().f75997a;
        }
        s1.b<g6.f, s1.n> bVar5 = this.f88729f;
        if (bVar5 != null) {
            f14 = bVar5.e().f75997a;
        }
        f5.v1 v1VarQ = y0Var.Q(g6.a.c(b1Var.f0(f14), b1Var.f0(f14), 0, 0, 12, j8));
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new cq.p(v1VarQ, b1Var, f15, 2));
    }
}

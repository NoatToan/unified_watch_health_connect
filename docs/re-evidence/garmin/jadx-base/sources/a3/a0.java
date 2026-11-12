package a3;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", l = {551, 560}, m = "invokeSuspend", v = 1)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b<g6.f, s1.n> f602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2.h f606f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(s1.b<g6.f, s1.n> bVar, float f14, boolean z14, b0 b0Var, a2.h hVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f602b = bVar;
        this.f603c = f14;
        this.f604d = z14;
        this.f605e = b0Var;
        this.f606f = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f602b, this.f603c, this.f604d, this.f605e, this.f606f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00eb, code lost:
    
        if (r13 == r0) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a2.h bVar;
        Object objG;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f601a;
        if (i14 == 0) {
            o13.r.b(obj);
            s1.b<g6.f, s1.n> bVar2 = this.f602b;
            float f14 = ((g6.f) bVar2.f155491e.getF182175a()).f75997a;
            float f15 = this.f603c;
            if (!g6.f.c(f14, f15)) {
                if (this.f604d) {
                    float f16 = ((g6.f) bVar2.f155491e.getF182175a()).f75997a;
                    b0 b0Var = this.f605e;
                    b2<g6.f> b2Var = null;
                    if (g6.f.c(f16, b0Var.f618b)) {
                        n4.c.f123541b.getClass();
                        bVar = new a2.l.b(0L, null);
                    } else if (g6.f.c(f16, b0Var.f620d)) {
                        bVar = new a2.e();
                    } else {
                        bVar = g6.f.c(f16, b0Var.f621e) ? new a2.b() : null;
                    }
                    this.f601a = 2;
                    b2<g6.f> b2Var2 = i0.f681b;
                    b2<g6.f> b2Var3 = i0.f680a;
                    a2.h hVar = this.f606f;
                    if (hVar != null) {
                        h0.f676a.getClass();
                        if ((hVar instanceof a2.l.b) || (hVar instanceof a2.a.b) || (hVar instanceof a2.e) || (hVar instanceof a2.b)) {
                            b2Var = b2Var3;
                        }
                    } else if (bVar != null) {
                        h0.f676a.getClass();
                        if ((bVar instanceof a2.l.b) || (bVar instanceof a2.a.b)) {
                            b2Var = b2Var2;
                        } else if (bVar instanceof a2.e) {
                            b2Var = i0.f682c;
                        } else if (bVar instanceof a2.b) {
                            b2Var = b2Var2;
                        }
                    }
                    b2<g6.f> b2Var4 = b2Var;
                    s1.b<g6.f, s1.n> bVar3 = this.f602b;
                    if (b2Var4 != null) {
                        objG = s1.b.c(bVar3, g6.f.a(f15), b2Var4, null, this, 12);
                        if (objG != obj2) {
                            objG = Unit.INSTANCE;
                        }
                    } else {
                        objG = bVar3.g(g6.f.a(f15), this);
                        if (objG != obj2) {
                            objG = Unit.INSTANCE;
                        }
                    }
                } else {
                    g6.f fVarA = g6.f.a(f15);
                    this.f601a = 1;
                    if (bVar2.g(fVarA, this) == obj2) {
                    }
                }
                return obj2;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1 && i14 != 2) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        return Unit.INSTANCE;
    }
}

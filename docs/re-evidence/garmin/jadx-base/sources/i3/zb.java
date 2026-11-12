package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", l = {2562, 2564}, m = "invokeSuspend")
public final class zb extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b<g6.f, s1.n> f90583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f90584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f90585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.h f90586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3.p1<a2.h> f90587f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(s1.b<g6.f, s1.n> bVar, float f14, boolean z14, a2.h hVar, p3.p1<a2.h> p1Var, t13.d<? super zb> dVar) {
        super(2, dVar);
        this.f90583b = bVar;
        this.f90584c = f14;
        this.f90585d = z14;
        this.f90586e = hVar;
        this.f90587f = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new zb(this.f90583b, this.f90584c, this.f90585d, this.f90586e, this.f90587f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((zb) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r8.g(r1, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (l3.w0.a(r8, r6, r1, r2, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f90582a;
        a2.h hVar = this.f90586e;
        p3.p1<a2.h> p1Var = this.f90587f;
        if (i14 == 0) {
            o13.r.b(obj);
            s1.b<g6.f, s1.n> bVar = this.f90583b;
            float f14 = ((g6.f) bVar.f155491e.getF182175a()).f75997a;
            float f15 = this.f90584c;
            if (!g6.f.c(f14, f15)) {
                if (this.f90585d) {
                    a2.h f182175a = p1Var.getF182175a();
                    this.f90582a = 2;
                } else {
                    g6.f fVarA = g6.f.a(f15);
                    this.f90582a = 1;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1 && i14 != 2) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        p1Var.setValue(hVar);
        return Unit.INSTANCE;
    }
}

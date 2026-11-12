package h2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.o2;
import s1.q1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {672}, m = "invokeSuspend", v = 1)
public final class l0 extends v13.i implements e23.p<o2, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f80970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f80972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f80973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j0 j0Var, int i14, float f14, s1.k<Float> kVar, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f80970c = j0Var;
        this.f80971d = i14;
        this.f80972e = f14;
        this.f80973f = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l0 l0Var = new l0(this.f80970c, this.f80971d, this.f80972e, this.f80973f, dVar);
        l0Var.f80969b = obj;
        return l0Var;
    }

    @Override // e23.p
    public final Object invoke(o2 o2Var, t13.d<? super Unit> dVar) {
        return ((l0) create(o2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[PHI: r10
      0x0070: PHI (r10v16 int) = (r10v15 int), (r10v17 int) binds: [B:26:0x0075, B:23:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        int i15;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f80968a;
        if (i16 == 0) {
            o13.r.b(obj);
            o2 o2Var = (o2) this.f80969b;
            j0 j0Var = this.f80970c;
            f0 f0Var = new f0(o2Var, j0Var);
            this.f80968a = 1;
            float f14 = o0.f80983a;
            int i17 = this.f80971d;
            j0Var.f80944t.t(j0Var.k(new Integer(i17).intValue()));
            Unit unit = Unit.INSTANCE;
            j0 j0Var2 = f0Var.f80901b;
            boolean z14 = i17 > j0Var2.f80929e;
            int iC = (f0Var.c() - j0Var2.f80929e) + 1;
            if (((z14 && i17 > f0Var.c()) || (!z14 && i17 < j0Var2.f80929e)) && Math.abs(i17 - j0Var2.f80929e) >= 3) {
                if (z14) {
                    i15 = i17 - iC;
                    i14 = j0Var2.f80929e;
                    if (i15 < i14) {
                        i15 = i14;
                    }
                } else {
                    int i18 = iC + i17;
                    i14 = j0Var2.f80929e;
                    if (i18 > i14) {
                        i15 = i14;
                    } else {
                        i15 = i18;
                    }
                }
                f0Var.d(i15, 0);
            }
            Object objC = q1.c(0.0f, f0Var.e(i17) + this.f80972e, this.f80973f, new g80.e(9, new p005kotlin.jvm.internal.o0(), f0Var), this, 4);
            if (objC != obj2) {
                objC = Unit.INSTANCE;
            }
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

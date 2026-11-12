package h2;

import g2.m1;
import p005kotlin.Metadata;
import p008y1.e1;
import p008y1.o2;
import p008y1.t3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh2/p0;", "Ly1/e1;", "Ly1/t3;", "originalFlingBehavior", "Lh2/j0;", "pagerState", "<init>", "(Ly1/t3;Lh2/j0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3 f80989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f80990b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {384}, m = "performFling", v = 1)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f80991a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f80993c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f80991a = obj;
            this.f80993c |= Integer.MIN_VALUE;
            return p0.this.a(null, 0.0f, this);
        }
    }

    public p0(t3 t3Var, j0 j0Var) {
        this.f80989a = t3Var;
        this.f80990b = j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p008y1.e1
    public final Object a(o2 o2Var, float f14, t13.d<? super Float> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f80993c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f80993c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB = aVar.f80991a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f80993c;
        if (i15 == 0) {
            o13.r.b(objB);
            m1 m1Var = new m1(12, this, o2Var);
            aVar.f80993c = 1;
            objB = this.f80989a.b(o2Var, f14, m1Var, aVar);
            if (objB == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        float fFloatValue = ((Number) objB).floatValue();
        j0 j0Var = this.f80990b;
        if (j0Var.m() != 0.0f && Math.abs(j0Var.m()) < 0.001d) {
            j0.u(j0Var, j0Var.l());
        } else {
            new Float(j0Var.m());
        }
        return new Float(fFloatValue);
    }
}

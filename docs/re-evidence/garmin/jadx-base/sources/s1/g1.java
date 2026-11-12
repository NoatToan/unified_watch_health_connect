package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {520, 2169}, m = "waitForCompositionAfterTargetStateChange", v = 1)
public final class g1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f155583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f155584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1<Object> f155585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f155586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(a1<Object> a1Var, t13.d<? super g1> dVar) {
        super(dVar);
        this.f155585c = a1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f155584b = obj;
        this.f155586d |= Integer.MIN_VALUE;
        return a1.i(this.f155585c, this);
    }
}

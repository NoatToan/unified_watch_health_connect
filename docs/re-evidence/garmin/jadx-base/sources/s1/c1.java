package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {354, 357}, m = "runAnimations", v = 1)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f155519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1<Object> f155520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a1<Object> a1Var, t13.d<? super c1> dVar) {
        super(dVar);
        this.f155520b = a1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f155519a = obj;
        this.f155521c |= Integer.MIN_VALUE;
        return a1.g(this.f155520b, this);
    }
}

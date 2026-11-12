package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {544, 2169}, m = "waitForComposition", v = 1)
public final class f1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f155579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f155580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1<Object> f155581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f155582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(a1<Object> a1Var, t13.d<? super f1> dVar) {
        super(dVar);
        this.f155581c = a1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f155580b = obj;
        this.f155582d |= Integer.MIN_VALUE;
        return a1.h(this.f155581c, this);
    }
}

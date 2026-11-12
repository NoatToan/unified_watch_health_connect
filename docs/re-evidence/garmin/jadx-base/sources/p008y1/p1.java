package p008y1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.o0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {288, 346}, m = "dispatchMouseWheelScroll", v = 1)
public final class p1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3 f193546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f193547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f193548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f193549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f193550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f193551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(n1 n1Var, d<? super p1> dVar) {
        super(dVar);
        this.f193550e = n1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193549d = obj;
        this.f193551f |= Integer.MIN_VALUE;
        return n1.a(this.f193550e, null, null, 0.0f, 0.0f, this);
    }
}

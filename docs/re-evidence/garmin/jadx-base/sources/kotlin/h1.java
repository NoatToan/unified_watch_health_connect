package kotlin;

import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod", v = 1)
public final class h1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f91199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1.a f91200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k1.a aVar, d<? super h1> dVar) {
        super(dVar);
        this.f91200b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91199a = obj;
        this.f91201c |= Integer.MIN_VALUE;
        return this.f91200b.a(null, this);
    }
}

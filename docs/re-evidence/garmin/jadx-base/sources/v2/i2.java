package v2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", l = {755}, m = "collectImeNotifications", v = 1)
public final class i2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f175058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f175059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f175060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(h2 h2Var, t13.d<? super i2> dVar) {
        super(dVar);
        this.f175059b = h2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f175058a = obj;
        this.f175060c |= Integer.MIN_VALUE;
        return this.f175059b.b(null, this);
    }
}

package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler", f = "ContinueAsHandler.kt", l = {137, 142, 147}, m = "exchangeForDI2")
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f164003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, t13.d<? super d0> dVar) {
        super(dVar);
        this.f164003b = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164002a = obj;
        this.f164004c |= Integer.MIN_VALUE;
        return h0.d(this.f164003b, this);
    }
}

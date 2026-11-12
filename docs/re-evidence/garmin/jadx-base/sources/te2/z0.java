package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.GetOAuth1GCCredentials", f = "GetOAuth1GCCredentials.kt", l = {127, 130}, m = "attemptWithThisAppCredential")
public final class z0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f164411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(u0 u0Var, t13.d<? super z0> dVar) {
        super(dVar);
        this.f164411b = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164410a = obj;
        this.f164412c |= Integer.MIN_VALUE;
        return u0.d(this.f164411b, this);
    }
}

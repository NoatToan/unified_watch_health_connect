package re2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper", f = "AuthenticationHelper.kt", l = {1626}, m = "safeGetOAuth2Token")
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f152358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f152359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152360c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b bVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f152359b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152358a = obj;
        this.f152360c |= Integer.MIN_VALUE;
        b bVar = b.f152215a;
        return this.f152359b.E(null, null, null, this);
    }
}

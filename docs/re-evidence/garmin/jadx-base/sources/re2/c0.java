package re2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper", f = "AuthenticationHelper.kt", l = {822}, m = "signOut")
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f152270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f152271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b bVar, t13.d<? super c0> dVar) {
        super(dVar);
        this.f152271b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152270a = obj;
        this.f152272c |= Integer.MIN_VALUE;
        return this.f152271b.G(this);
    }
}

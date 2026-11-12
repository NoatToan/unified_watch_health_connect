package id2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.lib.networking.okhttp.interceptor.OAuth2Interceptor", f = "OAuth2Interceptor.kt", l = {67}, m = "validate")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f93055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f93056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f93057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f93056b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f93055a = obj;
        this.f93057c |= Integer.MIN_VALUE;
        return this.f93056b.b(this);
    }
}

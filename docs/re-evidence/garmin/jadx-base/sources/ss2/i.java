package ss2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.auth.AuthHandler", f = "AuthHandler.kt", l = {133}, m = "monitorAuthStatus")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f160814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f160814b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160813a = obj;
        this.f160815c |= Integer.MIN_VALUE;
        return c.b(this.f160814b, this);
    }
}

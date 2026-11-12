package ss2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.auth.AuthHandler", f = "AuthHandler.kt", l = {341}, m = "requestSlaveStkConfirm")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f160822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c cVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f160822b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160821a = obj;
        this.f160823c |= Integer.MIN_VALUE;
        byte[] bArr = c.f160782o;
        return this.f160822b.f(null, this);
    }
}

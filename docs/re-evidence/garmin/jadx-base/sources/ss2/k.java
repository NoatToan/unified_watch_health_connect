package ss2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.auth.AuthHandler", f = "AuthHandler.kt", l = {362}, m = "requestSlaveRand")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f160819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f160819b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160818a = obj;
        this.f160820c |= Integer.MIN_VALUE;
        byte[] bArr = c.f160782o;
        return this.f160819b.e(null, this);
    }
}

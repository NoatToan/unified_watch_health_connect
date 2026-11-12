package ss2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.auth.AuthHandler", f = "AuthHandler.kt", l = {403}, m = "restartAuth")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f160825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c cVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f160825b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160824a = obj;
        this.f160826c |= Integer.MIN_VALUE;
        byte[] bArr = c.f160782o;
        return this.f160825b.g(this);
    }
}

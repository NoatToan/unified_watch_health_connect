package ss2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.auth.AuthHandler", f = "AuthHandler.kt", l = {309, 310, 314, 322, 332}, m = "calculateShortTermKey")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f160800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f160801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f160802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f160803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f160804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f160805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f160804e = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160803d = obj;
        this.f160805f |= Integer.MIN_VALUE;
        return c.a(this.f160804e, null, this);
    }
}

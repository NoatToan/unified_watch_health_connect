package nc2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.lib.networking.appattestation.GoogleIntegrityTokenProvider", f = "GoogleIntegrityTokenProvider.kt", l = {265, 266}, m = "retryTokenRequest")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f125366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f125367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f125369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f125370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f125371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f125370e = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125369d = obj;
        this.f125371f |= Integer.MIN_VALUE;
        return this.f125370e.f(null, false, 0, null, this);
    }
}

package pc2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.lib.networking.authentication.diapi.IT2OtherAppForDI2Request", f = "IT2OtherAppForDI2Request.kt", l = {99}, m = "callEndpoint2")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f137341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f137341b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137340a = obj;
        this.f137342c |= Integer.MIN_VALUE;
        return l.b(this.f137341b, null, null, this);
    }
}

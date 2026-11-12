package qc2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.lib.networking.authentication.gcapi.GC1OtherAppForDI2Request", f = "GC1OtherAppForDI2Request.kt", l = {106}, m = "callEndpoint2")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f144395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f144395b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144394a = obj;
        this.f144396c |= Integer.MIN_VALUE;
        return h.b(this.f144395b, null, null, this);
    }
}

package qc2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.lib.networking.authentication.gcapi.GC1OtherAppForDI2Request", f = "GC1OtherAppForDI2Request.kt", l = {77}, m = "callEndpoint1")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f144392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f144392b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144391a = obj;
        this.f144393c |= Integer.MIN_VALUE;
        return h.a(this.f144392b, null, this);
    }
}

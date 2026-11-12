package qc2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.lib.networking.authentication.gcapi.IT2OtherAppForGC1Request", f = "IT2OtherAppForGC1Request.kt", l = {90}, m = "callEndpoint3")
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f144433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f144433b = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144432a = obj;
        this.f144434c |= Integer.MIN_VALUE;
        return r.a(this.f144433b, null, null, this);
    }
}

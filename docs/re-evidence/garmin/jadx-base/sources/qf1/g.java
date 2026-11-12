package qf1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.samd.data.SaMDRepositoryImpl", f = "SaMDRepositoryImpl.kt", l = {50}, m = "getMFAInfo", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f144623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f144623b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144622a = obj;
        this.f144624c |= Integer.MIN_VALUE;
        return this.f144623b.l(this);
    }
}

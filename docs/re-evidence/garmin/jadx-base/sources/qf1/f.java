package qf1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.samd.data.SaMDRepositoryImpl", f = "SaMDRepositoryImpl.kt", l = {283}, m = "getGarminHealthAccessToken", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f144620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f144620b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144619a = obj;
        this.f144621c |= Integer.MIN_VALUE;
        return this.f144620b.c(this);
    }
}

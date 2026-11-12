package qf1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.samd.data.SaMDRepositoryImpl", f = "SaMDRepositoryImpl.kt", l = {41}, m = "isMFATokenValid", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f144638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f144638b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144637a = obj;
        this.f144639c |= Integer.MIN_VALUE;
        return this.f144638b.a(null, this);
    }
}

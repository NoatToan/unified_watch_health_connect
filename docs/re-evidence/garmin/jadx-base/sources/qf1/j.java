package qf1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.samd.data.SaMDRepositoryImpl", f = "SaMDRepositoryImpl.kt", l = {95, 96}, m = "isGHSAccountCreated", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f144635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f144635b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144634a = obj;
        this.f144636c |= Integer.MIN_VALUE;
        return this.f144635b.d(this);
    }
}

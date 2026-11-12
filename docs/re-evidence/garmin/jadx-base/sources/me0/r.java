package me0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository", f = "DogsRepository.kt", l = {128}, m = "updateAnimal", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f118046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f118048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f118047b = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f118046a = obj;
        this.f118048c |= Integer.MIN_VALUE;
        return this.f118047b.f(0L, null, this);
    }
}

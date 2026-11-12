package me0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository", f = "DogsRepository.kt", l = {117}, m = "createAnimal", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f117985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f117986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w wVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f117986b = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f117985a = obj;
        this.f117987c |= Integer.MIN_VALUE;
        return this.f117986b.c(null, this);
    }
}

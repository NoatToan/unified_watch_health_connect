package z70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.data.ExclusiveOffersRepositoryImpl", f = "ExclusiveOffersRepository.kt", l = {37, 38}, m = "fetchExclusiveOffers", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f202831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f202832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f202833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f202832b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f202831a = obj;
        this.f202833c |= Integer.MIN_VALUE;
        return this.f202832b.d(this);
    }
}

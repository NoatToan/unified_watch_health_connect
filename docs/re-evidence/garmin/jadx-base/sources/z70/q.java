package z70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.data.ExclusiveOffersRepositoryImpl", f = "ExclusiveOffersRepository.kt", l = {108, 111}, m = "logExclusiveOfferAction", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c80.l f202851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f202852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f202853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f202854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f202853c = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f202852b = obj;
        this.f202854d |= Integer.MIN_VALUE;
        return this.f202853c.c(null, this);
    }
}

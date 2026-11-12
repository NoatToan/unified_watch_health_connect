package z70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.data.ExclusiveOffersRepositoryImpl", f = "ExclusiveOffersRepository.kt", l = {52, 54}, m = "generateExclusiveOffer", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f202837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f202838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f202839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f202840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f202839c = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f202838b = obj;
        this.f202840d |= Integer.MIN_VALUE;
        return this.f202839c.f(null, this);
    }
}

package z70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.data.ExclusiveOffersRepositoryImpl", f = "ExclusiveOffersRepository.kt", l = {82, 84}, m = "getDiscountVisibility", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f202845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f202846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f202847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f202846b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f202845a = obj;
        this.f202847c |= Integer.MIN_VALUE;
        return this.f202846b.b(this);
    }
}

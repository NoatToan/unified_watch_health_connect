package dj2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository", f = "CustomerManagementRepository.kt", l = {234}, m = "getCitiesWards", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a aVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f60131b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60130a = obj;
        this.f60132c |= Integer.MIN_VALUE;
        return this.f60131b.k(null, null, null, this);
    }
}

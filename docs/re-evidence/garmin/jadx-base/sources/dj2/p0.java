package dj2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository", f = "CustomerManagementRepository.kt", l = {244}, m = "validateAddress", v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(a aVar, t13.d<? super p0> dVar) {
        super(dVar);
        this.f60117b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60116a = obj;
        this.f60118c |= Integer.MIN_VALUE;
        return this.f60117b.u(null, this);
    }
}

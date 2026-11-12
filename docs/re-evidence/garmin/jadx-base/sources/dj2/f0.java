package dj2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository", f = "CustomerManagementRepository.kt", l = {216}, m = "getStates", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a aVar, t13.d<? super f0> dVar) {
        super(dVar);
        this.f60024b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60023a = obj;
        this.f60025c |= Integer.MIN_VALUE;
        return this.f60024b.p(null, this);
    }
}

package no2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor", f = "BeijingTUnionCardOperationExecutor.kt", l = {187}, m = "selectAppletSuccessfully", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f126769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f126770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f126771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f126770b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f126769a = obj;
        this.f126771c |= Integer.MIN_VALUE;
        return a.g(this.f126770b, null, null, this);
    }
}

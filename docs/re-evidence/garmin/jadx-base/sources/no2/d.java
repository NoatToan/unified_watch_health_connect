package no2;

import e23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor", f = "BeijingTUnionCardOperationExecutor.kt", l = {199}, m = "executeApduCommandSuccessfully", v = 2)
public final class d<R> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f126757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f126758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f126760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f126759c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f126758b = obj;
        this.f126760d |= Integer.MIN_VALUE;
        a.C2438a c2438a = a.f126725b;
        return this.f126759c.i(null, null, null, this);
    }
}

package no2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor", f = "BeijingTUnionCardOperationExecutor.kt", l = {211}, m = "executeApduCommand", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f126754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f126755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f126756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f126755b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f126754a = obj;
        this.f126756c |= Integer.MIN_VALUE;
        a.C2438a c2438a = a.f126725b;
        return this.f126755b.h(null, null, this);
    }
}

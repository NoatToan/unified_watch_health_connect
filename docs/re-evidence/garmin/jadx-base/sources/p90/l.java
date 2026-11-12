package p90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.pairing.CheckCtkdDualPairFailureUseCase", f = "CheckCtkdDualPairFailureUseCase.kt", l = {31}, m = "isCtkdDualPairFailure", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f136542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f136543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f136544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f136545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f136544c = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136543b = obj;
        this.f136545d |= Integer.MIN_VALUE;
        return this.f136544c.a(0L, null, this);
    }
}

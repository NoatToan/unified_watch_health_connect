package w61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel", f = "TrainingStatusViewModel.kt", l = {789}, m = "saveLastUsedDevice", v = 2)
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f183238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f183239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(x xVar, t13.d<? super o0> dVar) {
        super(dVar);
        this.f183239b = xVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f183238a = obj;
        this.f183240c |= Integer.MIN_VALUE;
        int i14 = x.O0;
        return this.f183239b.J4(null, this);
    }
}

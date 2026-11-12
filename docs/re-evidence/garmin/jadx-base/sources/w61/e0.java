package w61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel", f = "TrainingStatusViewModel.kt", l = {816}, m = "getServerDeviceInfo", v = 2)
public final class e0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f183172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.performance.model.a f183173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f183174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f183175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f183176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(x xVar, t13.d<? super e0> dVar) {
        super(dVar);
        this.f183175d = xVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f183174c = obj;
        this.f183176e |= Integer.MIN_VALUE;
        int i14 = x.O0;
        return this.f183175d.E4(0L, this);
    }
}

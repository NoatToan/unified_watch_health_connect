package w61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel", f = "TrainingStatusViewModel.kt", l = {353}, m = "deviceSelectionChanged", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f183313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f183314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f183315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f183316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x xVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f183315c = xVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f183314b = obj;
        this.f183316d |= Integer.MIN_VALUE;
        return this.f183315c.A4(null, false, this);
    }
}

package tb0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.PairAnimationViewModel", f = "PairAnimationViewModel.kt", l = {56}, m = "loadAnimation", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f163740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f163741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f163741b = yVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163740a = obj;
        this.f163742c |= Integer.MIN_VALUE;
        return y.x4(this.f163741b, this);
    }
}

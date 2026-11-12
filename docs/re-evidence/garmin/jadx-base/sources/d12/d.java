package d12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.usageindicators.UsageIndicatorsListenerImpl", f = "UsageIndicatorsListenerImpl.kt", l = {28, 33}, m = "onUsageIndicatorsFetched", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f57091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f57092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f57092b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f57091a = obj;
        this.f57093c |= Integer.MIN_VALUE;
        return this.f57092b.a(null, this);
    }
}

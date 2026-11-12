package pa0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.lte.LteSubscriptionViewModel", f = "LteSubscriptionViewModel.kt", l = {122, 131}, m = "executeTransfer", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f136750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f136751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f136752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f136753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f136752c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136751b = obj;
        this.f136753d |= Integer.MIN_VALUE;
        return i.x4(this.f136752c, 0L, this);
    }
}

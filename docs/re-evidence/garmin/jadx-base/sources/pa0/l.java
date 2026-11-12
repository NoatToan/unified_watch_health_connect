package pa0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.lte.LteSubscriptionViewModel", f = "LteSubscriptionViewModel.kt", l = {145, 147}, m = "pollJobStatus", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f136756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f136757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f136758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f136757b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136756a = obj;
        this.f136758c |= Integer.MIN_VALUE;
        int i14 = i.f136735g;
        return this.f136757b.y4(null, this);
    }
}

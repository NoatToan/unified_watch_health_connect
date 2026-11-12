package ij1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceViewModel", f = "PrimaryDeviceViewModel.kt", l = {159}, m = "getDeviceSyncDetails", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f93858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gj1.b f93859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f93860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f93861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f93862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f93861d = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f93860c = obj;
        this.f93862e |= Integer.MIN_VALUE;
        return g.x4(this.f93861d, 0L, false, null, this);
    }
}

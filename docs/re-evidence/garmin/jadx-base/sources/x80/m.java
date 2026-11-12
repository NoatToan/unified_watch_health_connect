package x80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel", f = "DeviceSetupViewModel.kt", l = {427}, m = "updatePrimaryTrainingDevice", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f189546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f189547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f189548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f189549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f189548c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f189547b = obj;
        this.f189549d |= Integer.MIN_VALUE;
        return e.x4(this.f189548c, 0L, this);
    }
}

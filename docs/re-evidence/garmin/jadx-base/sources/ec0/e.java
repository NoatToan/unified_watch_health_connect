package ec0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.bleupgrade.BLEUpgradeCoordinator", f = "BLEUpgradeCoordinator.kt", l = {148, 163}, m = "uploadNewDeviceInfo", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f63782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f63783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f63784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f63785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f63785d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f63784c = obj;
        this.f63786e |= Integer.MIN_VALUE;
        return a.a(this.f63785d, null, this);
    }
}

package nd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.device.setup.customization.DeviceBackupDelegateImpl", f = "DeviceBackupDelegateImpl.kt", l = {25}, m = "getBackupAvailability", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f125389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f125390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f125390b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125389a = obj;
        this.f125391c |= Integer.MIN_VALUE;
        return this.f125390b.e(null, this);
    }
}

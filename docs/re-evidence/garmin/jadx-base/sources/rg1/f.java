package rg1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.repo.DeviceBackupRepoImpl", f = "DeviceBackupRepoImpl.kt", l = {25}, m = "userHasBackups", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f152663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f152664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f152664b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152663a = obj;
        this.f152665c |= Integer.MIN_VALUE;
        return this.f152664b.b(this);
    }
}

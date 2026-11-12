package iw;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.biz.repo.DeviceSettingsRepo", f = "DeviceSettingsRepo.kt", l = {38}, m = "saveDeviceLocation", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f95254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f95256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f95256c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95255b = obj;
        this.f95257d |= Integer.MIN_VALUE;
        return this.f95256c.a(0L, null, this);
    }
}

package an2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager$ConfigurationDelegate", f = "SharedDeviceManager.kt", l = {197}, m = "getFilteredLocalDevices$shared_device_management_release")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.e f4538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.e f4540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a.e eVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f4540c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f4539b = obj;
        this.f4541d |= Integer.MIN_VALUE;
        return this.f4540c.a(this);
    }
}

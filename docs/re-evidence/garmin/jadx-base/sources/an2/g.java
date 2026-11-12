package an2;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager", f = "SharedDeviceManager.kt", l = {576, 578, 592, 594, 614, 620, 626}, m = "mergeDevice$shared_device_management_release")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedDeviceInfo f4556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f4558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f4558c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f4557b = obj;
        this.f4559d |= Integer.MIN_VALUE;
        return this.f4558c.c(null, null, null, null, this);
    }
}

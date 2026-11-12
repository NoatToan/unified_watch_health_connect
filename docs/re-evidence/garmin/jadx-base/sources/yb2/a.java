package yb2;

import bm2.d;
import bm2.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyb2/a;", "Lbm2/f;", "Lbm2/d;", "deviceInfoDTO", "<init>", "(Lbm2/d;)V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f195699a;

    public a(d dVar) {
        dVar.getClass();
        this.f195699a = dVar;
    }

    @Override // bm2.f
    public final void b(long j8) {
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getApplicationKey() {
        return "";
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final long getDeviceId() {
        return this.f195699a.getF172494b();
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getImageUrl() {
        return "";
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getPartNumberPartial() {
        return String.valueOf(this.f195699a.getF172495c());
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getProductDisplayName() {
        String f172496d = this.f195699a.getF172496d();
        f172496d.getClass();
        return f172496d;
    }
}

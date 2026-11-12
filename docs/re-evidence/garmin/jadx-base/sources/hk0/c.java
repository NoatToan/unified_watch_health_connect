package hk0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.gfdi.file.FileException;

/* JADX INFO: loaded from: classes8.dex */
public class c implements SyncDownloadCapability.ResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da2.m f84054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceProfile f84055b;

    public c(d dVar, da2.m mVar, DeviceProfile deviceProfile) {
        this.f84054a = mVar;
        this.f84055b = deviceProfile;
    }

    @Override // com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability.ResultListener
    public final void a(String str) {
        DeviceProfile deviceProfile = this.f84055b;
        i2.d(oa2.d.b("GDI#", "SyncListenerImpl", deviceProfile.getMacAddress(), deviceProfile.getF172494b(), this), "onFileSaved");
        this.f84054a.a(str);
    }

    @Override // com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability.ResultListener
    public final void b(long j8, String str) {
        this.f84054a.e(j8);
    }

    @Override // com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability.ResultListener
    public final void c(String str, FileException fileException) {
        DeviceProfile deviceProfile = this.f84055b;
        i2.d(oa2.d.b("GDI#", "SyncListenerImpl", deviceProfile.getMacAddress(), deviceProfile.getF172494b(), this), "onFileSaveFailure");
        this.f84054a.d(str, fileException.getMessage());
    }
}

package hk0;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability;
import com.garmin.device.datatypes.DeviceProfile;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class d extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f84056b;

    public static class a implements ea2.f.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f84057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DeviceProfile f84058b;

        public a(Context context, DeviceProfile deviceProfile) {
            this.f84057a = context.getApplicationContext();
            this.f84058b = deviceProfile;
        }

        @Override // ea2.f.d
        public final void a(long j8, long j14) {
            Bundle bundle = new Bundle();
            bundle.putLong("com.garmin.android.gdi.EXTRA_FILE_BYTES_TRANSFERRED", j8);
            bundle.putLong("com.garmin.android.gdi.EXTRA_FILE_SIZE", j14);
            d(bundle, "com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ_PROGRESS");
        }

        @Override // ea2.f.d
        public final void b(String str) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("com.garmin.android.gdi.EXTRA_FAILURE_REASON", str);
            }
            d(bundle, "com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ_FAILURE");
        }

        @Override // ea2.f.d
        public final void c(byte[] bArr) {
            Bundle bundle = new Bundle(4);
            if (bArr != null && bArr.length > 0) {
                bundle.putByteArray("com.garmin.android.gdi.EXTRA_FILE_CONTENT", bArr);
                DeviceProfile deviceProfile = this.f84058b;
                i2.d(oa2.d.b("GDI#", "DeviceXmlBroadcaster", deviceProfile.getMacAddress(), deviceProfile.getF172494b(), this), new String(bArr));
            }
            d(bundle, "com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ");
        }

        public final void d(Bundle bundle, String str) {
            DeviceProfile deviceProfile = this.f84058b;
            bundle.putParcelable("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE", deviceProfile);
            oa2.b.a(this.f84057a, str, oa2.d.b("GDI#", "DeviceXmlBroadcaster", deviceProfile.getMacAddress(), deviceProfile.getF172494b(), this), bundle);
        }
    }

    private d(Context context) {
        super(context);
    }

    public static void e(Context context) {
        f84056b = new d(context);
    }

    public static d h() {
        if (f84056b == null) {
            f84056b = new d(GarminConnectMobileApp.f28687i);
        }
        return f84056b;
    }

    @Override // hk0.s
    public final void c(String str) {
        i2.l(b(), str.concat("(): Unable to execute operation. Invalid mac address"));
    }

    public final void f(String str, int i14, String str2, String str3, uv.g gVar) {
        if (TextUtils.isEmpty(str)) {
            c("directExtractFile");
            return;
        }
        if (i14 == -1 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            i2.i(b(), "directExtractFile invalid parameters");
            return;
        }
        DeviceProfile deviceProfileD = ((da2.b) s.a()).d(str);
        ea2.f fVar = (ea2.f) s.a().getCapability(str, ea2.f.class);
        if (fVar == null || deviceProfileD == null) {
            return;
        }
        try {
            fVar.extractFile(i14, new File(str2), str3, new b(this, gVar, deviceProfileD));
        } catch (UnsupportedOperationException e4) {
            i2.i(b(), "directExtractFile UnsupportedOperationException while extracting file " + e4.getMessage() + " (" + str + ")");
        } catch (Exception e14) {
            i2.i(b(), "directExtractFile Unexpected exception thrown while extracting file " + e14.getMessage());
            throw e14;
        }
    }

    public final void g(String str, int i14, String str2, String str3, byte b14, byte b15, long j8, uv.g gVar) {
        if (TextUtils.isEmpty(str)) {
            c("directSaveFile");
            return;
        }
        String string = Integer.toString(i14);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            i2.i(b(), "Invalid parameters");
            return;
        }
        DeviceProfile deviceProfileD = ((da2.b) s.a()).d(str);
        SyncDownloadCapability syncDownloadCapability = (SyncDownloadCapability) s.a().getCapability(str, SyncDownloadCapability.class);
        if (syncDownloadCapability == null || deviceProfileD == null) {
            i2.i(b(), "SyncDownloadCapability is null for mac address [" + str + "].");
            return;
        }
        c cVar = new c(this, gVar, deviceProfileD);
        File file = new File(str2, str3);
        try {
            if (j8 != 0) {
                syncDownloadCapability.saveFile(string, file, b14, b15, null, j8, false, cVar);
            } else {
                syncDownloadCapability.saveFile(string, file, b14, b15, null, 0L, false, cVar);
            }
        } catch (AbstractMethodError unused) {
            syncDownloadCapability.saveFile(string, file, b14, b15, null, 0L, false, cVar);
        } catch (UnsupportedOperationException e4) {
            i2.i(b(), "UnsupportedOperationException: saveFile - " + e4.getMessage() + " (" + str + ")");
        }
    }
}

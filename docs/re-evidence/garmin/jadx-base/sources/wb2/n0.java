package wb2;

import android.content.Context;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability;
import com.garmin.android.lib.connectdevicesync.exception.InvalidUnitIDException;
import com.garmin.android.lib.connectdevicesync.exception.RemoteGdiServiceDeadException;
import com.garmin.device.datatypes.DeviceProfile;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class n0 implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f184067b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static n0 f184068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f184069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f184070e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f184071a = null;

    static {
        int i14 = gt2.c.f79010a;
        f184069d = gt2.b.f79005a.i("SYNC#GdiProxy");
        f184070e = new int[]{gy2.g.SOFTWARE_UPDATE.f80324a};
    }

    public static n0 g() {
        n0 n0Var;
        synchronized (f184067b) {
            try {
                if (f184068c == null) {
                    f184068c = new n0();
                }
                n0Var = f184068c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return n0Var;
    }

    public static void i(String str) {
        f184069d.trace(str.concat(": Unable to execute operation. Invalid mac address"));
    }

    @Override // wb2.i0
    public final void a(String str, byte[] bArr, b0.a aVar) throws InvalidUnitIDException, RemoteGdiServiceDeadException {
        if (TextUtils.isEmpty(str)) {
            i("list");
            throw new InvalidUnitIDException();
        }
        ea2.f fVar = (ea2.f) da2.d.c(this.f184071a).getCapability(str, ea2.f.class);
        if (fVar == null) {
            throw new RemoteGdiServiceDeadException();
        }
        fVar.listPendingUploadFiles(bArr, new m0(this, aVar));
    }

    @Override // wb2.i0
    public final void b(String str, String str2, String str3, c0 c0Var) throws InvalidUnitIDException {
        if (TextUtils.isEmpty(str)) {
            i("extract");
            throw new InvalidUnitIDException();
        }
        ea2.f fVar = (ea2.f) da2.d.c(this.f184071a).getCapability(str, ea2.f.class);
        if (fVar != null) {
            fVar.extractFile(str2, new File(str3), c0Var);
        }
    }

    @Override // wb2.i0
    public final void c(String str, String str2, b0.b bVar) throws InvalidUnitIDException {
        if (TextUtils.isEmpty(str)) {
            i("archive");
            throw new InvalidUnitIDException();
        }
        ea2.f fVar = (ea2.f) da2.d.c(this.f184071a).getCapability(str, ea2.f.class);
        if (fVar != null) {
            fVar.archiveFile(str2, bVar);
        }
    }

    @Override // wb2.i0
    public final String d(String str, byte b14) {
        if (TextUtils.isEmpty(str)) {
            i("resolveGarminDeviceFileType");
            return null;
        }
        ea2.f fVar = (ea2.f) da2.d.c(this.f184071a).getCapability(str, ea2.f.class);
        if (fVar == null) {
            return null;
        }
        return fVar.resolveGarminDeviceFileType(b14);
    }

    public final DeviceProfile e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return da2.d.c(this.f184071a).a(str);
        }
        i("findRemoteDeviceProfile");
        return null;
    }

    public final long f(String str) {
        if (TextUtils.isEmpty(str)) {
            i("getDownloadBitMask");
            return -1L;
        }
        SyncDownloadCapability syncDownloadCapability = (SyncDownloadCapability) da2.d.c(this.f184071a).getCapability(str, SyncDownloadCapability.class);
        if (syncDownloadCapability == null) {
            return 0L;
        }
        return syncDownloadCapability.getDownloadBitMask();
    }

    public final boolean h(String str) {
        return (TextUtils.isEmpty(str) || da2.d.c(this.f184071a).a(str) == null) ? false : true;
    }

    public final void j(String str, String str2, String str3, String str4, byte b14, byte b15, String str5, q qVar) throws InvalidUnitIDException, RemoteGdiServiceDeadException {
        byte b16;
        if (TextUtils.isEmpty(str)) {
            i("save");
            throw new InvalidUnitIDException();
        }
        SyncDownloadCapability syncDownloadCapability = (SyncDownloadCapability) da2.d.c(this.f184071a).getCapability(str, SyncDownloadCapability.class);
        if (syncDownloadCapability == null) {
            throw new RemoteGdiServiceDeadException();
        }
        File file = new File(str3, str4);
        int[] iArr = f184070e;
        int length = iArr.length;
        boolean z14 = false;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                b16 = b15;
                z14 = true;
                break;
            } else {
                b16 = b15;
                if (iArr[i14] == b16) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        syncDownloadCapability.saveFile(str2, file, b14, b16, str5, 0L, z14, qVar);
    }

    public final void k(da2.j jVar, String str) {
        if (jVar != null) {
            if (TextUtils.isEmpty(str)) {
                i("sendSyncState");
                return;
            }
            ea2.e eVar = (ea2.e) da2.d.c(this.f184071a).getCapability(str, ea2.e.class);
            if (eVar != null) {
                eVar.setSyncState(jVar);
            }
        }
    }

    public final void l(String str, z.a aVar) {
        if (TextUtils.isEmpty(str)) {
            i("synchronizeTime");
            throw new InvalidUnitIDException();
        }
        ea2.a aVar2 = (ea2.a) da2.d.c(this.f184071a).getCapability(str, ea2.a.class);
        if (aVar2 != null) {
            aVar2.setCurrentTime(aVar);
        }
    }
}

package wb2;

import com.garmin.device.datatypes.DeviceProfile;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class d implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f183969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File[] f183970b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f183971c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f183972d = null;

    public d(DeviceProfile deviceProfile, g0 g0Var) {
        this.f183969a = g0Var;
        String strB = h0.b(deviceProfile.getF92746j(), "DeferredFileSyncSource", deviceProfile.getMacAddress());
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.i(strB);
    }

    @Override // wb2.i0
    public final void a(String str, byte[] bArr, b0.a aVar) {
        String[] strArr = new String[0];
        long[] jArr = new long[0];
        File[] fileArr = this.f183970b;
        if (fileArr != null && fileArr.length > 0) {
            int length = fileArr.length;
            String[] strArr2 = new String[length];
            long[] jArr2 = new long[length];
            for (int i14 = 0; i14 < length; i14++) {
                strArr2[i14] = this.f183970b[i14].getName();
                jArr2[i14] = this.f183970b[i14].length();
            }
            strArr = strArr2;
            jArr = jArr2;
        }
        aVar.a(strArr, jArr, this.f183971c, this.f183972d);
    }

    @Override // wb2.i0
    public final void b(String str, String str2, String str3, c0 c0Var) {
        File[] fileArr = this.f183970b;
        if (fileArr == null || fileArr.length <= 0) {
            return;
        }
        for (File file : fileArr) {
            c0Var.b(file, file.getName());
        }
    }

    @Override // wb2.i0
    public final void c(String str, String str2, b0.b bVar) {
        File[] fileArr = this.f183970b;
        if (fileArr == null || fileArr.length <= 0) {
            return;
        }
        for (File file : fileArr) {
            file.getName();
            bVar.a();
        }
    }

    @Override // wb2.i0
    public final String d(String str, byte b14) {
        return ((n0) this.f183969a).d(str, b14);
    }
}

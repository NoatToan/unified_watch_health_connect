package hk0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class b implements ea2.f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da2.m f84052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f84053b;

    public b(d dVar, da2.m mVar, DeviceProfile deviceProfile) {
        this.f84053b = dVar;
        this.f84052a = mVar;
    }

    @Override // ea2.f.c
    public final void a(long j8, String str) {
        i2.d(this.f84053b.b(), "directExtractFile Extracting file in progress");
        this.f84052a.b(j8);
    }

    @Override // ea2.f.c
    public final void b(File file, String str) {
        if (file != null) {
            String parent = file.getParent();
            String name = file.getName();
            this.f84052a.f(file.length(), str, parent, name);
        }
    }

    @Override // ea2.f.c
    public final void c(String str, String str2) {
        i2.d(this.f84053b.b(), "directExtractFile Failed extracting file because ".concat(str2));
        this.f84052a.c(str2);
    }
}

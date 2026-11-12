package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public class meh extends leh {
    public meh(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    @RequiresApi(28)
    public static meh f(OutputConfiguration outputConfiguration) {
        return new meh(outputConfiguration);
    }

    @Override // defpackage.leh, defpackage.neh, jeh.a
    public String b() {
        return null;
    }

    @Override // defpackage.leh, defpackage.neh, jeh.a
    public void c(String str) {
        ((OutputConfiguration) d()).setPhysicalCameraId(str);
    }

    @Override // defpackage.leh, defpackage.keh, defpackage.neh, jeh.a
    public Object d() {
        g6i.a(this.f27855a instanceof OutputConfiguration);
        return this.f27855a;
    }

    public meh(Object obj) {
        super(obj);
    }
}

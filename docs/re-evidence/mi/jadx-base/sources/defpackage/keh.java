package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public class keh extends neh {
    public keh(Object obj) {
        super(obj);
    }

    @Override // defpackage.neh, jeh.a
    public Surface a() {
        return ((OutputConfiguration) d()).getSurface();
    }

    @Override // defpackage.neh, jeh.a
    public Object d() {
        throw null;
    }
}

package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SessionConfig;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class x7i {
    public static void a(SessionConfig.b bVar) {
        if (((y7i) za6.a(y7i.class)) == null) {
            return;
        }
        pe3.a aVar = new pe3.a();
        aVar.e(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(aVar.c());
    }
}

package defpackage;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class h3d {
    @SuppressLint({"NewApi"})
    public void a(int i, pe3.a aVar) {
        if (((i3d) za6.a(i3d.class)) == null) {
            return;
        }
        if (i == 0) {
            aVar.e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i != 1) {
                return;
            }
            aVar.e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}

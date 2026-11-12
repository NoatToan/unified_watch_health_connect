package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class wfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37927a;

    public wfo() {
        this.f37927a = ((vfo) za6.a(vfo.class)) != null;
    }

    public boolean a(List<CaptureRequest> list, boolean z) {
        if (this.f37927a && z) {
            Iterator<CaptureRequest> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next().get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}

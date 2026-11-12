package y;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192960a;

    public r() {
        this.f192960a = ((StillCaptureFlashStopRepeatingQuirk) x.c.f188202a.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public final boolean a(ArrayList arrayList, boolean z14) {
        if (!this.f192960a || !z14) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }
}

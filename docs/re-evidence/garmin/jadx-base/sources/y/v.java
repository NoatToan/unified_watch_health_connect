package y;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192966a;

    public v() {
        this.f192966a = x.c.f188202a.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public static v0 a(v0 v0Var) {
        v0.a aVar = new v0.a();
        aVar.f5823c = v0Var.f5815c;
        Iterator it = Collections.unmodifiableList(v0Var.f5813a).iterator();
        while (it.hasNext()) {
            aVar.d((DeferrableSurface) it.next());
        }
        aVar.c(v0Var.f5814b);
        u.a.C3144a c3144a = new u.a.C3144a();
        c3144a.c(CaptureRequest.FLASH_MODE, 0);
        aVar.c(c3144a.a());
        return aVar.e();
    }

    public final boolean b(ArrayList arrayList, boolean z14) {
        if (!this.f192966a || !z14) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}

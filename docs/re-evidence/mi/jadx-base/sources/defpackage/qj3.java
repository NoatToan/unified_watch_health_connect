package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class qj3 {
    public static CameraCaptureSession.CaptureCallback a(we3 we3Var) {
        if (we3Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(we3Var, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : vd3.a(arrayList);
    }

    public static void b(we3 we3Var, List<CameraCaptureSession.CaptureCallback> list) {
        if (we3Var instanceof xe3) {
            Iterator<we3> it = ((xe3) we3Var).d().iterator();
            while (it.hasNext()) {
                b(it.next(), list);
            }
        } else if (we3Var instanceof pj3) {
            list.add(((pj3) we3Var).e());
        } else {
            list.add(new oj3(we3Var));
        }
    }
}

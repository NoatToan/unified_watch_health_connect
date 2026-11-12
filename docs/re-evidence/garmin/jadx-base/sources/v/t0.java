package v;

import android.hardware.camera2.CameraCharacteristics;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class t0 {
    private t0() {
    }

    public static String a(androidx.camera.camera2.internal.compat.q qVar, Integer num, ArrayList arrayList) {
        if (num == null || !arrayList.contains("0") || !arrayList.contains(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) qVar.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) qVar.b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }
}

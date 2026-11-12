package j0;

import b0.t0;
import i3.e5;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static int a(int i14, int i15, boolean z14) {
        int i16 = z14 ? ((i15 - i14) + 360) % 360 : (i15 + i14) % 360;
        if (t0.a(2, "CameraOrientationUtil")) {
            StringBuilder sbJ = e5.j(i14, i15, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbJ.append(z14);
            sbJ.append(", result=");
            sbJ.append(i16);
        }
        return i16;
    }

    public static int b(int i14) {
        if (i14 == 0) {
            return 0;
        }
        if (i14 == 1) {
            return 90;
        }
        if (i14 == 2) {
            return 180;
        }
        if (i14 == 3) {
            return 270;
        }
        vb.h.s(am.j.h(i14, "Unsupported surface rotation: "));
        return 0;
    }
}

package defpackage;

import androidx.annotation.RequiresApi;
import com.amap.api.maps.utils.SpatialRelationUtil;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ph3 {
    public static int a(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + SpatialRelationUtil.A_CIRCLE_DEGREE) % SpatialRelationUtil.A_CIRCLE_DEGREE : (i2 + i) % SpatialRelationUtil.A_CIRCLE_DEGREE;
        if (zpe.f("CameraOrientationUtil")) {
            zpe.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)));
        }
        return i3;
    }

    public static int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i);
    }
}

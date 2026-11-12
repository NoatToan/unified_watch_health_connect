package androidx.camera.core.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public interface n2 {
    static Range f() {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        for (Pair pair : Collections.EMPTY_LIST) {
            if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) {
                return (Range) pair.second;
            }
        }
        return null;
    }

    void a();

    void b();

    void c();

    l2 d();

    int e();

    void g();

    int h();

    void i();
}

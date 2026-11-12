package b0;

import android.graphics.Matrix;
import androidx.camera.core.impl.w2;

/* JADX INFO: loaded from: classes.dex */
public interface m0 {
    w2 a();

    default int b() {
        return 0;
    }

    void c(j0.j.b bVar);

    default Matrix d() {
        return new Matrix();
    }

    int e();

    long getTimestamp();
}

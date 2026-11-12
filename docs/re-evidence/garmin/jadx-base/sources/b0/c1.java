package b0;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import com.google.auto.value.AutoValue;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface c1 extends Closeable {

    @AutoValue
    public static abstract class a {
        public abstract androidx.camera.core.impl.l0 a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    @AutoValue
    public static abstract class b {
        public abstract int a();

        public abstract c1 b();
    }

    default void Q0(float[] fArr, float[] fArr2, boolean z14) {
    }

    Surface V0(k0.d dVar, k7.b bVar);

    default int getFormat() {
        return 34;
    }

    Size getSize();

    void i0(float[] fArr, float[] fArr2);
}

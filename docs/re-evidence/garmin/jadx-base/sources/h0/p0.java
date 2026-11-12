package h0;

import androidx.camera.core.ImageCaptureException;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
public interface p0 {

    @AutoValue
    public static abstract class a {
        public abstract ImageCaptureException a();

        public abstract int b();
    }

    public interface b {
        t0 a(b0.l0.a aVar);
    }

    void a();

    void b(j jVar);

    void c(y yVar);

    void pause();

    void resume();
}

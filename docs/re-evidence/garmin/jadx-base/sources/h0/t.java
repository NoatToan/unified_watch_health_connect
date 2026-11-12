package h0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DngCreator f80572a;

    @AutoValue
    public static abstract class a {
        public abstract androidx.camera.core.e a();

        public abstract b0.l0.h b();

        public abstract int c();
    }

    public t(CameraCharacteristics cameraCharacteristics, CaptureResult captureResult) {
        this(new DngCreator(cameraCharacteristics, captureResult));
    }

    public t(DngCreator dngCreator) {
        this.f80572a = dngCreator;
    }
}

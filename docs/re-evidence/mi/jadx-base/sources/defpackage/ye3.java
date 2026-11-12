package defpackage;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface ye3 {

    public static final class a implements ye3 {
        public static ye3 e() {
            return new a();
        }

        @Override // defpackage.ye3
        public uzo a() {
            return uzo.a();
        }

        @Override // defpackage.ye3
        public CameraCaptureMetaData$FlashState c() {
            return CameraCaptureMetaData$FlashState.UNKNOWN;
        }

        @Override // defpackage.ye3
        public long getTimestamp() {
            return -1L;
        }
    }

    uzo a();

    default void b(ExifData.b bVar) {
        bVar.g(c());
    }

    CameraCaptureMetaData$FlashState c();

    default CaptureResult d() {
        return a.e().d();
    }

    long getTimestamp();
}

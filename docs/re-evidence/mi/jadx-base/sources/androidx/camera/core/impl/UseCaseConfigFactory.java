package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.camera.core.InitializationException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface UseCaseConfigFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UseCaseConfigFactory f1721a = new a();

    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    public class a implements UseCaseConfigFactory {
        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        public Config a(CaptureType captureType, int i) {
            return null;
        }
    }

    public interface b {
        UseCaseConfigFactory a(Context context) throws InitializationException;
    }

    Config a(CaptureType captureType, int i);
}

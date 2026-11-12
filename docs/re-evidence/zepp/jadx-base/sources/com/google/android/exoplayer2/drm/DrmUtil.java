package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    @RequiresApi(18)
    public static final class a {
        private a() {
        }

        @DoNotInline
        public static boolean a(@Nullable Throwable throwable) {
            return throwable instanceof DeniedByServerException;
        }

        @DoNotInline
        public static boolean b(@Nullable Throwable throwable) {
            return throwable instanceof NotProvisionedException;
        }
    }

    @RequiresApi(21)
    public static final class b {
        private b() {
        }

        @DoNotInline
        public static boolean a(@Nullable Throwable throwable) {
            return throwable instanceof MediaDrm.MediaDrmStateException;
        }

        @DoNotInline
        public static int b(Throwable throwable) {
            return C.getErrorCodeForMediaDrmErrorCode(Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) throwable).getDiagnosticInfo()));
        }
    }

    @RequiresApi(23)
    public static final class c {
        private c() {
        }

        @DoNotInline
        public static boolean a(@Nullable Throwable throwable) {
            return throwable instanceof MediaDrmResetException;
        }
    }

    private DrmUtil() {
    }

    public static int getErrorCodeForMediaDrmException(Exception exception, int errorSource) {
        int i = Util.SDK_INT;
        if (i >= 21 && b.a(exception)) {
            return b.b(exception);
        }
        if (i >= 23 && c.a(exception)) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i >= 18 && a.b(exception)) {
            return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        if (i >= 18 && a.a(exception)) {
            return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (exception instanceof UnsupportedDrmException) {
            return PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
        }
        if (exception instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        if (exception instanceof KeysExpiredException) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (errorSource == 1) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (errorSource == 2) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (errorSource == 3) {
            return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        throw new IllegalArgumentException();
    }
}

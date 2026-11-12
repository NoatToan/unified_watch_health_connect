package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;

    public static final class Api18 {
        private Api18() {
        }

        public static boolean isDeniedByServerException(Throwable th3) {
            return th3 instanceof DeniedByServerException;
        }

        public static boolean isNotProvisionedException(Throwable th3) {
            return th3 instanceof NotProvisionedException;
        }
    }

    public static final class Api21 {
        private Api21() {
        }

        public static boolean isMediaDrmStateException(Throwable th3) {
            return th3 instanceof MediaDrm.MediaDrmStateException;
        }

        public static int mediaDrmStateExceptionToErrorCode(Throwable th3) {
            return Util.getErrorCodeForMediaDrmErrorCode(Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo()));
        }
    }

    public static final class Api23 {
        private Api23() {
        }

        public static boolean isMediaDrmResetException(Throwable th3) {
            return th3 instanceof MediaDrmResetException;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    private DrmUtil() {
    }

    public static int getErrorCodeForMediaDrmException(Exception exc, int i14) {
        int i15 = Util.SDK_INT;
        if (i15 >= 21 && Api21.isMediaDrmStateException(exc)) {
            return Api21.mediaDrmStateExceptionToErrorCode(exc);
        }
        if (i15 >= 23 && Api23.isMediaDrmResetException(exc)) {
            return 6006;
        }
        if (i15 >= 18 && Api18.isNotProvisionedException(exc)) {
            return 6002;
        }
        if (i15 >= 18 && Api18.isDeniedByServerException(exc)) {
            return 6007;
        }
        if (exc instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (exc instanceof KeysExpiredException) {
            return 6008;
        }
        if (i14 == 1) {
            return 6006;
        }
        if (i14 == 2) {
            return 6004;
        }
        if (i14 == 3) {
            return 6002;
        }
        vb.h.w();
        return 0;
    }
}

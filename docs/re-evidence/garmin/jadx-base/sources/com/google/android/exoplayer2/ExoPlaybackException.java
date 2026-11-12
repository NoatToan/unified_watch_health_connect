package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import v.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final Bundleable.Creator<ExoPlaybackException> CREATOR = new v(4);
    private static final int FIELD_IS_RECOVERABLE = 1006;
    private static final int FIELD_RENDERER_FORMAT = 1004;
    private static final int FIELD_RENDERER_FORMAT_SUPPORT = 1005;
    private static final int FIELD_RENDERER_INDEX = 1003;
    private static final int FIELD_RENDERER_NAME = 1002;
    private static final int FIELD_TYPE = 1001;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;
    public final MediaPeriodId mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(PlaybackException.keyForField(1001), 2);
        this.rendererName = bundle.getString(PlaybackException.keyForField(1002));
        this.rendererIndex = bundle.getInt(PlaybackException.keyForField(1003), -1);
        this.rendererFormat = (Format) BundleableUtil.fromNullableBundle(Format.CREATOR, bundle.getBundle(PlaybackException.keyForField(1004)));
        this.rendererFormatSupport = bundle.getInt(PlaybackException.keyForField(1005), 4);
        this.isRecoverable = bundle.getBoolean(PlaybackException.keyForField(1006), false);
        this.mediaPeriodId = null;
    }

    public static /* synthetic */ ExoPlaybackException a(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th3, String str, int i14, Format format, int i15, boolean z14, int i16) {
        if (format == null) {
            i15 = 4;
        }
        return new ExoPlaybackException(1, th3, null, i16, str, i14, format, i15, z14);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i14) {
        return new ExoPlaybackException(0, iOException, i14);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i14, String str, String str2, int i15, Format format, int i16) {
        String strH;
        if (i14 == 0) {
            strH = "Source error";
        } else if (i14 != 1) {
            strH = i14 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String strValueOf = String.valueOf(format);
            String formatSupportString = Util.getFormatSupportString(i16);
            StringBuilder sb3 = new StringBuilder(v.a(strValueOf.length() + v.a(53, str2), formatSupportString));
            sb3.append(str2);
            sb3.append(" error, index=");
            sb3.append(i15);
            sb3.append(", format=");
            strH = e0.h(sb3, strValueOf, ", format_supported=", formatSupportString);
        }
        return !TextUtils.isEmpty(str) ? v.c(v.a(strH.length() + 2, str), strH, ": ", str) : strH;
    }

    public ExoPlaybackException copyWithMediaPeriodId(MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException((String) Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) Util.castNonNull(playbackException);
        return this.type == exoPlaybackException.type && Util.areEqual(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && Util.areEqual(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && Util.areEqual(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    public Exception getRendererException() {
        Assertions.checkState(this.type == 1);
        return (Exception) Assertions.checkNotNull(getCause());
    }

    public IOException getSourceException() {
        Assertions.checkState(this.type == 0);
        return (IOException) Assertions.checkNotNull(getCause());
    }

    public RuntimeException getUnexpectedException() {
        Assertions.checkState(this.type == 2);
        return (RuntimeException) Assertions.checkNotNull(getCause());
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(PlaybackException.keyForField(1001), this.type);
        bundle.putString(PlaybackException.keyForField(1002), this.rendererName);
        bundle.putInt(PlaybackException.keyForField(1003), this.rendererIndex);
        bundle.putBundle(PlaybackException.keyForField(1004), BundleableUtil.toNullableBundle(this.rendererFormat));
        bundle.putInt(PlaybackException.keyForField(1005), this.rendererFormatSupport);
        bundle.putBoolean(PlaybackException.keyForField(1006), this.isRecoverable);
        return bundle;
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i14) {
        return new ExoPlaybackException(2, runtimeException, i14);
    }

    private ExoPlaybackException(int i14, Throwable th3, String str, int i15, String str2, int i16, Format format, int i17, boolean z14) {
        this(deriveMessage(i14, str, str2, i16, format, i17), th3, i15, i14, str2, i16, format, i17, null, SystemClock.elapsedRealtime(), z14);
    }

    private ExoPlaybackException(int i14, Throwable th3, int i15) {
        this(i14, th3, null, i15, null, -1, null, 4, false);
    }

    private ExoPlaybackException(String str, Throwable th3, int i14, int i15, String str2, int i16, Format format, int i17, MediaPeriodId mediaPeriodId, long j8, boolean z14) {
        super(str, th3, i14, j8);
        Assertions.checkArgument(!z14 || i15 == 1);
        Assertions.checkArgument(th3 != null || i15 == 3);
        this.type = i15;
        this.rendererName = str2;
        this.rendererIndex = i16;
        this.rendererFormat = format;
        this.rendererFormatSupport = i17;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z14;
    }
}

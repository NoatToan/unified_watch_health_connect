package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final Bundleable.Creator<ExoPlaybackException> CREATOR = new Bundleable.Creator() { // from class: vw1
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return ExoPlaybackException.e(bundle);
        }
    };
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    private static final int g = 1001;
    private static final int h = 1002;
    private static final int i = 1003;
    private static final int j = 1004;
    private static final int k = 1005;
    private static final int l = 1006;
    public final boolean f;

    @Nullable
    public final MediaPeriodId mediaPeriodId;

    @Nullable
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;

    @Nullable
    public final String rendererName;
    public final int type;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private ExoPlaybackException(int type, Throwable cause, int errorCode) {
        this(type, cause, null, errorCode, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRemote(String message) {
        return new ExoPlaybackException(3, null, message, 1001, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable cause, String rendererName, int rendererIndex, @Nullable Format rendererFormat, int rendererFormatSupport, boolean isRecoverable, int errorCode) {
        return new ExoPlaybackException(1, cause, null, errorCode, rendererName, rendererIndex, rendererFormat, rendererFormat == null ? 4 : rendererFormatSupport, isRecoverable);
    }

    public static ExoPlaybackException createForSource(IOException cause, int errorCode) {
        return new ExoPlaybackException(0, cause, errorCode);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException cause) {
        return createForUnexpected(cause, 1000);
    }

    public static /* synthetic */ ExoPlaybackException e(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    private static String g(int type, @Nullable String customMessage, @Nullable String rendererName, int rendererIndex, @Nullable Format rendererFormat, int rendererFormatSupport) {
        String string;
        if (type == 0) {
            string = "Source error";
        } else if (type != 1) {
            string = type != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String strValueOf = String.valueOf(rendererFormat);
            String formatSupportString = C.getFormatSupportString(rendererFormatSupport);
            StringBuilder sb = new StringBuilder(String.valueOf(rendererName).length() + 53 + strValueOf.length() + String.valueOf(formatSupportString).length());
            sb.append(rendererName);
            sb.append(" error, index=");
            sb.append(rendererIndex);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(formatSupportString);
            string = sb.toString();
        }
        if (TextUtils.isEmpty(customMessage)) {
            return string;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 2 + String.valueOf(customMessage).length());
        sb2.append(strValueOf2);
        sb2.append(": ");
        sb2.append(customMessage);
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(@Nullable PlaybackException that) {
        if (!super.errorInfoEquals(that)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) Util.castNonNull(that);
        return this.type == exoPlaybackException.type && Util.areEqual(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && Util.areEqual(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && Util.areEqual(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.f == exoPlaybackException.f;
    }

    @CheckResult
    public ExoPlaybackException f(@Nullable MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException((String) Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.f);
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
        bundle.putParcelable(PlaybackException.keyForField(1004), this.rendererFormat);
        bundle.putInt(PlaybackException.keyForField(1005), this.rendererFormatSupport);
        bundle.putBoolean(PlaybackException.keyForField(1006), this.f);
        return bundle;
    }

    private ExoPlaybackException(int type, @Nullable Throwable cause, @Nullable String customMessage, int errorCode, @Nullable String rendererName, int rendererIndex, @Nullable Format rendererFormat, int rendererFormatSupport, boolean isRecoverable) {
        this(g(type, customMessage, rendererName, rendererIndex, rendererFormat, rendererFormatSupport), cause, errorCode, type, rendererName, rendererIndex, rendererFormat, rendererFormatSupport, null, SystemClock.elapsedRealtime(), isRecoverable);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException cause, int errorCode) {
        return new ExoPlaybackException(2, cause, errorCode);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(PlaybackException.keyForField(1001), 2);
        this.rendererName = bundle.getString(PlaybackException.keyForField(1002));
        this.rendererIndex = bundle.getInt(PlaybackException.keyForField(1003), -1);
        this.rendererFormat = (Format) bundle.getParcelable(PlaybackException.keyForField(1004));
        this.rendererFormatSupport = bundle.getInt(PlaybackException.keyForField(1005), 4);
        this.f = bundle.getBoolean(PlaybackException.keyForField(1006), false);
        this.mediaPeriodId = null;
    }

    private ExoPlaybackException(String message, @Nullable Throwable cause, int errorCode, int type, @Nullable String rendererName, int rendererIndex, @Nullable Format rendererFormat, int rendererFormatSupport, @Nullable MediaPeriodId mediaPeriodId, long timestampMs, boolean isRecoverable) {
        super(message, cause, errorCode, timestampMs);
        Assertions.checkArgument(!isRecoverable || type == 1);
        Assertions.checkArgument(cause != null || type == 3);
        this.type = type;
        this.rendererName = rendererName;
        this.rendererIndex = rendererIndex;
        this.rendererFormat = rendererFormat;
        this.rendererFormatSupport = rendererFormatSupport;
        this.mediaPeriodId = mediaPeriodId;
        this.f = isRecoverable;
    }
}

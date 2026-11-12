package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import defpackage.g83;
import defpackage.j63;
import defpackage.njf;
import defpackage.ph8;
import defpackage.rk1;
import defpackage.wlq;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ExoPlaybackException extends Exception {
    public static final j63<ExoPlaybackException> CREATOR = new ph8();
    private static final int FIELD_CAUSE_CLASS_NAME = 8;
    private static final int FIELD_CAUSE_MESSAGE = 9;
    private static final int FIELD_IS_RECOVERABLE = 7;
    private static final int FIELD_MESSAGE = 0;
    private static final int FIELD_RENDERER_FORMAT = 4;
    private static final int FIELD_RENDERER_FORMAT_SUPPORT = 5;
    private static final int FIELD_RENDERER_INDEX = 3;
    private static final int FIELD_RENDERER_NAME = 2;
    private static final int FIELD_TIME_STAMP_MS = 6;
    private static final int FIELD_TYPE = 1;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    private final Throwable cause;
    final boolean isRecoverable;
    public final njf mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final long timestampMs;
    public final int type;

    private ExoPlaybackException(int i, Throwable th) {
        this(i, th, null, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, str);
    }

    public static ExoPlaybackException createForRenderer(Exception exc) {
        return new ExoPlaybackException(1, exc, null, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    private static RemoteException createRemoteException(String str) {
        return new RemoteException(str);
    }

    private static Throwable createThrowable(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static String deriveMessage(int i, String str, String str2, int i2, Format format, int i3) {
        String string;
        if (i == 0) {
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String strValueOf = String.valueOf(format);
            String strB = g83.b(i3);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53 + strValueOf.length() + String.valueOf(strB).length());
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i2);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(strB);
            string = sb.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 2 + String.valueOf(str).length());
        sb2.append(strValueOf2);
        sb2.append(": ");
        sb2.append(str);
        return sb2.toString();
    }

    private static ExoPlaybackException fromBundle(Bundle bundle) {
        Throwable thCreateRemoteException;
        int i = bundle.getInt(keyForField(1), 2);
        String string = bundle.getString(keyForField(2));
        int i2 = bundle.getInt(keyForField(3), -1);
        Format format = (Format) bundle.getParcelable(keyForField(4));
        int i3 = bundle.getInt(keyForField(5), 4);
        long j = bundle.getLong(keyForField(6), SystemClock.elapsedRealtime());
        boolean z = bundle.getBoolean(keyForField(7), false);
        String string2 = bundle.getString(keyForField(0));
        if (string2 == null) {
            string2 = deriveMessage(i, null, string, i2, format, i3);
        }
        String str = string2;
        String string3 = bundle.getString(keyForField(8));
        String string4 = bundle.getString(keyForField(9));
        Throwable thCreateThrowable = null;
        if (!TextUtils.isEmpty(string3)) {
            try {
                Class<?> cls = Class.forName(string3, true, ExoPlaybackException.class.getClassLoader());
                if (Throwable.class.isAssignableFrom(cls)) {
                    thCreateThrowable = createThrowable(cls, string4);
                }
            } catch (Throwable unused) {
                thCreateRemoteException = createRemoteException(string4);
            }
        }
        thCreateRemoteException = thCreateThrowable;
        return new ExoPlaybackException(str, thCreateRemoteException, i, string, i2, format, i3, null, j, z);
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    @CheckResult
    public ExoPlaybackException copyWithMediaPeriodId(njf njfVar) {
        return new ExoPlaybackException((String) wlq.j(getMessage()), this.cause, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, njfVar, this.timestampMs, this.isRecoverable);
    }

    public Exception getRendererException() {
        rk1.g(this.type == 1);
        return (Exception) rk1.e(this.cause);
    }

    public IOException getSourceException() {
        rk1.g(this.type == 0);
        return (IOException) rk1.e(this.cause);
    }

    public RuntimeException getUnexpectedException() {
        rk1.g(this.type == 2);
        return (RuntimeException) rk1.e(this.cause);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(keyForField(0), getMessage());
        bundle.putInt(keyForField(1), this.type);
        bundle.putString(keyForField(2), this.rendererName);
        bundle.putInt(keyForField(3), this.rendererIndex);
        bundle.putParcelable(keyForField(4), this.rendererFormat);
        bundle.putInt(keyForField(5), this.rendererFormatSupport);
        bundle.putLong(keyForField(6), this.timestampMs);
        bundle.putBoolean(keyForField(7), this.isRecoverable);
        if (this.cause != null) {
            bundle.putString(keyForField(8), this.cause.getClass().getName());
            bundle.putString(keyForField(9), this.cause.getMessage());
        }
        return bundle;
    }

    private ExoPlaybackException(int i, String str) {
        this(i, null, str, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, Format format, int i2) {
        return createForRenderer(th, str, i, format, i2, false);
    }

    private ExoPlaybackException(int i, Throwable th, String str, String str2, int i2, Format format, int i3, boolean z) {
        this(deriveMessage(i, str, str2, i2, format, i3), th, i, str2, i2, format, i3, null, SystemClock.elapsedRealtime(), z);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, Format format, int i2, boolean z) {
        if (format == null) {
            i2 = 4;
        }
        return new ExoPlaybackException(1, th, null, str, i, format, i2, z);
    }

    private ExoPlaybackException(String str, Throwable th, int i, String str2, int i2, Format format, int i3, njf njfVar, long j, boolean z) {
        super(str, th);
        boolean z2 = true;
        if (z && i != 1) {
            z2 = false;
        }
        rk1.a(z2);
        this.type = i;
        this.cause = th;
        this.rendererName = str2;
        this.rendererIndex = i2;
        this.rendererFormat = format;
        this.rendererFormatSupport = i3;
        this.mediaPeriodId = njfVar;
        this.timestampMs = j;
        this.isRecoverable = z;
    }
}

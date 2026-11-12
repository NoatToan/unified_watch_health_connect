package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.google.common.collect.ImmutableList;
import i3.e5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    private static final String FIELD_IS_RECOVERABLE;
    private static final String FIELD_RENDERER_FORMAT;
    private static final String FIELD_RENDERER_FORMAT_SUPPORT;
    private static final String FIELD_RENDERER_INDEX;
    private static final String FIELD_RENDERER_NAME;
    private static final String FIELD_TYPE;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;
    public final androidx.media3.exoplayer.source.j.b mediaPeriodId;
    public final androidx.media3.common.q rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    static {
        int i14 = fa.z.f70071a;
        FIELD_TYPE = Integer.toString(1001, 36);
        FIELD_RENDERER_NAME = Integer.toString(1002, 36);
        FIELD_RENDERER_INDEX = Integer.toString(1003, 36);
        FIELD_RENDERER_FORMAT = Integer.toString(1004, 36);
        FIELD_RENDERER_FORMAT_SUPPORT = Integer.toString(1005, 36);
        FIELD_IS_RECOVERABLE = Integer.toString(1006, 36);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(FIELD_TYPE, 2);
        this.rendererName = bundle.getString(FIELD_RENDERER_NAME);
        this.rendererIndex = bundle.getInt(FIELD_RENDERER_INDEX, -1);
        Bundle bundle2 = bundle.getBundle(FIELD_RENDERER_FORMAT);
        this.rendererFormat = bundle2 == null ? null : androidx.media3.common.q.b(bundle2);
        this.rendererFormatSupport = bundle.getInt(FIELD_RENDERER_FORMAT_SUPPORT, 4);
        this.isRecoverable = bundle.getBoolean(FIELD_IS_RECOVERABLE, false);
        this.mediaPeriodId = null;
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th3, String str, int i14, androidx.media3.common.q qVar, int i15, boolean z14, int i16) {
        if (qVar == null) {
            i15 = 4;
        }
        return new ExoPlaybackException(1, th3, null, i16, str, i14, qVar, i15, z14);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i14) {
        return new ExoPlaybackException(0, iOException, i14);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i14, String str, String str2, int i15, androidx.media3.common.q qVar, int i16) {
        String str3;
        if (i14 == 0) {
            str3 = "Source error";
        } else if (i14 != 1) {
            str3 = i14 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i15 + ", format=" + qVar + ", format_supported=" + fa.z.v(i16);
        }
        return !TextUtils.isEmpty(str) ? e5.g(str3, ": ", str) : str3;
    }

    public static ExoPlaybackException fromBundle(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public ExoPlaybackException copyWithMediaPeriodId(androidx.media3.exoplayer.source.j.b bVar) {
        String message = getMessage();
        int i14 = fa.z.f70071a;
        return new ExoPlaybackException(message, getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, bVar, this.timestampMs, this.isRecoverable);
    }

    @Override // androidx.media3.common.PlaybackException
    public boolean errorInfoEquals(PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        int i14 = fa.z.f70071a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.type == exoPlaybackException.type && Objects.equals(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && Objects.equals(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && Objects.equals(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    public Exception getRendererException() {
        fa.a.d(this.type == 1);
        Throwable cause = getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public IOException getSourceException() {
        fa.a.d(this.type == 0);
        Throwable cause = getCause();
        cause.getClass();
        return (IOException) cause;
    }

    public RuntimeException getUnexpectedException() {
        fa.a.d(this.type == 2);
        Throwable cause = getCause();
        cause.getClass();
        return (RuntimeException) cause;
    }

    @Override // androidx.media3.common.PlaybackException
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(FIELD_TYPE, this.type);
        bundle.putString(FIELD_RENDERER_NAME, this.rendererName);
        bundle.putInt(FIELD_RENDERER_INDEX, this.rendererIndex);
        androidx.media3.common.q qVar = this.rendererFormat;
        if (qVar != null) {
            String str = FIELD_RENDERER_FORMAT;
            List<byte[]> list = qVar.f8389q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(androidx.media3.common.q.O, qVar.f8373a);
            bundle2.putString(androidx.media3.common.q.P, qVar.f8374b);
            String str2 = androidx.media3.common.q.f8371u0;
            ImmutableList<androidx.media3.common.s> immutableList = qVar.f8375c;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
            for (androidx.media3.common.s sVar : immutableList) {
                sVar.getClass();
                Bundle bundle3 = new Bundle();
                String str3 = sVar.f8435a;
                if (str3 != null) {
                    bundle3.putString(androidx.media3.common.s.f8433c, str3);
                }
                bundle3.putString(androidx.media3.common.s.f8434d, sVar.f8436b);
                arrayList.add(bundle3);
            }
            bundle2.putParcelableArrayList(str2, arrayList);
            bundle2.putString(androidx.media3.common.q.Q, qVar.f8376d);
            bundle2.putInt(androidx.media3.common.q.R, qVar.f8377e);
            bundle2.putInt(androidx.media3.common.q.S, qVar.f8378f);
            int i14 = qVar.f8379g;
            if (i14 != androidx.media3.common.q.N.f8379g) {
                bundle2.putInt(androidx.media3.common.q.f8372v0, i14);
            }
            bundle2.putInt(androidx.media3.common.q.T, qVar.f8380h);
            bundle2.putInt(androidx.media3.common.q.U, qVar.f8381i);
            bundle2.putString(androidx.media3.common.q.V, qVar.f8383k);
            bundle2.putParcelable(androidx.media3.common.q.W, qVar.f8384l);
            bundle2.putString(androidx.media3.common.q.X, qVar.f8385m);
            bundle2.putString(androidx.media3.common.q.Y, qVar.f8386n);
            bundle2.putInt(androidx.media3.common.q.Z, qVar.f8387o);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(androidx.media3.common.q.f8351a0 + "_" + Integer.toString(i15, 36), list.get(i15));
            }
            bundle2.putParcelable(androidx.media3.common.q.f8352b0, qVar.f8390r);
            bundle2.putLong(androidx.media3.common.q.f8353c0, qVar.f8391s);
            bundle2.putInt(androidx.media3.common.q.f8354d0, qVar.f8393u);
            bundle2.putInt(androidx.media3.common.q.f8355e0, qVar.f8394v);
            bundle2.putFloat(androidx.media3.common.q.f8356f0, qVar.f8395w);
            bundle2.putInt(androidx.media3.common.q.f8357g0, qVar.f8396x);
            bundle2.putFloat(androidx.media3.common.q.f8358h0, qVar.f8397y);
            bundle2.putByteArray(androidx.media3.common.q.f8359i0, qVar.f8398z);
            bundle2.putInt(androidx.media3.common.q.f8360j0, qVar.A);
            androidx.media3.common.i iVar = qVar.B;
            if (iVar != null) {
                String str4 = androidx.media3.common.q.f8361k0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(androidx.media3.common.i.f8309i, iVar.f8315a);
                bundle4.putInt(androidx.media3.common.i.f8310j, iVar.f8316b);
                bundle4.putInt(androidx.media3.common.i.f8311k, iVar.f8317c);
                bundle4.putByteArray(androidx.media3.common.i.f8312l, iVar.f8318d);
                bundle4.putInt(androidx.media3.common.i.f8313m, iVar.f8319e);
                bundle4.putInt(androidx.media3.common.i.f8314n, iVar.f8320f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(androidx.media3.common.q.f8362l0, qVar.C);
            bundle2.putInt(androidx.media3.common.q.f8363m0, qVar.D);
            bundle2.putInt(androidx.media3.common.q.f8364n0, qVar.E);
            bundle2.putInt(androidx.media3.common.q.f8365o0, qVar.F);
            bundle2.putInt(androidx.media3.common.q.f8366p0, qVar.G);
            bundle2.putInt(androidx.media3.common.q.f8367q0, qVar.H);
            bundle2.putInt(androidx.media3.common.q.f8369s0, qVar.J);
            bundle2.putInt(androidx.media3.common.q.f8370t0, qVar.K);
            bundle2.putInt(androidx.media3.common.q.f8368r0, qVar.L);
            bundle.putBundle(str, bundle2);
        }
        bundle.putInt(FIELD_RENDERER_FORMAT_SUPPORT, this.rendererFormatSupport);
        bundle.putBoolean(FIELD_IS_RECOVERABLE, this.isRecoverable);
        return bundle;
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i14) {
        return new ExoPlaybackException(2, runtimeException, i14);
    }

    private ExoPlaybackException(int i14, Throwable th3, String str, int i15, String str2, int i16, androidx.media3.common.q qVar, int i17, boolean z14) {
        this(deriveMessage(i14, str, str2, i16, qVar, i17), th3, i15, i14, str2, i16, qVar, i17, null, SystemClock.elapsedRealtime(), z14);
    }

    private ExoPlaybackException(int i14, Throwable th3, int i15) {
        this(i14, th3, null, i15, null, -1, null, 4, false);
    }

    private ExoPlaybackException(String str, Throwable th3, int i14, int i15, String str2, int i16, androidx.media3.common.q qVar, int i17, androidx.media3.exoplayer.source.j.b bVar, long j8, boolean z14) {
        super(str, th3, i14, Bundle.EMPTY, j8);
        fa.a.a(!z14 || i15 == 1);
        fa.a.a(th3 != null || i15 == 3);
        this.type = i15;
        this.rendererName = str2;
        this.rendererIndex = i16;
        this.rendererFormat = qVar;
        this.rendererFormatSupport = i17;
        this.mediaPeriodId = bVar;
        this.isRecoverable = z14;
    }
}

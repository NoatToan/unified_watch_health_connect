package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import defpackage.dt1;
import defpackage.n0i;
import defpackage.nm1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface AudioSink {

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        public InitializationException(int i, int i2, int i3, int i4, Format format, boolean z, Exception exc) {
            String str = z ? " (recoverable)" : "";
            StringBuilder sb = new StringBuilder(str.length() + 80);
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            sb.append(str);
            super(sb.toString(), exc);
            this.audioTrackState = i;
            this.isRecoverable = z;
            this.format = format;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j, long j2) {
            StringBuilder sb = new StringBuilder(103);
            sb.append("Unexpected audio track timestamp discontinuity: expected ");
            sb.append(j2);
            sb.append(", got ");
            sb.append(j);
            super(sb.toString());
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j2;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i, Format format, boolean z) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("AudioTrack write failed: ");
            sb.append(i);
            super(sb.toString());
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = format;
        }
    }

    public interface a {
        default void a(long j) {
        }

        default void b(Exception exc) {
        }

        void c(int i, long j, long j2);

        default void d(long j) {
        }

        void e();

        default void f() {
        }

        void onSkipSilenceEnabledChanged(boolean z);
    }

    boolean a(Format format);

    boolean b();

    n0i c();

    void d(n0i n0iVar);

    void e();

    void f(nm1 nm1Var);

    void flush();

    void g();

    void h();

    boolean i();

    void j(int i);

    void k(dt1 dt1Var);

    boolean l(ByteBuffer byteBuffer, long j, int i) throws WriteException, InitializationException;

    void m(a aVar);

    int n(Format format);

    void o() throws WriteException;

    long p(boolean z);

    void pause();

    void play();

    void q();

    void r(float f);

    void reset();

    void s(Format format, int i, int[] iArr) throws ConfigurationException;

    void t(boolean z);

    public static final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(Throwable th, Format format) {
            super(th);
            this.format = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.format = format;
        }
    }
}

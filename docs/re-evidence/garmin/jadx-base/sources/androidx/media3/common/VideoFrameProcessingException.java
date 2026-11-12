package androidx.media3.common;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public VideoFrameProcessingException(String str) {
        this(str, C.TIME_UNSET);
    }

    public static VideoFrameProcessingException from(Exception exc, long j8) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j8);
    }

    public VideoFrameProcessingException(String str, long j8) {
        super(str);
        this.presentationTimeUs = j8;
    }

    public VideoFrameProcessingException(String str, Throwable th3) {
        this(str, th3, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, Throwable th3, long j8) {
        super(str, th3);
        this.presentationTimeUs = j8;
    }

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(Throwable th3) {
        this(th3, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(Throwable th3, long j8) {
        super(th3);
        this.presentationTimeUs = j8;
    }
}

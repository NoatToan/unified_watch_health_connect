package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f5682c;

    public p0(long j8, int i14, Throwable th3) {
        this.f5681b = SystemClock.elapsedRealtime() - j8;
        if (th3 instanceof CameraValidator.CameraIdListIncorrectException) {
            this.f5680a = 2;
            this.f5682c = th3;
            return;
        }
        if (!(th3 instanceof InitializationException)) {
            this.f5680a = 0;
            this.f5682c = th3;
            return;
        }
        Throwable cause = th3.getCause();
        th3 = cause != null ? cause : th3;
        this.f5682c = th3;
        if (th3 instanceof CameraUnavailableException) {
            this.f5680a = 2;
        } else if (th3 instanceof IllegalArgumentException) {
            this.f5680a = 1;
        } else {
            this.f5680a = 0;
        }
    }
}

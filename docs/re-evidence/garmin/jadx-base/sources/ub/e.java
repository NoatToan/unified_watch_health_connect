package ub;

import bb.g0;
import com.garmin.device.ble.BleCommunicationException;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public interface e extends g0 {

    public static class a extends g0.b implements e {
        public a() {
            super(C.TIME_UNSET);
        }

        @Override // ub.e
        public final int f() {
            return BleCommunicationException.UNSPECIFIED_FAILURE;
        }

        @Override // ub.e
        public final long getDataEndPosition() {
            return -1L;
        }

        @Override // ub.e
        public final long getTimeUs(long j8) {
            return 0L;
        }
    }

    int f();

    long getDataEndPosition();

    long getTimeUs(long j8);
}

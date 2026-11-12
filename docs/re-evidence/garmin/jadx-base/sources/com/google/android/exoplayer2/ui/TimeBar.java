package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes14.dex */
public interface TimeBar {

    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long j8);

        void onScrubStart(TimeBar timeBar, long j8);

        void onScrubStop(TimeBar timeBar, long j8, boolean z14);
    }

    void addListener(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void removeListener(OnScrubListener onScrubListener);

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i14);

    void setBufferedPosition(long j8);

    void setDuration(long j8);

    void setEnabled(boolean z14);

    void setKeyCountIncrement(int i14);

    void setKeyTimeIncrement(long j8);

    void setPosition(long j8);
}

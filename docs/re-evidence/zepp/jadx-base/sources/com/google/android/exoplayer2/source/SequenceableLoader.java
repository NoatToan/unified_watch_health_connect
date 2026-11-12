package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public interface SequenceableLoader {

    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T source);
    }

    boolean continueLoading(long positionUs);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long positionUs);
}

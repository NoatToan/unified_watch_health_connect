package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes14.dex */
public interface SequenceableLoader {

    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T t7);
    }

    boolean continueLoading(long j8);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j8);
}

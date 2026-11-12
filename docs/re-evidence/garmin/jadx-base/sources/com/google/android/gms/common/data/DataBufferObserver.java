package com.google.android.gms.common.data;

/* JADX INFO: loaded from: classes14.dex */
public interface DataBufferObserver {

    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i14, int i15);

    void onDataRangeInserted(int i14, int i15);

    void onDataRangeMoved(int i14, int i15, int i16);

    void onDataRangeRemoved(int i14, int i15);
}

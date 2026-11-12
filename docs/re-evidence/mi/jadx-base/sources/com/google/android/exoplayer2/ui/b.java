package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes4.dex */
public interface b {

    public interface a {
        void a(b bVar, long j, boolean z);

        void b(b bVar, long j);

        void c(b bVar, long j);
    }

    void a(long[] jArr, boolean[] zArr, int i);

    void addListener(a aVar);

    long getPreferredUpdateDelay();

    void removeListener(a aVar);

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}

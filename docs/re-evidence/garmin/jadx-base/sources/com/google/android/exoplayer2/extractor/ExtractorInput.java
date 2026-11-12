package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;

/* JADX INFO: loaded from: classes13.dex */
public interface ExtractorInput extends DataReader {
    void advancePeekPosition(int i14);

    boolean advancePeekPosition(int i14, boolean z14);

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i14, int i15);

    void peekFully(byte[] bArr, int i14, int i15);

    boolean peekFully(byte[] bArr, int i14, int i15, boolean z14);

    @Override // com.google.android.exoplayer2.upstream.DataReader
    int read(byte[] bArr, int i14, int i15);

    void readFully(byte[] bArr, int i14, int i15);

    boolean readFully(byte[] bArr, int i14, int i15, boolean z14);

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j8, E e4);

    int skip(int i14);

    void skipFully(int i14);

    boolean skipFully(int i14, boolean z14);
}

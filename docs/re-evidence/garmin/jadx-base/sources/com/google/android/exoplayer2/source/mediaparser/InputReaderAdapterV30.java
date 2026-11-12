package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser$SeekableInputReader;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes14.dex */
@SuppressLint({"Override"})
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {
    private long currentPosition;
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j8 = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j8;
    }

    public long getLength() {
        return this.resourceLength;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public int read(byte[] bArr, int i14, int i15) {
        int i16 = ((DataReader) Util.castNonNull(this.dataReader)).read(bArr, i14, i15);
        this.currentPosition += (long) i16;
        return i16;
    }

    public void seekToPosition(long j8) {
        this.lastSeekPosition = j8;
    }

    public void setCurrentPosition(long j8) {
        this.currentPosition = j8;
    }

    public void setDataReader(DataReader dataReader, long j8) {
        this.dataReader = dataReader;
        this.resourceLength = j8;
        this.lastSeekPosition = -1L;
    }
}

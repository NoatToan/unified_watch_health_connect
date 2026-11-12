package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(30)
@SuppressLint({"Override"})
public final class InputReaderAdapterV30 implements MediaParser.SeekableInputReader {

    @Nullable
    private DataReader a;
    private long b;
    private long c;
    private long d;

    public long getAndResetSeekPosition() {
        long j = this.d;
        this.d = -1L;
        return j;
    }

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
        return this.b;
    }

    @Override // android.media.MediaParser.InputReader
    public long getPosition() {
        return this.c;
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bytes, int offset, int readLength) throws IOException {
        int i = ((DataReader) Util.castNonNull(this.a)).read(bytes, offset, readLength);
        this.c += (long) i;
        return i;
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public void seekToPosition(long position) {
        this.d = position;
    }

    public void setCurrentPosition(long position) {
        this.c = position;
    }

    public void setDataReader(DataReader dataReader, long length) {
        this.a = dataReader;
        this.b = length;
        this.d = -1L;
    }
}

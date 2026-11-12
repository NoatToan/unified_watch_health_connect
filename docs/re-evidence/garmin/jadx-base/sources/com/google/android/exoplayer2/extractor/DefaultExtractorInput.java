package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataReader dataReader;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader, long j8, long j14) {
        this.dataReader = dataReader;
        this.position = j8;
        this.streamLength = j14;
    }

    private void commitBytesRead(int i14) {
        if (i14 != -1) {
            this.position += (long) i14;
        }
    }

    private void ensureSpaceForPeek(int i14) {
        int i15 = this.peekBufferPosition + i14;
        byte[] bArr = this.peekBuffer;
        if (i15 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i15, i15 + PEEK_MAX_FREE_SPACE));
        }
    }

    private int readFromPeekBuffer(byte[] bArr, int i14, int i15) {
        int i16 = this.peekBufferLength;
        if (i16 == 0) {
            return 0;
        }
        int iMin = Math.min(i16, i15);
        System.arraycopy(this.peekBuffer, 0, bArr, i14, iMin);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private int readFromUpstream(byte[] bArr, int i14, int i15, int i16, boolean z14) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i17 = this.dataReader.read(bArr, i14 + i16, i15 - i16);
        if (i17 != -1) {
            return i16 + i17;
        }
        if (i16 == 0 && z14) {
            return -1;
        }
        h.m();
        return 0;
    }

    private int skipFromPeekBuffer(int i14) {
        int iMin = Math.min(this.peekBufferLength, i14);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private void updatePeekBuffer(int i14) {
        int i15 = this.peekBufferLength - i14;
        this.peekBufferLength = i15;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i15 < bArr.length - PEEK_MAX_FREE_SPACE ? new byte[65536 + i15] : bArr;
        System.arraycopy(bArr, i14, bArr2, 0, i15);
        this.peekBuffer = bArr2;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int i14, boolean z14) throws EOFException, InterruptedIOException {
        ensureSpaceForPeek(i14);
        int fromUpstream = this.peekBufferLength - this.peekBufferPosition;
        while (fromUpstream < i14) {
            int i15 = i14;
            boolean z15 = z14;
            fromUpstream = readFromUpstream(this.peekBuffer, this.peekBufferPosition, i15, fromUpstream, z15);
            if (fromUpstream == -1) {
                return false;
            }
            this.peekBufferLength = this.peekBufferPosition + fromUpstream;
            i14 = i15;
            z14 = z15;
        }
        this.peekBufferPosition += i14;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.streamLength;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.position + ((long) this.peekBufferPosition);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.position;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] bArr, int i14, int i15) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin;
        ensureSpaceForPeek(i15);
        int i16 = this.peekBufferLength;
        int i17 = this.peekBufferPosition;
        int i18 = i16 - i17;
        if (i18 == 0) {
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.readFromUpstream(this.peekBuffer, i17, i15, 0, true);
            if (iMin == -1) {
                return -1;
            }
            defaultExtractorInput.peekBufferLength += iMin;
        } else {
            defaultExtractorInput = this;
            iMin = Math.min(i15, i18);
        }
        System.arraycopy(defaultExtractorInput.peekBuffer, defaultExtractorInput.peekBufferPosition, bArr, i14, iMin);
        defaultExtractorInput.peekBufferPosition += iMin;
        return iMin;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i14, int i15, boolean z14) {
        if (!advancePeekPosition(i15, z14)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i15, bArr, i14, i15);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i14, int i15) throws EOFException, InterruptedIOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i14, i15);
        if (fromPeekBuffer == 0) {
            fromPeekBuffer = readFromUpstream(bArr, i14, i15, 0, true);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i14, int i15, boolean z14) throws EOFException, InterruptedIOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i14, i15);
        while (fromPeekBuffer < i15 && fromPeekBuffer != -1) {
            fromPeekBuffer = readFromUpstream(bArr, i14, i15, fromPeekBuffer, z14);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j8, E e4) throws E {
        Assertions.checkArgument(j8 >= 0);
        this.position = j8;
        throw e4;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int i14) throws EOFException, InterruptedIOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i14);
        if (iSkipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            iSkipFromPeekBuffer = readFromUpstream(bArr, 0, Math.min(i14, bArr.length), 0, true);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int i14, boolean z14) throws EOFException, InterruptedIOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i14);
        while (iSkipFromPeekBuffer < i14 && iSkipFromPeekBuffer != -1) {
            iSkipFromPeekBuffer = readFromUpstream(this.scratchSpace, -iSkipFromPeekBuffer, Math.min(i14, this.scratchSpace.length + iSkipFromPeekBuffer), iSkipFromPeekBuffer, z14);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i14, int i15) {
        peekFully(bArr, i14, i15, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i14, int i15) throws EOFException, InterruptedIOException {
        readFully(bArr, i14, i15, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int i14) throws EOFException, InterruptedIOException {
        skipFully(i14, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int i14) throws EOFException, InterruptedIOException {
        advancePeekPosition(i14, false);
    }
}

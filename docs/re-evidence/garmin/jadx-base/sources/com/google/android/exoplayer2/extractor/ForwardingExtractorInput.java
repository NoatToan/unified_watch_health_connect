package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes13.dex */
public class ForwardingExtractorInput implements ExtractorInput {
    private final ExtractorInput input;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.input = extractorInput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int i14, boolean z14) {
        return this.input.advancePeekPosition(i14, z14);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.input.getLength();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.input.getPeekPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.input.getPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] bArr, int i14, int i15) {
        return this.input.peek(bArr, i14, i15);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i14, int i15, boolean z14) {
        return this.input.peekFully(bArr, i14, i15, z14);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i14, int i15) {
        return this.input.read(bArr, i14, i15);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i14, int i15, boolean z14) {
        return this.input.readFully(bArr, i14, i15, z14);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.input.resetPeekPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j8, E e4) {
        this.input.setRetryPosition(j8, e4);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int i14) {
        return this.input.skip(i14);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int i14, boolean z14) {
        return this.input.skipFully(i14, z14);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int i14) {
        this.input.advancePeekPosition(i14);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i14, int i15) {
        this.input.peekFully(bArr, i14, i15);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i14, int i15) {
        this.input.readFully(bArr, i14, i15);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int i14) {
        this.input.skipFully(i14);
    }
}

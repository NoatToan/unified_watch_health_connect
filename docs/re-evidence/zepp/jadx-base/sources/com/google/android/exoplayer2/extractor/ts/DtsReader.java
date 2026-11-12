package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DtsReader implements ElementaryStreamReader {
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 18;

    @Nullable
    private final String b;
    private String c;
    private TrackOutput d;
    private int f;
    private int g;
    private long h;
    private Format i;
    private int j;
    private long k;
    private final ParsableByteArray a = new ParsableByteArray(new byte[18]);
    private int e = 0;

    public DtsReader(@Nullable String language) {
        this.b = language;
    }

    private boolean a(ParsableByteArray source, byte[] target, int targetLength) {
        int iMin = Math.min(source.bytesLeft(), targetLength - this.f);
        source.readBytes(target, this.f, iMin);
        int i = this.f + iMin;
        this.f = i;
        return i == targetLength;
    }

    @RequiresNonNull({"output"})
    private void b() {
        byte[] data = this.a.getData();
        if (this.i == null) {
            Format dtsFormat = DtsUtil.parseDtsFormat(data, this.c, this.b, null);
            this.i = dtsFormat;
            this.d.format(dtsFormat);
        }
        this.j = DtsUtil.getDtsFrameSize(data);
        this.h = (int) ((((long) DtsUtil.parseDtsAudioSampleCount(data)) * 1000000) / ((long) this.i.sampleRate));
    }

    private boolean c(ParsableByteArray pesBuffer) {
        while (pesBuffer.bytesLeft() > 0) {
            int i = this.g << 8;
            this.g = i;
            int unsignedByte = i | pesBuffer.readUnsignedByte();
            this.g = unsignedByte;
            if (DtsUtil.isSyncWord(unsignedByte)) {
                byte[] data = this.a.getData();
                int i2 = this.g;
                data[0] = (byte) ((i2 >> 24) & 255);
                data[1] = (byte) ((i2 >> 16) & 255);
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) {
        Assertions.checkStateNotNull(this.d);
        while (data.bytesLeft() > 0) {
            int i = this.e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(data.bytesLeft(), this.j - this.f);
                    this.d.sampleData(data, iMin);
                    int i2 = this.f + iMin;
                    this.f = i2;
                    int i3 = this.j;
                    if (i2 == i3) {
                        this.d.sampleMetadata(this.k, 1, i3, 0, null);
                        this.k += this.h;
                        this.e = 0;
                    }
                } else if (a(data, this.a.getData(), 18)) {
                    b();
                    this.a.setPosition(0);
                    this.d.sampleData(this.a, 18);
                    this.e = 2;
                }
            } else if (c(data)) {
                this.e = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        this.c = idGenerator.getFormatId();
        this.d = extractorOutput.track(idGenerator.getTrackId(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long pesTimeUs, int flags) {
        this.k = pesTimeUs;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }
}

package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac3Reader implements ElementaryStreamReader {
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 128;
    private final ParsableBitArray a;
    private final ParsableByteArray b;

    @Nullable
    private final String c;
    private String d;
    private TrackOutput e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private Format j;
    private int k;
    private long l;

    public Ac3Reader() {
        this(null);
    }

    private boolean a(ParsableByteArray source, byte[] target, int targetLength) {
        int iMin = Math.min(source.bytesLeft(), targetLength - this.g);
        source.readBytes(target, this.g, iMin);
        int i = this.g + iMin;
        this.g = i;
        return i == targetLength;
    }

    @RequiresNonNull({"output"})
    private void b() {
        this.a.setPosition(0);
        Ac3Util.SyncFrameInfo ac3SyncframeInfo = Ac3Util.parseAc3SyncframeInfo(this.a);
        Format format = this.j;
        if (format == null || ac3SyncframeInfo.channelCount != format.channelCount || ac3SyncframeInfo.sampleRate != format.sampleRate || !Util.areEqual(ac3SyncframeInfo.mimeType, format.sampleMimeType)) {
            Format formatBuild = new Format.Builder().setId(this.d).setSampleMimeType(ac3SyncframeInfo.mimeType).setChannelCount(ac3SyncframeInfo.channelCount).setSampleRate(ac3SyncframeInfo.sampleRate).setLanguage(this.c).build();
            this.j = formatBuild;
            this.e.format(formatBuild);
        }
        this.k = ac3SyncframeInfo.frameSize;
        this.i = (((long) ac3SyncframeInfo.sampleCount) * 1000000) / ((long) this.j.sampleRate);
    }

    private boolean c(ParsableByteArray pesBuffer) {
        while (true) {
            if (pesBuffer.bytesLeft() <= 0) {
                return false;
            }
            if (this.h) {
                int unsignedByte = pesBuffer.readUnsignedByte();
                if (unsignedByte == 119) {
                    this.h = false;
                    return true;
                }
                this.h = unsignedByte == 11;
            } else {
                this.h = pesBuffer.readUnsignedByte() == 11;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) {
        Assertions.checkStateNotNull(this.e);
        while (data.bytesLeft() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(data.bytesLeft(), this.k - this.g);
                        this.e.sampleData(data, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.k;
                        if (i2 == i3) {
                            this.e.sampleMetadata(this.l, 1, i3, 0, null);
                            this.l += this.i;
                            this.f = 0;
                        }
                    }
                } else if (a(data, this.b.getData(), 128)) {
                    b();
                    this.b.setPosition(0);
                    this.e.sampleData(this.b, 128);
                    this.f = 2;
                }
            } else if (c(data)) {
                this.f = 1;
                this.b.getData()[0] = 11;
                this.b.getData()[1] = 119;
                this.g = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        this.d = idGenerator.getFormatId();
        this.e = extractorOutput.track(idGenerator.getTrackId(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long pesTimeUs, int flags) {
        this.l = pesTimeUs;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.f = 0;
        this.g = 0;
        this.h = false;
    }

    public Ac3Reader(@Nullable String language) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[128]);
        this.a = parsableBitArray;
        this.b = new ParsableByteArray(parsableBitArray.data);
        this.f = 0;
        this.c = language;
    }
}

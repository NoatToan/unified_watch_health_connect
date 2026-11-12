package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac4Reader implements ElementaryStreamReader {
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private final ParsableBitArray a;
    private final ParsableByteArray b;

    @Nullable
    private final String c;
    private String d;
    private TrackOutput e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private Format k;
    private int l;
    private long m;

    public Ac4Reader() {
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
        Ac4Util.SyncFrameInfo ac4SyncframeInfo = Ac4Util.parseAc4SyncframeInfo(this.a);
        Format format = this.k;
        if (format == null || ac4SyncframeInfo.channelCount != format.channelCount || ac4SyncframeInfo.sampleRate != format.sampleRate || !MimeTypes.AUDIO_AC4.equals(format.sampleMimeType)) {
            Format formatBuild = new Format.Builder().setId(this.d).setSampleMimeType(MimeTypes.AUDIO_AC4).setChannelCount(ac4SyncframeInfo.channelCount).setSampleRate(ac4SyncframeInfo.sampleRate).setLanguage(this.c).build();
            this.k = formatBuild;
            this.e.format(formatBuild);
        }
        this.l = ac4SyncframeInfo.frameSize;
        this.j = (((long) ac4SyncframeInfo.sampleCount) * 1000000) / ((long) this.k.sampleRate);
    }

    private boolean c(ParsableByteArray pesBuffer) {
        while (true) {
            if (pesBuffer.bytesLeft() <= 0) {
                return false;
            }
            if (this.h) {
                int unsignedByte = pesBuffer.readUnsignedByte();
                this.h = unsignedByte == 172;
                if (unsignedByte == 64 || unsignedByte == 65) {
                    this.i = unsignedByte == 65;
                    return true;
                }
            } else {
                this.h = pesBuffer.readUnsignedByte() == 172;
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
                        int iMin = Math.min(data.bytesLeft(), this.l - this.g);
                        this.e.sampleData(data, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.l;
                        if (i2 == i3) {
                            this.e.sampleMetadata(this.m, 1, i3, 0, null);
                            this.m += this.j;
                            this.f = 0;
                        }
                    }
                } else if (a(data, this.b.getData(), 16)) {
                    b();
                    this.b.setPosition(0);
                    this.e.sampleData(this.b, 16);
                    this.f = 2;
                }
            } else if (c(data)) {
                this.f = 1;
                this.b.getData()[0] = -84;
                this.b.getData()[1] = (byte) (this.i ? 65 : 64);
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
        this.m = pesTimeUs;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
    }

    public Ac4Reader(@Nullable String language) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[16]);
        this.a = parsableBitArray;
        this.b = new ParsableByteArray(parsableBitArray.data);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.c = language;
    }
}

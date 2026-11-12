package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LatmReader implements ElementaryStreamReader {
    private static final int A = 86;
    private static final int B = 224;
    private static final int v = 0;
    private static final int w = 1;
    private static final int x = 2;
    private static final int y = 3;
    private static final int z = 1024;

    @Nullable
    private final String a;
    private final ParsableByteArray b;
    private final ParsableBitArray c;
    private TrackOutput d;
    private String e;
    private Format f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;

    @Nullable
    private String u;

    public LatmReader(@Nullable String language) {
        this.a = language;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.b = parsableByteArray;
        this.c = new ParsableBitArray(parsableByteArray.getData());
    }

    private static long a(ParsableBitArray data) {
        return data.readBits((data.readBits(2) + 1) * 8);
    }

    @RequiresNonNull({"output"})
    private void b(ParsableBitArray data) throws ParserException {
        if (!data.readBit()) {
            this.l = true;
            g(data);
        } else if (!this.l) {
            return;
        }
        if (this.m != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (this.n != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        f(data, e(data));
        if (this.p) {
            data.skipBits((int) this.q);
        }
    }

    private int c(ParsableBitArray data) throws ParserException {
        int iBitsLeft = data.bitsLeft();
        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(data, true);
        this.u = audioSpecificConfig.codecs;
        this.r = audioSpecificConfig.sampleRateHz;
        this.t = audioSpecificConfig.channelCount;
        return iBitsLeft - data.bitsLeft();
    }

    private void d(ParsableBitArray data) {
        int bits = data.readBits(3);
        this.o = bits;
        if (bits == 0) {
            data.skipBits(8);
            return;
        }
        if (bits == 1) {
            data.skipBits(9);
            return;
        }
        if (bits == 3 || bits == 4 || bits == 5) {
            data.skipBits(6);
        } else {
            if (bits != 6 && bits != 7) {
                throw new IllegalStateException();
            }
            data.skipBits(1);
        }
    }

    private int e(ParsableBitArray data) throws ParserException {
        int bits;
        if (this.o != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        int i = 0;
        do {
            bits = data.readBits(8);
            i += bits;
        } while (bits == 255);
        return i;
    }

    @RequiresNonNull({"output"})
    private void f(ParsableBitArray data, int muxLengthBytes) {
        int position = data.getPosition();
        if ((position & 7) == 0) {
            this.b.setPosition(position >> 3);
        } else {
            data.readBits(this.b.getData(), 0, muxLengthBytes * 8);
            this.b.setPosition(0);
        }
        this.d.sampleData(this.b, muxLengthBytes);
        this.d.sampleMetadata(this.k, 1, muxLengthBytes, 0, null);
        this.k += this.s;
    }

    @RequiresNonNull({"output"})
    private void g(ParsableBitArray data) throws ParserException {
        boolean bit;
        int bits = data.readBits(1);
        int bits2 = bits == 1 ? data.readBits(1) : 0;
        this.m = bits2;
        if (bits2 != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (bits == 1) {
            a(data);
        }
        if (!data.readBit()) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        this.n = data.readBits(6);
        int bits3 = data.readBits(4);
        int bits4 = data.readBits(3);
        if (bits3 != 0 || bits4 != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (bits == 0) {
            int position = data.getPosition();
            int iC = c(data);
            data.setPosition(position);
            byte[] bArr = new byte[(iC + 7) / 8];
            data.readBits(bArr, 0, iC);
            Format formatBuild = new Format.Builder().setId(this.e).setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(this.u).setChannelCount(this.t).setSampleRate(this.r).setInitializationData(Collections.singletonList(bArr)).setLanguage(this.a).build();
            if (!formatBuild.equals(this.f)) {
                this.f = formatBuild;
                this.s = 1024000000 / ((long) formatBuild.sampleRate);
                this.d.format(formatBuild);
            }
        } else {
            data.skipBits(((int) a(data)) - c(data));
        }
        d(data);
        boolean bit2 = data.readBit();
        this.p = bit2;
        this.q = 0L;
        if (bit2) {
            if (bits == 1) {
                this.q = a(data);
            } else {
                do {
                    bit = data.readBit();
                    this.q = (this.q << 8) + ((long) data.readBits(8));
                } while (bit);
            }
        }
        if (data.readBit()) {
            data.skipBits(8);
        }
    }

    private void h(int newSize) {
        this.b.reset(newSize);
        this.c.reset(this.b.getData());
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) throws ParserException {
        Assertions.checkStateNotNull(this.d);
        while (data.bytesLeft() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i == 1) {
                    int unsignedByte = data.readUnsignedByte();
                    if ((unsignedByte & 224) == 224) {
                        this.j = unsignedByte;
                        this.g = 2;
                    } else if (unsignedByte != 86) {
                        this.g = 0;
                    }
                } else if (i == 2) {
                    int unsignedByte2 = ((this.j & (-225)) << 8) | data.readUnsignedByte();
                    this.i = unsignedByte2;
                    if (unsignedByte2 > this.b.getData().length) {
                        h(this.i);
                    }
                    this.h = 0;
                    this.g = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(data.bytesLeft(), this.i - this.h);
                    data.readBytes(this.c.data, this.h, iMin);
                    int i2 = this.h + iMin;
                    this.h = i2;
                    if (i2 == this.i) {
                        this.c.setPosition(0);
                        b(this.c);
                        this.g = 0;
                    }
                }
            } else if (data.readUnsignedByte() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        this.d = extractorOutput.track(idGenerator.getTrackId(), 1);
        this.e = idGenerator.getFormatId();
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
        this.g = 0;
        this.l = false;
    }
}

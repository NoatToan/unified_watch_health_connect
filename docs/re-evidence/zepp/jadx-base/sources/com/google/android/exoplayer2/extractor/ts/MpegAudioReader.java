package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MpegAudioReader implements ElementaryStreamReader {
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 4;
    private final ParsableByteArray a;
    private final MpegAudioUtil.Header b;

    @Nullable
    private final String c;
    private TrackOutput d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public MpegAudioReader() {
        this(null);
    }

    private void a(ParsableByteArray source) {
        byte[] data = source.getData();
        int iLimit = source.limit();
        for (int position = source.getPosition(); position < iLimit; position++) {
            boolean z = (data[position] & 255) == 255;
            boolean z2 = this.i && (data[position] & MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT) == 224;
            this.i = z;
            if (z2) {
                source.setPosition(position + 1);
                this.i = false;
                this.a.getData()[1] = data[position];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        source.setPosition(iLimit);
    }

    @RequiresNonNull({"output"})
    private void b(ParsableByteArray source) {
        int iMin = Math.min(source.bytesLeft(), this.k - this.g);
        this.d.sampleData(source, iMin);
        int i = this.g + iMin;
        this.g = i;
        int i2 = this.k;
        if (i < i2) {
            return;
        }
        this.d.sampleMetadata(this.l, 1, i2, 0, null);
        this.l += this.j;
        this.g = 0;
        this.f = 0;
    }

    @RequiresNonNull({"output"})
    private void c(ParsableByteArray source) {
        int iMin = Math.min(source.bytesLeft(), 4 - this.g);
        source.readBytes(this.a.getData(), this.g, iMin);
        int i = this.g + iMin;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.a.setPosition(0);
        if (!this.b.setForHeaderData(this.a.readInt())) {
            this.g = 0;
            this.f = 1;
            return;
        }
        MpegAudioUtil.Header header = this.b;
        this.k = header.frameSize;
        if (!this.h) {
            this.j = (((long) header.samplesPerFrame) * 1000000) / ((long) header.sampleRate);
            this.d.format(new Format.Builder().setId(this.e).setSampleMimeType(this.b.mimeType).setMaxInputSize(4096).setChannelCount(this.b.channels).setSampleRate(this.b.sampleRate).setLanguage(this.c).build());
            this.h = true;
        }
        this.a.setPosition(0);
        this.d.sampleData(this.a, 4);
        this.f = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) {
        Assertions.checkStateNotNull(this.d);
        while (data.bytesLeft() > 0) {
            int i = this.f;
            if (i == 0) {
                a(data);
            } else if (i == 1) {
                c(data);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                b(data);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        this.e = idGenerator.getFormatId();
        this.d = extractorOutput.track(idGenerator.getTrackId(), 1);
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
        this.i = false;
    }

    public MpegAudioReader(@Nullable String language) {
        this.f = 0;
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        this.a = parsableByteArray;
        parsableByteArray.getData()[0] = -1;
        this.b = new MpegAudioUtil.Header();
        this.c = language;
    }
}

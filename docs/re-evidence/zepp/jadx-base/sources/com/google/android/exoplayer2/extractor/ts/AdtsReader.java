package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AdtsReader implements ElementaryStreamReader {
    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 2;
    private static final int D = 8;
    private static final int E = 256;
    private static final int F = 512;
    private static final int G = 768;
    private static final int H = 1024;
    private static final int I = 10;
    private static final int J = 6;
    private static final byte[] K = {73, org.threeten.bp.a.n, HMDisplaySetting.TYPE_VENICE};
    private static final int L = -1;
    private static final String v = "AdtsReader";
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;
    private final boolean a;
    private final ParsableBitArray b;
    private final ParsableByteArray c;

    @Nullable
    private final String d;
    private String e;
    private TrackOutput f;
    private TrackOutput g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private TrackOutput t;
    private long u;

    public AdtsReader(boolean exposeId3) {
        this(exposeId3, null);
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    private void a() {
        Assertions.checkNotNull(this.f);
        Util.castNonNull(this.t);
        Util.castNonNull(this.g);
    }

    private void b(ParsableByteArray buffer) {
        if (buffer.bytesLeft() == 0) {
            return;
        }
        this.b.data[0] = buffer.getData()[buffer.getPosition()];
        this.b.setPosition(2);
        int bits = this.b.readBits(4);
        int i = this.n;
        if (i != -1 && bits != i) {
            j();
            return;
        }
        if (!this.l) {
            this.l = true;
            this.m = this.o;
            this.n = bits;
        }
        m();
    }

    private boolean c(ParsableByteArray pesBuffer, int syncPositionCandidate) {
        pesBuffer.setPosition(syncPositionCandidate + 1);
        if (!p(pesBuffer, this.b.data, 1)) {
            return false;
        }
        this.b.setPosition(4);
        int bits = this.b.readBits(1);
        int i = this.m;
        if (i != -1 && bits != i) {
            return false;
        }
        if (this.n != -1) {
            if (!p(pesBuffer, this.b.data, 1)) {
                return true;
            }
            this.b.setPosition(2);
            if (this.b.readBits(4) != this.n) {
                return false;
            }
            pesBuffer.setPosition(syncPositionCandidate + 2);
        }
        if (!p(pesBuffer, this.b.data, 4)) {
            return true;
        }
        this.b.setPosition(14);
        int bits2 = this.b.readBits(13);
        if (bits2 < 7) {
            return false;
        }
        byte[] data = pesBuffer.getData();
        int iLimit = pesBuffer.limit();
        int i2 = syncPositionCandidate + bits2;
        if (i2 >= iLimit) {
            return true;
        }
        if (data[i2] == -1) {
            int i3 = i2 + 1;
            if (i3 == iLimit) {
                return true;
            }
            return f((byte) -1, data[i3]) && ((data[i3] & 8) >> 3) == bits;
        }
        if (data[i2] != 73) {
            return false;
        }
        int i4 = i2 + 1;
        if (i4 == iLimit) {
            return true;
        }
        if (data[i4] != 68) {
            return false;
        }
        int i5 = i2 + 2;
        return i5 == iLimit || data[i5] == 51;
    }

    private boolean d(ParsableByteArray source, byte[] target, int targetLength) {
        int iMin = Math.min(source.bytesLeft(), targetLength - this.i);
        source.readBytes(target, this.i, iMin);
        int i = this.i + iMin;
        this.i = i;
        return i == targetLength;
    }

    private void e(ParsableByteArray pesBuffer) {
        byte[] data = pesBuffer.getData();
        int position = pesBuffer.getPosition();
        int iLimit = pesBuffer.limit();
        while (position < iLimit) {
            int i = position + 1;
            int i2 = data[position] & 255;
            if (this.j == 512 && f((byte) -1, (byte) i2) && (this.l || c(pesBuffer, i - 2))) {
                this.o = (i2 & 8) >> 3;
                this.k = (i2 & 1) == 0;
                if (this.l) {
                    m();
                } else {
                    k();
                }
                pesBuffer.setPosition(i);
                return;
            }
            int i3 = this.j;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.j = 768;
            } else if (i4 == 511) {
                this.j = 512;
            } else if (i4 == 836) {
                this.j = 1024;
            } else if (i4 == 1075) {
                n();
                pesBuffer.setPosition(i);
                return;
            } else if (i3 != 256) {
                this.j = 256;
                i--;
            }
            position = i;
        }
        pesBuffer.setPosition(position);
    }

    private boolean f(byte firstByte, byte secondByte) {
        return isAdtsSyncWord(((firstByte & 255) << 8) | (secondByte & 255));
    }

    @RequiresNonNull({"output"})
    private void g() throws ParserException {
        this.b.setPosition(0);
        if (this.p) {
            this.b.skipBits(10);
        } else {
            int bits = this.b.readBits(2) + 1;
            if (bits != 2) {
                StringBuilder sb = new StringBuilder(61);
                sb.append("Detected audio object type: ");
                sb.append(bits);
                sb.append(", but assuming AAC LC.");
                Log.w(v, sb.toString());
                bits = 2;
            }
            this.b.skipBits(5);
            byte[] bArrBuildAudioSpecificConfig = AacUtil.buildAudioSpecificConfig(bits, this.n, this.b.readBits(3));
            AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArrBuildAudioSpecificConfig);
            Format formatBuild = new Format.Builder().setId(this.e).setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(audioSpecificConfig.codecs).setChannelCount(audioSpecificConfig.channelCount).setSampleRate(audioSpecificConfig.sampleRateHz).setInitializationData(Collections.singletonList(bArrBuildAudioSpecificConfig)).setLanguage(this.d).build();
            this.q = 1024000000 / ((long) formatBuild.sampleRate);
            this.f.format(formatBuild);
            this.p = true;
        }
        this.b.skipBits(4);
        int bits2 = (this.b.readBits(13) - 2) - 5;
        if (this.k) {
            bits2 -= 2;
        }
        o(this.f, this.q, 0, bits2);
    }

    @RequiresNonNull({"id3Output"})
    private void h() {
        this.g.sampleData(this.c, 10);
        this.c.setPosition(6);
        o(this.g, 0L, 10, this.c.readSynchSafeInt() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    private void i(ParsableByteArray data) {
        int iMin = Math.min(data.bytesLeft(), this.r - this.i);
        this.t.sampleData(data, iMin);
        int i = this.i + iMin;
        this.i = i;
        int i2 = this.r;
        if (i == i2) {
            this.t.sampleMetadata(this.s, 1, i2, 0, null);
            this.s += this.u;
            l();
        }
    }

    public static boolean isAdtsSyncWord(int candidateSyncWord) {
        return (candidateSyncWord & 65526) == 65520;
    }

    private void j() {
        this.l = false;
        l();
    }

    private void k() {
        this.h = 1;
        this.i = 0;
    }

    private void l() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    private void m() {
        this.h = 3;
        this.i = 0;
    }

    private void n() {
        this.h = 2;
        this.i = K.length;
        this.r = 0;
        this.c.setPosition(0);
    }

    private void o(TrackOutput outputToUse, long currentSampleDuration, int priorReadBytes, int sampleSize) {
        this.h = 4;
        this.i = priorReadBytes;
        this.t = outputToUse;
        this.u = currentSampleDuration;
        this.r = sampleSize;
    }

    private boolean p(ParsableByteArray source, byte[] target, int targetLength) {
        if (source.bytesLeft() < targetLength) {
            return false;
        }
        source.readBytes(target, 0, targetLength);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) throws ParserException {
        a();
        while (data.bytesLeft() > 0) {
            int i = this.h;
            if (i == 0) {
                e(data);
            } else if (i == 1) {
                b(data);
            } else if (i != 2) {
                if (i == 3) {
                    if (d(data, this.b.data, this.k ? 7 : 5)) {
                        g();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    i(data);
                }
            } else if (d(data, this.c.getData(), 10)) {
                h();
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        this.e = idGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(idGenerator.getTrackId(), 1);
        this.f = trackOutputTrack;
        this.t = trackOutputTrack;
        if (!this.a) {
            this.g = new DummyTrackOutput();
            return;
        }
        idGenerator.generateNewId();
        TrackOutput trackOutputTrack2 = extractorOutput.track(idGenerator.getTrackId(), 5);
        this.g = trackOutputTrack2;
        trackOutputTrack2.format(new Format.Builder().setId(idGenerator.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }

    public long getSampleDurationUs() {
        return this.q;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long pesTimeUs, int flags) {
        this.s = pesTimeUs;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        j();
    }

    public AdtsReader(boolean exposeId3, @Nullable String language) {
        this.b = new ParsableBitArray(new byte[7]);
        this.c = new ParsableByteArray(Arrays.copyOf(K, 10));
        l();
        this.m = -1;
        this.n = -1;
        this.q = C.TIME_UNSET;
        this.a = exposeId3;
        this.d = language;
    }
}

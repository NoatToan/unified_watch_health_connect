package com.google.android.exoplayer2.extractor.mp3;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.Id3Peeker;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Mp3Extractor implements Extractor {
    private static final int A = 1231971951;
    private static final int B = 1447187017;
    private static final int C = 0;
    public static final int FLAG_DISABLE_ID3_METADATA = 4;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 2;
    private static final int v = 131072;
    private static final int w = 32768;
    private static final int x = 10;
    private static final int y = -128000;
    private static final int z = 1483304551;
    private final int a;
    private final long b;
    private final ParsableByteArray c;
    private final MpegAudioUtil.Header d;
    private final GaplessInfoHolder e;
    private final Id3Peeker f;
    private final TrackOutput g;
    private ExtractorOutput h;
    private TrackOutput i;
    private TrackOutput j;
    private int k;

    @Nullable
    private Metadata l;
    private long m;
    private long n;
    private long o;
    private int p;
    private Seeker q;
    private boolean r;
    private boolean s;
    private long t;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: y85
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp3Extractor.j();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    private static final Id3Decoder.FramePredicate u = new Id3Decoder.FramePredicate() { // from class: z85
        @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return Mp3Extractor.k(i, i2, i3, i4, i5);
        }
    };

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp3Extractor() {
        this(0);
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void c() {
        Assertions.checkStateNotNull(this.i);
        Util.castNonNull(this.h);
    }

    private Seeker d(ExtractorInput input) throws IOException {
        long jG;
        long j;
        long durationUs;
        long dataEndPosition;
        Seeker seekerM = m(input);
        c cVarL = l(this.l, input.getPosition());
        if (this.r) {
            return new Seeker.UnseekableSeeker();
        }
        if ((this.a & 2) != 0) {
            if (cVarL != null) {
                durationUs = cVarL.getDurationUs();
                dataEndPosition = cVarL.getDataEndPosition();
            } else {
                if (seekerM != null) {
                    durationUs = seekerM.getDurationUs();
                    dataEndPosition = seekerM.getDataEndPosition();
                } else {
                    jG = g(this.l);
                    j = -1;
                }
                seekerM = new b(jG, input.getPosition(), j);
            }
            j = dataEndPosition;
            jG = durationUs;
            seekerM = new b(jG, input.getPosition(), j);
        } else if (cVarL != null) {
            seekerM = cVarL;
        } else if (seekerM == null) {
            seekerM = null;
        }
        return (seekerM == null || !(seekerM.isSeekable() || (this.a & 1) == 0)) ? f(input) : seekerM;
    }

    private long e(long samplesRead) {
        return this.m + ((samplesRead * 1000000) / ((long) this.d.sampleRate));
    }

    private Seeker f(ExtractorInput input) throws IOException {
        input.peekFully(this.c.getData(), 0, 4);
        this.c.setPosition(0);
        this.d.setForHeaderData(this.c.readInt());
        return new a(input.getLength(), input.getPosition(), this.d);
    }

    private static long g(@Nullable Metadata metadata) {
        if (metadata == null) {
            return C.TIME_UNSET;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.id.equals("TLEN")) {
                    return C.msToUs(Long.parseLong(textInformationFrame.value));
                }
            }
        }
        return C.TIME_UNSET;
    }

    private static int h(ParsableByteArray frame, int xingBase) {
        if (frame.limit() >= xingBase + 4) {
            frame.setPosition(xingBase);
            int i = frame.readInt();
            if (i == z || i == A) {
                return i;
            }
        }
        if (frame.limit() < 40) {
            return 0;
        }
        frame.setPosition(36);
        if (frame.readInt() == B) {
            return B;
        }
        return 0;
    }

    private static boolean i(int headerA, long headerB) {
        return ((long) (headerA & y)) == (headerB & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] j() {
        return new Extractor[]{new Mp3Extractor()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean k(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Nullable
    private static c l(@Nullable Metadata metadata, long firstFramePosition) {
        if (metadata == null) {
            return null;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof MlltFrame) {
                return c.a(firstFramePosition, (MlltFrame) entry, g(metadata));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    @Nullable
    private Seeker m(ExtractorInput input) throws IOException {
        int i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.d.frameSize);
        input.peekFully(parsableByteArray.getData(), 0, this.d.frameSize);
        MpegAudioUtil.Header header = this.d;
        if ((header.version & 1) != 0) {
            if (header.channels != 1) {
                i = 36;
            } else {
                i = 21;
            }
        } else if (header.channels != 1) {
            i = 21;
        } else {
            i = 13;
        }
        int iH = h(parsableByteArray, i);
        if (iH != z && iH != A) {
            if (iH != B) {
                input.resetPeekPosition();
                return null;
            }
            d dVarA = d.a(input.getLength(), input.getPosition(), this.d, parsableByteArray);
            input.skipFully(this.d.frameSize);
            return dVarA;
        }
        e eVarA = e.a(input.getLength(), input.getPosition(), this.d, parsableByteArray);
        if (eVarA != null && !this.e.hasGaplessInfo()) {
            input.resetPeekPosition();
            input.advancePeekPosition(i + 141);
            input.peekFully(this.c.getData(), 0, 3);
            this.c.setPosition(0);
            this.e.setFromXingHeaderValue(this.c.readUnsignedInt24());
        }
        input.skipFully(this.d.frameSize);
        return (eVarA == null || eVarA.isSeekable() || iH != A) ? eVarA : f(input);
    }

    private boolean n(ExtractorInput extractorInput) throws IOException {
        Seeker seeker = this.q;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1 && extractorInput.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.peekFully(this.c.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int o(ExtractorInput input) throws IOException {
        if (this.k == 0) {
            try {
                q(input, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.q == null) {
            Seeker seekerD = d(input);
            this.q = seekerD;
            this.h.seekMap(seekerD);
            this.j.format(new Format.Builder().setSampleMimeType(this.d.mimeType).setMaxInputSize(4096).setChannelCount(this.d.channels).setSampleRate(this.d.sampleRate).setEncoderDelay(this.e.encoderDelay).setEncoderPadding(this.e.encoderPadding).setMetadata((this.a & 4) != 0 ? null : this.l).build());
            this.o = input.getPosition();
        } else if (this.o != 0) {
            long position = input.getPosition();
            long j = this.o;
            if (position < j) {
                input.skipFully((int) (j - position));
            }
        }
        return p(input);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int p(ExtractorInput extractorInput) throws IOException {
        if (this.p == 0) {
            extractorInput.resetPeekPosition();
            if (n(extractorInput)) {
                return -1;
            }
            this.c.setPosition(0);
            int i = this.c.readInt();
            if (!i(i, this.k) || MpegAudioUtil.getFrameSize(i) == -1) {
                extractorInput.skipFully(1);
                this.k = 0;
                return 0;
            }
            this.d.setForHeaderData(i);
            if (this.m == C.TIME_UNSET) {
                this.m = this.q.getTimeUs(extractorInput.getPosition());
                if (this.b != C.TIME_UNSET) {
                    this.m += this.b - this.q.getTimeUs(0L);
                }
            }
            MpegAudioUtil.Header header = this.d;
            this.p = header.frameSize;
            Seeker seeker = this.q;
            if (seeker instanceof b) {
                b bVar = (b) seeker;
                bVar.b(e(this.n + ((long) header.samplesPerFrame)), extractorInput.getPosition() + ((long) this.d.frameSize));
                if (this.s && bVar.a(this.t)) {
                    this.s = false;
                    this.j = this.i;
                }
            }
        }
        int iSampleData = this.j.sampleData((DataReader) extractorInput, this.p, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i2 = this.p - iSampleData;
        this.p = i2;
        if (i2 > 0) {
            return 0;
        }
        this.j.sampleMetadata(e(this.n), 1, this.d.frameSize, 0, null);
        this.n += (long) this.d.samplesPerFrame;
        this.p = 0;
        return 0;
    }

    private boolean q(ExtractorInput input, boolean sniffing) throws IOException {
        int i;
        int peekPosition;
        int frameSize;
        int i2 = sniffing ? 32768 : 131072;
        input.resetPeekPosition();
        if (input.getPosition() == 0) {
            Metadata metadataPeekId3Data = this.f.peekId3Data(input, (this.a & 4) == 0 ? null : u);
            this.l = metadataPeekId3Data;
            if (metadataPeekId3Data != null) {
                this.e.setFromMetadata(metadataPeekId3Data);
            }
            peekPosition = (int) input.getPeekPosition();
            if (!sniffing) {
                input.skipFully(peekPosition);
            }
            i = 0;
        } else {
            i = 0;
            peekPosition = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (n(input)) {
                if (i3 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.c.setPosition(0);
            int i5 = this.c.readInt();
            if ((i == 0 || i(i5, i)) && (frameSize = MpegAudioUtil.getFrameSize(i5)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.d.setForHeaderData(i5);
                    i = i5;
                }
                input.advancePeekPosition(frameSize - 4);
            } else {
                int i6 = i4 + 1;
                if (i4 == i2) {
                    if (sniffing) {
                        return false;
                    }
                    throw ParserException.createForMalformedContainer("Searched too many bytes.", null);
                }
                if (sniffing) {
                    input.resetPeekPosition();
                    input.advancePeekPosition(peekPosition + i6);
                } else {
                    input.skipFully(1);
                }
                i4 = i6;
                i = 0;
                i3 = 0;
            }
        }
        if (sniffing) {
            input.skipFully(peekPosition + i4);
        } else {
            input.resetPeekPosition();
        }
        this.k = i;
        return true;
    }

    public void disableSeeking() {
        this.r = true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.h = output;
        TrackOutput trackOutputTrack = output.track(0, 1);
        this.i = trackOutputTrack;
        this.j = trackOutputTrack;
        this.h.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        c();
        int iO = o(input);
        if (iO == -1 && (this.q instanceof b)) {
            long jE = e(this.n);
            if (this.q.getDurationUs() != jE) {
                ((b) this.q).c(jE);
                this.h.seekMap(this.q);
            }
        }
        return iO;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        this.k = 0;
        this.m = C.TIME_UNSET;
        this.n = 0L;
        this.p = 0;
        this.t = timeUs;
        Seeker seeker = this.q;
        if (!(seeker instanceof b) || ((b) seeker).a(timeUs)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        return q(input, true);
    }

    public Mp3Extractor(int flags) {
        this(flags, C.TIME_UNSET);
    }

    public Mp3Extractor(int flags, long forcedFirstSampleTimestampUs) {
        this.a = flags;
        this.b = forcedFirstSampleTimestampUs;
        this.c = new ParsableByteArray(10);
        this.d = new MpegAudioUtil.Header();
        this.e = new GaplessInfoHolder();
        this.m = C.TIME_UNSET;
        this.f = new Id3Peeker();
        DummyTrackOutput dummyTrackOutput = new DummyTrackOutput();
        this.g = dummyTrackOutput;
        this.j = dummyTrackOutput;
    }
}

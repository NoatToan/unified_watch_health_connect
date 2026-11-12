package com.google.android.exoplayer2.extractor.wav;

import android.net.Uri;
import android.util.Pair;
import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.baseflow.permissionhandler.m;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: vm8
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return WavExtractor.c();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    private static final int f = 10;
    private ExtractorOutput a;
    private TrackOutput b;
    private b c;
    private int d = -1;
    private long e = -1;

    public static final class a implements b {
        private static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, DataTypeSource.SPORT_TYPE_CHESS, 190, m.c, FTPCodes.USER_LOGGED_IN, PageType.PAGE_SHORTCUT, 279, 307, 337, 371, 408, 449, 494, StageEnum.APP_FILE_SYSTEM_ERASE_START, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ExtractorOutput a;
        private final TrackOutput b;
        private final com.google.android.exoplayer2.extractor.wav.a c;
        private final int d;
        private final byte[] e;
        private final ParsableByteArray f;
        private final int g;
        private final Format h;
        private int i;
        private long j;
        private int k;
        private long l;

        public a(ExtractorOutput extractorOutput, TrackOutput trackOutput, com.google.android.exoplayer2.extractor.wav.a header) throws ParserException {
            this.a = extractorOutput;
            this.b = trackOutput;
            this.c = header;
            int iMax = Math.max(1, header.c / 10);
            this.g = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(header.g);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.d = littleEndianUnsignedShort;
            int i = header.b;
            int i2 = (((header.e - (i * 4)) * 8) / (header.f * i)) + 1;
            if (littleEndianUnsignedShort == i2) {
                int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
                this.e = new byte[header.e * iCeilDivide];
                this.f = new ParsableByteArray(iCeilDivide * h(littleEndianUnsignedShort, i));
                int i3 = ((header.c * header.e) * 8) / littleEndianUnsignedShort;
                this.h = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(h(iMax, i)).setChannelCount(header.b).setSampleRate(header.c).setPcmEncoding(2).build();
                return;
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(littleEndianUnsignedShort);
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }

        private void d(byte[] input, int blockCount, ParsableByteArray output) {
            for (int i = 0; i < blockCount; i++) {
                for (int i2 = 0; i2 < this.c.b; i2++) {
                    e(input, i, i2, output.getData());
                }
            }
            int iG = g(this.d * blockCount);
            output.setPosition(0);
            output.setLimit(iG);
        }

        private void e(byte[] input, int blockIndex, int channelIndex, byte[] output) {
            com.google.android.exoplayer2.extractor.wav.a aVar = this.c;
            int i = aVar.e;
            int i2 = aVar.b;
            int i3 = (blockIndex * i) + (channelIndex * 4);
            int i4 = (i2 * 4) + i3;
            int i5 = (i / i2) - 4;
            int iConstrainValue = (short) (((input[i3 + 1] & 255) << 8) | (input[i3] & 255));
            int iMin = Math.min(input[i3 + 2] & 255, 88);
            int i6 = n[iMin];
            int i7 = ((blockIndex * this.d * i2) + channelIndex) * 2;
            output[i7] = (byte) (iConstrainValue & 255);
            output[i7 + 1] = (byte) (iConstrainValue >> 8);
            for (int i8 = 0; i8 < i5 * 2; i8++) {
                int i9 = input[((i8 / 8) * i2 * 4) + i4 + ((i8 / 2) % 4)] & 255;
                int i10 = i8 % 2 == 0 ? i9 & 15 : i9 >> 4;
                int i11 = ((((i10 & 7) * 2) + 1) * i6) >> 3;
                if ((i10 & 8) != 0) {
                    i11 = -i11;
                }
                iConstrainValue = Util.constrainValue(iConstrainValue + i11, -32768, 32767);
                i7 += i2 * 2;
                output[i7] = (byte) (iConstrainValue & 255);
                output[i7 + 1] = (byte) (iConstrainValue >> 8);
                int i12 = iMin + m[i10];
                int[] iArr = n;
                iMin = Util.constrainValue(i12, 0, iArr.length - 1);
                i6 = iArr[iMin];
            }
        }

        private int f(int bytes) {
            return bytes / (this.c.b * 2);
        }

        private int g(int frames) {
            return h(frames, this.c.b);
        }

        private static int h(int frames, int numChannels) {
            return frames * 2 * numChannels;
        }

        private void i(int sampleFrames) {
            long jScaleLargeTimestamp = this.j + Util.scaleLargeTimestamp(this.l, 1000000L, this.c.c);
            int iG = g(sampleFrames);
            this.b.sampleMetadata(jScaleLargeTimestamp, 1, iG, this.k - iG, null);
            this.l += (long) sampleFrames;
            this.k -= iG;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0039 A[LOOP:0: B:6:0x001f->B:12:0x0039, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0021  */
        /* JADX WARN: Code duplicated, block: B:9:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:4:0x001c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.b
        public boolean a(com.google.android.exoplayer2.extractor.ExtractorInput r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.g
                int r1 = r6.k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.d
                int r0 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r1)
                com.google.android.exoplayer2.extractor.wav.a r1 = r6.c
                int r1 = r1.e
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                if (r2 != 0) goto L3f
                int r3 = r6.i
                if (r3 >= r0) goto L3f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.e
                int r5 = r6.i
                int r3 = r7.read(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.i
                int r4 = r4 + r3
                r6.i = r4
                goto L1f
            L3f:
                int r7 = r6.i
                com.google.android.exoplayer2.extractor.wav.a r8 = r6.c
                int r8 = r8.e
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.e
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.f
                r6.d(r8, r7, r9)
                int r8 = r6.i
                com.google.android.exoplayer2.extractor.wav.a r9 = r6.c
                int r9 = r9.e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.i = r8
                com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.f
                int r7 = r7.limit()
                com.google.android.exoplayer2.extractor.TrackOutput r8 = r6.b
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.f
                r8.sampleData(r9, r7)
                int r8 = r6.k
                int r8 = r8 + r7
                r6.k = r8
                int r7 = r6.f(r8)
                int r8 = r6.g
                if (r7 < r8) goto L77
                r6.i(r8)
            L77:
                if (r2 == 0) goto L84
                int r7 = r6.k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L84
                r6.i(r7)
            L84:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.WavExtractor.a.a(com.google.android.exoplayer2.extractor.ExtractorInput, long):boolean");
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.b
        public void b(int dataStartPosition, long dataEndPosition) {
            this.a.seekMap(new com.google.android.exoplayer2.extractor.wav.c(this.c, this.d, dataStartPosition, dataEndPosition));
            this.b.format(this.h);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.b
        public void c(long timeUs) {
            this.i = 0;
            this.j = timeUs;
            this.k = 0;
            this.l = 0L;
        }
    }

    public interface b {
        boolean a(ExtractorInput input, long bytesLeft) throws IOException;

        void b(int dataStartPosition, long dataEndPosition) throws ParserException;

        void c(long timeUs);
    }

    public static final class c implements b {
        private final ExtractorOutput a;
        private final TrackOutput b;
        private final com.google.android.exoplayer2.extractor.wav.a c;
        private final Format d;
        private final int e;
        private long f;
        private int g;
        private long h;

        public c(ExtractorOutput extractorOutput, TrackOutput trackOutput, com.google.android.exoplayer2.extractor.wav.a header, String mimeType, int pcmEncoding) throws ParserException {
            this.a = extractorOutput;
            this.b = trackOutput;
            this.c = header;
            int i = (header.b * header.f) / 8;
            int i2 = header.e;
            if (i2 == i) {
                int i3 = header.c;
                int i4 = i3 * i * 8;
                int iMax = Math.max(i, (i3 * i) / 10);
                this.e = iMax;
                this.d = new Format.Builder().setSampleMimeType(mimeType).setAverageBitrate(i4).setPeakBitrate(i4).setMaxInputSize(iMax).setChannelCount(header.b).setSampleRate(header.c).setPcmEncoding(pcmEncoding).build();
                return;
            }
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i);
            sb.append("; got: ");
            sb.append(i2);
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.b
        public boolean a(ExtractorInput input, long bytesLeft) throws IOException {
            int i;
            int i2;
            long j = bytesLeft;
            while (j > 0 && (i = this.g) < (i2 = this.e)) {
                int iSampleData = this.b.sampleData((DataReader) input, (int) Math.min(i2 - i, j), true);
                if (iSampleData == -1) {
                    j = 0;
                } else {
                    this.g += iSampleData;
                    j -= (long) iSampleData;
                }
            }
            com.google.android.exoplayer2.extractor.wav.a aVar = this.c;
            int i3 = aVar.e;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long jScaleLargeTimestamp = this.f + Util.scaleLargeTimestamp(this.h, 1000000L, aVar.c);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.sampleMetadata(jScaleLargeTimestamp, 1, i5, i6, null);
                this.h += (long) i4;
                this.g = i6;
            }
            return j <= 0;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.b
        public void b(int dataStartPosition, long dataEndPosition) {
            this.a.seekMap(new com.google.android.exoplayer2.extractor.wav.c(this.c, 1, dataStartPosition, dataEndPosition));
            this.b.format(this.d);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.b
        public void c(long timeUs) {
            this.f = timeUs;
            this.g = 0;
            this.h = 0L;
        }
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void b() {
        Assertions.checkStateNotNull(this.b);
        Util.castNonNull(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] c() {
        return new Extractor[]{new WavExtractor()};
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.a = output;
        this.b = output.track(0, 1);
        output.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        b();
        if (this.c == null) {
            com.google.android.exoplayer2.extractor.wav.a aVarA = com.google.android.exoplayer2.extractor.wav.b.a(input);
            if (aVarA == null) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav header.", null);
            }
            int i = aVarA.a;
            if (i == 17) {
                this.c = new a(this.a, this.b, aVarA);
            } else if (i == 6) {
                this.c = new c(this.a, this.b, aVarA, MimeTypes.AUDIO_ALAW, -1);
            } else if (i == 7) {
                this.c = new c(this.a, this.b, aVarA, MimeTypes.AUDIO_MLAW, -1);
            } else {
                int pcmEncodingForType = WavUtil.getPcmEncodingForType(i, aVarA.f);
                if (pcmEncodingForType == 0) {
                    int i2 = aVarA.a;
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("Unsupported WAV format type: ");
                    sb.append(i2);
                    throw ParserException.createForUnsupportedContainerFeature(sb.toString());
                }
                this.c = new c(this.a, this.b, aVarA, MimeTypes.AUDIO_RAW, pcmEncodingForType);
            }
        }
        if (this.d == -1) {
            Pair<Long, Long> pairB = com.google.android.exoplayer2.extractor.wav.b.b(input);
            this.d = ((Long) pairB.first).intValue();
            long jLongValue = ((Long) pairB.second).longValue();
            this.e = jLongValue;
            this.c.b(this.d, jLongValue);
        } else if (input.getPosition() == 0) {
            input.skipFully(this.d);
        }
        Assertions.checkState(this.e != -1);
        return this.c.a(input, this.e - input.getPosition()) ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.c(timeUs);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        return com.google.android.exoplayer2.extractor.wav.b.a(input) != null;
    }
}

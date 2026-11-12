package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class H265Reader implements ElementaryStreamReader {
    private static final String o = "H265Reader";
    private static final int p = 9;
    private static final int q = 16;
    private static final int r = 21;
    private static final int s = 32;
    private static final int t = 33;
    private static final int u = 34;
    private static final int v = 35;
    private static final int w = 39;
    private static final int x = 40;
    private final SeiReader a;
    private String b;
    private TrackOutput c;
    private a d;
    private boolean e;
    private long l;
    private long m;
    private final boolean[] f = new boolean[3];
    private final com.google.android.exoplayer2.extractor.ts.a g = new com.google.android.exoplayer2.extractor.ts.a(32, 128);
    private final com.google.android.exoplayer2.extractor.ts.a h = new com.google.android.exoplayer2.extractor.ts.a(33, 128);
    private final com.google.android.exoplayer2.extractor.ts.a i = new com.google.android.exoplayer2.extractor.ts.a(34, 128);
    private final com.google.android.exoplayer2.extractor.ts.a j = new com.google.android.exoplayer2.extractor.ts.a(39, 128);
    private final com.google.android.exoplayer2.extractor.ts.a k = new com.google.android.exoplayer2.extractor.ts.a(40, 128);
    private final ParsableByteArray n = new ParsableByteArray();

    public static final class a {
        private static final int n = 2;
        private final TrackOutput a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(TrackOutput output) {
            this.a = output;
        }

        private static boolean b(int nalUnitType) {
            return (32 <= nalUnitType && nalUnitType <= 35) || nalUnitType == 39;
        }

        private static boolean c(int nalUnitType) {
            return nalUnitType < 32 || nalUnitType == 40;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void d(int i) {
            boolean z = this.m;
            this.a.sampleMetadata(this.l, z ? 1 : 0, (int) (this.b - this.k), i, null);
        }

        public void a(long position, int offset, boolean hasOutputFormat) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (hasOutputFormat && this.i) {
                    d(offset + ((int) (position - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        public void e(byte[] data, int offset, int limit) {
            if (this.f) {
                int i = this.d;
                int i2 = (offset + 2) - i;
                if (i2 >= limit) {
                    this.d = i + (limit - offset);
                } else {
                    this.g = (data[i2] & 128) != 0;
                    this.f = false;
                }
            }
        }

        public void f() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void g(long position, int offset, int nalUnitType, long pesTimeUs, boolean hasOutputFormat) {
            this.g = false;
            this.h = false;
            this.e = pesTimeUs;
            this.d = 0;
            this.b = position;
            if (!c(nalUnitType)) {
                if (this.i && !this.j) {
                    if (hasOutputFormat) {
                        d(offset);
                    }
                    this.i = false;
                }
                if (b(nalUnitType)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z = nalUnitType >= 16 && nalUnitType <= 21;
            this.c = z;
            this.f = z || nalUnitType <= 9;
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.a = seiReader;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void a() {
        Assertions.checkStateNotNull(this.c);
        Util.castNonNull(this.d);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void b(long position, int offset, int discardPadding, long pesTimeUs) {
        this.d.a(position, offset, this.e);
        if (!this.e) {
            this.g.b(discardPadding);
            this.h.b(discardPadding);
            this.i.b(discardPadding);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.format(d(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(discardPadding)) {
            com.google.android.exoplayer2.extractor.ts.a aVar = this.j;
            this.n.reset(this.j.d, NalUnitUtil.unescapeStream(aVar.d, aVar.e));
            this.n.skipBytes(5);
            this.a.consume(pesTimeUs, this.n);
        }
        if (this.k.b(discardPadding)) {
            com.google.android.exoplayer2.extractor.ts.a aVar2 = this.k;
            this.n.reset(this.k.d, NalUnitUtil.unescapeStream(aVar2.d, aVar2.e));
            this.n.skipBytes(5);
            this.a.consume(pesTimeUs, this.n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void c(byte[] dataArray, int offset, int limit) {
        this.d.e(dataArray, offset, limit);
        if (!this.e) {
            this.g.a(dataArray, offset, limit);
            this.h.a(dataArray, offset, limit);
            this.i.a(dataArray, offset, limit);
        }
        this.j.a(dataArray, offset, limit);
        this.k.a(dataArray, offset, limit);
    }

    private static Format d(@Nullable String formatId, com.google.android.exoplayer2.extractor.ts.a vps, com.google.android.exoplayer2.extractor.ts.a sps, com.google.android.exoplayer2.extractor.ts.a pps) {
        int i = vps.e;
        byte[] bArr = new byte[sps.e + i + pps.e];
        System.arraycopy(vps.d, 0, bArr, 0, i);
        System.arraycopy(sps.d, 0, bArr, vps.e, sps.e);
        System.arraycopy(pps.d, 0, bArr, vps.e + sps.e, pps.e);
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(sps.d, 0, sps.e);
        parsableNalUnitBitArray.skipBits(44);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        parsableNalUnitBitArray.skipBits(88);
        parsableNalUnitBitArray.skipBits(8);
        int i2 = 0;
        for (int i3 = 0; i3 < bits; i3++) {
            if (parsableNalUnitBitArray.readBit()) {
                i2 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i2 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i2);
        if (bits > 0) {
            parsableNalUnitBitArray.skipBits((8 - bits) * 2);
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt2 -= ((unsignedExpGolombCodedInt == 1 || unsignedExpGolombCodedInt == 2) ? 2 : 1) * (unsignedExpGolombCodedInt4 + unsignedExpGolombCodedInt5);
            unsignedExpGolombCodedInt3 -= (unsignedExpGolombCodedInt == 1 ? 2 : 1) * (unsignedExpGolombCodedInt6 + unsignedExpGolombCodedInt7);
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i4 = parsableNalUnitBitArray.readBit() ? 0 : bits; i4 <= bits; i4++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            e(parsableNalUnitBitArray);
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        f(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            for (int i5 = 0; i5 < parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(); i5++) {
                parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt8 + 4 + 1);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits2 = parsableNalUnitBitArray.readBits(8);
                if (bits2 == 255) {
                    int bits3 = parsableNalUnitBitArray.readBits(16);
                    int bits4 = parsableNalUnitBitArray.readBits(16);
                    if (bits3 != 0 && bits4 != 0) {
                        f = bits3 / bits4;
                    }
                } else {
                    float[] fArr = NalUnitUtil.ASPECT_RATIO_IDC_VALUES;
                    if (bits2 < fArr.length) {
                        f = fArr[bits2];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(bits2);
                        Log.w(o, sb.toString());
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(4);
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(24);
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                unsignedExpGolombCodedInt3 *= 2;
            }
        }
        parsableNalUnitBitArray.reset(sps.d, 0, sps.e);
        parsableNalUnitBitArray.skipBits(24);
        return new Format.Builder().setId(formatId).setSampleMimeType(MimeTypes.VIDEO_H265).setCodecs(CodecSpecificDataUtil.buildHevcCodecStringFromSps(parsableNalUnitBitArray)).setWidth(unsignedExpGolombCodedInt2).setHeight(unsignedExpGolombCodedInt3).setPixelWidthHeightRatio(f).setInitializationData(Collections.singletonList(bArr)).build();
    }

    private static void e(ParsableNalUnitBitArray bitArray) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (bitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        bitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        bitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    bitArray.readUnsignedExpGolombCodedInt();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void f(ParsableNalUnitBitArray bitArray) {
        int unsignedExpGolombCodedInt = bitArray.readUnsignedExpGolombCodedInt();
        boolean bit = false;
        int i = 0;
        for (int i2 = 0; i2 < unsignedExpGolombCodedInt; i2++) {
            if (i2 != 0) {
                bit = bitArray.readBit();
            }
            if (bit) {
                bitArray.skipBit();
                bitArray.readUnsignedExpGolombCodedInt();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (bitArray.readBit()) {
                        bitArray.skipBit();
                    }
                }
            } else {
                int unsignedExpGolombCodedInt2 = bitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = bitArray.readUnsignedExpGolombCodedInt();
                int i4 = unsignedExpGolombCodedInt2 + unsignedExpGolombCodedInt3;
                for (int i5 = 0; i5 < unsignedExpGolombCodedInt2; i5++) {
                    bitArray.readUnsignedExpGolombCodedInt();
                    bitArray.skipBit();
                }
                for (int i6 = 0; i6 < unsignedExpGolombCodedInt3; i6++) {
                    bitArray.readUnsignedExpGolombCodedInt();
                    bitArray.skipBit();
                }
                i = i4;
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void g(long position, int offset, int nalUnitType, long pesTimeUs) {
        this.d.g(position, offset, nalUnitType, pesTimeUs, this.e);
        if (!this.e) {
            this.g.e(nalUnitType);
            this.h.e(nalUnitType);
            this.i.e(nalUnitType);
        }
        this.j.e(nalUnitType);
        this.k.e(nalUnitType);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) {
        a();
        while (data.bytesLeft() > 0) {
            int position = data.getPosition();
            int iLimit = data.limit();
            byte[] data2 = data.getData();
            this.l += (long) data.bytesLeft();
            this.c.sampleData(data, data.bytesLeft());
            while (position < iLimit) {
                int iFindNalUnit = NalUnitUtil.findNalUnit(data2, position, iLimit, this.f);
                if (iFindNalUnit == iLimit) {
                    c(data2, position, iLimit);
                    return;
                }
                int h265NalUnitType = NalUnitUtil.getH265NalUnitType(data2, iFindNalUnit);
                int i = iFindNalUnit - position;
                if (i > 0) {
                    c(data2, position, iFindNalUnit);
                }
                int i2 = iLimit - iFindNalUnit;
                long j = this.l - ((long) i2);
                b(j, i2, i < 0 ? -i : 0, this.m);
                g(j, i2, h265NalUnitType, this.m);
                position = iFindNalUnit + 3;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        this.b = idGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(idGenerator.getTrackId(), 2);
        this.c = trackOutputTrack;
        this.d = new a(trackOutputTrack);
        this.a.createTracks(extractorOutput, idGenerator);
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
        this.l = 0L;
        NalUnitUtil.clearPrefixFlags(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        a aVar = this.d;
        if (aVar != null) {
            aVar.f();
        }
    }
}

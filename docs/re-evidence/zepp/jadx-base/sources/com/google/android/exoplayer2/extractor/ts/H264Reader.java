package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class H264Reader implements ElementaryStreamReader {
    private static final int p = 6;
    private static final int q = 7;
    private static final int r = 8;
    private final SeiReader a;
    private final boolean b;
    private final boolean c;
    private long g;
    private String i;
    private TrackOutput j;
    private b k;
    private boolean l;
    private long m;
    private boolean n;
    private final boolean[] h = new boolean[3];
    private final com.google.android.exoplayer2.extractor.ts.a d = new com.google.android.exoplayer2.extractor.ts.a(7, 128);
    private final com.google.android.exoplayer2.extractor.ts.a e = new com.google.android.exoplayer2.extractor.ts.a(8, 128);
    private final com.google.android.exoplayer2.extractor.ts.a f = new com.google.android.exoplayer2.extractor.ts.a(6, 128);
    private final ParsableByteArray o = new ParsableByteArray();

    public static final class b {
        private static final int s = 128;
        private static final int t = 1;
        private static final int u = 2;
        private static final int v = 5;
        private static final int w = 9;
        private final TrackOutput a;
        private final boolean b;
        private final boolean c;
        private final SparseArray<NalUnitUtil.SpsData> d = new SparseArray<>();
        private final SparseArray<NalUnitUtil.PpsData> e = new SparseArray<>();
        private final ParsableNalUnitBitArray f;
        private byte[] g;
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private a m;
        private a n;
        private boolean o;
        private long p;
        private long q;
        private boolean r;

        public static final class a {
            private static final int q = 2;
            private static final int r = 7;
            private boolean a;
            private boolean b;

            @Nullable
            private NalUnitUtil.SpsData c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a other) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.a) {
                    return false;
                }
                if (!other.a) {
                    return true;
                }
                NalUnitUtil.SpsData spsData = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(this.c);
                NalUnitUtil.SpsData spsData2 = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(other.c);
                return (this.f == other.f && this.g == other.g && this.h == other.h && (!this.i || !other.i || this.j == other.j) && (((i = this.d) == (i2 = other.d) || (i != 0 && i2 != 0)) && (((i3 = spsData.picOrderCountType) != 0 || spsData2.picOrderCountType != 0 || (this.m == other.m && this.n == other.n)) && ((i3 != 1 || spsData2.picOrderCountType != 1 || (this.o == other.o && this.p == other.p)) && (z = this.k) == other.k && (!z || this.l == other.l))))) ? false : true;
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public boolean d() {
                int i;
                return this.b && ((i = this.e) == 7 || i == 2);
            }

            public void e(NalUnitUtil.SpsData spsData, int nalRefIdc, int sliceType, int frameNum, int picParameterSetId, boolean fieldPicFlag, boolean bottomFieldFlagPresent, boolean bottomFieldFlag, boolean idrPicFlag, int idrPicId, int picOrderCntLsb, int deltaPicOrderCntBottom, int deltaPicOrderCnt0, int deltaPicOrderCnt1) {
                this.c = spsData;
                this.d = nalRefIdc;
                this.e = sliceType;
                this.f = frameNum;
                this.g = picParameterSetId;
                this.h = fieldPicFlag;
                this.i = bottomFieldFlagPresent;
                this.j = bottomFieldFlag;
                this.k = idrPicFlag;
                this.l = idrPicId;
                this.m = picOrderCntLsb;
                this.n = deltaPicOrderCntBottom;
                this.o = deltaPicOrderCnt0;
                this.p = deltaPicOrderCnt1;
                this.a = true;
                this.b = true;
            }

            public void f(int sliceType) {
                this.e = sliceType;
                this.b = true;
            }
        }

        public b(TrackOutput output, boolean allowNonIdrKeyframes, boolean detectAccessUnits) {
            this.a = output;
            this.b = allowNonIdrKeyframes;
            this.c = detectAccessUnits;
            this.m = new a();
            this.n = new a();
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new ParsableNalUnitBitArray(bArr, 0, 0);
            g();
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
            boolean z = this.r;
            this.a.sampleMetadata(this.q, z ? 1 : 0, (int) (this.j - this.p), i, null);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:54:0x0102  */
        /* JADX WARN: Code duplicated, block: B:56:0x0106  */
        /* JADX WARN: Code duplicated, block: B:58:0x010e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x010f  */
        /* JADX WARN: Code duplicated, block: B:60:0x0118  */
        /* JADX WARN: Code duplicated, block: B:63:0x011e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0128 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x0129  */
        /* JADX WARN: Code duplicated, block: B:74:0x014e  */
        public void a(byte[] data, int offset, int limit) {
            boolean z;
            boolean z2;
            boolean bit;
            boolean z3;
            int unsignedExpGolombCodedInt;
            int i;
            int i2;
            int i3;
            int signedExpGolombCodedInt;
            int signedExpGolombCodedInt2;
            int bits;
            if (this.k) {
                int i4 = limit - offset;
                byte[] bArr = this.g;
                int length = bArr.length;
                int i5 = this.h;
                if (length < i5 + i4) {
                    this.g = Arrays.copyOf(bArr, (i5 + i4) * 2);
                }
                System.arraycopy(data, offset, this.g, this.h, i4);
                int i6 = this.h + i4;
                this.h = i6;
                this.f.reset(this.g, 0, i6);
                if (this.f.canReadBits(8)) {
                    this.f.skipBit();
                    int bits2 = this.f.readBits(2);
                    this.f.skipBits(5);
                    if (this.f.canReadExpGolombCodedNum()) {
                        this.f.readUnsignedExpGolombCodedInt();
                        if (this.f.canReadExpGolombCodedNum()) {
                            int unsignedExpGolombCodedInt2 = this.f.readUnsignedExpGolombCodedInt();
                            if (!this.c) {
                                this.k = false;
                                this.n.f(unsignedExpGolombCodedInt2);
                                return;
                            }
                            if (this.f.canReadExpGolombCodedNum()) {
                                int unsignedExpGolombCodedInt3 = this.f.readUnsignedExpGolombCodedInt();
                                if (this.e.indexOfKey(unsignedExpGolombCodedInt3) < 0) {
                                    this.k = false;
                                    return;
                                }
                                NalUnitUtil.PpsData ppsData = this.e.get(unsignedExpGolombCodedInt3);
                                NalUnitUtil.SpsData spsData = this.d.get(ppsData.seqParameterSetId);
                                if (spsData.separateColorPlaneFlag) {
                                    if (!this.f.canReadBits(2)) {
                                        return;
                                    } else {
                                        this.f.skipBits(2);
                                    }
                                }
                                if (this.f.canReadBits(spsData.frameNumLength)) {
                                    int bits3 = this.f.readBits(spsData.frameNumLength);
                                    if (!spsData.frameMbsOnlyFlag) {
                                        if (this.f.canReadBits(1)) {
                                            boolean bit2 = this.f.readBit();
                                            if (!bit2) {
                                                z = bit2;
                                            } else {
                                                if (!this.f.canReadBits(1)) {
                                                    return;
                                                }
                                                z = bit2;
                                                bit = this.f.readBit();
                                                z2 = true;
                                            }
                                            if (this.i == 5) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                unsignedExpGolombCodedInt = 0;
                                            } else if (!this.f.canReadExpGolombCodedNum()) {
                                                return;
                                            } else {
                                                unsignedExpGolombCodedInt = this.f.readUnsignedExpGolombCodedInt();
                                            }
                                            i = spsData.picOrderCountType;
                                            if (i != 0) {
                                                if (this.f.canReadBits(spsData.picOrderCntLsbLength)) {
                                                    bits = this.f.readBits(spsData.picOrderCntLsbLength);
                                                    if (ppsData.bottomFieldPicOrderInFramePresentFlag || z) {
                                                        i2 = bits;
                                                    } else {
                                                        if (!this.f.canReadExpGolombCodedNum()) {
                                                            return;
                                                        }
                                                        signedExpGolombCodedInt = this.f.readSignedExpGolombCodedInt();
                                                        i2 = bits;
                                                    }
                                                    i3 = 0;
                                                    signedExpGolombCodedInt2 = 0;
                                                    this.n.e(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z, z2, bit, z3, unsignedExpGolombCodedInt, i2, signedExpGolombCodedInt, i3, signedExpGolombCodedInt2);
                                                    this.k = false;
                                                }
                                                return;
                                            }
                                            if (i == 1 || spsData.deltaPicOrderAlwaysZeroFlag) {
                                                i2 = 0;
                                            } else {
                                                if (!this.f.canReadExpGolombCodedNum()) {
                                                    return;
                                                }
                                                int signedExpGolombCodedInt3 = this.f.readSignedExpGolombCodedInt();
                                                if (!ppsData.bottomFieldPicOrderInFramePresentFlag || z) {
                                                    i3 = signedExpGolombCodedInt3;
                                                    i2 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                    signedExpGolombCodedInt2 = 0;
                                                } else {
                                                    if (!this.f.canReadExpGolombCodedNum()) {
                                                        return;
                                                    }
                                                    signedExpGolombCodedInt2 = this.f.readSignedExpGolombCodedInt();
                                                    i3 = signedExpGolombCodedInt3;
                                                    i2 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                }
                                            }
                                            this.n.e(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z, z2, bit, z3, unsignedExpGolombCodedInt, i2, signedExpGolombCodedInt, i3, signedExpGolombCodedInt2);
                                            this.k = false;
                                            signedExpGolombCodedInt = 0;
                                            i3 = 0;
                                            signedExpGolombCodedInt2 = 0;
                                            this.n.e(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z, z2, bit, z3, unsignedExpGolombCodedInt, i2, signedExpGolombCodedInt, i3, signedExpGolombCodedInt2);
                                            this.k = false;
                                        }
                                        return;
                                    }
                                    z = false;
                                    z2 = false;
                                    bit = false;
                                    if (this.i == 5) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        unsignedExpGolombCodedInt = 0;
                                    } else if (!this.f.canReadExpGolombCodedNum()) {
                                        return;
                                    } else {
                                        unsignedExpGolombCodedInt = this.f.readUnsignedExpGolombCodedInt();
                                    }
                                    i = spsData.picOrderCountType;
                                    if (i != 0) {
                                        if (i == 1) {
                                        }
                                        i2 = 0;
                                    } else {
                                        if (this.f.canReadBits(spsData.picOrderCntLsbLength)) {
                                            return;
                                        }
                                        bits = this.f.readBits(spsData.picOrderCntLsbLength);
                                        if (ppsData.bottomFieldPicOrderInFramePresentFlag) {
                                        }
                                        i2 = bits;
                                    }
                                    signedExpGolombCodedInt = 0;
                                    i3 = 0;
                                    signedExpGolombCodedInt2 = 0;
                                    this.n.e(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z, z2, bit, z3, unsignedExpGolombCodedInt, i2, signedExpGolombCodedInt, i3, signedExpGolombCodedInt2);
                                    this.k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long position, int offset, boolean hasOutputFormat, boolean randomAccessIndicator) {
            boolean z = false;
            if (this.i == 9 || (this.c && this.n.c(this.m))) {
                if (hasOutputFormat && this.o) {
                    d(offset + ((int) (position - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            if (this.b) {
                randomAccessIndicator = this.n.d();
            }
            boolean z2 = this.r;
            int i = this.i;
            if (i == 5 || (randomAccessIndicator && i == 1)) {
                z = true;
            }
            boolean z3 = z2 | z;
            this.r = z3;
            return z3;
        }

        public boolean c() {
            return this.c;
        }

        public void e(NalUnitUtil.PpsData ppsData) {
            this.e.append(ppsData.picParameterSetId, ppsData);
        }

        public void f(NalUnitUtil.SpsData spsData) {
            this.d.append(spsData.seqParameterSetId, spsData);
        }

        public void g() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public void h(long position, int type, long pesTimeUs) {
            this.i = type;
            this.l = pesTimeUs;
            this.j = position;
            if (!this.b || type != 1) {
                if (!this.c) {
                    return;
                }
                if (type != 5 && type != 1 && type != 2) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.k = true;
        }
    }

    public H264Reader(SeiReader seiReader, boolean allowNonIdrKeyframes, boolean detectAccessUnits) {
        this.a = seiReader;
        this.b = allowNonIdrKeyframes;
        this.c = detectAccessUnits;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void a() {
        Assertions.checkStateNotNull(this.j);
        Util.castNonNull(this.k);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void b(long position, int offset, int discardPadding, long pesTimeUs) {
        if (!this.l || this.k.c()) {
            this.d.b(discardPadding);
            this.e.b(discardPadding);
            if (this.l) {
                if (this.d.c()) {
                    com.google.android.exoplayer2.extractor.ts.a aVar = this.d;
                    this.k.f(NalUnitUtil.parseSpsNalUnit(aVar.d, 3, aVar.e));
                    this.d.d();
                } else if (this.e.c()) {
                    com.google.android.exoplayer2.extractor.ts.a aVar2 = this.e;
                    this.k.e(NalUnitUtil.parsePpsNalUnit(aVar2.d, 3, aVar2.e));
                    this.e.d();
                }
            } else if (this.d.c() && this.e.c()) {
                ArrayList arrayList = new ArrayList();
                com.google.android.exoplayer2.extractor.ts.a aVar3 = this.d;
                arrayList.add(Arrays.copyOf(aVar3.d, aVar3.e));
                com.google.android.exoplayer2.extractor.ts.a aVar4 = this.e;
                arrayList.add(Arrays.copyOf(aVar4.d, aVar4.e));
                com.google.android.exoplayer2.extractor.ts.a aVar5 = this.d;
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(aVar5.d, 3, aVar5.e);
                com.google.android.exoplayer2.extractor.ts.a aVar6 = this.e;
                NalUnitUtil.PpsData ppsNalUnit = NalUnitUtil.parsePpsNalUnit(aVar6.d, 3, aVar6.e);
                this.j.format(new Format.Builder().setId(this.i).setSampleMimeType(MimeTypes.VIDEO_H264).setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc)).setWidth(spsNalUnit.width).setHeight(spsNalUnit.height).setPixelWidthHeightRatio(spsNalUnit.pixelWidthAspectRatio).setInitializationData(arrayList).build());
                this.l = true;
                this.k.f(spsNalUnit);
                this.k.e(ppsNalUnit);
                this.d.d();
                this.e.d();
            }
        }
        if (this.f.b(discardPadding)) {
            com.google.android.exoplayer2.extractor.ts.a aVar7 = this.f;
            this.o.reset(this.f.d, NalUnitUtil.unescapeStream(aVar7.d, aVar7.e));
            this.o.setPosition(4);
            this.a.consume(pesTimeUs, this.o);
        }
        if (this.k.b(position, offset, this.l, this.n)) {
            this.n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void c(byte[] dataArray, int offset, int limit) {
        if (!this.l || this.k.c()) {
            this.d.a(dataArray, offset, limit);
            this.e.a(dataArray, offset, limit);
        }
        this.f.a(dataArray, offset, limit);
        this.k.a(dataArray, offset, limit);
    }

    @RequiresNonNull({"sampleReader"})
    private void d(long position, int nalUnitType, long pesTimeUs) {
        if (!this.l || this.k.c()) {
            this.d.e(nalUnitType);
            this.e.e(nalUnitType);
        }
        this.f.e(nalUnitType);
        this.k.h(position, nalUnitType, pesTimeUs);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) {
        a();
        int position = data.getPosition();
        int iLimit = data.limit();
        byte[] data2 = data.getData();
        this.g += (long) data.bytesLeft();
        this.j.sampleData(data, data.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data2, position, iLimit, this.h);
            if (iFindNalUnit == iLimit) {
                c(data2, position, iLimit);
                return;
            }
            int nalUnitType = NalUnitUtil.getNalUnitType(data2, iFindNalUnit);
            int i = iFindNalUnit - position;
            if (i > 0) {
                c(data2, position, iFindNalUnit);
            }
            int i2 = iLimit - iFindNalUnit;
            long j = this.g - ((long) i2);
            b(j, i2, i < 0 ? -i : 0, this.m);
            d(j, nalUnitType, this.m);
            position = iFindNalUnit + 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        this.i = idGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(idGenerator.getTrackId(), 2);
        this.j = trackOutputTrack;
        this.k = new b(trackOutputTrack, this.b, this.c);
        this.a.createTracks(extractorOutput, idGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long pesTimeUs, int flags) {
        this.m = pesTimeUs;
        this.n |= (flags & 2) != 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.g = 0L;
        this.n = false;
        NalUnitUtil.clearPrefixFlags(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        b bVar = this.k;
        if (bVar != null) {
            bVar.g();
        }
    }
}

package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class H262Reader implements ElementaryStreamReader {
    private static final int q = 0;
    private static final int r = 179;
    private static final int s = 181;
    private static final int t = 184;
    private static final int u = 178;
    private static final double[] v = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private TrackOutput b;

    @Nullable
    private final f c;

    @Nullable
    private final ParsableByteArray d;

    @Nullable
    private final com.google.android.exoplayer2.extractor.ts.a e;
    private final boolean[] f;
    private final a g;
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;

    public static final class a {
        private static final byte[] e = {0, 0, 1};
        private boolean a;
        public int b;
        public int c;
        public byte[] d;

        public a(int initialCapacity) {
            this.d = new byte[initialCapacity];
        }

        public void a(byte[] newData, int offset, int limit) {
            if (this.a) {
                int i = limit - offset;
                byte[] bArr = this.d;
                int length = bArr.length;
                int i2 = this.b;
                if (length < i2 + i) {
                    this.d = Arrays.copyOf(bArr, (i2 + i) * 2);
                }
                System.arraycopy(newData, offset, this.d, this.b, i);
                this.b += i;
            }
        }

        public boolean b(int startCodeValue, int bytesAlreadyPassed) {
            if (this.a) {
                int i = this.b - bytesAlreadyPassed;
                this.b = i;
                if (this.c != 0 || startCodeValue != 181) {
                    this.a = false;
                    return true;
                }
                this.c = i;
            } else if (startCodeValue == 179) {
                this.a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    public H262Reader() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0076  */
    /* JADX WARN: Code duplicated, block: B:16:0x007b  */
    /* JADX WARN: Code duplicated, block: B:18:0x008d  */
    private static Pair<Format, Long> a(a csdBuffer, String formatId) {
        float f;
        int i;
        float f2;
        long j;
        int i2;
        double[] dArr;
        double d;
        int i3;
        int i4;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.d, csdBuffer.b);
        int i5 = bArrCopyOf[4] & 255;
        int i6 = bArrCopyOf[5] & 255;
        int i7 = (i5 << 4) | (i6 >> 4);
        int i8 = ((i6 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i9 = (bArrCopyOf[7] & 240) >> 4;
        if (i9 == 2) {
            f = i8 * 4;
            i = i7 * 3;
        } else {
            if (i9 != 3) {
                if (i9 != 4) {
                    f2 = 1.0f;
                } else {
                    f = i8 * 121;
                    i = i7 * 100;
                }
                Format formatBuild = new Format.Builder().setId(formatId).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i7).setHeight(i8).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                j = 0;
                i2 = (bArrCopyOf[7] & 15) - 1;
                if (i2 >= 0) {
                    dArr = v;
                    if (i2 < dArr.length) {
                        d = dArr[i2];
                        int i10 = csdBuffer.c + 9;
                        i3 = (bArrCopyOf[i10] & 96) >> 5;
                        i4 = bArrCopyOf[i10] & 31;
                        if (i3 != i4) {
                            d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                        }
                        j = (long) (1000000.0d / d);
                    }
                }
                return Pair.create(formatBuild, Long.valueOf(j));
            }
            f = i8 * 16;
            i = i7 * 9;
        }
        f2 = f / i;
        Format formatBuild2 = new Format.Builder().setId(formatId).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i7).setHeight(i8).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        j = 0;
        i2 = (bArrCopyOf[7] & 15) - 1;
        if (i2 >= 0) {
            dArr = v;
            if (i2 < dArr.length) {
                d = dArr[i2];
                int i11 = csdBuffer.c + 9;
                i3 = (bArrCopyOf[i11] & 96) >> 5;
                i4 = bArrCopyOf[i11] & 31;
                if (i3 != i4) {
                    d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                }
                j = (long) (1000000.0d / d);
            }
        }
        return Pair.create(formatBuild2, Long.valueOf(j));
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
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i;
        Assertions.checkStateNotNull(this.b);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.h += (long) parsableByteArray.bytesLeft();
        this.b.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.f);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i2 = iFindNalUnit + 3;
            int i3 = parsableByteArray.getData()[i2] & 255;
            int i4 = iFindNalUnit - position;
            if (!this.j) {
                if (i4 > 0) {
                    this.g.a(data, position, iFindNalUnit);
                }
                if (this.g.b(i3, i4 < 0 ? -i4 : 0)) {
                    Pair<Format, Long> pairA = a(this.g, (String) Assertions.checkNotNull(this.a));
                    this.b.format((Format) pairA.first);
                    this.k = ((Long) pairA.second).longValue();
                    this.j = true;
                }
            }
            com.google.android.exoplayer2.extractor.ts.a aVar = this.e;
            if (aVar != null) {
                if (i4 > 0) {
                    aVar.a(data, position, iFindNalUnit);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.e.b(i)) {
                    com.google.android.exoplayer2.extractor.ts.a aVar2 = this.e;
                    ((ParsableByteArray) Util.castNonNull(this.d)).reset(this.e.d, NalUnitUtil.unescapeStream(aVar2.d, aVar2.e));
                    ((f) Util.castNonNull(this.c)).a(this.n, this.d);
                }
                if (i3 == 178 && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.e.e(i3);
                }
            }
            if (i3 == 0 || i3 == 179) {
                int i5 = iLimit - iFindNalUnit;
                if (this.i && this.p && this.j) {
                    this.b.sampleMetadata(this.n, this.o ? 1 : 0, ((int) (this.h - this.m)) - i5, i5, null);
                }
                boolean z = this.i;
                if (!z || this.p) {
                    this.m = this.h - ((long) i5);
                    long j = this.l;
                    if (j == C.TIME_UNSET) {
                        j = z ? this.n + this.k : 0L;
                    }
                    this.n = j;
                    this.o = false;
                    this.l = C.TIME_UNSET;
                    this.i = true;
                }
                this.p = i3 == 0;
            } else if (i3 == 184) {
                this.o = true;
            }
            position = i2;
        }
        if (!this.j) {
            this.g.a(data, position, iLimit);
        }
        com.google.android.exoplayer2.extractor.ts.a aVar3 = this.e;
        if (aVar3 != null) {
            aVar3.a(data, position, iLimit);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        this.a = idGenerator.getFormatId();
        this.b = extractorOutput.track(idGenerator.getTrackId(), 2);
        f fVar = this.c;
        if (fVar != null) {
            fVar.b(extractorOutput, idGenerator);
        }
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
        NalUnitUtil.clearPrefixFlags(this.f);
        this.g.c();
        com.google.android.exoplayer2.extractor.ts.a aVar = this.e;
        if (aVar != null) {
            aVar.d();
        }
        this.h = 0L;
        this.i = false;
    }

    public H262Reader(@Nullable f userDataReader) {
        this.c = userDataReader;
        this.f = new boolean[4];
        this.g = new a(128);
        if (userDataReader != null) {
            this.e = new com.google.android.exoplayer2.extractor.ts.a(178, 128);
            this.d = new ParsableByteArray();
        } else {
            this.e = null;
            this.d = null;
        }
    }
}

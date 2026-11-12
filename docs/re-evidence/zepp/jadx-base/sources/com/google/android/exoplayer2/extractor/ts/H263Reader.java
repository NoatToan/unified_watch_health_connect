package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class H263Reader implements ElementaryStreamReader {
    private static final String l = "H263Reader";
    private static final int m = 176;
    private static final int n = 178;
    private static final int o = 179;
    private static final int p = 181;
    private static final int q = 182;
    private static final int r = 31;
    private static final int s = -1;
    private static final float[] t = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private static final int u = 0;

    @Nullable
    private final f a;

    @Nullable
    private final ParsableByteArray b;
    private final boolean[] c;
    private final a d;

    @Nullable
    private final com.google.android.exoplayer2.extractor.ts.a e;
    private b f;
    private long g;
    private String h;
    private TrackOutput i;
    private boolean j;
    private long k;

    public static final class a {
        private static final byte[] f = {0, 0, 1};
        private static final int g = 0;
        private static final int h = 1;
        private static final int i = 2;
        private static final int j = 3;
        private static final int k = 4;
        private boolean a;
        private int b;
        public int c;
        public int d;
        public byte[] e;

        public a(int initialCapacity) {
            this.e = new byte[initialCapacity];
        }

        public void a(byte[] newData, int offset, int limit) {
            if (this.a) {
                int i2 = limit - offset;
                byte[] bArr = this.e;
                int length = bArr.length;
                int i3 = this.c;
                if (length < i3 + i2) {
                    this.e = Arrays.copyOf(bArr, (i3 + i2) * 2);
                }
                System.arraycopy(newData, offset, this.e, this.c, i2);
                this.c += i2;
            }
        }

        public boolean b(int startCodeValue, int bytesAlreadyPassed) {
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new IllegalStateException();
                            }
                            if (startCodeValue == 179 || startCodeValue == 181) {
                                this.c -= bytesAlreadyPassed;
                                this.a = false;
                                return true;
                            }
                        } else if ((startCodeValue & 240) != 32) {
                            Log.w(H263Reader.l, "Unexpected start code value");
                            c();
                        } else {
                            this.d = this.c;
                            this.b = 4;
                        }
                    } else if (startCodeValue > 31) {
                        Log.w(H263Reader.l, "Unexpected start code value");
                        c();
                    } else {
                        this.b = 3;
                    }
                } else if (startCodeValue != 181) {
                    Log.w(H263Reader.l, "Unexpected start code value");
                    c();
                } else {
                    this.b = 2;
                }
            } else if (startCodeValue == 176) {
                this.b = 1;
                this.a = true;
            }
            byte[] bArr = f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    public static final class b {
        private static final int i = 1;
        private static final int j = 0;
        private final TrackOutput a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        private int f;
        private long g;
        private long h;

        public b(TrackOutput output) {
            this.a = output;
        }

        public void a(byte[] data, int offset, int limit) {
            if (this.c) {
                int i2 = this.f;
                int i3 = (offset + 1) - i2;
                if (i3 >= limit) {
                    this.f = i2 + (limit - offset);
                } else {
                    this.d = ((data[i3] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
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
        public void b(long j2, int i2, boolean z) {
            if (this.e == 182 && z && this.b) {
                this.a.sampleMetadata(this.h, this.d ? 1 : 0, (int) (j2 - this.g), i2, null);
            }
            if (this.e != 179) {
                this.g = j2;
            }
        }

        public void c(int startCodeValue, long pesTimeUs) {
            this.e = startCodeValue;
            this.d = false;
            this.b = startCodeValue == 182 || startCodeValue == 179;
            this.c = startCodeValue == 182;
            this.f = 0;
            this.h = pesTimeUs;
        }

        public void d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

    public H263Reader() {
        this(null);
    }

    private static Format a(a csdBuffer, int volStartPosition, String formatId) {
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.e, csdBuffer.c);
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        parsableBitArray.skipBytes(volStartPosition);
        parsableBitArray.skipBytes(4);
        parsableBitArray.skipBit();
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        int bits = parsableBitArray.readBits(4);
        float f = 1.0f;
        if (bits == 15) {
            int bits2 = parsableBitArray.readBits(8);
            int bits3 = parsableBitArray.readBits(8);
            if (bits3 == 0) {
                Log.w(l, "Invalid aspect ratio");
            } else {
                f = bits2 / bits3;
            }
        } else {
            float[] fArr = t;
            if (bits < fArr.length) {
                f = fArr[bits];
            } else {
                Log.w(l, "Invalid aspect ratio");
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(3);
                parsableBitArray.skipBits(11);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
            }
        }
        if (parsableBitArray.readBits(2) != 0) {
            Log.w(l, "Unhandled video object layer shape");
        }
        parsableBitArray.skipBit();
        int bits4 = parsableBitArray.readBits(16);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            if (bits4 == 0) {
                Log.w(l, "Invalid vop_increment_time_resolution");
            } else {
                int i = 0;
                for (int i2 = bits4 - 1; i2 > 0; i2 >>= 1) {
                    i++;
                }
                parsableBitArray.skipBits(i);
            }
        }
        parsableBitArray.skipBit();
        int bits5 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        int bits6 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        parsableBitArray.skipBit();
        return new Format.Builder().setId(formatId).setSampleMimeType(MimeTypes.VIDEO_MP4V).setWidth(bits5).setHeight(bits6).setPixelWidthHeightRatio(f).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) {
        Assertions.checkStateNotNull(this.f);
        Assertions.checkStateNotNull(this.i);
        int position = data.getPosition();
        int iLimit = data.limit();
        byte[] data2 = data.getData();
        this.g += (long) data.bytesLeft();
        this.i.sampleData(data, data.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data2, position, iLimit, this.c);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i = iFindNalUnit + 3;
            int i2 = data.getData()[i] & 255;
            int i3 = iFindNalUnit - position;
            int i4 = 0;
            if (!this.j) {
                if (i3 > 0) {
                    this.d.a(data2, position, iFindNalUnit);
                }
                if (this.d.b(i2, i3 < 0 ? -i3 : 0)) {
                    TrackOutput trackOutput = this.i;
                    a aVar = this.d;
                    trackOutput.format(a(aVar, aVar.d, (String) Assertions.checkNotNull(this.h)));
                    this.j = true;
                }
            }
            this.f.a(data2, position, iFindNalUnit);
            com.google.android.exoplayer2.extractor.ts.a aVar2 = this.e;
            if (aVar2 != null) {
                if (i3 > 0) {
                    aVar2.a(data2, position, iFindNalUnit);
                } else {
                    i4 = -i3;
                }
                if (this.e.b(i4)) {
                    com.google.android.exoplayer2.extractor.ts.a aVar3 = this.e;
                    ((ParsableByteArray) Util.castNonNull(this.b)).reset(this.e.d, NalUnitUtil.unescapeStream(aVar3.d, aVar3.e));
                    ((f) Util.castNonNull(this.a)).a(this.k, this.b);
                }
                if (i2 == 178 && data.getData()[iFindNalUnit + 2] == 1) {
                    this.e.e(i2);
                }
            }
            int i5 = iLimit - iFindNalUnit;
            this.f.b(this.g - ((long) i5), i5, this.j);
            this.f.c(i2, this.k);
            position = i;
        }
        if (!this.j) {
            this.d.a(data2, position, iLimit);
        }
        this.f.a(data2, position, iLimit);
        com.google.android.exoplayer2.extractor.ts.a aVar4 = this.e;
        if (aVar4 != null) {
            aVar4.a(data2, position, iLimit);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        this.h = idGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(idGenerator.getTrackId(), 2);
        this.i = trackOutputTrack;
        this.f = new b(trackOutputTrack);
        f fVar = this.a;
        if (fVar != null) {
            fVar.b(extractorOutput, idGenerator);
        }
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
        NalUnitUtil.clearPrefixFlags(this.c);
        this.d.c();
        b bVar = this.f;
        if (bVar != null) {
            bVar.d();
        }
        com.google.android.exoplayer2.extractor.ts.a aVar = this.e;
        if (aVar != null) {
            aVar.d();
        }
        this.g = 0L;
    }

    public H263Reader(@Nullable f userDataReader) {
        this.a = userDataReader;
        this.c = new boolean[4];
        this.d = new a(128);
        if (userDataReader != null) {
            this.e = new com.google.android.exoplayer2.extractor.ts.a(178, 128);
            this.b = new ParsableByteArray();
        } else {
            this.e = null;
            this.b = null;
        }
    }
}

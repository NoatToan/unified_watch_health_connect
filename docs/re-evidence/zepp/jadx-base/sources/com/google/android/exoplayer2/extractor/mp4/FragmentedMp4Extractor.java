package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.fota.fotaError.StopReason;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Function;
import com.huami.nfc.applet.ISeCommandKt;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentedMp4Extractor implements Extractor {
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final String I = "FragmentedMp4Extractor";
    private static final int J = 1936025959;
    private static final int M = 100;
    private static final int N = 0;
    private static final int O = 1;
    private static final int P = 2;
    private static final int Q = 3;
    private static final int R = 4;
    private int A;
    private int B;
    private int C;
    private boolean D;
    private ExtractorOutput E;
    private TrackOutput[] F;
    private TrackOutput[] G;
    private boolean H;
    private final int a;

    @Nullable
    private final Track b;
    private final List<Format> c;
    private final SparseArray<b> d;
    private final ParsableByteArray e;
    private final ParsableByteArray f;
    private final ParsableByteArray g;
    private final byte[] h;
    private final ParsableByteArray i;

    @Nullable
    private final TimestampAdjuster j;
    private final EventMessageEncoder k;
    private final ParsableByteArray l;
    private final ArrayDeque<com.google.android.exoplayer2.extractor.mp4.a.C0147a> m;
    private final ArrayDeque<a> n;

    @Nullable
    private final TrackOutput o;
    private int p;
    private int q;
    private long r;
    private int s;

    @Nullable
    private ParsableByteArray t;
    private long u;
    private int v;
    private long w;
    private long x;
    private long y;

    @Nullable
    private b z;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: z92
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return FragmentedMp4Extractor.h();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    private static final byte[] K = {-94, 57, 79, 82, RaceType.CMD_NEED_RESP, -101, 79, 20, -94, org.threeten.bp.a.n, ISeCommandKt.RPDU_NEED_JUDGE, org.threeten.bp.a.l, 124, 100, -115, StopReason.UnexpectedRhoDone};
    private static final Format L = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class a {
        public final long a;
        public final int b;

        public a(long presentationTimeDeltaUs, int size) {
            this.a = presentationTimeDeltaUs;
            this.b = size;
        }
    }

    public static final class b {
        private static final int m = 8;
        public final TrackOutput a;
        public h d;
        public c e;
        public int f;
        public int g;
        public int h;
        public int i;
        private boolean l;
        public final g b = new g();
        public final ParsableByteArray c = new ParsableByteArray();
        private final ParsableByteArray j = new ParsableByteArray(1);
        private final ParsableByteArray k = new ParsableByteArray();

        public b(TrackOutput output, h moovSampleTable, c defaultSampleValues) {
            this.a = output;
            this.d = moovSampleTable;
            this.e = defaultSampleValues;
            j(moovSampleTable, defaultSampleValues);
        }

        public int c() {
            int i;
            if (this.l) {
                i = this.b.l[this.f] ? 1 : 0;
            } else {
                i = this.d.g[this.f];
            }
            return g() != null ? i | 1073741824 : i;
        }

        public long d() {
            return !this.l ? this.d.c[this.f] : this.b.g[this.h];
        }

        public long e() {
            return !this.l ? this.d.f[this.f] : this.b.c(this.f);
        }

        public int f() {
            return !this.l ? this.d.d[this.f] : this.b.i[this.f];
        }

        @Nullable
        public TrackEncryptionBox g() {
            if (!this.l) {
                return null;
            }
            int i = ((c) Util.castNonNull(this.b.a)).a;
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.b.o;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.d.a.getSampleDescriptionEncryptionBox(i);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.isEncrypted) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public boolean h() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.h;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public int i(int sampleSize, int clearHeaderSize) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox trackEncryptionBoxG = g();
            if (trackEncryptionBoxG == null) {
                return 0;
            }
            int length = trackEncryptionBoxG.perSampleIvSize;
            if (length != 0) {
                parsableByteArray = this.b.p;
            } else {
                byte[] bArr = (byte[]) Util.castNonNull(trackEncryptionBoxG.defaultInitializationVector);
                this.k.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.k;
                length = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean zG = this.b.g(this.f);
            boolean z = zG || clearHeaderSize != 0;
            this.j.getData()[0] = (byte) ((z ? 128 : 0) | length);
            this.j.setPosition(0);
            this.a.sampleData(this.j, 1, 1);
            this.a.sampleData(parsableByteArray, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zG) {
                this.c.reset(8);
                byte[] data = this.c.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((clearHeaderSize >> 8) & 255);
                data[3] = (byte) (clearHeaderSize & 255);
                data[4] = (byte) ((sampleSize >> 24) & 255);
                data[5] = (byte) ((sampleSize >> 16) & 255);
                data[6] = (byte) ((sampleSize >> 8) & 255);
                data[7] = (byte) (sampleSize & 255);
                this.a.sampleData(this.c, 8, 1);
                return length + 1 + 8;
            }
            ParsableByteArray parsableByteArray3 = this.b.p;
            int unsignedShort = parsableByteArray3.readUnsignedShort();
            parsableByteArray3.skipBytes(-2);
            int i = (unsignedShort * 6) + 2;
            if (clearHeaderSize != 0) {
                this.c.reset(i);
                byte[] data2 = this.c.getData();
                parsableByteArray3.readBytes(data2, 0, i);
                int i2 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + clearHeaderSize;
                data2[2] = (byte) ((i2 >> 8) & 255);
                data2[3] = (byte) (i2 & 255);
                parsableByteArray3 = this.c;
            }
            this.a.sampleData(parsableByteArray3, i, 1);
            return length + 1 + i;
        }

        public void j(h moovSampleTable, c defaultSampleValues) {
            this.d = moovSampleTable;
            this.e = defaultSampleValues;
            this.a.format(moovSampleTable.a.format);
            k();
        }

        public void k() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public void l(long timeUs) {
            int i = this.f;
            while (true) {
                g gVar = this.b;
                if (i >= gVar.f || gVar.c(i) >= timeUs) {
                    return;
                }
                if (this.b.l[i]) {
                    this.i = i;
                }
                i++;
            }
        }

        public void m() {
            TrackEncryptionBox trackEncryptionBoxG = g();
            if (trackEncryptionBoxG == null) {
                return;
            }
            ParsableByteArray parsableByteArray = this.b.p;
            int i = trackEncryptionBoxG.perSampleIvSize;
            if (i != 0) {
                parsableByteArray.skipBytes(i);
            }
            if (this.b.g(this.f)) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.d.a.getSampleDescriptionEncryptionBox(((c) Util.castNonNull(this.b.a)).a);
            this.a.format(this.d.a.format.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build());
        }
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    private static int A(b trackBundle, int index, int flags, ParsableByteArray trun, int trackRunStart) throws ParserException {
        long j;
        long jScaleLargeTimestamp;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        boolean[] zArr;
        boolean z;
        int i;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        b bVar = trackBundle;
        trun.setPosition(8);
        int iB = com.google.android.exoplayer2.extractor.mp4.a.b(trun.readInt());
        Track track = bVar.d.a;
        g gVar = bVar.b;
        c cVar = (c) Util.castNonNull(gVar.a);
        gVar.h[index] = trun.readUnsignedIntToInt();
        long[] jArr2 = gVar.g;
        jArr2[index] = gVar.c;
        if ((iB & 1) != 0) {
            jArr2[index] = jArr2[index] + ((long) trun.readInt());
        }
        boolean z3 = (iB & 4) != 0;
        int i6 = cVar.d;
        if (z3) {
            i6 = trun.readInt();
        }
        boolean z4 = (iB & 256) != 0;
        boolean z5 = (iB & 512) != 0;
        boolean z6 = (iB & 1024) != 0;
        boolean z7 = (iB & 2048) != 0;
        long[] jArr3 = track.editListDurations;
        if (jArr3 != null && jArr3.length == 1) {
            j = 0;
            if (jArr3[0] == 0) {
                jScaleLargeTimestamp = Util.scaleLargeTimestamp(((long[]) Util.castNonNull(track.editListMediaTimes))[0], 1000000L, track.timescale);
            }
            iArr = gVar.i;
            iArr2 = gVar.j;
            jArr = gVar.k;
            zArr = gVar.l;
            int i7 = i6;
            if (track.type == 2 || (flags & 1) == 0) {
                z = false;
            } else {
                z = true;
            }
            i = trackRunStart + gVar.h[index];
            boolean z8 = z;
            j2 = track.timescale;
            j3 = jScaleLargeTimestamp;
            j4 = gVar.r;
            i2 = trackRunStart;
            while (i2 < i) {
                if (z4) {
                    i3 = trun.readInt();
                } else {
                    i3 = cVar.b;
                }
                int iB2 = b(i3);
                if (z5) {
                    i4 = trun.readInt();
                } else {
                    i4 = cVar.c;
                }
                int iB3 = b(i4);
                if (z6) {
                    i5 = trun.readInt();
                } else if (i2 == 0 || !z3) {
                    i5 = cVar.d;
                } else {
                    i5 = i7;
                }
                if (z7) {
                    iArr2[i2] = (int) ((((long) trun.readInt()) * 1000000) / j2);
                } else {
                    iArr2[i2] = 0;
                }
                jArr[i2] = Util.scaleLargeTimestamp(j4, 1000000L, j2) - j3;
                if (!gVar.s) {
                    jArr[i2] = jArr[i2] + bVar.d.h;
                }
                iArr[i2] = iB3;
                if (((i5 >> 16) & 1) == 0 || (z8 && i2 != 0)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                zArr[i2] = z2;
                j4 += (long) iB2;
                i2++;
                bVar = trackBundle;
                z4 = z4;
                j2 = j2;
                z3 = z3;
                z7 = z7;
                z5 = z5;
                z6 = z6;
            }
            gVar.r = j4;
            return i;
        }
        j = 0;
        jScaleLargeTimestamp = j;
        iArr = gVar.i;
        iArr2 = gVar.j;
        jArr = gVar.k;
        zArr = gVar.l;
        int i8 = i6;
        if (track.type == 2) {
            z = false;
        } else {
            z = false;
        }
        i = trackRunStart + gVar.h[index];
        boolean z9 = z;
        j2 = track.timescale;
        j3 = jScaleLargeTimestamp;
        j4 = gVar.r;
        i2 = trackRunStart;
        while (i2 < i) {
            if (z4) {
                i3 = trun.readInt();
            } else {
                i3 = cVar.b;
            }
            int iB4 = b(i3);
            if (z5) {
                i4 = trun.readInt();
            } else {
                i4 = cVar.c;
            }
            int iB5 = b(i4);
            if (z6) {
                i5 = trun.readInt();
            } else if (i2 == 0) {
                i5 = cVar.d;
            } else {
                i5 = cVar.d;
            }
            if (z7) {
                iArr2[i2] = (int) ((((long) trun.readInt()) * 1000000) / j2);
            } else {
                iArr2[i2] = 0;
            }
            jArr[i2] = Util.scaleLargeTimestamp(j4, 1000000L, j2) - j3;
            if (!gVar.s) {
                jArr[i2] = jArr[i2] + bVar.d.h;
            }
            iArr[i2] = iB5;
            if (((i5 >> 16) & 1) == 0) {
                z2 = false;
            } else {
                z2 = false;
            }
            zArr[i2] = z2;
            j4 += (long) iB4;
            i2++;
            bVar = trackBundle;
            z4 = z4;
            j2 = j2;
            z3 = z3;
            z7 = z7;
            z5 = z5;
            z6 = z6;
        }
        gVar.r = j4;
        return i;
    }

    private static void B(com.google.android.exoplayer2.extractor.mp4.a.C0147a traf, b trackBundle, int flags) throws ParserException {
        List<com.google.android.exoplayer2.extractor.mp4.a.b> list = traf.z1;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = list.get(i3);
            if (bVar.a == 1953658222) {
                ParsableByteArray parsableByteArray = bVar.y1;
                parsableByteArray.setPosition(12);
                int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i2 += unsignedIntToInt;
                    i++;
                }
            }
        }
        trackBundle.h = 0;
        trackBundle.g = 0;
        trackBundle.f = 0;
        trackBundle.b.e(i, i2);
        int i4 = 0;
        int iA = 0;
        for (int i5 = 0; i5 < size; i5++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar2 = list.get(i5);
            if (bVar2.a == 1953658222) {
                iA = A(trackBundle, i4, flags, bVar2.y1, iA);
                i4++;
            }
        }
    }

    private static void C(ParsableByteArray uuid, g out, byte[] extendedTypeScratch) throws ParserException {
        uuid.setPosition(8);
        uuid.readBytes(extendedTypeScratch, 0, 16);
        if (Arrays.equals(extendedTypeScratch, K)) {
            t(uuid, 16, out);
        }
    }

    private void D(long atomEndPosition) throws ParserException {
        while (!this.m.isEmpty() && this.m.peek().y1 == atomEndPosition) {
            i(this.m.pop());
        }
        c();
    }

    private boolean E(ExtractorInput input) throws IOException {
        if (this.s == 0) {
            if (!input.readFully(this.l.getData(), 0, 8, true)) {
                return false;
            }
            this.s = 8;
            this.l.setPosition(0);
            this.r = this.l.readUnsignedInt();
            this.q = this.l.readInt();
        }
        long j = this.r;
        if (j == 1) {
            input.readFully(this.l.getData(), 8, 8);
            this.s += 8;
            this.r = this.l.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = input.getLength();
            if (length == -1 && !this.m.isEmpty()) {
                length = this.m.peek().y1;
            }
            if (length != -1) {
                this.r = (length - input.getPosition()) + ((long) this.s);
            }
        }
        if (this.r < this.s) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = input.getPosition() - ((long) this.s);
        int i = this.q;
        if ((i == 1836019558 || i == 1835295092) && !this.H) {
            this.E.seekMap(new SeekMap.Unseekable(this.x, position));
            this.H = true;
        }
        if (this.q == 1836019558) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = this.d.valueAt(i2).b;
                gVar.b = position;
                gVar.d = position;
                gVar.c = position;
            }
        }
        int i3 = this.q;
        if (i3 == 1835295092) {
            this.z = null;
            this.u = position + this.r;
            this.p = 2;
            return true;
        }
        if (I(i3)) {
            long position2 = (input.getPosition() + this.r) - 8;
            this.m.push(new com.google.android.exoplayer2.extractor.mp4.a.C0147a(this.q, position2));
            if (this.r == this.s) {
                D(position2);
            } else {
                c();
            }
        } else if (J(this.q)) {
            if (this.s != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            long j2 = this.r;
            if (j2 > ParserMinimalBase.MAX_INT_L) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) j2);
            System.arraycopy(this.l.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.t = parsableByteArray;
            this.p = 1;
        } else {
            if (this.r > ParserMinimalBase.MAX_INT_L) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.t = null;
            this.p = 1;
        }
        return true;
    }

    private void F(ExtractorInput input) throws IOException {
        int i = ((int) this.r) - this.s;
        ParsableByteArray parsableByteArray = this.t;
        if (parsableByteArray != null) {
            input.readFully(parsableByteArray.getData(), 8, i);
            k(new com.google.android.exoplayer2.extractor.mp4.a.b(this.q, parsableByteArray), input.getPosition());
        } else {
            input.skipFully(i);
        }
        D(input.getPosition());
    }

    private void G(ExtractorInput input) throws IOException {
        int size = this.d.size();
        long j = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i = 0; i < size; i++) {
            g gVar = this.d.valueAt(i).b;
            if (gVar.q) {
                long j2 = gVar.d;
                if (j2 < j) {
                    bVarValueAt = this.d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVarValueAt == null) {
            this.p = 3;
            return;
        }
        int position = (int) (j - input.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        input.skipFully(position);
        bVarValueAt.b.a(input);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean H(ExtractorInput extractorInput) throws IOException {
        int iSampleData;
        b bVarF = this.z;
        Throwable th = null;
        if (bVarF == null) {
            bVarF = f(this.d);
            if (bVarF == null) {
                int position = (int) (this.u - extractorInput.getPosition());
                if (position < 0) {
                    throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                extractorInput.skipFully(position);
                c();
                return false;
            }
            int iD = (int) (bVarF.d() - extractorInput.getPosition());
            if (iD < 0) {
                Log.w(I, "Ignoring negative offset to sample data.");
                iD = 0;
            }
            extractorInput.skipFully(iD);
            this.z = bVarF;
        }
        int i = 4;
        int i2 = 1;
        if (this.p == 3) {
            int iF = bVarF.f();
            this.A = iF;
            if (bVarF.f < bVarF.i) {
                extractorInput.skipFully(iF);
                bVarF.m();
                if (!bVarF.h()) {
                    this.z = null;
                }
                this.p = 3;
                return true;
            }
            if (bVarF.d.a.sampleTransformation == 1) {
                this.A = iF - 8;
                extractorInput.skipFully(8);
            }
            if (MimeTypes.AUDIO_AC4.equals(bVarF.d.a.format.sampleMimeType)) {
                this.B = bVarF.i(this.A, 7);
                Ac4Util.getAc4SampleHeader(this.A, this.i);
                bVarF.a.sampleData(this.i, 7);
                this.B += 7;
            } else {
                this.B = bVarF.i(this.A, 0);
            }
            this.A += this.B;
            this.p = 4;
            this.C = 0;
        }
        Track track = bVarF.d.a;
        TrackOutput trackOutput = bVarF.a;
        long jE = bVarF.e();
        TimestampAdjuster timestampAdjuster = this.j;
        if (timestampAdjuster != null) {
            jE = timestampAdjuster.adjustSampleTimestamp(jE);
        }
        long j = jE;
        if (track.nalUnitLengthFieldLength == 0) {
            while (true) {
                int i3 = this.B;
                int i4 = this.A;
                if (i3 >= i4) {
                    break;
                }
                this.B += trackOutput.sampleData((DataReader) extractorInput, i4 - i3, false);
            }
        } else {
            byte[] data = this.f.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i5 = track.nalUnitLengthFieldLength;
            int i6 = i5 + 1;
            int i7 = 4 - i5;
            while (this.B < this.A) {
                int i8 = this.C;
                if (i8 == 0) {
                    extractorInput.readFully(data, i7, i6);
                    this.f.setPosition(0);
                    int i9 = this.f.readInt();
                    if (i9 < i2) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", th);
                    }
                    this.C = i9 - 1;
                    this.e.setPosition(0);
                    trackOutput.sampleData(this.e, i);
                    trackOutput.sampleData(this.f, i2);
                    this.D = this.G.length > 0 && NalUnitUtil.isNalUnitSei(track.format.sampleMimeType, data[i]);
                    this.B += 5;
                    this.A += i7;
                } else {
                    if (this.D) {
                        this.g.reset(i8);
                        extractorInput.readFully(this.g.getData(), 0, this.C);
                        trackOutput.sampleData(this.g, this.C);
                        iSampleData = this.C;
                        int iUnescapeStream = NalUnitUtil.unescapeStream(this.g.getData(), this.g.limit());
                        this.g.setPosition(MimeTypes.VIDEO_H265.equals(track.format.sampleMimeType) ? 1 : 0);
                        this.g.setLimit(iUnescapeStream);
                        CeaUtil.consume(j, this.g, this.G);
                    } else {
                        iSampleData = trackOutput.sampleData((DataReader) extractorInput, i8, false);
                    }
                    this.B += iSampleData;
                    this.C -= iSampleData;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int iC = bVarF.c();
        TrackEncryptionBox trackEncryptionBoxG = bVarF.g();
        trackOutput.sampleMetadata(j, iC, this.A, 0, trackEncryptionBoxG != null ? trackEncryptionBoxG.cryptoData : null);
        n(j);
        if (!bVarF.h()) {
            this.z = null;
        }
        this.p = 3;
        return true;
    }

    private static boolean I(int atom) {
        return atom == 1836019574 || atom == 1953653099 || atom == 1835297121 || atom == 1835626086 || atom == 1937007212 || atom == 1836019558 || atom == 1953653094 || atom == 1836475768 || atom == 1701082227;
    }

    private static boolean J(int atom) {
        return atom == 1751411826 || atom == 1835296868 || atom == 1836476516 || atom == 1936286840 || atom == 1937011556 || atom == 1937011827 || atom == 1668576371 || atom == 1937011555 || atom == 1937011578 || atom == 1937013298 || atom == 1937007471 || atom == 1668232756 || atom == 1937011571 || atom == 1952867444 || atom == 1952868452 || atom == 1953196132 || atom == 1953654136 || atom == 1953658222 || atom == 1886614376 || atom == 1935763834 || atom == 1935763823 || atom == 1936027235 || atom == 1970628964 || atom == 1935828848 || atom == 1936158820 || atom == 1701606260 || atom == 1835362404 || atom == 1701671783;
    }

    private static int b(int value) throws ParserException {
        if (value >= 0) {
            return value;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(value);
        throw ParserException.createForMalformedContainer(sb.toString(), null);
    }

    private void c() {
        this.p = 0;
        this.s = 0;
    }

    private c d(SparseArray<c> defaultSampleValuesArray, int trackId) {
        return defaultSampleValuesArray.size() == 1 ? defaultSampleValuesArray.valueAt(0) : (c) Assertions.checkNotNull(defaultSampleValuesArray.get(trackId));
    }

    @Nullable
    private static DrmInitData e(List<com.google.android.exoplayer2.extractor.mp4.a.b> leafChildren) {
        int size = leafChildren.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = leafChildren.get(i);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = bVar.y1.getData();
                UUID uuid = PsshAtomUtil.parseUuid(data);
                if (uuid == null) {
                    Log.w(I, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @Nullable
    private static b f(SparseArray<b> trackBundles) {
        int size = trackBundles.size();
        b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            b bVarValueAt = trackBundles.valueAt(i);
            if ((bVarValueAt.l || bVarValueAt.f != bVarValueAt.d.b) && (!bVarValueAt.l || bVarValueAt.h != bVarValueAt.b.e)) {
                long jD = bVarValueAt.d();
                if (jD < j) {
                    bVar = bVarValueAt;
                    j = jD;
                }
            }
        }
        return bVar;
    }

    private void g() {
        int i;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.F = trackOutputArr;
        TrackOutput trackOutput = this.o;
        int i2 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.a & 4) != 0) {
            trackOutputArr[i] = this.E.track(100, 5);
            i++;
            i3 = 101;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.nullSafeArrayCopy(this.F, i);
        this.F = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(L);
        }
        this.G = new TrackOutput[this.c.size()];
        while (i2 < this.G.length) {
            TrackOutput trackOutputTrack = this.E.track(i3, 3);
            trackOutputTrack.format(this.c.get(i2));
            this.G[i2] = trackOutputTrack;
            i2++;
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] h() {
        return new Extractor[]{new FragmentedMp4Extractor()};
    }

    private void i(com.google.android.exoplayer2.extractor.mp4.a.C0147a container) throws ParserException {
        int i = container.a;
        if (i == 1836019574) {
            m(container);
        } else if (i == 1836019558) {
            l(container);
        } else {
            if (this.m.isEmpty()) {
                return;
            }
            this.m.peek().d(container);
        }
    }

    private void j(ParsableByteArray atom) {
        long jScaleLargeTimestamp;
        String str;
        long jScaleLargeTimestamp2;
        String str2;
        long unsignedInt;
        long jAdjustSampleTimestamp;
        if (this.F.length == 0) {
            return;
        }
        atom.setPosition(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(atom.readInt());
        if (iC == 0) {
            String str3 = (String) Assertions.checkNotNull(atom.readNullTerminatedString());
            String str4 = (String) Assertions.checkNotNull(atom.readNullTerminatedString());
            long unsignedInt2 = atom.readUnsignedInt();
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(atom.readUnsignedInt(), 1000000L, unsignedInt2);
            long j = this.y;
            long j2 = j != C.TIME_UNSET ? j + jScaleLargeTimestamp : -9223372036854775807L;
            str = str3;
            jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(atom.readUnsignedInt(), 1000L, unsignedInt2);
            str2 = str4;
            unsignedInt = atom.readUnsignedInt();
            jAdjustSampleTimestamp = j2;
        } else {
            if (iC != 1) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Skipping unsupported emsg version: ");
                sb.append(iC);
                Log.w(I, sb.toString());
                return;
            }
            long unsignedInt3 = atom.readUnsignedInt();
            jAdjustSampleTimestamp = Util.scaleLargeTimestamp(atom.readUnsignedLongToLong(), 1000000L, unsignedInt3);
            long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(atom.readUnsignedInt(), 1000L, unsignedInt3);
            long unsignedInt4 = atom.readUnsignedInt();
            str = (String) Assertions.checkNotNull(atom.readNullTerminatedString());
            jScaleLargeTimestamp2 = jScaleLargeTimestamp3;
            unsignedInt = unsignedInt4;
            str2 = (String) Assertions.checkNotNull(atom.readNullTerminatedString());
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        byte[] bArr = new byte[atom.bytesLeft()];
        atom.readBytes(bArr, 0, atom.bytesLeft());
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.k.encode(new EventMessage(str, str2, jScaleLargeTimestamp2, unsignedInt, bArr)));
        int iBytesLeft = parsableByteArray.bytesLeft();
        for (TrackOutput trackOutput : this.F) {
            parsableByteArray.setPosition(0);
            trackOutput.sampleData(parsableByteArray, iBytesLeft);
        }
        if (jAdjustSampleTimestamp == C.TIME_UNSET) {
            this.n.addLast(new a(jScaleLargeTimestamp, iBytesLeft));
            this.v += iBytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster = this.j;
        if (timestampAdjuster != null) {
            jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        for (TrackOutput trackOutput2 : this.F) {
            trackOutput2.sampleMetadata(jAdjustSampleTimestamp, 1, iBytesLeft, 0, null);
        }
    }

    private void k(com.google.android.exoplayer2.extractor.mp4.a.b leaf, long inputPosition) throws ParserException {
        if (!this.m.isEmpty()) {
            this.m.peek().e(leaf);
            return;
        }
        int i = leaf.a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                j(leaf.y1);
            }
        } else {
            Pair<Long, ChunkIndex> pairV = v(leaf.y1, inputPosition);
            this.y = ((Long) pairV.first).longValue();
            this.E.seekMap((SeekMap) pairV.second);
            this.H = true;
        }
    }

    private void l(com.google.android.exoplayer2.extractor.mp4.a.C0147a moof) throws ParserException {
        p(moof, this.d, this.b != null, this.a, this.h);
        DrmInitData drmInitDataE = e(moof.z1);
        if (drmInitDataE != null) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                this.d.valueAt(i).n(drmInitDataE);
            }
        }
        if (this.w != C.TIME_UNSET) {
            int size2 = this.d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.d.valueAt(i2).l(this.w);
            }
            this.w = C.TIME_UNSET;
        }
    }

    private void m(com.google.android.exoplayer2.extractor.mp4.a.C0147a moov) throws ParserException {
        int i = 0;
        Assertions.checkState(this.b == null, "Unexpected moov box.");
        DrmInitData drmInitDataE = e(moov.z1);
        com.google.android.exoplayer2.extractor.mp4.a.C0147a c0147a = (com.google.android.exoplayer2.extractor.mp4.a.C0147a) Assertions.checkNotNull(moov.g(com.google.android.exoplayer2.extractor.mp4.a.n0));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0147a.z1.size();
        long jO = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = c0147a.z1.get(i2);
            int i3 = bVar.a;
            if (i3 == 1953654136) {
                Pair<Integer, c> pairZ = z(bVar.y1);
                sparseArray.put(((Integer) pairZ.first).intValue(), (c) pairZ.second);
            } else if (i3 == 1835362404) {
                jO = o(bVar.y1);
            }
        }
        List<h> listZ = com.google.android.exoplayer2.extractor.mp4.b.z(moov, new GaplessInfoHolder(), jO, drmInitDataE, (this.a & 16) != 0, false, new Function() { // from class: aa2
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return this.a.modifyTrack((Track) obj);
            }
        });
        int size2 = listZ.size();
        if (this.d.size() != 0) {
            Assertions.checkState(this.d.size() == size2);
            while (i < size2) {
                h hVar = listZ.get(i);
                Track track = hVar.a;
                this.d.get(track.id).j(hVar, d(sparseArray, track.id));
                i++;
            }
            return;
        }
        while (i < size2) {
            h hVar2 = listZ.get(i);
            Track track2 = hVar2.a;
            this.d.put(track2.id, new b(this.E.track(i, track2.type), hVar2, d(sparseArray, track2.id)));
            this.x = Math.max(this.x, track2.durationUs);
            i++;
        }
        this.E.endTracks();
    }

    private void n(long sampleTimeUs) {
        while (!this.n.isEmpty()) {
            a aVarRemoveFirst = this.n.removeFirst();
            this.v -= aVarRemoveFirst.b;
            long jAdjustSampleTimestamp = aVarRemoveFirst.a + sampleTimeUs;
            TimestampAdjuster timestampAdjuster = this.j;
            if (timestampAdjuster != null) {
                jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            for (TrackOutput trackOutput : this.F) {
                trackOutput.sampleMetadata(jAdjustSampleTimestamp, 1, aVarRemoveFirst.b, this.v, null);
            }
        }
    }

    private static long o(ParsableByteArray mehd) {
        mehd.setPosition(8);
        return com.google.android.exoplayer2.extractor.mp4.a.c(mehd.readInt()) == 0 ? mehd.readUnsignedInt() : mehd.readUnsignedLongToLong();
    }

    private static void p(com.google.android.exoplayer2.extractor.mp4.a.C0147a moof, SparseArray<b> trackBundles, boolean haveSideloadedTrack, int flags, byte[] extendedTypeScratch) throws ParserException {
        int size = moof.A1.size();
        for (int i = 0; i < size; i++) {
            com.google.android.exoplayer2.extractor.mp4.a.C0147a c0147a = moof.A1.get(i);
            if (c0147a.a == 1953653094) {
                y(c0147a, trackBundles, haveSideloadedTrack, flags, extendedTypeScratch);
            }
        }
    }

    private static void q(ParsableByteArray saio, g out) throws ParserException {
        saio.setPosition(8);
        int i = saio.readInt();
        if ((com.google.android.exoplayer2.extractor.mp4.a.b(i) & 1) == 1) {
            saio.skipBytes(8);
        }
        int unsignedIntToInt = saio.readUnsignedIntToInt();
        if (unsignedIntToInt == 1) {
            out.d += com.google.android.exoplayer2.extractor.mp4.a.c(i) == 0 ? saio.readUnsignedInt() : saio.readUnsignedLongToLong();
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Unexpected saio entry count: ");
            sb.append(unsignedIntToInt);
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }
    }

    private static void r(TrackEncryptionBox encryptionBox, ParsableByteArray saiz, g out) throws ParserException {
        int i;
        int i2 = encryptionBox.perSampleIvSize;
        saiz.setPosition(8);
        if ((com.google.android.exoplayer2.extractor.mp4.a.b(saiz.readInt()) & 1) == 1) {
            saiz.skipBytes(8);
        }
        int unsignedByte = saiz.readUnsignedByte();
        int unsignedIntToInt = saiz.readUnsignedIntToInt();
        int i3 = out.f;
        if (unsignedIntToInt > i3) {
            StringBuilder sb = new StringBuilder(78);
            sb.append("Saiz sample count ");
            sb.append(unsignedIntToInt);
            sb.append(" is greater than fragment sample count");
            sb.append(i3);
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }
        if (unsignedByte == 0) {
            boolean[] zArr = out.n;
            i = 0;
            for (int i4 = 0; i4 < unsignedIntToInt; i4++) {
                int unsignedByte2 = saiz.readUnsignedByte();
                i += unsignedByte2;
                zArr[i4] = unsignedByte2 > i2;
            }
        } else {
            i = (unsignedByte * unsignedIntToInt) + 0;
            Arrays.fill(out.n, 0, unsignedIntToInt, unsignedByte > i2);
        }
        Arrays.fill(out.n, unsignedIntToInt, out.f, false);
        if (i > 0) {
            out.d(i);
        }
    }

    private static void s(com.google.android.exoplayer2.extractor.mp4.a.C0147a traf, @Nullable String schemeType, g out) throws ParserException {
        byte[] bArr = null;
        ParsableByteArray parsableByteArray = null;
        ParsableByteArray parsableByteArray2 = null;
        for (int i = 0; i < traf.z1.size(); i++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = traf.z1.get(i);
            ParsableByteArray parsableByteArray3 = bVar.y1;
            int i2 = bVar.a;
            if (i2 == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == J) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (i2 == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == J) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (iC == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int iC2 = com.google.android.exoplayer2.extractor.mp4.a.c(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        if (iC2 == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int i3 = (unsignedByte & 240) >> 4;
        int i4 = unsignedByte & 15;
        boolean z = parsableByteArray2.readUnsignedByte() == 1;
        if (z) {
            int unsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (unsignedByte2 == 0) {
                int unsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[unsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, unsignedByte3);
            }
            out.m = true;
            out.o = new TrackEncryptionBox(z, schemeType, unsignedByte2, bArr2, i3, i4, bArr);
        }
    }

    private static void t(ParsableByteArray senc, int offset, g out) throws ParserException {
        senc.setPosition(offset + 8);
        int iB = com.google.android.exoplayer2.extractor.mp4.a.b(senc.readInt());
        if ((iB & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iB & 2) != 0;
        int unsignedIntToInt = senc.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            Arrays.fill(out.n, 0, out.f, false);
            return;
        }
        int i = out.f;
        if (unsignedIntToInt == i) {
            Arrays.fill(out.n, 0, unsignedIntToInt, z);
            out.d(senc.bytesLeft());
            out.b(senc);
        } else {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(unsignedIntToInt);
            sb.append(" is different from fragment sample count");
            sb.append(i);
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }
    }

    private static void u(ParsableByteArray senc, g out) throws ParserException {
        t(senc, 0, out);
    }

    private static Pair<Long, ChunkIndex> v(ParsableByteArray atom, long inputPosition) throws ParserException {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        atom.setPosition(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(atom.readInt());
        atom.skipBytes(4);
        long unsignedInt = atom.readUnsignedInt();
        if (iC == 0) {
            unsignedLongToLong = atom.readUnsignedInt();
            unsignedLongToLong2 = atom.readUnsignedInt();
        } else {
            unsignedLongToLong = atom.readUnsignedLongToLong();
            unsignedLongToLong2 = atom.readUnsignedLongToLong();
        }
        long j = unsignedLongToLong;
        long j2 = inputPosition + unsignedLongToLong2;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, unsignedInt);
        atom.skipBytes(2);
        int unsignedShort = atom.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j3 = j;
        long j4 = jScaleLargeTimestamp;
        int i = 0;
        while (i < unsignedShort) {
            int i2 = atom.readInt();
            if ((i2 & Integer.MIN_VALUE) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long unsignedInt2 = atom.readUnsignedInt();
            iArr[i] = i2 & Integer.MAX_VALUE;
            jArr[i] = j2;
            jArr3[i] = j4;
            long j5 = j3 + unsignedInt2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i3 = unsignedShort;
            int[] iArr2 = iArr;
            long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(j5, 1000000L, unsignedInt);
            jArr4[i] = jScaleLargeTimestamp2 - jArr5[i];
            atom.skipBytes(4);
            j2 += (long) iArr2[i];
            i++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            unsignedShort = i3;
            j3 = j5;
            j4 = jScaleLargeTimestamp2;
        }
        return Pair.create(Long.valueOf(jScaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long w(ParsableByteArray tfdt) {
        tfdt.setPosition(8);
        return com.google.android.exoplayer2.extractor.mp4.a.c(tfdt.readInt()) == 1 ? tfdt.readUnsignedLongToLong() : tfdt.readUnsignedInt();
    }

    @Nullable
    private static b x(ParsableByteArray tfhd, SparseArray<b> trackBundles, boolean haveSideloadedTrack) {
        tfhd.setPosition(8);
        int iB = com.google.android.exoplayer2.extractor.mp4.a.b(tfhd.readInt());
        b bVarValueAt = haveSideloadedTrack ? trackBundles.valueAt(0) : trackBundles.get(tfhd.readInt());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long unsignedLongToLong = tfhd.readUnsignedLongToLong();
            g gVar = bVarValueAt.b;
            gVar.c = unsignedLongToLong;
            gVar.d = unsignedLongToLong;
        }
        c cVar = bVarValueAt.e;
        bVarValueAt.b.a = new c((iB & 2) != 0 ? tfhd.readInt() - 1 : cVar.a, (iB & 8) != 0 ? tfhd.readInt() : cVar.b, (iB & 16) != 0 ? tfhd.readInt() : cVar.c, (iB & 32) != 0 ? tfhd.readInt() : cVar.d);
        return bVarValueAt;
    }

    private static void y(com.google.android.exoplayer2.extractor.mp4.a.C0147a traf, SparseArray<b> trackBundles, boolean haveSideloadedTrack, int flags, byte[] extendedTypeScratch) throws ParserException {
        b bVarX = x(((com.google.android.exoplayer2.extractor.mp4.a.b) Assertions.checkNotNull(traf.h(com.google.android.exoplayer2.extractor.mp4.a.Z))).y1, trackBundles, haveSideloadedTrack);
        if (bVarX == null) {
            return;
        }
        g gVar = bVarX.b;
        long j = gVar.r;
        boolean z = gVar.s;
        bVarX.k();
        bVarX.l = true;
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = traf.h(com.google.android.exoplayer2.extractor.mp4.a.Y);
        if (bVarH == null || (flags & 2) != 0) {
            gVar.r = j;
            gVar.s = z;
        } else {
            gVar.r = w(bVarH.y1);
            gVar.s = true;
        }
        B(traf, bVarX, flags);
        TrackEncryptionBox sampleDescriptionEncryptionBox = bVarX.d.a.getSampleDescriptionEncryptionBox(((c) Assertions.checkNotNull(gVar.a)).a);
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH2 = traf.h(com.google.android.exoplayer2.extractor.mp4.a.D0);
        if (bVarH2 != null) {
            r((TrackEncryptionBox) Assertions.checkNotNull(sampleDescriptionEncryptionBox), bVarH2.y1, gVar);
        }
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH3 = traf.h(com.google.android.exoplayer2.extractor.mp4.a.E0);
        if (bVarH3 != null) {
            q(bVarH3.y1, gVar);
        }
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH4 = traf.h(com.google.android.exoplayer2.extractor.mp4.a.I0);
        if (bVarH4 != null) {
            u(bVarH4.y1, gVar);
        }
        s(traf, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, gVar);
        int size = traf.z1.size();
        for (int i = 0; i < size; i++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = traf.z1.get(i);
            if (bVar.a == 1970628964) {
                C(bVar.y1, gVar, extendedTypeScratch);
            }
        }
    }

    private static Pair<Integer, c> z(ParsableByteArray trex) {
        trex.setPosition(12);
        return Pair.create(Integer.valueOf(trex.readInt()), new c(trex.readInt() - 1, trex.readInt(), trex.readInt(), trex.readInt()));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.E = output;
        c();
        g();
        Track track = this.b;
        if (track != null) {
            this.d.put(0, new b(output.track(0, track.type), new h(this.b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.endTracks();
        }
    }

    @Nullable
    public Track modifyTrack(@Nullable Track track) {
        return track;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        while (true) {
            int i = this.p;
            if (i != 0) {
                if (i == 1) {
                    F(input);
                } else if (i == 2) {
                    G(input);
                } else if (H(input)) {
                    return 0;
                }
            } else if (!E(input)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.valueAt(i).k();
        }
        this.n.clear();
        this.v = 0;
        this.w = timeUs;
        this.m.clear();
        c();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        return f.b(input);
    }

    public FragmentedMp4Extractor(int flags) {
        this(flags, null);
    }

    public FragmentedMp4Extractor(int flags, @Nullable TimestampAdjuster timestampAdjuster) {
        this(flags, timestampAdjuster, null, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int flags, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track sideloadedTrack) {
        this(flags, timestampAdjuster, sideloadedTrack, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int flags, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track sideloadedTrack, List<Format> closedCaptionFormats) {
        this(flags, timestampAdjuster, sideloadedTrack, closedCaptionFormats, null);
    }

    public FragmentedMp4Extractor(int flags, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track sideloadedTrack, List<Format> closedCaptionFormats, @Nullable TrackOutput additionalEmsgTrackOutput) {
        this.a = flags;
        this.j = timestampAdjuster;
        this.b = sideloadedTrack;
        this.c = Collections.unmodifiableList(closedCaptionFormats);
        this.o = additionalEmsgTrackOutput;
        this.k = new EventMessageEncoder();
        this.l = new ParsableByteArray(16);
        this.e = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.f = new ParsableByteArray(5);
        this.g = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new ParsableByteArray(bArr);
        this.m = new ArrayDeque<>();
        this.n = new ArrayDeque<>();
        this.d = new SparseArray<>();
        this.x = C.TIME_UNSET;
        this.w = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.E = ExtractorOutput.PLACEHOLDER;
        this.F = new TrackOutput[0];
        this.G = new TrackOutput[0];
    }
}

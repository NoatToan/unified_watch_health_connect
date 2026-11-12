package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Function;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Mp4Extractor implements Extractor, SeekMap {
    private static final int A = 2;
    private static final int B = 3;
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 2;
    private static final long F = 262144;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: a95
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp4Extractor.i();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long G = 10485760;
    private static final int y = 0;
    private static final int z = 1;
    private final int a;
    private final ParsableByteArray b;
    private final ParsableByteArray c;
    private final ParsableByteArray d;
    private final ParsableByteArray e;
    private final ArrayDeque<com.google.android.exoplayer2.extractor.mp4.a.C0147a> f;
    private final e g;
    private final List<Metadata.Entry> h;
    private int i;
    private int j;
    private long k;
    private int l;

    @Nullable
    private ParsableByteArray m;
    private int n;
    private int o;
    private int p;
    private int q;
    private ExtractorOutput r;
    private a[] s;
    private long[][] t;
    private int u;
    private long v;
    private int w;

    @Nullable
    private MotionPhotoMetadata x;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class a {
        public final Track a;
        public final h b;
        public final TrackOutput c;
        public int d;

        public a(Track track, h sampleTable, TrackOutput trackOutput) {
            this.a = track;
            this.b = sampleTable;
            this.c = trackOutput;
        }
    }

    public Mp4Extractor() {
        this(0);
    }

    private static int c(int brand) {
        if (brand != 1751476579) {
            return brand != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] d(a[] tracks) {
        long[][] jArr = new long[tracks.length][];
        int[] iArr = new int[tracks.length];
        long[] jArr2 = new long[tracks.length];
        boolean[] zArr = new boolean[tracks.length];
        for (int i = 0; i < tracks.length; i++) {
            jArr[i] = new long[tracks[i].b.b];
            jArr2[i] = tracks[i].b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < tracks.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < tracks.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) tracks[i3].b.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = tracks[i3].b.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private void e() {
        this.i = 0;
        this.l = 0;
    }

    private static int f(h sampleTable, long timeUs) {
        int iA = sampleTable.a(timeUs);
        return iA == -1 ? sampleTable.b(timeUs) : iA;
    }

    private int g(long inputPosition) {
        int i = -1;
        int i2 = -1;
        long j = Long.MAX_VALUE;
        boolean z2 = true;
        long j2 = Long.MAX_VALUE;
        boolean z3 = true;
        long j3 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((a[]) Util.castNonNull(this.s)).length; i3++) {
            a aVar = this.s[i3];
            int i4 = aVar.d;
            h hVar = aVar.b;
            if (i4 != hVar.b) {
                long j4 = hVar.c[i4];
                long j5 = ((long[][]) Util.castNonNull(this.t))[i3][i4];
                long j6 = j4 - inputPosition;
                boolean z4 = j6 < 0 || j6 >= 262144;
                if ((!z4 && z3) || (z4 == z3 && j6 < j3)) {
                    z3 = z4;
                    j3 = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j) {
                    z2 = z4;
                    i = i3;
                    j = j5;
                }
            }
        }
        return (j == Long.MAX_VALUE || !z2 || j2 < j + G) ? i2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Track h(Track track) {
        return track;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] i() {
        return new Extractor[]{new Mp4Extractor()};
    }

    private static long j(h sampleTable, long seekTimeUs, long offset) {
        int iF = f(sampleTable, seekTimeUs);
        return iF == -1 ? offset : Math.min(sampleTable.c[iF], offset);
    }

    private void k(ExtractorInput input) throws IOException {
        this.d.reset(8);
        input.peekFully(this.d.getData(), 0, 8);
        b.d(this.d);
        input.skipFully(this.d.getPosition());
        input.resetPeekPosition();
    }

    private void l(long atomEndPosition) throws ParserException {
        while (!this.f.isEmpty() && this.f.peek().y1 == atomEndPosition) {
            com.google.android.exoplayer2.extractor.mp4.a.C0147a c0147aPop = this.f.pop();
            if (c0147aPop.a == 1836019574) {
                o(c0147aPop);
                this.f.clear();
                this.i = 2;
            } else if (!this.f.isEmpty()) {
                this.f.peek().d(c0147aPop);
            }
        }
        if (this.i != 2) {
            e();
        }
    }

    private void m() {
        if (this.w != 2 || (this.a & 2) == 0) {
            return;
        }
        ExtractorOutput extractorOutput = (ExtractorOutput) Assertions.checkNotNull(this.r);
        extractorOutput.track(0, 4).format(new Format.Builder().setMetadata(this.x == null ? null : new Metadata(this.x)).build());
        extractorOutput.endTracks();
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    private static int n(ParsableByteArray atomData) {
        atomData.setPosition(8);
        int iC = c(atomData.readInt());
        if (iC != 0) {
            return iC;
        }
        atomData.skipBytes(4);
        while (atomData.bytesLeft() > 0) {
            int iC2 = c(atomData.readInt());
            if (iC2 != 0) {
                return iC2;
            }
        }
        return 0;
    }

    private void o(com.google.android.exoplayer2.extractor.mp4.a.C0147a moov) throws ParserException {
        Metadata metadata;
        Metadata metadata2;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = this.w == 1;
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = moov.h(com.google.android.exoplayer2.extractor.mp4.a.b1);
        if (bVarH != null) {
            Pair<Metadata, Metadata> pairA = b.A(bVarH);
            Metadata metadata3 = (Metadata) pairA.first;
            Metadata metadata4 = (Metadata) pairA.second;
            if (metadata3 != null) {
                gaplessInfoHolder.setFromMetadata(metadata3);
            }
            metadata = metadata4;
            metadata2 = metadata3;
        } else {
            metadata = null;
            metadata2 = null;
        }
        com.google.android.exoplayer2.extractor.mp4.a.C0147a c0147aG = moov.g(com.google.android.exoplayer2.extractor.mp4.a.c1);
        Metadata metadataM = c0147aG != null ? b.m(c0147aG) : null;
        List<h> listZ = b.z(moov, gaplessInfoHolder, C.TIME_UNSET, null, (this.a & 1) != 0, z2, new Function() { // from class: b95
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Mp4Extractor.h((Track) obj);
            }
        });
        ExtractorOutput extractorOutput = (ExtractorOutput) Assertions.checkNotNull(this.r);
        int i2 = 0;
        int size = -1;
        long j = C.TIME_UNSET;
        for (int size2 = listZ.size(); i2 < size2; size2 = size2) {
            h hVar = listZ.get(i2);
            if (hVar.b == 0) {
                arrayList = arrayList2;
            } else {
                Track track = hVar.a;
                int i3 = size;
                arrayList = arrayList2;
                long j2 = track.durationUs;
                if (j2 == C.TIME_UNSET) {
                    j2 = hVar.h;
                }
                long jMax = Math.max(j, j2);
                a aVar = new a(track, hVar, extractorOutput.track(i2, track.type));
                int i4 = hVar.e + 30;
                Format.Builder builderBuildUpon = track.format.buildUpon();
                builderBuildUpon.setMaxInputSize(i4);
                if (track.type == 2 && j2 > 0 && (i = hVar.b) > 1) {
                    builderBuildUpon.setFrameRate(i / (j2 / 1000000.0f));
                }
                d.k(track.type, gaplessInfoHolder, builderBuildUpon);
                int i5 = track.type;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.h.isEmpty() ? null : new Metadata(this.h);
                d.l(i5, metadata2, metadataM, builderBuildUpon, metadataArr);
                aVar.c.format(builderBuildUpon.build());
                size = (track.type == 2 && i3 == -1) ? arrayList.size() : i3;
                arrayList.add(aVar);
                j = jMax;
            }
            i2++;
            arrayList2 = arrayList;
            listZ = listZ;
        }
        this.u = size;
        this.v = j;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.s = aVarArr;
        this.t = d(aVarArr);
        extractorOutput.endTracks();
        extractorOutput.seekMap(this);
    }

    private void p(long atomStartPosition) {
        if (this.j == 1836086884) {
            int i = this.l;
            this.x = new MotionPhotoMetadata(0L, atomStartPosition, C.TIME_UNSET, atomStartPosition + ((long) i), this.k - ((long) i));
        }
    }

    private boolean q(ExtractorInput input) throws IOException {
        com.google.android.exoplayer2.extractor.mp4.a.C0147a c0147aPeek;
        if (this.l == 0) {
            if (!input.readFully(this.e.getData(), 0, 8, true)) {
                m();
                return false;
            }
            this.l = 8;
            this.e.setPosition(0);
            this.k = this.e.readUnsignedInt();
            this.j = this.e.readInt();
        }
        long j = this.k;
        if (j == 1) {
            input.readFully(this.e.getData(), 8, 8);
            this.l += 8;
            this.k = this.e.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = input.getLength();
            if (length == -1 && (c0147aPeek = this.f.peek()) != null) {
                length = c0147aPeek.y1;
            }
            if (length != -1) {
                this.k = (length - input.getPosition()) + ((long) this.l);
            }
        }
        if (this.k < this.l) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (u(this.j)) {
            long position = input.getPosition();
            long j2 = this.k;
            int i = this.l;
            long j3 = (position + j2) - ((long) i);
            if (j2 != i && this.j == 1835365473) {
                k(input);
            }
            this.f.push(new com.google.android.exoplayer2.extractor.mp4.a.C0147a(this.j, j3));
            if (this.k == this.l) {
                l(j3);
            } else {
                e();
            }
        } else if (v(this.j)) {
            Assertions.checkState(this.l == 8);
            Assertions.checkState(this.k <= ParserMinimalBase.MAX_INT_L);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.k);
            System.arraycopy(this.e.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.m = parsableByteArray;
            this.i = 1;
        } else {
            p(input.getPosition() - ((long) this.l));
            this.m = null;
            this.i = 1;
        }
        return true;
    }

    private boolean r(ExtractorInput input, PositionHolder positionHolder) throws IOException {
        boolean z2;
        long j = this.k - ((long) this.l);
        long position = input.getPosition() + j;
        ParsableByteArray parsableByteArray = this.m;
        if (parsableByteArray == null) {
            if (j < 262144) {
                input.skipFully((int) j);
            } else {
                positionHolder.position = input.getPosition() + j;
                z2 = true;
            }
            l(position);
            return (z2 || this.i == 2) ? false : true;
        }
        input.readFully(parsableByteArray.getData(), this.l, (int) j);
        if (this.j == 1718909296) {
            this.w = n(parsableByteArray);
        } else if (!this.f.isEmpty()) {
            this.f.peek().e(new com.google.android.exoplayer2.extractor.mp4.a.b(this.j, parsableByteArray));
        }
        z2 = false;
        l(position);
        if (z2) {
        }
    }

    private int s(ExtractorInput input, PositionHolder positionHolder) throws IOException {
        long position = input.getPosition();
        if (this.n == -1) {
            int iG = g(position);
            this.n = iG;
            if (iG == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) Util.castNonNull(this.s))[this.n];
        TrackOutput trackOutput = aVar.c;
        int i = aVar.d;
        h hVar = aVar.b;
        long j = hVar.c[i];
        int i2 = hVar.d[i];
        long j2 = (j - position) + ((long) this.o);
        if (j2 < 0 || j2 >= 262144) {
            positionHolder.position = j;
            return 1;
        }
        if (aVar.a.sampleTransformation == 1) {
            j2 += 8;
            i2 -= 8;
        }
        input.skipFully((int) j2);
        Track track = aVar.a;
        if (track.nalUnitLengthFieldLength == 0) {
            if (MimeTypes.AUDIO_AC4.equals(track.format.sampleMimeType)) {
                if (this.p == 0) {
                    Ac4Util.getAc4SampleHeader(i2, this.d);
                    trackOutput.sampleData(this.d, 7);
                    this.p += 7;
                }
                i2 += 7;
            }
            while (true) {
                int i3 = this.p;
                if (i3 >= i2) {
                    break;
                }
                int iSampleData = trackOutput.sampleData((DataReader) input, i2 - i3, false);
                this.o += iSampleData;
                this.p += iSampleData;
                this.q -= iSampleData;
            }
        } else {
            byte[] data = this.c.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i4 = aVar.a.nalUnitLengthFieldLength;
            int i5 = 4 - i4;
            while (this.p < i2) {
                int i6 = this.q;
                if (i6 == 0) {
                    input.readFully(data, i5, i4);
                    this.o += i4;
                    this.c.setPosition(0);
                    int i7 = this.c.readInt();
                    if (i7 < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.q = i7;
                    this.b.setPosition(0);
                    trackOutput.sampleData(this.b, 4);
                    this.p += 4;
                    i2 += i5;
                } else {
                    int iSampleData2 = trackOutput.sampleData((DataReader) input, i6, false);
                    this.o += iSampleData2;
                    this.p += iSampleData2;
                    this.q -= iSampleData2;
                }
            }
        }
        h hVar2 = aVar.b;
        trackOutput.sampleMetadata(hVar2.f[i], hVar2.g[i], i2, 0, null);
        aVar.d++;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        return 0;
    }

    private int t(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        int iC = this.g.c(input, seekPosition, this.h);
        if (iC == 1 && seekPosition.position == 0) {
            e();
        }
        return iC;
    }

    private static boolean u(int atom) {
        return atom == 1836019574 || atom == 1953653099 || atom == 1835297121 || atom == 1835626086 || atom == 1937007212 || atom == 1701082227 || atom == 1835365473;
    }

    private static boolean v(int atom) {
        return atom == 1835296868 || atom == 1836476516 || atom == 1751411826 || atom == 1937011556 || atom == 1937011827 || atom == 1937011571 || atom == 1668576371 || atom == 1701606260 || atom == 1937011555 || atom == 1937011578 || atom == 1937013298 || atom == 1937007471 || atom == 1668232756 || atom == 1953196132 || atom == 1718909296 || atom == 1969517665 || atom == 1801812339 || atom == 1768715124;
    }

    @RequiresNonNull({"tracks"})
    private void w(long timeUs) {
        for (a aVar : this.s) {
            h hVar = aVar.b;
            int iA = hVar.a(timeUs);
            if (iA == -1) {
                iA = hVar.b(timeUs);
            }
            aVar.d = iA;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.v;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        long j;
        long j2;
        long j3;
        long j4;
        int iB;
        if (((a[]) Assertions.checkNotNull(this.s)).length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int i = this.u;
        if (i != -1) {
            h hVar = this.s[i].b;
            int iF = f(hVar, timeUs);
            if (iF == -1) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            long j5 = hVar.f[iF];
            j = hVar.c[iF];
            if (j5 >= timeUs || iF >= hVar.b - 1 || (iB = hVar.b(timeUs)) == -1 || iB == iF) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = hVar.f[iB];
                j4 = hVar.c[iB];
            }
            j2 = j4;
            timeUs = j5;
        } else {
            j = Long.MAX_VALUE;
            j2 = -1;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.s;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.u) {
                h hVar2 = aVarArr[i2].b;
                long j6 = j(hVar2, timeUs, j);
                if (j3 != C.TIME_UNSET) {
                    j2 = j(hVar2, j3, j2);
                }
                j = j6;
            }
            i2++;
        }
        SeekPoint seekPoint = new SeekPoint(timeUs, j);
        return j3 == C.TIME_UNSET ? new SeekMap.SeekPoints(seekPoint) : new SeekMap.SeekPoints(seekPoint, new SeekPoint(j3, j2));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.r = output;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        while (true) {
            int i = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return s(input, seekPosition);
                    }
                    if (i == 3) {
                        return t(input, seekPosition);
                    }
                    throw new IllegalStateException();
                }
                if (r(input, seekPosition)) {
                    return 1;
                }
            } else if (!q(input)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (position != 0) {
            if (this.s != null) {
                w(timeUs);
            }
        } else if (this.i != 3) {
            e();
        } else {
            this.g.g();
            this.h.clear();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        return f.e(input, (this.a & 2) != 0);
    }

    public Mp4Extractor(int flags) {
        this.a = flags;
        this.i = (flags & 4) != 0 ? 3 : 0;
        this.g = new e();
        this.h = new ArrayList();
        this.e = new ParsableByteArray(16);
        this.f = new ArrayDeque<>();
        this.b = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.c = new ParsableByteArray(4);
        this.d = new ParsableByteArray();
        this.n = -1;
    }
}

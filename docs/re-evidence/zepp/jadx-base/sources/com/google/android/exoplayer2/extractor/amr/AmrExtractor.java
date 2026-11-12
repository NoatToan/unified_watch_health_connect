package com.google.android.exoplayer2.extractor.amr;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AmrExtractor implements Extractor {
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    private static final int[] q;
    private static final int t;
    private static final int u = 20;
    private static final int v = 16000;
    private static final int w = 8000;
    private static final int x = 20000;
    private final byte[] a;
    private final int b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private long k;
    private ExtractorOutput l;
    private TrackOutput m;
    private SeekMap n;
    private boolean o;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: ic
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return AmrExtractor.m();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    private static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] r = Util.getUtf8Bytes("#!AMR\n");
    private static final byte[] s = Util.getUtf8Bytes("#!AMR-WB\n");

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        t = iArr[8];
    }

    public AmrExtractor() {
        this(0);
    }

    public static byte[] b() {
        byte[] bArr = r;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static byte[] c() {
        byte[] bArr = s;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void d() {
        Assertions.checkStateNotNull(this.m);
        Util.castNonNull(this.l);
    }

    public static int e(int frameType) {
        return p[frameType];
    }

    public static int f(int frameType) {
        return q[frameType];
    }

    private static int g(int frameSize, long durationUsPerFrame) {
        return (int) ((((long) (frameSize * 8)) * 1000000) / durationUsPerFrame);
    }

    private SeekMap h(long inputLength) {
        return new ConstantBitrateSeekMap(inputLength, this.h, g(this.i, 20000L), this.i);
    }

    private int i(int frameType) throws ParserException {
        if (k(frameType)) {
            return this.c ? q[frameType] : p[frameType];
        }
        String str = this.c ? "WB" : "NB";
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("Illegal AMR ");
        sb.append(str);
        sb.append(" frame type ");
        sb.append(frameType);
        throw ParserException.createForMalformedContainer(sb.toString(), null);
    }

    private boolean j(int frameType) {
        return !this.c && (frameType < 12 || frameType > 14);
    }

    private boolean k(int frameType) {
        return frameType >= 0 && frameType <= 15 && (l(frameType) || j(frameType));
    }

    private boolean l(int frameType) {
        return this.c && (frameType < 10 || frameType > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] m() {
        return new Extractor[]{new AmrExtractor()};
    }

    @RequiresNonNull({"trackOutput"})
    private void n() {
        if (this.o) {
            return;
        }
        this.o = true;
        boolean z = this.c;
        this.m.format(new Format.Builder().setSampleMimeType(z ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB).setMaxInputSize(t).setChannelCount(1).setSampleRate(z ? 16000 : 8000).build());
    }

    @RequiresNonNull({"extractorOutput"})
    private void o(long inputLength, int sampleReadResult) {
        int i;
        if (this.g) {
            return;
        }
        if ((this.b & 1) == 0 || inputLength == -1 || !((i = this.i) == -1 || i == this.e)) {
            SeekMap.Unseekable unseekable = new SeekMap.Unseekable(C.TIME_UNSET);
            this.n = unseekable;
            this.l.seekMap(unseekable);
            this.g = true;
            return;
        }
        if (this.j >= 20 || sampleReadResult == -1) {
            SeekMap seekMapH = h(inputLength);
            this.n = seekMapH;
            this.l.seekMap(seekMapH);
            this.g = true;
        }
    }

    private static boolean p(ExtractorInput input, byte[] amrSignature) throws IOException {
        input.resetPeekPosition();
        byte[] bArr = new byte[amrSignature.length];
        input.peekFully(bArr, 0, amrSignature.length);
        return Arrays.equals(bArr, amrSignature);
    }

    private int q(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.a, 0, 1);
        byte b = this.a[0];
        if ((b & 131) <= 0) {
            return i((b >> 3) & 15);
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("Invalid padding bits for frame header ");
        sb.append((int) b);
        throw ParserException.createForMalformedContainer(sb.toString(), null);
    }

    private boolean r(ExtractorInput input) throws IOException {
        byte[] bArr = r;
        if (p(input, bArr)) {
            this.c = false;
            input.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = s;
        if (!p(input, bArr2)) {
            return false;
        }
        this.c = true;
        input.skipFully(bArr2.length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    private int s(ExtractorInput extractorInput) throws IOException {
        if (this.f == 0) {
            try {
                int iQ = q(extractorInput);
                this.e = iQ;
                this.f = iQ;
                if (this.i == -1) {
                    this.h = extractorInput.getPosition();
                    this.i = this.e;
                }
                if (this.i == this.e) {
                    this.j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iSampleData = this.m.sampleData((DataReader) extractorInput, this.f, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i = this.f - iSampleData;
        this.f = i;
        if (i > 0) {
            return 0;
        }
        this.m.sampleMetadata(this.k + this.d, 1, this.e, 0, null);
        this.d += 20000;
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.l = output;
        this.m = output.track(0, 1);
        output.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        d();
        if (input.getPosition() == 0 && !r(input)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        n();
        int iS = s(input);
        o(input.getLength(), iS);
        return iS;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (position != 0) {
            SeekMap seekMap = this.n;
            if (seekMap instanceof ConstantBitrateSeekMap) {
                this.k = ((ConstantBitrateSeekMap) seekMap).getTimeUsAtPosition(position);
                return;
            }
        }
        this.k = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        return r(input);
    }

    public AmrExtractor(int flags) {
        this.b = flags;
        this.a = new byte[1];
        this.i = -1;
    }
}

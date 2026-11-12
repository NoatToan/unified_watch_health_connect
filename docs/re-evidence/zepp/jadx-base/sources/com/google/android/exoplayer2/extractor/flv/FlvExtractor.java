package com.google.android.exoplayer2.extractor.flv;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.IndexSeekMap;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FlvExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: t92
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return FlvExtractor.d();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 3;
    private static final int t = 4;
    private static final int u = 9;
    private static final int v = 11;
    private static final int w = 8;
    private static final int x = 9;
    private static final int y = 18;
    private static final int z = 4607062;
    private ExtractorOutput f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private a o;
    private c p;
    private final ParsableByteArray a = new ParsableByteArray(4);
    private final ParsableByteArray b = new ParsableByteArray(9);
    private final ParsableByteArray c = new ParsableByteArray(11);
    private final ParsableByteArray d = new ParsableByteArray();
    private final b e = new b();
    private int g = 1;

    @RequiresNonNull({"extractorOutput"})
    private void b() {
        if (this.n) {
            return;
        }
        this.f.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.n = true;
    }

    private long c() {
        if (this.h) {
            return this.i + this.m;
        }
        if (this.e.e() == C.TIME_UNSET) {
            return 0L;
        }
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] d() {
        return new Extractor[]{new FlvExtractor()};
    }

    private ParsableByteArray e(ExtractorInput input) throws IOException {
        if (this.l > this.d.capacity()) {
            ParsableByteArray parsableByteArray = this.d;
            parsableByteArray.reset(new byte[Math.max(parsableByteArray.capacity() * 2, this.l)], 0);
        } else {
            this.d.setPosition(0);
        }
        this.d.setLimit(this.l);
        input.readFully(this.d.getData(), 0, this.l);
        return this.d;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean f(ExtractorInput input) throws IOException {
        if (!input.readFully(this.b.getData(), 0, 9, true)) {
            return false;
        }
        this.b.setPosition(0);
        this.b.skipBytes(4);
        int unsignedByte = this.b.readUnsignedByte();
        boolean z2 = (unsignedByte & 4) != 0;
        boolean z3 = (unsignedByte & 1) != 0;
        if (z2 && this.o == null) {
            this.o = new a(this.f.track(8, 1));
        }
        if (z3 && this.p == null) {
            this.p = new c(this.f.track(9, 2));
        }
        this.f.endTracks();
        this.j = (this.b.readInt() - 9) + 4;
        this.g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @RequiresNonNull({"extractorOutput"})
    private boolean g(ExtractorInput input) throws IOException {
        boolean z2;
        long j;
        long jC = c();
        int i = this.k;
        boolean zA = false;
        if (i == 8 && this.o != null) {
            b();
            zA = this.o.a(e(input), jC);
        } else {
            if (i != 9 || this.p == null) {
                if (i != 18 || this.n) {
                    input.skipFully(this.l);
                    z2 = false;
                } else {
                    zA = this.e.a(e(input), jC);
                    long jE = this.e.e();
                    if (jE != C.TIME_UNSET) {
                        this.f.seekMap(new IndexSeekMap(this.e.f(), this.e.g(), jE));
                        this.n = true;
                    }
                }
                if (!this.h && zA) {
                    this.h = true;
                    if (this.e.e() == C.TIME_UNSET) {
                        j = -this.m;
                    } else {
                        j = 0;
                    }
                    this.i = j;
                }
                this.j = 4;
                this.g = 2;
                return z2;
            }
            b();
            zA = this.p.a(e(input), jC);
        }
        z2 = true;
        if (!this.h) {
            this.h = true;
            if (this.e.e() == C.TIME_UNSET) {
                j = -this.m;
            } else {
                j = 0;
            }
            this.i = j;
        }
        this.j = 4;
        this.g = 2;
        return z2;
    }

    private boolean h(ExtractorInput input) throws IOException {
        if (!input.readFully(this.c.getData(), 0, 11, true)) {
            return false;
        }
        this.c.setPosition(0);
        this.k = this.c.readUnsignedByte();
        this.l = this.c.readUnsignedInt24();
        this.m = this.c.readUnsignedInt24();
        this.m = (((long) (this.c.readUnsignedByte() << 24)) | this.m) * 1000;
        this.c.skipBytes(3);
        this.g = 4;
        return true;
    }

    private void i(ExtractorInput input) throws IOException {
        input.skipFully(this.j);
        this.j = 0;
        this.g = 3;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.f = output;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        Assertions.checkStateNotNull(this.f);
        while (true) {
            int i = this.g;
            if (i != 1) {
                if (i == 2) {
                    i(input);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (g(input)) {
                        return 0;
                    }
                } else if (!h(input)) {
                    return -1;
                }
            } else if (!f(input)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        if (position == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        input.peekFully(this.a.getData(), 0, 3);
        this.a.setPosition(0);
        if (this.a.readUnsignedInt24() != z) {
            return false;
        }
        input.peekFully(this.a.getData(), 0, 2);
        this.a.setPosition(0);
        if ((this.a.readUnsignedShort() & 250) != 0) {
            return false;
        }
        input.peekFully(this.a.getData(), 0, 4);
        this.a.setPosition(0);
        int i = this.a.readInt();
        input.resetPeekPosition();
        input.advancePeekPosition(i);
        input.peekFully(this.a.getData(), 0, 4);
        this.a.setPosition(0);
        return this.a.readInt() == 0;
    }
}

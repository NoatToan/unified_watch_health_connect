package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class a implements e {
    private static final int m = 72000;
    private static final int n = 100000;
    private static final int o = 30000;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 3;
    private static final int t = 4;
    private final d a;
    private final long b;
    private final long c;
    private final g d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public final class b implements SeekMap {
        private b() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return a.this.d.b(a.this.f);
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long timeUs) {
            return new SeekMap.SeekPoints(new SeekPoint(timeUs, Util.constrainValue((a.this.b + ((a.this.d.c(timeUs) * (a.this.c - a.this.b)) / a.this.f)) - 30000, a.this.b, a.this.c - 1)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }
    }

    public a(g streamReader, long payloadStartPosition, long payloadEndPosition, long firstPayloadPageSize, long firstPayloadPageGranulePosition, boolean firstPayloadPageIsLastPage) {
        Assertions.checkArgument(payloadStartPosition >= 0 && payloadEndPosition > payloadStartPosition);
        this.d = streamReader;
        this.b = payloadStartPosition;
        this.c = payloadEndPosition;
        if (firstPayloadPageSize == payloadEndPosition - payloadStartPosition || firstPayloadPageIsLastPage) {
            this.f = firstPayloadPageGranulePosition;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new d();
    }

    private long h(ExtractorInput input) throws IOException {
        if (this.i == this.j) {
            return -1L;
        }
        long position = input.getPosition();
        if (!this.a.d(input, this.j)) {
            long j = this.i;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(input, false);
        input.resetPeekPosition();
        long j2 = this.h;
        d dVar = this.a;
        long j3 = dVar.c;
        long j4 = j2 - j3;
        int i = dVar.h + dVar.i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.j = position;
            this.l = j3;
        } else {
            this.i = input.getPosition() + ((long) i);
            this.k = this.a.c;
        }
        long j5 = this.j;
        long j6 = this.i;
        if (j5 - j6 < com.google.android.exoplayer2.extractor.mp3.b.e) {
            this.j = j6;
            return j6;
        }
        long position2 = input.getPosition() - (((long) i) * (j4 <= 0 ? 2L : 1L));
        long j7 = this.j;
        long j8 = this.i;
        return Util.constrainValue(position2 + ((j4 * (j7 - j8)) / (this.l - this.k)), j8, j7 - 1);
    }

    private void j(ExtractorInput input) throws IOException {
        while (true) {
            this.a.c(input);
            this.a.a(input, false);
            d dVar = this.a;
            if (dVar.c > this.h) {
                input.resetPeekPosition();
                return;
            } else {
                input.skipFully(dVar.h + dVar.i);
                this.i = input.getPosition();
                this.k = this.a.c;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.e
    public void b(long targetGranule) {
        this.h = Util.constrainValue(targetGranule, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.e
    @Nullable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f != 0) {
            return new b();
        }
        return null;
    }

    @VisibleForTesting
    public long i(ExtractorInput input) throws IOException {
        this.a.b();
        if (!this.a.c(input)) {
            throw new EOFException();
        }
        this.a.a(input, false);
        d dVar = this.a;
        input.skipFully(dVar.h + dVar.i);
        long j = this.a.c;
        while (true) {
            d dVar2 = this.a;
            if ((dVar2.b & 4) == 4 || !dVar2.c(input) || input.getPosition() >= this.c || !this.a.a(input, true)) {
                break;
            }
            d dVar3 = this.a;
            if (!ExtractorUtil.skipFullyQuietly(input, dVar3.h + dVar3.i)) {
                break;
            }
            j = this.a.c;
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.e
    public long read(ExtractorInput input) throws IOException {
        int i = this.e;
        if (i == 0) {
            long position = input.getPosition();
            this.g = position;
            this.e = 1;
            long j = this.c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jH = h(input);
                if (jH != -1) {
                    return jH;
                }
                this.e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            j(input);
            this.e = 4;
            return -(this.k + 2);
        }
        this.f = i(input);
        this.e = 4;
        return this.g;
    }
}

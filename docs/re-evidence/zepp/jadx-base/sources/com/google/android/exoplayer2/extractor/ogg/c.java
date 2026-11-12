package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class c {
    private final d a = new d();
    private final ParsableByteArray b = new ParsableByteArray(new byte[d.n], 0);
    private int c = -1;
    private int d;
    private boolean e;

    private int a(int startSegmentIndex) {
        int i;
        int i2 = 0;
        this.d = 0;
        do {
            int i3 = this.d;
            int i4 = startSegmentIndex + i3;
            d dVar = this.a;
            if (i4 >= dVar.g) {
                break;
            }
            int[] iArr = dVar.j;
            this.d = i3 + 1;
            i = iArr[i3 + startSegmentIndex];
            i2 += i;
        } while (i == 255);
        return i2;
    }

    public d b() {
        return this.a;
    }

    public ParsableByteArray c() {
        return this.b;
    }

    public boolean d(ExtractorInput input) throws IOException {
        int i;
        Assertions.checkState(input != null);
        if (this.e) {
            this.e = false;
            this.b.reset(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.c(input) || !this.a.a(input, true)) {
                    return false;
                }
                d dVar = this.a;
                int iA = dVar.h;
                if ((dVar.b & 1) == 1 && this.b.limit() == 0) {
                    iA += a(0);
                    i = this.d + 0;
                } else {
                    i = 0;
                }
                if (!ExtractorUtil.skipFullyQuietly(input, iA)) {
                    return false;
                }
                this.c = i;
            }
            int iA2 = a(this.c);
            int i2 = this.c + this.d;
            if (iA2 > 0) {
                ParsableByteArray parsableByteArray = this.b;
                parsableByteArray.ensureCapacity(parsableByteArray.limit() + iA2);
                if (!ExtractorUtil.readFullyQuietly(input, this.b.getData(), this.b.limit(), iA2)) {
                    return false;
                }
                ParsableByteArray parsableByteArray2 = this.b;
                parsableByteArray2.setLimit(parsableByteArray2.limit() + iA2);
                this.e = this.a.j[i2 + (-1)] != 255;
            }
            if (i2 == this.a.g) {
                i2 = -1;
            }
            this.c = i2;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.reset(0);
        this.c = -1;
        this.e = false;
    }

    public void f() {
        if (this.b.getData().length == 65025) {
            return;
        }
        ParsableByteArray parsableByteArray = this.b;
        parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), Math.max(d.n, this.b.limit())), this.b.limit());
    }
}

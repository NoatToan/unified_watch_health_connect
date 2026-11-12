package com.google.android.exoplayer2.transformer;

import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
final class b {
    private static final long i = C.msToUs(500);
    private final Muxer a;
    private int d;
    private int e;
    private boolean f;
    private long h;
    private final SparseIntArray b = new SparseIntArray();
    private final SparseLongArray c = new SparseLongArray();
    private int g = 7;

    public b(Muxer muxer) {
        this.a = muxer;
    }

    private boolean b(int trackType) {
        long j = this.c.get(trackType, C.TIME_UNSET);
        Assertions.checkState(j != C.TIME_UNSET);
        if (!this.f) {
            return false;
        }
        if (this.c.size() == 1) {
            return true;
        }
        if (trackType != this.g) {
            this.h = Util.minValue(this.c);
        }
        return j - this.h <= i;
    }

    public void a(Format format) {
        Assertions.checkState(this.d > 0, "All tracks should be registered before the formats are added.");
        Assertions.checkState(this.e < this.d, "All track formats have already been added.");
        String str = format.sampleMimeType;
        boolean z = MimeTypes.isAudio(str) || MimeTypes.isVideo(str);
        String strValueOf = String.valueOf(str);
        Assertions.checkState(z, strValueOf.length() != 0 ? "Unsupported track format: ".concat(strValueOf) : new String("Unsupported track format: "));
        int trackType = MimeTypes.getTrackType(str);
        boolean z2 = this.b.get(trackType, -1) == -1;
        StringBuilder sb = new StringBuilder(44);
        sb.append("There is already a track of type ");
        sb.append(trackType);
        Assertions.checkState(z2, sb.toString());
        this.b.put(trackType, this.a.d(format));
        this.c.put(trackType, 0L);
        int i2 = this.e + 1;
        this.e = i2;
        if (i2 == this.d) {
            this.f = true;
        }
    }

    public void c(int trackType) {
        this.b.delete(trackType);
        this.c.delete(trackType);
    }

    public int d() {
        return this.d;
    }

    public void e() {
        Assertions.checkState(this.e == 0, "Tracks cannot be registered after track formats have been added.");
        this.d++;
    }

    public void f(boolean forCancellation) {
        this.f = false;
        this.a.a(forCancellation);
    }

    public boolean g(@Nullable String mimeType) {
        return this.a.b(mimeType);
    }

    public boolean h(int trackType, @Nullable ByteBuffer data, boolean isKeyFrame, long presentationTimeUs) {
        int i2 = this.b.get(trackType, -1);
        boolean z = i2 != -1;
        StringBuilder sb = new StringBuilder(68);
        sb.append("Could not write sample because there is no track of type ");
        sb.append(trackType);
        Assertions.checkState(z, sb.toString());
        if (!b(trackType)) {
            return false;
        }
        if (data == null) {
            return true;
        }
        this.a.c(i2, data, isKeyFrame, presentationTimeUs);
        this.c.put(trackType, presentationTimeUs);
        this.g = trackType;
        return true;
    }
}

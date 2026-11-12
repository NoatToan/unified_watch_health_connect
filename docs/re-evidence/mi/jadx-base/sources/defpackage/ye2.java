package defpackage;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.b;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ye2 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackGroup f40087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40088b;
    public final int[] c;
    public final int d;
    public final Format[] e;
    public final long[] f;
    public int g;

    public ye2(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    public static /* synthetic */ int u(Format format, Format format2) {
        return format2.h - format.h;
    }

    @Override // defpackage.znp
    public final int c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public void disable() {
    }

    @Override // defpackage.znp
    public final int e(int i) {
        for (int i2 = 0; i2 < this.f40088b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ye2 ye2Var = (ye2) obj;
        return this.f40087a == ye2Var.f40087a && Arrays.equals(this.c, ye2Var.c);
    }

    @Override // defpackage.znp
    public final TrackGroup f() {
        return this.f40087a;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public int g(long j, List<? extends tif> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public final int h() {
        return this.c[a()];
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = (System.identityHashCode(this.f40087a) * 31) + Arrays.hashCode(this.c);
        }
        return this.g;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public final Format i() {
        return this.e[a()];
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public boolean k(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zT = t(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f40088b && !zT) {
            zT = (i2 == i || t(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zT) {
            return false;
        }
        long[] jArr = this.f;
        jArr[i] = Math.max(jArr[i], wlq.b(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // defpackage.znp
    public final Format l(int i) {
        return this.e[i];
    }

    @Override // defpackage.znp
    public final int length() {
        return this.c.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public void m(float f) {
    }

    @Override // defpackage.znp
    public final int q(Format format) {
        for (int i = 0; i < this.f40088b; i++) {
            if (this.e[i] == format) {
                return i;
            }
        }
        return -1;
    }

    public boolean t(int i, long j) {
        return this.f[i] > j;
    }

    public ye2(TrackGroup trackGroup, int[] iArr, int i) {
        int i2 = 0;
        rk1.g(iArr.length > 0);
        this.d = i;
        this.f40087a = (TrackGroup) rk1.e(trackGroup);
        int length = iArr.length;
        this.f40088b = length;
        this.e = new Format[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.e[i3] = trackGroup.a(iArr[i3]);
        }
        Arrays.sort(this.e, new Comparator() { // from class: xe2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ye2.u((Format) obj, (Format) obj2);
            }
        });
        this.c = new int[this.f40088b];
        while (true) {
            int i4 = this.f40088b;
            if (i2 < i4) {
                this.c[i2] = trackGroup.c(this.e[i2]);
                i2++;
            } else {
                this.f = new long[i4];
                return;
            }
        }
    }
}

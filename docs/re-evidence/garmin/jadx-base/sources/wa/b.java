package wa;

import android.os.SystemClock;
import androidx.media3.common.e0;
import androidx.media3.common.q;
import fa.z;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f183641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f183642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f183643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q[] f183644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f183645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f183646f;

    public b(e0 e0Var, int[] iArr, int i14) {
        q[] qVarArr;
        int i15 = 0;
        fa.a.d(iArr.length > 0);
        e0Var.getClass();
        this.f183641a = e0Var;
        int length = iArr.length;
        this.f183642b = length;
        this.f183644d = new q[length];
        int i16 = 0;
        while (true) {
            int length2 = iArr.length;
            qVarArr = this.f183644d;
            if (i16 >= length2) {
                break;
            }
            qVarArr[i16] = e0Var.f8217d[iArr[i16]];
            i16++;
        }
        Arrays.sort(qVarArr, new tl2.g(2));
        this.f183643c = new int[this.f183642b];
        while (true) {
            int i17 = this.f183642b;
            if (i15 >= i17) {
                this.f183645e = new long[i17];
                return;
            } else {
                this.f183643c[i15] = e0Var.b(this.f183644d[i15]);
                i15++;
            }
        }
    }

    @Override // wa.g
    public final boolean a(int i14, long j8) {
        return this.f183645e[i14] > j8;
    }

    @Override // wa.g
    public final boolean d(int i14, long j8) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i14, jElapsedRealtime);
        int i15 = 0;
        while (i15 < this.f183642b && !zA) {
            zA = (i15 == i14 || a(i15, jElapsedRealtime)) ? false : true;
            i15++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f183645e;
        long j14 = jArr[i14];
        int i16 = z.f70071a;
        long j15 = jElapsedRealtime + j8;
        if (((j8 ^ j15) & (jElapsedRealtime ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        jArr[i14] = Math.max(j14, j15);
        return true;
    }

    @Override // wa.g
    public void disable() {
    }

    @Override // wa.g
    public void enable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f183641a.equals(bVar.f183641a) && Arrays.equals(this.f183643c, bVar.f183643c)) {
                return true;
            }
        }
        return false;
    }

    @Override // wa.g
    public int evaluateQueueSize(long j8, List<? extends ua.d> list) {
        return list.size();
    }

    @Override // wa.j
    public final q getFormat(int i14) {
        return this.f183644d[i14];
    }

    @Override // wa.j
    public final int getIndexInTrackGroup(int i14) {
        return this.f183643c[i14];
    }

    @Override // wa.g
    public final q getSelectedFormat() {
        return this.f183644d[getSelectedIndex()];
    }

    @Override // wa.g
    public final int getSelectedIndexInTrackGroup() {
        return this.f183643c[getSelectedIndex()];
    }

    @Override // wa.j
    public final e0 getTrackGroup() {
        return this.f183641a;
    }

    public final int hashCode() {
        if (this.f183646f == 0) {
            this.f183646f = Arrays.hashCode(this.f183643c) + (System.identityHashCode(this.f183641a) * 31);
        }
        return this.f183646f;
    }

    @Override // wa.j
    public final int indexOf(int i14) {
        for (int i15 = 0; i15 < this.f183642b; i15++) {
            if (this.f183643c[i15] == i14) {
                return i15;
            }
        }
        return -1;
    }

    @Override // wa.j
    public final int length() {
        return this.f183643c.length;
    }

    @Override // wa.g
    public final void onPlayWhenReadyChanged(boolean z14) {
    }

    @Override // wa.g
    public void onPlaybackSpeed(float f14) {
    }

    public b(e0 e0Var, int... iArr) {
        this(e0Var, iArr, 0);
    }
}

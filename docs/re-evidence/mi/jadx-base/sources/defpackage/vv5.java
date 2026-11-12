package defpackage;

import com.google.android.exoplayer2.s;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.b;
import com.tencent.wcdb.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public class vv5 implements lie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bt5 f37257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37258b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37259k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public bt5 f37260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f37261b = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
        public int c = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
        public int d = 2500;
        public int e = 5000;
        public int f = -1;
        public boolean g = false;
        public int h = 0;
        public boolean i = false;
        public boolean j;

        public vv5 a() {
            rk1.g(!this.j);
            this.j = true;
            if (this.f37260a == null) {
                this.f37260a = new bt5(true, 65536);
            }
            return new vv5(this.f37260a, this.f37261b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public a b(bt5 bt5Var) {
            rk1.g(!this.j);
            this.f37260a = bt5Var;
            return this;
        }

        public a c(int i, int i2, int i3, int i4) {
            rk1.g(!this.j);
            vv5.j(i3, 0, "bufferForPlaybackMs", "0");
            vv5.j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            vv5.j(i, i3, "minBufferMs", "bufferForPlaybackMs");
            vv5.j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            vv5.j(i2, i, "maxBufferMs", "minBufferMs");
            this.f37261b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            return this;
        }
    }

    public vv5() {
        this(new bt5(true, 65536), SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 2500, 5000, -1, false, 0, false);
    }

    public static void j(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        rk1.b(z, sb.toString());
    }

    public static int l(int i) {
        if (i == 0) {
            return 144310272;
        }
        if (i == 1) {
            return 13107200;
        }
        if (i == 2) {
            return 131072000;
        }
        if (i == 3 || i == 5 || i == 6) {
            return 131072;
        }
        if (i == 7) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.lie
    public void a() {
        m(false);
    }

    @Override // defpackage.lie
    public boolean b() {
        return this.i;
    }

    @Override // defpackage.lie
    public void c(s[] sVarArr, TrackGroupArray trackGroupArray, b[] bVarArr) {
        int iK = this.f;
        if (iK == -1) {
            iK = k(sVarArr, bVarArr);
        }
        this.j = iK;
        this.f37257a.h(iK);
    }

    @Override // defpackage.lie
    public void d() {
        m(true);
    }

    @Override // defpackage.lie
    public boolean e(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f37257a.f() >= this.j;
        long jMin = this.f37258b;
        if (f > 1.0f) {
            jMin = Math.min(wlq.V(jMin, f), this.c);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            if (!this.g && z2) {
                z = false;
            }
            this.f37259k = z;
            if (!z && j2 < 500000) {
                toe.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || z2) {
            this.f37259k = false;
        }
        return this.f37259k;
    }

    @Override // defpackage.lie
    public long f() {
        return this.h;
    }

    @Override // defpackage.lie
    public boolean g(long j, float f, boolean z, long j2) {
        long jA0 = wlq.a0(j, f);
        long jMin = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jA0 >= jMin || (!this.g && this.f37257a.f() >= this.j);
    }

    @Override // defpackage.lie
    public r61 h() {
        return this.f37257a;
    }

    public int k(s[] sVarArr, b[] bVarArr) {
        int iL = 0;
        for (int i = 0; i < sVarArr.length; i++) {
            if (bVarArr[i] != null) {
                iL += l(sVarArr[i].e());
            }
        }
        return Math.max(13107200, iL);
    }

    public final void m(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.f37259k = false;
        if (z) {
            this.f37257a.g();
        }
    }

    @Override // defpackage.lie
    public void onStopped() {
        m(true);
    }

    public vv5(bt5 bt5Var, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        j(i3, 0, "bufferForPlaybackMs", "0");
        j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i, i3, "minBufferMs", "bufferForPlaybackMs");
        j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i2, i, "maxBufferMs", "minBufferMs");
        j(i6, 0, "backBufferDurationMs", "0");
        this.f37257a = bt5Var;
        this.f37258b = g83.c(i);
        this.c = g83.c(i2);
        this.d = g83.c(i3);
        this.e = g83.c(i4);
        this.f = i5;
        this.j = i5 == -1 ? 13107200 : i5;
        this.g = z;
        this.h = g83.c(i6);
        this.i = z2;
    }
}

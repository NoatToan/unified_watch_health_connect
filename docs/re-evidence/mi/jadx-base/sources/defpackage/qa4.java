package defpackage;

import com.google.android.exoplayer2.source.s;

/* JADX INFO: loaded from: classes4.dex */
public class qa4 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s[] f31270a;

    public qa4(s[] sVarArr) {
        this.f31270a = sVarArr;
    }

    @Override // com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        boolean zC;
        boolean z = false;
        do {
            long jG = g();
            if (jG == Long.MIN_VALUE) {
                break;
            }
            zC = false;
            for (s sVar : this.f31270a) {
                long jG2 = sVar.g();
                boolean z2 = jG2 != Long.MIN_VALUE && jG2 <= j;
                if (jG2 == jG || z2) {
                    zC |= sVar.c(j);
                }
            }
            z |= zC;
        } while (zC);
        return z;
    }

    @Override // com.google.android.exoplayer2.source.s
    public final long e() {
        long jMin = Long.MAX_VALUE;
        for (s sVar : this.f31270a) {
            long jE = sVar.e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.s
    public final void f(long j) {
        for (s sVar : this.f31270a) {
            sVar.f(j);
        }
    }

    @Override // com.google.android.exoplayer2.source.s
    public final long g() {
        long jMin = Long.MAX_VALUE;
        for (s sVar : this.f31270a) {
            long jG = sVar.g();
            if (jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.s
    public boolean h() {
        for (s sVar : this.f31270a) {
            if (sVar.h()) {
                return true;
            }
        }
        return false;
    }
}

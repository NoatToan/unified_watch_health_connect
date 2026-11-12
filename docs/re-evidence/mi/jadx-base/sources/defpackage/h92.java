package defpackage;

import com.google.android.exoplayer2.source.r;

/* JADX INFO: loaded from: classes4.dex */
public final class h92 implements dw3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f19819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r[] f19820b;

    public h92(int[] iArr, r[] rVarArr) {
        this.f19819a = iArr;
        this.f19820b = rVarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f19820b.length];
        int i = 0;
        while (true) {
            r[] rVarArr = this.f19820b;
            if (i >= rVarArr.length) {
                return iArr;
            }
            iArr[i] = rVarArr[i].G();
            i++;
        }
    }

    public void b(long j) {
        for (r rVar : this.f19820b) {
            rVar.a0(j);
        }
    }

    @Override // dw3.b
    public snp d(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f19819a;
            if (i3 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i2);
                toe.c("BaseMediaChunkOutput", sb.toString());
                return new p67();
            }
            if (i2 == iArr[i3]) {
                return this.f19820b[i3];
            }
            i3++;
        }
    }
}

package bb;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17233a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17239g;

    public final void a(l0 l0Var, l0.a aVar) {
        if (this.f17235c > 0) {
            l0Var.c(this.f17236d, this.f17237e, this.f17238f, this.f17239g, aVar);
            this.f17235c = 0;
        }
    }

    public final void b(l0 l0Var, long j8, int i14, int i15, int i16, l0.a aVar) {
        fa.a.e(this.f17239g <= i15 + i16, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f17234b) {
            int i17 = this.f17235c;
            int i18 = i17 + 1;
            this.f17235c = i18;
            if (i17 == 0) {
                this.f17236d = j8;
                this.f17237e = i14;
                this.f17238f = 0;
            }
            this.f17238f += i15;
            this.f17239g = i16;
            if (i18 >= 16) {
                a(l0Var, aVar);
            }
        }
    }

    public final void c(o oVar) {
        if (this.f17234b) {
            return;
        }
        byte[] bArr = this.f17233a;
        int i14 = 0;
        oVar.peekFully(bArr, 0, 10);
        oVar.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b14 = bArr[7];
            if ((b14 & 254) == 186) {
                i14 = 40 << ((bArr[((b14 & UnsignedBytes.MAX_VALUE) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i14 == 0) {
            return;
        }
        this.f17234b = true;
    }
}

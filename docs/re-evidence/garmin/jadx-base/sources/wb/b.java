package wb;

import bb.g0;
import bb.o;
import bb.s;
import bb.t;
import bb.u;
import bb.v;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import fa.r;
import fa.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v f183818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f183819o;

    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f183820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v.a f183821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f183822c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f183823d = -1;

        public a(v vVar, v.a aVar) {
            this.f183820a = vVar;
            this.f183821b = aVar;
        }

        @Override // wb.f
        public final long a(o oVar) {
            long j8 = this.f183823d;
            if (j8 < 0) {
                return -1L;
            }
            long j14 = -(j8 + 2);
            this.f183823d = -1L;
            return j14;
        }

        @Override // wb.f
        public final g0 createSeekMap() {
            fa.a.d(this.f183822c != -1);
            return new u(this.f183820a, this.f183822c);
        }

        @Override // wb.f
        public final void startSeek(long j8) {
            long[] jArr = this.f183821b.f17269a;
            this.f183823d = jArr[z.e(jArr, j8, true)];
        }
    }

    @Override // wb.h
    public final long b(r rVar) {
        byte[] bArr = rVar.f70054a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i14 = (bArr[2] & UnsignedBytes.MAX_VALUE) >> 4;
        if (i14 == 6 || i14 == 7) {
            rVar.H(4);
            rVar.B();
        }
        int iB = s.b(i14, rVar);
        rVar.G(0);
        return iB;
    }

    @Override // wb.h
    public final boolean c(r rVar, long j8, h.b bVar) {
        byte[] bArr = rVar.f70054a;
        v vVar = this.f183818n;
        if (vVar == null) {
            v vVar2 = new v(bArr, 17);
            this.f183818n = vVar2;
            bVar.f183855a = vVar2.f(Arrays.copyOfRange(bArr, 9, rVar.f70056c), null);
            return true;
        }
        byte b14 = bArr[0];
        if ((b14 & Ascii.DEL) == 3) {
            v.a aVarA = t.a(rVar);
            v vVarB = vVar.b(aVarA);
            this.f183818n = vVarB;
            this.f183819o = new a(vVarB, aVarA);
            return true;
        }
        if (b14 != -1) {
            return true;
        }
        a aVar = this.f183819o;
        if (aVar != null) {
            aVar.f183822c = j8;
            bVar.f183856b = aVar;
        }
        bVar.f183855a.getClass();
        return false;
    }

    @Override // wb.h
    public final void d(boolean z14) {
        super.d(z14);
        if (z14) {
            this.f183818n = null;
            this.f183819o = null;
        }
    }
}

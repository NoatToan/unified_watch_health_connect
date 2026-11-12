package gb;

import bb.e;
import bb.o;
import bb.s;
import bb.v;
import com.google.common.primitives.UnsignedBytes;
import en0.n;
import fa.r;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    public static final class b implements e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f76619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s.a f76621c;

        private b(v vVar, int i14) {
            this.f76619a = vVar;
            this.f76620b = i14;
            this.f76621c = new s.a();
        }

        @Override // bb.e.f
        public final e.C0241e a(o oVar, long j8) {
            long position = oVar.getPosition();
            long jB = b(oVar);
            long peekPosition = oVar.getPeekPosition();
            oVar.advancePeekPosition(Math.max(6, this.f76619a.f17259c));
            long jB2 = b(oVar);
            long peekPosition2 = oVar.getPeekPosition();
            if (jB > j8 || jB2 <= j8) {
                return jB2 <= j8 ? e.C0241e.c(jB2, peekPosition2) : e.C0241e.a(jB, position);
            }
            return e.C0241e.b(peekPosition);
        }

        public final long b(o oVar) {
            s.a aVar;
            v vVar;
            int iPeek;
            while (true) {
                long peekPosition = oVar.getPeekPosition();
                long length = oVar.getLength() - 6;
                aVar = this.f76621c;
                vVar = this.f76619a;
                if (peekPosition >= length) {
                    break;
                }
                long peekPosition2 = oVar.getPeekPosition();
                byte[] bArr = new byte[2];
                int i14 = 0;
                boolean zA = false;
                oVar.peekFully(bArr, 0, 2);
                int i15 = ((bArr[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[1] & UnsignedBytes.MAX_VALUE);
                int i16 = this.f76620b;
                if (i15 != i16) {
                    oVar.resetPeekPosition();
                    oVar.advancePeekPosition((int) (peekPosition2 - oVar.getPosition()));
                } else {
                    r rVar = new r(16);
                    System.arraycopy(bArr, 0, rVar.f70054a, 0, 2);
                    byte[] bArr2 = rVar.f70054a;
                    while (i14 < 14 && (iPeek = oVar.peek(bArr2, 2 + i14, 14 - i14)) != -1) {
                        i14 += iPeek;
                    }
                    rVar.F(i14);
                    oVar.resetPeekPosition();
                    oVar.advancePeekPosition((int) (peekPosition2 - oVar.getPosition()));
                    zA = s.a(rVar, vVar, i16, aVar);
                }
                if (zA) {
                    break;
                }
                oVar.advancePeekPosition(1);
            }
            if (oVar.getPeekPosition() < oVar.getLength() - 6) {
                return aVar.f17253a;
            }
            oVar.advancePeekPosition((int) (oVar.getLength() - oVar.getPeekPosition()));
            return vVar.f17266j;
        }
    }

    public a(v vVar, int i14, long j8, long j14) {
        long j15;
        long j16;
        Objects.requireNonNull(vVar);
        int i15 = vVar.f17259c;
        n nVar = new n(vVar, 25);
        b bVar = new b(vVar, i14);
        long jE = vVar.e();
        long j17 = vVar.f17266j;
        int i16 = vVar.f17260d;
        if (i16 > 0) {
            j15 = (((long) i16) + ((long) i15)) / 2;
            j16 = 1;
        } else {
            int i17 = vVar.f17257a;
            j15 = ((((i17 != vVar.f17258b || i17 <= 0) ? 4096L : i17) * ((long) vVar.f17263g)) * ((long) vVar.f17264h)) / 8;
            j16 = 64;
        }
        super(nVar, bVar, jE, 0L, j17, j8, j14, j15 + j16, Math.max(6, i15));
    }
}

package hc;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends bb.e {

    public static final class a implements bb.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fa.w f82833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final fa.r f82834b = new fa.r();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f82835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f82836d;

        public a(int i14, fa.w wVar, int i15) {
            this.f82835c = i14;
            this.f82833a = wVar;
            this.f82836d = i15;
        }

        @Override // bb.e.f
        public final bb.e.C0241e a(bb.o oVar, long j8) {
            long j14;
            long position = oVar.getPosition();
            int iMin = (int) Math.min(this.f82836d, oVar.getLength() - position);
            fa.r rVar = this.f82834b;
            rVar.D(iMin);
            oVar.peekFully(rVar.f70054a, 0, iMin);
            int i14 = rVar.f70056c;
            long j15 = -1;
            long j16 = -1;
            long j17 = C.TIME_UNSET;
            while (true) {
                if (rVar.a() < 188) {
                    j14 = C.TIME_UNSET;
                    break;
                }
                byte[] bArr = rVar.f70054a;
                int i15 = rVar.f70055b;
                while (true) {
                    if (i15 >= i14) {
                        j14 = C.TIME_UNSET;
                        break;
                    }
                    byte b14 = bArr[i15];
                    j14 = C.TIME_UNSET;
                    if (b14 == 71) {
                        break;
                    }
                    i15++;
                }
                int i16 = i15 + TsExtractor.TS_PACKET_SIZE;
                if (i16 > i14) {
                    break;
                }
                long jA = g0.a(rVar, i15, this.f82835c);
                if (jA != j14) {
                    long jB = this.f82833a.b(jA);
                    if (jB > j8) {
                        return j17 == j14 ? bb.e.C0241e.a(jB, position) : bb.e.C0241e.b(position + j16);
                    }
                    if (100000 + jB > j8) {
                        return bb.e.C0241e.b(position + ((long) i15));
                    }
                    j17 = jB;
                    j16 = i15;
                }
                rVar.G(i16);
                j15 = i16;
            }
            return j17 != j14 ? bb.e.C0241e.c(j17, position + j15) : bb.e.C0241e.f17163d;
        }

        @Override // bb.e.f
        public final void onSeekFinished() {
            byte[] bArr = fa.z.f70076f;
            fa.r rVar = this.f82834b;
            rVar.getClass();
            rVar.E(bArr, bArr.length);
        }
    }

    public c0(fa.w wVar, long j8, long j14, int i14, int i15) {
        super(new bb.e.b(), new a(i14, wVar, i15), j8, 0L, j8 + 1, 0L, j14, 188L, 940);
    }
}

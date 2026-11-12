package og2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import s5.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Log2/p;", "Log2/l0;", "Ls5/s0;", "textMeasurer", "Ls5/x0;", TtmlNode.TAG_STYLE, "<init>", "(Ls5/s0;Ls5/x0;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s5.s0 s0Var, x0 x0Var) {
        super(s0Var, x0Var);
        s0Var.getClass();
        x0Var.getClass();
    }

    @Override // og2.l0
    public final void a(q4.f fVar, i53.c<j0> cVar, String str) {
        fVar.getClass();
        cVar.getClass();
        str.getClass();
        s5.s0 s0Var = this.f132061a;
        x0 x0Var = this.f132062b;
        s5.q0 q0VarA = s5.s0.a(s0Var, str, x0Var, 0L, 1020);
        char c14 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32)) * 0.5f;
        long j8 = q0VarA.f157282c;
        float f14 = 2.0f;
        float f15 = fIntBitsToFloat - (((int) (j8 >> 32)) / 2.0f);
        long j14 = 4294967295L;
        float f16 = (int) (j8 & 4294967295L);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - f16)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        s5.v0.b(fVar, q0VarA, 0L, jFloatToRawIntBits, 250);
        d92.b.f58623a.getClass();
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.d dVar = j92.b.f97900c;
        float f17 = dVar.f97911c;
        bVar.getClass();
        float f18 = dVar.f97910b;
        int i14 = 0;
        for (j0 j0Var : cVar) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            j0 j0Var2 = j0Var;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() >> c14));
            float f19 = j0Var2.f132048a;
            String str2 = j0Var2.f132049b;
            float f22 = fIntBitsToFloat2 * f19;
            int i16 = i14;
            s5.s0 s0Var2 = s0Var;
            x0 x0Var2 = x0Var;
            s5.q0 q0VarA2 = s5.s0.a(s0Var2, str2, x0Var2, 0L, 1020);
            long j15 = q0VarA2.f157282c;
            char c15 = c14;
            float f24 = f14;
            long j16 = j14;
            float fIntBitsToFloat3 = ((Float.intBitsToFloat((int) (fVar.b() & j14)) - f16) - ((int) (j15 & j16))) - 8;
            if (str2.length() > 0 && (i16 == 0 || i16 == cVar.size() - 1)) {
                s5.v0.b(fVar, q0VarA2, 0L, (((long) Float.floatToRawIntBits(f22 - (((int) (j15 >> c15)) / f24))) << c15) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j16), 250);
            }
            q4.f.o0(fVar, x0Var2.c(), (i16 == 0 || i16 == cVar.size() + (-1)) ? f17 : f18, (((long) Float.floatToRawIntBits(f22)) << c15) | (((long) Float.floatToRawIntBits((fIntBitsToFloat3 - 4) - f17)) & j16), null, 0, 120);
            c14 = c15;
            f14 = f24;
            s0Var = s0Var2;
            x0Var = x0Var2;
            i14 = i15;
            j14 = j16;
        }
    }
}

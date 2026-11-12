package og2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import s5.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Log2/m;", "Log2/l0;", "Ls5/s0;", "textMeasurer", "Ls5/x0;", TtmlNode.TAG_STYLE, "Lo4/d0;", "labelBackgroundColor", "<init>", "(Ls5/s0;Ls5/x0;JLkotlin/jvm/internal/j;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f132063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private m(s5.s0 s0Var, x0 x0Var, long j8) {
        super(s0Var, x0Var);
        s0Var.getClass();
        x0Var.getClass();
        this.f132063c = j8;
    }

    @Override // og2.l0
    public final void a(q4.f fVar, i53.c<j0> cVar, String str) {
        s5.s0 s0Var;
        char c14;
        long j8;
        fVar.getClass();
        cVar.getClass();
        str.getClass();
        s5.s0 s0Var2 = this.f132061a;
        x0 x0Var = this.f132062b;
        s5.q0 q0VarA = s5.s0.a(s0Var2, str, x0Var, 0L, 1020);
        char c15 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32)) * 0.5f;
        long j14 = q0VarA.f157282c;
        float f14 = 2.0f;
        float f15 = fIntBitsToFloat - (((int) (j14 >> 32)) / 2.0f);
        long j15 = 4294967295L;
        float f16 = (int) (j14 & 4294967295L);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - f16)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        s5.v0.b(fVar, q0VarA, 0L, jFloatToRawIntBits, 250);
        for (j0 j0Var : cVar) {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() >> c15));
            float f17 = j0Var.f132048a;
            String str2 = j0Var.f132049b;
            float f18 = fIntBitsToFloat2 * f17;
            if (str2.length() > 0) {
                s0Var = s0Var2;
                s5.q0 q0VarA2 = s5.s0.a(s0Var, str2, x0Var, 0L, 1020);
                long j16 = q0VarA2.f157282c;
                float f19 = (int) (j16 & j15);
                float fIntBitsToFloat3 = ((Float.intBitsToFloat((int) (fVar.b() & j15)) - f16) - 8) - f19;
                float f22 = (int) (j16 >> c15);
                float f24 = f18 - (f22 / f14);
                c14 = c15;
                j8 = j15;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f24)) << c14) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j8);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f22)) << c14) | (((long) Float.floatToRawIntBits(f19)) & j8);
                n4.g.a aVar2 = n4.g.f123559b;
                q4.f.A0(fVar, this.f132063c, jFloatToRawIntBits2, jFloatToRawIntBits3, 0.0f, null, null, 120);
                s5.v0.b(fVar, q0VarA2, 0L, (((long) Float.floatToRawIntBits(f24)) << c14) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j8), 250);
                q4.f.o0(fVar, x0Var.c(), 8.0f, (Float.floatToRawIntBits(f18) << c14) | (((long) Float.floatToRawIntBits((fIntBitsToFloat3 - 4) - 8.0f)) & j8), null, 0, 120);
            } else {
                s0Var = s0Var2;
                c14 = c15;
                j8 = j15;
            }
            c15 = c14;
            s0Var2 = s0Var;
            j15 = j8;
            f14 = 2.0f;
        }
    }

    public /* synthetic */ m(s5.s0 s0Var, x0 x0Var, long j8, p005kotlin.jvm.internal.j jVar) {
        this(s0Var, x0Var, j8);
    }
}

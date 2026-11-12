package n92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import o4.d0;
import p005kotlin.Metadata;
import p13.x;
import s5.q0;
import s5.s0;
import s5.v0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln92/m;", "Ln92/n;", "", "", "labels", "Ls5/s0;", "textMeasurer", "Ls5/x0;", TtmlNode.TAG_STYLE, "<init>", "(Ljava/util/List;Ls5/s0;Ls5/x0;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f125090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List<String> list, s0 s0Var, x0 x0Var) {
        super(s0Var, x0Var);
        list.getClass();
        s0Var.getClass();
        x0Var.getClass();
        this.f125090c = list;
    }

    @Override // n92.n
    public final void a(q4.f fVar, float f14) {
        long jC;
        fVar.getClass();
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        float f15 = j92.b.f97899b.f97917b;
        List<String> list = this.f125090c;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            String str = (String) obj;
            s0 s0Var = this.f125091a;
            x0 x0Var = this.f125092b;
            q0 q0VarA = s0.a(s0Var, str, x0Var, 0L, 1020);
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.b() >> 32)) / (list.size() - 1)) * i14;
            if (str.length() > 0) {
                jC = x0Var.c();
            } else {
                d0.f128823b.getClass();
                jC = d0.f128831j;
            }
            long j8 = jC;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits((6 * f15) + (Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - f14))) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            q4.f.o0(fVar, j8, f15 + 4, jFloatToRawIntBits, null, 0, 120);
            n4.c.f123541b.getClass();
            q4.a.b f142543b = fVar.getF142543b();
            long jB = f142543b.b();
            f142543b.a().l();
            try {
                f142543b.f142550a.f(270.0f, 0L);
                float f16 = -Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                v0.b(fVar, q0VarA, 0L, (((long) Float.floatToRawIntBits(f16 - j92.b.f97899b.f97920e)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat - (((int) (q0VarA.f157282c >> 32)) / 2.5f)))), 250);
                tn.k.p(f142543b, jB);
                i14 = i15;
            } catch (Throwable th3) {
                tn.k.p(f142543b, jB);
                throw th3;
            }
        }
    }
}

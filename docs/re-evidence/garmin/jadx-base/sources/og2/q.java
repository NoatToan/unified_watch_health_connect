package og2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import s5.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Log2/q;", "Log2/t0;", "Lo4/d0;", "gridLineColor", "Ls5/s0;", "textMeasurer", "Ls5/x0;", TtmlNode.TAG_STYLE, "<init>", "(JLs5/s0;Ls5/x0;Lkotlin/jvm/internal/j;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f132073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private q(long j8, s5.s0 s0Var, x0 x0Var) {
        super(s0Var, x0Var);
        s0Var.getClass();
        x0Var.getClass();
        this.f132073c = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // og2.t0
    public final int a(q4.f fVar, List<o13.p<Float, String>> list, float f14, float f15, boolean z14) {
        fVar.getClass();
        list.getClass();
        int i14 = 0;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return 0;
        }
        int length = ((String) ((o13.p) it.next()).f128595b).length();
        while (it.hasNext()) {
            int length2 = ((String) ((o13.p) it.next()).f128595b).length();
            if (length < length2) {
                length = length2;
            }
        }
        Iterator<o13.p<Float, String>> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i14 = -1;
                break;
            }
            if (it3.next().f128595b.length() == length) {
                break;
            }
            i14++;
        }
        String str = list.get(i14).f128595b;
        s5.s0 s0Var = this.f132100a;
        long j8 = s5.s0.a(s0Var, str, null, 0L, 1022).f157282c;
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            o13.p pVar = (o13.p) it4.next();
            float fFloatValue = ((Number) pVar.f128594a).floatValue();
            String str2 = (String) pVar.f128595b;
            float fA = k.A(fFloatValue, ((Number) ((o13.p) p13.h0.b0(list)).f128594a).floatValue(), ((Number) ((o13.p) p13.h0.m0(list)).f128594a).floatValue(), z14 ? f14 : Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - f15, z14 ? Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - f15 : f14);
            s5.s0 s0Var2 = s0Var;
            s5.q0 q0VarA = s5.s0.a(s0Var2, str2, this.f132101b, 0L, 1020);
            int i15 = (int) (j8 >> 32);
            long j14 = q0VarA.f157282c;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((i15 - ((int) (j14 >> 32))) - 8.0f)) << 32) | (((long) Float.floatToRawIntBits(fA - (((int) (j14 & 4294967295L)) / 2))) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            s5.v0.b(fVar, q0VarA, 0L, jFloatToRawIntBits, 250);
            q4.f.G1(fVar, this.f132073c, (((long) Float.floatToRawIntBits(i15 + 8.0f)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L), 0.0f, 0, null, 0, 504);
            s0Var = s0Var2;
        }
        return (int) (j8 >> 32);
    }

    public /* synthetic */ q(long j8, s5.s0 s0Var, x0 x0Var, p005kotlin.jvm.internal.j jVar) {
        this(j8, s0Var, x0Var);
    }
}

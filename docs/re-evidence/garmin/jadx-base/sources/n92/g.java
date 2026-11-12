package n92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import m92.i0;
import p005kotlin.Metadata;
import p13.h0;
import s5.q0;
import s5.s0;
import s5.v0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln92/g;", "Ln92/p;", "Lo4/d0;", "gridLineColor", "Ls5/s0;", "textMeasurer", "Ls5/x0;", TtmlNode.TAG_STYLE, "endStyle", "<init>", "(JLs5/s0;Ls5/x0;Ls5/x0;Lkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f125079d;

    public /* synthetic */ g(long j8, s0 s0Var, x0 x0Var, x0 x0Var2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, s0Var, x0Var, (i14 & 8) != 0 ? x0Var : x0Var2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n92.p
    public final f a(q4.f fVar, List<o13.p<Float, String>> list, List<o13.p<Float, String>> list2, float f14) {
        Integer numValueOf;
        Integer numValueOf2;
        Object next;
        float f15;
        float f16;
        String str;
        String str2;
        fVar.getClass();
        list.getClass();
        list2.getClass();
        Object obj = null;
        if (list.isEmpty() && list2.isEmpty()) {
            return new f(0, 0, 3, null);
        }
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((String) ((o13.p) it.next()).f128595b).length());
            while (it.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(((String) ((o13.p) it.next()).f128595b).length());
                if (numValueOf.compareTo(numValueOf3) < 0) {
                    numValueOf = numValueOf3;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Iterator<T> it3 = list2.iterator();
        if (it3.hasNext()) {
            numValueOf2 = Integer.valueOf(((String) ((o13.p) it3.next()).f128595b).length());
            while (it3.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(((String) ((o13.p) it3.next()).f128595b).length());
                if (numValueOf2.compareTo(numValueOf4) < 0) {
                    numValueOf2 = numValueOf4;
                }
            }
        } else {
            numValueOf2 = null;
        }
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        Iterator<T> it4 = list.iterator();
        do {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
        } while (((String) ((o13.p) next).f128595b).length() != iIntValue);
        o13.p pVar = (o13.p) next;
        String str3 = "";
        String str4 = (pVar == null || (str2 = (String) pVar.f128595b) == null) ? "" : str2;
        for (Object obj2 : list2) {
            if (((String) ((o13.p) obj2).f128595b).length() == iIntValue2) {
                obj = obj2;
                break;
            }
        }
        o13.p pVar2 = (o13.p) obj;
        if (pVar2 != null && (str = (String) pVar2.f128595b) != null) {
            str3 = str;
        }
        long j8 = s0.a(this.f125097a, str4, null, 0L, 1022).f157282c;
        long j14 = s0.a(this.f125097a, str3, null, 0L, 1022).f157282c;
        if (list.isEmpty() || list2.isEmpty()) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f15 = j92.b.f97899b.f97918c;
        } else {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f15 = j92.b.f97899b.f97920e;
        }
        char c14 = ' ';
        int i14 = (int) (j14 >> 32);
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.b() >> 32)) - i14) + f15;
        Iterator<T> it5 = list.iterator();
        while (true) {
            f16 = 0.0f;
            if (!it5.hasNext()) {
                break;
            }
            o13.p pVar3 = (o13.p) it5.next();
            float fFloatValue = ((Number) pVar3.f128594a).floatValue();
            String str5 = (String) pVar3.f128595b;
            float fH = i0.h(fFloatValue, ((Number) ((o13.p) h0.b0(list)).f128594a).floatValue(), ((Number) ((o13.p) h0.m0(list)).f128594a).floatValue(), Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - f14, 0.0f);
            q0 q0VarA = s0.a(this.f125097a, str5, this.f125098b, 0L, 1020);
            long j15 = q0VarA.f157282c;
            int i15 = (int) (j8 >> 32);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((i15 - ((int) (j15 >> 32))) - j92.b.f97899b.f97918c)) << 32) | (((long) Float.floatToRawIntBits(fH - (((int) (j15 & 4294967295L)) / 2))) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            v0.b(fVar, q0VarA, 0L, jFloatToRawIntBits, 250);
            q4.f.G1(fVar, this.f125079d, (((long) Float.floatToRawIntBits(i15)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fH))), 0.0f, 0, null, 0, 504);
        }
        Iterator<T> it6 = list2.iterator();
        while (it6.hasNext()) {
            o13.p pVar4 = (o13.p) it6.next();
            float fFloatValue2 = ((Number) pVar4.f128594a).floatValue();
            String str6 = (String) pVar4.f128595b;
            float fH2 = i0.h(fFloatValue2, ((Number) ((o13.p) h0.b0(list2)).f128594a).floatValue(), ((Number) ((o13.p) h0.m0(list2)).f128594a).floatValue(), Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - f14, f16);
            q0 q0VarA2 = s0.a(this.f125097a, str6, this.f125099c, 0L, 1020);
            long jC = this.f125099c.c();
            float f17 = f16;
            char c15 = c14;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c15) | (((long) Float.floatToRawIntBits(fH2 - (((int) (q0VarA2.f157282c & 4294967295L)) / 2))) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            v0.b(fVar, q0VarA2, jC, jFloatToRawIntBits2, 248);
            if (list.isEmpty()) {
                q4.f.G1(fVar, this.f125079d, (((long) Float.floatToRawIntBits(f17)) << c15) | (((long) Float.floatToRawIntBits(fH2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c15) | (((long) Float.floatToRawIntBits(fH2)) & 4294967295L), 0.0f, 0, null, 0, 504);
            }
            c14 = c15;
            f16 = f17;
        }
        return new f((int) (j8 >> c14), i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private g(long j8, s0 s0Var, x0 x0Var, x0 x0Var2) {
        super(s0Var, x0Var, x0Var2);
        s0Var.getClass();
        x0Var.getClass();
        x0Var2.getClass();
        this.f125079d = j8;
    }

    public /* synthetic */ g(long j8, s0 s0Var, x0 x0Var, x0 x0Var2, p005kotlin.jvm.internal.j jVar) {
        this(j8, s0Var, x0Var, x0Var2);
    }
}

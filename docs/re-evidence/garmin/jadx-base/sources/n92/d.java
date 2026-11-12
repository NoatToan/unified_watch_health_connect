package n92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;
import s5.q0;
import s5.s0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln92/d;", "Ln92/n;", "", "", "labels", "Ls5/s0;", "textMeasurer", "Ls5/x0;", TtmlNode.TAG_STYLE, "", "justifyEndLabels", "Lo4/v0;", "endLabelImageBitmap", "<init>", "(Ljava/util/List;Ls5/s0;Ls5/x0;Ljava/lang/Boolean;Lo4/v0;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f125073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f125074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f125075e;

    public /* synthetic */ d(List list, s0 s0Var, x0 x0Var, Boolean bool, v0 v0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, s0Var, x0Var, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : v0Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0086  */
    @Override // n92.n
    public final void a(q4.f fVar, float f14) {
        float f15;
        float f16;
        fVar.getClass();
        d92.b.f58623a.getClass();
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.e eVar = j92.b.f97899b;
        float f17 = eVar.f97918c;
        bVar.getClass();
        float f18 = eVar.f97917b;
        List<String> list = this.f125073c;
        int i14 = 0;
        q0 q0VarA = null;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            String str = (String) obj;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.b() >> 32)) / (list.size() - 1)) * i14;
            int length = str.length();
            x0 x0Var = this.f125092b;
            if (length > 0) {
                q0VarA = s0.a(this.f125091a, str, x0Var, 0L, 1020);
                long j8 = q0VarA.f157282c;
                if (!s.g(this.f125074d, Boolean.TRUE)) {
                    f15 = ((int) (j8 >> 32)) / 2.0f;
                    f16 = fIntBitsToFloat - f15;
                } else if (i14 == 0) {
                    f15 = 8.0f;
                    f16 = fIntBitsToFloat - f15;
                } else if (i14 == list.size() - 1) {
                    f16 = (fIntBitsToFloat - ((int) (j8 >> 32))) + 16.0f;
                } else {
                    f15 = ((int) (j8 >> 32)) / 2.0f;
                    f16 = fIntBitsToFloat - f15;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - ((int) (j8 & 4294967295L)))) & 4294967295L);
                n4.c.a aVar = n4.c.f123541b;
                s5.v0.b(fVar, q0VarA, 0L, jFloatToRawIntBits, 250);
            }
            v0 v0Var = this.f125075e;
            if (v0Var == null || i14 != list.size() - 1) {
                long jC = x0Var.c();
                float f19 = (i14 == 0 || i14 == list.size() + (-1)) ? f17 : f18;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - ((q0VarA != null ? (int) (q0VarA.f157282c & 4294967295L) : 0) * 1.5f))) & 4294967295L);
                n4.c.a aVar2 = n4.c.f123541b;
                q4.f.o0(fVar, jC, f19, jFloatToRawIntBits2, null, 0, 120);
            } else {
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat - (v0Var.getWidth() / 2.0f))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - (q0VarA != null ? (int) (q0VarA.f157282c & 4294967295L) : 0)) - v0Var.getHeight())) & 4294967295L);
                n4.c.a aVar3 = n4.c.f123541b;
                q4.f.w0(fVar, v0Var, jFloatToRawIntBits3, null, 60);
            }
            i14 = i15;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List<String> list, s0 s0Var, x0 x0Var, Boolean bool, v0 v0Var) {
        super(s0Var, x0Var);
        list.getClass();
        s0Var.getClass();
        x0Var.getClass();
        this.f125073c = list;
        this.f125074d = bool;
        this.f125075e = v0Var;
    }
}

package n92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;
import s5.q0;
import s5.s0;
import s5.v0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln92/i;", "Ln92/n;", "", "", "labels", "", "drawTextOnlyForEndLabels", "useSmallerIntermediateDots", "Ls5/s0;", "textMeasurer", "Ls5/x0;", TtmlNode.TAG_STYLE, "justifyEndLabels", "Lg6/f;", "bigDotRadius", "smallDotRadius", "<init>", "(Ljava/util/List;ZZLs5/s0;Ls5/x0;Ljava/lang/Boolean;FFLkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f125080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f125081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f125082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f125083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f125084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f125085h;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(List list, boolean z14, boolean z15, s0 s0Var, x0 x0Var, Boolean bool, float f14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        float f16;
        float f17;
        boolean z16 = (i14 & 2) != 0 ? false : z14;
        boolean z17 = (i14 & 4) != 0 ? true : z15;
        Boolean bool2 = (i14 & 32) != 0 ? null : bool;
        if ((i14 & 64) != 0) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f16 = j92.b.f97899b.f97918c;
        } else {
            f16 = f14;
        }
        if ((i14 & 128) != 0) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f17 = j92.b.f97899b.f97917b;
        } else {
            f17 = f15;
        }
        this(list, z16, z17, s0Var, x0Var, bool2, f16, f17, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    @Override // n92.n
    public final void a(q4.f fVar, float f14) {
        int iNextIndex;
        char c14;
        float f15;
        char c15;
        fVar.getClass();
        List<String> list = this.f125080c;
        Iterator<String> it = list.iterator();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i15 = -1;
                break;
            } else if (it.next().length() > 0) {
                break;
            } else {
                i15++;
            }
        }
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().length() > 0) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            int i16 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            String str = (String) next;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.b() >> 32)) / (list.size() - 1)) * i14;
            if (str.length() > 0) {
                s0 s0Var = this.f125091a;
                x0 x0Var = this.f125092b;
                q0 q0VarA = s0.a(s0Var, str, x0Var, 0L, 1020);
                long j8 = q0VarA.f157282c;
                if (!s.g(this.f125083f, Boolean.TRUE)) {
                    c14 = ' ';
                    f15 = fIntBitsToFloat - (((int) (j8 >> 32)) / 2.0f);
                } else if (i14 == 0) {
                    c14 = ' ';
                    f15 = fIntBitsToFloat - 8.0f;
                } else if (i14 == list.size() - 1) {
                    c14 = ' ';
                    f15 = (fIntBitsToFloat - ((int) (j8 >> 32))) + 16.0f;
                } else {
                    c14 = ' ';
                    f15 = fIntBitsToFloat - (((int) (j8 >> 32)) / 2.0f);
                }
                if (!this.f125081d || x.k(Integer.valueOf(i15), Integer.valueOf(iNextIndex)).contains(Integer.valueOf(i14))) {
                    c15 = c14;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) << c15) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - ((int) (j8 & 4294967295L)))) & 4294967295L);
                    n4.c.a aVar = n4.c.f123541b;
                    v0.b(fVar, q0VarA, 0L, jFloatToRawIntBits, 250);
                } else {
                    c15 = c14;
                }
                long jC = x0Var.c();
                float f16 = (!this.f125082e || x.k(Integer.valueOf(i15), Integer.valueOf(iNextIndex)).contains(Integer.valueOf(i14))) ? this.f125084g : this.f125085h;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c15) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - (((int) (j8 & 4294967295L)) * 1.5f))) & 4294967295L);
                n4.c.a aVar2 = n4.c.f123541b;
                q4.f.o0(fVar, jC, f16, jFloatToRawIntBits2, null, 0, 120);
            } else {
                list = list;
                it3 = it3;
                iNextIndex = iNextIndex;
            }
            iNextIndex = iNextIndex;
            i14 = i16;
            list = list;
            it3 = it3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private i(List<String> list, boolean z14, boolean z15, s0 s0Var, x0 x0Var, Boolean bool, float f14, float f15) {
        super(s0Var, x0Var);
        list.getClass();
        s0Var.getClass();
        x0Var.getClass();
        this.f125080c = list;
        this.f125081d = z14;
        this.f125082e = z15;
        this.f125083f = bool;
        this.f125084g = f14;
        this.f125085h = f15;
    }

    public /* synthetic */ i(List list, boolean z14, boolean z15, s0 s0Var, x0 x0Var, Boolean bool, float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(list, z14, z15, s0Var, x0Var, bool, f14, f15);
    }
}

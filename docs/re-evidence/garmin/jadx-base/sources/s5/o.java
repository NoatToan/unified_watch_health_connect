package s5;

import android.graphics.Matrix;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import o4.p1;
import o4.q1;
import o4.t1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\n\u0010\u0018B[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u001bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\n\u0010 B-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010!B[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\"B[\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\n\u0010#¨\u0006$"}, d2 = {"Ls5/o;", "", "Ls5/q;", "intrinsics", "", "maxLines", "", "ellipsis", "", "width", "<init>", "(Ls5/q;IZF)V", "Ls5/c;", "annotatedString", "Ls5/x0;", TtmlNode.TAG_STYLE, "", "Ls5/c$d;", "Ls5/y;", "placeholders", "Lg6/c;", "density", "Lw5/p$b;", "resourceLoader", "(Ls5/c;Ls5/x0;Ljava/util/List;IZFLg6/c;Lw5/p$b;)V", "Lw5/q$b;", "fontFamilyResolver", "(Ls5/c;Ls5/x0;FLg6/c;Lw5/q$b;Ljava/util/List;IZ)V", "Lg6/a;", "constraints", "Ld6/p;", "overflow", "(Ls5/q;JIILkotlin/jvm/internal/j;)V", "(Ls5/q;JIZLkotlin/jvm/internal/j;)V", "(Ls5/c;Ls5/x0;JLg6/c;Lw5/q$b;Ljava/util/List;IZLkotlin/jvm/internal/j;)V", "(Ls5/c;Ls5/x0;JLg6/c;Lw5/q$b;Ljava/util/List;IILkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f157252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f157254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f157255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f157256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f157257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f157258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f157259h;

    private o(q qVar, long j8, int i14, int i15) {
        boolean z14;
        int i16;
        this.f157252a = qVar;
        this.f157253b = i14;
        if (g6.a.l(j8) != 0 || g6.a.k(j8) != 0) {
            y5.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = qVar.f157279e;
        int size = arrayList2.size();
        int i17 = 0;
        float f14 = 0.0f;
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                z14 = false;
                break;
            }
            t tVar = (t) arrayList2.get(i18);
            u uVar = tVar.f157302a;
            int iJ = g6.a.j(j8);
            if (g6.a.e(j8)) {
                i16 = g6.a.i(j8) - v.b(f14);
                if (i16 < 0) {
                    i16 = 0;
                }
            } else {
                i16 = g6.a.i(j8);
            }
            long jB = g6.b.b(iJ, i16, 5);
            int i19 = this.f157253b - i17;
            uVar.getClass();
            b bVar = new b((a6.d) uVar, i19, i15, jB, null);
            float height = bVar.getHeight() + f14;
            t5.b0 b0Var = bVar.f157131d;
            int i24 = i17 + b0Var.f162409h;
            arrayList.add(new s(bVar, tVar.f157303b, tVar.f157304c, i17, i24, f14, height));
            if (b0Var.f162406e || (i24 == this.f157253b && i18 != p13.x.j(this.f157252a.f157279e))) {
                z14 = true;
                i17 = i24;
                f14 = height;
                break;
            } else {
                i18++;
                i17 = i24;
                f14 = height;
            }
        }
        this.f157256e = f14;
        this.f157257f = i17;
        this.f157254c = z14;
        this.f157259h = arrayList;
        this.f157255d = g6.a.j(j8);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i25 = 0; i25 < size2; i25++) {
            s sVar = (s) arrayList.get(i25);
            List<n4.d> listY = sVar.f157290a.y();
            ArrayList arrayList4 = new ArrayList(listY.size());
            int size3 = listY.size();
            for (int i26 = 0; i26 < size3; i26++) {
                n4.d dVar = listY.get(i26);
                arrayList4.add(dVar != null ? sVar.a(dVar) : null);
            }
            p13.d0.v(arrayList3, arrayList4);
        }
        if (arrayList3.size() < this.f157252a.f157276b.size()) {
            int size4 = this.f157252a.f157276b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i27 = 0; i27 < size4; i27++) {
                arrayList5.add(null);
            }
            arrayList3 = p13.h0.C0(arrayList3, arrayList5);
        }
        this.f157258g = arrayList3;
    }

    public static void j(o oVar, o4.y yVar, long j8, q1 q1Var, d6.i iVar, q4.g gVar, int i14, int i15) {
        int i16;
        if ((i15 & 2) != 0) {
            o4.d0.f128823b.getClass();
            j8 = o4.d0.f128832k;
        }
        long j14 = j8;
        q1 q1Var2 = (i15 & 4) != 0 ? null : q1Var;
        d6.i iVar2 = (i15 & 8) != 0 ? null : iVar;
        q4.g gVar2 = (i15 & 16) != 0 ? null : gVar;
        if ((i15 & 32) != 0) {
            q4.f.f142555o0.getClass();
            i16 = q4.f.a.f142557b;
        } else {
            i16 = i14;
        }
        oVar.i(yVar, j14, q1Var2, iVar2, gVar2, i16);
    }

    public static void l(o oVar, o4.y yVar, o4.w wVar, float f14, q1 q1Var, d6.i iVar, q4.g gVar) {
        q4.f.f142555o0.getClass();
        oVar.k(yVar, wVar, f14, q1Var, iVar, gVar, q4.f.a.f142557b);
    }

    public final void a(long j8, float[] fArr) {
        m(w0.h(j8));
        n(w0.g(j8));
        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
        p0Var.f105807a = 0;
        oe2.f.s(this.f157259h, j8, new bn0.h(j8, fArr, p0Var, new p005kotlin.jvm.internal.o0()));
    }

    public final float b(int i14) {
        o(i14);
        ArrayList arrayList = this.f157259h;
        s sVar = (s) arrayList.get(oe2.f.q(i14, arrayList));
        return sVar.f157290a.s(i14 - sVar.f157293d) + sVar.f157295f;
    }

    public final int c(int i14, boolean z14) {
        o(i14);
        ArrayList arrayList = this.f157259h;
        s sVar = (s) arrayList.get(oe2.f.q(i14, arrayList));
        return sVar.f157290a.p(i14 - sVar.f157293d, z14) + sVar.f157291b;
    }

    public final int d(int i14) {
        int iP;
        int length = this.f157252a.f157275a.f157138b.length();
        ArrayList arrayList = this.f157259h;
        if (i14 >= length) {
            iP = p13.x.j(arrayList);
        } else {
            iP = i14 < 0 ? 0 : oe2.f.p(i14, arrayList);
        }
        s sVar = (s) arrayList.get(iP);
        return sVar.f157290a.m(sVar.d(i14)) + sVar.f157293d;
    }

    public final int e(float f14) {
        ArrayList arrayList = this.f157259h;
        s sVar = (s) arrayList.get(oe2.f.r(arrayList, f14));
        int i14 = sVar.f157292c - sVar.f157291b;
        int i15 = sVar.f157293d;
        return i14 == 0 ? i15 : sVar.f157290a.q(f14 - sVar.f157295f) + i15;
    }

    public final float f(int i14) {
        o(i14);
        ArrayList arrayList = this.f157259h;
        s sVar = (s) arrayList.get(oe2.f.q(i14, arrayList));
        return sVar.f157290a.f(i14 - sVar.f157293d) + sVar.f157295f;
    }

    public final int g(long j8) {
        int i14 = (int) (j8 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i14);
        ArrayList arrayList = this.f157259h;
        s sVar = (s) arrayList.get(oe2.f.r(arrayList, fIntBitsToFloat));
        int i15 = sVar.f157292c;
        int i16 = sVar.f157291b;
        if (i15 - i16 == 0) {
            return i16;
        }
        r rVar = sVar.f157290a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i14) - sVar.f157295f;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L;
        n4.c.a aVar = n4.c.f123541b;
        return rVar.o(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32)) + i16;
    }

    public final long h(n4.d dVar, int i14, n0 n0Var) {
        long jB;
        long j8;
        float f14 = dVar.f123548b;
        ArrayList arrayList = this.f157259h;
        int iR = oe2.f.r(arrayList, f14);
        float f15 = ((s) arrayList.get(iR)).f157296g;
        float f16 = dVar.f123550d;
        if (f15 >= f16 || iR == p13.x.j(arrayList)) {
            s sVar = (s) arrayList.get(iR);
            return sVar.b(sVar.f157290a.i(sVar.c(dVar), i14, n0Var), true);
        }
        int iR2 = oe2.f.r(arrayList, f16);
        w0.f157315b.getClass();
        long jB2 = w0.f157316c;
        while (true) {
            w0.f157315b.getClass();
            jB = w0.f157316c;
            if (!w0.d(jB2, jB) || iR > iR2) {
                break;
            }
            s sVar2 = (s) arrayList.get(iR);
            jB2 = sVar2.b(sVar2.f157290a.i(sVar2.c(dVar), i14, n0Var), true);
            iR++;
        }
        if (w0.d(jB2, jB)) {
            return jB;
        }
        while (true) {
            w0.f157315b.getClass();
            j8 = w0.f157316c;
            if (!w0.d(jB, j8) || iR > iR2) {
                break;
            }
            s sVar3 = (s) arrayList.get(iR2);
            jB = sVar3.b(sVar3.f157290a.i(sVar3.c(dVar), i14, n0Var), true);
            iR2--;
        }
        return w0.d(jB, j8) ? jB2 : og.a.l((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void i(o4.y yVar, long j8, q1 q1Var, d6.i iVar, q4.g gVar, int i14) {
        yVar.l();
        ArrayList arrayList = this.f157259h;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            s sVar = (s) arrayList.get(i15);
            sVar.f157290a.k(yVar, j8, q1Var, iVar, gVar, i14);
            yVar.q(0.0f, sVar.f157290a.getHeight());
        }
        yVar.i();
    }

    public final void k(o4.y yVar, o4.w wVar, float f14, q1 q1Var, d6.i iVar, q4.g gVar, int i14) {
        yVar.l();
        ArrayList arrayList = this.f157259h;
        if (arrayList.size() <= 1 || (wVar instanceof t1)) {
            a6.a.a(this, yVar, wVar, f14, q1Var, iVar, gVar, i14);
        } else {
            if (!(wVar instanceof p1)) {
                lc.u0.r();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i15 = 0; i15 < size; i15++) {
                s sVar = (s) arrayList.get(i15);
                height += sVar.f157290a.getHeight();
                fMax = Math.max(fMax, sVar.f157290a.getWidth());
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(height)) & 4294967295L);
            n4.g.a aVar = n4.g.f123559b;
            Shader shaderB = ((p1) wVar).b(jFloatToRawIntBits);
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                r rVar = ((s) arrayList.get(i16)).f157290a;
                rVar.t(yVar, new o4.x(shaderB), f14, q1Var, iVar, gVar, i14);
                yVar.q(0.0f, rVar.getHeight());
                matrix.setTranslate(0.0f, -rVar.getHeight());
                shaderB.setLocalMatrix(matrix);
            }
        }
        yVar.i();
    }

    public final void m(int i14) {
        boolean z14 = false;
        q qVar = this.f157252a;
        if (i14 >= 0 && i14 < qVar.f157275a.f157138b.length()) {
            z14 = true;
        }
        if (z14) {
            return;
        }
        StringBuilder sbI = b71.i.i(i14, "offset(", ") is out of bounds [0, ");
        sbI.append(qVar.f157275a.f157138b.length());
        sbI.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        y5.a.a(sbI.toString());
    }

    public final void n(int i14) {
        boolean z14 = false;
        q qVar = this.f157252a;
        if (i14 >= 0 && i14 <= qVar.f157275a.f157138b.length()) {
            z14 = true;
        }
        if (z14) {
            return;
        }
        StringBuilder sbI = b71.i.i(i14, "offset(", ") is out of bounds [0, ");
        sbI.append(qVar.f157275a.f157138b.length());
        sbI.append(']');
        y5.a.a(sbI.toString());
    }

    public final void o(int i14) {
        boolean z14 = false;
        int i15 = this.f157257f;
        if (i14 >= 0 && i14 < i15) {
            z14 = true;
        }
        if (z14) {
            return;
        }
        y5.a.a("lineIndex(" + i14 + ") is out of bounds [0, " + i15 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @o13.e
    public /* synthetic */ o(c cVar, x0 x0Var, long j8, g6.c cVar2, w5.q.b bVar, List list, int i14, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, x0Var, j8, cVar2, bVar, (List<c.d<y>>) list, i14, z14);
    }

    public /* synthetic */ o(q qVar, long j8, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(qVar, j8, i14, i15);
    }

    @o13.e
    public /* synthetic */ o(q qVar, long j8, int i14, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(qVar, j8, i14, z14);
    }

    public /* synthetic */ o(c cVar, x0 x0Var, long j8, g6.c cVar2, w5.q.b bVar, List list, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(cVar, x0Var, j8, cVar2, bVar, (List<c.d<y>>) list, i14, i15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(q qVar, long j8, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        int i17 = (i16 & 4) != 0 ? Integer.MAX_VALUE : i14;
        if ((i16 & 8) != 0) {
            d6.p.f57793b.getClass();
            i15 = d6.p.f57794c;
        }
        this(qVar, j8, i17, i15, (p005kotlin.jvm.internal.j) null);
    }

    public o(c cVar, x0 x0Var, float f14, g6.c cVar2, w5.q.b bVar, List list, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(cVar, x0Var, f14, cVar2, bVar, (List<c.d<y>>) ((i15 & 32) != 0 ? p13.j0.f134944a : list), (i15 & 64) != 0 ? Integer.MAX_VALUE : i14, (i15 & 128) != 0 ? false : z14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(c cVar, x0 x0Var, long j8, g6.c cVar2, w5.q.b bVar, List list, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        int i17;
        List list2 = (i16 & 32) != 0 ? p13.j0.f134944a : list;
        int i18 = (i16 & 64) != 0 ? Integer.MAX_VALUE : i14;
        if ((i16 & 128) != 0) {
            d6.p.f57793b.getClass();
            i17 = d6.p.f57794c;
        } else {
            i17 = i15;
        }
        this(cVar, x0Var, j8, cVar2, bVar, list2, i18, i17, (p005kotlin.jvm.internal.j) null);
    }

    public o(c cVar, x0 x0Var, long j8, g6.c cVar2, w5.q.b bVar, List list, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(cVar, x0Var, j8, cVar2, bVar, (i15 & 32) != 0 ? p13.j0.f134944a : list, (i15 & 64) != 0 ? Integer.MAX_VALUE : i14, (i15 & 128) != 0 ? false : z14, (p005kotlin.jvm.internal.j) null);
    }

    public o(c cVar, x0 x0Var, List list, int i14, boolean z14, float f14, g6.c cVar2, w5.p.b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(cVar, x0Var, (List<c.d<y>>) ((i15 & 4) != 0 ? p13.j0.f134944a : list), (i15 & 8) != 0 ? Integer.MAX_VALUE : i14, (i15 & 16) != 0 ? false : z14, f14, cVar2, bVar);
    }

    public /* synthetic */ o(q qVar, long j8, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(qVar, j8, (i15 & 4) != 0 ? Integer.MAX_VALUE : i14, (i15 & 8) != 0 ? false : z14, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private o(q qVar, long j8, int i14, boolean z14) {
        int i15;
        if (z14) {
            d6.p.f57793b.getClass();
            i15 = d6.p.f57795d;
        } else {
            d6.p.f57793b.getClass();
            i15 = d6.p.f57794c;
        }
        this(qVar, j8, i14, i15, (p005kotlin.jvm.internal.j) null);
    }

    public /* synthetic */ o(q qVar, int i14, boolean z14, float f14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(qVar, (i15 & 2) != 0 ? Integer.MAX_VALUE : i14, (i15 & 4) != 0 ? false : z14, f14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @o13.e
    public o(q qVar, int i14, boolean z14, float f14) {
        int i15;
        long jB = g6.b.b(v.b(f14), 0, 13);
        if (z14) {
            d6.p.f57793b.getClass();
            i15 = d6.p.f57795d;
        } else {
            d6.p.f57793b.getClass();
            i15 = d6.p.f57794c;
        }
        this(qVar, jB, i14, i15, (p005kotlin.jvm.internal.j) null);
    }

    @o13.e
    public o(c cVar, x0 x0Var, List<c.d<y>> list, int i14, boolean z14, float f14, g6.c cVar2, w5.p.b bVar) {
        int i15;
        q qVar = new q(cVar, x0Var, list, cVar2, w5.n.a(bVar));
        d6.p.f57793b.getClass();
        if (z14) {
            i15 = d6.p.f57795d;
        } else {
            i15 = d6.p.f57794c;
        }
        this(qVar, g6.b.b(v.b(f14), 0, 13), i14, i15, (p005kotlin.jvm.internal.j) null);
    }

    @o13.e
    public o(c cVar, x0 x0Var, float f14, g6.c cVar2, w5.q.b bVar, List<c.d<y>> list, int i14, boolean z14) {
        int i15;
        q qVar = new q(cVar, x0Var, list, cVar2, bVar);
        d6.p.f57793b.getClass();
        if (z14) {
            i15 = d6.p.f57795d;
        } else {
            i15 = d6.p.f57794c;
        }
        this(qVar, g6.b.b(v.b(f14), 0, 13), i14, i15, (p005kotlin.jvm.internal.j) null);
    }

    private o(c cVar, x0 x0Var, long j8, g6.c cVar2, w5.q.b bVar, List<c.d<y>> list, int i14, boolean z14) {
        int i15;
        q qVar = new q(cVar, x0Var, list, cVar2, bVar);
        d6.p.f57793b.getClass();
        if (z14) {
            i15 = d6.p.f57795d;
        } else {
            i15 = d6.p.f57794c;
        }
        this(qVar, j8, i14, i15, (p005kotlin.jvm.internal.j) null);
    }

    private o(c cVar, x0 x0Var, long j8, g6.c cVar2, w5.q.b bVar, List<c.d<y>> list, int i14, int i15) {
        this(new q(cVar, x0Var, list, cVar2, bVar), j8, i14, i15, (p005kotlin.jvm.internal.j) null);
    }
}

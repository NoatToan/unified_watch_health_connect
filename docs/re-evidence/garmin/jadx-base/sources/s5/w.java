package s5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bs\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0016B7\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0017BO\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0018Bg\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Ls5/w;", "Ls5/c$a;", "Ld6/h;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Ld6/j;", "textDirection", "Lg6/q;", "lineHeight", "Ld6/n;", "textIndent", "Ls5/a0;", "platformStyle", "Ld6/f;", "lineHeightStyle", "Ld6/e;", "lineBreak", "Ld6/d;", "hyphens", "Ld6/o;", "textMotion", "<init>", "(IIJLd6/n;Ls5/a0;Ld6/f;IILd6/o;Lkotlin/jvm/internal/j;)V", "(Ld6/h;Ld6/j;JLd6/n;Ls5/a0;Ld6/f;Ld6/e;Ld6/d;Ld6/o;Lkotlin/jvm/internal/j;)V", "(Ld6/h;Ld6/j;JLd6/n;Lkotlin/jvm/internal/j;)V", "(Ld6/h;Ld6/j;JLd6/n;Ls5/a0;Ld6/f;Lkotlin/jvm/internal/j;)V", "(Ld6/h;Ld6/j;JLd6/n;Ls5/a0;Ld6/f;Ld6/e;Ld6/d;Lkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f157308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d6.n f157309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f157310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d6.f f157311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f157312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f157313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d6.o f157314i;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(int i14, int i15, long j8, d6.n nVar, a0 a0Var, d6.f fVar, int i16, int i17, d6.o oVar, int i18, p005kotlin.jvm.internal.j jVar) {
        int i19;
        int i24;
        long j14;
        int i25;
        int i26 = 0;
        if ((i18 & 1) != 0) {
            d6.h.f57752b.getClass();
            i19 = 0;
        } else {
            i19 = i14;
        }
        if ((i18 & 2) != 0) {
            d6.j.f57765b.getClass();
            i24 = 0;
        } else {
            i24 = i15;
        }
        if ((i18 & 4) != 0) {
            g6.q.f76018b.getClass();
            j14 = g6.q.f76020d;
        } else {
            j14 = j8;
        }
        d6.n nVar2 = (i18 & 8) != 0 ? null : nVar;
        a0 a0Var2 = (i18 & 16) != 0 ? null : a0Var;
        d6.f fVar2 = (i18 & 32) != 0 ? null : fVar;
        if ((i18 & 64) != 0) {
            d6.e.f57712b.getClass();
            i25 = 0;
        } else {
            i25 = i16;
        }
        if ((i18 & 128) != 0) {
            d6.d.f57708b.getClass();
        } else {
            i26 = i17;
        }
        this(i19, i24, j14, nVar2, a0Var2, fVar2, i25, i26, (i18 & 256) == 0 ? oVar : null, (p005kotlin.jvm.internal.j) null);
    }

    public final w a(w wVar) {
        return wVar == null ? this : x.a(this, wVar.f157306a, wVar.f157307b, wVar.f157308c, wVar.f157309d, wVar.f157310e, wVar.f157311f, wVar.f157312g, wVar.f157313h, wVar.f157314i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        int i14 = wVar.f157306a;
        d6.h.a aVar = d6.h.f57752b;
        if (this.f157306a == i14) {
            int i15 = wVar.f157307b;
            d6.j.a aVar2 = d6.j.f57765b;
            if (this.f157307b != i15 || !g6.q.b(this.f157308c, wVar.f157308c) || !p005kotlin.jvm.internal.s.g(this.f157309d, wVar.f157309d) || !p005kotlin.jvm.internal.s.g(this.f157310e, wVar.f157310e) || !p005kotlin.jvm.internal.s.g(this.f157311f, wVar.f157311f)) {
                return false;
            }
            int i16 = wVar.f157312g;
            d6.e.a aVar3 = d6.e.f57712b;
            if (this.f157312g == i16) {
                int i17 = wVar.f157313h;
                d6.d.a aVar4 = d6.d.f57708b;
                return this.f157313h == i17 && p005kotlin.jvm.internal.s.g(this.f157314i, wVar.f157314i);
            }
        }
        return false;
    }

    public final int hashCode() {
        d6.h.a aVar = d6.h.f57752b;
        int iHashCode = Integer.hashCode(this.f157306a) * 31;
        d6.j.a aVar2 = d6.j.f57765b;
        int iD = q2.d(this.f157307b, iHashCode, 31);
        g6.q.a aVar3 = g6.q.f76018b;
        int iE = q6.f.e(iD, 31, this.f157308c);
        d6.n nVar = this.f157309d;
        int iHashCode2 = (iE + (nVar != null ? nVar.hashCode() : 0)) * 31;
        a0 a0Var = this.f157310e;
        int iHashCode3 = (iHashCode2 + (a0Var != null ? a0Var.hashCode() : 0)) * 31;
        d6.f fVar = this.f157311f;
        int iHashCode4 = (iHashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        d6.e.a aVar4 = d6.e.f57712b;
        int iD2 = q2.d(this.f157312g, iHashCode4, 31);
        d6.d.a aVar5 = d6.d.f57708b;
        int iD3 = q2.d(this.f157313h, iD2, 31);
        d6.o oVar = this.f157314i;
        return iD3 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) d6.h.b(this.f157306a)) + ", textDirection=" + ((Object) d6.j.b(this.f157307b)) + ", lineHeight=" + ((Object) g6.q.f(this.f157308c)) + ", textIndent=" + this.f157309d + ", platformStyle=" + this.f157310e + ", lineHeightStyle=" + this.f157311f + ", lineBreak=" + ((Object) d6.e.b(this.f157312g)) + ", hyphens=" + ((Object) d6.d.b(this.f157313h)) + ", textMotion=" + this.f157314i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private w(d6.h hVar, d6.j jVar, long j8, d6.n nVar) {
        int i14;
        int i15 = 0;
        if (hVar != null) {
            i14 = hVar.f57759a;
        } else {
            d6.h.f57752b.getClass();
            i14 = 0;
        }
        if (jVar != null) {
            i15 = jVar.f57771a;
        } else {
            d6.j.f57765b.getClass();
        }
        int i16 = i15;
        d6.e.f57712b.getClass();
        d6.d.f57708b.getClass();
        this(i14, i16, j8, nVar, (a0) null, (d6.f) null, 0, 0, (d6.o) null, (p005kotlin.jvm.internal.j) null);
    }

    @o13.e
    public /* synthetic */ w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, p005kotlin.jvm.internal.j jVar2) {
        this(hVar, jVar, j8, nVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, a0 a0Var, d6.f fVar) {
        int i14;
        int i15 = 0;
        if (hVar != null) {
            i14 = hVar.f57759a;
        } else {
            d6.h.f57752b.getClass();
            i14 = 0;
        }
        if (jVar != null) {
            i15 = jVar.f57771a;
        } else {
            d6.j.f57765b.getClass();
        }
        int i16 = i15;
        d6.e.f57712b.getClass();
        d6.d.f57708b.getClass();
        this(i14, i16, j8, nVar, a0Var, fVar, 0, 0, (d6.o) null, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, a0 a0Var, d6.f fVar, d6.e eVar, d6.d dVar) {
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        if (hVar != null) {
            i14 = hVar.f57759a;
        } else {
            d6.h.f57752b.getClass();
            i14 = 0;
        }
        if (jVar != null) {
            i15 = jVar.f57771a;
        } else {
            d6.j.f57765b.getClass();
            i15 = 0;
        }
        if (eVar != null) {
            i16 = eVar.f57714a;
        } else {
            d6.e.f57712b.getClass();
            i16 = 0;
        }
        if (dVar != null) {
            i17 = dVar.f57711a;
        } else {
            d6.d.f57708b.getClass();
        }
        this(i14, i15, j8, nVar, a0Var, fVar, i16, i17, (d6.o) null, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, a0 a0Var, d6.f fVar, d6.e eVar, d6.d dVar, d6.o oVar) {
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        if (hVar != null) {
            i14 = hVar.f57759a;
        } else {
            d6.h.f57752b.getClass();
            i14 = 0;
        }
        if (jVar != null) {
            i15 = jVar.f57771a;
        } else {
            d6.j.f57765b.getClass();
            i15 = 0;
        }
        if (eVar != null) {
            i16 = eVar.f57714a;
        } else {
            d6.e.f57712b.getClass();
            i16 = 0;
        }
        if (dVar != null) {
            i17 = dVar.f57711a;
        } else {
            d6.d.f57708b.getClass();
        }
        this(i14, i15, j8, nVar, a0Var, fVar, i16, i17, oVar, (p005kotlin.jvm.internal.j) null);
    }

    @o13.e
    public /* synthetic */ w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, a0 a0Var, d6.f fVar, d6.e eVar, d6.d dVar, d6.o oVar, p005kotlin.jvm.internal.j jVar2) {
        this(hVar, jVar, j8, nVar, a0Var, fVar, eVar, dVar, oVar);
    }

    @o13.e
    public /* synthetic */ w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, a0 a0Var, d6.f fVar, d6.e eVar, d6.d dVar, p005kotlin.jvm.internal.j jVar2) {
        this(hVar, jVar, j8, nVar, a0Var, fVar, eVar, dVar);
    }

    @o13.e
    public /* synthetic */ w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, a0 a0Var, d6.f fVar, p005kotlin.jvm.internal.j jVar2) {
        this(hVar, jVar, j8, nVar, a0Var, fVar);
    }

    private w(int i14, int i15, long j8, d6.n nVar, a0 a0Var, d6.f fVar, int i16, int i17, d6.o oVar) {
        this.f157306a = i14;
        this.f157307b = i15;
        this.f157308c = j8;
        this.f157309d = nVar;
        this.f157310e = a0Var;
        this.f157311f = fVar;
        this.f157312g = i16;
        this.f157313h = i17;
        this.f157314i = oVar;
        g6.q.f76018b.getClass();
        if (g6.q.b(j8, g6.q.f76020d)) {
            return;
        }
        if (g6.q.d(j8) >= 0.0f) {
            return;
        }
        y5.a.c("lineHeight can't be negative (" + g6.q.d(j8) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ w(int i14, int i15, long j8, d6.n nVar, a0 a0Var, d6.f fVar, int i16, int i17, d6.o oVar, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, j8, nVar, a0Var, fVar, i16, i17, oVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, a0 a0Var, d6.f fVar, d6.e eVar, d6.d dVar, d6.o oVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        hVar = (i14 & 1) != 0 ? null : hVar;
        jVar = (i14 & 2) != 0 ? null : jVar;
        if ((i14 & 4) != 0) {
            g6.q.f76018b.getClass();
            j8 = g6.q.f76020d;
        }
        this(hVar, jVar, j8, (i14 & 8) != 0 ? null : nVar, (i14 & 16) != 0 ? null : a0Var, (i14 & 32) != 0 ? null : fVar, (i14 & 64) != 0 ? null : eVar, (i14 & 128) != 0 ? null : dVar, (i14 & 256) == 0 ? oVar : null, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        d6.h hVar2 = (i14 & 1) != 0 ? null : hVar;
        d6.j jVar3 = (i14 & 2) != 0 ? null : jVar;
        if ((i14 & 4) != 0) {
            g6.q.f76018b.getClass();
            j8 = g6.q.f76020d;
        }
        this(hVar2, jVar3, j8, (i14 & 8) != 0 ? null : nVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, a0 a0Var, d6.f fVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        hVar = (i14 & 1) != 0 ? null : hVar;
        jVar = (i14 & 2) != 0 ? null : jVar;
        if ((i14 & 4) != 0) {
            g6.q.f76018b.getClass();
            j8 = g6.q.f76020d;
        }
        this(hVar, jVar, j8, (i14 & 8) != 0 ? null : nVar, (i14 & 16) != 0 ? null : a0Var, (i14 & 32) != 0 ? null : fVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(d6.h hVar, d6.j jVar, long j8, d6.n nVar, a0 a0Var, d6.f fVar, d6.e eVar, d6.d dVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        hVar = (i14 & 1) != 0 ? null : hVar;
        jVar = (i14 & 2) != 0 ? null : jVar;
        if ((i14 & 4) != 0) {
            g6.q.f76018b.getClass();
            j8 = g6.q.f76020d;
        }
        this(hVar, jVar, j8, (i14 & 8) != 0 ? null : nVar, (i14 & 16) != 0 ? null : a0Var, (i14 & 32) != 0 ? null : fVar, (i14 & 64) != 0 ? null : eVar, (i14 & 128) == 0 ? dVar : null, (p005kotlin.jvm.internal.j) null);
    }
}

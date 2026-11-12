package kotlin;

import android.graphics.Rect;
import d6.g;
import n4.d;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p5.y;
import s5.o;
import s5.q0;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Li5/e;", "Li5/b;", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static e f91139f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q0 f91142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f91143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f91138e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f91140g = g.Rtl;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f91141h = g.Ltr;

    private e() {
        new Rect();
    }

    @Override // kotlin.b
    public final int[] a(int i14) {
        int iE;
        if (c().length() <= 0 || i14 >= c().length()) {
            return null;
        }
        try {
            y yVar = this.f91143d;
            if (yVar == null) {
                s.m("node");
                throw null;
            }
            d dVarG = yVar.g();
            int iRound = Math.round(dVarG.f123550d - dVarG.f123548b);
            if (i14 <= 0) {
                i14 = 0;
            }
            q0 q0Var = this.f91142c;
            if (q0Var == null) {
                s.m("layoutResult");
                throw null;
            }
            int iD = q0Var.f157281b.d(i14);
            q0 q0Var2 = this.f91142c;
            if (q0Var2 == null) {
                s.m("layoutResult");
                throw null;
            }
            float f14 = q0Var2.f157281b.f(iD) + iRound;
            q0 q0Var3 = this.f91142c;
            if (q0Var3 == null) {
                s.m("layoutResult");
                throw null;
            }
            if (q0Var3 == null) {
                s.m("layoutResult");
                throw null;
            }
            o oVar = q0Var3.f157281b;
            float f15 = oVar.f(oVar.f157257f - 1);
            q0 q0Var4 = this.f91142c;
            if (f14 < f15) {
                if (q0Var4 == null) {
                    s.m("layoutResult");
                    throw null;
                }
                iE = q0Var4.f157281b.e(f14);
            } else {
                if (q0Var4 == null) {
                    s.m("layoutResult");
                    throw null;
                }
                iE = q0Var4.f157281b.f157257f;
            }
            return b(i14, e(iE - 1, f91141h) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // kotlin.b
    public final int[] d(int i14) {
        int iE;
        if (c().length() <= 0 || i14 <= 0) {
            return null;
        }
        try {
            y yVar = this.f91143d;
            if (yVar == null) {
                s.m("node");
                throw null;
            }
            d dVarG = yVar.g();
            int iRound = Math.round(dVarG.f123550d - dVarG.f123548b);
            int length = c().length();
            if (length <= i14) {
                i14 = length;
            }
            q0 q0Var = this.f91142c;
            if (q0Var == null) {
                s.m("layoutResult");
                throw null;
            }
            int iD = q0Var.f157281b.d(i14);
            q0 q0Var2 = this.f91142c;
            if (q0Var2 == null) {
                s.m("layoutResult");
                throw null;
            }
            float f14 = q0Var2.f157281b.f(iD) - iRound;
            if (f14 > 0.0f) {
                q0 q0Var3 = this.f91142c;
                if (q0Var3 == null) {
                    s.m("layoutResult");
                    throw null;
                }
                iE = q0Var3.f157281b.e(f14);
            } else {
                iE = 0;
            }
            if (i14 == c().length() && iE < iD) {
                iE++;
            }
            return b(e(iE, f91140g), i14);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i14, g gVar) {
        q0 q0Var = this.f91142c;
        if (q0Var == null) {
            s.m("layoutResult");
            throw null;
        }
        int i15 = q0Var.i(i14);
        q0 q0Var2 = this.f91142c;
        if (q0Var2 == null) {
            s.m("layoutResult");
            throw null;
        }
        g gVarJ = q0Var2.j(i15);
        q0 q0Var3 = this.f91142c;
        if (gVar != gVarJ) {
            if (q0Var3 != null) {
                return q0Var3.i(i14);
            }
            s.m("layoutResult");
            throw null;
        }
        if (q0Var3 != null) {
            return q0Var3.f157281b.c(i14, false) - 1;
        }
        s.m("layoutResult");
        throw null;
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Li5/e$a;", "", "<init>", "()V", "Li5/e;", "pageInstance", "Li5/e;", "Ld6/g;", "DirectionStart", "Ld6/g;", "DirectionEnd", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(j jVar) {
        this();
    }
}

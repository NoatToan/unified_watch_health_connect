package p006l2;

import ch.qos.logback.core.CoreConstants;
import cw1.k0;
import e23.a;
import f5.a1;
import f5.b1;
import f5.o0;
import f5.v1;
import f5.y0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import x5.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll2/p1;", "Lf5/o0;", "Ll2/f3;", "scrollerPosition", "", "cursorOffset", "Lx5/q0;", "transformedText", "Lkotlin/Function0;", "Ll2/i3;", "textLayoutResultProvider", "<init>", "(Ll2/f3;ILx5/q0;Le23/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class p1 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f108699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f108701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a<i3> f108702d;

    public p1(f3 f3Var, int i14, q0 q0Var, a<i3> aVar) {
        this.f108699a = f3Var;
        this.f108700b = i14;
        this.f108701c = q0Var;
        this.f108702d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return s.g(this.f108699a, p1Var.f108699a) && this.f108700b == p1Var.f108700b && s.g(this.f108701c, p1Var.f108701c) && s.g(this.f108702d, p1Var.f108702d);
    }

    public final int hashCode() {
        return this.f108702d.hashCode() + ((this.f108701c.hashCode() + q2.d(this.f108700b, this.f108699a.hashCode() * 31, 31)) * 31);
    }

    @Override // f5.o0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final a1 mo0measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        long j14;
        if (y0Var.l0(g6.a.i(j8)) < g6.a.j(j8)) {
            j14 = j8;
        } else {
            j14 = j8;
            j8 = g6.a.c(0, Integer.MAX_VALUE, 0, 0, 13, j14);
        }
        v1 v1VarQ = y0Var.Q(j8);
        int iMin = Math.min(v1VarQ.f69144a, g6.a.j(j14));
        return b1.h0(b1Var, iMin, v1VarQ.f69145b, new k0(this, b1Var, v1VarQ, iMin, 5));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f108699a + ", cursorOffset=" + this.f108700b + ", transformedText=" + this.f108701c + ", textLayoutResultProvider=" + this.f108702d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

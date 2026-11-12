package s5;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls5/i;", "", "Ls5/p0;", "textLayoutInput", "<init>", "(Ls5/p0;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f157210a;

    public i(p0 p0Var) {
        this.f157210a = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        p0 p0Var = this.f157210a;
        c cVar = p0Var.f157265a;
        p0 p0Var2 = ((i) obj).f157210a;
        if (!p005kotlin.jvm.internal.s.g(cVar, p0Var2.f157265a) || !p0Var.f157266b.d(p0Var2.f157266b) || !p005kotlin.jvm.internal.s.g(p0Var.f157267c, p0Var2.f157267c) || p0Var.f157268d != p0Var2.f157268d || p0Var.f157269e != p0Var2.f157269e) {
            return false;
        }
        int i14 = p0Var.f157270f;
        int i15 = p0Var2.f157270f;
        d6.p.a aVar = d6.p.f57793b;
        return i14 == i15 && p005kotlin.jvm.internal.s.g(p0Var.f157271g, p0Var2.f157271g) && p0Var.f157272h == p0Var2.f157272h && p0Var.f157273i == p0Var2.f157273i && g6.a.d(p0Var.f157274j, p0Var2.f157274j);
    }

    public final int hashCode() {
        p0 p0Var = this.f157210a;
        int iHashCode = p0Var.f157265a.hashCode() * 31;
        x0 x0Var = p0Var.f157266b;
        i0 i0Var = x0Var.f157322a;
        long j8 = i0Var.fontSize;
        g6.q.a aVar = g6.q.f76018b;
        int iHashCode2 = Long.hashCode(j8) * 31;
        w5.f0 f0Var = i0Var.fontWeight;
        int i14 = (iHashCode2 + (f0Var != null ? f0Var.f182107a : 0)) * 31;
        w5.b0 b0Var = i0Var.fontStyle;
        int iHashCode3 = (i14 + (b0Var != null ? Integer.hashCode(b0Var.f182072a) : 0)) * 31;
        w5.c0 c0Var = i0Var.fontSynthesis;
        int iHashCode4 = (iHashCode3 + (c0Var != null ? Integer.hashCode(c0Var.f182079a) : 0)) * 31;
        w5.q qVar = i0Var.fontFamily;
        int iHashCode5 = (iHashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        String str = i0Var.fontFeatureSettings;
        int iE = q6.f.e((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, i0Var.letterSpacing);
        d6.a aVar2 = i0Var.baselineShift;
        int iHashCode6 = (iE + (aVar2 != null ? Float.hashCode(aVar2.f57704a) : 0)) * 31;
        d6.m mVar = i0Var.textGeometricTransform;
        int iHashCode7 = (iHashCode6 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        z5.c cVar = i0Var.localeList;
        int iHashCode8 = (iHashCode7 + (cVar != null ? cVar.f202443a.hashCode() : 0)) * 31;
        long j14 = i0Var.f157222l;
        o4.d0.a aVar3 = o4.d0.f128823b;
        o13.z.a aVar4 = o13.z.f128618b;
        int iE2 = q6.f.e(iHashCode8, 31, j14);
        b0 b0Var2 = i0Var.platformStyle;
        int iHashCode9 = (x0Var.f157323b.hashCode() + ((iE2 + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31)) * 31;
        c0 c0Var2 = x0Var.platformStyle;
        int iG = q6.f.g((lc.u0.b((iHashCode9 + (c0Var2 != null ? c0Var2.hashCode() : 0) + iHashCode) * 31, 31, p0Var.f157267c) + p0Var.f157268d) * 31, 31, p0Var.f157269e);
        int i15 = p0Var.f157270f;
        d6.p.a aVar5 = d6.p.f57793b;
        int iHashCode10 = (p0Var.f157273i.hashCode() + ((p0Var.f157272h.hashCode() + ((p0Var.f157271g.hashCode() + q2.d(i15, iG, 31)) * 31)) * 31)) * 31;
        long j15 = p0Var.f157274j;
        g6.a.C1525a c1525a = g6.a.f75987b;
        return Long.hashCode(j15) + iHashCode10;
    }
}

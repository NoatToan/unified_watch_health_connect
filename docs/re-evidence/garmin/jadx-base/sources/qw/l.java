package qw;

import b63.o;
import b63.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqw/l;", "", "Lb63/o;", "navigateToDate", "Lo82/g;", "selectedIntervalType", "selectedDate", "Lpw/a;", "readingToBeDeleted", "", "showSummaryPdfExportMenuItem", "<init>", "(Lb63/o;Lo82/g;Lb63/o;Lpw/a;Z)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f148284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f148285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f148286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pw.a f148287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f148288e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(o oVar, o82.g gVar, o oVar2, pw.a aVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        oVar = (i14 & 1) != 0 ? null : oVar;
        gVar = (i14 & 2) != 0 ? o82.g.f130850c : gVar;
        if ((i14 & 4) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar2 = b63.b.f(c0229a, z.Companion.a());
        }
        this(oVar, gVar, oVar2, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? false : z14);
    }

    public static l a(l lVar, o oVar, o82.g gVar, o oVar2, pw.a aVar, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            oVar = lVar.f148284a;
        }
        o oVar3 = oVar;
        if ((i14 & 2) != 0) {
            gVar = lVar.f148285b;
        }
        o82.g gVar2 = gVar;
        if ((i14 & 4) != 0) {
            oVar2 = lVar.f148286c;
        }
        o oVar4 = oVar2;
        if ((i14 & 8) != 0) {
            aVar = lVar.f148287d;
        }
        pw.a aVar2 = aVar;
        if ((i14 & 16) != 0) {
            z14 = lVar.f148288e;
        }
        lVar.getClass();
        gVar2.getClass();
        oVar4.getClass();
        return new l(oVar3, gVar2, oVar4, aVar2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f148284a, lVar.f148284a) && this.f148285b == lVar.f148285b && s.g(this.f148286c, lVar.f148286c) && s.g(this.f148287d, lVar.f148287d) && this.f148288e == lVar.f148288e;
    }

    public final int hashCode() {
        o oVar = this.f148284a;
        int iA = n23.j.a(this.f148286c.f16206a, q6.f.i(this.f148285b, (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31, 31), 31);
        pw.a aVar = this.f148287d;
        return Boolean.hashCode(this.f148288e) + ((iA + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BloodPressureUiState(navigateToDate=");
        sb3.append(this.f148284a);
        sb3.append(", selectedIntervalType=");
        sb3.append(this.f148285b);
        sb3.append(", selectedDate=");
        sb3.append(this.f148286c);
        sb3.append(", readingToBeDeleted=");
        sb3.append(this.f148287d);
        sb3.append(", showSummaryPdfExportMenuItem=");
        return hb.a.k(sb3, this.f148288e, ")");
    }

    public l(o oVar, o82.g gVar, o oVar2, pw.a aVar, boolean z14) {
        gVar.getClass();
        oVar2.getClass();
        this.f148284a = oVar;
        this.f148285b = gVar;
        this.f148286c = oVar2;
        this.f148287d = aVar;
        this.f148288e = z14;
    }

    public l() {
        this(null, null, null, null, false, 31, null);
    }
}

package hq;

import java.util.List;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhq/l;", "", "", "headerLabel", "", "Lhq/n;", "summaries", "Lhq/k;", "columnWidthInfo", "", "isWeightRequired", "<init>", "(Ljava/lang/String;Ljava/util/List;Lhq/k;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<n> f85060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f85061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f85062d;

    public l(String str, List list, k kVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? j53.l.b() : list, (i14 & 4) != 0 ? new k(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 63, null) : kVar, (i14 & 8) != 0 ? true : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f85059a, lVar.f85059a) && p005kotlin.jvm.internal.s.g(this.f85060b, lVar.f85060b) && p005kotlin.jvm.internal.s.g(this.f85061c, lVar.f85061c) && this.f85062d == lVar.f85062d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85062d) + ((this.f85061c.hashCode() + lc.u0.b(this.f85059a.hashCode() * 31, 31, this.f85060b)) * 31);
    }

    public final String toString() {
        StringBuilder sbG = l2.g("ExerciseTableData(headerLabel=", this.f85059a, ", summaries=", this.f85060b, ", columnWidthInfo=");
        sbG.append(this.f85061c);
        sbG.append(", isWeightRequired=");
        sbG.append(this.f85062d);
        sbG.append(")");
        return sbG.toString();
    }

    public l(String str, List<n> list, k kVar, boolean z14) {
        str.getClass();
        list.getClass();
        kVar.getClass();
        this.f85059a = str;
        this.f85060b = list;
        this.f85061c = kVar;
        this.f85062d = z14;
    }

    public l() {
        this(null, null, null, false, 15, null);
    }
}

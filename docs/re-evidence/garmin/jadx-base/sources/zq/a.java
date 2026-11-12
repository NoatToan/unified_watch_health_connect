package zq;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps.x1;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzq/a;", "", "Lps/x1;", "fastestRun", "run", "", "gates", "<init>", "(Lps/x1;Lps/x1;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f206624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f206625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<x1> f206626c;

    public /* synthetic */ a(x1 x1Var, x1 x1Var2, List list, int i14, j jVar) {
        this(x1Var, (i14 & 2) != 0 ? null : x1Var2, (i14 & 4) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f206624a, aVar.f206624a) && s.g(this.f206625b, aVar.f206625b) && s.g(this.f206626c, aVar.f206626c);
    }

    public final int hashCode() {
        x1 x1Var = this.f206624a;
        int iHashCode = (x1Var == null ? 0 : x1Var.hashCode()) * 31;
        x1 x1Var2 = this.f206625b;
        int iHashCode2 = (iHashCode + (x1Var2 == null ? 0 : x1Var2.hashCode())) * 31;
        List<x1> list = this.f206626c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TimingGateTableModel(fastestRun=");
        sb3.append(this.f206624a);
        sb3.append(", run=");
        sb3.append(this.f206625b);
        sb3.append(", gates=");
        return z.c(sb3, this.f206626c, ")");
    }

    public a(x1 x1Var, x1 x1Var2, List<x1> list) {
        this.f206624a = x1Var;
        this.f206625b = x1Var2;
        this.f206626c = list;
    }
}

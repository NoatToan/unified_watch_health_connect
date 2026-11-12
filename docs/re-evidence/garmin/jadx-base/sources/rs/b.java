package rs;

import am.x0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.o1;
import ps.q1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrs/b;", "", "Lam/x0;", "activityType", "Lps/q1;", "totalSummary", "Lrs/a;", "lapColumnDataModel", "Lar/c;", "distanceData", "", "hasIntensityIntervals", "hideIntervalHeader", "hasSplits", "", "Lps/o1;", "splitSummaries", "<init>", "(Lam/x0;Lps/q1;Lrs/a;Lar/c;ZZZLjava/util/List;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f154295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f154296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f154297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ar.c f154298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f154299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f154300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f154301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<o1> f154302h;

    public b(x0 x0Var, q1 q1Var, a aVar, ar.c cVar, boolean z14, boolean z15, boolean z16, List<o1> list) {
        x0Var.getClass();
        q1Var.getClass();
        aVar.getClass();
        cVar.getClass();
        list.getClass();
        this.f154295a = x0Var;
        this.f154296b = q1Var;
        this.f154297c = aVar;
        this.f154298d = cVar;
        this.f154299e = z14;
        this.f154300f = z15;
        this.f154301g = z16;
        this.f154302h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f154295a == bVar.f154295a && s.g(this.f154296b, bVar.f154296b) && s.g(this.f154297c, bVar.f154297c) && s.g(this.f154298d, bVar.f154298d) && this.f154299e == bVar.f154299e && this.f154300f == bVar.f154300f && this.f154301g == bVar.f154301g && s.g(this.f154302h, bVar.f154302h);
    }

    public final int hashCode() {
        return this.f154302h.hashCode() + q6.f.g(q6.f.g(q6.f.g((this.f154298d.hashCode() + ((this.f154297c.hashCode() + ((this.f154296b.hashCode() + (this.f154295a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f154299e), 31, this.f154300f), 31, this.f154301g);
    }

    public final String toString() {
        boolean z14 = this.f154300f;
        StringBuilder sb3 = new StringBuilder("LapsData(activityType=");
        sb3.append(this.f154295a);
        sb3.append(", totalSummary=");
        sb3.append(this.f154296b);
        sb3.append(", lapColumnDataModel=");
        sb3.append(this.f154297c);
        sb3.append(", distanceData=");
        sb3.append(this.f154298d);
        sb3.append(", hasIntensityIntervals=");
        kg.f.q(", hideIntervalHeader=", ", hasSplits=", sb3, this.f154299e, z14);
        sb3.append(this.f154301g);
        sb3.append(", splitSummaries=");
        sb3.append(this.f154302h);
        sb3.append(")");
        return sb3.toString();
    }

    public /* synthetic */ b(x0 x0Var, q1 q1Var, a aVar, ar.c cVar, boolean z14, boolean z15, boolean z16, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, q1Var, aVar, cVar, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? false : z16, list);
    }
}

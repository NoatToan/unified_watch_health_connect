package dy1;

import c22.a4;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldy1/q;", "", "Lc22/a4;", "weekDay", "Lmx1/b;", "defaultSTPDay", "stpDay", "", "isSelectable", "<init>", "(Lc22/a4;Lmx1/b;Lmx1/b;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4 f61605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx1.b f61606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx1.b f61607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61608d;

    public /* synthetic */ q(a4 a4Var, mx1.b bVar, mx1.b bVar2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(a4Var, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : bVar2, (i14 & 8) != 0 ? true : z14);
    }

    public static q a(q qVar, mx1.b bVar, mx1.b bVar2, boolean z14, int i14) {
        a4 a4Var = qVar.f61605a;
        if ((i14 & 2) != 0) {
            bVar = qVar.f61606b;
        }
        if ((i14 & 4) != 0) {
            bVar2 = qVar.f61607c;
        }
        if ((i14 & 8) != 0) {
            z14 = qVar.f61608d;
        }
        qVar.getClass();
        a4Var.getClass();
        return new q(a4Var, bVar, bVar2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f61605a == qVar.f61605a && this.f61606b == qVar.f61606b && this.f61607c == qVar.f61607c && this.f61608d == qVar.f61608d;
    }

    public final int hashCode() {
        int iHashCode = this.f61605a.hashCode() * 31;
        mx1.b bVar = this.f61606b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        mx1.b bVar2 = this.f61607c;
        return Boolean.hashCode(this.f61608d) + ((iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TrainingDayState(weekDay=" + this.f61605a + ", defaultSTPDay=" + this.f61606b + ", stpDay=" + this.f61607c + ", isSelectable=" + this.f61608d + ")";
    }

    public q(a4 a4Var, mx1.b bVar, mx1.b bVar2, boolean z14) {
        a4Var.getClass();
        this.f61605a = a4Var;
        this.f61606b = bVar;
        this.f61607c = bVar2;
        this.f61608d = z14;
    }
}

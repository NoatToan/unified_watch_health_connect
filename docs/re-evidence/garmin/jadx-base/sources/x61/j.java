package x61;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lx61/j;", "", "", "statusLabel", "", "statusColor", "formattedTimeInterval", "", "visible", "", "percentageOfTotal", "isPausedSection", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZFZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f189255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f189257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f189258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f189259f;

    public j(String str, int i14, String str2, boolean z14, float f14, boolean z15) {
        str.getClass();
        str2.getClass();
        this.f189254a = str;
        this.f189255b = i14;
        this.f189256c = str2;
        this.f189257d = z14;
        this.f189258e = f14;
        this.f189259f = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f189254a, jVar.f189254a) && this.f189255b == jVar.f189255b && p005kotlin.jvm.internal.s.g(this.f189256c, jVar.f189256c) && this.f189257d == jVar.f189257d && Float.compare(this.f189258e, jVar.f189258e) == 0 && this.f189259f == jVar.f189259f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189259f) + q6.f.d(this.f189258e, q6.f.g(wr.g.j(q2.d(this.f189255b, this.f189254a.hashCode() * 31, 31), 31, this.f189256c), 31, this.f189257d), 31);
    }

    public final String toString() {
        StringBuilder sbK = androidx.core.view.j.k(this.f189255b, "TrainingStatusInfo(statusLabel=", this.f189254a, ", statusColor=", ", formattedTimeInterval=");
        v.h.C(this.f189256c, ", visible=", ", percentageOfTotal=", sbK, this.f189257d);
        sbK.append(this.f189258e);
        sbK.append(", isPausedSection=");
        sbK.append(this.f189259f);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ j(String str, int i14, String str2, boolean z14, float f14, boolean z15, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, str2, z14, f14, (i15 & 32) != 0 ? false : z15);
    }
}

package zo1;

import p005kotlin.Metadata;
import ps.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzo1/c;", "", "Lps/x1;", "climb", "", "title", "titleDetails", "", "final", "<init>", "(Lps/x1;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f206241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f206243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f206244d;

    static {
        x1.a aVar = x1.F1;
    }

    public c(x1 x1Var, String str, String str2, boolean z14) {
        x1Var.getClass();
        str.getClass();
        str2.getClass();
        this.f206241a = x1Var;
        this.f206242b = str;
        this.f206243c = str2;
        this.f206244d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f206241a.equals(cVar.f206241a) && this.f206242b.equals(cVar.f206242b) && this.f206243c.equals(cVar.f206243c) && this.f206244d == cVar.f206244d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206244d) + wr.g.j(wr.g.j(this.f206241a.hashCode() * 31, 31, this.f206242b), 31, this.f206243c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClimbWithTitleAndFinal(climb=");
        sb3.append(this.f206241a);
        sb3.append(", title=");
        sb3.append(this.f206242b);
        sb3.append(", titleDetails=");
        return am.j.n(this.f206243c, ", final=", ")", sb3, this.f206244d);
    }
}

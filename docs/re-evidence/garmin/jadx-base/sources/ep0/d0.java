package ep0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lep0/d0;", "", "Lep0/b0;", "statType", "", "value", "valueContentDescription", "Lep0/c0;", "trend", "Lep0/a0;", "progress", "<init>", "(Lep0/b0;Ljava/lang/String;Ljava/lang/String;Lep0/c0;Lep0/a0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f64872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f64875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f64876e;

    public /* synthetic */ d0(b0 b0Var, String str, String str2, c0 c0Var, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b0Var, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : c0Var, (i14 & 16) != 0 ? null : a0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.f64872a, d0Var.f64872a) && p005kotlin.jvm.internal.s.g(this.f64873b, d0Var.f64873b) && p005kotlin.jvm.internal.s.g(this.f64874c, d0Var.f64874c) && p005kotlin.jvm.internal.s.g(this.f64875d, d0Var.f64875d) && p005kotlin.jvm.internal.s.g(this.f64876e, d0Var.f64876e);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f64872a.hashCode() * 31, 31, this.f64873b);
        String str = this.f64874c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        c0 c0Var = this.f64875d;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        a0 a0Var = this.f64876e;
        return iHashCode2 + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public final String toString() {
        return "YesterdayItem(statType=" + this.f64872a + ", value=" + this.f64873b + ", valueContentDescription=" + this.f64874c + ", trend=" + this.f64875d + ", progress=" + this.f64876e + ")";
    }

    public d0(b0 b0Var, String str, String str2, c0 c0Var, a0 a0Var) {
        b0Var.getClass();
        str.getClass();
        this.f64872a = b0Var;
        this.f64873b = str;
        this.f64874c = str2;
        this.f64875d = c0Var;
        this.f64876e = a0Var;
    }
}

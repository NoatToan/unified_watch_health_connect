package l72;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll72/j0;", "", "", "text", "contentDescription", "Lu4/d;", "icon", "", "enabled", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu4/d;ZZ)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.d f111074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f111075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f111076e;

    public /* synthetic */ j0(String str, String str2, u4.d dVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? str : str2, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? true : z14, (i14 & 16) != 0 ? false : z15);
    }

    public static j0 a(j0 j0Var, String str, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            str = j0Var.f111072a;
        }
        String str2 = str;
        String str3 = j0Var.f111073b;
        u4.d dVar = j0Var.f111074c;
        boolean z15 = (i14 & 8) != 0 ? j0Var.f111075d : false;
        if ((i14 & 16) != 0) {
            z14 = j0Var.f111076e;
        }
        str2.getClass();
        str3.getClass();
        return new j0(str2, str3, dVar, z15, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p005kotlin.jvm.internal.s.g(this.f111072a, j0Var.f111072a) && p005kotlin.jvm.internal.s.g(this.f111073b, j0Var.f111073b) && p005kotlin.jvm.internal.s.g(this.f111074c, j0Var.f111074c) && this.f111075d == j0Var.f111075d && this.f111076e == j0Var.f111076e;
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f111072a.hashCode() * 31, 31, this.f111073b);
        u4.d dVar = this.f111074c;
        return Boolean.hashCode(this.f111076e) + q6.f.g((iJ + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f111075d);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ChipData(text=", this.f111072a, ", contentDescription=", this.f111073b, ", icon=");
        sbI.append(this.f111074c);
        sbI.append(", enabled=");
        sbI.append(this.f111075d);
        sbI.append(", selected=");
        return hb.a.k(sbI, this.f111076e, ")");
    }

    public j0(String str, String str2, u4.d dVar, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        this.f111072a = str;
        this.f111073b = str2;
        this.f111074c = dVar;
        this.f111075d = z14;
        this.f111076e = z15;
    }
}

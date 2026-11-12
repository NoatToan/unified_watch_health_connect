package ve2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lve2/i;", "", "", "customerGUID", "Lve2/j;", "mfaMethod", "mfaMethodLastUsed", "<init>", "(Ljava/lang/String;Lve2/j;Lve2/j;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f177744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f177745c;

    public i(String str, j jVar, j jVar2) {
        str.getClass();
        this.f177743a = str;
        this.f177744b = jVar;
        this.f177745c = jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f177743a.equals(iVar.f177743a) && this.f177744b == iVar.f177744b && this.f177745c == iVar.f177745c;
    }

    public final int hashCode() {
        int iHashCode = this.f177743a.hashCode() * 31;
        j jVar = this.f177744b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.f177745c;
        return iHashCode2 + (jVar2 != null ? jVar2.hashCode() : 0);
    }

    public final String toString() {
        String strName;
        String strName2;
        String str = "";
        j jVar = this.f177744b;
        if (jVar == null || (strName = jVar.name()) == null) {
            strName = "";
        }
        j jVar2 = this.f177745c;
        if (jVar2 != null && (strName2 = jVar2.name()) != null) {
            str = strName2;
        }
        return am.j.o(str, ")", p6.b.i("MFALoginInfo(customerGUID=", this.f177743a, ", mfaMethod=", strName, ", mfaMethodLastUsed="));
    }
}

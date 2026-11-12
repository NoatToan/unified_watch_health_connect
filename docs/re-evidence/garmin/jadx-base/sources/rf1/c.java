package rf1;

import am.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrf1/c;", "", "", "customerGUID", "Lrf1/e;", "mfaMethod", "mfaMethodLastUsed", "<init>", "(Ljava/lang/String;Lrf1/e;Lrf1/e;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f152417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f152418c;

    public c(String str, e eVar, e eVar2) {
        str.getClass();
        this.f152416a = str;
        this.f152417b = eVar;
        this.f152418c = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f152416a.equals(cVar.f152416a) && this.f152417b == cVar.f152417b && this.f152418c == cVar.f152418c;
    }

    public final int hashCode() {
        int iHashCode = this.f152416a.hashCode() * 31;
        e eVar = this.f152417b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.f152418c;
        return iHashCode2 + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        String strName;
        String strName2;
        String str = "";
        e eVar = this.f152417b;
        if (eVar == null || (strName = eVar.name()) == null) {
            strName = "";
        }
        e eVar2 = this.f152418c;
        if (eVar2 != null && (strName2 = eVar2.name()) != null) {
            str = strName2;
        }
        return j.o(str, ")", p6.b.i("MFALoginInfo(customerGUID=", this.f152416a, ", mfaMethod=", strName, ", mfaMethodLastUsed="));
    }
}

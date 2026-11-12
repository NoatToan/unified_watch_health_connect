package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class aci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f879b;
    public final String c;
    public final String d;
    public final String e;

    public aci(String str, String str2, String str3, String str4, String str5) {
        this.f878a = str;
        this.f879b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aci)) {
            return false;
        }
        aci aciVar = (aci) obj;
        return wlq.c(this.f878a, aciVar.f878a) && wlq.c(this.f879b, aciVar.f879b) && wlq.c(this.c, aciVar.c) && wlq.c(this.d, aciVar.d) && wlq.c(this.e, aciVar.e);
    }

    public int hashCode() {
        String str = this.f878a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f879b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}

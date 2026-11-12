package d11;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld11/g;", "", "", "name", "brand", "note", "", "servingAmount", "Lg01/c;", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lg01/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f57072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g01.c f57073e;

    public /* synthetic */ g(String str, String str2, String str3, Double d14, g01.c cVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? g01.c.SERVING : cVar);
    }

    public static g a(g gVar, String str, String str2, String str3, Double d14, g01.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            str = gVar.f57069a;
        }
        String str4 = str;
        if ((i14 & 2) != 0) {
            str2 = gVar.f57070b;
        }
        String str5 = str2;
        if ((i14 & 4) != 0) {
            str3 = gVar.f57071c;
        }
        String str6 = str3;
        if ((i14 & 8) != 0) {
            d14 = gVar.f57072d;
        }
        Double d15 = d14;
        if ((i14 & 16) != 0) {
            cVar = gVar.f57073e;
        }
        g01.c cVar2 = cVar;
        gVar.getClass();
        cVar2.getClass();
        return new g(str4, str5, str6, d15, cVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f57069a, gVar.f57069a) && s.g(this.f57070b, gVar.f57070b) && s.g(this.f57071c, gVar.f57071c) && s.g(this.f57072d, gVar.f57072d) && this.f57073e == gVar.f57073e;
    }

    public final int hashCode() {
        String str = this.f57069a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57070b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57071c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.f57072d;
        return this.f57073e.hashCode() + ((iHashCode3 + (d14 != null ? d14.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("RecipeDetailsUiState(name=", this.f57069a, ", brand=", this.f57070b, ", note=");
        b71.i.x(sbI, this.f57071c, ", servingAmount=", this.f57072d, ", unit=");
        sbI.append(this.f57073e);
        sbI.append(")");
        return sbI.toString();
    }

    public g(String str, String str2, String str3, Double d14, g01.c cVar) {
        cVar.getClass();
        this.f57069a = str;
        this.f57070b = str2;
        this.f57071c = str3;
        this.f57072d = d14;
        this.f57073e = cVar;
    }

    public g() {
        this(null, null, null, null, null, 31, null);
    }
}

package d11;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld11/c;", "", "", "foodId", "name", "brand", "", "servingAmount", "servingId", "Lg01/c;", "unit", "Lb11/f;", "nutritionContent", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "regionCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lg01/c;Lb11/f;Ljava/lang/String;Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f57051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g01.c f57053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b11.f f57054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f57055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f57056i;

    public /* synthetic */ c(String str, String str2, String str3, Double d14, String str4, g01.c cVar, b11.f fVar, String str5, String str6, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : cVar, (i14 & 64) != 0 ? new b11.f(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null) : fVar, str5, str6);
    }

    public static c a(c cVar, String str, String str2, String str3, Double d14, String str4, g01.c cVar2, b11.f fVar, int i14) {
        if ((i14 & 1) != 0) {
            str = cVar.f57048a;
        }
        String str5 = str;
        if ((i14 & 2) != 0) {
            str2 = cVar.f57049b;
        }
        String str6 = str2;
        if ((i14 & 4) != 0) {
            str3 = cVar.f57050c;
        }
        String str7 = str3;
        if ((i14 & 8) != 0) {
            d14 = cVar.f57051d;
        }
        Double d15 = d14;
        String str8 = (i14 & 16) != 0 ? cVar.f57052e : str4;
        g01.c cVar3 = (i14 & 32) != 0 ? cVar.f57053f : cVar2;
        b11.f fVar2 = (i14 & 64) != 0 ? cVar.f57054g : fVar;
        String str9 = cVar.f57055h;
        String str10 = cVar.f57056i;
        cVar.getClass();
        fVar2.getClass();
        str9.getClass();
        str10.getClass();
        return new c(str5, str6, str7, d15, str8, cVar3, fVar2, str9, str10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f57048a, cVar.f57048a) && s.g(this.f57049b, cVar.f57049b) && s.g(this.f57050c, cVar.f57050c) && s.g(this.f57051d, cVar.f57051d) && s.g(this.f57052e, cVar.f57052e) && this.f57053f == cVar.f57053f && s.g(this.f57054g, cVar.f57054g) && s.g(this.f57055h, cVar.f57055h) && s.g(this.f57056i, cVar.f57056i);
    }

    public final int hashCode() {
        String str = this.f57048a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57049b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57050c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.f57051d;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.f57052e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        g01.c cVar = this.f57053f;
        return this.f57056i.hashCode() + wr.g.j((this.f57054g.hashCode() + ((iHashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31)) * 31, 31, this.f57055h);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CustomFoodData(foodId=", this.f57048a, ", name=", this.f57049b, ", brand=");
        b71.i.x(sbI, this.f57050c, ", servingAmount=", this.f57051d, ", servingId=");
        sbI.append(this.f57052e);
        sbI.append(", unit=");
        sbI.append(this.f57053f);
        sbI.append(", nutritionContent=");
        sbI.append(this.f57054g);
        sbI.append(", languageCode=");
        sbI.append(this.f57055h);
        sbI.append(", regionCode=");
        return am.j.o(this.f57056i, ")", sbI);
    }

    public c(String str, String str2, String str3, Double d14, String str4, g01.c cVar, b11.f fVar, String str5, String str6) {
        fVar.getClass();
        str5.getClass();
        str6.getClass();
        this.f57048a = str;
        this.f57049b = str2;
        this.f57050c = str3;
        this.f57051d = d14;
        this.f57052e = str4;
        this.f57053f = cVar;
        this.f57054g = fVar;
        this.f57055h = str5;
        this.f57056i = str6;
    }
}

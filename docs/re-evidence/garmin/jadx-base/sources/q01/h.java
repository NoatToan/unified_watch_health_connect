package q01;

import b11.v;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import y22.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lq01/h;", "", "", "name", "brand", "note", "", "servingAmount", "servingId", "Lg01/c;", "unit", "Ly22/x;", "photo", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "regionCode", "", "Lb11/v;", "foods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lg01/c;Ly22/x;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f142024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f142025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f142026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g01.c f142027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f142028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f142029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f142030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<v> f142031j;

    public h(String str, String str2, String str3, Double d14, String str4, g01.c cVar, x xVar, String str5, String str6, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? g01.c.SERVING : cVar, (i14 & 64) != 0 ? null : xVar, str5, str6, (i14 & 512) != 0 ? j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f142022a, hVar.f142022a) && s.g(this.f142023b, hVar.f142023b) && s.g(this.f142024c, hVar.f142024c) && s.g(this.f142025d, hVar.f142025d) && s.g(this.f142026e, hVar.f142026e) && this.f142027f == hVar.f142027f && s.g(this.f142028g, hVar.f142028g) && s.g(this.f142029h, hVar.f142029h) && s.g(this.f142030i, hVar.f142030i) && s.g(this.f142031j, hVar.f142031j);
    }

    public final int hashCode() {
        String str = this.f142022a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f142023b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f142024c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.f142025d;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.f142026e;
        int iHashCode5 = (this.f142027f.hashCode() + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        x xVar = this.f142028g;
        return this.f142031j.hashCode() + wr.g.j(wr.g.j((iHashCode5 + (xVar != null ? xVar.hashCode() : 0)) * 31, 31, this.f142029h), 31, this.f142030i);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("RecipeData(name=", this.f142022a, ", brand=", this.f142023b, ", note=");
        b71.i.x(sbI, this.f142024c, ", servingAmount=", this.f142025d, ", servingId=");
        sbI.append(this.f142026e);
        sbI.append(", unit=");
        sbI.append(this.f142027f);
        sbI.append(", photo=");
        sbI.append(this.f142028g);
        sbI.append(", languageCode=");
        sbI.append(this.f142029h);
        sbI.append(", regionCode=");
        sbI.append(this.f142030i);
        sbI.append(", foods=");
        sbI.append(this.f142031j);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(String str, String str2, String str3, Double d14, String str4, g01.c cVar, x xVar, String str5, String str6, List<? extends v> list) {
        cVar.getClass();
        str5.getClass();
        str6.getClass();
        list.getClass();
        this.f142022a = str;
        this.f142023b = str2;
        this.f142024c = str3;
        this.f142025d = d14;
        this.f142026e = str4;
        this.f142027f = cVar;
        this.f142028g = xVar;
        this.f142029h = str5;
        this.f142030i = str6;
        this.f142031j = list;
    }
}

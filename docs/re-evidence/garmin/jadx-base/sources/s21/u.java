package s21;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.j0;
import p13.k0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ls21/u;", "", "", "isLoading", "isError", "navigateBackWithData", "", "selectedLanguageName", "recommendedLanguageName", "", "languageOptions", "Ll01/d;", "selectedCountry", "", "countryOptions", "<init>", "(ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ll01/d;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f156176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f156177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f156179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f156180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f156181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l01.d f156182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<l01.d> f156183h;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(boolean z14, boolean z15, boolean z16, String str, String str2, Map map, l01.d dVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        z15 = (i14 & 2) != 0 ? false : z15;
        z16 = (i14 & 4) != 0 ? false : z16;
        str = (i14 & 8) != 0 ? null : str;
        str2 = (i14 & 16) != 0 ? null : str2;
        if ((i14 & 32) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(z14, z15, z16, str, str2, map, (i14 & 64) != 0 ? null : dVar, (i14 & 128) != 0 ? j0.f134944a : list);
    }

    public static u a(u uVar, boolean z14, boolean z15, String str, String str2, Map map, l01.d dVar, List list, int i14) {
        if ((i14 & 1) != 0) {
            z14 = uVar.f156176a;
        }
        boolean z16 = z14;
        if ((i14 & 2) != 0) {
            z15 = uVar.f156177b;
        }
        boolean z17 = z15;
        boolean z18 = (i14 & 4) != 0 ? uVar.f156178c : true;
        if ((i14 & 8) != 0) {
            str = uVar.f156179d;
        }
        String str3 = str;
        if ((i14 & 16) != 0) {
            str2 = uVar.f156180e;
        }
        String str4 = str2;
        if ((i14 & 32) != 0) {
            map = uVar.f156181f;
        }
        Map map2 = map;
        if ((i14 & 64) != 0) {
            dVar = uVar.f156182g;
        }
        l01.d dVar2 = dVar;
        List list2 = (i14 & 128) != 0 ? uVar.f156183h : list;
        uVar.getClass();
        map2.getClass();
        list2.getClass();
        return new u(z16, z17, z18, str3, str4, map2, dVar2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f156176a == uVar.f156176a && this.f156177b == uVar.f156177b && this.f156178c == uVar.f156178c && p005kotlin.jvm.internal.s.g(this.f156179d, uVar.f156179d) && p005kotlin.jvm.internal.s.g(this.f156180e, uVar.f156180e) && p005kotlin.jvm.internal.s.g(this.f156181f, uVar.f156181f) && p005kotlin.jvm.internal.s.g(this.f156182g, uVar.f156182g) && p005kotlin.jvm.internal.s.g(this.f156183h, uVar.f156183h);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(Boolean.hashCode(this.f156176a) * 31, 31, this.f156177b), 31, this.f156178c);
        String str = this.f156179d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f156180e;
        int iB = am.j.b(this.f156181f, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        l01.d dVar = this.f156182g;
        return this.f156183h.hashCode() + ((iB + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("NutritionLocationUiModel(isLoading=", ", isError=", ", navigateBackWithData=", this.f156176a, this.f156177b);
        fb1.c.w(", selectedLanguageName=", this.f156179d, ", recommendedLanguageName=", sbM, this.f156178c);
        sbM.append(this.f156180e);
        sbM.append(", languageOptions=");
        sbM.append(this.f156181f);
        sbM.append(", selectedCountry=");
        sbM.append(this.f156182g);
        sbM.append(", countryOptions=");
        sbM.append(this.f156183h);
        sbM.append(")");
        return sbM.toString();
    }

    public u(boolean z14, boolean z15, boolean z16, String str, String str2, Map<String, String> map, l01.d dVar, List<l01.d> list) {
        map.getClass();
        list.getClass();
        this.f156176a = z14;
        this.f156177b = z15;
        this.f156178c = z16;
        this.f156179d = str;
        this.f156180e = str2;
        this.f156181f = map;
        this.f156182g = dVar;
        this.f156183h = list;
    }

    public u() {
        this(false, false, false, null, null, null, null, null, 255, null);
    }
}

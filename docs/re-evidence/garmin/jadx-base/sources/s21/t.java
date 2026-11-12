package s21;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ls21/t;", "", "", "selectedLanguage", "", "languageOptions", "Ll01/d;", "selectedCountry", "", "countryOptions", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ll01/d;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f156173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l01.d f156174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<l01.d> f156175d;

    public /* synthetic */ t(String str, Map map, l01.d dVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : map, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f156172a, tVar.f156172a) && p005kotlin.jvm.internal.s.g(this.f156173b, tVar.f156173b) && p005kotlin.jvm.internal.s.g(this.f156174c, tVar.f156174c) && p005kotlin.jvm.internal.s.g(this.f156175d, tVar.f156175d);
    }

    public final int hashCode() {
        String str = this.f156172a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.f156173b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        l01.d dVar = this.f156174c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<l01.d> list = this.f156175d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NutritionLocationInfo(selectedLanguage=" + this.f156172a + ", languageOptions=" + this.f156173b + ", selectedCountry=" + this.f156174c + ", countryOptions=" + this.f156175d + ")";
    }

    public t(String str, Map<String, String> map, l01.d dVar, List<l01.d> list) {
        this.f156172a = str;
        this.f156173b = map;
        this.f156174c = dVar;
        this.f156175d = list;
    }

    public t() {
        this(null, null, null, null, 15, null);
    }
}

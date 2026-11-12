package l11;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll11/h;", "", "", "regionCode", "foodId", "servingId", "barCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f108163d;

    public h(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f108160a = str;
        this.f108161b = str2;
        this.f108162c = str3;
        this.f108163d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f108160a, hVar.f108160a) && p005kotlin.jvm.internal.s.g(this.f108161b, hVar.f108161b) && p005kotlin.jvm.internal.s.g(this.f108162c, hVar.f108162c) && p005kotlin.jvm.internal.s.g(this.f108163d, hVar.f108163d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f108160a.hashCode() * 31, 31, this.f108161b);
        String str = this.f108162c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f108163d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e5.h(p6.b.i("FoodIssueMetadata(regionCode=", this.f108160a, ", foodId=", this.f108161b, ", servingId="), this.f108162c, ", barCode=", this.f108163d, ")");
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
    }
}

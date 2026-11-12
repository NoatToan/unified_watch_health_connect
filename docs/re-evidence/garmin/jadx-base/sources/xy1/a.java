package xy1;

import b71.i;
import ny1.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxy1/a;", "", "Lny1/g;", "participationType", "", "searchQuery", "", "lat", "lon", "Lmy1/d;", "filterDTO", "<init>", "(Lny1/g;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lmy1/d;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f192694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f192696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f192697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final my1.d f192698e;

    public /* synthetic */ a(g gVar, String str, Double d14, Double d15, my1.d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? g.IN_PERSON : gVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15, dVar);
    }

    public static a a(a aVar, g gVar, String str, Double d14, Double d15, my1.d dVar, int i14) {
        if ((i14 & 1) != 0) {
            gVar = aVar.f192694a;
        }
        g gVar2 = gVar;
        if ((i14 & 2) != 0) {
            str = aVar.f192695b;
        }
        String str2 = str;
        if ((i14 & 4) != 0) {
            d14 = aVar.f192696c;
        }
        Double d16 = d14;
        if ((i14 & 8) != 0) {
            d15 = aVar.f192697d;
        }
        Double d17 = d15;
        if ((i14 & 16) != 0) {
            dVar = aVar.f192698e;
        }
        my1.d dVar2 = dVar;
        gVar2.getClass();
        dVar2.getClass();
        return new a(gVar2, str2, d16, d17, dVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f192694a == aVar.f192694a && s.g(this.f192695b, aVar.f192695b) && s.g(this.f192696c, aVar.f192696c) && s.g(this.f192697d, aVar.f192697d) && s.g(this.f192698e, aVar.f192698e);
    }

    public final int hashCode() {
        int iHashCode = this.f192694a.hashCode() * 31;
        String str = this.f192695b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.f192696c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f192697d;
        return this.f192698e.hashCode() + ((iHashCode3 + (d15 != null ? d15.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EventSearchDataModel(participationType=");
        sb3.append(this.f192694a);
        sb3.append(", searchQuery=");
        sb3.append(this.f192695b);
        sb3.append(", lat=");
        i.p(this.f192696c, this.f192697d, ", lon=", ", filterDTO=", sb3);
        sb3.append(this.f192698e);
        sb3.append(")");
        return sb3.toString();
    }

    public a(g gVar, String str, Double d14, Double d15, my1.d dVar) {
        gVar.getClass();
        dVar.getClass();
        this.f192694a = gVar;
        this.f192695b = str;
        this.f192696c = d14;
        this.f192697d = d15;
        this.f192698e = dVar;
    }
}

package xy1;

import fg0.o;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import q6.f;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxy1/b;", "", "", "fromDate", "toDate", "", "Lfg0/o;", "events", "", "isVirtual", "shouldShowLocationOmitted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<o> f192701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f192702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f192703e;

    public b(String str, String str2, List<o> list, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f192699a = str;
        this.f192700b = str2;
        this.f192701c = list;
        this.f192702d = z14;
        this.f192703e = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f192699a.equals(bVar.f192699a) && this.f192700b.equals(bVar.f192700b) && this.f192701c.equals(bVar.f192701c) && this.f192702d == bVar.f192702d && this.f192703e == bVar.f192703e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192703e) + f.g(u0.b(g.j(this.f192699a.hashCode() * 31, 31, this.f192700b), 31, this.f192701c), 31, this.f192702d);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("EventSearchUIModel(fromDate=", this.f192699a, ", toDate=", this.f192700b, ", events=");
        sbI.append(this.f192701c);
        sbI.append(", isVirtual=");
        sbI.append(this.f192702d);
        sbI.append(", shouldShowLocationOmitted=");
        return hb.a.k(sbI, this.f192703e, ")");
    }
}

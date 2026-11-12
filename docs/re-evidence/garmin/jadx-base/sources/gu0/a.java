package gu0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgu0/a;", "", "", TtmlNode.ATTR_ID, "", "firstName", "lastName", "", "Ll20/c;", "phones", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<l20.c> f79035d;

    public a(int i14, String str, String str2, List<l20.c> list) {
        this.f79032a = i14;
        this.f79033b = str;
        this.f79034c = str2;
        this.f79035d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f79032a == aVar.f79032a && s.g(this.f79033b, aVar.f79033b) && s.g(this.f79034c, aVar.f79034c) && s.g(this.f79035d, aVar.f79035d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f79032a) * 31;
        String str = this.f79033b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f79034c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<l20.c> list = this.f79035d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = g.r(this.f79032a, "LiveEventContactRecord(id=", ", firstName=", this.f79033b, ", lastName=");
        sbR.append(this.f79034c);
        sbR.append(", phones=");
        sbR.append(this.f79035d);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ a(int i14, String str, String str2, List list, int i15, j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, str, str2, list);
    }
}

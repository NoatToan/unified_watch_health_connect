package rl1;

import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrl1/b;", "", "", "valueTextLine1", "", "legendColor", "valueTextLine2", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f153404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153405c;

    public /* synthetic */ b(String str, Integer num, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f153403a, bVar.f153403a) && s.g(this.f153404b, bVar.f153404b) && s.g(this.f153405c, bVar.f153405c);
    }

    public final int hashCode() {
        int iHashCode = this.f153403a.hashCode() * 31;
        Integer num = this.f153404b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f153405c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.f153405c, ")", u0.n("ChartHighlightDataField(valueTextLine1=", this.f153404b, this.f153403a, ", legendColor=", ", valueTextLine2="));
    }

    public b(String str, Integer num, String str2) {
        str.getClass();
        this.f153403a = str;
        this.f153404b = num;
        this.f153405c = str2;
    }
}

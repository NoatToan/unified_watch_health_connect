package fb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfb1/t;", "", "", "valueTextLine1", "valueTextLine1Uom", "", "legendColor", "valueTextLine2", "heading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f70301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f70302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70303e;

    public /* synthetic */ t(String str, String str2, Integer num, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f70299a, tVar.f70299a) && p005kotlin.jvm.internal.s.g(this.f70300b, tVar.f70300b) && p005kotlin.jvm.internal.s.g(this.f70301c, tVar.f70301c) && p005kotlin.jvm.internal.s.g(this.f70302d, tVar.f70302d) && p005kotlin.jvm.internal.s.g(this.f70303e, tVar.f70303e);
    }

    public final int hashCode() {
        String str = this.f70299a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f70300b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f70301c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f70302d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f70303e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ChartHighlightDataField(valueTextLine1=", this.f70299a, ", valueTextLine1Uom=", this.f70300b, ", legendColor=");
        p6.b.l(this.f70301c, ", valueTextLine2=", this.f70302d, ", heading=", sbI);
        return am.j.o(this.f70303e, ")", sbI);
    }

    public t(String str, String str2, Integer num, String str3, String str4) {
        this.f70299a = str;
        this.f70300b = str2;
        this.f70301c = num;
        this.f70302d = str3;
        this.f70303e = str4;
    }

    public t() {
        this(null, null, null, null, null, 31, null);
    }
}

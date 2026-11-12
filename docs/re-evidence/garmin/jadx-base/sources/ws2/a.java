package ws2;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lws2/a;", "", "", "dataType", "subType", "", "garminDeviceXmlType", "<init>", "(IILjava/lang/String;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f186955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f186956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f186957c;

    public a(int i14, int i15, String str) {
        str.getClass();
        this.f186955a = i14;
        this.f186956b = i15;
        this.f186957c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f186955a == aVar.f186955a && this.f186956b == aVar.f186956b && this.f186957c.equals(aVar.f186957c);
    }

    public final int hashCode() {
        return this.f186957c.hashCode() + q2.d(this.f186956b, Integer.hashCode(this.f186955a) * 31, 31);
    }

    public final String toString() {
        return am.j.o(this.f186957c, ")", e5.j(this.f186955a, this.f186956b, "DeviceFileType(dataType=", ", subType=", ", garminDeviceXmlType="));
    }
}

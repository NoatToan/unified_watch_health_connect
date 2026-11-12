package la2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lla2/c;", "", "", "macAddress", "Lla2/i;", "failureCode", "<init>", "(Ljava/lang/String;Lla2/i;)V", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f111634b;

    public c(String str, i iVar) {
        str.getClass();
        iVar.getClass();
        this.f111633a = str;
        this.f111634b = iVar;
    }

    public final boolean a() {
        int i14 = e.d.f111665a[this.f111634b.ordinal()];
        return i14 == 3 || i14 == 4 || i14 == 5;
    }

    public final boolean b() {
        int i14 = e.d.f111665a[this.f111634b.ordinal()];
        return i14 == 1 || i14 == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f111633a.equals(cVar.f111633a) && this.f111634b == cVar.f111634b;
    }

    public final int hashCode() {
        return this.f111634b.hashCode() + (this.f111633a.hashCode() * 31);
    }

    public final String toString() {
        return "ConnectionFailureEvent[macAddress:" + this.f111633a + ", failureCode:" + this.f111634b + "]";
    }
}

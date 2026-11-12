package gs1;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgs1/h;", "", "", "date", "", "value", "<init>", "(Ljava/lang/String;D)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f78765b;

    public h(String str, double d14) {
        str.getClass();
        this.f78764a = str;
        this.f78765b = d14;
    }

    public final DateTime a() {
        DateTime dateTime = DateTime.parse(this.f78764a);
        dateTime.getClass();
        return dateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f78764a.equals(hVar.f78764a) && Double.compare(this.f78765b, hVar.f78765b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f78765b) + (this.f78764a.hashCode() * 31);
    }

    public final String toString() {
        return "CalendarValue(date=" + this.f78764a + ", value=" + this.f78765b + ")";
    }
}

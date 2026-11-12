package xx;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxx/a;", "", "", "title", "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192465b;

    public a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f192464a = str;
        this.f192465b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f192464a.equals(aVar.f192464a) && this.f192465b.equals(aVar.f192465b);
    }

    public final int hashCode() {
        return this.f192465b.hashCode() + (this.f192464a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("CalendarDayOfWeek(title=", this.f192464a, ", contentDescription=", this.f192465b, ")");
    }
}

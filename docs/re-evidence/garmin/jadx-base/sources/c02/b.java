package c02;

import com.google.firebase.messaging.Constants;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc02/b;", "", "", "value", Constants.ScionAnalytics.PARAM_LABEL, "unit", "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22355d;

    public b(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f22352a = str;
        this.f22353b = str2;
        this.f22354c = str3;
        this.f22355d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f22352a, bVar.f22352a) && s.g(this.f22353b, bVar.f22353b) && s.g(this.f22354c, bVar.f22354c) && s.g(this.f22355d, bVar.f22355d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f22352a.hashCode() * 31, 31, this.f22353b);
        String str = this.f22354c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22355d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e5.h(p6.b.i("CircleData(value=", this.f22352a, ", label=", this.f22353b, ", unit="), this.f22354c, ", contentDescription=", this.f22355d, ")");
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
    }
}

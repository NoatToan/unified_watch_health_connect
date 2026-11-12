package qp;

import com.google.firebase.messaging.Constants;
import i3.e5;
import kg.f;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqp/b;", "", "", "formattedValue", "formattedValueContentDescription", Constants.ScionAnalytics.PARAM_LABEL, "labelContentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f145998d;

    public b(String str, String str2, String str3, String str4) {
        f.p(str, str2, str3, str4);
        this.f145995a = str;
        this.f145996b = str2;
        this.f145997c = str3;
        this.f145998d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f145995a.equals(bVar.f145995a) && this.f145996b.equals(bVar.f145996b) && this.f145997c.equals(bVar.f145997c) && this.f145998d.equals(bVar.f145998d);
    }

    public final int hashCode() {
        return this.f145998d.hashCode() + g.j(g.j(this.f145995a.hashCode() * 31, 31, this.f145996b), 31, this.f145997c);
    }

    public final String toString() {
        return e5.h(p6.b.i("ReportMetricData(formattedValue=", this.f145995a, ", formattedValueContentDescription=", this.f145996b, ", label="), this.f145997c, ", labelContentDescription=", this.f145998d, ")");
    }
}

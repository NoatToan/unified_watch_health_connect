package qp;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqp/a;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "labelSecondary", "labelSecondaryContentDescription", "data", "dataContentDescription", "metaData", "metaDataContentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f145991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f145992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f145993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f145994g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i14, j jVar) {
        String str8;
        String str9;
        str2 = (i14 & 2) != 0 ? null : str2;
        str3 = (i14 & 4) != 0 ? null : str3;
        str6 = (i14 & 32) != 0 ? null : str6;
        if ((i14 & 64) != 0) {
            str9 = str6;
            str8 = str9;
        } else {
            str8 = str7;
            str9 = str6;
        }
        this(str, str2, str3, str4, str5, str9, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f145988a, aVar.f145988a) && s.g(this.f145989b, aVar.f145989b) && s.g(this.f145990c, aVar.f145990c) && s.g(this.f145991d, aVar.f145991d) && s.g(this.f145992e, aVar.f145992e) && s.g(this.f145993f, aVar.f145993f) && s.g(this.f145994g, aVar.f145994g);
    }

    public final int hashCode() {
        int iHashCode = this.f145988a.hashCode() * 31;
        String str = this.f145989b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145990c;
        int iJ = g.j(g.j((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f145991d), 31, this.f145992e);
        String str3 = this.f145993f;
        int iHashCode3 = (iJ + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f145994g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ActivitiesCardData(label=", this.f145988a, ", labelSecondary=", this.f145989b, ", labelSecondaryContentDescription=");
        sn.a.t(sbI, this.f145990c, ", data=", this.f145991d, ", dataContentDescription=");
        sn.a.t(sbI, this.f145992e, ", metaData=", this.f145993f, ", metaDataContentDescription=");
        return am.j.o(this.f145994g, ")", sbI);
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str4, str5);
        this.f145988a = str;
        this.f145989b = str2;
        this.f145990c = str3;
        this.f145991d = str4;
        this.f145992e = str5;
        this.f145993f = str6;
        this.f145994g = str7;
    }
}

package fy1;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfy1/f;", "", "", "formattedTimeOrDistance", "formattedTimeOrDistanceDescription", "timeOrDistanceUom", "formattedPaceOrSpeed", "formattedPaceOrSpeedDescription", "paceOrSpeedUom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f73919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f73920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f73921f;

    public /* synthetic */ f(String str, String str2, String str3, String str4, String str5, String str6, int i14, j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, str4, str5, (i14 & 32) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f73916a, fVar.f73916a) && s.g(this.f73917b, fVar.f73917b) && s.g(this.f73918c, fVar.f73918c) && s.g(this.f73919d, fVar.f73919d) && s.g(this.f73920e, fVar.f73920e) && s.g(this.f73921f, fVar.f73921f);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f73916a.hashCode() * 31, 31, this.f73917b);
        String str = this.f73918c;
        int iJ2 = wr.g.j(wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f73919d), 31, this.f73920e);
        String str2 = this.f73921f;
        return iJ2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FormattedTimePaceData(formattedTimeOrDistance=", this.f73916a, ", formattedTimeOrDistanceDescription=", this.f73917b, ", timeOrDistanceUom=");
        sn.a.t(sbI, this.f73918c, ", formattedPaceOrSpeed=", this.f73919d, ", formattedPaceOrSpeedDescription=");
        return e5.h(sbI, this.f73920e, ", paceOrSpeedUom=", this.f73921f, ")");
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6) {
        kg.f.p(str, str2, str4, str5);
        this.f73916a = str;
        this.f73917b = str2;
        this.f73918c = str3;
        this.f73919d = str4;
        this.f73920e = str5;
        this.f73921f = str6;
    }
}

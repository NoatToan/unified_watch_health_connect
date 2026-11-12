package pt1;

import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpt1/q;", "", "", "name", "Lus1/h;", "difficulty", "Lus1/m;", NotificationConstants.KEY_DATA_MIME_TYPE, FirebaseAnalytics.Param.LOCATION, "details", "detailsContentDescription", "", "underReview", "closed", "<init>", "(Ljava/lang/String;Lus1/h;Lus1/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final us1.h f140954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final us1.m f140955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f140956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f140957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f140958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f140959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f140960h;

    public /* synthetic */ q(String str, us1.h hVar, us1.m mVar, String str2, String str3, String str4, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : hVar, (i14 & 4) != 0 ? null : mVar, str2, str3, str4, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f140953a, qVar.f140953a) && this.f140954b == qVar.f140954b && this.f140955c == qVar.f140955c && p005kotlin.jvm.internal.s.g(this.f140956d, qVar.f140956d) && p005kotlin.jvm.internal.s.g(this.f140957e, qVar.f140957e) && p005kotlin.jvm.internal.s.g(this.f140958f, qVar.f140958f) && this.f140959g == qVar.f140959g && this.f140960h == qVar.f140960h;
    }

    public final int hashCode() {
        int iHashCode = this.f140953a.hashCode() * 31;
        us1.h hVar = this.f140954b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        us1.m mVar = this.f140955c;
        return Boolean.hashCode(this.f140960h) + q6.f.g(wr.g.j(wr.g.j(wr.g.j((iHashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31, 31, this.f140956d), 31, this.f140957e), 31, this.f140958f), 31, this.f140959g);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrailHeaderState(name=");
        sb3.append(this.f140953a);
        sb3.append(", difficulty=");
        sb3.append(this.f140954b);
        sb3.append(", type=");
        sb3.append(this.f140955c);
        sb3.append(", location=");
        sb3.append(this.f140956d);
        sb3.append(", details=");
        sn.a.t(sb3, this.f140957e, ", detailsContentDescription=", this.f140958f, ", underReview=");
        return com.airbnb.lottie.animation.keyframe.a.f(", closed=", ")", sb3, this.f140959g, this.f140960h);
    }

    public q(String str, us1.h hVar, us1.m mVar, String str2, String str3, String str4, boolean z14, boolean z15) {
        kg.f.p(str, str2, str3, str4);
        this.f140953a = str;
        this.f140954b = hVar;
        this.f140955c = mVar;
        this.f140956d = str2;
        this.f140957e = str3;
        this.f140958f = str4;
        this.f140959g = z14;
        this.f140960h = z15;
    }
}

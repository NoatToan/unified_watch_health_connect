package oz1;

import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import ds.e0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Loz1/a;", "", "Loz1/c;", NotificationConstants.KEY_DATA_MIME_TYPE, "", FirebaseAnalytics.Param.SCORE, "", "feedback", "feedbackContentDescription", "", "showHelpIcon", "<init>", "(Loz1/c;Ljava/lang/String;IIZ)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f134490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f134492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f134493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f134494e;

    public a(c cVar, String str, int i14, int i15, boolean z14) {
        cVar.getClass();
        str.getClass();
        this.f134490a = cVar;
        this.f134491b = str;
        this.f134492c = i14;
        this.f134493d = i15;
        this.f134494e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f134490a == aVar.f134490a && p005kotlin.jvm.internal.s.g(this.f134491b, aVar.f134491b) && this.f134492c == aVar.f134492c && this.f134493d == aVar.f134493d && this.f134494e == aVar.f134494e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f134494e) + q2.d(this.f134493d, q2.d(this.f134492c, wr.g.j(this.f134490a.hashCode() * 31, 31, this.f134491b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Factors(type=");
        sb3.append(this.f134490a);
        sb3.append(", score=");
        sb3.append(this.f134491b);
        sb3.append(", feedback=");
        e0.m(this.f134492c, this.f134493d, ", feedbackContentDescription=", ", showHelpIcon=", sb3);
        return hb.a.k(sb3, this.f134494e, ")");
    }

    public /* synthetic */ a(c cVar, String str, int i14, int i15, boolean z14, int i16, p005kotlin.jvm.internal.j jVar) {
        this(cVar, str, i14, i15, (i16 & 16) != 0 ? false : z14);
    }
}

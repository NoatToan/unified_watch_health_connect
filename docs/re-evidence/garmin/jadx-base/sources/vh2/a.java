package vh2;

import am.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvh2/a;", "", "", "title", "section", FirebaseAnalytics.Param.LOCATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f178410c;

    public a(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f178408a = str;
        this.f178409b = str2;
        this.f178410c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f178408a.equals(aVar.f178408a) && this.f178409b.equals(aVar.f178409b) && this.f178410c.equals(aVar.f178410c);
    }

    public final int hashCode() {
        return this.f178410c.hashCode() + g.j(this.f178408a.hashCode() * 31, 31, this.f178409b);
    }

    public final String toString() {
        return j.o(this.f178410c, ")", p6.b.i("SearchDataObject(title=", this.f178408a, ", section=", this.f178409b, ", location="));
    }
}

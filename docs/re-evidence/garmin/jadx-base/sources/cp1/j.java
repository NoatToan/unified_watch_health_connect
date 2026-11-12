package cp1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcp1/j;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "meta", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54914c;

    public j(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f54912a = str;
        this.f54913b = str2;
        this.f54914c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f54912a.equals(jVar.f54912a) && this.f54913b.equals(jVar.f54913b) && this.f54914c.equals(jVar.f54914c);
    }

    public final int hashCode() {
        return this.f54914c.hashCode() + wr.g.j(this.f54912a.hashCode() * 31, 31, this.f54913b);
    }

    public final String toString() {
        return am.j.o(this.f54914c, ")", p6.b.i("PromotionAward(label=", this.f54912a, ", meta=", this.f54913b, ", imageUrl="));
    }
}

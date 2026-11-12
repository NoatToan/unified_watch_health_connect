package dl0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldl0/a;", "", "", TtmlNode.ATTR_ID, "", "name", "date", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f60266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60268c;

    public a(long j8, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f60266a = j8;
        this.f60267b = str;
        this.f60268c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f60266a == aVar.f60266a && this.f60267b.equals(aVar.f60267b) && this.f60268c.equals(aVar.f60268c);
    }

    public final int hashCode() {
        return this.f60268c.hashCode() + wr.g.j(Long.hashCode(this.f60266a) * 31, 31, this.f60267b);
    }

    public final String toString() {
        return e0.h(com.airbnb.lottie.animation.keyframe.a.k(this.f60266a, "BadgeScorecard(id=", ", name=", this.f60267b), ", date=", this.f60268c, ")");
    }
}

package pe0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lpe0/a;", "", "", TtmlNode.ATTR_ID, "", "name", "profileImageUrl", "", "activityCount", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f137398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f137401d;

    static {
        new C2603a(null);
    }

    public a(long j8, String str, String str2, Integer num) {
        str.getClass();
        this.f137398a = j8;
        this.f137399b = str;
        this.f137400c = str2;
        this.f137401d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f137398a == aVar.f137398a && this.f137399b.equals(aVar.f137399b) && s.g(this.f137400c, aVar.f137400c) && s.g(this.f137401d, aVar.f137401d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f137398a) * 31, 31, this.f137399b);
        String str = this.f137400c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f137401d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f137398a, "ActivityDetailsDogUiModel(id=", ", name=", this.f137399b);
        sbK.append(", profileImageUrl=");
        sbK.append(this.f137400c);
        sbK.append(", activityCount=");
        sbK.append(this.f137401d);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX INFO: renamed from: pe0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpe0/a$a;", "", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2603a {
        public /* synthetic */ C2603a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2603a() {
        }
    }
}

package pe0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lpe0/b;", "", "", TtmlNode.ATTR_ID, "", "name", "Lje0/j;", "status", "", "excludePhysio", "<init>", "(JLjava/lang/String;Lje0/j;Z)V", "a", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f137402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je0.j f137404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f137405d;

    static {
        new a(null);
    }

    public b(long j8, String str, je0.j jVar, boolean z14) {
        str.getClass();
        jVar.getClass();
        this.f137402a = j8;
        this.f137403b = str;
        this.f137404c = jVar;
        this.f137405d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f137402a == bVar.f137402a && this.f137403b.equals(bVar.f137403b) && this.f137404c == bVar.f137404c && this.f137405d == bVar.f137405d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137405d) + ((this.f137404c.hashCode() + wr.g.j(Long.hashCode(this.f137402a) * 31, 31, this.f137403b)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f137402a, "ActivityDogUiModel(id=", ", name=", this.f137403b);
        sbK.append(", status=");
        sbK.append(this.f137404c);
        sbK.append(", excludePhysio=");
        sbK.append(this.f137405d);
        sbK.append(")");
        return sbK.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpe0/b$a;", "", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

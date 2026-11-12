package dk0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldk0/f;", "", "", "disclaimer", "learnMore", "learnMoreUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60180c;

    public f(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f60178a = str;
        this.f60179b = str2;
        this.f60180c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f60178a.equals(fVar.f60178a) && this.f60179b.equals(fVar.f60179b) && this.f60180c.equals(fVar.f60180c);
    }

    public final int hashCode() {
        return this.f60180c.hashCode() + wr.g.j(this.f60178a.hashCode() * 31, 31, this.f60179b);
    }

    public final String toString() {
        return am.j.o(this.f60180c, ")", p6.b.i("GCPlusDisclaimer(disclaimer=", this.f60178a, ", learnMore=", this.f60179b, ", learnMoreUrl="));
    }
}

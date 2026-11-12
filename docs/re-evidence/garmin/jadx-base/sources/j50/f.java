package j50;

import am.j;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj50/f;", "", "", "title", "description", "skipText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97056c;

    public f(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f97054a = str;
        this.f97055b = str2;
        this.f97056c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f97054a.equals(fVar.f97054a) && this.f97055b.equals(fVar.f97055b) && this.f97056c.equals(fVar.f97056c);
    }

    public final int hashCode() {
        return this.f97056c.hashCode() + g.j(this.f97054a.hashCode() * 31, 31, this.f97055b);
    }

    public final String toString() {
        return j.o(this.f97056c, ")", p6.b.i("SportLabels(title=", this.f97054a, ", description=", this.f97055b, ", skipText="));
    }
}

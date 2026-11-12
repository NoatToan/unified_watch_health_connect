package i80;

import am.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li80/f;", "", "", "isPublicDirectory", "", "name", "absolutePath", "readableSize", "readableLastModified", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f92237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f92240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f92241e;

    public f(boolean z14, String str, String str2, String str3, String str4) {
        kg.f.p(str, str2, str3, str4);
        this.f92237a = z14;
        this.f92238b = str;
        this.f92239c = str2;
        this.f92240d = str3;
        this.f92241e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f92237a == fVar.f92237a && this.f92238b.equals(fVar.f92238b) && this.f92239c.equals(fVar.f92239c) && this.f92240d.equals(fVar.f92240d) && this.f92241e.equals(fVar.f92241e);
    }

    public final int hashCode() {
        return this.f92241e.hashCode() + wr.g.j(wr.g.j(wr.g.j(Boolean.hashCode(this.f92237a) * 31, 31, this.f92238b), 31, this.f92239c), 31, this.f92240d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogFileItem(isPublicDirectory=");
        sb3.append(this.f92237a);
        sb3.append(", name=");
        sb3.append(this.f92238b);
        sb3.append(", absolutePath=");
        sn.a.t(sb3, this.f92239c, ", readableSize=", this.f92240d, ", readableLastModified=");
        return j.o(this.f92241e, ")", sb3);
    }
}

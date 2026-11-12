package ad0;

import c22.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lad0/j;", "", "", "title", "", "groupIndex", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2745b;

    public j(String str, int i14) {
        this.f2744a = str;
        this.f2745b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f2744a, jVar.f2744a) && this.f2745b == jVar.f2745b;
    }

    public final int hashCode() {
        String str = this.f2744a;
        return Integer.hashCode(this.f2745b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return t.e(this.f2745b, "TutorialItem(title=", this.f2744a, ", groupIndex=", ")");
    }
}

package j82;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj82/f;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "Lj82/g;", "legendSymbol", "contentDescription", "<init>", "(Ljava/lang/String;Lj82/g;Ljava/lang/String;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f97718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97719c;

    public /* synthetic */ f(String str, g gVar, String str2, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? new g.i(0L, 1, null) : gVar, (i14 & 4) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f97717a, fVar.f97717a) && s.g(this.f97718b, fVar.f97718b) && s.g(this.f97719c, fVar.f97719c);
    }

    public final int hashCode() {
        int iHashCode = (this.f97718b.hashCode() + (this.f97717a.hashCode() * 31)) * 31;
        String str = this.f97719c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LegendItem(label=");
        sb3.append(this.f97717a);
        sb3.append(", legendSymbol=");
        sb3.append(this.f97718b);
        sb3.append(", contentDescription=");
        return am.j.o(this.f97719c, ")", sb3);
    }

    public f(String str, g gVar, String str2) {
        str.getClass();
        gVar.getClass();
        this.f97717a = str;
        this.f97718b = gVar;
        this.f97719c = str2;
    }
}

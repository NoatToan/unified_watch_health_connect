package d82;

import com.google.firebase.messaging.Constants;
import j82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ld82/a;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "value", "Lj82/g;", "legendSymbol", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj82/g;Ljava/lang/String;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f58377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f58378d;

    public /* synthetic */ a(String str, String str2, g gVar, String str3, int i14, j jVar) {
        this(str, str2, (i14 & 4) != 0 ? new g.i(0L, 1, null) : gVar, (i14 & 8) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f58375a, aVar.f58375a) && s.g(this.f58376b, aVar.f58376b) && s.g(this.f58377c, aVar.f58377c) && s.g(this.f58378d, aVar.f58378d);
    }

    public final int hashCode() {
        int iHashCode = (this.f58377c.hashCode() + wr.g.j(this.f58375a.hashCode() * 31, 31, this.f58376b)) * 31;
        String str = this.f58378d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("HoverData(label=", this.f58375a, ", value=", this.f58376b, ", legendSymbol=");
        sbI.append(this.f58377c);
        sbI.append(", unit=");
        sbI.append(this.f58378d);
        sbI.append(")");
        return sbI.toString();
    }

    public a(String str, String str2, g gVar, String str3) {
        str.getClass();
        str2.getClass();
        gVar.getClass();
        this.f58375a = str;
        this.f58376b = str2;
        this.f58377c = gVar;
        this.f58378d = str3;
    }
}

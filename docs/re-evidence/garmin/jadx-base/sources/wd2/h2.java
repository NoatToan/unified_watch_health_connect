package wd2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwd2/h2;", "", "", TtmlNode.ATTR_ID, "token", "url", "Lwd2/c2;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwd2/c2;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f184494d;

    public /* synthetic */ h2(String str, String str2, String str3, c2 c2Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : c2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return p005kotlin.jvm.internal.s.g(this.f184491a, h2Var.f184491a) && p005kotlin.jvm.internal.s.g(this.f184492b, h2Var.f184492b) && p005kotlin.jvm.internal.s.g(this.f184493c, h2Var.f184493c) && p005kotlin.jvm.internal.s.g(this.f184494d, h2Var.f184494d);
    }

    public final int hashCode() {
        String str = this.f184491a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f184492b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f184493c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c2 c2Var = this.f184494d;
        return iHashCode3 + (c2Var != null ? c2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SubSession(id=", this.f184491a, ", token=", this.f184492b, ", url=");
        sbI.append(this.f184493c);
        sbI.append(", type=");
        sbI.append(this.f184494d);
        sbI.append(")");
        return sbI.toString();
    }

    public h2(String str, String str2, String str3, c2 c2Var) {
        this.f184491a = str;
        this.f184492b = str2;
        this.f184493c = str3;
        this.f184494d = c2Var;
    }

    public h2() {
        this(null, null, null, null, 15, null);
    }
}

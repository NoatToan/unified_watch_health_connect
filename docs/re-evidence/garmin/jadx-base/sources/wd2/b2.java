package wd2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwd2/b2;", "", "", TtmlNode.ATTR_ID, "token", "Lwd2/c2;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lwd2/c2;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f184402c;

    public b2(String str, String str2, c2 c2Var) {
        str.getClass();
        str2.getClass();
        this.f184400a = str;
        this.f184401b = str2;
        this.f184402c = c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f184400a.equals(b2Var.f184400a) && this.f184401b.equals(b2Var.f184401b) && p005kotlin.jvm.internal.s.g(this.f184402c, b2Var.f184402c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f184400a.hashCode() * 31, 31, this.f184401b);
        c2 c2Var = this.f184402c;
        return iJ + (c2Var == null ? 0 : c2Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SessionInfo(id=", this.f184400a, ", token=", this.f184401b, ", type=");
        sbI.append(this.f184402c);
        sbI.append(")");
        return sbI.toString();
    }
}

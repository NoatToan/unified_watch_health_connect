package wd2;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwd2/d2;", "", "Lwd2/e2;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "value", "<init>", "(Lwd2/e2;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f184431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184432b;

    public d2(e2 e2Var, String str) {
        e2Var.getClass();
        this.f184431a = e2Var;
        this.f184432b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return p005kotlin.jvm.internal.s.g(this.f184431a, d2Var.f184431a) && p005kotlin.jvm.internal.s.g(this.f184432b, d2Var.f184432b);
    }

    public final int hashCode() {
        int iHashCode = this.f184431a.hashCode() * 31;
        String str = this.f184432b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SharingError(type=" + this.f184431a + ", value=" + this.f184432b + ")";
    }

    public /* synthetic */ d2(e2 e2Var, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(e2Var, (i14 & 2) != 0 ? null : str);
    }
}

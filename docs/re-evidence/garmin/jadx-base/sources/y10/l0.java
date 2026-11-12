package y10;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly10/l0;", "", "Ly10/g0;", "status", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ly10/g0;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f193939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193940b;

    public l0(g0 g0Var, String str) {
        g0Var.getClass();
        this.f193939a = g0Var;
        this.f193940b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f193939a == l0Var.f193939a && p005kotlin.jvm.internal.s.g(this.f193940b, l0Var.f193940b);
    }

    public final int hashCode() {
        int iHashCode = this.f193939a.hashCode() * 31;
        String str = this.f193940b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ConnectIqDetailsUIResource(status=" + this.f193939a + ", error=" + this.f193940b + ")";
    }

    public /* synthetic */ l0(g0 g0Var, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(g0Var, (i14 & 2) != 0 ? null : str);
    }
}

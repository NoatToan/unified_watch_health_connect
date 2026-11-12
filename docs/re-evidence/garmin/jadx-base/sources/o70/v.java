package o70;

import c80.o0;
import com.roomorama.caldroid.CaldroidFragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo70/v;", "", "", "message", CaldroidFragment.DIALOG_TITLE, "dialogMessage", "Lc80/o0;", "promoData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc80/o0;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f130106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f130107d;

    public /* synthetic */ v(String str, String str2, String str3, o0 o0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : o0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f130104a, vVar.f130104a) && p005kotlin.jvm.internal.s.g(this.f130105b, vVar.f130105b) && p005kotlin.jvm.internal.s.g(this.f130106c, vVar.f130106c) && p005kotlin.jvm.internal.s.g(this.f130107d, vVar.f130107d);
    }

    public final int hashCode() {
        String str = this.f130104a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f130105b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f130106c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        o0 o0Var = this.f130107d;
        return iHashCode3 + (o0Var != null ? o0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ServerMaintenanceCardState(message=", this.f130104a, ", dialogTitle=", this.f130105b, ", dialogMessage=");
        sbI.append(this.f130106c);
        sbI.append(", promoData=");
        sbI.append(this.f130107d);
        sbI.append(")");
        return sbI.toString();
    }

    public v(String str, String str2, String str3, o0 o0Var) {
        this.f130104a = str;
        this.f130105b = str2;
        this.f130106c = str3;
        this.f130107d = o0Var;
    }

    public v() {
        this(null, null, null, null, 15, null);
    }
}

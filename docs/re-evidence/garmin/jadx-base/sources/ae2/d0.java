package ae2;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lae2/d0;", "", "Lae2/p;", "activeSessionPrivacy", "profilePrivacy", "<init>", "(Lae2/p;Lae2/p;)V", "a", "Lae2/p;", "getActiveSessionPrivacy", "()Lae2/p;", "b", "getProfilePrivacy", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeSessionPrivacy")
    private final p activeSessionPrivacy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profilePrivacy")
    private final p profilePrivacy;

    public /* synthetic */ d0(p pVar, p pVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : pVar, (i14 & 2) != 0 ? null : pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.activeSessionPrivacy == d0Var.activeSessionPrivacy && this.profilePrivacy == d0Var.profilePrivacy;
    }

    public final int hashCode() {
        p pVar = this.activeSessionPrivacy;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        p pVar2 = this.profilePrivacy;
        return iHashCode + (pVar2 != null ? pVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileSettingsDto(activeSessionPrivacy=" + this.activeSessionPrivacy + ", profilePrivacy=" + this.profilePrivacy + ")";
    }

    public d0(p pVar, p pVar2) {
        this.activeSessionPrivacy = pVar;
        this.profilePrivacy = pVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

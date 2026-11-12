package ae2;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lae2/l0;", "", "Lae2/h0;", "session", "", "shortened", "<init>", "(Lae2/h0;Ljava/lang/Boolean;)V", "a", "Lae2/h0;", "()Lae2/h0;", "b", "Ljava/lang/Boolean;", "getShortened", "()Ljava/lang/Boolean;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("session")
    private final h0 session;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortened")
    private final Boolean shortened;

    public /* synthetic */ l0(h0 h0Var, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : h0Var, (i14 & 2) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h0 getSession() {
        return this.session;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return p005kotlin.jvm.internal.s.g(this.session, l0Var.session) && p005kotlin.jvm.internal.s.g(this.shortened, l0Var.shortened);
    }

    public final int hashCode() {
        h0 h0Var = this.session;
        int iHashCode = (h0Var == null ? 0 : h0Var.hashCode()) * 31;
        Boolean bool = this.shortened;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "SessionResponseDTO(session=" + this.session + ", shortened=" + this.shortened + ")";
    }

    public l0(h0 h0Var, Boolean bool) {
        this.session = h0Var;
        this.shortened = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

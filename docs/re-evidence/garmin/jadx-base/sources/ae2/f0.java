package ae2;

import com.garmin.android.library.livetrack.data.typeadapters.SendMessageErrorTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lae2/f0;", "", "", "errorMessageText", "Lae2/g0;", "errorType", "", "sessionIds", "<init>", "(Ljava/lang/String;Lae2/g0;Ljava/util/List;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lae2/g0;", "()Lae2/g0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorMessageText")
    private final String errorMessageText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorType")
    @JsonAdapter(SendMessageErrorTypeAdapter.class)
    private final g0 errorType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sessionIds")
    private final List<String> sessionIds;

    public /* synthetic */ f0(String str, g0 g0Var, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : g0Var, (i14 & 4) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorMessageText() {
        return this.errorMessageText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g0 getErrorType() {
        return this.errorType;
    }

    public final List<String> c() {
        return this.sessionIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p005kotlin.jvm.internal.s.g(this.errorMessageText, f0Var.errorMessageText) && p005kotlin.jvm.internal.s.g(this.errorType, f0Var.errorType) && p005kotlin.jvm.internal.s.g(this.sessionIds, f0Var.sessionIds);
    }

    public final int hashCode() {
        String str = this.errorMessageText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        g0 g0Var = this.errorType;
        int iHashCode2 = (iHashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        List<String> list = this.sessionIds;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.errorMessageText;
        g0 g0Var = this.errorType;
        List<String> list = this.sessionIds;
        StringBuilder sb3 = new StringBuilder("SendMessageError(errorMessageText=");
        sb3.append(str);
        sb3.append(", errorType=");
        sb3.append(g0Var);
        sb3.append(", sessionIds=");
        return u62.z.c(sb3, list, ")");
    }

    public f0(String str, g0 g0Var, List<String> list) {
        this.errorMessageText = str;
        this.errorType = g0Var;
        this.sessionIds = list;
    }

    public f0() {
        this(null, null, null, 7, null);
    }
}

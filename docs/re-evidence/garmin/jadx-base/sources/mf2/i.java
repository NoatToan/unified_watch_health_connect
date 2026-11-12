package mf2;

import c22.t;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lmf2/i;", "", "", "actionType", "", "actionCount", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "()I", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("actionType")
    private final String actionType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("actionCount")
    private final int actionCount;

    public i(String str, int i14) {
        str.getClass();
        this.actionType = str;
        this.actionCount = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getActionCount() {
        return this.actionCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.actionType, iVar.actionType) && this.actionCount == iVar.actionCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.actionCount) + (this.actionType.hashCode() * 31);
    }

    public final String toString() {
        return t.e(this.actionCount, "LiveActivityUserActions(actionType=", this.actionType, ", actionCount=", ")");
    }
}

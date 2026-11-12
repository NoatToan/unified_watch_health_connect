package ag2;

import am.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lag2/d;", "", "", "Lag2/a;", "components", "", "primaryActionType", "primaryActionOnCompletionType", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("components")
    private final List<a> components;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryActionType")
    private final String primaryActionType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryActionOnCompletionType")
    private final String primaryActionOnCompletionType;

    public d(List<a> list, String str, String str2) {
        this.components = list;
        this.primaryActionType = str;
        this.primaryActionOnCompletionType = str2;
    }

    public static d a(d dVar, List list) {
        return new d(list, dVar.primaryActionType, dVar.primaryActionOnCompletionType);
    }

    public final List<a> b() {
        return this.components;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPrimaryActionOnCompletionType() {
        return this.primaryActionOnCompletionType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPrimaryActionType() {
        return this.primaryActionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.components, dVar.components) && s.g(this.primaryActionType, dVar.primaryActionType) && s.g(this.primaryActionOnCompletionType, dVar.primaryActionOnCompletionType);
    }

    public final int hashCode() {
        List<a> list = this.components;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.primaryActionType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.primaryActionOnCompletionType;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        List<a> list = this.components;
        String str = this.primaryActionType;
        String str2 = this.primaryActionOnCompletionType;
        StringBuilder sb3 = new StringBuilder("LSVDefinition(components=");
        sb3.append(list);
        sb3.append(", primaryActionType=");
        sb3.append(str);
        sb3.append(", primaryActionOnCompletionType=");
        return j.o(str2, ")", sb3);
    }
}

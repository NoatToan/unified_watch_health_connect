package da1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lda1/c;", "", "", "userRole", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "gcm-photo_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userRole")
    private final String userRole;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.ENTRIES)
    private final List<String> entries;

    public c(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.userRole = str;
        this.entries = list;
    }

    public final List<String> a() {
        return this.entries;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUserRole() {
        return this.userRole;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.userRole, cVar.userRole) && s.g(this.entries, cVar.entries);
    }

    public final int hashCode() {
        return this.entries.hashCode() + (this.userRole.hashCode() * 31);
    }

    public final String toString() {
        return fb1.c.o("ReportImageEntryDTO(userRole=", this.userRole, ", entries=", this.entries, ")");
    }
}

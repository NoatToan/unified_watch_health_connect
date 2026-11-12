package q10;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lq10/b;", "", "", "status", "<init>", "(I)V", "a", "I", "()I", "setStatus", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private int status;

    public /* synthetic */ b(int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 0 : i14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.status == ((b) obj).status;
    }

    public final int hashCode() {
        return Integer.hashCode(this.status);
    }

    public final String toString() {
        return e0.f(this.status, "AppInstallsResponse(status=", ")");
    }

    public b(int i14) {
        this.status = i14;
    }

    public b() {
        this(0, 1, null);
    }
}

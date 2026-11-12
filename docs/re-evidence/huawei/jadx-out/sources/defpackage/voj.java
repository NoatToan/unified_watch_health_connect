package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes43.dex */
public class voj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mHuid")
    private long f51408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mFollowStatus")
    private int f51409c;

    public long c() {
        return this.f51408b;
    }

    public int a() {
        return this.f51409c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voj)) {
            return false;
        }
        voj vojVar = (voj) obj;
        return c() == vojVar.c() && a() == vojVar.a();
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(c()), Integer.valueOf(a()));
    }
}

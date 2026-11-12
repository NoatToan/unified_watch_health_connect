package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class ntn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endTime")
    private long f43691c;

    @SerializedName("startTime")
    private long d;

    private static boolean d(long j, long j2) {
        return j / 1000 == j2 / 1000;
    }

    public ntn(long j, long j2) {
        this.d = j;
        this.f43691c = j2;
    }

    public long b() {
        return this.f43691c;
    }

    public boolean b(long j, long j2) {
        return d(j, this.d) && d(j2, this.f43691c);
    }

    public boolean c(long j, long j2) {
        return this.d == j && this.f43691c == j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ntn ntnVar = (ntn) obj;
        return this.d == ntnVar.d && this.f43691c == ntnVar.f43691c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.d), Long.valueOf(this.f43691c));
    }
}

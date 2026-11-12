package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class voh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("huid")
    private long f51404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("memberStatus")
    private int f51405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("createTime")
    private long f51406c;

    public void c(long j) {
        this.f51404a = j;
    }

    public long b() {
        return this.f51404a;
    }

    public void c(int i) {
        this.f51405b = i;
    }

    public int d() {
        return this.f51405b;
    }

    public long e() {
        return this.f51406c;
    }

    public void d(long j) {
        this.f51406c = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voh)) {
            return false;
        }
        voh vohVar = (voh) obj;
        return b() == vohVar.b() && d() == vohVar.d() && e() == vohVar.e();
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(b()), Integer.valueOf(d()), Long.valueOf(e()));
    }
}

package defpackage;

import com.google.gson.annotations.Expose;
import java.util.Objects;

/* JADX INFO: loaded from: classes31.dex */
public class ibt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Expose
    private int f37458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Expose
    private long f37459b;

    public int c() {
        return this.f37458a;
    }

    public void e(int i) {
        this.f37458a = i;
    }

    public long a() {
        return this.f37459b;
    }

    public void e(long j) {
        this.f37459b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ibt ibtVar = (ibt) obj;
        return this.f37459b == ibtVar.f37459b && this.f37458a == ibtVar.f37458a;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f37459b), Integer.valueOf(this.f37458a));
    }

    public String toString() {
        return "SportData{mGolfTotalTimes=" + this.f37459b + ", mGolfTotalScore=" + this.f37458a + '}';
    }
}

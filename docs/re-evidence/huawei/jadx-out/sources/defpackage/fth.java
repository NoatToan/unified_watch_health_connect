package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class fth {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f34550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34551c;
    private int e;

    public fth() {
        this.e = -1;
        this.f34551c = -1L;
    }

    public fth(long j, int i) {
        this.f34551c = -1L;
        this.f34550b = j;
        this.e = i;
    }

    public fth(long j, long j2) {
        this.e = -1;
        this.f34550b = j;
        this.f34551c = j2;
    }

    public int e() {
        return this.e;
    }

    public long b() {
        return this.f34551c;
    }

    public long c() {
        return this.f34550b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fth fthVar = (fth) obj;
        return this.f34550b == fthVar.f34550b && this.e == fthVar.e && this.f34551c == fthVar.f34551c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f34550b), Integer.valueOf(this.e), Long.valueOf(this.f34551c));
    }
}

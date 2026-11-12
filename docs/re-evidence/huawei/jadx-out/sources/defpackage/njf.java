package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njf implements Serializable {
    private static final long serialVersionUID = 8124564522666712928L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f43085b;

    public njf() {
    }

    public njf(long j, int i) {
        this.f43085b = j;
        this.f43084a = i;
    }

    public long b() {
        return this.f43085b;
    }

    public int d() {
        return this.f43084a;
    }

    public String toString() {
        return this.f43085b + "," + this.f43084a;
    }
}

package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class lmb implements Serializable {
    private static final long serialVersionUID = -2450042604654189808L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f40429c;
    private int e;

    public lmb(long j, int i, int i2) {
        this.f40429c = j;
        this.e = i;
        this.f40428b = i2;
    }

    public long b() {
        return this.f40429c;
    }

    public int a() {
        return this.e;
    }

    public int d() {
        return this.f40428b;
    }
}

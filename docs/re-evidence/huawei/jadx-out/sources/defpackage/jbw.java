package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jbw implements Serializable {
    private static final long serialVersionUID = -4674592258281735115L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f38363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38365c;
    private float d;
    private float e;

    public float a() {
        long minutes = TimeUnit.MILLISECONDS.toMinutes(this.f38363a - this.f38365c);
        if (minutes == 0) {
            return 0.0f;
        }
        return this.e / minutes;
    }

    public long b() {
        return this.f38365c;
    }

    public void c(long j) {
        this.f38365c = j;
    }

    public long e() {
        return this.f38363a;
    }

    public void d(long j) {
        this.f38363a = j;
    }

    public float d() {
        return this.e;
    }

    public void e(float f) {
        this.e = f;
    }

    public float c() {
        return this.d;
    }

    public void b(float f) {
        this.d = f;
    }

    public int i() {
        return this.f38364b;
    }

    public void c(int i) {
        this.f38364b = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(this.f38365c);
        sb.append("#");
        sb.append(this.f38363a);
        sb.append("#");
        sb.append(this.e);
        sb.append("#");
        sb.append(this.d);
        sb.append("#");
        sb.append(this.f38364b);
        return sb.toString();
    }
}

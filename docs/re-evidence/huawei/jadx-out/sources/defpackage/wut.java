package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes43.dex */
public class wut {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52522c;
    private long d;

    public void c(long j) {
        this.d = j;
    }

    public int c() {
        return this.f52522c;
    }

    public void a(int i) {
        this.f52522c = i;
    }

    public void e(int i) {
        this.f52521b = i;
    }

    public String toString() {
        return "stressEndTime = " + ltb.d(new Date(this.d * 1000)) + " stressScore = " + this.f52521b + " stressGrade = " + this.f52521b;
    }
}

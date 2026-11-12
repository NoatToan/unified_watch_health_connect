package defpackage;

import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class uyt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<uig> f50752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50753c;
    private boolean d;
    private Date e;
    private double f;

    public CopyOnWriteArrayList<uig> e() {
        return this.f50752b;
    }

    public void e(CopyOnWriteArrayList<uig> copyOnWriteArrayList) {
        this.f50752b = copyOnWriteArrayList;
    }

    public boolean d() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public double b() {
        return this.f;
    }

    public void e(double d) {
        this.f = d;
    }

    public boolean h() {
        return this.f50753c;
    }

    public void d(boolean z) {
        this.f50753c = z;
    }

    public Date a() {
        return (Date) lst.d(this.e);
    }

    public void d(Date date) {
        this.e = (Date) lst.d(date);
    }

    public int c() {
        return this.f50751a;
    }

    public void b(int i) {
        this.f50751a = i;
    }
}

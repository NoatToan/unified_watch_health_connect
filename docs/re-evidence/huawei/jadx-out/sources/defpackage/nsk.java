package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f43590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43592c;
    private int d;

    public nsk(int i, List<Integer> list, int i2) {
        this.f43591b = i;
        this.f43590a = list;
        this.d = i2;
    }

    public int e() {
        return this.f43591b;
    }

    public List<Integer> a() {
        return this.f43590a;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.f43592c;
    }

    public void d(int i) {
        this.f43592c = i;
    }

    public String toString() {
        return "ActivitySimpleListRequestBean{mJoinStatus=" + this.f43591b + ", mFinishFlag=" + this.d + '}';
    }
}

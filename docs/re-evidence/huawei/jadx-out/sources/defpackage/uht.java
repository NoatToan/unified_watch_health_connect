package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes43.dex */
public class uht implements Serializable {
    private static final long serialVersionUID = -9040197766300913173L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50099a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50100c;
    private boolean e;

    public uht(int i, boolean z) {
        this.f50099a = i;
        this.e = z;
    }

    public int c() {
        return this.f50099a;
    }

    public void d(int i) {
        this.f50099a = i;
    }

    public boolean a() {
        return this.e;
    }

    public void a(int i) {
        this.f50100c = i;
    }

    public String toString() {
        return "FoodType [mType=" + this.f50099a + ", mCanBeModified=" + this.e + "]";
    }

    public int d() {
        return this.f50100c;
    }
}

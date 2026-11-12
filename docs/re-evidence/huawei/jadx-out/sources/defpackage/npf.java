package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class npf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Float> f43394b;
    private int d;

    public npf(List<Float> list, int i) {
        this.f43394b = list;
        this.d = i;
    }

    public int c() {
        return this.d;
    }

    public List<Float> a() {
        return this.f43394b;
    }

    public String toString() {
        return "mStatusNum = " + this.d + " mSignalList = " + this.f43394b.toString();
    }
}

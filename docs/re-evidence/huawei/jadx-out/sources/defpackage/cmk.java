package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f1779a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f1780c;
    private int d;

    public int c() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public List<Integer> d() {
        return this.f1779a;
    }

    public void d(List<Integer> list) {
        this.f1779a = list;
    }

    public List<String> e() {
        return this.f1780c;
    }

    public void e(List<String> list) {
        this.f1780c = list;
    }

    public String toString() {
        return "McuCommand{mServiceId=" + this.d + ", mCommandIds=" + this.f1779a + ", mDestPkgNames=" + this.f1780c + '}';
    }
}

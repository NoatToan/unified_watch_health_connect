package n23;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122539b;

    public n0(List list, int i14) {
        this.f122538a = list;
        this.f122539b = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        return (t23.o0) this.f122538a.get(this.f122539b);
    }
}

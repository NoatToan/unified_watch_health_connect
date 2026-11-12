package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<dc1> f15359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15360b = 0;
    public int c = 0;
    public int d = -1;

    public final void a(dc1 dc1Var) {
        if (this.f15359a == null) {
            this.f15359a = new ArrayList(1);
        }
        ((List) sk1.c(this.f15359a)).add(dc1Var);
        dc1Var.b(this);
    }

    public void b(dc1 dc1Var) {
    }

    public void c(dc1 dc1Var) {
    }

    public final void d(dc1 dc1Var) {
        if (this.f15359a == null) {
            return;
        }
        dc1Var.c(this);
        this.f15359a.remove(dc1Var);
    }

    public void e() {
    }
}

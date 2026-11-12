package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rbo extends rbn {
    private static final long serialVersionUID = -374428058867356358L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47095a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<rbx> f47096c = new ArrayList(8);

    public void d(int i) {
        this.f47095a = i;
    }

    public List<rbx> c() {
        return this.f47096c;
    }

    public void a(rbx rbxVar) {
        this.f47096c.add(rbxVar);
    }

    public String toString() {
        return "Content{partCount=" + this.f47095a + ", parts=" + this.f47096c + '}';
    }
}

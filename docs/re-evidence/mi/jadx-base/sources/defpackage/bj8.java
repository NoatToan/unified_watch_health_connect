package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class bj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<aj8> f4279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4280b;
    public final boolean c;

    public bj8(List<aj8> list, int i, boolean z) {
        this.f4279a = new ArrayList(list);
        this.f4280b = i;
        this.c = z;
    }

    public List<aj8> a() {
        return this.f4279a;
    }

    public int b() {
        return this.f4280b;
    }

    public boolean c(List<aj8> list) {
        return this.f4279a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bj8)) {
            return false;
        }
        bj8 bj8Var = (bj8) obj;
        return this.f4279a.equals(bj8Var.a()) && this.c == bj8Var.c;
    }

    public int hashCode() {
        return this.f4279a.hashCode() ^ Boolean.valueOf(this.c).hashCode();
    }

    public String toString() {
        return "{ " + this.f4279a + " }";
    }
}

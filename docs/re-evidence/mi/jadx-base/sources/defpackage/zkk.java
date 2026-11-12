package defpackage;

import com.airbnb.lottie.model.layer.a;

/* JADX INFO: loaded from: classes.dex */
public class zkk implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb1 f41406b;
    public final eb1 c;
    public final qb1 d;
    public final boolean e;

    public zkk(String str, eb1 eb1Var, eb1 eb1Var2, qb1 qb1Var, boolean z) {
        this.f41405a = str;
        this.f41406b = eb1Var;
        this.c = eb1Var2;
        this.d = qb1Var;
        this.e = z;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, a aVar) {
        return new alk(jteVar, aVar, this);
    }

    public eb1 b() {
        return this.f41406b;
    }

    public String c() {
        return this.f41405a;
    }

    public eb1 d() {
        return this.c;
    }

    public qb1 e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}

package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class yk9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cg4<o98> f40264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ebi f40265b;
    public long c = 0;
    public int d;
    public c83 e;

    public yk9(cg4<o98> cg4Var, ebi ebiVar) {
        this.f40264a = cg4Var;
        this.f40265b = ebiVar;
    }

    public cg4<o98> a() {
        return this.f40264a;
    }

    public ebi b() {
        return this.f40265b;
    }

    public String c() {
        return this.f40265b.getId();
    }

    public long d() {
        return this.c;
    }

    public hbi e() {
        return this.f40265b.f();
    }

    public int f() {
        return this.d;
    }

    public c83 g() {
        return this.e;
    }

    public Uri h() {
        return this.f40265b.b().q();
    }

    public void i(long j) {
        this.c = j;
    }

    public void j(int i) {
        this.d = i;
    }

    public void k(c83 c83Var) {
        this.e = c83Var;
    }
}

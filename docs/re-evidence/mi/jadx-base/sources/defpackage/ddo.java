package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ddo<T> extends edo<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cg4<T> f15413b;
    public final hbi c;
    public final String d;
    public final String e;

    public ddo(cg4<T> cg4Var, hbi hbiVar, String str, String str2) {
        this.f15413b = cg4Var;
        this.c = hbiVar;
        this.d = str;
        this.e = str2;
        hbiVar.a(str2, str);
    }

    @Override // defpackage.edo
    public void d() {
        hbi hbiVar = this.c;
        String str = this.e;
        hbiVar.h(str, this.d, hbiVar.f(str) ? g() : null);
        this.f15413b.a();
    }

    @Override // defpackage.edo
    public void e(Exception exc) {
        hbi hbiVar = this.c;
        String str = this.e;
        hbiVar.c(str, this.d, exc, hbiVar.f(str) ? h(exc) : null);
        this.f15413b.onFailure(exc);
    }

    @Override // defpackage.edo
    public void f(T t) {
        hbi hbiVar = this.c;
        String str = this.e;
        hbiVar.g(str, this.d, hbiVar.f(str) ? i(t) : null);
        this.f15413b.b(t, 1);
    }

    public Map<String, String> g() {
        return null;
    }

    public Map<String, String> h(Exception exc) {
        return null;
    }

    public Map<String, String> i(T t) {
        return null;
    }
}

package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class kx1 implements ix1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jx1 f24383a;

    public kx1(jx1 jx1Var) {
        this.f24383a = jx1Var;
    }

    @Override // defpackage.ix1
    public String a(String str, int i) {
        return str + ".bak";
    }

    @Override // defpackage.ix1
    public int b() {
        return 1;
    }

    @Override // defpackage.jx1
    public boolean c(File file) {
        return this.f24383a.c(file);
    }
}

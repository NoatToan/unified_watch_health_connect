package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class bj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final awe f4276a;

    public bj2(awe aweVar) {
        this.f4276a = aweVar;
    }

    public abstract bj2 a(awe aweVar);

    public abstract cp2 b() throws NotFoundException;

    public abstract zo2 c(int i, zo2 zo2Var) throws NotFoundException;

    public final int d() {
        return this.f4276a.a();
    }

    public final awe e() {
        return this.f4276a;
    }

    public final int f() {
        return this.f4276a.d();
    }
}

package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class fya implements y2i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo9 f18369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2i f18370b;

    public fya(eo9 eo9Var, w2i w2iVar) {
        this.f18369a = eo9Var;
        this.f18370b = w2iVar;
    }

    @Override // defpackage.eo9
    public int a() {
        return this.f18369a.a() * this.f18370b.b();
    }

    @Override // defpackage.eo9
    public BigInteger b() {
        return this.f18369a.b();
    }

    @Override // defpackage.y2i
    public w2i c() {
        return this.f18370b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fya)) {
            return false;
        }
        fya fyaVar = (fya) obj;
        return this.f18369a.equals(fyaVar.f18369a) && this.f18370b.equals(fyaVar.f18370b);
    }

    public int hashCode() {
        return this.f18369a.hashCode() ^ rcd.a(this.f18370b.hashCode(), 16);
    }
}

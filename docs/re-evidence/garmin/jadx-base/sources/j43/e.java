package j43;

import ch.qos.logback.core.CoreConstants;
import p43.n0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.e f97046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.e f97047b;

    public e(t23.e eVar, e eVar2) {
        eVar.getClass();
        this.f97046a = eVar;
        this.f97047b = eVar;
    }

    public final boolean equals(Object obj) {
        e eVar = obj instanceof e ? (e) obj : null;
        return this.f97046a.equals(eVar != null ? eVar.f97046a : null);
    }

    @Override // j43.g
    public final n0 getType() {
        v0 v0VarP = this.f97046a.p();
        v0VarP.getClass();
        return v0VarP;
    }

    public final int hashCode() {
        return this.f97046a.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Class{");
        v0 v0VarP = this.f97046a.p();
        v0VarP.getClass();
        sb3.append(v0VarP);
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }
}

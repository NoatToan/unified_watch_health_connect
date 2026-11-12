package m63;

import java.lang.annotation.Annotation;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/n0;", "Lk23/p;", "origin", "<init>", "(Lk23/p;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 implements k23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.p f116997a;

    public n0(k23.p pVar) {
        pVar.getClass();
        this.f116997a = pVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        k23.p pVar = n0Var != null ? n0Var.f116997a : null;
        k23.p pVar2 = this.f116997a;
        if (!pVar2.equals(pVar)) {
            return false;
        }
        k23.e eVarG = pVar2.getF105782a();
        if (!(eVarG instanceof k23.d)) {
            return false;
        }
        k23.p pVar3 = obj instanceof k23.p ? (k23.p) obj : null;
        k23.e eVarG2 = pVar3 != null ? pVar3.getF105782a() : null;
        if (eVarG2 == null || !(eVarG2 instanceof k23.d)) {
            return false;
        }
        return dh.b.u((k23.d) eVarG).equals(dh.b.u((k23.d) eVarG2));
    }

    @Override // k23.p
    /* JADX INFO: renamed from: g */
    public final k23.e getF105782a() {
        return this.f116997a.getF105782a();
    }

    @Override // k23.b
    public final List<Annotation> getAnnotations() {
        return this.f116997a.getAnnotations();
    }

    @Override // k23.p
    public final List<k23.r> h() {
        return this.f116997a.h();
    }

    public final int hashCode() {
        return this.f116997a.hashCode();
    }

    @Override // k23.p
    /* JADX INFO: renamed from: i */
    public final boolean getF16114d() {
        return this.f116997a.getF16114d();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f116997a;
    }
}

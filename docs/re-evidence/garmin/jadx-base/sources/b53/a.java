package b53;

import java.lang.reflect.Type;
import n23.c4;
import n23.l4;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0017\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb53/a;", "Lkotlin/jvm/internal/t;", "Lt43/f;", "Lt43/j;", "Lt43/k;", "Lt43/e;", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Le23/a;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements p005kotlin.jvm.internal.t, t43.e, t43.f, t43.j, t43.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4.a<Type> f16111a;

    public a(e23.a<? extends Type> aVar) {
        c4.a<Type> aVar2 = null;
        c4.a<Type> aVar3 = aVar instanceof c4.a ? (c4.a) aVar : null;
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar3 = new c4.a<>(null, aVar);
            aVar2 = aVar3;
        }
        this.f16111a = aVar2;
    }

    /* JADX INFO: renamed from: C */
    public abstract boolean getF16160i();

    public abstract a E();

    public abstract a F(boolean z14);

    public abstract a G(boolean z14);

    public abstract a H();

    /* JADX INFO: renamed from: c */
    public abstract k23.p getF16157f();

    public abstract k23.d<?> e();

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        p43.d.f135809a.getClass();
        return p43.d.b(u.f16150a, this, (t43.h) obj);
    }

    public int hashCode() {
        k23.e eVarG = getF105782a();
        return Boolean.hashCode(getF16155d()) + ((h().hashCode() + ((eVarG != null ? eVarG.hashCode() : 0) * 31)) * 31);
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean getF16158g();

    /* JADX INFO: renamed from: m */
    public abstract boolean getF16159h();

    public abstract boolean t();

    public String toString() {
        return l4.f122528a.f(this, false);
    }

    @Override // p005kotlin.jvm.internal.t
    public final Type u() {
        c4.a<Type> aVar = this.f16111a;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }
}

package q43;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.List;
import p13.j0;
import p43.f2;
import p43.n0;
import p43.t1;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements c43.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f142801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.a<? extends List<? extends f2>> f142802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f142803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1 f142804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f142805e;

    public m(t1 t1Var, e23.a<? extends List<? extends f2>> aVar, m mVar, d1 d1Var) {
        t1Var.getClass();
        this.f142801a = t1Var;
        this.f142802b = aVar;
        this.f142803c = mVar;
        this.f142804d = d1Var;
        this.f142805e = o13.m.a(o13.n.PUBLICATION, new i(this));
    }

    @Override // p43.m1
    public final boolean C() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // p43.m1
    public final Collection b() {
        List list = (List) this.f142805e.getValue();
        return list == null ? j0.f134944a : list;
    }

    @Override // p43.m1
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
        n0 type = this.f142801a.getType();
        type.getClass();
        return o72.t.D(type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        m mVar = (m) obj;
        m mVar2 = this.f142803c;
        if (mVar2 == null) {
            mVar2 = this;
        }
        m mVar3 = mVar.f142803c;
        if (mVar3 != null) {
            obj = mVar3;
        }
        return mVar2 == obj;
    }

    @Override // p43.m1
    public final List<d1> getParameters() {
        return j0.f134944a;
    }

    @Override // c43.b
    public final t1 getProjection() {
        return this.f142801a;
    }

    public final int hashCode() {
        m mVar = this.f142803c;
        return mVar != null ? mVar.hashCode() : super.hashCode();
    }

    @Override // p43.m1
    public final t23.h t() {
        return null;
    }

    public final String toString() {
        return "CapturedType(" + this.f142801a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ m(t1 t1Var, e23.a aVar, m mVar, d1 d1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(t1Var, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : mVar, (i14 & 8) != 0 ? null : d1Var);
    }

    public /* synthetic */ m(t1 t1Var, List list, m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(t1Var, list, (i14 & 4) != 0 ? null : mVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(t1 t1Var, List<? extends f2> list, m mVar) {
        this(t1Var, new j(list), mVar, null, 8, null);
        t1Var.getClass();
        list.getClass();
    }
}

package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BE\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0013B)\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ln23/t3;", "Lk23/q;", "Lt43/n;", "Lt43/m;", "Lt23/d1;", "descriptor", "Ln23/v3;", "_container", "Lkotlin/Function0;", "computeContainer", "", "name", "Lk23/s;", "variance", "", "isReified", "<init>", "(Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;Ln23/v3;Le23/a;Ljava/lang/String;Lk23/s;Z)V", TtmlNode.RUBY_CONTAINER, "(Ln23/v3;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "(Ln23/v3;Ljava/lang/String;Lk23/s;Z)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t3 implements k23.q, t43.m, t43.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3 f122623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<v3> f122624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f122625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k23.s f122626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t23.d1 f122627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile List<? extends k23.p> f122628f;

    /* JADX WARN: Multi-variable type inference failed */
    public t3(v3 v3Var, t23.d1 d1Var) {
        k23.s sVar;
        d1Var.getClass();
        e23.a aVar = null;
        Object[] objArr = 0;
        c4.a aVar2 = new c4.a(null, new s3(d1Var));
        String strB = d1Var.getName().b();
        strB.getClass();
        p43.g2 g2VarM = d1Var.m();
        g2VarM.getClass();
        int i14 = u3.a.f122638a[g2VarM.ordinal()];
        int i15 = 2;
        if (i14 == 1) {
            sVar = k23.s.INVARIANT;
        } else if (i14 == 2) {
            sVar = k23.s.IN;
        } else {
            if (i14 != 3) {
                lc.u0.r();
                throw null;
            }
            sVar = k23.s.OUT;
        }
        this(d1Var, v3Var, aVar2, strB, sVar, d1Var.r());
        List<p43.n0> upperBounds = d1Var.getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new b53.l((p43.n0) it.next(), aVar, i15, objArr == true ? 1 : 0));
        }
        this.f122628f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t3)) {
            return false;
        }
        v3 v3VarInvoke = this.f122623a;
        if (v3VarInvoke == null) {
            e23.a<v3> aVar = this.f122624b;
            aVar.getClass();
            v3VarInvoke = aVar.invoke();
        }
        t3 t3Var = (t3) obj;
        v3 v3VarInvoke2 = t3Var.f122623a;
        if (v3VarInvoke2 == null) {
            e23.a<v3> aVar2 = t3Var.f122624b;
            aVar2.getClass();
            v3VarInvoke2 = aVar2.invoke();
        }
        return p005kotlin.jvm.internal.s.g(v3VarInvoke, v3VarInvoke2) && p005kotlin.jvm.internal.s.g(this.f122625c, t3Var.f122625c);
    }

    @Override // k23.q
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF122625c() {
        return this.f122625c;
    }

    @Override // k23.q
    public final List<k23.p> getUpperBounds() {
        List list = this.f122628f;
        if (list != null) {
            return list;
        }
        p005kotlin.jvm.internal.s.m("upperBounds");
        throw null;
    }

    public final int hashCode() {
        v3 v3VarInvoke = this.f122623a;
        if (v3VarInvoke == null) {
            e23.a<v3> aVar = this.f122624b;
            aVar.getClass();
            v3VarInvoke = aVar.invoke();
        }
        return this.f122625c.hashCode() + (v3VarInvoke.hashCode() * 31);
    }

    @Override // k23.q
    /* JADX INFO: renamed from: m, reason: from getter */
    public final k23.s getF122626d() {
        return this.f122626d;
    }

    public final String toString() {
        p005kotlin.jvm.internal.z0.f105819f.getClass();
        return kotlin.jvm.internal.z0.a.a(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t3(v3 v3Var, String str, k23.s sVar, boolean z14) {
        this(null, v3Var, null, str, sVar, z14);
        v3Var.getClass();
        str.getClass();
        sVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t3(t23.d1 d1Var, v3 v3Var, e23.a<? extends v3> aVar, String str, k23.s sVar, boolean z14) {
        this.f122623a = v3Var;
        this.f122624b = aVar;
        this.f122625c = str;
        this.f122626d = sVar;
        this.f122627e = d1Var;
    }
}

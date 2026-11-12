package k63;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m63.k1;
import o13.p;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.m0;
import p13.n0;
import p13.o0;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk63/f;", "Lk63/e;", "Lm63/k;", "", "serialName", "Lk63/l;", "kind", "", "elementsCount", "", "typeParameters", "Lk63/a;", "builder", "<init>", "(Ljava/lang/String;Lk63/l;ILjava/util/List;Lk63/a;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e, m63.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f103234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f103235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Annotation> f103236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f103237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f103238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e[] f103239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Annotation>[] f103240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f103241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, Integer> f103242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e[] f103243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f103244l;

    public f(String str, l lVar, int i14, List<? extends e> list, a aVar) {
        str.getClass();
        lVar.getClass();
        list.getClass();
        aVar.getClass();
        this.f103233a = str;
        this.f103234b = lVar;
        this.f103235c = i14;
        this.f103236d = aVar.f103213b;
        ArrayList arrayList = aVar.f103214c;
        this.f103237e = h0.Z0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f103238f = strArr;
        this.f103239g = k1.c(aVar.f103216e);
        this.f103240h = (List[]) aVar.f103217f.toArray(new List[0]);
        this.f103241i = h0.U0(aVar.f103218g);
        strArr.getClass();
        n0 n0Var = new n0(new o02.a(strArr, 1));
        ArrayList arrayList2 = new ArrayList(y.r(n0Var, 10));
        Iterator it = n0Var.iterator();
        while (true) {
            o0 o0Var = (o0) it;
            if (!o0Var.f134956a.hasNext()) {
                this.f103242j = u0.l(arrayList2);
                this.f103243k = k1.c(list);
                this.f103244l = o13.m.b(new jx0.e(this, 13));
                return;
            }
            m0 m0Var = (m0) o0Var.next();
            arrayList2.add(new p(m0Var.f134952b, Integer.valueOf(m0Var.f134951a)));
        }
    }

    @Override // m63.k
    public final Set<String> a() {
        return this.f103237e;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF116985c() {
        return this.f103235c;
    }

    @Override // k63.e
    public final String d(int i14) {
        return this.f103238f[i14];
    }

    @Override // k63.e
    public final List<Annotation> e(int i14) {
        return this.f103240h[i14];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (this.f103233a.equals(eVar.getF103257a()) && Arrays.equals(this.f103243k, ((f) obj).f103243k)) {
                int f103235c = eVar.getF116985c();
                int i14 = this.f103235c;
                if (i14 == f103235c) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        e[] eVarArr = this.f103239g;
                        if (s.g(eVarArr[i15].getF103257a(), eVar.h(i15).getF103257a()) && s.g(eVarArr[i15].getF103234b(), eVar.h(i15).getF103234b())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF103257a() {
        return this.f103233a;
    }

    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        Integer num = this.f103242j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // k63.e
    public final List<Annotation> getAnnotations() {
        return this.f103236d;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: getKind, reason: from getter */
    public final l getF103234b() {
        return this.f103234b;
    }

    @Override // k63.e
    public final e h(int i14) {
        return this.f103239g[i14];
    }

    public final int hashCode() {
        return ((Number) this.f103244l.getValue()).intValue();
    }

    @Override // k63.e
    public final boolean i(int i14) {
        return this.f103241i[i14];
    }

    public final String toString() {
        return k1.j(this);
    }
}

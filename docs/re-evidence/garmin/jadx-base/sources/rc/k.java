package rc;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.q0;
import p005kotlin.Metadata;
import p13.u0;
import p13.w;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrc/k;", "", "T", "Ll63/b;", "Li63/c;", "serializer", "", "", "Llc/q0;", "typeMap", "<init>", "(Li63/c;Ljava/util/Map;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k<T> extends l63.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<T> f151849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, q0<Object>> f151850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p63.c f151851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f151852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f151853e;

    /* JADX WARN: Multi-variable type inference failed */
    public k(i63.c<T> cVar, Map<String, ? extends q0<Object>> map) {
        cVar.getClass();
        map.getClass();
        this.f151849a = cVar;
        this.f151850b = map;
        this.f151851c = p63.h.f136264a;
        this.f151852d = new LinkedHashMap();
        this.f151853e = -1;
    }

    @Override // l63.b, l63.f
    public final void D() {
        H(null);
    }

    @Override // l63.b
    public final void E(k63.e eVar, int i14) {
        eVar.getClass();
        this.f151853e = i14;
    }

    @Override // l63.b
    public final void F(Object obj) {
        obj.getClass();
        H(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, List<String>> G(Object obj) {
        obj.getClass();
        super.l(this.f151849a, obj);
        return u0.m(this.f151852d);
    }

    public final void H(Object obj) {
        String strD = this.f151849a.getF158591b().d(this.f151853e);
        q0<Object> q0Var = this.f151850b.get(strD);
        if (q0Var != null) {
            this.f151852d.put(strD, q0Var instanceof lc.g ? ((lc.g) q0Var).i(obj) : w.c(q0Var.f(obj)));
        } else {
            e0.n(am.j.m("Cannot find NavType for argument ", strD, ". Please provide NavType through typeMap."));
        }
    }

    @Override // l63.f
    /* JADX INFO: renamed from: a */
    public final p63.e getF129837e() {
        return this.f151851c;
    }

    @Override // l63.b, l63.f
    public final l63.f g(k63.e eVar) {
        eVar.getClass();
        if (l.f(eVar)) {
            this.f151853e = 0;
        }
        return this;
    }

    @Override // l63.f
    public final <T> void l(i63.i<? super T> iVar, T t7) {
        iVar.getClass();
        H(t7);
    }
}

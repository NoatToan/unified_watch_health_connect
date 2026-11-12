package lc;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B5\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\b¢\u0006\u0004\b\u0002\u0010\f¨\u0006\r"}, d2 = {"Llc/f0;", "", "<init>", "()V", "", "basePath", "Lk23/d;", "route", "", "Lk23/p;", "Llc/q0;", "typeMap", "(Ljava/lang/String;Lk23/d;Ljava/util/Map;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0.a f111762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k23.d<?> f111763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<k23.p, ? extends q0<?>> f111764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f111765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f111766e;

    public f0(String str, k23.d<?> dVar, Map<k23.p, q0<?>> map) {
        str.getClass();
        dVar.getClass();
        map.getClass();
        this.f111762a = new d0.a();
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this.f111764c = k0Var;
        if (str.length() <= 0) {
            vb.h.s("The basePath for NavDeepLink from KClass cannot be empty");
            throw null;
        }
        this.f111765d = rc.l.d(gl1.y.J(dVar), map, str);
        this.f111763b = dVar;
        this.f111764c = map;
    }

    public f0() {
        this.f111762a = new d0.a();
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this.f111764c = k0Var;
    }
}

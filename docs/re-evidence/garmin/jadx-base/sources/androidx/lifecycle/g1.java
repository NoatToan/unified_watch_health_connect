package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class g1 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.a f7897b;

    public g1(Object obj) {
        this.f7896a = obj;
        f fVar = f.f7885c;
        Class<?> cls = obj.getClass();
        f.a aVar = (f.a) fVar.f7886a.get(cls);
        this.f7897b = aVar == null ? fVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        HashMap map = this.f7897b.f7888a;
        List list = (List) map.get(aVar);
        Object obj = this.f7896a;
        f.a.a(list, n0Var, aVar, obj);
        f.a.a((List) map.get(b0.a.ON_ANY), n0Var, aVar, obj);
    }
}

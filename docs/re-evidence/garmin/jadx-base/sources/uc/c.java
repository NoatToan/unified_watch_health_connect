package uc;

import java.util.List;
import java.util.Map;
import p13.h0;
import p13.k0;

/* JADX INFO: loaded from: classes.dex */
public interface c<T> {
    List<sc.h<T>> a();

    List<sc.h<T>> c();

    z3.e getContent();

    Object getKey();

    default Map<String, Object> getMetadata() {
        Map<String, Object> map;
        sc.h hVar = (sc.h) h0.n0(c());
        if (hVar != null && (map = hVar.f158453c) != null) {
            return map;
        }
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        return k0Var;
    }
}

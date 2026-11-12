package f4;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"Lf4/b0;", "", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements Map.Entry<Object, Object>, f23.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f68721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f68722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0<Object, Object> f68723c;

    public b0(c0<Object, Object> c0Var) {
        this.f68723c = c0Var;
        Map.Entry<? extends Object, ? extends Object> entry = c0Var.f68731d;
        entry.getClass();
        this.f68721a = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = c0Var.f68731d;
        entry2.getClass();
        this.f68722b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f68721a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f68722b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        c0<Object, Object> c0Var = this.f68723c;
        if (c0Var.f68728a.b().f68812d != c0Var.f68730c) {
            org.apache.commons.lang3.e.h();
            return null;
        }
        Object obj2 = this.f68722b;
        c0Var.f68728a.put(this.f68721a, obj);
        this.f68722b = obj;
        return obj2;
    }
}

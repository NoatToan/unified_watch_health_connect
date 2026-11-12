package t9;

import androidx.fragment.app.j;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p13.k0;
import r53.q2;
import r53.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt9/a;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f163193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f163194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f163195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f163196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f163197e;

    public a(Map<String, ? extends Object> map) {
        map.getClass();
        this.f163193a = new LinkedHashMap(map);
        this.f163194b = new LinkedHashMap();
        this.f163195c = new LinkedHashMap();
        this.f163196d = new LinkedHashMap();
        this.f163197e = new j(this, 6);
    }

    public final z1 a(Object obj, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.f163196d;
        Object objA = linkedHashMap.get(str);
        if (objA == null) {
            LinkedHashMap linkedHashMap2 = this.f163193a;
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, obj);
            }
            objA = q2.a(linkedHashMap2.get(str));
            linkedHashMap.put(str, objA);
        }
        return (z1) objA;
    }

    public final void b(Object obj, String str) {
        str.getClass();
        this.f163193a.put(str, obj);
        z1 z1Var = (z1) this.f163195c.get(str);
        if (z1Var != null) {
            z1Var.setValue(obj);
        }
        z1 z1Var2 = (z1) this.f163196d.get(str);
        if (z1Var2 != null) {
            z1Var2.setValue(obj);
        }
    }

    public a() {
        this(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(map);
    }
}

package ve;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lve/w;", "Lve/v;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f177619b = new LinkedHashMap();

    @Override // ve.v
    public final boolean a(cf.m mVar) {
        return this.f177619b.containsKey(mVar);
    }

    @Override // ve.v
    public final u b(cf.m mVar) {
        mVar.getClass();
        return (u) this.f177619b.remove(mVar);
    }

    @Override // ve.v
    public final u c(cf.m mVar) {
        LinkedHashMap linkedHashMap = this.f177619b;
        Object uVar = linkedHashMap.get(mVar);
        if (uVar == null) {
            uVar = new u(mVar);
            linkedHashMap.put(mVar, uVar);
        }
        return (u) uVar;
    }

    @Override // ve.v
    public final List<u> remove(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f177619b;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (((cf.m) entry.getKey()).f26929a.equals(str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((cf.m) it.next());
        }
        return p13.h0.b1(linkedHashMap.values());
    }
}

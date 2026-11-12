package b;

import a.f;
import com.huawei.harmonyos.interwork.base.ability.IInitCallBack;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends f {
    public static final HashMap e = new HashMap();
    public final IInitCallBack d;

    public d(IInitCallBack iInitCallBack) {
        this.d = iInitCallBack;
    }

    public static d a(String str, IInitCallBack iInitCallBack) {
        HashMap map = e;
        synchronized (map) {
            Set<d> set = (Set) map.get(str);
            if (set == null) {
                HashSet hashSet = new HashSet();
                d dVar = new d(iInitCallBack);
                hashSet.add(dVar);
                map.put(str, hashSet);
                return dVar;
            }
            for (d dVar2 : set) {
                if (dVar2.d == iInitCallBack) {
                    return dVar2;
                }
            }
            d dVar3 = new d(iInitCallBack);
            set.add(dVar3);
            return dVar3;
        }
    }

    public static d b(String str, IInitCallBack iInitCallBack) {
        HashMap map = e;
        synchronized (map) {
            Set set = (Set) map.get(str);
            if (set == null) {
                return null;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.d == iInitCallBack) {
                    it.remove();
                    if (set.isEmpty()) {
                        e.remove(str);
                    }
                    return dVar;
                }
            }
            return null;
        }
    }
}

package w43;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e<K, T> extends a<K, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c<T> f181997a;

    public e(c<T> cVar) {
        cVar.getClass();
        this.f181997a = cVar;
    }

    @Override // w43.a
    public final c<T> a() {
        return this.f181997a;
    }

    public final String c(c<T> cVar, int i14, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Race condition happened, the size of ArrayMap is " + i14 + " but it isn't an `" + str + '`');
        sb3.append('\n');
        StringBuilder sb4 = new StringBuilder("Type: ");
        sb4.append(cVar.getClass());
        sb3.append(sb4.toString());
        sb3.append('\n');
        StringBuilder sb5 = new StringBuilder();
        ConcurrentHashMap<String, Integer> concurrentHashMap = b().f182062a;
        sb5.append("[\n");
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        int i15 = 0;
        for (T t7 : cVar) {
            int i16 = i15 + 1;
            T t14 = null;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            for (T t15 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) t15).getValue()).intValue() == i15) {
                    t14 = t15;
                    break;
                }
            }
            sb5.append("  " + ((Map.Entry) t14) + '[' + i15 + "]: " + t7);
            sb5.append('\n');
            arrayList.add(sb5);
            i15 = i16;
        }
        sb5.append("]");
        sb5.append('\n');
        sb3.append("Content: ".concat(sb5.toString()));
        sb3.append('\n');
        return sb3.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        i iVar = i.f182009a;
        iVar.getClass();
        this(iVar);
    }
}

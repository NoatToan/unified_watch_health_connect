package x7;

import e23.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw7/d;", "sharedPrefs", "Ly7/g;", "currentData", "<anonymous>", "(Lw7/d;Ly7/g;)Ly7/g;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
public final class h extends v13.i implements q<w7.d, y7.g, t13.d<? super y7.g>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ w7.d f189373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ y7.g f189374b;

    public h(t13.d<? super h> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(w7.d dVar, y7.g gVar, t13.d<? super y7.g> dVar2) {
        h hVar = new h(dVar2);
        hVar.f189373a = dVar;
        hVar.f189374b = gVar;
        return hVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        w7.d dVar = this.f189373a;
        y7.g gVar = this.f189374b;
        Set<y7.g.a<?>> setKeySet = gVar.a().keySet();
        ArrayList arrayList = new ArrayList(y.r(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((y7.g.a) it.next()).f194635a);
        }
        Map<String, ?> all = dVar.f183430a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it3 = all.entrySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it3.next();
            String key = next.getKey();
            Set<String> set = dVar.f183431b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = h0.g1((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        y7.b bVar = new y7.b(new LinkedHashMap(gVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                bVar.f(new y7.g.a<>(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                bVar.f(new y7.g.a<>(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                bVar.f(new y7.g.a<>(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                bVar.f(new y7.g.a<>(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                bVar.f(new y7.g.a<>(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                bVar.f(new y7.g.a<>(str), (Set) value2);
            }
        }
        return new y7.b(new LinkedHashMap(bVar.a()), true);
    }
}

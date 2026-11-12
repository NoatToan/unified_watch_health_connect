package m63;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lm63/g0;", "K", "V", "Lm63/y0;", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Li63/c;", "kSerializer", "vSerializer", "<init>", "(Li63/c;Li63/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0<K, V> extends y0<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f116950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i63.c<K> cVar, i63.c<V> cVar2) {
        super(cVar, cVar2, null);
        cVar.getClass();
        cVar2.getClass();
        this.f116950c = new f0(cVar.getF116202c(), cVar2.getF116202c());
    }

    @Override // m63.a
    public final Object a() {
        return new HashMap();
    }

    @Override // m63.a
    public final int b(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map.size() * 2;
    }

    @Override // m63.a
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // m63.a
    public final int d(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // m63.a
    public final Object g(Object obj) {
        throw null;
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return this.f116950c;
    }

    @Override // m63.a
    public final Object h(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map;
    }
}

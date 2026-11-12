package p63;

import e23.l;
import i63.i;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u00122\u0010\u0010\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\bj\u0006\u0012\u0002\b\u0003`\u000f0\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lp63/c;", "Lp63/e;", "", "Lk23/d;", "Lp63/a;", "class2ContextualFactory", "Li63/c;", "polyBase2Serializers", "Lkotlin/Function1;", "Li63/i;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "Li63/b;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "", "hasInterfaceContextualSerializers", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<k23.d<?>, a> f136252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<k23.d<?>, Map<k23.d<?>, i63.c<?>>> f136253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<k23.d<?>, l<?, i<?>>> f136254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<k23.d<?>, Map<String, i63.c<?>>> f136255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<k23.d<?>, l<String, i63.b<?>>> f136256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f136257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Map<k23.d<?>, ? extends a> map, Map<k23.d<?>, ? extends Map<k23.d<?>, ? extends i63.c<?>>> map2, Map<k23.d<?>, ? extends l<?, ? extends i<?>>> map3, Map<k23.d<?>, ? extends Map<String, ? extends i63.c<?>>> map4, Map<k23.d<?>, ? extends l<? super String, ? extends i63.b<?>>> map5, boolean z14) {
        super(null);
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.f136252a = map;
        this.f136253b = map2;
        this.f136254c = map3;
        this.f136255d = map4;
        this.f136256e = map5;
        this.f136257f = z14;
    }

    @Override // p63.e
    public final void a(g gVar) {
        for (Map.Entry<k23.d<?>, a> entry : this.f136252a.entrySet()) {
            k23.d<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C2578a) {
                key.getClass();
                i63.c<?> cVar = ((a.C2578a) value).f136246a;
                cVar.getClass();
                gVar.a(key, cVar);
            } else {
                if (!(value instanceof a.b)) {
                    u0.r();
                    return;
                }
                gVar.c(key, ((a.b) value).f136247a);
            }
        }
        for (Map.Entry<k23.d<?>, Map<k23.d<?>, i63.c<?>>> entry2 : this.f136253b.entrySet()) {
            k23.d<?> key2 = entry2.getKey();
            for (Map.Entry<k23.d<?>, i63.c<?>> entry3 : entry2.getValue().entrySet()) {
                k23.d<?> key3 = entry3.getKey();
                i63.c<?> value2 = entry3.getValue();
                key2.getClass();
                key3.getClass();
                value2.getClass();
                gVar.e(key2, key3, value2);
            }
        }
        for (Map.Entry<k23.d<?>, l<?, i<?>>> entry4 : this.f136254c.entrySet()) {
            k23.d<?> key4 = entry4.getKey();
            l<?, i<?>> value3 = entry4.getValue();
            key4.getClass();
            value3.getClass();
            y0.e(1, value3);
            gVar.d(key4, value3);
        }
        for (Map.Entry<k23.d<?>, l<String, i63.b<?>>> entry5 : this.f136256e.entrySet()) {
            k23.d<?> key5 = entry5.getKey();
            l<String, i63.b<?>> value4 = entry5.getValue();
            key5.getClass();
            value4.getClass();
            y0.e(1, value4);
            gVar.b(key5, value4);
        }
    }

    @Override // p63.e
    public final <T> i63.c<T> b(k23.d<T> dVar, List<? extends i63.c<?>> list) {
        dVar.getClass();
        list.getClass();
        a aVar = this.f136252a.get(dVar);
        i63.c<T> cVar = aVar != null ? (i63.c<T>) aVar.a(list) : null;
        if (cVar instanceof i63.c) {
            return cVar;
        }
        return null;
    }

    @Override // p63.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF136257f() {
        return this.f136257f;
    }

    @Override // p63.e
    public final i63.b d(String str, k23.d dVar) {
        dVar.getClass();
        Map<String, i63.c<?>> map = this.f136255d.get(dVar);
        i63.c<?> cVar = map != null ? map.get(str) : null;
        if (!(cVar instanceof i63.c)) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        l<String, i63.b<?>> lVar = this.f136256e.get(dVar);
        l<String, i63.b<?>> lVar2 = y0.f(1, lVar) ? lVar : null;
        if (lVar2 != null) {
            return lVar2.invoke(str);
        }
        return null;
    }

    @Override // p63.e
    public final <T> i<T> e(k23.d<? super T> dVar, T t7) {
        i63.c<?> cVar;
        dVar.getClass();
        t7.getClass();
        if (dVar.q(t7)) {
            Map<k23.d<?>, i63.c<?>> map = this.f136253b.get(dVar);
            if (map != null) {
                cVar = map.get(s0.f105811a.b(t7.getClass()));
            } else {
                cVar = null;
            }
            i63.c<?> cVar2 = cVar instanceof i ? cVar : null;
            if (cVar2 != null) {
                return cVar2;
            }
            l<?, i<?>> lVar = this.f136254c.get(dVar);
            l<?, i<?>> lVar2 = y0.f(1, lVar) ? lVar : null;
            if (lVar2 != null) {
                return (i) lVar2.invoke(t7);
            }
        }
        return null;
    }
}

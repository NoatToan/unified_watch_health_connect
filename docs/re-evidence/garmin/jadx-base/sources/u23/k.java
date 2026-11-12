package u23;

import java.util.Map;
import p43.n0;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d f168231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x33.c f168232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<x33.f, d43.g<?>> f168233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f168234d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(p005kotlin.reflect.jvm.internal.impl.builtins.d dVar, x33.c cVar, Map<x33.f, ? extends d43.g<?>> map, boolean z14) {
        dVar.getClass();
        cVar.getClass();
        map.getClass();
        this.f168231a = dVar;
        this.f168232b = cVar;
        this.f168233c = map;
        this.f168234d = o13.m.a(o13.n.PUBLICATION, new j(this));
    }

    @Override // u23.c
    public final Map<x33.f, d43.g<?>> b() {
        return this.f168233c;
    }

    @Override // u23.c
    public final x33.c c() {
        return this.f168232b;
    }

    @Override // u23.c
    public final y0 getSource() {
        y0.a aVar = y0.f162076a;
        aVar.getClass();
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // u23.c
    public final n0 getType() {
        Object value = this.f168234d.getValue();
        value.getClass();
        return (n0) value;
    }

    public /* synthetic */ k(p005kotlin.reflect.jvm.internal.impl.builtins.d dVar, x33.c cVar, Map map, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, cVar, map, (i14 & 8) != 0 ? false : z14);
    }
}

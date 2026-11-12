package q33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p43.n0;
import t23.j1;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<x33.f, d43.g<?>> f142502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f142503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t23.e f142504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x33.b f142505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<u23.c> f142506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0 f142507g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t23.e eVar, x33.b bVar, List<u23.c> list, y0 y0Var) {
        super();
        this.f142503c = jVar;
        this.f142504d = eVar;
        this.f142505e = bVar;
        this.f142506f = list;
        this.f142507g = y0Var;
        this.f142502b = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q33.x.a
    public final void a() {
        j jVar = this.f142503c;
        jVar.getClass();
        x33.b bVar = this.f142505e;
        bVar.getClass();
        HashMap<x33.f, d43.g<?>> map = this.f142502b;
        map.getClass();
        p23.b.f135026a.getClass();
        boolean zR = false;
        if (bVar.equals(p23.b.f135028c)) {
            d43.g<?> gVar = map.get(x33.f.e("value"));
            d43.t tVar = gVar instanceof d43.t ? (d43.t) gVar : null;
            if (tVar != null) {
                T t7 = tVar.f57481a;
                d43.t.b.C1229b c1229b = t7 instanceof d43.t.b.C1229b ? (d43.t.b.C1229b) t7 : null;
                if (c1229b != null) {
                    zR = jVar.r(c1229b.f57502a.f57479a);
                }
            }
        }
        if (zR || jVar.r(bVar)) {
            return;
        }
        this.f142506f.add(new u23.d(this.f142504d.p(), map, this.f142507g));
    }

    @Override // q33.j.a
    public final void g(ArrayList arrayList, x33.f fVar) {
        arrayList.getClass();
        if (fVar == null) {
            return;
        }
        j1 j1VarZ = g8.i.z(fVar, this.f142504d);
        if (j1VarZ != null) {
            d43.i iVar = d43.i.f57483a;
            List listF = w02.b0.f(arrayList);
            n0 type = j1VarZ.getType();
            type.getClass();
            iVar.getClass();
            listF.getClass();
            this.f142502b.put(fVar, new d43.z(listF, type));
            return;
        }
        if (this.f142503c.r(this.f142505e) && p005kotlin.jvm.internal.s.g(fVar.b(), "value")) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof d43.a) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.f142506f.add((u23.c) ((d43.a) it.next()).f57481a);
            }
        }
    }

    @Override // q33.j.a
    public final void h(x33.f fVar, d43.g<?> gVar) {
        if (fVar != null) {
            this.f142502b.put(fVar, gVar);
        }
    }
}

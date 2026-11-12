package l33;

import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p43.c2;
import p43.g2;
import p43.t1;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j33.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f109751i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k33.i f109752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o33.a f109753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o43.k f109754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o43.j f109755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n33.a f109756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o43.j f109757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f109758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f109759h;

    static {
        p005kotlin.jvm.internal.i0 i0Var = new p005kotlin.jvm.internal.i0(i.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        f109751i = new k23.l[]{t0Var.h(i0Var), n23.j.l(i.class, NotificationConstants.KEY_DATA_MIME_TYPE, "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, t0Var), n23.j.l(i.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, t0Var)};
    }

    public i(k33.i iVar, o33.a aVar, boolean z14) {
        iVar.getClass();
        aVar.getClass();
        this.f109752a = iVar;
        this.f109753b = aVar;
        k33.c cVar = iVar.f102785a;
        o43.n nVar = cVar.f102751a;
        this.f109754c = nVar.a(new f(this));
        this.f109755d = nVar.g(new g(this));
        this.f109756e = cVar.f102760j.a(aVar);
        this.f109757f = nVar.g(new h(this));
        this.f109758g = false;
        this.f109759h = z14;
    }

    @Override // j33.g
    public final boolean a() {
        return this.f109758g;
    }

    @Override // u23.c
    public final Map<x33.f, d43.g<?>> b() {
        return (Map) gl1.d.B(this.f109757f, f109751i[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u23.c
    public final x33.c c() {
        k23.l<Object> lVar = f109751i[0];
        o43.k kVar = this.f109754c;
        kVar.getClass();
        lVar.getClass();
        return (x33.c) kVar.invoke();
    }

    public final d43.g<?> d(o33.b bVar) {
        p43.n0 n0VarH;
        if (bVar instanceof z23.a0) {
            return d43.i.f57483a.b(((z23.a0) bVar).f202024c, null);
        }
        if (bVar instanceof o33.l) {
            o33.l lVar = (o33.l) bVar;
            return new d43.k(lVar.b(), lVar.c());
        }
        boolean z14 = bVar instanceof o33.d;
        k33.i iVar = this.f109752a;
        if (z14) {
            o33.d dVar = (o33.d) bVar;
            x33.f name = dVar.getName();
            if (name == null) {
                name = h33.c0.f81420b;
            }
            name.getClass();
            ArrayList elements = dVar.getElements();
            if (!o72.t.R((p43.v0) gl1.d.B(this.f109755d, f109751i[1]))) {
                t23.e eVarD = f43.e.d(this);
                eVarD.getClass();
                j1 j1VarZ = g8.i.z(name, eVarD);
                if (j1VarZ == null || (n0VarH = j1VarZ.getType()) == null) {
                    n0VarH = iVar.f102785a.f102765o.e().h(g2.INVARIANT, r43.l.c(r43.k.F, new String[0]));
                }
                ArrayList arrayList = new ArrayList(p13.y.r(elements, 10));
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    d43.g<?> gVarD = d((o33.b) it.next());
                    if (gVarD == null) {
                        gVarD = new d43.v();
                    }
                    arrayList.add(gVarD);
                }
                d43.i.f57483a.getClass();
                return new d43.z(arrayList, n0VarH);
            }
        } else {
            if (bVar instanceof z23.i) {
                return new d43.a(new i(this.f109752a, new z23.g(((z23.i) bVar).f202051c), false, 4, null));
            }
            if (bVar instanceof o33.g) {
                z23.g0 g0VarA = ((o33.g) bVar).a();
                d43.t.a aVar = d43.t.f57500b;
                p43.n0 n0VarD = iVar.f102788d.d(g0VarA, gg.b.P(c2.COMMON, false, null, 7));
                aVar.getClass();
                if (!o72.t.R(n0VarD)) {
                    p43.n0 type = n0VarD;
                    int i14 = 0;
                    while (p005kotlin.reflect.jvm.internal.impl.builtins.d.z(type)) {
                        type = ((t1) p13.h0.I0(type.D0())).getType();
                        type.getClass();
                        i14++;
                    }
                    t23.h hVarT = type.F0().t();
                    if (hVarT instanceof t23.e) {
                        x33.b bVarF = f43.e.f(hVarT);
                        return bVarF == null ? new d43.t(new d43.t.b.a(n0VarD)) : new d43.t(bVarF, i14);
                    }
                    if (hVarT instanceof t23.d1) {
                        x33.b.a aVar2 = x33.b.f188590d;
                        x33.c cVarI = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105869b.i();
                        aVar2.getClass();
                        return new d43.t(x33.b.a.b(cVarI), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // u23.c
    public final t23.y0 getSource() {
        return this.f109756e;
    }

    @Override // u23.c
    public final p43.n0 getType() {
        return (p43.v0) gl1.d.B(this.f109755d, f109751i[1]);
    }

    public final String toString() {
        return a43.n.f1164b.n(this, null);
    }

    public /* synthetic */ i(k33.i iVar, o33.a aVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(iVar, aVar, (i14 & 4) != 0 ? false : z14);
    }
}

package w23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p43.a2;
import t23.j1;
import t23.k1;

/* JADX INFO: loaded from: classes3.dex */
public class x0 extends z0 implements j1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f181767l = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f181768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f181769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f181770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f181771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p43.n0 f181772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j1 f181773k;

    public static final class b extends x0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int f181774n = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final o13.t f181775m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t23.a aVar, j1 j1Var, int i14, u23.h hVar, x33.f fVar, p43.n0 n0Var, boolean z14, boolean z15, boolean z16, p43.n0 n0Var2, t23.y0 y0Var, e23.a<? extends List<? extends k1>> aVar2) {
            super(aVar, j1Var, i14, hVar, fVar, n0Var, z14, z15, z16, n0Var2, y0Var);
            aVar.getClass();
            hVar.getClass();
            fVar.getClass();
            n0Var.getClass();
            y0Var.getClass();
            aVar2.getClass();
            this.f181775m = o13.m.b(aVar2);
        }

        @Override // w23.x0, t23.j1
        public final j1 w0(r23.e eVar, x33.f fVar, int i14) {
            u23.h annotations = getAnnotations();
            annotations.getClass();
            p43.n0 type = getType();
            type.getClass();
            boolean zH0 = h0();
            t23.y0.a aVar = t23.y0.f162076a;
            aVar.getClass();
            return new b(eVar, null, i14, annotations, fVar, type, zH0, this.f181770h, this.f181771i, this.f181772j, aVar, new y0(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(t23.a aVar, j1 j1Var, int i14, u23.h hVar, x33.f fVar, p43.n0 n0Var, boolean z14, boolean z15, boolean z16, p43.n0 n0Var2, t23.y0 y0Var) {
        super(aVar, hVar, fVar, n0Var, y0Var);
        aVar.getClass();
        hVar.getClass();
        fVar.getClass();
        n0Var.getClass();
        y0Var.getClass();
        this.f181768f = i14;
        this.f181769g = z14;
        this.f181770h = z15;
        this.f181771i = z16;
        this.f181772j = n0Var2;
        this.f181773k = j1Var == null ? this : j1Var;
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.e(this, d14);
    }

    @Override // t23.k1
    public final /* bridge */ /* synthetic */ d43.g Q() {
        return null;
    }

    @Override // t23.j1
    public final p43.n0 R() {
        return this.f181772j;
    }

    @Override // t23.k1
    public final boolean Y() {
        return false;
    }

    @Override // w23.z0, w23.p, w23.o, t23.l
    public final j1 a() {
        j1 j1Var = this.f181773k;
        return j1Var == this ? this : j1Var.a();
    }

    @Override // w23.z0, t23.k1, t23.a1
    public final t23.m b(a2 a2Var) {
        a2Var.getClass();
        if (a2Var.f135795a.e()) {
            return this;
        }
        com.google.protobuf.a.m();
        return null;
    }

    @Override // w23.p, t23.l
    public final t23.a d() {
        t23.l lVarD = super.d();
        lVarD.getClass();
        return (t23.a) lVarD;
    }

    @Override // t23.j1
    public final int getIndex() {
        return this.f181768f;
    }

    @Override // t23.o
    public final t23.r getVisibility() {
        t23.q.i iVar = t23.q.f162051f;
        iVar.getClass();
        return iVar;
    }

    @Override // t23.j1
    public final boolean h0() {
        if (!this.f181769g) {
            return false;
        }
        t23.b.a kind = ((t23.b) d()).getKind();
        kind.getClass();
        return kind != t23.b.a.FAKE_OVERRIDE;
    }

    @Override // w23.z0, t23.a
    public final Collection<j1> o() {
        Collection<? extends t23.a> collectionO = d().o();
        collectionO.getClass();
        Collection<? extends t23.a> collection = collectionO;
        ArrayList arrayList = new ArrayList(p13.y.r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((t23.a) it.next()).f().get(this.f181768f));
        }
        return arrayList;
    }

    @Override // t23.j1
    public final boolean v0() {
        return this.f181771i;
    }

    @Override // t23.j1
    public j1 w0(r23.e eVar, x33.f fVar, int i14) {
        u23.h annotations = getAnnotations();
        annotations.getClass();
        p43.n0 type = getType();
        type.getClass();
        boolean zH0 = h0();
        t23.y0.a aVar = t23.y0.f162076a;
        aVar.getClass();
        return new x0(eVar, null, i14, annotations, fVar, type, zH0, this.f181770h, this.f181771i, this.f181772j, aVar);
    }

    @Override // t23.j1
    public final boolean x0() {
        return this.f181770h;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Override // w23.z0, t23.k1, t23.a1
    public final k1 b(a2 a2Var) {
        a2Var.getClass();
        if (a2Var.f135795a.e()) {
            return this;
        }
        com.google.protobuf.a.m();
        return null;
    }
}

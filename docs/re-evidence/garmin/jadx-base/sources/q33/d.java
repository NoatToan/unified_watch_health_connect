package q33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e<Object, Object> f142447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap<a0, List<Object>> f142448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f142449c;

    public final class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f142450d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, a0 a0Var) {
            super(dVar, a0Var);
            a0Var.getClass();
            this.f142450d = dVar;
        }

        public final x.a c(int i14, x33.b bVar, y23.b bVar2) {
            a0.f142442b.getClass();
            a0 a0VarD = a0.a.d(this.f142451a, i14);
            d dVar = this.f142450d;
            List<Object> arrayList = dVar.f142448b.get(a0VarD);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                dVar.f142448b.put(a0VarD, arrayList);
            }
            return dVar.f142447a.t(bVar, bVar2, arrayList);
        }
    }

    public class b implements x.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f142451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<Object> f142452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f142453c;

        public b(d dVar, a0 a0Var) {
            a0Var.getClass();
            this.f142453c = dVar;
            this.f142451a = a0Var;
            this.f142452b = new ArrayList<>();
        }

        @Override // q33.x.c
        public final void a() {
            ArrayList<Object> arrayList = this.f142452b;
            if (arrayList.isEmpty()) {
                return;
            }
            this.f142453c.f142448b.put(this.f142451a, arrayList);
        }

        @Override // q33.x.c
        public final x.a b(x33.b bVar, y23.b bVar2) {
            return this.f142453c.f142447a.t(bVar, bVar2, this.f142452b);
        }
    }

    public d(e<Object, Object> eVar, HashMap<a0, List<Object>> map, x xVar, HashMap<a0, Object> map2, HashMap<a0, Object> map3) {
        this.f142447a = eVar;
        this.f142448b = map;
        this.f142449c = xVar;
    }

    public final a a(x33.f fVar, String str) {
        fVar.getClass();
        a0.a aVar = a0.f142442b;
        String strB = fVar.b();
        strB.getClass();
        aVar.getClass();
        return new a(this, new a0(strB.concat(str), null));
    }
}

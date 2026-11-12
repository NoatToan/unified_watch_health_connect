package d4;

import com.garmin.android.apps.connectmobile.workouts.data.model.e0;
import e23.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.g1;
import p1.t0;
import p3.h0;
import p3.l0;
import p3.n2;
import p3.o0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\nB1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ld4/d;", "Ld4/c;", "", "", "", "", "", "savedStates", "<init>", "(Ljava/util/Map;)V", "a", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f57433e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f57434f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Object, Map<String, List<Object>>> f57435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0<Object, f> f57436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f57437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l f57438d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"d4/d$b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements h0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f57440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f57441c;

        public b(Object obj, j jVar) {
            this.f57440b = obj;
            this.f57441c = jVar;
        }

        @Override // p3.h0
        public final void dispose() {
            d dVar = d.this;
            t0<Object, f> t0Var = dVar.f57436b;
            Object obj = this.f57440b;
            f fVarK = t0Var.k(obj);
            j jVar = this.f57441c;
            if (fVarK == jVar) {
                Map<Object, Map<String, List<Object>>> map = dVar.f57435a;
                Map<String, List<Object>> mapB = jVar.b();
                if (mapB.isEmpty()) {
                    map.remove(obj);
                } else {
                    map.put(obj, mapB);
                }
            }
        }
    }

    static {
        e0 e0Var = new e0(25);
        com.google.maps.android.compose.clustering.d dVar = new com.google.maps.android.compose.clustering.d(20);
        l lVar = m.f57455a;
        f57434f = new l(e0Var, dVar);
    }

    public d(Map<Object, Map<String, List<Object>>> map) {
        this.f57435a = map;
        this.f57436b = g1.b();
        this.f57438d = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 18);
    }

    @Override // d4.c
    public final void c(Object obj) {
        if (this.f57436b.k(obj) == null) {
            this.f57435a.remove(obj);
        }
    }

    @Override // d4.c
    public final void d(Object obj, p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(533563200);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(obj) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.d(obj);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l lVar = this.f57438d;
                if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                    vb.h.x(org.apache.commons.lang3.e.f("Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.", obj));
                    return;
                }
                Map<String, List<Object>> map = this.f57435a.get(obj);
                y3 y3Var = i.f57449a;
                j jVar = new j(new g(map, lVar));
                o0VarE.K(jVar);
                objQ = jVar;
            }
            j jVar2 = (j) objQ;
            v.b(new n2[]{i.f57449a.c(jVar2), od.a.f131173a.c(jVar2)}, pVar, o0VarE, (i15 & 112) | 8);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(this) | o0VarE.r(obj) | o0VarE.r(jVar2);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ci0.b(this, 5, obj, jVar2);
                o0VarE.K(objQ2);
            }
            l0.a(unit, (e23.l) objQ2, o0VarE);
            o0VarE.p();
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(this, obj, pVar, i14, 7);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld4/d$a;", "", "<init>", "()V", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ d(Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new LinkedHashMap() : map);
    }
}

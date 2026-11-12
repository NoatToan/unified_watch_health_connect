package a61;

import am.x0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La61/i0;", "Lru1/d;", "Lcom/garmin/android/apps/connectmobile/f0;", "La61/a;", "exerciseApi", "<init>", "(La61/a;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i0 implements ru1.d, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1604c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static com.garmin.android.apps.connectmobile.performance.dto.e f1605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static com.garmin.android.apps.connectmobile.repcounting.model.f f1606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Map<String, ? extends Set<com.garmin.android.apps.connectmobile.performance.dto.c>> f1607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static List<fq.a> f1608g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ru1.d f1609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a61.a f1610b;

    static {
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        f1607f = k0Var;
    }

    public /* synthetic */ i0(a61.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (a61.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, a61.a.class, new c83.h.a[0], null, null, null, 120) : aVar);
    }

    @Override // ru1.d
    public final Object b(x0 x0Var, boolean z14, v13.c cVar) {
        return this.f1609a.b(x0Var, z14, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(v13.c cVar) throws Exception {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i14 = j0Var.f1617c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j0Var.f1617c = i14 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object objJ = j0Var.f1615a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j0Var.f1617c;
        if (i15 == 0) {
            o13.r.b(objJ);
            List<fq.a> list = f1608g;
            if (list != null) {
                return list;
            }
            k0 k0Var = new k0(this, null);
            j0Var.f1617c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, k0Var, j0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        T t7 = ((v2.b) v2Var).f47386a;
        f1608g = (List) t7;
        return t7;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(v13.c cVar) throws Exception {
        l0 l0Var;
        Map<String, com.garmin.android.apps.connectmobile.performance.dto.a> mapB;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i14 = l0Var.f1626c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l0Var.f1626c = i14 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        Object objJ = l0Var.f1624a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = l0Var.f1626c;
        if (i15 == 0) {
            o13.r.b(objJ);
            com.garmin.android.apps.connectmobile.performance.dto.e eVar = f1605d;
            if (eVar != null) {
                return eVar;
            }
            m0 m0Var = new m0(this, null);
            l0Var.f1626c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, m0Var, l0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        T t7 = ((v2.b) v2Var).f47386a;
        com.garmin.android.apps.connectmobile.performance.dto.e eVar2 = (com.garmin.android.apps.connectmobile.performance.dto.e) t7;
        f1604c.getClass();
        f1605d = eVar2;
        q13.c cVar2 = new q13.c();
        if (eVar2 != null && (mapB = eVar2.b()) != null) {
            for (Map.Entry<String, com.garmin.android.apps.connectmobile.performance.dto.a> entry : mapB.entrySet()) {
                String key = entry.getKey();
                for (Map.Entry<String, com.garmin.android.apps.connectmobile.performance.dto.b> entry2 : entry.getValue().b().entrySet()) {
                    String key2 = entry2.getKey();
                    for (String str : entry2.getValue().b()) {
                        Object linkedHashSet = cVar2.get(str);
                        if (linkedHashSet == null) {
                            linkedHashSet = new LinkedHashSet();
                            cVar2.put(str, linkedHashSet);
                        }
                        ((Set) linkedHashSet).add(new com.garmin.android.apps.connectmobile.performance.dto.c(key, key2));
                    }
                }
            }
        }
        f1607f = cVar2.b();
        return t7;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(v13.c cVar) throws Exception {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f1640c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f1640c = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objA = n0Var.f1638a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f1640c;
        if (i15 == 0) {
            o13.r.b(objA);
            com.garmin.android.apps.connectmobile.repcounting.model.f fVar = f1606e;
            if (fVar != null) {
                return fVar;
            }
            x0 x0Var = x0.f4309n1;
            n0Var.f1640c = 1;
            objA = ru1.d.a(this, x0Var, n0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        String str = (String) ((v2.b) v2Var).f47386a;
        com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j.getClass();
        com.garmin.android.apps.connectmobile.repcounting.model.f fVarB = com.garmin.android.apps.connectmobile.repcounting.model.d.b.b(str);
        f1606e = fVarB;
        return fVarB;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La61/i0$a;", "", "<init>", "()V", "Lcom/garmin/android/apps/connectmobile/repcounting/model/f;", "cachedExerciseTranslations", "Lcom/garmin/android/apps/connectmobile/repcounting/model/f;", "", "", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/c;", "exercisesUsingPrimaryMuscle", "Ljava/util/Map;", "", "Lfq/a;", "cachedExerciseToEquipmentList", "Ljava/util/List;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static boolean a(com.garmin.android.apps.connectmobile.performance.dto.c cVar, String str) {
            cVar.getClass();
            str.getClass();
            Set<com.garmin.android.apps.connectmobile.performance.dto.c> set = i0.f1607f.get(str);
            if (set == null) {
                return false;
            }
            Set<com.garmin.android.apps.connectmobile.performance.dto.c> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (p005kotlin.jvm.internal.s.g((com.garmin.android.apps.connectmobile.performance.dto.c) it.next(), cVar)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public i0(a61.a aVar) {
        aVar.getClass();
        this.f1609a = (ru1.d) KoinJavaComponent.get$default(ru1.d.class, null, null, 6, null);
        this.f1610b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i0() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

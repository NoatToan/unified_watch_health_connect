package mr;

import am.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lmr/s0;", "", "Lam/x0;", "activityType", "Ljr/d;", "activityTypeConfiguration", "<init>", "(Lam/x0;Ljr/d;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<jr.p> f120303c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr.d f120304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f120305b;

    static {
        new a(null);
        f120303c = p13.x.k(jr.p.GAS_MODE, jr.p.COMMON_TYPE, jr.p.GAS_TYPE, jr.p.GAS_MIXTURE, jr.p.TANK_TYPE, jr.p.TANK_SIZE, jr.p.TANK_START_PRESSURE, jr.p.TANK_END_PRESSURE, jr.p.TANK_USED_PRESSURE, jr.p.GAS_VOLUME, jr.p.PRESSURE_RATE);
    }

    public s0(x0 x0Var, jr.d dVar) {
        x0Var.getClass();
        dVar.getClass();
        this.f120304a = dVar;
        this.f120305b = ge1.b.x(x0Var);
    }

    public static ArrayList a(ArrayList arrayList, jr.j jVar) {
        ArrayList arrayList2;
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            ps.j0 j0Var = (ps.j0) obj;
            String str = jr.k.STAT_SECTION.f100190a;
            List<jr.p> list = f120303c;
            ArrayList arrayList4 = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList4.add(new jr.o(((jr.p) it.next()).f100439a, null, null, null, 14, null));
            }
            Integer gasIndex = j0Var.getGasIndex();
            if (gasIndex != null && gasIndex.intValue() == 0) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList4) {
                    if (((jr.o) obj2).b() != jr.p.COMMON_TYPE) {
                        arrayList5.add(obj2);
                    }
                }
                arrayList2 = arrayList5;
            } else {
                Integer gasIndex2 = j0Var.getGasIndex();
                arrayList2 = (gasIndex2 != null ? gasIndex2.intValue() : 0) > 0 ? arrayList4 : null;
            }
            arrayList3.add(new jr.f(str, new jr.i(false, arrayList2, i14 == 0 ? jVar.f100164a : jr.j.DIVE_GAS.f100164a, null, false, 24, null)));
            i14 = i15;
        }
        return arrayList3;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmr/s0$a;", "", "<init>", "()V", "", "Ljr/p;", "rowsInGasesSection", "Ljava/util/List;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

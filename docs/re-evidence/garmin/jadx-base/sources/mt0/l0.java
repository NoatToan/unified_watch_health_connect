package mt0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/l0;", "Lmt0/b1$c;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 implements b1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.y0<List<ot0.c>> f120696a = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f120697b = new ArrayList();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((com.garmin.android.apps.connectmobile.leaderboard.model.p) t7).getBadgeTargetValue(), ((com.garmin.android.apps.connectmobile.leaderboard.model.p) t14).getBadgeTargetValue());
        }
    }

    @Override // mt0.b1.c
    public final List<com.garmin.android.apps.connectmobile.leaderboard.model.p> a(List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list) {
        list.getClass();
        if (this.f120697b.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) obj;
            ArrayList<ot0.c> arrayList2 = this.f120697b;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                for (ot0.c cVar : arrayList2) {
                    Integer challengeCategoryId = pVar.getChallengeCategoryId();
                    com.garmin.android.apps.connectmobile.leaderboard.model.o oVar = cVar.f133724a;
                    if (p005kotlin.jvm.internal.s.g(challengeCategoryId, oVar != null ? Integer.valueOf(oVar.f38262a) : null)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList3 = this.f120697b;
        ot0.c cVar2 = ot0.c.CLIMBS;
        if (arrayList3.size() != 1 || p13.h0.d0(arrayList3) != cVar2) {
            ArrayList arrayList4 = this.f120697b;
            ot0.c cVar3 = ot0.c.HIKES;
            if (arrayList4.size() != 1 || p13.h0.d0(arrayList4) != cVar3) {
                return arrayList;
            }
        }
        return p13.h0.N0(arrayList, new a());
    }

    @Override // mt0.b1.c
    public final Object b(List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list, t13.d<? super Unit> dVar) {
        ot0.c cVar;
        Set setE = p13.b1.e(ot0.c.ALL);
        for (com.garmin.android.apps.connectmobile.leaderboard.model.p pVar : list) {
            ot0.c[] cVarArrValues = ot0.c.values();
            int length = cVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i14];
                if (cVar.f133724a == pVar.C()) {
                    break;
                }
                i14++;
            }
            if (cVar != null) {
                setE.add(cVar);
            }
        }
        List<ot0.c> listM0 = p13.h0.M0(p13.h0.b1(setE));
        this.f120696a.m(listM0);
        this.f120697b.removeIf(new a73.n(new aq1.d0(listM0, 15), 18));
        return Unit.INSTANCE;
    }
}

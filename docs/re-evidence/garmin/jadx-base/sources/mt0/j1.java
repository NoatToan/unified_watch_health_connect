package mt0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/j1;", "Lmt0/b1$c;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j1 implements b1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.y0<List<ot0.g>> f120665a = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.y0<List<ot0.g>> f120666b = new androidx.lifecycle.y0<>();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120667a;

        static {
            int[] iArr = new int[ot0.g.values().length];
            try {
                iArr[ot0.g.GC_PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f120667a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDataFilter", f = "BadgeChallengeDataFilter.kt", l = {30}, m = "updateAvailableFilters", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f120668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f120669b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f120671d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f120669b = obj;
            this.f120671d |= Integer.MIN_VALUE;
            return j1.this.b(null, this);
        }
    }

    public static boolean c(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, ot0.g gVar) {
        Collection<com.garmin.android.apps.connectmobile.leaderboard.model.o> collectionK;
        if (a.f120667a[gVar.ordinal()] == 1) {
            return pVar.Z0();
        }
        switch (ot0.g.a.f133750a[gVar.ordinal()]) {
            case 1:
                collectionK = p13.j0.f134944a;
                break;
            case 2:
                collectionK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.o.VIRTUAL_CLIMB, com.garmin.android.apps.connectmobile.leaderboard.model.o.VIRTUAL_HIKE);
                break;
            case 3:
                collectionK = p13.w.c(com.garmin.android.apps.connectmobile.leaderboard.model.o.WELLNESS_STEPS_COUNT);
                break;
            case 4:
                collectionK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.o.FITNESS, com.garmin.android.apps.connectmobile.leaderboard.model.o.WELLNESS_STEPS_DISTANCE);
                break;
            case 5:
                collectionK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.o.FITNESS, com.garmin.android.apps.connectmobile.leaderboard.model.o.RUNNING_DISTANCE, com.garmin.android.apps.connectmobile.leaderboard.model.o.TRIATHLON);
                break;
            case 6:
                collectionK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.o.FITNESS, com.garmin.android.apps.connectmobile.leaderboard.model.o.CYCLING_DISTANCE, com.garmin.android.apps.connectmobile.leaderboard.model.o.TRIATHLON);
                break;
            case 7:
                collectionK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.o.FITNESS, com.garmin.android.apps.connectmobile.leaderboard.model.o.STRENGTH);
                break;
            case 8:
                collectionK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.o.FITNESS, com.garmin.android.apps.connectmobile.leaderboard.model.o.SWIMMING_DISTANCE, com.garmin.android.apps.connectmobile.leaderboard.model.o.TRIATHLON);
                break;
            case 9:
                collectionK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.o.FITNESS, com.garmin.android.apps.connectmobile.leaderboard.model.o.HIKING);
                break;
            case 10:
                collectionK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.o.FITNESS, com.garmin.android.apps.connectmobile.leaderboard.model.o.YOGA);
                break;
            case 11:
                collectionK = p13.w.c(com.garmin.android.apps.connectmobile.leaderboard.model.o.SOCIAL);
                break;
            case 12:
                collectionK = p13.w.c(com.garmin.android.apps.connectmobile.leaderboard.model.o.HEALTH_AND_WELLNESS);
                break;
            default:
                collectionK = p13.j0.f134944a;
                break;
        }
        if (collectionK != null && collectionK.isEmpty()) {
            return false;
        }
        for (com.garmin.android.apps.connectmobile.leaderboard.model.o oVar : collectionK) {
            Integer challengeCategoryId = pVar.getChallengeCategoryId();
            int i14 = oVar.f38262a;
            if (challengeCategoryId != null && challengeCategoryId.intValue() == i14) {
                return true;
            }
        }
        return false;
    }

    @Override // mt0.b1.c
    public final List<com.garmin.android.apps.connectmobile.leaderboard.model.p> a(List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list) {
        list.getClass();
        List<ot0.g> listD = this.f120666b.d();
        if (listD == null) {
            listD = p13.j0.f134944a;
        }
        if (listD.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) obj;
            if (!listD.isEmpty()) {
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    if (c(pVar, (ot0.g) it.next())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mt0.b1.c
    public final Object b(List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list, t13.d<? super Unit> dVar) {
        b bVar;
        ArrayList arrayList;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f120671d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f120671d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objL = bVar.f120669b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f120671d;
        if (i15 == 0) {
            o13.r.b(objL);
            w13.c cVar = ot0.g.f133748p;
            ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar2 = new p13.c.b();
            while (bVar2.hasNext()) {
                Object next = bVar2.next();
                ot0.g gVar = (ot0.g) next;
                if (gVar != ot0.g.ALL_CHALLENGES) {
                    Iterator<com.garmin.android.apps.connectmobile.leaderboard.model.p> it = list.iterator();
                    while (it.hasNext()) {
                        if (c(it.next(), gVar)) {
                        }
                    }
                }
                arrayListK.add(next);
            }
            arrayList = new ArrayList(arrayListK);
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            bVar.f120668a = arrayList;
            bVar.f120671d = 1;
            objL = j1Var.l(qVar, bVar);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = bVar.f120668a;
            o13.r.b(objL);
        }
        if (((Boolean) objL).booleanValue()) {
            ot0.g gVar2 = ot0.g.GC_PLUS;
            if (arrayList.contains(gVar2)) {
                arrayList.remove(gVar2);
                arrayList.add(0, gVar2);
                ot0.g gVar3 = ot0.g.ALL_CHALLENGES;
                arrayList.remove(gVar3);
                arrayList.add(0, gVar3);
            }
        }
        this.f120665a.m(arrayList);
        androidx.lifecycle.y0<List<ot0.g>> y0Var = this.f120666b;
        List<ot0.g> listD = y0Var.d();
        ArrayList arrayList2 = listD != null ? new ArrayList(listD) : new ArrayList();
        arrayList2.removeIf(new a73.n(new aq1.d0(arrayList, 16), 19));
        y0Var.m(arrayList2);
        return Unit.INSTANCE;
    }
}

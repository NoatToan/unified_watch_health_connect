package l52;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.w2;

/* JADX INFO: loaded from: classes9.dex */
public final class w {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.a implements e23.l<com.garmin.android.apps.connectmobile.workouts.data.model.j0, com.garmin.android.apps.connectmobile.workouts.data.model.j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f110375a = new a();

        public a() {
            super(1, com.garmin.android.apps.connectmobile.workouts.data.model.j0.class, "copy", "copy(IILcom/garmin/android/apps/connectmobile/workouts/data/model/enums/StepType;IIZLjava/lang/Boolean;ZZLcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutStepDTO$RelativeWeight;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/workouts/data/model/enums/EndConditionType;IDLjava/lang/String;Lcom/garmin/android/apps/connectmobile/workouts/data/model/enums/WorkoutDistanceUnit;Lcom/garmin/android/apps/connectmobile/workouts/data/model/enums/TargetType;DDLcom/garmin/android/apps/connectmobile/workouts/data/model/enums/TargetValueUnit;IIIIIIIDLcom/garmin/android/apps/connectmobile/workouts/data/model/enums/TargetType;DDLcom/garmin/android/apps/connectmobile/workouts/data/model/enums/TargetValueUnit;ILcom/garmin/android/apps/connectmobile/workouts/data/model/enums/SwimStrokeType;ILcom/garmin/android/apps/connectmobile/workouts/data/model/enums/SwimEquipmentType;Lcom/garmin/android/apps/connectmobile/activity/model/enums/DrillType;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lcom/garmin/android/apps/connectmobile/workouts/data/model/AudioNoteDTO;)Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutStepDTO;", 0);
        }

        @Override // e23.l
        public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 invoke(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = j0Var;
            j0Var2.getClass();
            return com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(j0Var2, 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001¨\u0006\u0004"}, d2 = {"l52/w$b", "Ll52/t;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b<E> implements t<com.garmin.android.apps.connectmobile.workouts.data.model.j0, List<? extends E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p13.k<i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> f110376a = new p13.k<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f110377b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<List<E>, i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Unit> f110378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.p<List<E>, i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Unit> f110379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.p<List<E>, i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Unit> f110380e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.p<? super List<E>, ? super i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Unit> pVar, e23.p<? super List<E>, ? super i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Unit> pVar2, e23.p<? super List<E>, ? super i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Unit> pVar3) {
            this.f110378c = pVar;
            this.f110379d = pVar2;
            this.f110380e = pVar3;
        }

        @Override // l52.t
        public final void a(f.e eVar) {
            while (true) {
                p13.k<i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> kVar = this.f110376a;
                i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVarH = kVar.h();
                ArrayList arrayList = this.f110377b;
                if (aVarH == null) {
                    int i14 = o13.q.f128596b;
                    eVar.a(arrayList);
                    return;
                } else {
                    this.f110380e.invoke(arrayList, aVarH);
                    kVar.removeLast();
                }
            }
        }

        @Override // l52.t
        public final void b(f.e eVar, i.a aVar) {
            p13.k<i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> kVar;
            ArrayList arrayList;
            while (true) {
                kVar = this.f110376a;
                i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVarH = kVar.h();
                arrayList = this.f110377b;
                if (aVarH == null || aVarH.d(aVar)) {
                    break;
                }
                this.f110380e.invoke(arrayList, aVarH);
                kVar.removeLast();
            }
            if (aVar.k()) {
                this.f110378c.invoke(arrayList, aVar);
            } else {
                this.f110379d.invoke(arrayList, aVar);
                kVar.addLast(aVar);
            }
        }
    }

    public static final void a(e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVar, List<? extends e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> list) {
        eVar.getClass();
        list.getClass();
        w2 w2Var = new w2(23);
        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
        o.a(eVar, h.PRE_ORDER, new hc0.c(23, w2Var, p0Var));
        int i14 = p0Var.f105807a;
        e.b<T> bVarK1 = eVar.K1();
        if (i14 == 1 && bVarK1 != 0) {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) bVarK1.getData();
            if ((j0Var != null ? j0Var.f48217c : null) == m52.d.COOL_DOWN) {
                bVarK1.i(new aq1.d0(list, 13));
                return;
            }
        }
        eVar.j2(new aq1.d0(list, 14));
    }

    public static final e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> b(i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar) {
        iVar.getClass();
        return iVar.L1(a.f110375a);
    }

    public static final <E> List<E> c(i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar, e23.p<? super List<E>, ? super i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Unit> pVar, e23.p<? super List<E>, ? super i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Unit> pVar2, e23.p<? super List<E>, ? super i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Unit> pVar3) {
        iVar.getClass();
        Object objB = iVar.b(h.PRE_ORDER, new b(pVar, pVar2, pVar3));
        p13.j0 j0Var = p13.j0.f134944a;
        int i14 = o13.q.f128596b;
        if (objB instanceof o13.q.b) {
            objB = j0Var;
        }
        return (List) objB;
    }

    public static final boolean d(i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar, m52.k kVar) {
        iVar.getClass();
        kVar.getClass();
        if (!k52.g.b().contains(kVar)) {
            return true;
        }
        Object objB = o.b(iVar, h.PRE_ORDER, new v(0, kVar));
        int i14 = o13.q.f128596b;
        if (objB instanceof o13.q.b) {
            objB = null;
        }
        Boolean bool = (Boolean) objB;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}

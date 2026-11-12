package t61;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectViewModel$getActivitiesSummary$2", f = "TrainingEffectViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super List<? extends v2<? extends String>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f162781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f162782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o61.l f162783d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectViewModel$getActivitiesSummary$2$1$1", f = "TrainingEffectViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f162784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f162785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f162786c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f162785b = rVar;
            this.f162786c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f162785b, this.f162786c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends String>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f162784a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p61.e eVar = this.f162785b.f162796a;
            this.f162784a = 1;
            eVar.getClass();
            Object objJ = f0.J(eVar, new p61.c(eVar, this.f162786c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, o61.l lVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f162782c = rVar;
        this.f162783d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f162782c, this.f162783d, dVar);
        oVar.f162781b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends v2<? extends String>>> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [p13.j0] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? arrayList;
        b0 b0Var = (b0) this.f162781b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162780a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        r rVar = this.f162782c;
        rVar.getClass();
        o61.l lVar = this.f162783d;
        if (lVar == null) {
            arrayList = j0.f134944a;
        } else {
            double d14 = lVar.f129606b;
            double d15 = lVar.f129607c;
            List<o61.k> list = lVar.f129605a;
            ArrayList<o61.k> arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                o61.k kVar = (o61.k) obj2;
                if (s.c(kVar != null ? kVar.getAerobicValue() : null, d14) && s.c(kVar.getAnaerobicValue(), d15)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = new ArrayList();
            for (o61.k kVar2 : arrayList2) {
                String activityId = kVar2 != null ? kVar2.getActivityId() : null;
                if (activityId != null) {
                    arrayList.add(activityId);
                }
            }
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList3 = new ArrayList(y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList3.add(ge1.b.j(b0Var, null, null, new a(rVar, (String) it.next(), null), 3));
        }
        this.f162781b = null;
        this.f162780a = 1;
        Object objO = g8.i.o(arrayList3, this);
        return objO == aVar ? aVar : objO;
    }
}

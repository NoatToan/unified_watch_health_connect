package hq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseViewModel$getRecentExercisesByDB$1", f = "SelectExerciseViewModel.kt", l = {393, 394, 396, 397}, m = "invokeSuspend", v = 2)
public final class z0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecentSelectedExercisesDatabase f85196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f85198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.stats.exercises.c f85199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar, t13.d<? super z0> dVar) {
        super(2, dVar);
        this.f85198c = context;
        this.f85199d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z0(this.f85198c, this.f85199d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[PHI: r1
      0x0085: PHI (r1v4 com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase) = 
      (r1v3 com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase)
      (r1v16 com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase)
     binds: [B:26:0x0082, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r12 == r0) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RecentSelectedExercisesDatabase recentSelectedExercisesDatabaseA;
        List<iq.c> list;
        ArrayList arrayList;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f85197b;
        Context context = this.f85198c;
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar2 = this.f85199d;
        if (i14 == 0) {
            o13.r.b(obj);
            RecentSelectedExercisesDatabase.f29919a.getClass();
            recentSelectedExercisesDatabaseA = RecentSelectedExercisesDatabase.a.a(context);
            this.f85196a = recentSelectedExercisesDatabaseA;
            this.f85197b = 1;
            Object objB = recentSelectedExercisesDatabaseA.e().b(DateTime.now().minusDays(90).getMillis(), this);
            if (objB != aVar) {
                objB = Unit.INSTANCE;
            }
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            recentSelectedExercisesDatabaseA = this.f85196a;
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                recentSelectedExercisesDatabaseA = this.f85196a;
                o13.r.b(obj);
                list = (List) obj;
                if (list.isEmpty()) {
                    this.f85196a = recentSelectedExercisesDatabaseA;
                    this.f85197b = 3;
                    if (com.garmin.android.apps.connectmobile.activities.stats.exercises.c.x4(cVar2, context, this) != aVar) {
                        iq.a aVarE = recentSelectedExercisesDatabaseA.e();
                        this.f85196a = null;
                        this.f85197b = 4;
                        obj = aVarE.a(this);
                    }
                    return aVar;
                }
                arrayList = new ArrayList();
                for (iq.c cVar3 : list) {
                    cVar = cVar2.f29896m;
                    if (cVar != null) {
                        dVarD = cVar.D(cVar3.f94727b, cVar3.f94731f);
                    } else {
                        dVarD = null;
                    }
                    if (dVarD != null) {
                        arrayList.add(dVarD);
                    }
                }
                cVar2.f29898o = new com.garmin.android.apps.connectmobile.repcounting.model.c((com.garmin.android.apps.connectmobile.repcounting.model.d[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                return Unit.INSTANCE;
            }
            if (i14 == 3) {
                recentSelectedExercisesDatabaseA = this.f85196a;
                o13.r.b(obj);
                iq.a aVarE2 = recentSelectedExercisesDatabaseA.e();
                this.f85196a = null;
                this.f85197b = 4;
                obj = aVarE2.a(this);
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        list = (List) obj;
        arrayList = new ArrayList();
        while (r12.hasNext()) {
            cVar = cVar2.f29896m;
            if (cVar != null) {
                dVarD = cVar.D(cVar3.f94727b, cVar3.f94731f);
            } else {
                dVarD = null;
            }
            if (dVarD != null) {
                arrayList.add(dVarD);
            }
        }
        cVar2.f29898o = new com.garmin.android.apps.connectmobile.repcounting.model.c((com.garmin.android.apps.connectmobile.repcounting.model.d[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
        return Unit.INSTANCE;
        iq.a aVarE3 = recentSelectedExercisesDatabaseA.e();
        this.f85196a = recentSelectedExercisesDatabaseA;
        this.f85197b = 2;
        obj = aVarE3.a(this);
        if (obj != aVar) {
            list = (List) obj;
            if (list.isEmpty()) {
                this.f85196a = recentSelectedExercisesDatabaseA;
                this.f85197b = 3;
                if (com.garmin.android.apps.connectmobile.activities.stats.exercises.c.x4(cVar2, context, this) != aVar) {
                    iq.a aVarE4 = recentSelectedExercisesDatabaseA.e();
                    this.f85196a = null;
                    this.f85197b = 4;
                    obj = aVarE4.a(this);
                }
            }
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                cVar = cVar2.f29896m;
                if (cVar != null) {
                    dVarD = cVar.D(cVar3.f94727b, cVar3.f94731f);
                } else {
                    dVarD = null;
                }
                if (dVarD != null) {
                    arrayList.add(dVarD);
                }
            }
            cVar2.f29898o = new com.garmin.android.apps.connectmobile.repcounting.model.c((com.garmin.android.apps.connectmobile.repcounting.model.d[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
            return Unit.INSTANCE;
        }
        return aVar;
    }
}

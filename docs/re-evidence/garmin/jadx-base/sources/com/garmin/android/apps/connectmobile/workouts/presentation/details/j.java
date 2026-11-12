package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import c22.j0;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.TrainingPlanSearchResultsDTO;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$fetchActiveTrainingPlan$1", f = "WorkoutDetailsViewModel.kt", l = {979, 980, 982, 986}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f48700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f48701d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j8, f fVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f48700c = j8;
        this.f48701d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f48700c, this.f48701d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (v52.d.d(r1, r5, r11) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r12.h(r1, r11) == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strB;
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48699b;
        long j8 = this.f48700c;
        f fVar = this.f48701d;
        if (i14 == 0) {
            o13.r.b(obj);
            strB = j0.b(new DateTime(j8), "yyyy-MM-dd", null);
            q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
            v52.c.b bVar = v52.c.b.f175759a;
            this.f48698a = strB;
            this.f48699b = 1;
            if (wVar.h(bVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            strB = this.f48698a;
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                q53.w<v52.c<? extends d>> wVar2 = fVar.f48598k0;
                d.f fVar2 = new d.f((TrainingPlanSearchResultsDTO) ((v2.b) v2Var).f47386a, j8);
                this.f48698a = null;
                this.f48699b = 3;
            } else {
                q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                v52.c.a aVar2 = new v52.c.a(null, 1, null);
                this.f48698a = null;
                this.f48699b = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        if (strB != null) {
            l52.y yVar = fVar.f48588b;
            this.f48698a = null;
            this.f48699b = 2;
            obj = yVar.c0(strB, this);
        } else {
            v2Var = null;
            if (v2Var instanceof v2.b) {
                q53.w<v52.c<? extends d>> wVar4 = fVar.f48598k0;
                d.f fVar3 = new d.f((TrainingPlanSearchResultsDTO) ((v2.b) v2Var).f47386a, j8);
                this.f48698a = null;
                this.f48699b = 3;
            } else {
                q53.w<v52.c<? extends d>> wVar5 = fVar.f48598k0;
                v52.c.a aVar3 = new v52.c.a(null, 1, null);
                this.f48698a = null;
                this.f48699b = 4;
            }
        }
        return aVar;
    }
}

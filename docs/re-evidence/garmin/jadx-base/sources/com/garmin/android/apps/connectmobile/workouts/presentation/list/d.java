package com.garmin.android.apps.connectmobile.workouts.presentation.list;

import androidx.lifecycle.y0;
import c22.j0;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.TrainingPlanSearchResultsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import h62.l;
import h62.m;
import l52.y;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListViewModel$getActiveTrainingPlan$1", f = "WorkoutListViewModel.kt", l = {186, PsExtractor.PRIVATE_STREAM_1, 193}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f49441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f49442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WorkoutDTO f49443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, long j8, WorkoutDTO workoutDTO, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f49441b = mVar;
        this.f49442c = j8;
        this.f49443d = workoutDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f49441b, this.f49442c, this.f49443d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r1.emit(r2, r10) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49440a;
        long j8 = this.f49442c;
        m mVar = this.f49441b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2 && i14 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        y0<l> y0Var = mVar.f82251c;
        l lVarD = y0Var.d();
        y0Var.j(lVarD != null ? l.a(lVarD, true, null, null, 6) : null);
        String strB = j0.b(new DateTime(j8), "yyyy-MM-dd", null);
        if (strB != null) {
            y yVar = mVar.f82249a;
            this.f49440a = 1;
            obj = yVar.c0(strB, this);
        } else {
            v2Var = null;
            if (v2Var instanceof v2.b) {
                y0<l> y0Var2 = mVar.f82251c;
                l lVarD2 = y0Var2.d();
                y0Var2.j(lVarD2 != null ? l.a(lVarD2, false, null, null, 6) : null);
                e2 e2Var = mVar.f82253e;
                e.d dVar = new e.d((TrainingPlanSearchResultsDTO) ((v2.b) v2Var).f47386a, this.f49443d, j8);
                this.f49440a = 2;
            } else {
                y0<l> y0Var3 = mVar.f82251c;
                l lVarD3 = y0Var3.d();
                y0Var3.j(lVarD3 != null ? l.a(lVarD3, false, null, null, 6) : null);
                e2 e2Var2 = mVar.f82253e;
                e.c cVar = e.c.f49446a;
                this.f49440a = 3;
            }
        }
        return aVar;
        v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            y0<l> y0Var4 = mVar.f82251c;
            l lVarD4 = y0Var4.d();
            y0Var4.j(lVarD4 != null ? l.a(lVarD4, false, null, null, 6) : null);
            e2 e2Var3 = mVar.f82253e;
            e.d dVar2 = new e.d((TrainingPlanSearchResultsDTO) ((v2.b) v2Var).f47386a, this.f49443d, j8);
            this.f49440a = 2;
        } else {
            y0<l> y0Var5 = mVar.f82251c;
            l lVarD5 = y0Var5.d();
            y0Var5.j(lVarD5 != null ? l.a(lVarD5, false, null, null, 6) : null);
            e2 e2Var4 = mVar.f82253e;
            e.c cVar2 = e.c.f49446a;
            this.f49440a = 3;
        }
    }
}

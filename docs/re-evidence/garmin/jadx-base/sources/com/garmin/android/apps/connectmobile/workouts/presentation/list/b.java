package com.garmin.android.apps.connectmobile.workouts.presentation.list;

import android.content.Context;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import e23.p;
import h62.l;
import h62.m;
import java.util.Arrays;
import l52.y;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import r53.e2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListViewModel$copyWorkout$1", f = "WorkoutListViewModel.kt", l = {133, 137, 141}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f49433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f49434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WorkoutDTO f49435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, Context context, WorkoutDTO workoutDTO, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f49433b = mVar;
        this.f49434c = context;
        this.f49435d = workoutDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f49433b, this.f49434c, this.f49435d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (r1.emit(r2, r11) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        if (r12.emit(r1, r11) == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49432a;
        m mVar = this.f49433b;
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
        x0 x0Var = x0.f105818a;
        String string = this.f49434c.getString(R.string.workout_duplicate_default_format);
        string.getClass();
        WorkoutDTO workoutDTO = this.f49435d;
        String str = String.format(string, Arrays.copyOf(new Object[]{workoutDTO.f48041b}, 1));
        y yVar = mVar.f82249a;
        long j8 = workoutDTO.f48040a;
        this.f49432a = 1;
        obj = yVar.T(j8, str, this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            i62.p pVar = i62.p.f91878a;
            WorkoutDetailsDTO workoutDetailsDTO = (WorkoutDetailsDTO) ((v2.b) v2Var).f47386a;
            String str2 = workoutDetailsDTO.E;
            Long l14 = new Long(workoutDetailsDTO.f48040a);
            pVar.getClass();
            i62.p.a(l14, str2);
            y0<l> y0Var2 = mVar.f82251c;
            l lVarD2 = y0Var2.d();
            y0Var2.j(lVarD2 != null ? l.a(lVarD2, false, null, null, 6) : null);
            e2 e2Var = mVar.f82253e;
            e.b bVar = new e.b(workoutDetailsDTO.f48040a);
            this.f49432a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0<l> y0Var3 = mVar.f82251c;
            l lVarD3 = y0Var3.d();
            y0Var3.j(lVarD3 != null ? l.a(lVarD3, false, null, null, 6) : null);
            e2 e2Var2 = mVar.f82253e;
            e.c cVar = e.c.f49446a;
            this.f49432a = 3;
        }
    }
}

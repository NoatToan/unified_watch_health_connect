package com.garmin.android.apps.connectmobile.workouts.presentation.list;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import h62.l;
import h62.m;
import l52.y;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListViewModel$deleteWorkout$1", f = "WorkoutListViewModel.kt", l = {150, 154, 158}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f49437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f49438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f49439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, long j8, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f49437b = mVar;
        this.f49438c = j8;
        this.f49439d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f49437b, this.f49438c, this.f49439d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L35;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49436a;
        long j8 = this.f49438c;
        m mVar = this.f49437b;
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
        y yVar = mVar.f82249a;
        this.f49436a = 1;
        obj = yVar.o(j8, this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            i62.p.f91878a.getClass();
            i62.p.b(j8, this.f49439d);
            y0<l> y0Var2 = mVar.f82251c;
            l lVarD2 = y0Var2.d();
            y0Var2.j(lVarD2 != null ? l.a(lVarD2, false, null, null, 6) : null);
            e2 e2Var = mVar.f82255g;
            Unit unit = Unit.INSTANCE;
            this.f49436a = 2;
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
            this.f49436a = 3;
        }
    }
}

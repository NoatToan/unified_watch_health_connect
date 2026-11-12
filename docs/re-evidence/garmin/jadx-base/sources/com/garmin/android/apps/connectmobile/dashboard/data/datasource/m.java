package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.ActivityPolylineDataSourceImpl$getActivityDetails$2", f = "ActivityPolylineDataSourceImpl.kt", l = {148}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super c83.a0<ActivityDetailChartDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f33268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f33269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, long j8, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f33268b = kVar;
        this.f33269c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f33268b, this.f33269c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ActivityDetailChartDTO>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33267a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0 i0VarF = am.b2.f(this.f33268b.f33250d, this.f33269c, new Integer(1400), null, new Integer(0), 4);
        this.f33267a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

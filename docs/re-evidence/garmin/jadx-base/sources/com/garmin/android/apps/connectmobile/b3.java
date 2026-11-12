package com.garmin.android.apps.connectmobile;

import com.garmin.android.apps.connectmobile.performance.trainingload.model.ExerciseLoadRecordDto;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/performance/trainingload/model/ExerciseLoadRecordDto;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.StatisticsRepo$fetchActivityStatsWithTrainingLoad$2", f = "StatisticsRepo.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class b3 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ExerciseLoadRecordDto>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f30317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f30319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f30320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f30321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(z2 z2Var, String str, String str2, List<String> list, boolean z14, t13.d<? super b3> dVar) {
        super(1, dVar);
        this.f30317b = z2Var;
        this.f30318c = str;
        this.f30319d = str2;
        this.f30320e = list;
        this.f30321f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b3(this.f30317b, this.f30318c, this.f30319d, this.f30320e, this.f30321f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends ExerciseLoadRecordDto>>> dVar) {
        return ((b3) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f30316a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<ExerciseLoadRecordDto>>> i0VarA = this.f30317b.f49780a.a(this.f30318c, this.f30319d, this.f30320e, this.f30321f);
        this.f30316a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

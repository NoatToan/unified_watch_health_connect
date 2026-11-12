package ow1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tw1.m;
import uw1.g;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/m;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.training.itp.ScheduleViewModel$getTrainingPlan$1", f = "ScheduleViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super v2<? extends m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f134298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f134299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, long j8, t13.d<? super c> dVar2) {
        super(1, dVar2);
        this.f134298b = dVar;
        this.f134299c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f134298b, this.f134299c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends m>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134297a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        uw1.b bVar = this.f134298b.f134300a;
        this.f134297a = 1;
        bVar.getClass();
        Object objJ = f0.J(bVar, new g(this.f134299c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

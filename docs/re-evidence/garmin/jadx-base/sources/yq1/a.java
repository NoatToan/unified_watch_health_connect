package yq1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lzk0/c;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.viewmodel.StepsGoalViewModel$fetchStepsGoal$1", f = "StepsGoalViewModel.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class a extends i implements l<t13.d<? super v2<? extends zk0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f198786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(1, dVar);
        this.f198786b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a(this.f198786b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends zk0.c>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198785a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        al0.a aVar2 = this.f198786b.f198790a;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        this.f198785a = 1;
        aVar2.getClass();
        Object objJ = f0.J(aVar2, new al0.d(aVar2, dateTimeNow, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

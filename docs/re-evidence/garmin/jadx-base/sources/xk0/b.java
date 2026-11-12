package xk0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lzk0/c;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.goals.WellnessGoalsViewModel$getUserStepsGoal$1", f = "WellnessGoalsViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super v2<? extends zk0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f191193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f191193b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f191193b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends zk0.c>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191192a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        al0.a aVar2 = this.f191193b.f191210b;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        this.f191192a = 1;
        aVar2.getClass();
        Object objJ = f0.J(aVar2, new al0.d(aVar2, dateTimeNow, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

package d52;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lzk0/a;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesGoalViewModel$savePushesGoal$1", f = "PushesGoalViewModel.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super v2<? extends zk0.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f57573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zk0.b f57574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, zk0.b bVar, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f57573b = hVar;
        this.f57574c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f57573b, this.f57574c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends zk0.a>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57572a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        al0.a aVar2 = this.f57573b.f57575a;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        this.f57572a = 1;
        aVar2.getClass();
        Object objJ = f0.J(aVar2, new al0.j(aVar2, dateTimeNow, this.f57574c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

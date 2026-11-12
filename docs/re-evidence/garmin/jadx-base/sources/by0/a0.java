package by0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo53/b0;", "", "fetchStart", "fetchLimit", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<anonymous>", "(Lo53/b0;II)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getMultiDayActivityTimelineSummaries$result$1", f = "MultiDayActivityDataSource.kt", l = {185}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.r<o53.b0, Integer, Integer, t13.d<? super List<? extends ActivityListItemDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ o53.b0 f21691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f21692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f21693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f21694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f21695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f21696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oy0.i f21697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(a aVar, String str, String str2, oy0.i iVar, t13.d<? super a0> dVar) {
        super(4, dVar);
        this.f21694e = aVar;
        this.f21695f = str;
        this.f21696g = str2;
        this.f21697h = iVar;
    }

    @Override // e23.r
    public final Object invoke(o53.b0 b0Var, Integer num, Integer num2, t13.d<? super List<? extends ActivityListItemDTO>> dVar) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        String str = this.f21696g;
        oy0.i iVar = this.f21697h;
        a0 a0Var = new a0(this.f21694e, this.f21695f, str, iVar, dVar);
        a0Var.f21691b = b0Var;
        a0Var.f21692c = iIntValue;
        a0Var.f21693d = iIntValue2;
        return a0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = this.f21691b;
        int i14 = this.f21692c;
        int i15 = this.f21693d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f21690a;
        if (i16 == 0) {
            o13.r.b(obj);
            int i17 = a.f21686d;
            ey0.g0 g0VarP = this.f21694e.p();
            this.f21691b = b0Var;
            this.f21692c = i14;
            this.f21693d = i15;
            this.f21690a = 1;
            g0VarP.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.x(g0VarP, this.f21695f, this.f21696g, this.f21697h, i14, i15, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            T t7 = ((v2.b) v2Var).f47386a;
            String strF = e5.f(t7, "GetMultiDayActivityTimelineSummaries - Result Success - activityList:");
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return (List) t7;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetMultiDayActivityTimelineSummaries - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return p13.j0.f134944a;
    }
}

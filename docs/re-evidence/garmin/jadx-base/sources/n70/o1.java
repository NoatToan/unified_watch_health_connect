package n70;

import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "dismissedCards", "Ln70/p1$a;", "deviceInfo", "Lj70/d;", "dashboardCardData", "", "<anonymous>", "(Ljava/util/List;Ln70/p1$a;Lj70/d;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDeviceSyncStateUseCase$invoke$1", f = "GetDeviceSyncStateUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o1 extends v13.i implements e23.r<List<? extends String>, p1.a, j70.d<String>, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f124447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ p1.a f124448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ j70.d f124449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f124450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(n1 n1Var, t13.d<? super o1> dVar) {
        super(4, dVar);
        this.f124450d = n1Var;
    }

    @Override // e23.r
    public final Object invoke(List<? extends String> list, p1.a aVar, j70.d<String> dVar, t13.d<? super Boolean> dVar2) {
        o1 o1Var = new o1(this.f124450d, dVar2);
        o1Var.f124447a = list;
        o1Var.f124448b = aVar;
        o1Var.f124449c = dVar;
        return o1Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        Boolean includesWellnessData;
        Boolean includesActivityData;
        List list = this.f124447a;
        p1.a aVar = this.f124448b;
        j70.d dVar = this.f124449c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (aVar.f124475b.f34316a == null) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetNoSyncStateUseCase", "NO_SYNC is hidden for today -  user has no device");
            return Boolean.FALSE;
        }
        yz1.u uVar = dVar.f97520a.f200298a;
        if (uVar == yz1.u.LOADING || uVar == yz1.u.ERROR) {
            return Boolean.FALSE;
        }
        ae0.b bVar = this.f124450d.f124429b;
        String str = (String) dVar.f97521b;
        Object obj2 = null;
        for (Object obj3 : ae0.b.a(str, null)) {
            if (g22.k.g(((hs1.d) obj3).b(), LocalDate.now())) {
                obj2 = obj3;
                break;
            }
        }
        hs1.d dVar2 = (hs1.d) obj2;
        boolean z15 = false;
        if ((dVar2 == null || (includesActivityData = dVar2.getIncludesActivityData()) == null) ? false : includesActivityData.booleanValue()) {
            z14 = true;
        } else if ((dVar2 == null || (includesWellnessData = dVar2.getIncludesWellnessData()) == null) ? false : includesWellnessData.booleanValue()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || list.contains(o70.f.DEVICE_SYNC.f129989a)) {
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "GetNoSyncStateUseCase", "NO_SYNC is hidden for today");
        } else {
            z15 = true;
        }
        return Boolean.valueOf(z15);
    }
}

package cp1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p13.y;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lyo1/c;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewViewModel$fetchAwardsForPromotion$2", f = "GroupRideAwardsWhatsNewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<v2<? extends List<? extends yo1.c>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b f54910b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b bVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f54910b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f54910b, dVar);
        hVar.f54909a = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends List<? extends yo1.c>> v2Var, t13.d<? super Unit> dVar) {
        return ((h) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        v2 v2Var = (v2) this.f54909a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        boolean z14 = v2Var instanceof v2.b;
        com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b bVar = this.f54910b;
        if (z14) {
            List list = (List) ((v2.b) v2Var).f47386a;
            if (list != null) {
                List listK = x.k(new Integer(wo1.b.TRY_HARD.f186455a), new Integer(wo1.b.CHILLIN_OUT.f186455a), new Integer(wo1.b.BREAK_TIME.f186455a), new Integer(wo1.b.SUNDAY_DRIVER.f186455a), new Integer(wo1.b.HUMMINGBIRD.f186455a), new Integer(wo1.b.WELL_BALANCED.f186455a), new Integer(wo1.b.SHIFTY.f186455a));
                ArrayList<yo1.c> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (listK.contains(new Integer(((yo1.c) obj2).getAwardTypeId()))) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                for (yo1.c cVar : arrayList) {
                    String title = cVar.getTitle();
                    if (title == null) {
                        title = cVar.getName();
                    }
                    String description = cVar.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    arrayList2.add(new j(title, description, cVar.getImageURL()));
                }
                p2 p2Var = bVar.f44751a;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, b.a((b) value, false, arrayList2, 1)));
            } else {
                bVar.getClass();
                ge1.b.T(v1.a(bVar), null, null, new f(bVar, com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.a.C0850a.f44750a, null), 3);
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            bVar.getClass();
            ge1.b.T(v1.a(bVar), null, null, new f(bVar, com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.a.C0850a.f44750a, null), 3);
        }
        return Unit.INSTANCE;
    }
}

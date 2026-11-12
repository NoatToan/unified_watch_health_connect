package qr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lyo1/f;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getSocialGroupRideCompetitionsResults$2", f = "ActivityDetailsViewModel.kt", l = {5976}, m = "invokeSuspend", v = 2)
public final class w3 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends yo1.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f146809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f146810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(t tVar, t13.d<? super w3> dVar) {
        super(2, dVar);
        this.f146810c = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w3 w3Var = new w3(this.f146810c, dVar);
        w3Var.f146809b = obj;
        return w3Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends yo1.f> v2Var, t13.d<? super Unit> dVar) {
        return ((w3) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146809b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146808a;
        t tVar = this.f146810c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                List<yo1.d> listD = ((yo1.f) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).d();
                ArrayList arrayList = new ArrayList(p13.y.r(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    List<yo1.e> listF = ((yo1.d) it.next()).f();
                    ArrayList arrayList2 = new ArrayList(p13.y.r(listF, 10));
                    Iterator<T> it3 = listF.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(String.valueOf(((yo1.e) it3.next()).getUserPk()));
                    }
                    arrayList.add(arrayList2);
                }
                ArrayList arrayListS = p13.y.s(arrayList);
                a22.i iVar = tVar.f146522h;
                List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                this.f146809b = v2Var;
                this.f146808a = 1;
                obj = iVar.a(arrayListS, listC, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strN = fb1.c.n("Error  fetching group ride competitions results: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        Map map = (Map) obj;
        com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
        Iterator<T> it4 = ((yo1.f) bVar.f47386a).d().iterator();
        while (it4.hasNext()) {
            for (yo1.e eVar : ((yo1.d) it4.next()).f()) {
                com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l((int) eVar.getUserPk(), map);
                eVar.f198450o = (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46879h;
            }
        }
        int i15 = t.A2;
        ((r53.z1) tVar.B1.getValue()).setValue(bVar.f47386a);
        return Unit.INSTANCE;
    }
}

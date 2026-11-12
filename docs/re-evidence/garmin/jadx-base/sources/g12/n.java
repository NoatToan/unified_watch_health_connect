package g12;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import org.json.JSONException;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.UserProfileViewModel$fetchActivitiesWithSocialInfo$1", f = "UserProfileViewModel.kt", l = {328}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f74902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.i f74904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f74905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f74906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f74907f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.garmin.android.apps.connectmobile.userprofile.i iVar, String str, int i14, int i15, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f74904c = iVar;
        this.f74905d = str;
        this.f74906e = i14;
        this.f74907f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f74904c, this.f74905d, this.f74906e, this.f74907f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        Object pVar;
        ActivityListItemDTO activityListItemDTO;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f74903b;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.userprofile.i iVar = this.f74904c;
            y0Var = iVar.f46762n;
            m12.e eVar = (m12.e) iVar.f46755g.getValue();
            this.f74902a = y0Var;
            this.f74903b = 1;
            eVar.getClass();
            String str = this.f74905d;
            if (str == null) {
                a2 a2Var = a2.USER;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "GetActivityListWithSocialInfoUseCase", "Invalid display name");
                pVar = new zy0.p(new v2.a(new Exception("Invalid display name"), null, null, 6, null), zy0.c.SERVER);
            } else {
                c22.o oVar = (c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
                int i15 = this.f74906e;
                int i16 = this.f74907f;
                m12.e.a aVar2 = new m12.e.a(str, i15, i16);
                m12.h hVar = new m12.h(eVar, str, i15, i16, null);
                if (oVar.a()) {
                    pVar = eVar.a(hVar, aVar2, this);
                } else {
                    String strC = aVar2.c();
                    m12.g gVar = new m12.g();
                    if (strC != null) {
                        try {
                            List<bb2.h> list = (List) new Gson().fromJson(strC, gVar);
                            if (list != null) {
                                ArrayList arrayList = new ArrayList();
                                for (bb2.h hVar2 : list) {
                                    hVar2.getClass();
                                    try {
                                        activityListItemDTO = new ActivityListItemDTO();
                                        activityListItemDTO.m(hVar2.f17358d);
                                    } catch (JSONException unused) {
                                        i2.d("ActivitySummaryDMO", "Failed to parse cache string to ActivityListItemDTO: " + hVar2.f17358d);
                                        activityListItemDTO = null;
                                    }
                                    if (activityListItemDTO != null) {
                                        arrayList.add(activityListItemDTO);
                                    }
                                }
                                pVar = new zy0.p(new v2.b(arrayList, 200, null, null, 12, null), zy0.c.CACHE);
                            } else {
                                pVar = new zy0.p(new v2.a(new Exception("No data"), null, null, 6, null), zy0.c.CACHE);
                            }
                        } catch (Exception e4) {
                            a2 a2Var2 = a2.USER;
                            String strN = fb1.c.n("Error while fetching activity list: ", e4.getMessage());
                            i2.f36769a.getClass();
                            i2.a.f(a2Var2, "GetActivityListWithSocialInfoUseCase", strN);
                            pVar = new zy0.p(new v2.a(e4, null, null, 6, null), zy0.c.CACHE);
                        }
                    } else {
                        pVar = new zy0.p(new v2.a(new Exception("No data"), null, null, 6, null), zy0.c.CACHE);
                    }
                }
            }
            if (pVar == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0 y0Var2 = this.f74902a;
            o13.r.b(obj);
            y0Var = y0Var2;
            pVar = obj;
        }
        y0Var.j(pVar);
        return Unit.INSTANCE;
    }
}

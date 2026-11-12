package nj2;

import androidx.lifecycle.y0;
import ch.qos.logback.classic.Logger;
import dj2.t0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$loadCitiesWards$1", f = "CustomerManagementViewModel.kt", l = {493}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f126323c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f126323c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objK;
        y0<List<o13.p<String, String>>> y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126322b;
        a aVar2 = this.f126323c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Logger loggerG4 = aVar2.G4();
                LinkedHashMap linkedHashMap = aVar2.f126257i;
                loggerG4.debug("loadCitiesWards");
                String str = ((t0) linkedHashMap.getOrDefault(a.b.COUNTRY_REGION, new t0(null, null, false, false, false, 31, null))).f60138a;
                String str2 = ((t0) linkedHashMap.getOrDefault(a.b.STATE_OR_PROVINCE, new t0(null, null, false, false, false, 31, null))).f60138a;
                String str3 = ((t0) linkedHashMap.getOrDefault(a.b.COUNTY_OR_DISTRICT, new t0(null, null, false, false, false, 31, null))).f60138a;
                if (str != null && str2 != null && str3 != null && str.length() > 0 && str2.length() > 0 && str3.length() > 0) {
                    y0<List<o13.p<String, String>>> y0Var2 = aVar2.f126269w;
                    dj2.a aVar3 = aVar2.f126249a;
                    this.f126321a = y0Var2;
                    this.f126322b = 1;
                    objK = aVar3.k(str, str2, str3, this);
                    if (objK == aVar) {
                        return aVar;
                    }
                    y0Var = y0Var2;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f126321a;
            o13.r.b(obj);
            objK = obj;
            ArrayList arrayList = null;
            if (((List) objK).isEmpty()) {
                objK = null;
            }
            List<fj2.l> list = (List) objK;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                for (fj2.l lVar : list) {
                    arrayList2.add(new o13.p(lVar.getWardCode(), lVar.getWardCode()));
                }
                arrayList = new ArrayList(arrayList2);
            }
            if (arrayList != null) {
                arrayList.add(0, new o13.p<>("---", "---"));
            }
            y0Var.m(arrayList);
        } catch (Exception e4) {
            aVar2.f126252d.setValue(Boolean.FALSE);
            aVar2.I4(e4);
        }
        return Unit.INSTANCE;
    }
}

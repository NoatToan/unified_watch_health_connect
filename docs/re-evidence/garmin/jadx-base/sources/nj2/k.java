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
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$loadDistrictsProvinces$1", f = "CustomerManagementViewModel.kt", l = {470}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126329c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f126329c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f126329c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0<List<o13.p<String, String>>> y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126328b;
        a aVar2 = this.f126329c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Logger loggerG4 = aVar2.G4();
                LinkedHashMap linkedHashMap = aVar2.f126257i;
                loggerG4.debug("loadDistrictsProvinces");
                String str = ((t0) linkedHashMap.getOrDefault(a.b.COUNTRY_REGION, new t0(null, null, false, false, false, 31, null))).f60138a;
                String str2 = ((t0) linkedHashMap.getOrDefault(a.b.STATE_OR_PROVINCE, new t0(null, null, false, false, false, 31, null))).f60138a;
                if (str != null && str2 != null && str2.length() > 0 && str.length() > 0) {
                    y0<List<o13.p<String, String>>> y0Var2 = aVar2.f126268v;
                    dj2.a aVar3 = aVar2.f126249a;
                    this.f126327a = y0Var2;
                    this.f126328b = 1;
                    obj = aVar3.m(str, str2, this);
                    if (obj == aVar) {
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
            y0Var = this.f126327a;
            o13.r.b(obj);
            ArrayList arrayList = null;
            if (((List) obj).isEmpty()) {
                obj = null;
            }
            List<fj2.e> list = (List) obj;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                for (fj2.e eVar : list) {
                    arrayList2.add(new o13.p(eVar.getDistrictCode(), eVar.getDistrict()));
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

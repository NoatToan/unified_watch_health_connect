package nj2;

import androidx.lifecycle.y0;
import dj2.t0;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$loadStates$1", f = "CustomerManagementViewModel.kt", l = {447}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f126343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<fj2.k> f126346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a aVar, List<fj2.k> list, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f126345c = aVar;
        this.f126346d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f126345c, this.f126346d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objP;
        a aVar;
        List<fj2.k> list = this.f126346d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126344b;
        a aVar3 = this.f126345c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                aVar3.G4().debug("loadStates");
                String str = ((t0) aVar3.f126257i.getOrDefault(a.b.COUNTRY_REGION, new t0(null, null, false, false, false, 31, null))).f60138a;
                if (!list.isEmpty()) {
                    y0<List<o13.p<String, String>>> y0Var = aVar3.f126267t;
                    ArrayList arrayList = new ArrayList(y.r(list, 10));
                    for (fj2.k kVar : list) {
                        arrayList.add(new o13.p(kVar.getSubCountryCode(), kVar.getSubCountryName()));
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList2.add(0, new o13.p("---", "---"));
                    y0Var.m(arrayList2);
                } else if (str != null) {
                    dj2.a aVar4 = aVar3.f126249a;
                    this.f126343a = aVar3;
                    this.f126344b = 1;
                    objP = aVar4.p(str, this);
                    if (objP == aVar2) {
                        return aVar2;
                    }
                    aVar = aVar3;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a aVar5 = this.f126343a;
            o13.r.b(obj);
            aVar = aVar5;
            objP = obj;
            List<o13.p<String, String>> arrayList3 = null;
            if (((List) objP).isEmpty()) {
                objP = null;
            }
            List<fj2.k> list2 = (List) objP;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList(y.r(list2, 10));
                for (fj2.k kVar2 : list2) {
                    arrayList4.add(new o13.p(kVar2.getSubCountryCode(), kVar2.getSubCountryName()));
                }
                arrayList3 = new ArrayList<>(arrayList4);
            }
            if (arrayList3 != null) {
                arrayList3.add(0, new o13.p<>("---", "---"));
            }
            y0<List<o13.p<String, String>>> y0Var2 = aVar.f126267t;
            if (arrayList3 == null) {
                arrayList3 = j0.f134944a;
            }
            y0Var2.m(arrayList3);
        } catch (Exception e4) {
            aVar3.f126252d.setValue(Boolean.FALSE);
            aVar3.I4(e4);
        }
        return Unit.INSTANCE;
    }
}

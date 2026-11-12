package wl0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$buildList$1", f = "GolfSwingAnalysisViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<t0<List<? extends SwingDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f185940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Long> f185941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List<Long> list, com.garmin.android.apps.connectmobile.golf.truswing.c cVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f185941c = list;
        this.f185942d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f185941c, this.f185942d, dVar);
        jVar.f185940b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(t0<List<? extends SwingDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((j) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        t0 t0Var = (t0) this.f185940b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185939a;
        if (i14 == 0) {
            o13.r.b(obj);
            List<Long> list = this.f185941c;
            if (list == null || list.isEmpty()) {
                cl0.a.e().getClass();
                ArrayList<hc2.b> arrayListL = h.i().l();
                ArrayList arrayList2 = new ArrayList();
                for (hc2.b bVar : arrayListL) {
                    String str = bVar.f83282b;
                    if (str != null) {
                        t tVarA = y.a(bVar.f83281a, str, bVar.f83283c);
                        tVarA.f185996a = bVar.f83286f;
                        tVarA.f185997b = bVar.f83284d;
                        tVarA.f185998c = bVar.f83285e;
                        arrayList2.add(tVarA);
                    }
                }
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    SwingDTO swingDTOA = com.garmin.android.apps.connectmobile.golf.truswing.k.a.a((t) it.next());
                    if (swingDTOA != null) {
                        arrayList.add(swingDTOA);
                    }
                }
            } else {
                this.f185942d.getClass();
                h hVarI = h.i();
                arrayList = new ArrayList();
                if (hVarI != null) {
                    for (Long l14 : list) {
                        hc2.b bVarD = l14 != null ? hVarI.d(l14.longValue()) : null;
                        if (bVarD != null) {
                            t tVarA2 = y.a(l14.longValue(), bVarD.f83282b, bVarD.f83283c);
                            tVarA2.f185997b = bVarD.f83284d;
                            tVarA2.f185998c = bVarD.f83285e;
                            arrayList.add(com.garmin.android.apps.connectmobile.golf.truswing.k.a.a(tVarA2));
                        }
                    }
                }
            }
            this.f185940b = null;
            this.f185939a = 1;
            if (t0Var.emit(arrayList, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

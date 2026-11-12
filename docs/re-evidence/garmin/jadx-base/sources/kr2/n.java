package kr2;

import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lps2/n;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.developer.viewmodels.DeveloperSettingViewModel$prepareDeviceWallets$2", f = "DeveloperSettingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements p<b0, t13.d<? super List<? extends ps2.n>>, Object> {
    public n(t13.d<? super n> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends ps2.n>> dVar) {
        return new n(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        rd2.f.a().f152045a.getClass();
        Iterable<sd2.f> iterableE = rd2.j.e();
        if (iterableE == null) {
            iterableE = j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (sd2.f fVar : iterableE) {
            w wVar = w.f140538a;
            long unitID = fVar.getUnitID();
            wVar.getClass();
            ps2.n nVarI = w.i(unitID);
            if (nVarI != null) {
                arrayList.add(nVarI);
            }
        }
        return arrayList;
    }
}

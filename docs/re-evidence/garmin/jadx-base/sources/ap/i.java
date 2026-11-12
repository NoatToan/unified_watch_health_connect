package ap;

import androidx.lifecycle.w0;
import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import ps.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.viewmodel.MultisportEditLegsViewModel$processLegDistanceEditInfo$1", f = "MultisportEditLegsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<d1> f11634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f11636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0<vo.a> f11638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List<d1> list, int i14, d dVar, int i15, w0<vo.a> w0Var, t13.d<? super i> dVar2) {
        super(2, dVar2);
        this.f11634a = list;
        this.f11635b = i14;
        this.f11636c = dVar;
        this.f11637d = i15;
        this.f11638e = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f11634a, this.f11635b, this.f11636c, this.f11637d, this.f11638e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        List<d1> list = this.f11634a;
        int i14 = this.f11635b;
        d1 d1Var = list.get(i14);
        d1 d1Var2 = i14 < list.size() + (-1) ? list.get(i14 + 1) : null;
        d dVar = this.f11636c;
        List<d1> listD = dVar.f11593e.f198239i.d();
        if (listD == null) {
            listD = j0.f134944a;
        }
        Iterator<T> it = listD.subList(0, listD.size() - 1).iterator();
        double d14 = 0.0d;
        while (it.hasNext()) {
            d14 += ((d1) it.next()).f139787c;
        }
        double d15 = i14 < list.size() + (-1) ? d1Var.f139787c : dVar.f11593e.f198245o - d14;
        o13.p<zm.p, Integer> pVarF = dVar.f11593e.f(this.f11637d, i14, fz.c.DISTANCE);
        this.f11638e.j(new vo.a(0, (int) (d15 + (d1Var2 != null ? d1Var2.f139787c : 0.0d)), (int) d1Var.f139787c, d1Var.f139790f, d1Var2 != null ? d1Var2.f139790f : null, pVarF != null ? pVarF.f128594a : null, pVarF != null ? pVarF.f128595b.intValue() : 0));
        return Unit.INSTANCE;
    }
}

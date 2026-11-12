package ap;

import androidx.lifecycle.w0;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import ps.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.viewmodel.MultisportEditLegsViewModel$processLegTimeEditInfo$1", f = "MultisportEditLegsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<d1> f11639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f11641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0<vo.a> f11643e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List<d1> list, int i14, d dVar, int i15, w0<vo.a> w0Var, t13.d<? super j> dVar2) {
        super(2, dVar2);
        this.f11639a = list;
        this.f11640b = i14;
        this.f11641c = dVar;
        this.f11642d = i15;
        this.f11643e = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f11639a, this.f11640b, this.f11641c, this.f11642d, this.f11643e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        double d14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        int i14 = this.f11640b;
        List<d1> list = this.f11639a;
        d1 d1Var = (d1) h0.e0(i14 - 1, list);
        d1 d1Var2 = (d1) h0.e0(i14, list);
        if (d1Var2 != null) {
            d1 d1Var3 = i14 < list.size() + (-1) ? list.get(i14 + 1) : null;
            int size = list.size() - 1;
            d dVar = this.f11641c;
            if (i14 < size) {
                d14 = d1Var2.f139786b;
            } else {
                d14 = dVar.f11593e.f198244n - (d1Var != null ? d1Var.f139789e : 0.0d);
            }
            o13.p<zm.p, Integer> pVarF = dVar.f11593e.f(this.f11642d, i14, fz.c.TIME);
            this.f11643e.j(new vo.a(0, (int) (d14 + (d1Var3 != null ? d1Var3.f139786b : 0.0d)), (int) d1Var2.f139786b, d1Var2.f139790f, d1Var3 != null ? d1Var3.f139790f : null, pVarF != null ? pVarF.f128594a : null, pVarF != null ? pVarF.f128595b.intValue() : 0));
        }
        return Unit.INSTANCE;
    }
}

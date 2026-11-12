package i21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.l0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$bulkDeleteFood$1", f = "NutritionReportsViewModel.kt", l = {461}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f87309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f87310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f87311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<b11.i> f87312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f87313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(d dVar, b63.o oVar, List<? extends b11.i> list, boolean z14, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f87310c = dVar;
        this.f87311d = oVar;
        this.f87312e = list;
        this.f87313f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f87310c, this.f87311d, this.f87312e, this.f87313f, dVar);
        eVar.f87309b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objR;
        Object value;
        b0 b0Var = (b0) this.f87309b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87308a;
        List<b11.i> list = this.f87312e;
        b63.o oVar = this.f87311d;
        d dVar = this.f87310c;
        if (i14 == 0) {
            o13.r.b(obj);
            m01.g gVar = dVar.f87269a;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String f14315a = ((b11.i) it.next()).getF14315a();
                if (f14315a != null) {
                    arrayList.add(f14315a);
                }
            }
            i01.d dVar2 = new i01.d(arrayList);
            this.f87309b = b0Var;
            this.f87308a = 1;
            objR = gVar.R(oVar, dVar2, this);
            if (objR == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objR = obj;
        }
        v2 v2Var = (v2) objR;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to delete food. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "NutritionReportsViewModel", strD);
            p2 p2Var = dVar.f87285q;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, c.a((c) value, new a(b.a.f87240b, null, 2, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194302)));
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            dVar.Q4(p13.w.c(oVar));
            dVar.f87287t.setValue(l0.f134950a);
            dVar.R4(this.f87313f, oVar, list);
        }
        return Unit.INSTANCE;
    }
}

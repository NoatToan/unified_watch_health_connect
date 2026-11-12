package s11;

import b63.o;
import b63.q;
import b63.v;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import p13.y;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.edit.viewmodel.MoveCopyFoodViewModel$onSave$1", f = "MoveCopyFoodViewModel.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i53.f f155917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f155918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f155919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f155920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f155920d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f155920d, dVar);
        gVar.f155919c = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        i53.f fVarJ;
        Object objE0;
        Object value2;
        Object value3;
        b0 b0Var = (b0) this.f155919c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155918b;
        e eVar = this.f155920d;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = eVar.f155909k;
            p2 p2Var2 = eVar.f155909k;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, d.a((d) value, null, null, null, true, false, null, false, 0L, null, null, 523775)));
            o13.p<o, o> pVarZ4 = eVar.z4();
            o oVarE = pVarZ4.f128594a;
            o oVar = pVarZ4.f128595b;
            ArrayList arrayListM = x.m(oVarE);
            while (oVarE.compareTo(oVar) < 0) {
                b63.i.INSTANCE.getClass();
                oVarE = q.e(oVarE, 1, b63.i.f16190d);
                arrayListM.add(oVarE);
            }
            fVarJ = i53.a.j(arrayListM);
            Long l14 = ((d) p2Var2.getValue()).f155885g;
            v vVar = ((d) p2Var2.getValue()).f155886h;
            List<b11.i> list = eVar.f155902d;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((b11.i) it.next()).h(vVar));
            }
            v01.b bVar = eVar.f155904f;
            i01.a aVar2 = eVar.f155901c;
            o oVar2 = eVar.f155899a;
            this.f155919c = b0Var;
            this.f155917a = fVarJ;
            this.f155918b = 1;
            objE0 = ge1.b.e0(bVar.f174217b, new v01.a(arrayList, aVar2, oVar2, fVarJ, l14, vVar, bVar, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i53.f fVar = this.f155917a;
            r.b(obj);
            fVarJ = fVar;
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to bulk edit foods. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "MoveCopyFoodViewModel", strD);
            p2 p2Var3 = eVar.f155909k;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, d.a((d) value3, null, null, null, false, true, null, false, 0L, null, null, 522751)));
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            List listB1 = h0.b1(h0.f1(h0.D0(fVarJ, eVar.f155899a)));
            p2 p2Var4 = eVar.f155909k;
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, d.a((d) value2, null, null, null, false, false, new o13.p(eVar.f155901c, listB1), false, 0L, null, null, 520703)));
        }
        return Unit.INSTANCE;
    }
}

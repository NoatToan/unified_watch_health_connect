package u21;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v01.b2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.MealSettingsViewModel$saveMealsAndTimelineSettings$1", f = "MealSettingsViewModel.kt", l = {454}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f168175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f168176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f168177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar, boolean z14, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f168176b = tVar;
        this.f168177c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f168176b, this.f168177c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        Object value2;
        Object value3;
        x xVar = this;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = xVar.f168175a;
        t tVar = xVar.f168176b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = tVar.f168140j;
            while (true) {
                Object value4 = p2Var.getValue();
                if (p2Var.b(value4, s.a((s) value4, true, null, false, null, null, null, null, false, false, false, false, false, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE))) {
                    break;
                }
                xVar = this;
            }
            s21.d0 d0VarI4 = tVar.I4();
            b2 b2Var = tVar.f168136f;
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            List<q01.e> list = d0VarI4.f156093a;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(og2.k.P((q01.e) it.next()));
            }
            l01.e eVarB = d0VarI4.f156094b.b();
            b63.v vVar = d0VarI4.f156095c;
            b63.v vVar2 = d0VarI4.f156096d;
            Boolean boolValueOf = Boolean.valueOf(xVar.f168177c);
            xVar.f168175a = 1;
            objB = b2Var.b(oVarD, arrayList, eVarB, vVar, vVar2, boolValueOf, xVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objB = obj;
        }
        q01.k kVar = (q01.k) objB;
        if (kVar instanceof q01.k.c) {
            p2 p2Var2 = tVar.f168140j;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, s.a((s) value3, false, null, false, null, null, null, null, false, false, true, false, false, new Integer(R.string.msg_settings_saved_successfully), 28670)));
        } else if (kVar instanceof q01.k.a) {
            p2 p2Var3 = tVar.f168140j;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, s.a((s) value2, false, null, false, null, null, null, null, false, true, false, false, false, null, 63486)));
        } else {
            if (!(kVar instanceof q01.k.b)) {
                lc.u0.r();
                return null;
            }
            p2 p2Var4 = tVar.f168140j;
            do {
                value = p2Var4.getValue();
            } while (!p2Var4.b(value, s.a((s) value, false, null, false, null, null, null, null, false, false, false, false, false, new Integer(R.string.generic_error_message), 32766)));
        }
        return Unit.INSTANCE;
    }
}

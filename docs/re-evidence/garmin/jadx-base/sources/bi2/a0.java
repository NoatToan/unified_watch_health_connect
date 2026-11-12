package bi2;

import android.widget.NumberPicker;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.IntensityZoneDialog$configurePicker$1", f = "IntensityZoneDialog.kt", l = {67}, m = "invokeSuspend")
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f18104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f18104b = b0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f18104b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18103a;
        b0 b0Var = this.f18104b;
        if (i14 == 0) {
            o13.r.b(obj);
            ei2.h hVar = b0Var.f18111b;
            ii2.b bVar = b0Var.f18112c;
            Map<String, Object> map = b0Var.f18113d;
            this.f18103a = 1;
            obj = hVar.i(bVar, map, 1);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        HashMap map2 = (HashMap) obj;
        if (map2 != null) {
            hi2.d dVar = b0Var.f18114e;
            map2.toString();
            dVar.getClass();
            NumberPicker numberPicker = b0Var.f18115f;
            if (numberPicker == null) {
                p005kotlin.jvm.internal.s.m("numberPicker");
                throw null;
            }
            Object obj2 = map2.get(mh2.i.DS_MINIMUM_VALUE.f118617a);
            obj2.getClass();
            numberPicker.setMinValue(((Integer) obj2).intValue());
            Object obj3 = map2.get(mh2.i.DS_MAXIMUM_VALUE.f118617a);
            obj3.getClass();
            numberPicker.setMaxValue(((Integer) obj3).intValue());
            Object obj4 = map2.get(mh2.i.DS_SELECTED_VALUE.f118617a);
            obj4.getClass();
            numberPicker.setValue(((Integer) obj4).intValue());
            Object obj5 = map2.get(mh2.i.DS_POSSIBLE_VALUES.f118617a);
            numberPicker.setDisplayedValues((String[]) (obj5 instanceof String[] ? obj5 : null));
            numberPicker.setWrapSelectorWheel(false);
        }
        return Unit.INSTANCE;
    }
}

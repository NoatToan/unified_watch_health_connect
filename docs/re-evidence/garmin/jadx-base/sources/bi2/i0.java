package bi2;

import android.widget.NumberPicker;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.TimePicker$frameMeridiesPicker$1", f = "TimePicker.kt", l = {101}, m = "invokeSuspend")
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f18175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f18176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, NumberPicker numberPicker, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f18175b = k0Var;
        this.f18176c = numberPicker;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f18175b, this.f18176c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18174a;
        if (i14 == 0) {
            o13.r.b(obj);
            k0 k0Var = this.f18175b;
            ei2.h hVar = k0Var.f18187b;
            ii2.b bVar = k0Var.f18188c;
            Map<String, ? extends Object> map = k0Var.f18189d;
            this.f18174a = 1;
            obj = hVar.i(bVar, map, 3);
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
            mh2.i iVar = mh2.i.DS_MINIMUM_VALUE;
            boolean zContainsKey = map2.containsKey(iVar.f118617a);
            NumberPicker numberPicker = this.f18176c;
            if (zContainsKey) {
                mh2.i iVar2 = mh2.i.DS_MAXIMUM_VALUE;
                if (map2.containsKey(iVar2.f118617a)) {
                    mh2.i iVar3 = mh2.i.DS_POSSIBLE_VALUES;
                    if (map2.containsKey(iVar3.f118617a)) {
                        Object obj2 = map2.get(iVar.f118617a);
                        obj2.getClass();
                        numberPicker.setMinValue(((Integer) obj2).intValue());
                        Object obj3 = map2.get(iVar2.f118617a);
                        obj3.getClass();
                        numberPicker.setMaxValue(((Integer) obj3).intValue());
                        Object obj4 = map2.get(iVar3.f118617a);
                        if (!(obj4 instanceof String[])) {
                            obj4 = null;
                        }
                        numberPicker.setDisplayedValues((String[]) obj4);
                        mh2.i iVar4 = mh2.i.DS_SELECTED_VALUE;
                        if (map2.containsKey(iVar4.f118617a)) {
                            Object obj5 = map2.get(iVar4.f118617a);
                            obj5.getClass();
                            numberPicker.setValue(((Integer) obj5).intValue());
                        }
                    } else {
                        numberPicker.setVisibility(8);
                    }
                } else {
                    numberPicker.setVisibility(8);
                }
            } else {
                numberPicker.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }
}

package bi2;

import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.MenstrualCyclePicker$framePicker$1", f = "MenstrualCyclePicker.kt", l = {68}, m = "invokeSuspend")
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f18124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f18125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StyledTextView f18126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, NumberPicker numberPicker, StyledTextView styledTextView, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f18124b = e0Var;
        this.f18125c = numberPicker;
        this.f18126d = styledTextView;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f18124b, this.f18125c, this.f18126d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        CharSequence quantityText;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18123a;
        e0 e0Var = this.f18124b;
        if (i14 == 0) {
            o13.r.b(obj);
            e0Var.f18135e.getClass();
            ei2.h hVar = e0Var.f18132b;
            ii2.b bVar = e0Var.f18133c;
            Map<String, ? extends Object> map = e0Var.f18134d;
            this.f18123a = 1;
            obj = hVar.i(bVar, map, 0);
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
            NumberPicker numberPicker = this.f18125c;
            StyledTextView styledTextView = this.f18126d;
            if (zContainsKey) {
                mh2.i iVar2 = mh2.i.DS_MAXIMUM_VALUE;
                if (map2.containsKey(iVar2.f118617a)) {
                    Object obj2 = map2.get(iVar.f118617a);
                    obj2.getClass();
                    numberPicker.setMinValue(((Integer) obj2).intValue());
                    Object obj3 = map2.get(iVar2.f118617a);
                    obj3.getClass();
                    numberPicker.setMaxValue(((Integer) obj3).intValue());
                    mh2.i iVar3 = mh2.i.DS_SELECTED_VALUE;
                    if (map2.containsKey(iVar3.f118617a)) {
                        Object obj4 = map2.get(iVar3.f118617a);
                        obj4.getClass();
                        int iIntValue = ((Integer) obj4).intValue();
                        e0Var.f18135e.getClass();
                        numberPicker.setValue(iIntValue);
                        quantityText = e0Var.f18131a.getResources().getQuantityText(R.plurals.number_of_days_without_value, iIntValue);
                    } else {
                        quantityText = "";
                    }
                    styledTextView.setText(quantityText);
                } else {
                    numberPicker.setVisibility(8);
                    styledTextView.setVisibility(8);
                }
            } else {
                numberPicker.setVisibility(8);
                styledTextView.setVisibility(8);
            }
            numberPicker.setOnValueChangedListener(new c0(0, styledTextView, e0Var));
        }
        return Unit.INSTANCE;
    }
}

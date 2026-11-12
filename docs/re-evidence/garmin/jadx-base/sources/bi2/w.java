package bi2;

import android.widget.EditText;
import android.widget.NumberPicker;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.HydrationContainerPopup$framePopup$1", f = "HydrationContainerPopup.kt", l = {78}, m = "invokeSuspend")
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f18276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f18277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EditText f18278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, NumberPicker numberPicker, EditText editText, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f18276b = xVar;
        this.f18277c = numberPicker;
        this.f18278d = editText;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f18276b, this.f18277c, this.f18278d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18275a;
        x xVar = this.f18276b;
        if (i14 == 0) {
            o13.r.b(obj);
            xVar.f18283e.getClass();
            ei2.h hVar = xVar.f18280b;
            ii2.b bVar = xVar.f18281c;
            Map<String, ? extends Object> map = xVar.f18282d;
            this.f18275a = 1;
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
            NumberPicker numberPicker = this.f18277c;
            if (zContainsKey) {
                mh2.i iVar2 = mh2.i.DS_MAXIMUM_VALUE;
                if (map2.containsKey(iVar2.f118617a)) {
                    Object obj2 = map2.get(iVar.f118617a);
                    obj2.getClass();
                    numberPicker.setMinValue(((Integer) obj2).intValue());
                    Object obj3 = map2.get(iVar2.f118617a);
                    obj3.getClass();
                    numberPicker.setMaxValue(((Integer) obj3).intValue());
                    mh2.i iVar3 = mh2.i.DS_POSSIBLE_VALUES;
                    if (map2.containsKey(iVar3.f118617a)) {
                        Object obj4 = map2.get(iVar3.f118617a);
                        if (!(obj4 instanceof String[])) {
                            obj4 = null;
                        }
                        String[] strArr = (String[]) obj4;
                        xVar.f18284f = strArr;
                        numberPicker.setDisplayedValues(strArr);
                    }
                    mh2.i iVar4 = mh2.i.DS_SELECTED_VALUE;
                    if (map2.containsKey(iVar4.f118617a)) {
                        Object obj5 = map2.get(mh2.i.DS_SELECTED_UNIT.f118617a);
                        obj5.getClass();
                        numberPicker.setValue(((Integer) obj5).intValue());
                        String strValueOf = String.valueOf(map2.get(iVar4.f118617a));
                        EditText editText = this.f18278d;
                        editText.setText(strValueOf);
                        editText.setSelection(strValueOf.length());
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

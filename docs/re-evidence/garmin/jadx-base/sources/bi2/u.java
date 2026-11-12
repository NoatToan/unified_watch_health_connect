package bi2;

import android.widget.NumberPicker;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.HeightPicker$frameHeightPicker$1", f = "HeightPicker.kt", l = {118}, m = "invokeSuspend")
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f18263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f18265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StyledTextView f18266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, int i14, NumberPicker numberPicker, StyledTextView styledTextView, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f18263b = vVar;
        this.f18264c = i14;
        this.f18265d = numberPicker;
        this.f18266e = styledTextView;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f18263b, this.f18264c, this.f18265d, this.f18266e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18262a;
        int i15 = this.f18264c;
        v vVar = this.f18263b;
        if (i14 == 0) {
            o13.r.b(obj);
            vVar.f18271e.getClass();
            ei2.h hVar = vVar.f18268b;
            ii2.b bVar = vVar.f18269c;
            Map<String, ? extends Object> map = vVar.f18270d;
            this.f18262a = 1;
            obj = hVar.i(bVar, map, i15);
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
            NumberPicker numberPicker = this.f18265d;
            if (zContainsKey) {
                mh2.i iVar2 = mh2.i.DS_MAXIMUM_VALUE;
                if (map2.containsKey(iVar2.f118617a)) {
                    Object obj2 = map2.get(iVar.f118617a);
                    obj2.getClass();
                    numberPicker.setMinValue(((Integer) obj2).intValue());
                    Object obj3 = map2.get(iVar2.f118617a);
                    obj3.getClass();
                    Integer num = (Integer) obj3;
                    int iIntValue2 = num.intValue();
                    if (i15 == 1) {
                        vVar.f18272f = iIntValue2;
                    } else {
                        vVar.f18273g = iIntValue2;
                    }
                    numberPicker.setMaxValue(num.intValue());
                    mh2.i iVar3 = mh2.i.DS_SELECTED_VALUE;
                    if (map2.containsKey(iVar3.f118617a)) {
                        Object obj4 = map2.get(iVar3.f118617a);
                        obj4.getClass();
                        numberPicker.setValue(((Integer) obj4).intValue());
                    }
                    if (i15 == 2) {
                        mh2.i iVar4 = mh2.i.DS_MAXIMUM_VALUE_FOR_DEPENDENCY;
                        if (map2.containsKey(iVar4.f118617a)) {
                            Object obj5 = map2.get(iVar4.f118617a);
                            obj5.getClass();
                            iIntValue = ((Integer) obj5).intValue();
                        } else {
                            iIntValue = vVar.f18273g;
                        }
                        vVar.f18274h = iIntValue;
                    }
                } else {
                    numberPicker.setVisibility(8);
                }
            } else {
                numberPicker.setVisibility(8);
            }
            mh2.i iVar5 = mh2.i.DS_LABEL_VALUE;
            if (map2.containsKey(iVar5.f118617a)) {
                Object obj6 = map2.get(iVar5.f118617a);
                obj6.getClass();
                this.f18266e.setText((String) obj6);
            }
        }
        return Unit.INSTANCE;
    }
}

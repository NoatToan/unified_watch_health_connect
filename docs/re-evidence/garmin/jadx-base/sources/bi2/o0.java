package bi2;

import android.widget.NumberPicker;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.WeightPicker$frameWeightPicker$1", f = "WeightPicker.kt", l = {72}, m = "invokeSuspend")
public final class o0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f18236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f18238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StyledTextView f18239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, int i14, NumberPicker numberPicker, StyledTextView styledTextView, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f18236b = p0Var;
        this.f18237c = i14;
        this.f18238d = numberPicker;
        this.f18239e = styledTextView;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o0(this.f18236b, this.f18237c, this.f18238d, this.f18239e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18235a;
        if (i14 == 0) {
            o13.r.b(obj);
            p0 p0Var = this.f18236b;
            p0Var.f18246e.getClass();
            ei2.h hVar = p0Var.f18243b;
            ii2.b bVar = p0Var.f18244c;
            Map<String, ? extends Object> map = p0Var.f18245d;
            this.f18235a = 1;
            obj = hVar.i(bVar, map, this.f18237c);
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
            NumberPicker numberPicker = this.f18238d;
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
                        numberPicker.setValue(((Integer) obj4).intValue());
                    }
                } else {
                    numberPicker.setVisibility(8);
                }
            } else {
                numberPicker.setVisibility(8);
            }
            mh2.i iVar4 = mh2.i.DS_LABEL_VALUE;
            if (map2.containsKey(iVar4.f118617a)) {
                Object obj5 = map2.get(iVar4.f118617a);
                obj5.getClass();
                this.f18239e.setText((String) obj5);
            }
        }
        return Unit.INSTANCE;
    }
}

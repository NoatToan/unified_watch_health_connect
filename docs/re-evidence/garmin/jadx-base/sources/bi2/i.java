package bi2;

import android.widget.NumberPicker;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.CriticalSwimSpeedPicker$setupPicker$1", f = "CriticalSwimSpeedPicker.kt", l = {59}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f18171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f18173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, int i14, NumberPicker numberPicker, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f18171b = mVar;
        this.f18172c = i14;
        this.f18173d = numberPicker;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f18171b, this.f18172c, this.f18173d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18170a;
        if (i14 == 0) {
            o13.r.b(obj);
            m mVar = this.f18171b;
            mVar.f18212e.getClass();
            ei2.h hVar = mVar.f18209b;
            ii2.b bVar = mVar.f18210c;
            Map<String, ? extends Object> map = mVar.f18211d;
            this.f18170a = 1;
            obj = hVar.i(bVar, map, this.f18172c);
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
            NumberPicker numberPicker = this.f18173d;
            if (zContainsKey) {
                mh2.i iVar2 = mh2.i.DS_MAXIMUM_VALUE;
                if (map2.containsKey(iVar2.f118617a)) {
                    Object obj2 = map2.get(iVar.f118617a);
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    numberPicker.setMinValue(num != null ? num.intValue() : 0);
                    Object obj3 = map2.get(iVar2.f118617a);
                    Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
                    numberPicker.setMaxValue(num2 != null ? num2.intValue() : 0);
                    mh2.i iVar3 = mh2.i.DS_SELECTED_VALUE;
                    if (map2.containsKey(iVar3.f118617a)) {
                        Object obj4 = map2.get(iVar3.f118617a);
                        Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
                        numberPicker.setValue(num3 != null ? num3.intValue() : 0);
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

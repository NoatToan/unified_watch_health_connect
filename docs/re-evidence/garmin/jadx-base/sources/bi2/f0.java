package bi2;

import android.widget.NumberPicker;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.SingleNumberPicker$frameNumberPickerValues$1", f = "SingleNumberPicker.kt", l = {75}, m = "invokeSuspend")
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f18151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StyledTextView f18152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f18153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, StyledTextView styledTextView, NumberPicker numberPicker, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f18151b = g0Var;
        this.f18152c = styledTextView;
        this.f18153d = numberPicker;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f18151b, this.f18152c, this.f18153d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18150a;
        g0 g0Var = this.f18151b;
        if (i14 == 0) {
            o13.r.b(obj);
            g0Var.f18160e.getClass();
            ei2.h hVar = g0Var.f18157b;
            ii2.b bVar = g0Var.f18158c;
            Map<String, ? extends Object> map = g0Var.f18159d;
            this.f18150a = 1;
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
            mh2.i iVar = mh2.i.DS_DATA_DISPLAY_VALUE_MAP;
            boolean zContainsKey = map2.containsKey(iVar.f118617a);
            NumberPicker numberPicker = this.f18153d;
            if (zContainsKey && (obj2 = map2.get(iVar.f118617a)) != null) {
                if (!(obj2 instanceof Map)) {
                    obj2 = null;
                }
                Map<String, ? extends Object> map3 = (Map) obj2;
                if (map3 != null) {
                    g0Var.f18161f = map3;
                    Object obj3 = map2.get(mh2.i.DS_SELECTED_VALUE.f118617a);
                    Iterator<Map.Entry<String, ? extends Object>> it = map3.entrySet().iterator();
                    int i15 = 0;
                    int i16 = 0;
                    while (it.hasNext()) {
                        if (p005kotlin.jvm.internal.s.g(obj3, it.next().getValue())) {
                            i15 = i16;
                        } else {
                            i16++;
                        }
                    }
                    numberPicker.setMaxValue(map3.size() - 1);
                    numberPicker.setDisplayedValues((String[]) map3.keySet().toArray(new String[0]));
                    numberPicker.setValue(i15);
                }
            }
            mh2.i iVar2 = mh2.i.DS_LABEL_VALUE;
            boolean zContainsKey2 = map2.containsKey(iVar2.f118617a);
            StyledTextView styledTextView = this.f18152c;
            if (zContainsKey2) {
                styledTextView.setText(ei2.h.h(g0Var.f18157b, String.valueOf(map2.get(iVar2.f118617a))));
            } else {
                styledTextView.setVisibility(8);
            }
            numberPicker.setWrapSelectorWheel(false);
        }
        return Unit.INSTANCE;
    }
}

package j42;

import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.bic.view.CircumferencePickerLayout;
import com.garmin.android.apps.connectmobile.bic.view.GCMDigitsPickerContainer;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.f;
import java.util.ArrayList;
import java.util.List;
import m32.c;
import o13.p;
import p005kotlin.jvm.internal.p0;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f97027b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f97026a = i14;
        this.f97027b = obj;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        int i16 = this.f97026a;
        Object obj = this.f97027b;
        switch (i16) {
            case 0:
                b bVar = (b) obj;
                if (bVar.f97032d) {
                    if (i15 < bVar.f97035g) {
                        numberPicker.setValue(i14);
                    }
                } else if (i15 < bVar.f97037i) {
                    numberPicker.setValue(i14);
                }
                break;
            case 1:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                ((p0) obj).f105807a = i15;
                break;
            case 2:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b bVar2 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b.f39112g;
                bVar2.u6().f115193i = i15;
                bVar2.y6(bVar2.u6().f115193i);
                break;
            case 3:
                f fVar = (f) obj;
                f.a aVar2 = f.f39172f;
                fVar.u6().f115192h = i15;
                fVar.u6().f115193i = Math.max(i15 + 1, 28);
                break;
            case 4:
                rk1.b bVar3 = (rk1.b) obj;
                ArrayList<NumberPicker> arrayList = bVar3.f153340d;
                ArrayList arrayListB = bVar3.b();
                rk1.b.d dVar = bVar3.f153338b;
                ArrayList arrayList2 = dVar.f153347c;
                m32.b bVar4 = dVar.f153356l;
                bVar4.getClass();
                double dA = arrayListB.size() == 4 ? c.a(arrayListB) : Double.NaN;
                bVar4.f116419a = dA;
                if (bVar4.f116420b > dA || dA > bVar4.f116421c) {
                    m32.b bVar5 = dVar.f153356l;
                    double d14 = bVar5.f116419a;
                    double d15 = bVar5.f116420b;
                    if (d14 >= d15) {
                        d15 = bVar5.f116421c;
                    }
                    p pVarR = zf.b.R(d15);
                    ArrayList arrayListC0 = h0.C0(c.d((List) pVarR.f128594a), (List) pVarR.f128595b);
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        if (arrayListC0.size() > i17) {
                            arrayList.get(i17).setValue(((Integer) arrayListC0.get(i17)).intValue());
                        }
                    }
                }
                break;
            case 5:
                CircumferencePickerLayout.a((CircumferencePickerLayout) obj);
                break;
            default:
                GCMDigitsPickerContainer.a((GCMDigitsPickerContainer) obj);
                break;
        }
    }
}

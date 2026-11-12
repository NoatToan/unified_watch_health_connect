package bi2;

import android.widget.NumberPicker;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.math.MathKt;
import r22.h1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class t implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f18259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f18260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18261d;

    public /* synthetic */ t(h1 h1Var, NumberPicker numberPicker, NumberPicker numberPicker2) {
        this.f18258a = 2;
        this.f18261d = h1Var;
        this.f18259b = numberPicker;
        this.f18260c = numberPicker2;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        int iE;
        switch (this.f18258a) {
            case 0:
                v vVar = (v) this.f18261d;
                int maxValue = this.f18259b.getMaxValue();
                NumberPicker numberPicker2 = this.f18260c;
                if (i15 != maxValue) {
                    numberPicker2.setMaxValue(vVar.f18273g);
                } else {
                    vVar.f18271e.getClass();
                    numberPicker2.setMaxValue(vVar.f18274h);
                }
                break;
            case 1:
                hv2.f fVar = (hv2.f) this.f18261d;
                int maxValue2 = this.f18259b.getMaxValue();
                NumberPicker numberPicker3 = this.f18260c;
                if (i15 != maxValue2) {
                    numberPicker3.setMaxValue(fVar.f85916h);
                } else {
                    fVar.f85913e.getClass();
                    numberPicker3.setMaxValue(fVar.f85917i);
                }
                break;
            default:
                h1 h1Var = (h1) this.f18261d;
                NumberPicker numberPicker4 = this.f18259b;
                if (i15 == 0) {
                    ArrayList<String> arrayList = h1Var.f149672e;
                    if (!arrayList.isEmpty()) {
                        numberPicker4.setDisplayedValues(null);
                        numberPicker4.setMinValue(0);
                        numberPicker4.setMaxValue(arrayList.size() - 1);
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        h1Var.f149673f = arrayList2;
                        arrayList2.addAll(arrayList);
                        numberPicker4.setDisplayedValues((String[]) h1Var.f149673f.toArray(new String[0]));
                        numberPicker4.setValue(0);
                    }
                }
                NumberPicker numberPicker5 = this.f18260c;
                if (i15 != numberPicker5.getMaxValue()) {
                    numberPicker4.setDisplayedValues(null);
                    if (numberPicker5.getValue() == 1) {
                        double d14 = h1Var.f149670c;
                        iE = (int) ((d14 - MathKt.e(d14)) * ((double) 10));
                    } else {
                        iE = 0;
                    }
                    numberPicker4.setMinValue(iE);
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    h1Var.f149673f = arrayList3;
                    j23.l lVar = new j23.l(iE, 9);
                    ArrayList arrayList4 = new ArrayList(p13.y.r(lVar, 10));
                    Iterator<Integer> it = lVar.iterator();
                    while (((j23.k) it).f96801c) {
                        arrayList4.add(String.valueOf(((p13.p0) it).nextInt()));
                    }
                    arrayList3.addAll(arrayList4);
                    numberPicker4.setDisplayedValues((String[]) h1Var.f149673f.toArray(new String[0]));
                    numberPicker4.setMinValue(iE);
                    numberPicker4.setMaxValue(9);
                } else {
                    numberPicker4.setDisplayedValues(null);
                    int value = numberPicker4.getValue();
                    numberPicker4.setValue(0);
                    int iRound = (int) Math.round((h1Var.f149671d % ((double) 1)) * ((double) 10));
                    numberPicker4.setMinValue(0);
                    numberPicker4.setMaxValue(iRound);
                    ArrayList<String> arrayList5 = new ArrayList<>();
                    h1Var.f149673f = arrayList5;
                    j23.l lVar2 = new j23.l(0, iRound);
                    ArrayList arrayList6 = new ArrayList(p13.y.r(lVar2, 10));
                    Iterator<Integer> it3 = lVar2.iterator();
                    while (((j23.k) it3).f96801c) {
                        arrayList6.add(String.valueOf(((p13.p0) it3).nextInt()));
                    }
                    arrayList5.addAll(arrayList6);
                    numberPicker4.setDisplayedValues((String[]) h1Var.f149673f.toArray(new String[0]));
                    if (value > numberPicker4.getMaxValue()) {
                        value = numberPicker4.getMaxValue();
                    }
                    numberPicker4.setValue(value);
                }
                break;
        }
    }

    public /* synthetic */ t(int i14, NumberPicker numberPicker, NumberPicker numberPicker2, Object obj) {
        this.f18258a = i14;
        this.f18259b = numberPicker;
        this.f18261d = obj;
        this.f18260c = numberPicker2;
    }
}

package r22;

import android.text.TextUtils;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import lo.l3;
import lo.p3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements r1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f149631a;

    public /* synthetic */ d(e eVar) {
        this.f149631a = eVar;
    }

    public void a(l3 l3Var, l3 l3Var2) {
        int i14;
        String str;
        e.a aVar = e.Z;
        l3Var.getClass();
        l3Var2.getClass();
        e eVar = this.f149631a;
        boolean z14 = eVar.T;
        if (z14 && !eVar.f149837k && eVar.Y) {
            String str2 = eVar.f149829c.getDisplayedValues()[eVar.f149829c.getValue()];
            str2.getClass();
            ArrayList<Integer> arrayListC = p3.c(Double.parseDouble(str2), l3Var, l3Var2, eVar.Y);
            if (arrayListC.size() == 1) {
                NumberPicker numberPicker = eVar.f149829c;
                ArrayList arrayList = new ArrayList();
                for (int iD = 0; iD <= 25000; iD = e5.d(iD, iD, arrayList, 25)) {
                }
                numberPicker.setValue(arrayList.indexOf(arrayListC.get(0)));
                return;
            }
            return;
        }
        if (z14) {
            double value = (((double) eVar.f149830d.getValue()) / 100.0d) + ((double) eVar.f149829c.getValue());
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(10);
            arrayList2.add(150);
            int iOrdinal = l3Var.ordinal();
            l3 l3Var3 = l3.YARD;
            if (iOrdinal == l3Var3.ordinal() && l3Var2.ordinal() == l3.METER.ordinal()) {
                DecimalFormat decimalFormat = c22.l3.f23135m;
                c22.l3.f23124b.getClass();
                str = decimalFormat.format(c22.l3.a.S1(value));
            } else if (l3Var.ordinal() == l3.METER.ordinal() && l3Var2.ordinal() == l3Var3.ordinal()) {
                DecimalFormat decimalFormat2 = c22.l3.f23135m;
                c22.l3.f23124b.getClass();
                str = decimalFormat2.format(value * 0.9144d);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(Integer.valueOf(Integer.parseInt(str)));
            }
            if (arrayList2.size() == 3) {
                NumberPicker numberPicker2 = eVar.f149829c;
                Object obj = arrayList2.get(0);
                obj.getClass();
                numberPicker2.setMinValue(((Number) obj).intValue());
                NumberPicker numberPicker3 = eVar.f149829c;
                Object obj2 = arrayList2.get(1);
                obj2.getClass();
                numberPicker3.setMaxValue(((Number) obj2).intValue());
                NumberPicker numberPicker4 = eVar.f149829c;
                Object obj3 = arrayList2.get(2);
                obj3.getClass();
                numberPicker4.setValue(((Number) obj3).intValue());
                return;
            }
            return;
        }
        boolean z15 = eVar.f149837k;
        NumberPicker numberPicker5 = eVar.f149829c;
        if (!z15) {
            double value2 = numberPicker5.getValue();
            ArrayList arrayList3 = new ArrayList();
            int iOrdinal2 = l3Var.ordinal();
            l3 l3Var4 = l3.METER;
            if (iOrdinal2 == l3Var4.ordinal() && l3Var2.ordinal() == l3.FOOT.ordinal()) {
                DecimalFormat decimalFormat3 = c22.l3.f23135m;
                c22.l3.f23124b.getClass();
                i14 = Integer.parseInt(decimalFormat3.format(value2 / 3.2808399d));
            } else if (l3Var.ordinal() == l3.FOOT.ordinal() && l3Var2.ordinal() == l3Var4.ordinal()) {
                DecimalFormat decimalFormat4 = c22.l3.f23135m;
                c22.l3.f23124b.getClass();
                i14 = Integer.parseInt(decimalFormat4.format(value2 * 3.2808399d));
            } else {
                i14 = 0;
            }
            arrayList3.add(Integer.valueOf(i14));
            if (arrayList3.size() == 1) {
                NumberPicker numberPicker6 = eVar.f149829c;
                Object obj4 = arrayList3.get(0);
                obj4.getClass();
                numberPicker6.setValue(((Number) obj4).intValue());
                return;
            }
            return;
        }
        ArrayList<Integer> arrayListB = p3.b((((double) eVar.f149830d.getValue()) / 100.0d) + ((double) numberPicker5.getValue()), l3Var, l3Var2);
        if (arrayListB.size() == 6) {
            NumberPicker numberPicker7 = eVar.f149829c;
            Integer num = arrayListB.get(0);
            num.getClass();
            numberPicker7.setMinValue(num.intValue());
            NumberPicker numberPicker8 = eVar.f149829c;
            Integer num2 = arrayListB.get(1);
            num2.getClass();
            numberPicker8.setMaxValue(num2.intValue());
            NumberPicker numberPicker9 = eVar.f149830d;
            Integer num3 = arrayListB.get(2);
            num3.getClass();
            numberPicker9.setMinValue(num3.intValue());
            NumberPicker numberPicker10 = eVar.f149830d;
            Integer num4 = arrayListB.get(3);
            num4.getClass();
            numberPicker10.setMaxValue(num4.intValue());
            NumberPicker numberPicker11 = eVar.f149829c;
            Integer num5 = arrayListB.get(4);
            num5.getClass();
            numberPicker11.setValue(num5.intValue());
            NumberPicker numberPicker12 = eVar.f149830d;
            Integer num6 = arrayListB.get(5);
            num6.getClass();
            numberPicker12.setValue(num6.intValue());
        }
    }

    @Override // r22.r1.d
    public void d(int i14, int i15, String str) {
        e eVar = this.f149631a;
        e.b bVar = eVar.X;
        if (bVar != null) {
            str.getClass();
            RadioButton radioButton = eVar.A;
            l3 l3Var = !(radioButton != null ? radioButton.isChecked() : false) ? eVar.C : eVar.D;
            l3Var.getClass();
            bVar.a(i14, i15, str, l3Var);
        }
    }
}

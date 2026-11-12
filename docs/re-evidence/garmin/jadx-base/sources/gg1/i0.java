package gg1;

import android.widget.NumberPicker;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i0 implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f77248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f77249c;

    public /* synthetic */ i0(NumberPicker numberPicker, NumberPicker numberPicker2, int i14) {
        this.f77247a = i14;
        this.f77248b = numberPicker;
        this.f77249c = numberPicker2;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        switch (this.f77247a) {
            case 0:
                NumberPicker numberPicker2 = this.f77248b;
                NumberPicker numberPicker3 = this.f77249c;
                if (i15 != 8) {
                    numberPicker2.setVisibility(0);
                    numberPicker3.setVisibility(8);
                } else {
                    numberPicker2.setVisibility(8);
                    numberPicker3.setVisibility(0);
                    int value = numberPicker2.getValue();
                    if (value > 4) {
                        numberPicker3.setValue(4);
                    } else {
                        numberPicker3.setValue(value);
                    }
                }
                break;
            default:
                NumberPicker numberPicker4 = this.f77248b;
                NumberPicker numberPicker5 = this.f77249c;
                if (i15 != 8) {
                    numberPicker4.setVisibility(0);
                    numberPicker5.setVisibility(8);
                } else {
                    numberPicker4.setVisibility(8);
                    numberPicker5.setVisibility(0);
                    int value2 = numberPicker4.getValue();
                    if (value2 > 4) {
                        numberPicker5.setValue(4);
                    } else {
                        numberPicker5.setValue(value2);
                    }
                }
                break;
        }
    }
}

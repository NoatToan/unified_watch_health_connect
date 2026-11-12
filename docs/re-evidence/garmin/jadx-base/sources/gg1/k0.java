package gg1;

import android.widget.NumberPicker;

/* JADX INFO: loaded from: classes10.dex */
public class k0 implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f77255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f77256b;

    public k0(com.garmin.android.apps.connectmobile.settings.d dVar, NumberPicker numberPicker, NumberPicker numberPicker2) {
        this.f77255a = numberPicker;
        this.f77256b = numberPicker2;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        NumberPicker numberPicker2 = this.f77256b;
        NumberPicker numberPicker3 = this.f77255a;
        if (i15 != 8) {
            numberPicker3.setVisibility(0);
            numberPicker2.setVisibility(8);
            return;
        }
        numberPicker3.setVisibility(8);
        numberPicker2.setVisibility(0);
        int value = numberPicker3.getValue();
        if (value <= 4) {
            numberPicker2.setValue(value);
        } else {
            numberPicker2.setValue(4);
        }
    }
}

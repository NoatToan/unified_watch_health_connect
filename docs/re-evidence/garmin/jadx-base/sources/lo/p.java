package lo;

import android.widget.NumberPicker;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113933a;

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        switch (this.f113933a) {
            case 0:
                numberPicker.setValue(i15);
                break;
            case 1:
                xg1.u.a aVar = xg1.u.f190921h;
                numberPicker.getClass();
                if (i15 < 1) {
                    numberPicker.setValue(i14);
                }
                break;
            case 2:
                xg1.u.a aVar2 = xg1.u.f190921h;
                numberPicker.getClass();
                if (i15 < 0) {
                    numberPicker.setValue(i14);
                }
                break;
            default:
                xg1.u.a aVar3 = xg1.u.f190921h;
                numberPicker.getClass();
                if (i15 < 2) {
                    numberPicker.setValue(i14);
                }
                break;
        }
    }
}

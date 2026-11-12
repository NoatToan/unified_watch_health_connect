package defpackage;

import android.app.TimePickerDialog;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class wy6 extends TimePickerDialog {
    public wy6(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i, int i2, boolean z) {
        super(context, onTimeSetListener, i, i2, z);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    public wy6(Context context, int i, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i2, int i3, boolean z) {
        super(context, i, onTimeSetListener, i2, i3, z);
    }
}

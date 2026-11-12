package defpackage;

import android.app.DatePickerDialog;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class vy6 extends DatePickerDialog {
    public vy6(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(context, onDateSetListener, i, i2, i3);
        a(context, i, i2, i3);
    }

    public final void a(Context context, int i, int i2, int i3) {
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    public vy6(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        a(context, i2, i3, i4);
    }
}

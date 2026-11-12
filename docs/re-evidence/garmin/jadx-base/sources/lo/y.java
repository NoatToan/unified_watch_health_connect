package lo;

import android.app.TimePickerDialog;
import android.text.format.DateFormat;
import com.garmin.android.apps.connectmobile.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
public class y extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f0 f0Var) {
        super(f0Var, 0);
        this.f113987b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        Calendar calendar = this.f113987b.I1;
        t tVar = (t) dVar;
        tVar.getClass();
        n nVar = new n(0, tVar, calendar);
        int i14 = calendar.get(11);
        int i15 = calendar.get(12);
        TimePickerDialog timePickerDialog = new TimePickerDialog(tVar.requireContext(), R.style.GCMTimePicker, nVar, i14, i15, DateFormat.is24HourFormat(tVar.requireContext()));
        timePickerDialog.updateTime(i14, i15);
        timePickerDialog.show();
        og.a.W(timePickerDialog, tVar.requireContext());
        og.a.w(timePickerDialog, tVar.requireContext());
    }
}

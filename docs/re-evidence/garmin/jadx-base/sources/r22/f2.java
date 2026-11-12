package r22;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class f2 extends TimePickerDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f149649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f149650d;

    public f2(Context context, int i14, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i15, int i16, int i17, int i18, int i19, int i24, boolean z14) {
        super(context, i14, onTimeSetListener, i15, i16, z14);
        this.f149647a = i17 < 0 ? 0 : i17;
        this.f149648b = i19 > 23 ? 23 : i19;
        this.f149649c = i18 < 0 ? 0 : i18;
        this.f149650d = i24 <= 59 ? i24 : 59;
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker, int i14, int i15) {
        int i16;
        int i17;
        int i18 = this.f149647a;
        int i19 = this.f149648b;
        if (i14 > i19) {
            timePicker.setCurrentHour(Integer.valueOf(i19));
        } else if (i14 < i18) {
            timePicker.setCurrentHour(Integer.valueOf(i18));
        }
        if (i14 == i19 && i15 > (i17 = this.f149650d)) {
            timePicker.setCurrentMinute(Integer.valueOf(i17));
        } else {
            if (i14 != i18 || i15 >= (i16 = this.f149649c)) {
                return;
            }
            timePicker.setCurrentMinute(Integer.valueOf(i16));
        }
    }

    public f2(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i14, int i15, int i16, int i17, int i18, int i19, boolean z14) {
        this(context, R.style.GCMTimePicker, onTimeSetListener, i14, i15, i16, i17, i18, i19, z14);
    }
}

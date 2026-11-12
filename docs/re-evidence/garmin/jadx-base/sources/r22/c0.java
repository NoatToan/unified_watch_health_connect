package r22;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import com.garmin.android.apps.connectmobile.R;
import java.util.Calendar;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
public class c0 extends DatePickerDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f149624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f149625b;

    public static class a implements DatePickerDialog.OnDateSetListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f149626a;

        public a(long j8, long j14, b bVar) {
            this.f149626a = bVar;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public final void onDateSet(DatePicker datePicker, int i14, int i15, int i16) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i14, i15, i16);
            this.f149626a.h(calendar);
        }
    }

    public interface b {
        void h(Calendar calendar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(Context context, long j8, long j14, Calendar calendar, b bVar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.setTimeInMillis(j8);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        long timeInMillis = calendar2.getTimeInMillis();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.clear();
        calendar3.setTimeInMillis(j14);
        calendar3.set(11, 23);
        calendar3.set(12, 59);
        calendar3.set(13, 59);
        calendar3.set(14, 999);
        long timeInMillis2 = calendar3.getTimeInMillis();
        super(context, R.style.Gcm_Dialog_DatePicker, new a(timeInMillis, timeInMillis2, bVar), calendar.get(1), calendar.get(2), calendar.get(5));
        this.f149624a = timeInMillis;
        this.f149625b = timeInMillis2;
        getDatePicker().setMinDate(timeInMillis);
        getDatePicker().setMaxDate(timeInMillis2);
    }

    public static DateTime a(DateTime dateTime) {
        return dateTime.withTime(23, 59, 59, 999);
    }

    @Override // android.app.DatePickerDialog, android.widget.DatePicker.OnDateChangedListener
    public final void onDateChanged(DatePicker datePicker, int i14, int i15, int i16) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i14, i15, i16);
        Calendar calendar2 = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        long j8 = this.f149624a;
        if (timeInMillis < j8) {
            calendar2.setTimeInMillis(j8);
            datePicker.updateDate(calendar2.get(1), calendar2.get(2), calendar2.get(5));
            return;
        }
        long timeInMillis2 = calendar.getTimeInMillis();
        long j14 = this.f149625b;
        if (timeInMillis2 > j14) {
            calendar2.setTimeInMillis(j14);
            datePicker.updateDate(calendar2.get(1), calendar2.get(2), calendar2.get(5));
        }
    }
}

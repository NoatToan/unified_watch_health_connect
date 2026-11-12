package com.huami.assistant.ui.schedule.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.haibin.calendarview.CalendarView;
import com.huami.assistant.R;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class CalendarPickerFragment extends Fragment {
    public static final int MODE_DATE = 1;
    public static final int MODE_DATE_TIME = 0;
    public static final int MODE_TIME = 2;
    private int a;
    private final Calendar b = Calendar.getInstance();
    private String c;
    private TextView d;
    private CalendarView e;
    private TextView f;
    private View g;
    private OnTimeSelectListener h;
    private DialogFragment i;

    public interface OnTimeSelectListener {
        void onTimeClick();

        void onTimeSelect(long time, boolean changed);
    }

    public class a implements CalendarView.OnCalendarSelectListener {
        public a() {
        }

        @Override // com.haibin.calendarview.CalendarView.OnCalendarSelectListener
        public void onCalendarOutOfRange(com.haibin.calendarview.Calendar calendar) {
        }

        @Override // com.haibin.calendarview.CalendarView.OnCalendarSelectListener
        public void onCalendarSelect(com.haibin.calendarview.Calendar calendarView, boolean isClick) {
            int year = calendarView.getYear();
            int month = calendarView.getMonth() - 1;
            int day = calendarView.getDay();
            CalendarPickerFragment.this.b.set(1, year);
            CalendarPickerFragment.this.b.set(2, month);
            CalendarPickerFragment.this.b.set(5, day);
            CalendarPickerFragment.this.d.setText(DateUtils.formatDateTime(CalendarPickerFragment.this.getActivity(), calendarView.getTimeInMillis(), 52));
        }
    }

    private void g(View view) {
        this.d = (TextView) view.findViewById(R.id.calendar_year_month);
        this.e = (CalendarView) view.findViewById(R.id.calendar);
        this.f = (TextView) view.findViewById(R.id.time);
        this.g = view.findViewById(R.id.layout_time);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: lh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.h(view2);
            }
        });
        view.findViewById(R.id.calendar_prev).setOnClickListener(new View.OnClickListener() { // from class: jh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.i(view2);
            }
        });
        view.findViewById(R.id.calendar_next).setOnClickListener(new View.OnClickListener() { // from class: kh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.j(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        OnTimeSelectListener onTimeSelectListener = this.h;
        if (onTimeSelectListener != null) {
            onTimeSelectListener.onTimeClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        this.e.scrollToPre(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        this.e.scrollToNext(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(OnTimeSelectListener onTimeSelectListener, DialogInterface dialogInterface, int i) {
        if (onTimeSelectListener != null) {
            onTimeSelectListener.onTimeSelect(getSelectTime(), true);
        }
    }

    private void l() {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(DateUtils.formatDateTime(getActivity(), this.b.getTimeInMillis(), 52));
        }
        if (this.e != null) {
            this.e.scrollToCalendar(this.b.get(1), this.b.get(2) + 1, this.b.get(5), false, false);
            this.e.setOnCalendarSelectListener(new a());
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.setText(DateUtils.formatDateTime(getActivity(), this.b.getTimeInMillis(), 1));
        }
        View view = this.g;
        if (view != null) {
            view.setVisibility(this.a == 0 ? 0 : 8);
        }
    }

    public void dismiss() {
        LoadingDialog.dismiss(this.i);
    }

    public long getSelectTime() {
        return this.b.getTimeInMillis();
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule_calendar_picker, container, false);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        l();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        g(view);
    }

    public void setCurrentTime(long currentTime) {
        this.b.setTimeInMillis(currentTime);
    }

    public void setMode(int mode) {
        this.a = mode;
    }

    public void show(@NonNull Activity activity, long initTime, final OnTimeSelectListener timeSelectListener, String tag) {
        LoadingDialog.dismiss(this.i);
        setCurrentTime(initTime);
        this.h = timeSelectListener;
        this.i = AlertDialog.setContent(this).setPositiveBtn(activity.getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: ih0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.k(timeSelectListener, dialogInterface, i);
            }
        }).setNegativeBtn(activity.getString(R.string.cancel)).show(activity, tag);
        this.c = tag;
    }

    public void show(Activity activity) {
        DialogFragment dialogFragment = this.i;
        if (dialogFragment != null) {
            dialogFragment.show(activity.getFragmentManager(), this.c);
        }
    }
}

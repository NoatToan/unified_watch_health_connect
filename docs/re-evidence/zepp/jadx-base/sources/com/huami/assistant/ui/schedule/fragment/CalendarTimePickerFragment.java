package com.huami.assistant.ui.schedule.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.assistant.R;
import com.huami.watch.companion.ui.view.WheelAdapter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class CalendarTimePickerFragment extends Fragment {
    private WheelView a;
    private WheelView b;
    private WheelView c;
    private View d;
    private final Calendar e = Calendar.getInstance();
    private List<f> f;
    private List<f> g;
    private List<d> h;
    private List<e> i;
    private List<e> j;
    private List<e> k;
    private DialogFragment l;
    private int m;

    public class a implements OnWheelScrollListener {
        public a() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            if (CalendarTimePickerFragment.this.m == 1) {
                CalendarTimePickerFragment.this.e.set(1, ((e) CalendarTimePickerFragment.this.i.get(wheel.getCurrentItem())).a);
            } else if (CalendarTimePickerFragment.this.m == 0) {
                d dVar = (d) CalendarTimePickerFragment.this.h.get(wheel.getCurrentItem());
                CalendarTimePickerFragment.this.e.set(1, dVar.a().get(1));
                CalendarTimePickerFragment.this.e.set(2, dVar.a().get(2));
                CalendarTimePickerFragment.this.e.set(5, dVar.a().get(5));
            }
            CalendarTimePickerFragment.this.a.invalidateWheel(false);
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
        }
    }

    public class b implements OnWheelScrollListener {
        public b() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            if (CalendarTimePickerFragment.this.m == 0 || CalendarTimePickerFragment.this.m == 2) {
                CalendarTimePickerFragment.this.e.set(11, ((f) CalendarTimePickerFragment.this.f.get(wheel.getCurrentItem())).a);
            } else {
                CalendarTimePickerFragment.this.e.set(2, ((e) CalendarTimePickerFragment.this.j.get(wheel.getCurrentItem())).a - 1);
                CalendarTimePickerFragment.this.w();
            }
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
        }
    }

    public class c implements OnWheelScrollListener {
        public c() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            if (CalendarTimePickerFragment.this.m == 0 || CalendarTimePickerFragment.this.m == 2) {
                CalendarTimePickerFragment.this.e.set(12, ((f) CalendarTimePickerFragment.this.g.get(wheel.getCurrentItem())).a);
            } else {
                CalendarTimePickerFragment.this.e.set(5, ((e) CalendarTimePickerFragment.this.k.get(wheel.getCurrentItem())).a);
            }
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
        }
    }

    public class d implements WheelAdapter.Item {
        public Calendar a;

        public d(Calendar calendar) {
            this.a = calendar;
        }

        public Calendar a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof d)) {
                return super.equals(obj);
            }
            d dVar = (d) obj;
            return dVar.a.get(1) == this.a.get(1) && dVar.a.get(2) == this.a.get(2) && dVar.a.get(6) == this.a.get(6);
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getKey() {
            return String.valueOf(this.a.getTimeInMillis());
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getValue() {
            return DateUtils.formatDateTime(CalendarTimePickerFragment.this.getActivity(), this.a.getTimeInMillis(), 20);
        }
    }

    public class e implements WheelAdapter.Item {
        public int a;

        public e(int num) {
            this.a = num;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof e)) {
                return super.equals(obj);
            }
            return ((e) obj).a == this.a;
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getKey() {
            return String.valueOf(this.a);
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getValue() {
            return String.valueOf(this.a);
        }
    }

    public class f implements WheelAdapter.Item {
        public int a;

        public f(int time) {
            this.a = time;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof f)) {
                return super.equals(obj);
            }
            return this.a == ((f) obj).a;
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getKey() {
            return String.valueOf(this.a);
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getValue() {
            int i = this.a;
            if (i >= 10) {
                return String.valueOf(i);
            }
            return "0" + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(CalendarPickerFragment.OnTimeSelectListener onTimeSelectListener, DialogInterface dialogInterface) {
        if (onTimeSelectListener != null) {
            onTimeSelectListener.onTimeSelect(getSelectTime(), false);
        }
    }

    private void B() {
        this.a.addScrollingListener(new a());
        this.b.addScrollingListener(new b());
        this.c.addScrollingListener(new c());
    }

    private WheelAdapter n(WheelView wheelView, List<? extends WheelAdapter.Item> dataList) {
        Activity activity = getActivity();
        int size = dataList.size();
        int color = getResources().getColor(R.color.wheel_center_color);
        Resources resources = getResources();
        int i = R.color.s2;
        WheelAdapter wheelAdapter = new WheelAdapter(activity, 1, size, wheelView, color, resources.getColor(i), getResources().getColor(i), false, 46, 6, 6, 6);
        wheelAdapter.setDataList(dataList);
        return wheelAdapter;
    }

    private List<d> o() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -5);
        calendar.set(6, 1);
        int i = Calendar.getInstance().get(1);
        while (calendar.get(1) - i <= 5) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
            arrayList.add(new d(calendar2));
            calendar.add(6, 1);
        }
        return arrayList;
    }

    private List<e> p() {
        ArrayList arrayList = new ArrayList();
        int actualMaximum = this.e.getActualMaximum(5);
        for (int i = 1; i <= actualMaximum; i++) {
            arrayList.add(new e(i));
        }
        return arrayList;
    }

    private List<f> q() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 24; i++) {
            arrayList.add(new f(i));
        }
        return arrayList;
    }

    private List<f> r() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 60; i++) {
            arrayList.add(new f(i));
        }
        return arrayList;
    }

    private List<e> s() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 12; i++) {
            arrayList.add(new e(i));
        }
        return arrayList;
    }

    private List<e> t() {
        ArrayList arrayList = new ArrayList();
        for (int i = this.e.get(1); i <= 10000; i++) {
            arrayList.add(new e(i));
        }
        return arrayList;
    }

    private void u(View view) {
        this.a = (WheelView) view.findViewById(R.id.time_picker_one);
        this.b = (WheelView) view.findViewById(R.id.time_picker_two);
        this.c = (WheelView) view.findViewById(R.id.time_picker_three);
        this.d = view.findViewById(R.id.time_picker_divider_one);
        v();
        x();
        w();
        B();
    }

    private void v() {
        WheelAdapter wheelAdapterN;
        int iIndexOf = 0;
        this.a.setVisibility(0);
        this.d.setVisibility(0);
        this.a.setVisibleItems(5).setCenterDrawable(R.color.transparent);
        int i = this.m;
        String string = "";
        if (i == 0) {
            List<d> listO = o();
            this.h = listO;
            wheelAdapterN = n(this.a, listO);
            iIndexOf = this.h.indexOf(new d(this.e));
            if (iIndexOf < 0) {
                iIndexOf = this.h.size() / 2;
            }
        } else if (i == 1) {
            this.i = t();
            string = getString(R.string.schedule_year);
            wheelAdapterN = n(this.a, this.i);
            iIndexOf = this.i.indexOf(new e(this.e.get(1)));
            if (iIndexOf < 0) {
                iIndexOf = this.e.get(1);
            }
        } else {
            wheelAdapterN = null;
            this.a.setVisibility(8);
            this.d.setVisibility(8);
        }
        if (wheelAdapterN != null) {
            this.a.setViewAdapter(wheelAdapterN);
            this.a.setCurrentItem(iIndexOf);
        }
        this.a.setCenterStyle(string, R.color.dark_red_text, 32.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        WheelAdapter wheelAdapterN;
        int iIndexOf;
        String string;
        this.c.setVisibleItems(5).setCenterDrawable(R.color.transparent);
        int i = this.m;
        if (i == 0) {
            List<f> listR = r();
            this.g = listR;
            wheelAdapterN = n(this.c, listR);
            int iIndexOf2 = this.g.indexOf(new f(this.e.get(12)));
            iIndexOf = iIndexOf2 >= 0 ? iIndexOf2 : 30;
            string = getString(R.string.schedule_minute);
        } else if (i == 1) {
            List<e> listP = p();
            this.k = listP;
            wheelAdapterN = n(this.c, listP);
            iIndexOf = this.k.indexOf(new e(this.e.get(5)));
            string = getString(R.string.schedule_date);
        } else {
            List<f> listR2 = r();
            this.g = listR2;
            wheelAdapterN = n(this.c, listR2);
            int iIndexOf3 = this.g.indexOf(new f(this.e.get(12)));
            iIndexOf = iIndexOf3 >= 0 ? iIndexOf3 : 30;
            string = getString(R.string.schedule_minute);
        }
        this.c.setViewAdapter(wheelAdapterN);
        this.c.setCurrentItem(iIndexOf);
        this.c.setCenterStyle(string, R.color.dark_red_text, 32.0f);
    }

    private void x() {
        WheelAdapter wheelAdapterN;
        String string;
        int iIndexOf;
        this.b.setVisibleItems(5).setCenterDrawable(R.color.transparent);
        int i = this.m;
        int i2 = 12;
        if (i == 0) {
            List<f> listQ = q();
            this.f = listQ;
            wheelAdapterN = n(this.b, listQ);
            string = getString(R.string.schedule_hour);
            iIndexOf = this.f.indexOf(new f(this.e.get(11)));
            if (iIndexOf >= 0) {
                i2 = iIndexOf;
            }
        } else {
            if (i == 1) {
                List<e> listS = s();
                this.j = listS;
                wheelAdapterN = n(this.b, listS);
                String string2 = getString(R.string.schedule_month);
                iIndexOf = this.j.indexOf(new e(this.e.get(2) + 1));
                string = string2;
            } else {
                List<f> listQ2 = q();
                this.f = listQ2;
                wheelAdapterN = n(this.b, listQ2);
                string = getString(R.string.schedule_hour);
                iIndexOf = this.f.indexOf(new f(this.e.get(11)));
                if (iIndexOf >= 0) {
                }
            }
            i2 = iIndexOf;
        }
        this.b.setViewAdapter(wheelAdapterN);
        this.b.setCurrentItem(i2);
        this.b.setCenterStyle(string, R.color.dark_red_text, 32.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(CalendarPickerFragment.OnTimeSelectListener onTimeSelectListener, DialogInterface dialogInterface, int i) {
        if (onTimeSelectListener != null) {
            onTimeSelectListener.onTimeSelect(getSelectTime(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(CalendarPickerFragment.OnTimeSelectListener onTimeSelectListener, DialogInterface dialogInterface, int i) {
        if (onTimeSelectListener != null) {
            onTimeSelectListener.onTimeSelect(getSelectTime(), false);
        }
    }

    public long getSelectTime() {
        return this.e.getTimeInMillis();
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule_calendar_time_picker, container, false);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        u(view);
    }

    public void setCurrentTime(long currentTime) {
        this.e.setTimeInMillis(currentTime);
    }

    public void setMode(int mode) {
        this.m = mode;
    }

    public void show(@NonNull Activity activity, @NonNull String title, long initTime, final CalendarPickerFragment.OnTimeSelectListener timeSelectListener, String tag) {
        LoadingDialog.dismiss(this.l);
        setCurrentTime(initTime);
        this.l = AlertDialog.setTitle(title).setContent(this).setPositiveBtn(activity.getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: oh0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.y(timeSelectListener, dialogInterface, i);
            }
        }).setNegativeBtn(activity.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: nh0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.z(timeSelectListener, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: mh0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.A(timeSelectListener, dialogInterface);
            }
        }).show(activity, tag);
    }
}

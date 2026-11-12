package com.huami.bloodpressure_ui.view;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.timepicker.TimeModel;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_ui.R;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ui.view.WheelAdapter;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class TimePickerDialog extends DialogFragment {
    private static final int r = 46;
    private static final int s = 9;
    private static final int t = 7;
    private static final int u = 12;
    private static final int v = 24;
    private static final int w = 60;
    private static final int x = 10;
    private WheelView a;
    private WheelView b;
    private WheelView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TimeSelectListener g;
    private List<f> i;
    private List<f> j;
    private List<d> k;
    private List<e> l;
    private List<e> m;
    private List<e> n;
    private Mode p;
    private Calendar h = Calendar.getInstance();
    private long o = UserEx.getUserCreateTime();
    private String q = "HealthData-TimePickerDialog";

    public enum Mode {
        DATE,
        TIME,
        DATE_TIME
    }

    public interface TimeSelectListener {
        void onTimeSelect(long j);
    }

    public class a implements OnWheelScrollListener {
        public a() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            if (TimePickerDialog.this.p == Mode.DATE) {
                TimePickerDialog timePickerDialog = TimePickerDialog.this;
                timePickerDialog.u(((e) timePickerDialog.l.get(wheelView.getCurrentItem())).a);
            } else if (TimePickerDialog.this.p == Mode.DATE_TIME) {
                d dVar = (d) TimePickerDialog.this.k.get(wheelView.getCurrentItem());
                TimePickerDialog.this.h.set(1, dVar.a().get(1));
                TimePickerDialog.this.h.set(2, dVar.a().get(2));
                TimePickerDialog.this.h.set(5, dVar.a().get(5));
            }
            TimePickerDialog.this.a.invalidateWheel(false);
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class b implements OnWheelScrollListener {
        public b() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            if (TimePickerDialog.this.p == Mode.DATE_TIME || TimePickerDialog.this.p == Mode.TIME) {
                TimePickerDialog timePickerDialog = TimePickerDialog.this;
                timePickerDialog.r(((f) timePickerDialog.i.get(wheelView.getCurrentItem())).a);
            } else {
                TimePickerDialog timePickerDialog2 = TimePickerDialog.this;
                timePickerDialog2.t(((e) timePickerDialog2.m.get(wheelView.getCurrentItem())).a);
            }
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class c implements OnWheelScrollListener {
        public c() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            if (TimePickerDialog.this.p == Mode.DATE_TIME || TimePickerDialog.this.p == Mode.TIME) {
                TimePickerDialog timePickerDialog = TimePickerDialog.this;
                timePickerDialog.s(((f) timePickerDialog.j.get(wheelView.getCurrentItem())).a);
            } else {
                TimePickerDialog timePickerDialog2 = TimePickerDialog.this;
                timePickerDialog2.q(((e) timePickerDialog2.n.get(wheelView.getCurrentItem())).a);
            }
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
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
            if (!(obj instanceof d)) {
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
            return DateUtils.formatDateTime(TimePickerDialog.this.getActivity(), this.a.getTimeInMillis(), 20);
        }
    }

    public class e implements WheelAdapter.Item {
        public int a;

        public e(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return ((e) obj).a == this.a;
            }
            return super.equals(obj);
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getKey() {
            return String.valueOf(this.a);
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getValue() {
            return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(this.a));
        }
    }

    public class f implements WheelAdapter.Item {
        public int a;

        public f(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.a == ((f) obj).a;
            }
            return super.equals(obj);
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getKey() {
            return String.valueOf(this.a);
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getValue() {
            return String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.a));
        }
    }

    private List<e> A() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 12; i++) {
            arrayList.add(new e(i));
        }
        return arrayList;
    }

    private long B() {
        return this.h.getTimeInMillis();
    }

    private List<e> C() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(1);
        calendar.setTimeInMillis(this.o);
        for (int i2 = calendar.get(1); i2 <= i; i2++) {
            arrayList.add(new e(i2));
        }
        return arrayList;
    }

    private void D() {
        if (getActivity() != null) {
            this.d.setText(this.p == Mode.DATE ? getActivity().getString(R.string.blood_pressure_date_picker) : getActivity().getString(R.string.blood_pressure_time_picker));
        }
        K();
        E();
        G();
        F();
        L();
    }

    private void E() {
        WheelAdapter wheelAdapterV;
        int iIndexOf;
        this.a.setVisibleItems(5).setCenterDrawable(R.color.transparent);
        Mode mode = this.p;
        if (mode == Mode.DATE_TIME) {
            List<d> listW = w();
            this.k = listW;
            wheelAdapterV = v(this.a, listW);
            iIndexOf = this.k.indexOf(new d(this.h));
            if (iIndexOf < 0) {
                iIndexOf = this.k.size() / 2;
            }
        } else if (mode == Mode.DATE) {
            List<e> listC = C();
            this.l = listC;
            wheelAdapterV = v(this.a, listC);
            iIndexOf = this.l.indexOf(new e(this.h.get(1)));
            if (iIndexOf < 0) {
                iIndexOf = this.h.get(1);
            }
        } else {
            wheelAdapterV = null;
            this.a.setVisibility(8);
            iIndexOf = 0;
        }
        if (wheelAdapterV != null) {
            this.a.setViewAdapter(wheelAdapterV);
            this.a.setCurrentItem(iIndexOf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0035 A[PHI: r0 r1
      0x0035: PHI (r0v9 com.huami.watch.companion.ui.view.WheelAdapter) = (r0v4 com.huami.watch.companion.ui.view.WheelAdapter), (r0v11 com.huami.watch.companion.ui.view.WheelAdapter) binds: [B:11:0x0076, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r1v6 int) = (r1v3 int), (r1v9 int) binds: [B:11:0x0076, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    private void F() {
        WheelAdapter wheelAdapterV;
        int iIndexOf;
        this.c.setVisibleItems(5).setCenterDrawable(R.color.transparent);
        Mode mode = this.p;
        int iIndexOf2 = 30;
        if (mode == Mode.DATE_TIME) {
            List<f> listZ = z();
            this.j = listZ;
            wheelAdapterV = v(this.c, listZ);
            iIndexOf = this.j.indexOf(new f(this.h.get(12)));
            if (iIndexOf >= 0) {
                iIndexOf2 = iIndexOf;
            }
        } else if (mode == Mode.DATE) {
            List<e> listX = x();
            this.n = listX;
            wheelAdapterV = v(this.c, listX);
            iIndexOf2 = this.n.indexOf(new e(this.h.get(5)));
        } else {
            List<f> listZ2 = z();
            this.j = listZ2;
            wheelAdapterV = v(this.c, listZ2);
            iIndexOf = this.j.indexOf(new f(this.h.get(12)));
            if (iIndexOf >= 0) {
                iIndexOf2 = iIndexOf;
            }
        }
        this.c.setViewAdapter(wheelAdapterV);
        this.c.setCurrentItem(iIndexOf2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0035 A[PHI: r0 r1
      0x0035: PHI (r0v9 com.huami.watch.companion.ui.view.WheelAdapter) = (r0v4 com.huami.watch.companion.ui.view.WheelAdapter), (r0v11 com.huami.watch.companion.ui.view.WheelAdapter) binds: [B:11:0x0079, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r1v10 int) = (r1v6 int), (r1v13 int) binds: [B:11:0x0079, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    private void G() {
        WheelAdapter wheelAdapterV;
        int iIndexOf;
        this.b.setVisibleItems(5).setCenterDrawable(R.color.transparent);
        Mode mode = this.p;
        int iIndexOf2 = 12;
        if (mode == Mode.DATE_TIME) {
            List<f> listY = y();
            this.i = listY;
            wheelAdapterV = v(this.b, listY);
            iIndexOf = this.i.indexOf(new f(this.h.get(11)));
            if (iIndexOf >= 0) {
                iIndexOf2 = iIndexOf;
            }
        } else if (mode == Mode.DATE) {
            List<e> listA = A();
            this.m = listA;
            wheelAdapterV = v(this.b, listA);
            iIndexOf2 = this.m.indexOf(new e(this.h.get(2) + 1));
        } else {
            List<f> listY2 = y();
            this.i = listY2;
            wheelAdapterV = v(this.b, listY2);
            iIndexOf = this.i.indexOf(new f(this.h.get(11)));
            if (iIndexOf >= 0) {
                iIndexOf2 = iIndexOf;
            }
        }
        this.b.setViewAdapter(wheelAdapterV);
        this.b.setCurrentItem(iIndexOf2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view) {
        TimeSelectListener timeSelectListener = this.g;
        if (timeSelectListener != null) {
            timeSelectListener.onTimeSelect(B());
            dismiss();
        }
    }

    private void J(long j) {
        this.h.setTimeInMillis(j);
    }

    private void K() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: lo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: mo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.I(view);
            }
        });
    }

    private void L() {
        this.a.addScrollingListener(new a());
        this.b.addScrollingListener(new b());
        this.c.addScrollingListener(new c());
    }

    private void initView(View view) {
        this.a = (WheelView) view.findViewById(R.id.wheel_1);
        this.b = (WheelView) view.findViewById(R.id.wheel_2);
        this.c = (WheelView) view.findViewById(R.id.wheel_3);
        this.d = (TextView) view.findViewById(R.id.title);
        this.e = (TextView) view.findViewById(R.id.cancel);
        this.f = (TextView) view.findViewById(R.id.confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i) {
        List<e> listX = x();
        this.n = listX;
        this.c.setViewAdapter(v(this.c, listX));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.o);
        this.h.set(5, i);
        if (this.h.getTimeInMillis() > calendar.getTimeInMillis()) {
            i = calendar.get(5);
        } else if (this.h.getTimeInMillis() < this.o) {
            i = calendar2.get(5);
        }
        this.h.set(5, i);
        try {
            this.c.setCurrentItem(this.n.indexOf(new e(i)), true);
        } catch (Exception e2) {
            HMLog.w(this.q, "mDayList.indexOf:" + e2, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.o);
        this.h.set(11, i);
        if (this.h.getTimeInMillis() > calendar.getTimeInMillis()) {
            i = calendar.get(11);
        } else if (this.h.getTimeInMillis() < this.o) {
            i = calendar2.get(11);
        }
        this.h.set(11, i);
        this.b.setCurrentItem(this.i.indexOf(new f(i)), true);
        s(this.j.get(this.c.getCurrentItem()).a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.o);
        this.h.set(12, i);
        if (this.h.getTimeInMillis() > calendar.getTimeInMillis()) {
            i = calendar.get(12);
        } else if (this.h.getTimeInMillis() < this.o) {
            i = calendar2.get(12);
        }
        this.h.set(12, i);
        this.c.setCurrentItem(this.j.indexOf(new f(i)), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(int i) {
        int i2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.o);
        this.h.set(2, i - 1);
        try {
            if (this.h.getTimeInMillis() <= calendar.getTimeInMillis()) {
                if (this.h.getTimeInMillis() < this.o) {
                    i2 = calendar2.get(2);
                }
                this.h.set(2, i - 1);
                this.b.setCurrentItem(this.m.indexOf(new e(i)), true);
                q(this.n.get(this.c.getCurrentItem()).a);
                return;
            }
            i2 = calendar.get(2);
            this.b.setCurrentItem(this.m.indexOf(new e(i)), true);
            q(this.n.get(this.c.getCurrentItem()).a);
            return;
        } catch (Exception e2) {
            HMLog.w(this.q, "mMonthList.indexOf:" + e2, new Object[0]);
            return;
        }
        i = i2 + 1;
        this.h.set(2, i - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        this.h.set(1, i);
        try {
            this.a.setCurrentItem(this.l.indexOf(new e(Math.min(calendar.get(1), i))), true);
            t(this.m.get(this.b.getCurrentItem()).a);
        } catch (Exception e2) {
            HMLog.w(this.q, "mYearList.indexOf:" + e2, new Object[0]);
        }
    }

    private WheelAdapter v(WheelView wheelView, List<? extends WheelAdapter.Item> list) {
        if (getActivity() == null) {
            return null;
        }
        WheelAdapter wheelAdapter = new WheelAdapter(getActivity(), 1, list.size(), wheelView, ContextCompat.getColor(getActivity(), R.color.blood_pressure_p4), ContextCompat.getColor(getActivity(), R.color.blood_pressure_s2), ContextCompat.getColor(getActivity(), R.color.blood_pressure_s3), false, 46, 9, 7, 7);
        wheelAdapter.setDataList(list);
        return wheelAdapter;
    }

    private List<d> w() {
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

    private List<e> x() {
        ArrayList arrayList = new ArrayList();
        int actualMaximum = this.h.getActualMaximum(5);
        for (int i = 1; i <= actualMaximum; i++) {
            arrayList.add(new e(i));
        }
        return arrayList;
    }

    private List<f> y() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 24; i++) {
            arrayList.add(new f(i));
        }
        return arrayList;
    }

    private List<f> z() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 60; i++) {
            arrayList.add(new f(i));
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.bp_layout_time_picker, viewGroup, false);
        initView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        D();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            attributes.width = -1;
            window.setAttributes(attributes);
        }
    }

    public void setMode(Mode mode) {
        this.p = mode;
    }

    public void show(FragmentManager fragmentManager, long j, TimeSelectListener timeSelectListener, String str) {
        J(j);
        this.g = timeSelectListener;
        show(fragmentManager, str);
    }
}

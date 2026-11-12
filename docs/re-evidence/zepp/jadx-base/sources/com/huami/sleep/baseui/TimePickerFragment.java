package com.huami.sleep.baseui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.timepicker.TimeModel;
import com.huami.sleep.R;
import com.huami.sleep.baseui.picker.adapter.CommonPickAdapter;
import com.huami.sleep.baseui.picker.adapter.PickAdapter;
import com.huami.sleep.util.JavaUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class TimePickerFragment extends Fragment {
    private static final String n = "TimePickerFragment";
    private static final String o = "param";
    private static final int p = View.generateViewId();
    private static final int q = View.generateViewId();
    private static final int r = View.generateViewId();
    private static final int s = View.generateViewId();
    private static final int t = View.generateViewId();
    private static final int u = View.generateViewId();
    private static final float v = 1.5f;
    private static final int w = 1;
    private static final int x = 0;
    private static final int y = 42;
    private PickerParams a;
    private Context b;
    private ViewGroup c;
    private WheelView d;
    private WheelView e;
    private PickAdapter f;
    private WheelView g;
    private WheelView h;
    private WheelView i;
    private WheelView j;
    private Calendar k;
    private OnTimeSelectedListener l;
    private OnWheelScrollListener m = new d();

    public static class Builder {
        private PickerParams a = new PickerParams();
        private Context b;

        public Builder(Context context) {
            this.b = context;
        }

        public TimePickerFragment create(int container, FragmentTransaction transaction) {
            TimePickerFragment timePickerFragmentX = TimePickerFragment.x(this.a);
            transaction.replace(container, timePickerFragmentX);
            transaction.commit();
            return timePickerFragmentX;
        }

        public Builder set24HourFormat(boolean is24HourFormat) {
            this.a.is24HourFormat = is24HourFormat;
            return this;
        }

        public Builder setDay(int start, int end, int current) {
            PickerParams pickerParams = this.a;
            pickerParams.hasDay = true;
            pickerParams.startDay = start;
            pickerParams.endDay = end;
            pickerParams.currentDay = current;
            return this;
        }

        public Builder setHour(int start, int end, int current) {
            PickerParams pickerParams = this.a;
            pickerParams.hasHour = true;
            pickerParams.startHour = start;
            pickerParams.endHour = end;
            pickerParams.currentHour = current;
            return this;
        }

        public Builder setMinute(int start, int end, int current) {
            PickerParams pickerParams = this.a;
            pickerParams.hasMinute = true;
            pickerParams.startMinute = start;
            pickerParams.endMinute = end;
            pickerParams.currentMinute = current;
            return this;
        }

        public Builder setMonth(int start, int end, int current) {
            PickerParams pickerParams = this.a;
            pickerParams.hasMonth = true;
            pickerParams.startMonth = start;
            pickerParams.endMonth = end;
            pickerParams.currentMonth = current;
            return this;
        }

        public Builder setShowGap(boolean isShow) {
            this.a.isShowGap = isShow;
            return this;
        }

        public Builder setYear(int start, int end, int current) {
            PickerParams pickerParams = this.a;
            pickerParams.hasYear = true;
            pickerParams.startYear = start;
            pickerParams.endYear = end;
            pickerParams.currentYear = current;
            return this;
        }
    }

    public interface OnTimeSelectedListener {
        void onSelected(Calendar time);
    }

    public static class PickerParams implements Parcelable {
        public static final Parcelable.Creator<PickerParams> CREATOR = new a();
        public int currentDay;
        public int currentHour;
        public int currentMinute;
        public int currentMonth;
        public int currentYear;
        public int endDay;
        public int endHour;
        public int endMinute;
        public int endMonth;
        public int endYear;
        public boolean hasDay;
        public boolean hasHour;
        public boolean hasMinute;
        public boolean hasMonth;
        public boolean hasYear;
        public boolean is24HourFormat;
        public boolean isShowGap;
        public int startDay;
        public int startHour;
        public int startMinute;
        public int startMonth;
        public int startYear;

        public class a implements Parcelable.Creator<PickerParams> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public PickerParams createFromParcel(Parcel source) {
                return new PickerParams(source);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public PickerParams[] newArray(int size) {
                return new PickerParams[size];
            }
        }

        public PickerParams() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.isShowGap ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.is24HourFormat ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.hasYear ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.startYear);
            parcel.writeInt(this.endYear);
            parcel.writeInt(this.currentYear);
            parcel.writeByte(this.hasMonth ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.startMonth);
            parcel.writeInt(this.endMonth);
            parcel.writeInt(this.currentMonth);
            parcel.writeByte(this.hasDay ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.startDay);
            parcel.writeInt(this.endDay);
            parcel.writeInt(this.currentDay);
            parcel.writeByte(this.hasHour ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.startHour);
            parcel.writeInt(this.endHour);
            parcel.writeInt(this.currentHour);
            parcel.writeByte(this.hasMinute ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.startMinute);
            parcel.writeInt(this.endMinute);
            parcel.writeInt(this.currentMinute);
        }

        public PickerParams(Parcel in) {
            this.isShowGap = in.readByte() != 0;
            this.is24HourFormat = in.readByte() != 0;
            this.hasYear = in.readByte() != 0;
            this.startYear = in.readInt();
            this.endYear = in.readInt();
            this.currentYear = in.readInt();
            this.hasMonth = in.readByte() != 0;
            this.startMonth = in.readInt();
            this.endMonth = in.readInt();
            this.currentMonth = in.readInt();
            this.hasDay = in.readByte() != 0;
            this.startDay = in.readInt();
            this.endDay = in.readInt();
            this.currentDay = in.readInt();
            this.hasHour = in.readByte() != 0;
            this.startHour = in.readInt();
            this.endHour = in.readInt();
            this.currentHour = in.readInt();
            this.hasMinute = in.readByte() != 0;
            this.startMinute = in.readInt();
            this.endMinute = in.readInt();
            this.currentMinute = in.readInt();
        }
    }

    public class a extends CommonPickAdapter {
        public a(Context context, int count, WheelView wheelView, int centerColor, int normalColor, int normalColorLight, boolean neewLoop, int itemHeightDP, int centerTextSizeDp, int normalTextSizeDp, int normalLightTextDp, int valueGap) {
            super(context, count, wheelView, centerColor, normalColor, normalColorLight, neewLoop, itemHeightDP, centerTextSizeDp, normalTextSizeDp, normalLightTextDp, valueGap);
        }

        @Override // com.huami.sleep.baseui.picker.adapter.CommonPickAdapter
        public String getItemString(int index) {
            int i;
            if (TimePickerFragment.this.a.startDay > TimePickerFragment.this.a.endDay) {
                i = index == 0 ? TimePickerFragment.this.a.startDay : TimePickerFragment.this.a.endDay;
            } else {
                i = TimePickerFragment.this.a.startDay + index;
            }
            HMLog.d(TimePickerFragment.n, "index:" + index + ", text:" + i, new Object[0]);
            return String.format(Locale.CHINA, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
        }
    }

    public class b implements PickAdapter.AmPmUpdateCallback {
        public b() {
        }

        @Override // com.huami.sleep.baseui.picker.adapter.PickAdapter.AmPmUpdateCallback
        public void getAmPm(int value) {
            TimePickerFragment.this.A(value);
        }

        @Override // com.huami.sleep.baseui.picker.adapter.PickAdapter.AmPmUpdateCallback
        public void getHour(int hour) {
            TimePickerFragment.this.z(hour);
        }
    }

    public class c implements PickAdapter.AmPmUpdateCallback {
        public c() {
        }

        @Override // com.huami.sleep.baseui.picker.adapter.PickAdapter.AmPmUpdateCallback
        public void getAmPm(int value) {
            TimePickerFragment.this.A(value);
        }

        @Override // com.huami.sleep.baseui.picker.adapter.PickAdapter.AmPmUpdateCallback
        public void getHour(int hour) {
            TimePickerFragment.this.z(hour);
        }
    }

    public class d implements OnWheelScrollListener {
        public d() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            if (TimePickerFragment.this.l == null) {
                return;
            }
            if (wheel.getId() == TimePickerFragment.p) {
                TimePickerFragment.this.k.set(1, wheel.getCurrentItem() + TimePickerFragment.this.a.startYear);
                HMLog.d(TimePickerFragment.n, "year : " + (wheel.getCurrentItem() + TimePickerFragment.this.a.startYear), new Object[0]);
            } else if (wheel.getId() == TimePickerFragment.q) {
                TimePickerFragment.this.k.set(2, wheel.getCurrentItem() + TimePickerFragment.this.a.startMonth);
                HMLog.d(TimePickerFragment.n, "month : " + (wheel.getCurrentItem() + TimePickerFragment.this.a.startMonth), new Object[0]);
            } else if (wheel.getId() == TimePickerFragment.r) {
                int currentItem = wheel.getCurrentItem() + TimePickerFragment.this.a.startDay;
                if (TimePickerFragment.this.a.startDay > TimePickerFragment.this.a.endDay) {
                    HMLog.d(TimePickerFragment.n, "finish day item:" + wheel.getCurrentItem(), new Object[0]);
                    HMLog.d(TimePickerFragment.n, "mParams.currentMonth" + TimePickerFragment.this.a.currentMonth, new Object[0]);
                    if (wheel.getCurrentItem() == 0) {
                        TimePickerFragment.this.k.set(2, TimePickerFragment.this.a.currentMonth - 1);
                        currentItem = TimePickerFragment.this.a.startDay;
                    } else {
                        TimePickerFragment.this.k.set(2, TimePickerFragment.this.a.currentMonth);
                        currentItem = TimePickerFragment.this.a.endDay;
                    }
                }
                TimePickerFragment.this.k.set(5, currentItem);
                HMLog.d(TimePickerFragment.n, "day of month : " + currentItem, new Object[0]);
            } else if (wheel.getId() == TimePickerFragment.s) {
                if (!TimePickerFragment.this.a.is24HourFormat) {
                    TimePickerFragment.this.k.set(11, TimePickerFragment.this.e.getCurrentItem() + TimePickerFragment.this.a.startHour);
                    HMLog.d(TimePickerFragment.n, "hour of day : " + (wheel.getCurrentItem() + TimePickerFragment.this.a.startHour), new Object[0]);
                }
            } else if (wheel.getId() == TimePickerFragment.t) {
                TimePickerFragment.this.k.set(11, wheel.getCurrentItem() + TimePickerFragment.this.a.startHour);
                HMLog.d(TimePickerFragment.n, "hour of day : " + (wheel.getCurrentItem() + TimePickerFragment.this.a.startHour), new Object[0]);
            } else if (wheel.getId() == TimePickerFragment.u) {
                TimePickerFragment.this.k.set(12, wheel.getCurrentItem() + TimePickerFragment.this.a.startMinute);
                HMLog.d(TimePickerFragment.n, "minute : " + (wheel.getCurrentItem() + TimePickerFragment.this.a.startMinute), new Object[0]);
            }
            HMLog.d(TimePickerFragment.n, "mCalendar : " + TimeUtils.debugTime(TimePickerFragment.this.k.getTimeInMillis()), new Object[0]);
            TimePickerFragment.this.l.onSelected(TimePickerFragment.this.k);
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(int amPm) {
        HMLog.d(n, "updateHourByAmPm : " + amPm, new Object[0]);
        if (this.a.is24HourFormat) {
            return;
        }
        int currentItem = this.e.getCurrentItem();
        HMLog.d(n, "cur hour =" + currentItem, new Object[0]);
        if (amPm == 0) {
            if (currentItem >= 12) {
                currentItem -= 12;
            }
        } else if (currentItem < 12) {
            currentItem += 12;
        }
        HMLog.d(n, "after hour =" + currentItem, new Object[0]);
        this.e.setCurrentItemLooped(currentItem);
    }

    private void initView() {
        this.c.findViewById(R.id.gap).setVisibility(this.a.isShowGap ? 0 : 8);
        w();
        v();
        s();
        if (!Language.isEnglish()) {
            r();
        }
        t();
        u();
        if (Language.isEnglish()) {
            r();
        }
        y(this.a.currentHour);
    }

    private CommonPickAdapter n() {
        PickerParams pickerParams = this.a;
        int i = pickerParams.startDay;
        int i2 = pickerParams.endDay;
        int i3 = i > i2 ? 2 : (i2 - i) + 1;
        Context context = this.b;
        return new a(context, i3, this.h, ContextCompat.getColor(context, R.color.p3), ContextCompat.getColor(this.b, R.color.s2), ContextCompat.getColor(this.b, R.color.s3), false, 42, 15, 12, 11, 1);
    }

    private PickAdapter o(WheelView view, int start, int end) {
        return p(view, start, end, true);
    }

    private PickAdapter p(WheelView view, int start, int end, boolean needLoop) {
        Context context = this.b;
        return new PickAdapter(context, start, end, view, ContextCompat.getColor(context, R.color.p3), ContextCompat.getColor(this.b, R.color.s2), ContextCompat.getColor(this.b, R.color.s3), needLoop, 42, 15, 12, 11, 1);
    }

    private View q(int id) {
        LinearLayout linearLayout = new LinearLayout(this.b);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        if (this.c.getChildCount() != 1) {
            View view = new View(this.b);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.b.getResources().getDimensionPixelSize(R.dimen.divider), -1);
            view.setBackgroundColor(JavaUtils.addAlpha(this.b, R.color.s3));
            view.setLayoutParams(layoutParams2);
            linearLayout.addView(view);
        }
        View wheelView = new WheelView(this.b);
        wheelView.setId(id);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1);
        layoutParams3.weight = 1.0f;
        wheelView.setLayoutParams(layoutParams3);
        linearLayout.addView(wheelView);
        this.c.addView(linearLayout);
        return wheelView;
    }

    private void r() {
        PickerParams pickerParams = this.a;
        if (pickerParams.is24HourFormat || !pickerParams.hasHour) {
            return;
        }
        int i = s;
        WheelView wheelView = (WheelView) q(i);
        this.d = wheelView;
        wheelView.setInterpolator(new DecelerateInterpolator(1.5f));
        HMLog.d(n, "ID_AMPM : " + i, new Object[0]);
        HMLog.d(n, "mAmPmWheel id : " + this.d.getId(), new Object[0]);
        Context context = this.b;
        PickAdapter pickAdapter = new PickAdapter(context, 0, 1, this.d, ContextCompat.getColor(context, R.color.p3), ContextCompat.getColor(this.b, R.color.s2), -2003199591, false, 42, 15, 12, 21, 1);
        pickAdapter.setUIStyle("normal");
        pickAdapter.setMode(17);
        this.d.setVisibleItems(2).setCenterDrawable(R.drawable.wheel_custom_val_white_1).setCenterStyle("", 18.0f).setViewAdapter(pickAdapter);
        this.d.addScrollingListener(this.m);
        pickAdapter.setAmPmUpdateCallback(new b());
    }

    private void s() {
        if (this.a.hasDay) {
            WheelView wheelView = (WheelView) q(r);
            this.h = wheelView;
            wheelView.setInterpolator(new DecelerateInterpolator(1.5f));
            this.h.setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1).setCenterStyle(getResources().getString(R.string.unit_date_day), R.color.p3, 8, 10.0f, -1.0f).setViewAdapter(n());
            this.h.addScrollingListener(this.m);
            this.h.setCurrentItem(this.a.currentDay);
            this.k.set(5, this.a.currentDay);
        }
    }

    private void t() {
        if (this.a.hasHour) {
            WheelView wheelView = (WheelView) q(t);
            this.e = wheelView;
            wheelView.setInterpolator(new DecelerateInterpolator(1.5f));
            WheelView wheelView2 = this.e;
            PickerParams pickerParams = this.a;
            this.f = o(wheelView2, pickerParams.startHour, pickerParams.endHour);
            this.e.setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1).setCenterStyle(getResources().getString(R.string.unit_hour), R.color.p3, 8, 10.0f, -1.0f).setViewAdapter(this.f);
            this.e.addScrollingListener(this.m);
            this.e.setCurrentItemLooped(this.a.currentHour);
            this.k.set(11, this.a.currentHour);
            this.f.setAmPmUpdateCallback(new c());
        }
    }

    private void u() {
        if (this.a.hasMinute) {
            WheelView wheelView = (WheelView) q(u);
            this.g = wheelView;
            wheelView.setInterpolator(new DecelerateInterpolator(1.5f));
            WheelView centerStyle = this.g.setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1).setCenterStyle(getResources().getString(R.string.unit_min), R.color.p3, 8, 10.0f, -1.0f);
            WheelView wheelView2 = this.g;
            PickerParams pickerParams = this.a;
            centerStyle.setViewAdapter(o(wheelView2, pickerParams.startMinute, pickerParams.endMinute));
            this.g.addScrollingListener(this.m);
            this.g.setCurrentItemLooped(this.a.currentMinute);
            this.k.set(12, this.a.currentMinute);
        }
    }

    private void v() {
        if (this.a.hasMonth) {
            WheelView wheelView = (WheelView) q(q);
            this.i = wheelView;
            wheelView.setInterpolator(new DecelerateInterpolator(1.5f));
            WheelView wheelView2 = this.i;
            PickerParams pickerParams = this.a;
            PickAdapter pickAdapterO = o(wheelView2, pickerParams.startMonth, pickerParams.endMonth);
            pickAdapterO.setUIStyle("normal");
            this.i.setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1).setCenterStyle(getString(R.string.month), R.color.p3, 8, 10.0f, -1.0f).setViewAdapter(pickAdapterO);
            this.i.addScrollingListener(this.m);
            this.i.setCurrentItemLooped(this.a.currentMonth);
            this.k.set(2, this.a.currentMonth);
        }
    }

    private void w() {
        if (this.a.hasYear) {
            WheelView wheelView = (WheelView) q(p);
            this.j = wheelView;
            wheelView.setInterpolator(new DecelerateInterpolator(1.5f));
            WheelView wheelView2 = this.j;
            PickerParams pickerParams = this.a;
            PickAdapter pickAdapterO = o(wheelView2, pickerParams.startYear, pickerParams.endYear);
            pickAdapterO.setUIStyle("normal");
            this.j.setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1).setCenterStyle(getString(R.string.year), R.color.p3, 8, 20.0f, -1.0f).setViewAdapter(pickAdapterO);
            this.j.addScrollingListener(this.m);
            this.j.setCurrentItemLooped(this.a.currentYear);
            this.k.set(1, this.a.currentYear);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TimePickerFragment x(PickerParams params) {
        TimePickerFragment timePickerFragment = new TimePickerFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(o, params);
        timePickerFragment.setArguments(bundle);
        return timePickerFragment;
    }

    private void y(int hour) {
        if (this.a.is24HourFormat) {
            this.f.setMode(9);
            this.e.setViewAdapter(this.f);
            return;
        }
        this.f.setMode(16);
        this.e.setViewAdapter(this.f);
        if (hour >= 13) {
            this.d.setCurrentItem(1);
            this.e.setCurrentItem(hour - 12);
        } else {
            this.d.setCurrentItem(0);
            this.e.setCurrentItem(hour);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int hour) {
        HMLog.d(n, "updateAmPmByHour hour=" + hour, new Object[0]);
        WheelView wheelView = this.d;
        if (wheelView == null || this.a.is24HourFormat) {
            return;
        }
        wheelView.setCurrentItem(hour >= 12 ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnTimeSelectedListener) {
            this.l = (OnTimeSelectedListener) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnWheelScrollListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.b = getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = (PickerParams) arguments.getParcelable(o);
        }
        Objects.requireNonNull(this.a, "you must set PickerParams");
        Calendar calendar = Calendar.getInstance();
        this.k = calendar;
        calendar.clear();
        HMLog.d(n, "mCalendar : " + TimeUtils.debugTime(this.k.getTimeInMillis()), new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.c = (ViewGroup) inflater.inflate(R.layout.fragment_pick_time, container, false);
        initView();
        return this.c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.l = null;
    }

    public void update(Calendar time) {
        HMLog.d(n, "update time : " + TimeUtils.debugTime(time.getTimeInMillis()), new Object[0]);
        this.k.setTime(time.getTime());
        WheelView wheelView = this.j;
        if (wheelView != null) {
            wheelView.setCurrentItem(time.get(1));
        }
        if (this.i != null) {
            this.i.setCurrentItem(this.k.get(2) - this.a.startMonth);
        }
        if (this.h != null) {
            int i = this.k.get(5);
            PickerParams pickerParams = this.a;
            int i2 = pickerParams.startDay;
            int i3 = i - i2;
            if (i2 > pickerParams.endDay) {
                i3 = i3 < 0 ? 1 : 0;
            }
            this.h.setCurrentItem(i3);
            if (i3 == 0) {
                this.a.currentMonth = this.k.get(2) + 1;
            } else {
                this.a.currentMonth = this.k.get(2);
            }
            HMLog.d(n, "mParams.currentMonth" + this.a.currentMonth, new Object[0]);
        }
        if (this.d != null && this.e != null) {
            y(this.k.get(11));
        }
        if (this.e != null) {
            this.e.setCurrentItemLooped(this.k.get(11) - this.a.startHour);
        }
        if (this.g != null) {
            int i4 = this.k.get(12);
            HMLog.d(n, "minute :" + i4, new Object[0]);
            int i5 = i4 - this.a.startMinute;
            HMLog.d(n, "index :" + i5, new Object[0]);
            this.g.setCurrentItemLooped(i5);
        }
    }

    public void updateDay(int start, int end, int current) {
        PickerParams pickerParams = this.a;
        pickerParams.startDay = start;
        pickerParams.endDay = end;
        pickerParams.currentDay = current;
        this.h.setViewAdapter(n());
    }
}

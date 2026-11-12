package com.xiaomi.hm.health.fragment;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huami.account.HMLoginManager;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bodyfat.model.BFUserInfo;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.fragment.PersonInfoSettingBirthdayFragment;
import com.xiaomi.hm.health.model.account.HMBirthday;
import com.xiaomi.hm.health.privacy.usecase.DetectDefaultFieldUseCase;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class PersonInfoSettingBirthdayFragment extends PersonInfoSettingBaseFragment {
    private static final String k = "PersonInfoSettingBirthdayFragment";
    private int e = Calendar.getInstance().get(1);
    private int f = Calendar.getInstance().get(2);
    private int g;
    private int h;
    private int i;
    private boolean j;

    public class a implements OnWheelScrollListener {
        public final /* synthetic */ WheelView a;
        public final /* synthetic */ PickAdapter b;
        public final /* synthetic */ PickAdapter c;
        public final /* synthetic */ WheelView d;
        public final /* synthetic */ TextView e;

        public a(final WheelView val$wheelMonth, final PickAdapter val$monthAdapterOutOfRange, final PickAdapter val$monthAdapter, final WheelView val$wheelYear, final TextView val$saveButton) {
            this.a = val$wheelMonth;
            this.b = val$monthAdapterOutOfRange;
            this.c = val$monthAdapter;
            this.d = val$wheelYear;
            this.e = val$saveButton;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            int i = 0;
            HMLog.d(PersonInfoSettingBirthdayFragment.k, "onScrollingFinished isAllowToBeUnderAge = " + PersonInfoSettingBirthdayFragment.this.j + ",getCurrentItem = " + wheel.getCurrentItem(), new Object[0]);
            if ((PersonInfoSettingBirthdayFragment.this.j ? 100 : 100 - PersonInfoSettingBirthdayFragment.this.i) != wheel.getCurrentItem()) {
                this.a.setViewAdapter(this.c);
            } else {
                if (!PersonInfoSettingBirthdayFragment.this.isAdded()) {
                    return;
                }
                WheelView wheelView = this.a;
                if (PersonInfoSettingBirthdayFragment.this.j) {
                    i = 6 > PersonInfoSettingBirthdayFragment.this.f ? PersonInfoSettingBirthdayFragment.this.f : 6;
                }
                wheelView.setCurrentItem(i);
                this.a.setViewAdapter(this.b);
            }
            DateUnselectedHelper.updateSaveButtonStateBySelected(this.d, this.a, this.e);
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
            HMLog.d(PersonInfoSettingBirthdayFragment.k, "onScrollingStarted " + wheel.getCurrentItem(), new Object[0]);
        }
    }

    public PersonInfoSettingBirthdayFragment() {
        int i = this.e;
        this.g = i - 100;
        this.h = i - 0;
        this.i = HMLoginManager.isInUSA() ? 13 : 16;
        this.j = false;
    }

    private int k() {
        if (GlobalConfig.get().isBuildMidong()) {
            return 0;
        }
        return k();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x01bd  */
    private void l(final TextView saveButton, final WheelView wheelYear, final WheelView wheelMonth) {
        PickAdapter pickAdapter;
        Birthday birthdayFromStr = Birthday.fromStr(this.mIsAddBaby ? SportDay.getToday().addMonth(-6).getKey() : this.mUserInfo.getBirthday());
        if (this.j) {
            this.e = Calendar.getInstance().get(1);
            this.f = Calendar.getInstance().get(2);
            int i = this.e;
            this.g = i - 100;
            this.h = i - 0;
        } else {
            this.e = Calendar.getInstance().get(1);
            this.f = Calendar.getInstance().get(2);
            int i2 = this.e;
            this.g = i2 - 100;
            this.h = i2 - this.i;
        }
        PickAdapter pickAdapter2 = new PickAdapter(getActivity(), this.g, this.h, wheelYear, getResources().getColor(R.color.p4), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, 46, 20, 20, 15, 1, k());
        if (!birthdayFromStr.isValid()) {
            pickAdapter2.setContainUnselectedValue(true);
        }
        wheelYear.setVisibleItems(5).setViewAdapter(pickAdapter2);
        r(wheelYear, getString(R.string.year));
        wheelYear.setCenterDrawable(R.drawable.wheel_view_select_bg_start);
        PickAdapter pickAdapter3 = new PickAdapter(getActivity(), 1, 12, wheelMonth, getResources().getColor(R.color.p4), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), true, 46, 20, 20, 15, 1, k());
        PickAdapter pickAdapter4 = new PickAdapter(getActivity(), 1, this.f + 1, wheelMonth, getResources().getColor(R.color.p4), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, 46, 20, 20, 15, 1, k());
        if (birthdayFromStr.isValid()) {
            pickAdapter = pickAdapter4;
        } else {
            pickAdapter3.setContainUnselectedValue(true);
            pickAdapter = pickAdapter4;
            pickAdapter.setContainUnselectedValue(true);
        }
        r(wheelMonth, getString(R.string.month));
        if (!HMLoginManager.isInNonContinental() || this.j) {
            if (!birthdayFromStr.isValid() || birthdayFromStr.getYear() - this.g < 100) {
                wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter3);
                wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
            } else {
                wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter);
                wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
            }
        } else if (birthdayFromStr.isValid()) {
            if (this.e - birthdayFromStr.getYear() == (HMLoginManager.isInUSA() ? 13 : 16)) {
                wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter);
                wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
            } else {
                wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter3);
                wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
            }
        } else {
            wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter3);
            wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        }
        if (birthdayFromStr.isValid()) {
            wheelYear.setCurrentItem(birthdayFromStr.getYear() - this.g);
            wheelMonth.setCurrentItemLooped(birthdayFromStr.getMonth() - 1);
        } else {
            wheelYear.setCurrentItem(wheelYear.getViewAdapter().getMBaseBundle() - 1);
            wheelMonth.setCurrentItemLooped(wheelMonth.getViewAdapter().getMBaseBundle() - 1);
            DateUnselectedHelper.updateSaveButtonState(saveButton, false);
            DateUnselectedHelper.observeMonthPicker(wheelMonth, new Function0() { // from class: au5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PersonInfoSettingBirthdayFragment.p(wheelYear, wheelMonth, saveButton);
                }
            });
        }
        wheelYear.addScrollingListener(new a(wheelMonth, pickAdapter, pickAdapter3, wheelYear, saveButton));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(WheelView wheelView, WheelView wheelView2, View view) {
        PersonInfoSettingBaseFragment.OnAddNewUserDataChangeListener onAddNewUserDataChangeListener;
        String birthday = this.mUserInfo.getBirthday();
        Birthday birthday2 = new Birthday();
        birthday2.setYear(wheelView.getCurrentItem() + this.g);
        birthday2.setMonth(wheelView2.getCurrentItem() + 1);
        boolean zExecute = DetectDefaultFieldUseCase.execute("birthday");
        if (!birthday2.toStringData().equals(birthday) || zExecute) {
            this.mUserInfo.setBirthday(birthday2.toStringData());
            if (this.mIsAddNew && (onAddNewUserDataChangeListener = this.mAddNewListener) != null) {
                onAddNewUserDataChangeListener.onChange(this.mUserInfo);
            } else if (!this.mIsAddGuest || this.mAddGuestListener == null) {
                save(2);
                PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener = this.mListener;
                if (onDataChangeListener != null) {
                    onDataChangeListener.onChange();
                }
            } else {
                BFUserInfo bFUserInfo = new BFUserInfo();
                bFUserInfo.setHmBirthday(HMBirthday.fromStr(birthday2.toStringData()).toString());
                bFUserInfo.setBirthday(birthday2.toStringData());
                this.mAddGuestListener.onChange(bFUserInfo);
            }
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit p(WheelView wheelView, WheelView wheelView2, TextView textView) {
        DateUnselectedHelper.updateSaveButtonStateBySelected(wheelView, wheelView2, textView);
        return Unit.INSTANCE;
    }

    private void q(LinearLayout parent, WheelView year, WheelView month, View separation) {
        parent.removeAllViews();
        String lowerCase = DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMM").toLowerCase(Locale.ROOT);
        WheelView wheelView = lowerCase.startsWith("y") || lowerCase.endsWith("m") ? year : month;
        parent.addView(wheelView);
        if (wheelView == year) {
            year = month;
        }
        parent.addView(year);
    }

    private void r(WheelView wheelView, String unitStr) {
        if (!GlobalConfig.get().isBuildMidong()) {
            wheelView.setCenterStyle(unitStr, R.color.p4, 25.0f);
        } else {
            wheelView.setCenterStyle(unitStr, R.color.s1, 15, 46.0f, -5.0f).setTextBold(true);
            wheelView.setStyle(WheelView.Style.NORMAL);
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_person_info_setting_birthday, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.wheels);
        final WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.setting_birth_wheel_year);
        final WheelView wheelView2 = (WheelView) viewInflate.findViewById(R.id.setting_birth_wheel_month);
        View viewFindViewById = viewInflate.findViewById(R.id.separation);
        TextView textView = (TextView) viewInflate.findViewById(R.id.birthday_btn_save);
        l(textView, wheelView, wheelView2);
        textView.setOnClickListener(new View.OnClickListener() { // from class: zt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(wheelView, wheelView2, view);
            }
        });
        viewInflate.findViewById(R.id.birthday_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: xt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n(view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: yt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.o(view);
            }
        });
        q(linearLayout, wheelView, wheelView2, viewFindViewById);
        return viewInflate;
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.mSelf) {
            this.j = true;
        } else if (!HMLoginManager.isAdult()) {
            this.j = false;
        } else if (!this.mIsAddNew && HMLoginManager.isInNonContinental()) {
            this.j = !HMLoginManager.isAdult(Birthday.fromStr(this.mUserInfo.getBirthday()).getAge());
        } else {
            this.j = true;
        }
        HMLog.d(k, "isAllowToBeUnderAge = " + this.j, new Object[0]);
    }
}

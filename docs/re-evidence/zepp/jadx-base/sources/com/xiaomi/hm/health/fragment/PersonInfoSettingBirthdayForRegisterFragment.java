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
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.util.ArraysUtil;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.fragment.PersonInfoSettingBirthdayForRegisterFragment;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.privacy.usecase.DetectDefaultFieldUseCase;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class PersonInfoSettingBirthdayForRegisterFragment extends PersonInfoSettingBaseFragment {
    public static final String EXTRA_REGISTER = "register";
    private static final String i = "PersonInfoSettingBirthdayForRegisterFragment";
    private boolean e = false;
    private int f;
    private int g;
    private int h;

    public class a implements OnWheelScrollListener {
        public final /* synthetic */ WheelView a;
        public final /* synthetic */ WheelView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ PickAdapter d;
        public final /* synthetic */ PickAdapter e;
        public final /* synthetic */ TextView f;

        public a(final WheelView val$wheelYear, final WheelView val$wheelMonth, final int val$monthEnd, final PickAdapter val$monthAdapterOutOfRange, final PickAdapter val$monthAdapter, final TextView val$saveButton) {
            this.a = val$wheelYear;
            this.b = val$wheelMonth;
            this.c = val$monthEnd;
            this.d = val$monthAdapterOutOfRange;
            this.e = val$monthAdapter;
            this.f = val$saveButton;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            if (this.a.getViewAdapter().getItemsCount() - 1 != wheel.getCurrentItem()) {
                this.b.setViewAdapter(this.e);
            } else {
                if (!PersonInfoSettingBirthdayForRegisterFragment.this.isAdded()) {
                    return;
                }
                WheelView wheelView = this.b;
                int i = this.c;
                wheelView.setCurrentItem(7 > i ? i - 1 : 6);
                this.b.setViewAdapter(this.d);
            }
            DateUnselectedHelper.updateSaveButtonStateBySelected(this.a, this.b, this.f);
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
            HMLog.d(PersonInfoSettingBirthdayForRegisterFragment.i, "onScrollingStarted " + wheel.getCurrentItem(), new Object[0]);
        }
    }

    private int h() {
        if (GlobalConfig.get().isBuildMidong()) {
            return 0;
        }
        return h();
    }

    private int i() {
        if (HMLoginManager.isInUSA()) {
            return this.g == 1 ? (this.f - 13) - 1 : this.f - 13;
        }
        if (HMLoginManager.isInNonContinental()) {
            return this.g == 1 ? (this.f - 16) - 1 : this.f - 16;
        }
        if (HMLoginManager.isInMainland() && j()) {
            return this.g == 1 ? (this.f - 14) - 1 : this.f - 14;
        }
        if (HMLoginManager.isInMainland()) {
            return this.g == 1 ? (this.f - 14) - 1 : this.f - 14;
        }
        if (!DeviceCenter.getInstance().hasBound(HMDeviceSource.MILI_FALCON_DISNEY) || this.e) {
            return this.f + 0;
        }
        return this.g == 1 ? (this.f - 14) - 1 : this.f - 14;
    }

    private boolean j() {
        List<Device> all = DeviceManager.getManager(getContext()).getAll();
        if (!ArraysUtil.isEmpty(all)) {
            for (Device device : all) {
                if (device != null && DeviceSource.isModelXihuDisney(device)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void k() {
        Calendar currentTime = HMPersonInfo.getCurrentTime();
        this.f = currentTime.get(1);
        this.g = currentTime.get(2) + 1;
        this.h = this.f - 100;
    }

    private void l(final TextView saveButton, final WheelView wheelYear, final WheelView wheelMonth) {
        int i2;
        Birthday birthdayFromStr = Birthday.fromStr(this.mIsAddBaby ? SportDay.getToday().addMonth(-6).getKey() : this.mUserInfo.getBirthday());
        this.h = this.f - 100;
        int i3 = i();
        int i4 = this.g;
        int i5 = i4 == 1 ? 12 : i4 - 1;
        PickAdapter pickAdapter = new PickAdapter(getActivity(), this.h, i3, wheelYear, getResources().getColor(R.color.p4), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, 46, 20, 20, 15, 1, h());
        if (!birthdayFromStr.isValid()) {
            pickAdapter.setContainUnselectedValue(true);
        }
        wheelYear.setVisibleItems(5).setViewAdapter(pickAdapter);
        r(wheelYear, getString(R.string.year));
        wheelYear.setCenterDrawable(R.drawable.wheel_view_select_bg_start);
        PickAdapter pickAdapter2 = new PickAdapter(getActivity(), 1, 12, wheelMonth, getResources().getColor(R.color.p4), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), true, 46, 20, 20, 15, 1, h());
        PickAdapter pickAdapter3 = new PickAdapter(getActivity(), 1, i5, wheelMonth, getResources().getColor(R.color.p4), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, 46, 20, 20, 15, 1, h());
        if (!birthdayFromStr.isValid()) {
            pickAdapter2.setContainUnselectedValue(true);
            pickAdapter3.setContainUnselectedValue(true);
        }
        if (HMLoginManager.isInUSA()) {
            i2 = 13;
        } else if (HMLoginManager.isInNonContinental()) {
            i2 = 16;
        } else {
            i2 = HMLoginManager.isInMainland() ? 14 : 0;
        }
        r(wheelMonth, getString(R.string.month));
        if (!birthdayFromStr.isValid() || birthdayFromStr.getYear() - this.h < 100 - i2) {
            wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter2);
            wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        } else {
            wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter3);
            wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        }
        if (birthdayFromStr.isValid()) {
            wheelYear.setCurrentItem(birthdayFromStr.getYear() - this.h);
            wheelMonth.setCurrentItemLooped(birthdayFromStr.getMonth() - 1);
        } else {
            wheelYear.setCurrentItem(wheelYear.getViewAdapter().getMBaseBundle() - 1);
            wheelMonth.setCurrentItemLooped(wheelMonth.getViewAdapter().getMBaseBundle() - 1);
            DateUnselectedHelper.updateSaveButtonState(saveButton, false);
            DateUnselectedHelper.observeMonthPicker(wheelMonth, new Function0() { // from class: tt5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return PersonInfoSettingBirthdayForRegisterFragment.p(wheelYear, wheelMonth, saveButton);
                }
            });
        }
        wheelYear.addScrollingListener(new a(wheelYear, wheelMonth, i5, pickAdapter3, pickAdapter2, saveButton));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(WheelView wheelView, WheelView wheelView2, View view) {
        PersonInfoSettingBaseFragment.OnAddNewUserDataChangeListener onAddNewUserDataChangeListener;
        String birthday = this.mUserInfo.getBirthday();
        Birthday birthday2 = new Birthday();
        birthday2.setYear(wheelView.getCurrentItem() + this.h);
        birthday2.setMonth(wheelView2.getCurrentItem() + 1);
        boolean zExecute = DetectDefaultFieldUseCase.execute("birthday");
        if (!birthday2.toStringData().equals(birthday) || zExecute) {
            this.mUserInfo.setBirthday(birthday2.toStringData());
            if (!this.mIsAddNew || (onAddNewUserDataChangeListener = this.mAddNewListener) == null) {
                save(2);
                PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener = this.mListener;
                if (onDataChangeListener != null) {
                    onDataChangeListener.onChange();
                }
            } else {
                onAddNewUserDataChangeListener.onChange(this.mUserInfo);
            }
            HMAccountWebExtAPI.uploadUserBirthdayASync();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        dismiss();
    }

    public static PersonInfoSettingBirthdayForRegisterFragment newInstance(boolean isRegister) {
        PersonInfoSettingBirthdayForRegisterFragment personInfoSettingBirthdayForRegisterFragment = new PersonInfoSettingBirthdayForRegisterFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("register", isRegister);
        personInfoSettingBirthdayForRegisterFragment.setArguments(bundle);
        return personInfoSettingBirthdayForRegisterFragment;
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
        String lowerCase = DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMM").toLowerCase();
        WheelView wheelView = lowerCase.startsWith("y") || lowerCase.endsWith("m") ? year : month;
        parent.addView(wheelView);
        parent.addView(separation);
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
        l((TextView) viewInflate.findViewById(R.id.birthday_btn_save), wheelView, wheelView2);
        viewInflate.findViewById(R.id.birthday_btn_save).setOnClickListener(new View.OnClickListener() { // from class: st5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(wheelView, wheelView2, view);
            }
        });
        viewInflate.findViewById(R.id.birthday_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: qt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n(view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: rt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.o(view);
            }
        });
        q(linearLayout, wheelView, wheelView2, viewFindViewById);
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: isWidePadding */
    public boolean getIsMiDong() {
        return true;
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.e = arguments.getBoolean("register", true);
        }
        k();
    }
}

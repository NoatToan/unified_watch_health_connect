package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentPersonInfoSettingBirthdayBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView birthdayBtnCancel;

    @NonNull
    public final TextView birthdayBtnSave;

    @NonNull
    public final View separation;

    @NonNull
    public final WheelView settingBirthWheelMonth;

    @NonNull
    public final WheelView settingBirthWheelYear;

    @NonNull
    public final LinearLayout wheels;

    private FragmentPersonInfoSettingBirthdayBinding(@NonNull LinearLayout rootView, @NonNull TextView birthdayBtnCancel, @NonNull TextView birthdayBtnSave, @NonNull View separation, @NonNull WheelView settingBirthWheelMonth, @NonNull WheelView settingBirthWheelYear, @NonNull LinearLayout wheels) {
        this.a = rootView;
        this.birthdayBtnCancel = birthdayBtnCancel;
        this.birthdayBtnSave = birthdayBtnSave;
        this.separation = separation;
        this.settingBirthWheelMonth = settingBirthWheelMonth;
        this.settingBirthWheelYear = settingBirthWheelYear;
        this.wheels = wheels;
    }

    @NonNull
    public static FragmentPersonInfoSettingBirthdayBinding bind(@NonNull View rootView) {
        int i = R.id.birthday_btn_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.birthday_btn_cancel);
        if (textView != null) {
            i = R.id.birthday_btn_save;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.birthday_btn_save);
            if (textView2 != null) {
                i = R.id.separation;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.separation);
                if (viewFindChildViewById != null) {
                    i = R.id.setting_birth_wheel_month;
                    WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.setting_birth_wheel_month);
                    if (wheelView != null) {
                        i = R.id.setting_birth_wheel_year;
                        WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.setting_birth_wheel_year);
                        if (wheelView2 != null) {
                            i = R.id.wheels;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.wheels);
                            if (linearLayout != null) {
                                return new FragmentPersonInfoSettingBirthdayBinding((LinearLayout) rootView, textView, textView2, viewFindChildViewById, wheelView, wheelView2, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPersonInfoSettingBirthdayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPersonInfoSettingBirthdayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_person_info_setting_birthday, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}

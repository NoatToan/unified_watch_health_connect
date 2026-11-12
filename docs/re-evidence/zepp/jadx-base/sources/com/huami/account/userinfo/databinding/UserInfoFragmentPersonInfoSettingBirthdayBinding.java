package com.huami.account.userinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.account.userinfo.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes4.dex */
public final class UserInfoFragmentPersonInfoSettingBirthdayBinding implements ViewBinding {

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

    private UserInfoFragmentPersonInfoSettingBirthdayBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.birthdayBtnCancel = textView;
        this.birthdayBtnSave = textView2;
        this.separation = view;
        this.settingBirthWheelMonth = wheelView;
        this.settingBirthWheelYear = wheelView2;
        this.wheels = linearLayout2;
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingBirthdayBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.birthday_btn_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.birthday_btn_save;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.separation))) != null) {
                i = R.id.setting_birth_wheel_month;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView != null) {
                    i = R.id.setting_birth_wheel_year;
                    WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                    if (wheelView2 != null) {
                        i = R.id.wheels;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            return new UserInfoFragmentPersonInfoSettingBirthdayBinding((LinearLayout) view, textView, textView2, viewFindChildViewById, wheelView, wheelView2, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingBirthdayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingBirthdayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_info_fragment_person_info_setting_birthday, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}

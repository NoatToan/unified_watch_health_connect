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
public final class UserInfoFragmentPersonInfoSettingHeightBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView dialogTitle;

    @NonNull
    public final TextView heightBtnCancel;

    @NonNull
    public final TextView heightBtnSave;

    @NonNull
    public final WheelView infoHeightFootWheel;

    @NonNull
    public final WheelView infoHeightWheel;

    private UserInfoFragmentPersonInfoSettingHeightBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull WheelView wheelView, @NonNull WheelView wheelView2) {
        this.a = linearLayout;
        this.dialogTitle = textView;
        this.heightBtnCancel = textView2;
        this.heightBtnSave = textView3;
        this.infoHeightFootWheel = wheelView;
        this.infoHeightWheel = wheelView2;
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingHeightBinding bind(@NonNull View view) {
        int i = R.id.dialog_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.height_btn_cancel;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.height_btn_save;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.info_height_foot_wheel;
                    WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                    if (wheelView != null) {
                        i = R.id.info_height_wheel;
                        WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                        if (wheelView2 != null) {
                            return new UserInfoFragmentPersonInfoSettingHeightBinding((LinearLayout) view, textView, textView2, textView3, wheelView, wheelView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingHeightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingHeightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_info_fragment_person_info_setting_height, viewGroup, false);
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

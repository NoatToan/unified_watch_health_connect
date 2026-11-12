package com.huami.account.userinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.account.userinfo.R;

/* JADX INFO: loaded from: classes4.dex */
public final class UserInfoFragmentPersonInfoSettingGenderBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView infoGenderFemale;

    @NonNull
    public final TextView infoGenderFemaleTxt;

    @NonNull
    public final ImageView infoGenderMale;

    @NonNull
    public final TextView infoGenderMaleTxt;

    @NonNull
    public final LinearLayout personInfoFemaleArea;

    @NonNull
    public final LinearLayout personInfoMaleArea;

    @NonNull
    public final TextView settingGenderCancel;

    private UserInfoFragmentPersonInfoSettingGenderBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3) {
        this.a = linearLayout;
        this.infoGenderFemale = imageView;
        this.infoGenderFemaleTxt = textView;
        this.infoGenderMale = imageView2;
        this.infoGenderMaleTxt = textView2;
        this.personInfoFemaleArea = linearLayout2;
        this.personInfoMaleArea = linearLayout3;
        this.settingGenderCancel = textView3;
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingGenderBinding bind(@NonNull View view) {
        int i = R.id.info_gender_female;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.info_gender_female_txt;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.info_gender_male;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.info_gender_male_txt;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.person_info_female_area;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.person_info_male_area;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = R.id.setting_gender_cancel;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new UserInfoFragmentPersonInfoSettingGenderBinding((LinearLayout) view, imageView, textView, imageView2, textView2, linearLayout, linearLayout2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingGenderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingGenderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_info_fragment_person_info_setting_gender, viewGroup, false);
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

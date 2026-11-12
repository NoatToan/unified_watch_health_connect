package com.xiaomi.hm.health.databinding;

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
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentPersonInfoSettingGenderBinding implements ViewBinding {

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

    private FragmentPersonInfoSettingGenderBinding(@NonNull LinearLayout rootView, @NonNull ImageView infoGenderFemale, @NonNull TextView infoGenderFemaleTxt, @NonNull ImageView infoGenderMale, @NonNull TextView infoGenderMaleTxt, @NonNull LinearLayout personInfoFemaleArea, @NonNull LinearLayout personInfoMaleArea, @NonNull TextView settingGenderCancel) {
        this.a = rootView;
        this.infoGenderFemale = infoGenderFemale;
        this.infoGenderFemaleTxt = infoGenderFemaleTxt;
        this.infoGenderMale = infoGenderMale;
        this.infoGenderMaleTxt = infoGenderMaleTxt;
        this.personInfoFemaleArea = personInfoFemaleArea;
        this.personInfoMaleArea = personInfoMaleArea;
        this.settingGenderCancel = settingGenderCancel;
    }

    @NonNull
    public static FragmentPersonInfoSettingGenderBinding bind(@NonNull View rootView) {
        int i = R.id.info_gender_female;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.info_gender_female);
        if (imageView != null) {
            i = R.id.info_gender_female_txt;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.info_gender_female_txt);
            if (textView != null) {
                i = R.id.info_gender_male;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.info_gender_male);
                if (imageView2 != null) {
                    i = R.id.info_gender_male_txt;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.info_gender_male_txt);
                    if (textView2 != null) {
                        i = R.id.person_info_female_area;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.person_info_female_area);
                        if (linearLayout != null) {
                            i = R.id.person_info_male_area;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.person_info_male_area);
                            if (linearLayout2 != null) {
                                i = R.id.setting_gender_cancel;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.setting_gender_cancel);
                                if (textView3 != null) {
                                    return new FragmentPersonInfoSettingGenderBinding((LinearLayout) rootView, imageView, textView, imageView2, textView2, linearLayout, linearLayout2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPersonInfoSettingGenderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPersonInfoSettingGenderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_person_info_setting_gender, parent, false);
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

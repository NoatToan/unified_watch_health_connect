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
public final class FragmentPersonInfoSettingHeightBinding implements ViewBinding {

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

    private FragmentPersonInfoSettingHeightBinding(@NonNull LinearLayout rootView, @NonNull TextView dialogTitle, @NonNull TextView heightBtnCancel, @NonNull TextView heightBtnSave, @NonNull WheelView infoHeightFootWheel, @NonNull WheelView infoHeightWheel) {
        this.a = rootView;
        this.dialogTitle = dialogTitle;
        this.heightBtnCancel = heightBtnCancel;
        this.heightBtnSave = heightBtnSave;
        this.infoHeightFootWheel = infoHeightFootWheel;
        this.infoHeightWheel = infoHeightWheel;
    }

    @NonNull
    public static FragmentPersonInfoSettingHeightBinding bind(@NonNull View rootView) {
        int i = R.id.dialog_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_title);
        if (textView != null) {
            i = R.id.height_btn_cancel;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.height_btn_cancel);
            if (textView2 != null) {
                i = R.id.height_btn_save;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.height_btn_save);
                if (textView3 != null) {
                    i = R.id.info_height_foot_wheel;
                    WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.info_height_foot_wheel);
                    if (wheelView != null) {
                        i = R.id.info_height_wheel;
                        WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.info_height_wheel);
                        if (wheelView2 != null) {
                            return new FragmentPersonInfoSettingHeightBinding((LinearLayout) rootView, textView, textView2, textView3, wheelView, wheelView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPersonInfoSettingHeightBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPersonInfoSettingHeightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_person_info_setting_height, parent, false);
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

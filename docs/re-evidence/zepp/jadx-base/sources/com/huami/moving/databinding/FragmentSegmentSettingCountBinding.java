package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentSegmentSettingCountBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView heightBtnCancel;

    @NonNull
    public final TextView heightBtnSave;

    @NonNull
    public final WheelView infoHeightFootWheel;

    @NonNull
    public final WheelView infoHeightWheel;

    @NonNull
    public final View wheelSplitLine;

    private FragmentSegmentSettingCountBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull View view) {
        this.a = linearLayout;
        this.heightBtnCancel = textView;
        this.heightBtnSave = textView2;
        this.infoHeightFootWheel = wheelView;
        this.infoHeightWheel = wheelView2;
        this.wheelSplitLine = view;
    }

    @NonNull
    public static FragmentSegmentSettingCountBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.height_btn_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.height_btn_save;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.info_height_foot_wheel;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView != null) {
                    i = R.id.info_height_wheel;
                    WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                    if (wheelView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.wheel_split_line))) != null) {
                        return new FragmentSegmentSettingCountBinding((LinearLayout) view, textView, textView2, wheelView, wheelView2, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSegmentSettingCountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSegmentSettingCountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_segment_setting_count, viewGroup, false);
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

package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes6.dex */
public final class BpLayoutTimePickerBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final AppCompatTextView cancel;

    @NonNull
    public final AppCompatTextView confirm;

    @NonNull
    public final View divider;

    @NonNull
    public final View divider2;

    @NonNull
    public final View divider3;

    @NonNull
    public final AppCompatTextView title;

    @NonNull
    public final ConstraintLayout wheel;

    @NonNull
    public final WheelView wheel1;

    @NonNull
    public final WheelView wheel2;

    @NonNull
    public final WheelView wheel3;

    private BpLayoutTimePickerBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull AppCompatTextView appCompatTextView3, @NonNull ConstraintLayout constraintLayout, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull WheelView wheelView3) {
        this.a = frameLayout;
        this.cancel = appCompatTextView;
        this.confirm = appCompatTextView2;
        this.divider = view;
        this.divider2 = view2;
        this.divider3 = view3;
        this.title = appCompatTextView3;
        this.wheel = constraintLayout;
        this.wheel1 = wheelView;
        this.wheel2 = wheelView2;
        this.wheel3 = wheelView3;
    }

    @NonNull
    public static BpLayoutTimePickerBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = R.id.cancel;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.confirm;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.divider_2))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.divider_3))) != null) {
                i = R.id.title;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    i = R.id.wheel;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.wheel_1;
                        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                        if (wheelView != null) {
                            i = R.id.wheel_2;
                            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                            if (wheelView2 != null) {
                                i = R.id.wheel_3;
                                WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i);
                                if (wheelView3 != null) {
                                    return new BpLayoutTimePickerBinding((FrameLayout) view, appCompatTextView, appCompatTextView2, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, appCompatTextView3, constraintLayout, wheelView, wheelView2, wheelView3);
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
    public static BpLayoutTimePickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BpLayoutTimePickerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bp_layout_time_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}

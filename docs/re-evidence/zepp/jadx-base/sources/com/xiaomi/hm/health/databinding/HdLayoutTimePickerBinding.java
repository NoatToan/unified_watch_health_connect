package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes20.dex */
public final class HdLayoutTimePickerBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final TypefaceTextView cancel;

    @NonNull
    public final TypefaceTextView confirm;

    @NonNull
    public final View divider;

    @NonNull
    public final View divider2;

    @NonNull
    public final View divider3;

    @NonNull
    public final TypefaceTextView title;

    @NonNull
    public final ConstraintLayout wheel;

    @NonNull
    public final WheelView wheel1;

    @NonNull
    public final WheelView wheel2;

    @NonNull
    public final WheelView wheel3;

    private HdLayoutTimePickerBinding(@NonNull FrameLayout rootView, @NonNull TypefaceTextView cancel, @NonNull TypefaceTextView confirm, @NonNull View divider, @NonNull View divider2, @NonNull View divider3, @NonNull TypefaceTextView title, @NonNull ConstraintLayout wheel, @NonNull WheelView wheel1, @NonNull WheelView wheel2, @NonNull WheelView wheel3) {
        this.a = rootView;
        this.cancel = cancel;
        this.confirm = confirm;
        this.divider = divider;
        this.divider2 = divider2;
        this.divider3 = divider3;
        this.title = title;
        this.wheel = wheel;
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
    }

    @NonNull
    public static HdLayoutTimePickerBinding bind(@NonNull View rootView) {
        int i = R.id.cancel;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (typefaceTextView != null) {
            i = R.id.confirm;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.confirm);
            if (typefaceTextView2 != null) {
                i = R.id.divider;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                if (viewFindChildViewById != null) {
                    i = R.id.divider_2;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.divider_2);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.divider_3;
                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.divider_3);
                        if (viewFindChildViewById3 != null) {
                            i = R.id.title;
                            TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.title);
                            if (typefaceTextView3 != null) {
                                i = R.id.wheel;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.wheel);
                                if (constraintLayout != null) {
                                    i = R.id.wheel_1;
                                    WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wheel_1);
                                    if (wheelView != null) {
                                        i = R.id.wheel_2;
                                        WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wheel_2);
                                        if (wheelView2 != null) {
                                            i = R.id.wheel_3;
                                            WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wheel_3);
                                            if (wheelView3 != null) {
                                                return new HdLayoutTimePickerBinding((FrameLayout) rootView, typefaceTextView, typefaceTextView2, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, typefaceTextView3, constraintLayout, wheelView, wheelView2, wheelView3);
                                            }
                                        }
                                    }
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
    public static HdLayoutTimePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HdLayoutTimePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.hd_layout_time_picker, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}

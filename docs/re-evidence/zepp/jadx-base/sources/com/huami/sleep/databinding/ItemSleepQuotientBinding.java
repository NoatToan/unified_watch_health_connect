package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ItemSleepQuotientBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final ImageView sleepQuotientArrow;

    @NonNull
    public final TextView sleepQuotientName;

    @NonNull
    public final TextView sleepQuotientRef;

    @NonNull
    public final TextView sleepQuotientStartDetection;

    @NonNull
    public final TextView sleepQuotientValue;

    private ItemSleepQuotientBinding(@NonNull ConstraintLayout rootView, @NonNull Barrier barrier, @NonNull ImageView sleepQuotientArrow, @NonNull TextView sleepQuotientName, @NonNull TextView sleepQuotientRef, @NonNull TextView sleepQuotientStartDetection, @NonNull TextView sleepQuotientValue) {
        this.a = rootView;
        this.barrier = barrier;
        this.sleepQuotientArrow = sleepQuotientArrow;
        this.sleepQuotientName = sleepQuotientName;
        this.sleepQuotientRef = sleepQuotientRef;
        this.sleepQuotientStartDetection = sleepQuotientStartDetection;
        this.sleepQuotientValue = sleepQuotientValue;
    }

    @NonNull
    public static ItemSleepQuotientBinding bind(@NonNull View rootView) {
        int i = R.id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, i);
        if (barrier != null) {
            i = R.id.sleep_quotient_arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.sleep_quotient_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.sleep_quotient_ref;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.sleep_quotient_start_detection;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.sleep_quotient_value;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                return new ItemSleepQuotientBinding((ConstraintLayout) rootView, barrier, imageView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSleepQuotientBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSleepQuotientBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sleep_quotient, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}

package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class ItemNapSleepRecordBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TypefaceTextView duration;

    @NonNull
    public final TypefaceTextView time;

    private ItemNapSleepRecordBinding(@NonNull ConstraintLayout rootView, @NonNull TypefaceTextView duration, @NonNull TypefaceTextView time) {
        this.a = rootView;
        this.duration = duration;
        this.time = time;
    }

    @NonNull
    public static ItemNapSleepRecordBinding bind(@NonNull View rootView) {
        int i = R.id.duration;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
        if (typefaceTextView != null) {
            i = R.id.time;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
            if (typefaceTextView2 != null) {
                return new ItemNapSleepRecordBinding((ConstraintLayout) rootView, typefaceTextView, typefaceTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemNapSleepRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemNapSleepRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_nap_sleep_record, parent, false);
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

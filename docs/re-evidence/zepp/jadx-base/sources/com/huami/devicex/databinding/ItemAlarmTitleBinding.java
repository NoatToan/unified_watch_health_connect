package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemAlarmTitleBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final TypefaceTextView tvTitle;

    private ItemAlarmTitleBinding(@NonNull FrameLayout frameLayout, @NonNull TypefaceTextView typefaceTextView) {
        this.a = frameLayout;
        this.tvTitle = typefaceTextView;
    }

    @NonNull
    public static ItemAlarmTitleBinding bind(@NonNull View view) {
        int i = R.id.tv_title;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            return new ItemAlarmTitleBinding((FrameLayout) view, typefaceTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAlarmTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemAlarmTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_alarm_title, viewGroup, false);
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

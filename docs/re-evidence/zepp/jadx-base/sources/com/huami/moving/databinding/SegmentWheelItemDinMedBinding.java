package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class SegmentWheelItemDinMedBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TypefaceTextView contentTxt;

    private SegmentWheelItemDinMedBinding(@NonNull RelativeLayout relativeLayout, @NonNull TypefaceTextView typefaceTextView) {
        this.a = relativeLayout;
        this.contentTxt = typefaceTextView;
    }

    @NonNull
    public static SegmentWheelItemDinMedBinding bind(@NonNull View view) {
        int i = R.id.content_txt;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            return new SegmentWheelItemDinMedBinding((RelativeLayout) view, typefaceTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SegmentWheelItemDinMedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SegmentWheelItemDinMedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.segment_wheel_item_din_med, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}

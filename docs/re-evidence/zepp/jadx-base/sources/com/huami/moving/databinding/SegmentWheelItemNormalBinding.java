package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class SegmentWheelItemNormalBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView contentTxt;

    private SegmentWheelItemNormalBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.a = relativeLayout;
        this.contentTxt = textView;
    }

    @NonNull
    public static SegmentWheelItemNormalBinding bind(@NonNull View view) {
        int i = R.id.content_txt;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new SegmentWheelItemNormalBinding((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SegmentWheelItemNormalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SegmentWheelItemNormalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.segment_wheel_item_normal, viewGroup, false);
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

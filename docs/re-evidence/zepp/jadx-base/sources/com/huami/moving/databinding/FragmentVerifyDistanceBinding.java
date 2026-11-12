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
public final class FragmentVerifyDistanceBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView heightVerifyCancel;

    @NonNull
    public final TextView heightVerifySave;

    @NonNull
    public final WheelView wvVerifyDistance;

    private FragmentVerifyDistanceBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WheelView wheelView) {
        this.a = linearLayout;
        this.heightVerifyCancel = textView;
        this.heightVerifySave = textView2;
        this.wvVerifyDistance = wheelView;
    }

    @NonNull
    public static FragmentVerifyDistanceBinding bind(@NonNull View view) {
        int i = R.id.height_verify_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.height_verify_save;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.wv_verify_distance;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView != null) {
                    return new FragmentVerifyDistanceBinding((LinearLayout) view, textView, textView2, wheelView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentVerifyDistanceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentVerifyDistanceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_verify_distance, viewGroup, false);
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

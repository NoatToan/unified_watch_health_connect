package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class UnlockDistanceLayoutBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView arrowIv;

    @NonNull
    public final TextView distanceSubTitleTv;

    @NonNull
    public final TextView distanceTv;

    @NonNull
    public final TextView title;

    @NonNull
    public final LinearLayout unlockDistanceLayout;

    private UnlockDistanceLayoutBinding(@NonNull LinearLayout rootView, @NonNull ImageView arrowIv, @NonNull TextView distanceSubTitleTv, @NonNull TextView distanceTv, @NonNull TextView title, @NonNull LinearLayout unlockDistanceLayout) {
        this.a = rootView;
        this.arrowIv = arrowIv;
        this.distanceSubTitleTv = distanceSubTitleTv;
        this.distanceTv = distanceTv;
        this.title = title;
        this.unlockDistanceLayout = unlockDistanceLayout;
    }

    @NonNull
    public static UnlockDistanceLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.arrow_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.arrow_iv);
        if (imageView != null) {
            i = R.id.distance_sub_title_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.distance_sub_title_tv);
            if (textView != null) {
                i = R.id.distance_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.distance_tv);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                    if (textView3 != null) {
                        LinearLayout linearLayout = (LinearLayout) rootView;
                        return new UnlockDistanceLayoutBinding(linearLayout, imageView, textView, textView2, textView3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static UnlockDistanceLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static UnlockDistanceLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.unlock_distance_layout, parent, false);
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

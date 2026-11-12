package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentSportHrTipsBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView ivImage;

    @NonNull
    public final TextView knowBtn;

    @NonNull
    public final TextView tvInfo1;

    @NonNull
    public final TextView tvInfo2;

    @NonNull
    public final TextView tvTitle;

    private FragmentSportHrTipsBinding(@NonNull RelativeLayout rootView, @NonNull ImageView ivImage, @NonNull TextView knowBtn, @NonNull TextView tvInfo1, @NonNull TextView tvInfo2, @NonNull TextView tvTitle) {
        this.a = rootView;
        this.ivImage = ivImage;
        this.knowBtn = knowBtn;
        this.tvInfo1 = tvInfo1;
        this.tvInfo2 = tvInfo2;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static FragmentSportHrTipsBinding bind(@NonNull View rootView) {
        int i = R.id.iv_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_image);
        if (imageView != null) {
            i = R.id.know_btn;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.know_btn);
            if (textView != null) {
                i = R.id.tv_info_1;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info_1);
                if (textView2 != null) {
                    i = R.id.tv_info_2;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info_2);
                    if (textView3 != null) {
                        i = R.id.tv_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                        if (textView4 != null) {
                            return new FragmentSportHrTipsBinding((RelativeLayout) rootView, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSportHrTipsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportHrTipsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_hr_tips, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}

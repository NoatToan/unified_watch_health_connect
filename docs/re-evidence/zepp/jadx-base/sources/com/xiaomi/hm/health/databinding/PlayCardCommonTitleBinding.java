package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayCardCommonTitleBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final TypefaceTextView tvEnd;

    @NonNull
    public final TypefaceTextView tvName;

    private PlayCardCommonTitleBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivIcon, @NonNull TypefaceTextView tvEnd, @NonNull TypefaceTextView tvName) {
        this.a = rootView;
        this.ivIcon = ivIcon;
        this.tvEnd = tvEnd;
        this.tvName = tvName;
    }

    @NonNull
    public static PlayCardCommonTitleBinding bind(@NonNull View rootView) {
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
        if (imageView != null) {
            i = R.id.tv_end;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_end);
            if (typefaceTextView != null) {
                i = R.id.tv_name;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                if (typefaceTextView2 != null) {
                    return new PlayCardCommonTitleBinding((LinearLayout) rootView, imageView, typefaceTextView, typefaceTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayCardCommonTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardCommonTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_common_title, parent, false);
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

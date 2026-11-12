package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemSportingDataBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final LinearLayoutCompat dataContent;

    @NonNull
    public final FrameLayout dataRoot;

    @NonNull
    public final ImageView ivDataIcon;

    @NonNull
    public final TextView tvDataName;

    private ItemSportingDataBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.a = frameLayout;
        this.dataContent = linearLayoutCompat;
        this.dataRoot = frameLayout2;
        this.ivDataIcon = imageView;
        this.tvDataName = textView;
    }

    @NonNull
    public static ItemSportingDataBinding bind(@NonNull View view) {
        int i = R.id.data_content;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i = R.id.iv_data_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_data_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new ItemSportingDataBinding(frameLayout, linearLayoutCompat, frameLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportingDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemSportingDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_sporting_data, viewGroup, false);
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

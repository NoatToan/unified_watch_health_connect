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
public final class ItemKeepAliveBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView itemKeepAliveArrow;

    @NonNull
    public final TextView itemKeepAliveTv;

    private ItemKeepAliveBinding(@NonNull LinearLayout rootView, @NonNull ImageView itemKeepAliveArrow, @NonNull TextView itemKeepAliveTv) {
        this.a = rootView;
        this.itemKeepAliveArrow = itemKeepAliveArrow;
        this.itemKeepAliveTv = itemKeepAliveTv;
    }

    @NonNull
    public static ItemKeepAliveBinding bind(@NonNull View rootView) {
        int i = R.id.item_keep_alive_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_keep_alive_arrow);
        if (imageView != null) {
            i = R.id.item_keep_alive_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_keep_alive_tv);
            if (textView != null) {
                return new ItemKeepAliveBinding((LinearLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemKeepAliveBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemKeepAliveBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_keep_alive, parent, false);
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

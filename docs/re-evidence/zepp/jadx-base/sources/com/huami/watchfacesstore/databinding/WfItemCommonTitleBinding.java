package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfItemCommonTitleBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView tvHomeItemTitle;

    @NonNull
    public final TextView tvHomeMore;

    private WfItemCommonTitleBinding(@NonNull LinearLayout rootView, @NonNull TextView tvHomeItemTitle, @NonNull TextView tvHomeMore) {
        this.a = rootView;
        this.tvHomeItemTitle = tvHomeItemTitle;
        this.tvHomeMore = tvHomeMore;
    }

    @NonNull
    public static WfItemCommonTitleBinding bind(@NonNull View rootView) {
        int i = R.id.tv_home_item_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.tv_home_more;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                return new WfItemCommonTitleBinding((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfItemCommonTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfItemCommonTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_item_common_title, parent, false);
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

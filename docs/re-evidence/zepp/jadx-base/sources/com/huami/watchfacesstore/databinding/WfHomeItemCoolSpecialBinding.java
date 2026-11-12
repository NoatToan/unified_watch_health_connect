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
import com.huami.watchfacesstore.ui.repeatview.RepeatRecyclerView;

/* JADX INFO: loaded from: classes17.dex */
public final class WfHomeItemCoolSpecialBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout moduleLayout;

    @NonNull
    public final TextView moduleTv;

    @NonNull
    public final TextView nameTv;

    @NonNull
    public final RepeatRecyclerView specialRecyclerView;

    @NonNull
    public final RepeatRecyclerView specialRecyclerView2;

    private WfHomeItemCoolSpecialBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout moduleLayout, @NonNull TextView moduleTv, @NonNull TextView nameTv, @NonNull RepeatRecyclerView specialRecyclerView, @NonNull RepeatRecyclerView specialRecyclerView2) {
        this.a = rootView;
        this.moduleLayout = moduleLayout;
        this.moduleTv = moduleTv;
        this.nameTv = nameTv;
        this.specialRecyclerView = specialRecyclerView;
        this.specialRecyclerView2 = specialRecyclerView2;
    }

    @NonNull
    public static WfHomeItemCoolSpecialBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.moduleTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.nameTv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.specialRecyclerView;
                RepeatRecyclerView repeatRecyclerView = (RepeatRecyclerView) ViewBindings.findChildViewById(rootView, i);
                if (repeatRecyclerView != null) {
                    i = R.id.specialRecyclerView2;
                    RepeatRecyclerView repeatRecyclerView2 = (RepeatRecyclerView) ViewBindings.findChildViewById(rootView, i);
                    if (repeatRecyclerView2 != null) {
                        return new WfHomeItemCoolSpecialBinding(linearLayout, linearLayout, textView, textView2, repeatRecyclerView, repeatRecyclerView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfHomeItemCoolSpecialBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfHomeItemCoolSpecialBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_home_item_cool_special, parent, false);
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

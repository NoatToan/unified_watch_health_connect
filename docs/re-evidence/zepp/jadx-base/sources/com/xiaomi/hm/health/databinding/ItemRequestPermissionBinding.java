package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ItemRequestPermissionBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView tvDesc;

    @NonNull
    public final TextView tvOperation;

    private ItemRequestPermissionBinding(@NonNull LinearLayout rootView, @NonNull TextView tvDesc, @NonNull TextView tvOperation) {
        this.a = rootView;
        this.tvDesc = tvDesc;
        this.tvOperation = tvOperation;
    }

    @NonNull
    public static ItemRequestPermissionBinding bind(@NonNull View rootView) {
        int i = R.id.tv_desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_desc);
        if (textView != null) {
            i = R.id.tv_operation;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_operation);
            if (textView2 != null) {
                return new ItemRequestPermissionBinding((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemRequestPermissionBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemRequestPermissionBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_request_permission, parent, false);
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

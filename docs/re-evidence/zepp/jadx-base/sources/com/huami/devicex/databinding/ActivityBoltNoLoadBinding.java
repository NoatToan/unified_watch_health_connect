package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityBoltNoLoadBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile itemNoLoadTest;

    private ActivityBoltNoLoadBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile) {
        this.a = linearLayout;
        this.container = frameLayout;
        this.itemNoLoadTest = listTile;
    }

    @NonNull
    public static ActivityBoltNoLoadBinding bind(@NonNull View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.item_no_load_test;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile != null) {
                return new ActivityBoltNoLoadBinding((LinearLayout) view, frameLayout, listTile);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBoltNoLoadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBoltNoLoadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bolt_no_load, viewGroup, false);
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

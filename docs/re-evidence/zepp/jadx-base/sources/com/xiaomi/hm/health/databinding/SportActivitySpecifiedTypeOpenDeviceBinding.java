package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SportActivitySpecifiedTypeOpenDeviceBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final NestedScrollView existsApplicableDeviceContainer;

    @NonNull
    public final TextView existsDeviceHelp;

    @NonNull
    public final LinearLayout noApplicableDeviceContainer;

    @NonNull
    public final TextView noDeviceHelp;

    @NonNull
    public final RecyclerView openDeviceRv;

    @NonNull
    public final TextView openDeviceTips;

    private SportActivitySpecifiedTypeOpenDeviceBinding(@NonNull FrameLayout rootView, @NonNull NestedScrollView existsApplicableDeviceContainer, @NonNull TextView existsDeviceHelp, @NonNull LinearLayout noApplicableDeviceContainer, @NonNull TextView noDeviceHelp, @NonNull RecyclerView openDeviceRv, @NonNull TextView openDeviceTips) {
        this.a = rootView;
        this.existsApplicableDeviceContainer = existsApplicableDeviceContainer;
        this.existsDeviceHelp = existsDeviceHelp;
        this.noApplicableDeviceContainer = noApplicableDeviceContainer;
        this.noDeviceHelp = noDeviceHelp;
        this.openDeviceRv = openDeviceRv;
        this.openDeviceTips = openDeviceTips;
    }

    @NonNull
    public static SportActivitySpecifiedTypeOpenDeviceBinding bind(@NonNull View rootView) {
        int i = R.id.exists_applicable_device_container;
        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.exists_applicable_device_container);
        if (nestedScrollView != null) {
            i = R.id.exists_device_help;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.exists_device_help);
            if (textView != null) {
                i = R.id.no_applicable_device_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.no_applicable_device_container);
                if (linearLayout != null) {
                    i = R.id.no_device_help;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_device_help);
                    if (textView2 != null) {
                        i = R.id.open_device_rv;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.open_device_rv);
                        if (recyclerView != null) {
                            i = R.id.open_device_tips;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.open_device_tips);
                            if (textView3 != null) {
                                return new SportActivitySpecifiedTypeOpenDeviceBinding((FrameLayout) rootView, nestedScrollView, textView, linearLayout, textView2, recyclerView, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static SportActivitySpecifiedTypeOpenDeviceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SportActivitySpecifiedTypeOpenDeviceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sport_activity_specified_type_open_device, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}

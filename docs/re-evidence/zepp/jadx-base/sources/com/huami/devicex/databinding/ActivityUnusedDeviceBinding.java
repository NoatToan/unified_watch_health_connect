package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.lib.view.scroll.HMScrollView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityUnusedDeviceBinding implements ViewBinding {

    @NonNull
    private final HMScrollView a;

    @NonNull
    public final TextView activateAmazfitWatchTips;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final View divider;

    @NonNull
    public final ListTile faqItem;

    @NonNull
    public final ListTile firmwareVersion;

    @NonNull
    public final ListTile macAddress;

    @NonNull
    public final HMScrollView normandySettingScroll;

    @NonNull
    public final ListTile playWithDevice;

    @NonNull
    public final AppCompatButton unbind;

    @NonNull
    public final HMExpandHeadView unusedDeviceHeadView;

    @NonNull
    public final ListTile useDevice;

    private ActivityUnusedDeviceBinding(@NonNull HMScrollView hMScrollView, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull HMScrollView hMScrollView2, @NonNull ListTile listTile4, @NonNull AppCompatButton appCompatButton, @NonNull HMExpandHeadView hMExpandHeadView, @NonNull ListTile listTile5) {
        this.a = hMScrollView;
        this.activateAmazfitWatchTips = textView;
        this.container = frameLayout;
        this.divider = view;
        this.faqItem = listTile;
        this.firmwareVersion = listTile2;
        this.macAddress = listTile3;
        this.normandySettingScroll = hMScrollView2;
        this.playWithDevice = listTile4;
        this.unbind = appCompatButton;
        this.unusedDeviceHeadView = hMExpandHeadView;
        this.useDevice = listTile5;
    }

    @NonNull
    public static ActivityUnusedDeviceBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.activate_amazfit_watch_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
                i = R.id.faq_item;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.firmware_version;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        i = R.id.mac_address;
                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile3 != null) {
                            HMScrollView hMScrollView = (HMScrollView) view;
                            i = R.id.play_with_device;
                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile4 != null) {
                                i = R.id.unbind;
                                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                                if (appCompatButton != null) {
                                    i = R.id.unused_device_head_view;
                                    HMExpandHeadView hMExpandHeadView = (HMExpandHeadView) ViewBindings.findChildViewById(view, i);
                                    if (hMExpandHeadView != null) {
                                        i = R.id.use_device;
                                        ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                        if (listTile5 != null) {
                                            return new ActivityUnusedDeviceBinding(hMScrollView, textView, frameLayout, viewFindChildViewById, listTile, listTile2, listTile3, hMScrollView, listTile4, appCompatButton, hMExpandHeadView, listTile5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityUnusedDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityUnusedDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_unused_device, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public HMScrollView getRoot() {
        return this.a;
    }
}

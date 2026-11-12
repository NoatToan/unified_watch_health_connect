package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.sportdevice.view.AutoLineFeedLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class SportOpenDeviceItemDeviceInfoBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView deviceConnectStatus;

    @NonNull
    public final ImageView deviceDrawing;

    @NonNull
    public final TextView deviceName;

    @NonNull
    public final SwitchCompat deviceOpenSwitch;

    @NonNull
    public final AutoLineFeedLayout sportDeviceSupportAnalysisTypeContainer;

    private SportOpenDeviceItemDeviceInfoBinding(@NonNull RelativeLayout rootView, @NonNull TextView deviceConnectStatus, @NonNull ImageView deviceDrawing, @NonNull TextView deviceName, @NonNull SwitchCompat deviceOpenSwitch, @NonNull AutoLineFeedLayout sportDeviceSupportAnalysisTypeContainer) {
        this.a = rootView;
        this.deviceConnectStatus = deviceConnectStatus;
        this.deviceDrawing = deviceDrawing;
        this.deviceName = deviceName;
        this.deviceOpenSwitch = deviceOpenSwitch;
        this.sportDeviceSupportAnalysisTypeContainer = sportDeviceSupportAnalysisTypeContainer;
    }

    @NonNull
    public static SportOpenDeviceItemDeviceInfoBinding bind(@NonNull View rootView) {
        int i = R.id.device_connect_status;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.device_connect_status);
        if (textView != null) {
            i = R.id.device_drawing;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_drawing);
            if (imageView != null) {
                i = R.id.device_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.device_name);
                if (textView2 != null) {
                    i = R.id.device_open_switch;
                    SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(rootView, R.id.device_open_switch);
                    if (switchCompat != null) {
                        i = R.id.sport_device_support_analysis_type_container;
                        AutoLineFeedLayout autoLineFeedLayout = (AutoLineFeedLayout) ViewBindings.findChildViewById(rootView, R.id.sport_device_support_analysis_type_container);
                        if (autoLineFeedLayout != null) {
                            return new SportOpenDeviceItemDeviceInfoBinding((RelativeLayout) rootView, textView, imageView, textView2, switchCompat, autoLineFeedLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static SportOpenDeviceItemDeviceInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SportOpenDeviceItemDeviceInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sport_open_device_item_device_info, parent, false);
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

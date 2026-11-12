package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class ViewSportPrepareDeviceBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final ImageView ivIcDevice1;

    @NonNull
    public final ImageView ivIcDevice2;

    @NonNull
    public final LinearLayout llHardwareInfo;

    @NonNull
    public final LinearLayout llHeartRateInfo;

    @NonNull
    public final TextView tvHardware;

    @NonNull
    public final TextView tvHeartRate;

    private ViewSportPrepareDeviceBinding(@NonNull View rootView, @NonNull ImageView ivIcDevice1, @NonNull ImageView ivIcDevice2, @NonNull LinearLayout llHardwareInfo, @NonNull LinearLayout llHeartRateInfo, @NonNull TextView tvHardware, @NonNull TextView tvHeartRate) {
        this.a = rootView;
        this.ivIcDevice1 = ivIcDevice1;
        this.ivIcDevice2 = ivIcDevice2;
        this.llHardwareInfo = llHardwareInfo;
        this.llHeartRateInfo = llHeartRateInfo;
        this.tvHardware = tvHardware;
        this.tvHeartRate = tvHeartRate;
    }

    @NonNull
    public static ViewSportPrepareDeviceBinding bind(@NonNull View rootView) {
        int i = R.id.iv_ic_device_1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ic_device_1);
        if (imageView != null) {
            i = R.id.iv_ic_device_2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ic_device_2);
            if (imageView2 != null) {
                i = R.id.ll_hardware_info;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_hardware_info);
                if (linearLayout != null) {
                    i = R.id.ll_heart_rate_info;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_heart_rate_info);
                    if (linearLayout2 != null) {
                        i = R.id.tv_hardware;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_hardware);
                        if (textView != null) {
                            i = R.id.tv_heart_rate;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_heart_rate);
                            if (textView2 != null) {
                                return new ViewSportPrepareDeviceBinding(rootView, imageView, imageView2, linearLayout, linearLayout2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewSportPrepareDeviceBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.view_sport_prepare_device, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}

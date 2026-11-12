package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutHeadsetItemBatteryInfoBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final LinearLayoutCompat headsetBatteryInfoContainer;

    @NonNull
    public final TypefaceTextView tvLeftBattery;

    @NonNull
    public final TypefaceTextView tvRightBattery;

    private LayoutHeadsetItemBatteryInfoBinding(@NonNull LinearLayoutCompat rootView, @NonNull LinearLayoutCompat headsetBatteryInfoContainer, @NonNull TypefaceTextView tvLeftBattery, @NonNull TypefaceTextView tvRightBattery) {
        this.a = rootView;
        this.headsetBatteryInfoContainer = headsetBatteryInfoContainer;
        this.tvLeftBattery = tvLeftBattery;
        this.tvRightBattery = tvRightBattery;
    }

    @NonNull
    public static LayoutHeadsetItemBatteryInfoBinding bind(@NonNull View rootView) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) rootView;
        int i = R.id.tv_left_battery;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_left_battery);
        if (typefaceTextView != null) {
            i = R.id.tv_right_battery;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_right_battery);
            if (typefaceTextView2 != null) {
                return new LayoutHeadsetItemBatteryInfoBinding(linearLayoutCompat, linearLayoutCompat, typefaceTextView, typefaceTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutHeadsetItemBatteryInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutHeadsetItemBatteryInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_headset_item_battery_info, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.a;
    }
}

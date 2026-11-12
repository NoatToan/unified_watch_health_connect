package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class LayoutExtDeviceViewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RelativeLayout externalDeviceAvgCadenceLayout;

    @NonNull
    public final TextView externalDeviceAvgCadenceTitle;

    @NonNull
    public final TextView externalDeviceAvgCadenceUnit;

    @NonNull
    public final TextView externalDeviceAvgCadenceValue;

    @NonNull
    public final LinearLayout externalDeviceDataContainer;

    @NonNull
    public final RelativeLayout externalDeviceFlyratioLayout;

    @NonNull
    public final TextView externalDeviceFlyratioTitle;

    @NonNull
    public final TextView externalDeviceFlyratioValue;

    @NonNull
    public final RelativeLayout externalDeviceForefeetLayout;

    @NonNull
    public final TextView externalDeviceForefeetTitle;

    @NonNull
    public final TextView externalDeviceForefeetValue;

    @NonNull
    public final RelativeLayout externalDeviceMaxCadenceLayout;

    @NonNull
    public final TextView externalDeviceMaxCadenceTitle;

    @NonNull
    public final TextView externalDeviceMaxCadenceUnit;

    @NonNull
    public final TextView externalDeviceMaxCadenceValue;

    @NonNull
    public final TextView externalDeviceTitle;

    @NonNull
    public final RelativeLayout externalDeviceTouchtimeLayout;

    @NonNull
    public final TextView externalDeviceTouchtimeTitle;

    @NonNull
    public final TextView externalDeviceTouchtimeValue;

    private LayoutExtDeviceViewBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView12, @NonNull TextView textView13) {
        this.a = linearLayout;
        this.externalDeviceAvgCadenceLayout = relativeLayout;
        this.externalDeviceAvgCadenceTitle = textView;
        this.externalDeviceAvgCadenceUnit = textView2;
        this.externalDeviceAvgCadenceValue = textView3;
        this.externalDeviceDataContainer = linearLayout2;
        this.externalDeviceFlyratioLayout = relativeLayout2;
        this.externalDeviceFlyratioTitle = textView4;
        this.externalDeviceFlyratioValue = textView5;
        this.externalDeviceForefeetLayout = relativeLayout3;
        this.externalDeviceForefeetTitle = textView6;
        this.externalDeviceForefeetValue = textView7;
        this.externalDeviceMaxCadenceLayout = relativeLayout4;
        this.externalDeviceMaxCadenceTitle = textView8;
        this.externalDeviceMaxCadenceUnit = textView9;
        this.externalDeviceMaxCadenceValue = textView10;
        this.externalDeviceTitle = textView11;
        this.externalDeviceTouchtimeLayout = relativeLayout5;
        this.externalDeviceTouchtimeTitle = textView12;
        this.externalDeviceTouchtimeValue = textView13;
    }

    @NonNull
    public static LayoutExtDeviceViewBinding bind(@NonNull View view) {
        int i = R.id.external_device_avg_cadence_layout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.external_device_avg_cadence_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.external_device_avg_cadence_unit;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.external_device_avg_cadence_value;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = R.id.external_device_flyratio_layout;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.external_device_flyratio_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.external_device_flyratio_value;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.external_device_forefeet_layout;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout3 != null) {
                                        i = R.id.external_device_forefeet_title;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = R.id.external_device_forefeet_value;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = R.id.external_device_max_cadence_layout;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout4 != null) {
                                                    i = R.id.external_device_max_cadence_title;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView8 != null) {
                                                        i = R.id.external_device_max_cadence_unit;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView9 != null) {
                                                            i = R.id.external_device_max_cadence_value;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView10 != null) {
                                                                i = R.id.external_device_title;
                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView11 != null) {
                                                                    i = R.id.external_device_touchtime_layout;
                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (relativeLayout5 != null) {
                                                                        i = R.id.external_device_touchtime_title;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView12 != null) {
                                                                            i = R.id.external_device_touchtime_value;
                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView13 != null) {
                                                                                return new LayoutExtDeviceViewBinding(linearLayout, relativeLayout, textView, textView2, textView3, linearLayout, relativeLayout2, textView4, textView5, relativeLayout3, textView6, textView7, relativeLayout4, textView8, textView9, textView10, textView11, relativeLayout5, textView12, textView13);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static LayoutExtDeviceViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutExtDeviceViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_ext_device_view, viewGroup, false);
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

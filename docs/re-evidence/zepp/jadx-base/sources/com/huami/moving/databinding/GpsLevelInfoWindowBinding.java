package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.moving.ui.view.GpsSignalView;

/* JADX INFO: loaded from: classes11.dex */
public final class GpsLevelInfoWindowBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final TextView gpsNotWorkText;

    @NonNull
    public final GpsSignalView gpsSignal;

    private GpsLevelInfoWindowBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull GpsSignalView gpsSignalView) {
        this.a = frameLayout;
        this.gpsNotWorkText = textView;
        this.gpsSignal = gpsSignalView;
    }

    @NonNull
    public static GpsLevelInfoWindowBinding bind(@NonNull View view) {
        int i = R.id.gps_not_work_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.gps_signal;
            GpsSignalView gpsSignalView = (GpsSignalView) ViewBindings.findChildViewById(view, i);
            if (gpsSignalView != null) {
                return new GpsLevelInfoWindowBinding((FrameLayout) view, textView, gpsSignalView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static GpsLevelInfoWindowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static GpsLevelInfoWindowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.gps_level_info_window, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}

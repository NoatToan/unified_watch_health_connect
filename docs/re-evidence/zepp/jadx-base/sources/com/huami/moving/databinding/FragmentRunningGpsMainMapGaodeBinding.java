package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amap.api.maps.MapView;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentRunningGpsMainMapGaodeBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final MapView map;

    @NonNull
    public final ImageView runningButtonLocation;

    private FragmentRunningGpsMainMapGaodeBinding(@NonNull FrameLayout frameLayout, @NonNull MapView mapView, @NonNull ImageView imageView) {
        this.a = frameLayout;
        this.map = mapView;
        this.runningButtonLocation = imageView;
    }

    @NonNull
    public static FragmentRunningGpsMainMapGaodeBinding bind(@NonNull View view) {
        int i = R.id.map;
        MapView mapView = (MapView) ViewBindings.findChildViewById(view, i);
        if (mapView != null) {
            i = R.id.running_button_location;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new FragmentRunningGpsMainMapGaodeBinding((FrameLayout) view, mapView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRunningGpsMainMapGaodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRunningGpsMainMapGaodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_running_gps_main_map_gaode, viewGroup, false);
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

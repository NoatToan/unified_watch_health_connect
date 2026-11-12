package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amap.api.maps.MapView;
import com.huami.moving.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentSportDetailMapGaodeBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView ivLogo;

    @NonNull
    public final TypefaceTextView lineMapTip;

    @NonNull
    public final ImageView loactionFlag;

    @NonNull
    public final MapView map;

    @NonNull
    public final ImageView mapFlag;

    @NonNull
    public final ImageView markedFlag;

    @NonNull
    public final ImageView satelliteFlag;

    private FragmentSportDetailMapGaodeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TypefaceTextView typefaceTextView, @NonNull ImageView imageView2, @NonNull MapView mapView, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5) {
        this.a = constraintLayout;
        this.ivLogo = imageView;
        this.lineMapTip = typefaceTextView;
        this.loactionFlag = imageView2;
        this.map = mapView;
        this.mapFlag = imageView3;
        this.markedFlag = imageView4;
        this.satelliteFlag = imageView5;
    }

    @NonNull
    public static FragmentSportDetailMapGaodeBinding bind(@NonNull View view) {
        int i = R.id.iv_logo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.line_map_tip;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView != null) {
                i = R.id.loactionFlag;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.map;
                    MapView mapView = (MapView) ViewBindings.findChildViewById(view, i);
                    if (mapView != null) {
                        i = R.id.mapFlag;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.markedFlag;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = R.id.satelliteFlag;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView5 != null) {
                                    return new FragmentSportDetailMapGaodeBinding((ConstraintLayout) view, imageView, typefaceTextView, imageView2, mapView, imageView3, imageView4, imageView5);
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
    public static FragmentSportDetailMapGaodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailMapGaodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sport_detail_map_gaode, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}

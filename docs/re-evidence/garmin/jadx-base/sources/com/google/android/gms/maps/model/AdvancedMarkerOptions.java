package com.google.android.gms.maps.model;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes14.dex */
public class AdvancedMarkerOptions extends MarkerOptions {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface CollisionBehavior {
        public static final int OPTIONAL_AND_HIDES_LOWER_PRIORITY = 2;
        public static final int REQUIRED = 0;
        public static final int REQUIRED_AND_HIDES_OPTIONAL = 1;
    }

    public AdvancedMarkerOptions collisionBehavior(@CollisionBehavior int i14) {
        zzd(i14);
        return this;
    }

    public int getCollisionBehavior() {
        return zza();
    }

    public View getIconView() {
        return zzc();
    }

    public AdvancedMarkerOptions iconView(View view2) {
        zze(view2);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions alpha(float f14) {
        super.alpha(f14);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions anchor(float f14, float f15) {
        super.anchor(f14, f15);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions contentDescription(String str) {
        super.contentDescription(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions draggable(boolean z14) {
        super.draggable(z14);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions flat(boolean z14) {
        super.flat(z14);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        super.icon(bitmapDescriptor);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions infoWindowAnchor(float f14, float f15) {
        super.infoWindowAnchor(f14, f15);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions position(LatLng latLng) {
        super.position(latLng);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions rotation(float f14) {
        super.rotation(f14);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions snippet(String str) {
        super.snippet(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions title(String str) {
        super.title(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions visible(boolean z14) {
        super.visible(z14);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions zIndex(float f14) {
        super.zIndex(f14);
        return this;
    }
}

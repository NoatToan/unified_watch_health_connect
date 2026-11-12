package com.huami.moving.maps.google;

import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.huami.moving.maps.IInfoWindow;
import com.huami.moving.maps.IMapInfoWindowClickListenerDelegate;
import com.huami.moving.maps.OnInfoWindowClickListener;
import com.huami.moving.maps.gaode.GoogleInfoWinAdapter;
import com.huami.moving.ui.utils.SportAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/moving/maps/google/GoogleMarkerWrapper;", "Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate$ClickableMarker;", "", "remove", "Landroid/location/Location;", "location", "updateLocation", "Lcom/huami/moving/maps/IInfoWindow;", "infoWindow", "showInfoWindow", "refreshInfoWindow", "Landroid/graphics/Bitmap;", "icon", "updateIcon", "Lcom/huami/moving/maps/OnInfoWindowClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnInfoWindowClickListener", "onInfoWindowClicked", "Lcom/google/android/gms/maps/GoogleMap;", "a", "Lcom/google/android/gms/maps/GoogleMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate;", "b", "Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate;", "infoWindowClickListenerDelegate", "Lcom/google/android/gms/maps/model/Marker;", "c", "Lcom/google/android/gms/maps/model/Marker;", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "marker", GoogleApiAvailabilityLight.a, "Lcom/huami/moving/maps/OnInfoWindowClickListener;", "infoWindowClickListener", "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GoogleMarkerWrapper implements IMapInfoWindowClickListenerDelegate.ClickableMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GoogleMap map;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IMapInfoWindowClickListenerDelegate<GoogleMarkerWrapper> infoWindowClickListenerDelegate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Marker marker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private OnInfoWindowClickListener infoWindowClickListener;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMarkerWrapper(@NotNull GoogleMap googleMap, @NotNull IMapInfoWindowClickListenerDelegate<? super GoogleMarkerWrapper> iMapInfoWindowClickListenerDelegate) {
        this.map = googleMap;
        this.infoWindowClickListenerDelegate = iMapInfoWindowClickListenerDelegate;
    }

    @Nullable
    public final Marker getMarker() {
        return this.marker;
    }

    @Override // com.huami.moving.maps.IMapInfoWindowClickListenerDelegate.ClickableMarker
    public void onInfoWindowClicked() {
        OnInfoWindowClickListener onInfoWindowClickListener = this.infoWindowClickListener;
        if (onInfoWindowClickListener == null) {
            return;
        }
        onInfoWindowClickListener.onInfoWindowClick(this);
    }

    @Override // com.huami.moving.maps.IMarker
    public void refreshInfoWindow() {
        Marker marker = this.marker;
        if (marker == null) {
            return;
        }
        if (marker.isInfoWindowShown()) {
            marker.hideInfoWindow();
        }
        marker.showInfoWindow();
    }

    @Override // com.huami.moving.maps.IMarker
    public void remove() {
        this.infoWindowClickListenerDelegate.removeMarker(this);
        Marker marker = this.marker;
        if (marker == null) {
            return;
        }
        marker.remove();
    }

    public final void setMarker(@Nullable Marker marker) {
        this.marker = marker;
    }

    @Override // com.huami.moving.maps.IMarker
    public void setOnInfoWindowClickListener(@Nullable OnInfoWindowClickListener listener) {
        this.infoWindowClickListener = listener;
    }

    @Override // com.huami.moving.maps.IMarker
    public void showInfoWindow(@NotNull IInfoWindow infoWindow) {
        Marker marker = this.marker;
        if (marker == null) {
            return;
        }
        this.map.setInfoWindowAdapter(new GoogleInfoWinAdapter(infoWindow.view()));
        marker.showInfoWindow();
    }

    @Override // com.huami.moving.maps.IMarker
    public void updateIcon(@NotNull Bitmap icon) {
        Marker marker = this.marker;
        if (marker == null) {
            return;
        }
        marker.setIcon(BitmapDescriptorFactory.fromBitmap(icon));
    }

    @Override // com.huami.moving.maps.IMarker
    public void updateLocation(@NotNull Location location) {
        Marker marker = this.marker;
        if (marker == null) {
            return;
        }
        marker.setPosition(new LatLng(location.getLatitude(), location.getLongitude()));
    }
}

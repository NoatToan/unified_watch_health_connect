package com.google.maps.android.compose.streetview;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.p0;
import p3.p1;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010&\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0011\u0010/\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00061"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "camera", "", "durationMs", "", "animateTo", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;I)V", "Lcom/google/android/gms/maps/model/LatLng;", ModelSourceWrapper.POSITION, "radius", "Lcom/google/android/gms/maps/model/StreetViewSource;", "source", "setPosition", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Integer;Lcom/google/android/gms/maps/model/StreetViewSource;)V", "", "panoId", "(Ljava/lang/String;)V", "Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "<set-?>", "rawLocation$delegate", "Lp3/p1;", "getRawLocation$maps_compose_release", "()Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "setRawLocation$maps_compose_release", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;)V", "rawLocation", "rawPanoramaCamera$delegate", "getRawPanoramaCamera$maps_compose_release", "()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "setRawPanoramaCamera$maps_compose_release", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)V", "rawPanoramaCamera", "Lcom/google/android/gms/maps/StreetViewPanorama;", "value", "panorama", "Lcom/google/android/gms/maps/StreetViewPanorama;", "getPanorama$maps_compose_release", "()Lcom/google/android/gms/maps/StreetViewPanorama;", "setPanorama$maps_compose_release", "(Lcom/google/android/gms/maps/StreetViewPanorama;)V", "getLocation", FirebaseAnalytics.Param.LOCATION, "getPanoramaCamera", "panoramaCamera", "Companion", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StreetViewCameraPositionState {
    private StreetViewPanorama panorama;

    /* JADX INFO: renamed from: rawLocation$delegate, reason: from kotlin metadata */
    private final p1 rawLocation;

    /* JADX INFO: renamed from: rawPanoramaCamera$delegate, reason: from kotlin metadata */
    private final p1 rawPanoramaCamera;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private StreetViewCameraPositionState() {
        this.rawLocation = p0.n(new StreetViewPanoramaLocation(new StreetViewPanoramaLink[0], new LatLng(0.0d, 0.0d), ""));
        this.rawPanoramaCamera = p0.n(new StreetViewPanoramaCamera(0.0f, 0.0f, 0.0f));
    }

    public static /* synthetic */ void setPosition$default(StreetViewCameraPositionState streetViewCameraPositionState, LatLng latLng, Integer num, StreetViewSource streetViewSource, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            num = null;
        }
        if ((i14 & 4) != 0) {
            streetViewSource = null;
        }
        streetViewCameraPositionState.setPosition(latLng, num, streetViewSource);
    }

    public final void animateTo(StreetViewPanoramaCamera camera, int durationMs) {
        camera.getClass();
        StreetViewPanorama streetViewPanorama = this.panorama;
        if (streetViewPanorama != null) {
            streetViewPanorama.animateTo(camera, durationMs);
        }
    }

    public final StreetViewPanoramaLocation getLocation() {
        return getRawLocation$maps_compose_release();
    }

    /* JADX INFO: renamed from: getPanorama$maps_compose_release, reason: from getter */
    public final StreetViewPanorama getPanorama() {
        return this.panorama;
    }

    public final StreetViewPanoramaCamera getPanoramaCamera() {
        return getRawPanoramaCamera$maps_compose_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StreetViewPanoramaLocation getRawLocation$maps_compose_release() {
        return (StreetViewPanoramaLocation) this.rawLocation.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StreetViewPanoramaCamera getRawPanoramaCamera$maps_compose_release() {
        return (StreetViewPanoramaCamera) this.rawPanoramaCamera.getF182175a();
    }

    public final void setPanorama$maps_compose_release(StreetViewPanorama streetViewPanorama) {
        StreetViewPanorama streetViewPanorama2 = this.panorama;
        if (streetViewPanorama2 == null && streetViewPanorama == null) {
            return;
        }
        if (streetViewPanorama2 == null || streetViewPanorama == null) {
            this.panorama = streetViewPanorama;
        } else {
            h.z("StreetViewCameraPositionState may only be associated with one StreetView at a time.");
        }
    }

    public final void setPosition(LatLng position, Integer radius, StreetViewSource source) {
        position.getClass();
        if (radius != null && source != null) {
            StreetViewPanorama streetViewPanorama = this.panorama;
            if (streetViewPanorama != null) {
                streetViewPanorama.setPosition(position, radius.intValue(), source);
                return;
            }
            return;
        }
        StreetViewPanorama streetViewPanorama2 = this.panorama;
        if (radius != null) {
            if (streetViewPanorama2 != null) {
                streetViewPanorama2.setPosition(position, radius.intValue());
            }
        } else if (streetViewPanorama2 != null) {
            streetViewPanorama2.setPosition(position);
        }
    }

    public final void setRawLocation$maps_compose_release(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        streetViewPanoramaLocation.getClass();
        this.rawLocation.setValue(streetViewPanoramaLocation);
    }

    public final void setRawPanoramaCamera$maps_compose_release(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        streetViewPanoramaCamera.getClass();
        this.rawPanoramaCamera.setValue(streetViewPanoramaCamera);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087\u0002¨\u0006\u0006"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState$Companion;", "", "<init>", "()V", "invoke", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final StreetViewCameraPositionState invoke() {
            return new StreetViewCameraPositionState(null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ StreetViewCameraPositionState(j jVar) {
        this();
    }

    public final void setPosition(String panoId) {
        panoId.getClass();
        StreetViewPanorama streetViewPanorama = this.panorama;
        if (streetViewPanorama != null) {
            streetViewPanorama.setPosition(panoId);
        }
    }
}

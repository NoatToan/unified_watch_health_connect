package com.google.maps.android.ktx;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/maps/android/ktx/MarkerDragEvent;", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "marker", "Lcom/google/android/gms/maps/model/Marker;", "<init>", "(Lcom/google/android/gms/maps/model/Marker;)V", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "maps-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MarkerDragEvent extends OnMarkerDragEvent {
    private final Marker marker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkerDragEvent(Marker marker) {
        super(null);
        marker.getClass();
        this.marker = marker;
    }

    public static /* synthetic */ MarkerDragEvent copy$default(MarkerDragEvent markerDragEvent, Marker marker, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            marker = markerDragEvent.marker;
        }
        return markerDragEvent.copy(marker);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Marker getMarker() {
        return this.marker;
    }

    public final MarkerDragEvent copy(Marker marker) {
        marker.getClass();
        return new MarkerDragEvent(marker);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarkerDragEvent) && s.g(this.marker, ((MarkerDragEvent) other).marker);
    }

    @Override // com.google.maps.android.ktx.OnMarkerDragEvent
    public Marker getMarker() {
        return this.marker;
    }

    public int hashCode() {
        return this.marker.hashCode();
    }

    public String toString() {
        return "MarkerDragEvent(marker=" + this.marker + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

package com.google.maps.android.ktx;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/maps/android/ktx/CameraMoveStartedEvent;", "Lcom/google/maps/android/ktx/CameraEvent;", "reason", "", "<init>", "(I)V", "getReason", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "maps-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CameraMoveStartedEvent extends CameraEvent {
    private final int reason;

    public CameraMoveStartedEvent(int i14) {
        super(null);
        this.reason = i14;
    }

    public static /* synthetic */ CameraMoveStartedEvent copy$default(CameraMoveStartedEvent cameraMoveStartedEvent, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i14 = cameraMoveStartedEvent.reason;
        }
        return cameraMoveStartedEvent.copy(i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    public final CameraMoveStartedEvent copy(int reason) {
        return new CameraMoveStartedEvent(reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CameraMoveStartedEvent) && this.reason == ((CameraMoveStartedEvent) other).reason;
    }

    public final int getReason() {
        return this.reason;
    }

    public int hashCode() {
        return Integer.hashCode(this.reason);
    }

    public String toString() {
        return e0.j(new StringBuilder("CameraMoveStartedEvent(reason="), this.reason, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}

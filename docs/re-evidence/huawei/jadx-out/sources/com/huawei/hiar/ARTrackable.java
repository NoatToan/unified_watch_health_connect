package com.huawei.hiar;

import java.util.Collection;

/* JADX INFO: loaded from: classes33.dex */
public interface ARTrackable {
    ARAnchor createAnchor(ARPose aRPose);

    Collection<ARAnchor> getAnchors();

    TrackingState getTrackingState();

    public enum TrackingState {
        UNKNOWN_STATE(-1),
        TRACKING(0),
        PAUSED(1),
        STOPPED(2);

        final int mStateCode;

        static TrackingState forNumber(int i) {
            for (TrackingState trackingState : values()) {
                if (trackingState.mStateCode == i) {
                    return trackingState;
                }
            }
            return UNKNOWN_STATE;
        }

        TrackingState(int i) {
            this.mStateCode = i;
        }
    }
}

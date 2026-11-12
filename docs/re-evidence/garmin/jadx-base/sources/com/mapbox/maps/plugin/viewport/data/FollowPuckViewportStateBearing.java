package com.mapbox.maps.plugin.viewport.data;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;", "", "()V", "Constant", "SyncWithLocationPuck", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing$Constant;", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing$SyncWithLocationPuck;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class FollowPuckViewportStateBearing {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing$Constant;", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;", "bearing", "", "(D)V", "getBearing", "()D", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Constant extends FollowPuckViewportStateBearing {
        private final double bearing;

        public Constant(double d14) {
            super(null);
            this.bearing = d14;
        }

        public boolean equals(Object other) {
            return (other instanceof Constant) && this.bearing == ((Constant) other).bearing;
        }

        public final double getBearing() {
            return this.bearing;
        }

        public int hashCode() {
            return Objects.hash(Double.valueOf(this.bearing));
        }

        public String toString() {
            return "FollowPuckViewportStateBearing#Constant(bearing=" + this.bearing + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing$SyncWithLocationPuck;", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SyncWithLocationPuck extends FollowPuckViewportStateBearing {
        public static final SyncWithLocationPuck INSTANCE = new SyncWithLocationPuck();

        private SyncWithLocationPuck() {
            super(null);
        }

        public boolean equals(Object other) {
            return other instanceof SyncWithLocationPuck;
        }

        public int hashCode() {
            return Objects.hash(INSTANCE);
        }

        public String toString() {
            return "FollowPuckViewportStateBearing#SyncWithLocationPuck";
        }
    }

    public /* synthetic */ FollowPuckViewportStateBearing(j jVar) {
        this();
    }

    private FollowPuckViewportStateBearing() {
    }
}

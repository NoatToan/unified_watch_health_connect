package com.google.firebase.crashlytics.internal.model;

import am.j;
import com.google.android.gms.internal.measurement.a;
import com.google.common.base.Ascii;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {
    private final Double batteryLevel;
    private final int batteryVelocity;
    private final long diskUsed;
    private final int orientation;
    private final boolean proximityOn;
    private final long ramUsed;

    public static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {
        private Double batteryLevel;
        private int batteryVelocity;
        private long diskUsed;
        private int orientation;
        private boolean proximityOn;
        private long ramUsed;
        private byte set$0;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device build() {
            if (this.set$0 == 31) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.batteryLevel, this.batteryVelocity, this.proximityOn, this.orientation, this.ramUsed, this.diskUsed);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb3.append(" batteryVelocity");
            }
            if ((this.set$0 & 2) == 0) {
                sb3.append(" proximityOn");
            }
            if ((this.set$0 & 4) == 0) {
                sb3.append(" orientation");
            }
            if ((this.set$0 & 8) == 0) {
                sb3.append(" ramUsed");
            }
            if ((this.set$0 & Ascii.DLE) == 0) {
                sb3.append(" diskUsed");
            }
            h.z(a.f("Missing required properties:", sb3));
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(Double d14) {
            this.batteryLevel = d14;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i14) {
            this.batteryVelocity = i14;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j8) {
            this.diskUsed = j8;
            this.set$0 = (byte) (this.set$0 | Ascii.DLE);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i14) {
            this.orientation = i14;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z14) {
            this.proximityOn = z14;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j8) {
            this.ramUsed = j8;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Device(Double d14, int i14, boolean z14, int i15, long j8, long j14) {
        this.batteryLevel = d14;
        this.batteryVelocity = i14;
        this.proximityOn = z14;
        this.orientation = i15;
        this.ramUsed = j8;
        this.diskUsed = j14;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Device) {
            CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
            Double d14 = this.batteryLevel;
            if (d14 != null ? d14.equals(device.getBatteryLevel()) : device.getBatteryLevel() == null) {
                if (this.batteryVelocity == device.getBatteryVelocity() && this.proximityOn == device.isProximityOn() && this.orientation == device.getOrientation() && this.ramUsed == device.getRamUsed() && this.diskUsed == device.getDiskUsed()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public Double getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getBatteryVelocity() {
        return this.batteryVelocity;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getDiskUsed() {
        return this.diskUsed;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getOrientation() {
        return this.orientation;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getRamUsed() {
        return this.ramUsed;
    }

    public int hashCode() {
        Double d14 = this.batteryLevel;
        int iHashCode = ((((((((d14 == null ? 0 : d14.hashCode()) ^ 1000003) * 1000003) ^ this.batteryVelocity) * 1000003) ^ (this.proximityOn ? 1231 : 1237)) * 1000003) ^ this.orientation) * 1000003;
        long j8 = this.ramUsed;
        long j14 = this.diskUsed;
        return ((iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)));
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public boolean isProximityOn() {
        return this.proximityOn;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Device{batteryLevel=");
        sb3.append(this.batteryLevel);
        sb3.append(", batteryVelocity=");
        sb3.append(this.batteryVelocity);
        sb3.append(", proximityOn=");
        sb3.append(this.proximityOn);
        sb3.append(", orientation=");
        sb3.append(this.orientation);
        sb3.append(", ramUsed=");
        sb3.append(this.ramUsed);
        sb3.append(", diskUsed=");
        return j.i(this.diskUsed, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}

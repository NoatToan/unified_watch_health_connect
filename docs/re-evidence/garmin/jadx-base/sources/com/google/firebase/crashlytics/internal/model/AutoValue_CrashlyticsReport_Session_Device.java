package com.google.firebase.crashlytics.internal.model;

import am.j;
import com.google.android.gms.internal.measurement.a;
import com.google.common.base.Ascii;
import j20.x;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {
    private final int arch;
    private final int cores;
    private final long diskSpace;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final long ram;
    private final boolean simulator;
    private final int state;

    public static final class Builder extends CrashlyticsReport.Session.Device.Builder {
        private int arch;
        private int cores;
        private long diskSpace;
        private String manufacturer;
        private String model;
        private String modelClass;
        private long ram;
        private byte set$0;
        private boolean simulator;
        private int state;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device build() {
            String str;
            String str2;
            String str3;
            if (this.set$0 == 63 && (str = this.model) != null && (str2 = this.manufacturer) != null && (str3 = this.modelClass) != null) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.arch, str, this.cores, this.ram, this.diskSpace, this.simulator, this.state, str2, str3);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb3.append(" arch");
            }
            if (this.model == null) {
                sb3.append(" model");
            }
            if ((this.set$0 & 2) == 0) {
                sb3.append(" cores");
            }
            if ((this.set$0 & 4) == 0) {
                sb3.append(" ram");
            }
            if ((this.set$0 & 8) == 0) {
                sb3.append(" diskSpace");
            }
            if ((this.set$0 & Ascii.DLE) == 0) {
                sb3.append(" simulator");
            }
            if ((this.set$0 & 32) == 0) {
                sb3.append(" state");
            }
            if (this.manufacturer == null) {
                sb3.append(" manufacturer");
            }
            if (this.modelClass == null) {
                sb3.append(" modelClass");
            }
            h.z(a.f("Missing required properties:", sb3));
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setArch(int i14) {
            this.arch = i14;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setCores(int i14) {
            this.cores = i14;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setDiskSpace(long j8) {
            this.diskSpace = j8;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setManufacturer(String str) {
            if (str != null) {
                this.manufacturer = str;
                return this;
            }
            x.l("Null manufacturer");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModel(String str) {
            if (str != null) {
                this.model = str;
                return this;
            }
            x.l("Null model");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModelClass(String str) {
            if (str != null) {
                this.modelClass = str;
                return this;
            }
            x.l("Null modelClass");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setRam(long j8) {
            this.ram = j8;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setSimulator(boolean z14) {
            this.simulator = z14;
            this.set$0 = (byte) (this.set$0 | Ascii.DLE);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setState(int i14) {
            this.state = i14;
            this.set$0 = (byte) (this.set$0 | 32);
            return this;
        }
    }

    private AutoValue_CrashlyticsReport_Session_Device(int i14, String str, int i15, long j8, long j14, boolean z14, int i16, String str2, String str3) {
        this.arch = i14;
        this.model = str;
        this.cores = i15;
        this.ram = j8;
        this.diskSpace = j14;
        this.simulator = z14;
        this.state = i16;
        this.manufacturer = str2;
        this.modelClass = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Device) {
            CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
            if (this.arch == device.getArch() && this.model.equals(device.getModel()) && this.cores == device.getCores() && this.ram == device.getRam() && this.diskSpace == device.getDiskSpace() && this.simulator == device.isSimulator() && this.state == device.getState() && this.manufacturer.equals(device.getManufacturer()) && this.modelClass.equals(device.getModelClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getArch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getCores() {
        return this.cores;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getDiskSpace() {
        return this.diskSpace;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public String getModel() {
        return this.model;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public String getModelClass() {
        return this.modelClass;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getRam() {
        return this.ram;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = (((((this.arch ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.cores) * 1000003;
        long j8 = this.ram;
        int i14 = (iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j14 = this.diskSpace;
        return ((((((((i14 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003) ^ (this.simulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.modelClass.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public boolean isSimulator() {
        return this.simulator;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Device{arch=");
        sb3.append(this.arch);
        sb3.append(", model=");
        sb3.append(this.model);
        sb3.append(", cores=");
        sb3.append(this.cores);
        sb3.append(", ram=");
        sb3.append(this.ram);
        sb3.append(", diskSpace=");
        sb3.append(this.diskSpace);
        sb3.append(", simulator=");
        sb3.append(this.simulator);
        sb3.append(", state=");
        sb3.append(this.state);
        sb3.append(", manufacturer=");
        sb3.append(this.manufacturer);
        sb3.append(", modelClass=");
        return j.o(this.modelClass, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}

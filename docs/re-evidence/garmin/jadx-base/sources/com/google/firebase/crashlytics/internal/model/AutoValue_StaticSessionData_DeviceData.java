package com.google.firebase.crashlytics.internal.model;

import am.j;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {
    private final int arch;
    private final int availableProcessors;
    private final long diskSpace;
    private final boolean isEmulator;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final int state;
    private final long totalRam;

    public AutoValue_StaticSessionData_DeviceData(int i14, String str, int i15, long j8, long j14, boolean z14, int i16, String str2, String str3) {
        this.arch = i14;
        if (str == null) {
            x.l("Null model");
            throw null;
        }
        this.model = str;
        this.availableProcessors = i15;
        this.totalRam = j8;
        this.diskSpace = j14;
        this.isEmulator = z14;
        this.state = i16;
        if (str2 == null) {
            x.l("Null manufacturer");
            throw null;
        }
        this.manufacturer = str2;
        if (str3 != null) {
            this.modelClass = str3;
        } else {
            x.l("Null modelClass");
            throw null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int arch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
        return this.availableProcessors;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
        return this.diskSpace;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.DeviceData) {
            StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
            if (this.arch == deviceData.arch() && this.model.equals(deviceData.model()) && this.availableProcessors == deviceData.availableProcessors() && this.totalRam == deviceData.totalRam() && this.diskSpace == deviceData.diskSpace() && this.isEmulator == deviceData.isEmulator() && this.state == deviceData.state() && this.manufacturer.equals(deviceData.manufacturer()) && this.modelClass.equals(deviceData.modelClass())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.arch ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.availableProcessors) * 1000003;
        long j8 = this.totalRam;
        int i14 = (iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j14 = this.diskSpace;
        return ((((((((i14 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003) ^ (this.isEmulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.modelClass.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
        return this.isEmulator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String manufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String model() {
        return this.model;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String modelClass() {
        return this.modelClass;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
        return this.state;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceData{arch=");
        sb3.append(this.arch);
        sb3.append(", model=");
        sb3.append(this.model);
        sb3.append(", availableProcessors=");
        sb3.append(this.availableProcessors);
        sb3.append(", totalRam=");
        sb3.append(this.totalRam);
        sb3.append(", diskSpace=");
        sb3.append(this.diskSpace);
        sb3.append(", isEmulator=");
        sb3.append(this.isEmulator);
        sb3.append(", state=");
        sb3.append(this.state);
        sb3.append(", manufacturer=");
        sb3.append(this.manufacturer);
        sb3.append(", modelClass=");
        return j.o(this.modelClass, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
        return this.totalRam;
    }
}

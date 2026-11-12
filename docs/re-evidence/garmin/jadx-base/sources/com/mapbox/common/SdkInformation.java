package com.mapbox.common;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class SdkInformation implements Serializable {
    private final String name;
    private final String packageName;
    private final String version;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInformation(String str, String str2, String str3) {
        this.name = str;
        this.version = str2;
        this.packageName = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SdkInformation sdkInformation = (SdkInformation) obj;
        return Objects.equals(this.name, sdkInformation.name) && Objects.equals(this.version, sdkInformation.version) && Objects.equals(this.packageName, sdkInformation.packageName);
    }

    public String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.version, this.packageName);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[name: ");
        com.google.protobuf.a.k(this.name, ", version: ", sb3);
        com.google.protobuf.a.k(this.version, ", packageName: ", sb3);
        return com.google.protobuf.a.a(this.packageName, "]", sb3);
    }
}

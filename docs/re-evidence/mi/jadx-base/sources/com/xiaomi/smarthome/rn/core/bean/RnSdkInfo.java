package com.xiaomi.smarthome.rn.core.bean;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class RnSdkInfo {
    public final long api_level;
    public final long build_time;
    public final String install_dir;
    public final String install_path;
    public final boolean is_inner_sdk;
    public final String version;

    public RnSdkInfo(long j, long j2, String str, boolean z, String str2) {
        this.api_level = j;
        this.build_time = j2;
        if (z) {
            this.install_path = str;
            this.install_dir = "asset:/plugin_rn_sdk" + File.separator;
        } else {
            String str3 = File.separator;
            if (str.endsWith(str3)) {
                this.install_dir = str;
            } else {
                this.install_dir = str + str3;
            }
            this.install_path = this.install_dir + "sdk.bundle";
        }
        this.is_inner_sdk = z;
        this.version = str2;
    }

    public String toString() {
        return "api_level: " + this.api_level + "   build_time: " + this.build_time + "  is_inner_sdk: " + this.is_inner_sdk + "  install_path: " + this.install_path + " version:" + this.version;
    }
}

package com.google.firebase.sessions;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "versionName", "appBuildVersion", "deviceManufacturer", "currentProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "appProcessDetails", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)V", "getPackageName", "()Ljava/lang/String;", "getVersionName", "getAppBuildVersion", "getDeviceManufacturer", "getCurrentProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "getAppProcessDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AndroidApplicationInfo {
    private final String appBuildVersion;
    private final List<ProcessDetails> appProcessDetails;
    private final ProcessDetails currentProcessDetails;
    private final String deviceManufacturer;
    private final String packageName;
    private final String versionName;

    public AndroidApplicationInfo(String str, String str2, String str3, String str4, ProcessDetails processDetails, List<ProcessDetails> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        processDetails.getClass();
        list.getClass();
        this.packageName = str;
        this.versionName = str2;
        this.appBuildVersion = str3;
        this.deviceManufacturer = str4;
        this.currentProcessDetails = processDetails;
        this.appProcessDetails = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i14 & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        if ((i14 & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        if ((i14 & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        if ((i14 & 16) != 0) {
            processDetails = androidApplicationInfo.currentProcessDetails;
        }
        if ((i14 & 32) != 0) {
            list = androidApplicationInfo.appProcessDetails;
        }
        ProcessDetails processDetails2 = processDetails;
        List list2 = list;
        return androidApplicationInfo.copy(str, str2, str3, str4, processDetails2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public final List<ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    public final AndroidApplicationInfo copy(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, ProcessDetails currentProcessDetails, List<ProcessDetails> appProcessDetails) {
        packageName.getClass();
        versionName.getClass();
        appBuildVersion.getClass();
        deviceManufacturer.getClass();
        currentProcessDetails.getClass();
        appProcessDetails.getClass();
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) other;
        return s.g(this.packageName, androidApplicationInfo.packageName) && s.g(this.versionName, androidApplicationInfo.versionName) && s.g(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && s.g(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && s.g(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && s.g(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.appProcessDetails.hashCode() + ((this.currentProcessDetails.hashCode() + g.j(g.j(g.j(this.packageName.hashCode() * 31, 31, this.versionName), 31, this.appBuildVersion), 31, this.deviceManufacturer)) * 31);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb3.append(this.packageName);
        sb3.append(", versionName=");
        sb3.append(this.versionName);
        sb3.append(", appBuildVersion=");
        sb3.append(this.appBuildVersion);
        sb3.append(", deviceManufacturer=");
        sb3.append(this.deviceManufacturer);
        sb3.append(", currentProcessDetails=");
        sb3.append(this.currentProcessDetails);
        sb3.append(", appProcessDetails=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.appProcessDetails, sb3);
    }
}

package com.garmin.android.apps.connectmobile;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/a1;", "", "", "isDeviceConnected", "", "deviceUnitId", "", "deviceProductNumber", "deviceName", "deviceMacAddress", "isGolfSwingSensorCapable", "isDeviceSupportingCalibration", "isDeviceDualWithBtcConnection", "isVirtualRun", "<init>", "(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f28729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f28730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f28731i;

    public a1(boolean z14, long j8, String str, String str2, String str3, boolean z15, boolean z16, boolean z17, boolean z18) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f28723a = z14;
        this.f28724b = j8;
        this.f28725c = str;
        this.f28726d = str2;
        this.f28727e = str3;
        this.f28728f = z15;
        this.f28729g = z16;
        this.f28730h = z17;
        this.f28731i = z18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f28723a == a1Var.f28723a && this.f28724b == a1Var.f28724b && this.f28725c.equals(a1Var.f28725c) && this.f28726d.equals(a1Var.f28726d) && this.f28727e.equals(a1Var.f28727e) && this.f28728f == a1Var.f28728f && this.f28729g == a1Var.f28729g && this.f28730h == a1Var.f28730h && this.f28731i == a1Var.f28731i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28731i) + q6.f.g(q6.f.g(q6.f.g(wr.g.j(wr.g.j(wr.g.j(q6.f.e(Boolean.hashCode(this.f28723a) * 31, 31, this.f28724b), 31, this.f28725c), 31, this.f28726d), 31, this.f28727e), 31, this.f28728f), 31, this.f28729g), 31, this.f28730h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceConnection(isDeviceConnected=");
        sb3.append(this.f28723a);
        sb3.append(", deviceUnitId=");
        sb3.append(this.f28724b);
        sn.a.t(sb3, ", deviceProductNumber=", this.f28725c, ", deviceName=", this.f28726d);
        com.airbnb.lottie.animation.keyframe.a.t(", deviceMacAddress=", this.f28727e, ", isGolfSwingSensorCapable=", sb3, this.f28728f);
        com.airbnb.lottie.animation.keyframe.a.v(", isDeviceSupportingCalibration=", ", isDeviceDualWithBtcConnection=", sb3, this.f28729g, this.f28730h);
        return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", isVirtualRun=", this.f28731i, ")");
    }
}

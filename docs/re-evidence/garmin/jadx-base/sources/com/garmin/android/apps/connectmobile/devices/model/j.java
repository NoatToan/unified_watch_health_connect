package com.garmin.android.apps.connectmobile.devices.model;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/j;", "", "", "displayName", "imageUrl", "versionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34189c;

    public j(String str, String str2, String str3) {
        str3.getClass();
        this.f34187a = str;
        this.f34188b = str2;
        this.f34189c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f34187a, jVar.f34187a) && p005kotlin.jvm.internal.s.g(this.f34188b, jVar.f34188b) && this.f34189c.equals(jVar.f34189c);
    }

    public final int hashCode() {
        String str = this.f34187a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f34188b;
        return this.f34189c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return am.j.o(this.f34189c, ")", p6.b.i("DeviceAppInfoData(displayName=", this.f34187a, ", imageUrl=", this.f34188b, ", versionName="));
    }
}

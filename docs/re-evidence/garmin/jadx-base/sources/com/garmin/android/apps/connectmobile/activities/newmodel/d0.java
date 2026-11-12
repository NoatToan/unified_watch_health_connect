package com.garmin.android.apps.connectmobile.activities.newmodel;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/d0;", "", "", "name", "imageUrl", "versionNumber", "batteryLevel", "", "batteryPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f29417e;

    public /* synthetic */ d0(String str, String str2, String str3, String str4, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.f29413a, d0Var.f29413a) && p005kotlin.jvm.internal.s.g(this.f29414b, d0Var.f29414b) && p005kotlin.jvm.internal.s.g(this.f29415c, d0Var.f29415c) && p005kotlin.jvm.internal.s.g(this.f29416d, d0Var.f29416d) && p005kotlin.jvm.internal.s.g(this.f29417e, d0Var.f29417e);
    }

    public final int hashCode() {
        String str = this.f29413a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f29414b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f29415c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f29416d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f29417e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SensorDevice(name=", this.f29413a, ", imageUrl=", this.f29414b, ", versionNumber=");
        sn.a.t(sbI, this.f29415c, ", batteryLevel=", this.f29416d, ", batteryPercentage=");
        return f3.i(sbI, this.f29417e, ")");
    }

    public d0(String str, String str2, String str3, String str4, Integer num) {
        this.f29413a = str;
        this.f29414b = str2;
        this.f29415c = str3;
        this.f29416d = str4;
        this.f29417e = num;
    }

    public d0() {
        this(null, null, null, null, null, 31, null);
    }
}

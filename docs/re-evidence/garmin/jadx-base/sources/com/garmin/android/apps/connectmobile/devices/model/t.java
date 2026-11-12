package com.garmin.android.apps.connectmobile.devices.model;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import ds.e0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/t;", "", "Lorg/joda/time/DateTime;", "serviceEndDate", "terminateDate", "", "isTerminated", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)V", "a", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "b", "getTerminateDate", "c", "Z", "()Z", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serviceEndDate")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime serviceEndDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("terminateDate")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime terminateDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isTerminated")
    private final boolean isTerminated;

    public t(DateTime dateTime, DateTime dateTime2, boolean z14) {
        dateTime.getClass();
        dateTime2.getClass();
        this.serviceEndDate = dateTime;
        this.terminateDate = dateTime2;
        this.isTerminated = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DateTime getServiceEndDate() {
        return this.serviceEndDate;
    }

    public final boolean b() {
        return !this.isTerminated && DateTime.now().isBefore(this.serviceEndDate.minusDays(1));
    }

    public final boolean c() {
        return !this.isTerminated && DateTime.now().isBefore(this.terminateDate);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.serviceEndDate, tVar.serviceEndDate) && p005kotlin.jvm.internal.s.g(this.terminateDate, tVar.terminateDate) && this.isTerminated == tVar.isTerminated;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isTerminated) + e0.a(this.serviceEndDate.hashCode() * 31, this.terminateDate, 31);
    }

    public final String toString() {
        DateTime dateTime = this.serviceEndDate;
        DateTime dateTime2 = this.terminateDate;
        boolean z14 = this.isTerminated;
        StringBuilder sb3 = new StringBuilder("ExpressPayFeatureConfig(serviceEndDate=");
        sb3.append(dateTime);
        sb3.append(", terminateDate=");
        sb3.append(dateTime2);
        sb3.append(", isTerminated=");
        return hb.a.k(sb3, z14, ")");
    }
}

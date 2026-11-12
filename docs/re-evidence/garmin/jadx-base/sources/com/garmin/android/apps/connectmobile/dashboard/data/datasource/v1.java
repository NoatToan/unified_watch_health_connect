package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/v1;", "", "", "activitiesAndWorkoutsEventsJson", "eventSectionDataJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activitiesAndWorkoutsEventsJson")
    private final String activitiesAndWorkoutsEventsJson;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventSectionDataJson")
    private final String eventSectionDataJson;

    public /* synthetic */ v1(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivitiesAndWorkoutsEventsJson() {
        return this.activitiesAndWorkoutsEventsJson;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventSectionDataJson() {
        return this.eventSectionDataJson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return p005kotlin.jvm.internal.s.g(this.activitiesAndWorkoutsEventsJson, v1Var.activitiesAndWorkoutsEventsJson) && p005kotlin.jvm.internal.s.g(this.eventSectionDataJson, v1Var.eventSectionDataJson);
    }

    public final int hashCode() {
        String str = this.activitiesAndWorkoutsEventsJson;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventSectionDataJson;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return v.e0.g("EventsDataSourceResponse(activitiesAndWorkoutsEventsJson=", this.activitiesAndWorkoutsEventsJson, ", eventSectionDataJson=", this.eventSectionDataJson, ")");
    }

    public v1(String str, String str2) {
        this.activitiesAndWorkoutsEventsJson = str;
        this.eventSectionDataJson = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v1() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

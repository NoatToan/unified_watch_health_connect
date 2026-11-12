package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/n1;", "", "", "hasMoreEvents", "", "Lfg0/e;", "events", "<init>", "(ZLjava/util/List;)V", "a", "Z", "b", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMoreEvents")
    private final boolean hasMoreEvents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("events")
    private final List<fg0.e> events;

    public n1(boolean z14, List<fg0.e> list) {
        list.getClass();
        this.hasMoreEvents = z14;
        this.events = list;
    }

    public final List<fg0.e> a() {
        return this.events;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasMoreEvents() {
        return this.hasMoreEvents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.hasMoreEvents == n1Var.hasMoreEvents && p005kotlin.jvm.internal.s.g(this.events, n1Var.events);
    }

    public final int hashCode() {
        return this.events.hashCode() + (Boolean.hashCode(this.hasMoreEvents) * 31);
    }

    public final String toString() {
        return "EventSectionData(hasMoreEvents=" + this.hasMoreEvents + ", events=" + this.events + ")";
    }
}

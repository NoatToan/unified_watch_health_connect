package com.garmin.android.apps.connectmobile.badges.service.model;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/n;", "", "", "badgeId", "", "badgeAssocDataId", "<init>", "(IJ)V", "a", "I", "getBadgeId", "()I", "b", "J", "getBadgeAssocDataId", "()J", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeId")
    private final int badgeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeAssocDataId")
    private final long badgeAssocDataId;

    public /* synthetic */ n(int i14, long j8, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? 0L : j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.badgeId == nVar.badgeId && this.badgeAssocDataId == nVar.badgeAssocDataId;
    }

    public final int hashCode() {
        return Long.hashCode(this.badgeAssocDataId) + (Integer.hashCode(this.badgeId) * 31);
    }

    public final String toString() {
        return "EarnedBadgeDTO(badgeId=" + this.badgeId + ", badgeAssocDataId=" + this.badgeAssocDataId + ")";
    }

    public n(int i14, long j8) {
        this.badgeId = i14;
        this.badgeAssocDataId = j8;
    }

    public n() {
        this(0, 0L, 3, null);
    }
}

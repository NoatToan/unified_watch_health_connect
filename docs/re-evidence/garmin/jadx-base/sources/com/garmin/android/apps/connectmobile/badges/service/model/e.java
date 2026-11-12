package com.garmin.android.apps.connectmobile.badges.service.model;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/e;", "", "", "badgeDifficultyId", "badgePoints", "<init>", "(II)V", "a", "I", "()I", "b", "getBadgePoints", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeDifficultyId")
    private final int badgeDifficultyId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgePoints")
    private final int badgePoints;

    public e(int i14, int i15) {
        this.badgeDifficultyId = i14;
        this.badgePoints = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBadgeDifficultyId() {
        return this.badgeDifficultyId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.badgeDifficultyId == eVar.badgeDifficultyId && this.badgePoints == eVar.badgePoints;
    }

    public final int hashCode() {
        return Integer.hashCode(this.badgePoints) + (Integer.hashCode(this.badgeDifficultyId) * 31);
    }

    public final String toString() {
        return am.j.g(this.badgeDifficultyId, this.badgePoints, "BadgeDifficultyDTO(badgeDifficultyId=", ", badgePoints=", ")");
    }
}

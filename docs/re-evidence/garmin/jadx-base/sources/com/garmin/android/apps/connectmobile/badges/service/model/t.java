package com.garmin.android.apps.connectmobile.badges.service.model;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/t;", "", "", "badgeId", "<init>", "(I)V", "a", "I", "getBadgeId", "()I", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeId")
    private final int badgeId;

    public /* synthetic */ t(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.badgeId == ((t) obj).badgeId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.badgeId);
    }

    public final String toString() {
        return e0.f(this.badgeId, "ShareBadgeDTO(badgeId=", ")");
    }

    public t(int i14) {
        this.badgeId = i14;
    }

    public t() {
        this(0, 1, null);
    }
}

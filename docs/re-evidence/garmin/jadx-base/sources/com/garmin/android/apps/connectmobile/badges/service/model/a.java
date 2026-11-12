package com.garmin.android.apps.connectmobile.badges.service.model;

/* JADX INFO: loaded from: classes7.dex */
public enum a {
    ACTIVITY(1),
    GROUP_CHALLENGE(2),
    AD_HOC_CHALLENGE(3),
    DAY(4),
    NO_LINK(5),
    VIVOKID_CHALLENGE(7),
    VIVOKID_TEAM_CHALLENGE(8),
    BADGE_CHALLENGE(9),
    SCORECARD(11);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30551a;

    a(int i14) {
        this.f30551a = i14;
    }

    public static a a(int i14) {
        for (a aVar : values()) {
            if (aVar.f30551a == i14) {
                return aVar;
            }
        }
        return null;
    }
}

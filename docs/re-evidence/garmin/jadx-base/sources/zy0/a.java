package zy0;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzy0/a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    /* JADX INFO: Fake field, exist only in values array */
    GET_CONNECTIONS_WITH_BADGE("https://connectapi.garmin.com/badge-service/badge/earned/detail/%s/connections"),
    GET_FOLLOWINGS_WITH_BADGE("https://connectapi.garmin.com/badge-service/badge/earned/detail/%s/followings"),
    GET_LATEST_EARNED_BADGES("https://connectapi.garmin.com/badge-service/badge/earned/latest/%s?limit=%s"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_CONNECTIONS_BADGE_DETAILS("https://connectapi.garmin.com/badge-service/badge/detail/v2/%s?connectionLimit=%s"),
    GET_FOLLOWINGS_BADGE_DETAILS("https://connectapi.garmin.com/badge-service/badge/detail/v3/%s?followingLimit=%s"),
    GET_AVAILABLE_BADGES("https://connectapi.garmin.com/badge-service/badge/available"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_BADGES_LEADERBOARD("https://connectapi.garmin.com/badge-service/badge/leaderboard"),
    GET_BADGES_LEADERBOARD_BY_SCOPE("https://connectapi.garmin.com/badge-service/badge/leaderboard/%s?start=%s&limit=%s"),
    GET_EARNED_BADGES_URL("https://connectapi.garmin.com/badge-service/badge/earned"),
    BADGES_TRANSLATIONS("https://connect.garmin.com/web-translations/badges-list/badges-list%s.properties"),
    GET_HISTORICAL_ACTIVITY_TYPES_URL("https://connectapi.garmin.com/activitylist-service/activities/historical-activity-types"),
    REAL_TIME_STEPS("content:REAL_TIME_STEPS"),
    REAL_TIME_PUSHES("content:REAL_TIME_PUSHES"),
    REAL_TIME_FLOORS("content:REAL_TIME_FLOORS"),
    REAL_TIME_INTENSITY_MINUTES("content:REAL_TIME_INTENSITY_MINUTES"),
    REAL_TIME_CALORIES("content:REAL_TIME_CALORIES"),
    REAL_TIME_RESPIRATION("content:REAL_TIME_RESPIRATION"),
    REAL_TIME_TRAINING_READINESS("content:REAL_TIME_TRAINING_READINESS"),
    SLEEP_EDUCATION_BODY_BATTERY("content:SLEEP_EDUCATION_BODY_BATTERY_LAST_SHOWN"),
    SLEEP_EDUCATION_TRAINING_READINESS("content:SLEEP_EDUCATION_TRAINING_READINESS_LAST_SHOWN"),
    SLEEP_EDUCATION_HRV_STATUS("content:SLEEP_EDUCATION_HRV_STATUS_LAST_SHOWN");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207440a;

    a(String str) {
        this.f207440a = str;
    }
}

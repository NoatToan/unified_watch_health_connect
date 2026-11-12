package com.garmin.android.apps.connectmobile.activities.newmodel;

import c22.q3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/e0;", "", "Lc22/q3;", "speedUnit", "<init>", "(Ljava/lang/String;ILc22/q3;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum e0 {
    METRIC(q3.KILOMETER_PER_HOUR),
    STATUTE(q3.MILE_PER_HOUR),
    NAUTICAL(q3.NAUTICAL_MILES_PER_HOUR),
    AVIATION(q3.AVIATION_KNOTS),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID(q3.METERS_PER_SECOND);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3 f29425a;

    e0(q3 q3Var) {
        this.f29425a = q3Var;
    }
}

package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/i2;", "", "", "userPref", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/b2;", "a", "(Ljava/lang/String;)Lo53/i0;", "data", "", "b", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/b2;)Lo53/i0;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface i2 {
    @i83.f("/userpreference-service/{userPref}")
    o53.i0<c83.a0<b2>> a(@i83.s("userPref") String userPref);

    @i83.k({"Content-Type: application/json"})
    @i83.p("/userpreference-service/{userPref}")
    o53.i0<c83.a0<Unit>> b(@i83.s("userPref") String userPref, @i83.a b2 data);
}

package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/b1;", "", "", "firstDay", "lastDay", "Lc83/a0;", "a", "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b1 {
    @i83.f("/ghs/ecg/v1/ecg/daily?")
    Object a(@i83.t("firstDay") String str, @i83.t("lastDay") String str2, t13.d<? super c83.a0<String>> dVar);
}

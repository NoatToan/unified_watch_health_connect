package com.huami.watch.companion.sport.helper;

import android.content.Context;

/* JADX INFO: loaded from: classes16.dex */
public class SportDetailNavigateHelper implements SportDetailNavigate {
    private SportDetailNavigate a;

    public static class a {
        private static final SportDetailNavigateHelper a = new SportDetailNavigateHelper();

        private a() {
        }
    }

    private SportDetailNavigateHelper() {
    }

    public static SportDetailNavigateHelper getInstance() {
        return a.a;
    }

    @Override // com.huami.watch.companion.sport.helper.SportDetailNavigate
    public int naviSportDetailPage(Context context, long j, String str, int i, String str2) {
        SportDetailNavigate sportDetailNavigate = this.a;
        if (sportDetailNavigate == null) {
            return 0;
        }
        sportDetailNavigate.naviSportDetailPage(context, j, str, i, str2);
        return 0;
    }

    public void setNavigate(SportDetailNavigate sportDetailNavigate) {
        this.a = sportDetailNavigate;
    }
}

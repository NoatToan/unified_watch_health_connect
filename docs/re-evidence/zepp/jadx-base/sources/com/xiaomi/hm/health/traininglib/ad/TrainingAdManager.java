package com.xiaomi.hm.health.traininglib.ad;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingAdManager {
    public static final int AD_TYPE_TRAINING_PAUSE = 2;
    public static final int AD_TYPE_TRAINING_REST = 3;
    public static final int AD_TYPE_TRAINING_SUMMARY = 1;
    private static final String b = "PREF_NAME_TRAINING_AD";
    private static volatile TrainingAdManager c;
    private SharedPreferences a;

    private TrainingAdManager() {
    }

    private String a(long j, int i) {
        return "Training" + j + "_AdType" + i;
    }

    private SharedPreferences b() {
        return this.a;
    }

    private boolean c(long j) {
        if (j <= 0) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar2.setTimeInMillis(j);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static TrainingAdManager getInstance() {
        if (c == null) {
            synchronized (TrainingAdManager.class) {
                if (c == null) {
                    c = new TrainingAdManager();
                }
            }
        }
        return c;
    }

    public void clear() {
        b().edit().clear().apply();
    }

    public void init(Context context) {
        this.a = context.getSharedPreferences(b, 0);
    }

    public void markHasShownAdToday(long j, int i) {
        b().edit().putLong(a(j, i), System.currentTimeMillis()).apply();
    }

    public boolean needShowAdToday(long j, int i) {
        return !c(b().getLong(a(j, i), -1L));
    }
}

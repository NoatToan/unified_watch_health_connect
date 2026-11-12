package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f33372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q53.t f33373c;

    public /* synthetic */ u0(t0 t0Var, q53.t tVar, int i14) {
        this.f33371a = i14;
        this.f33372b = t0Var;
        this.f33373c = tVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i14 = this.f33371a;
        q53.t tVar = this.f33373c;
        t0 t0Var = this.f33372b;
        switch (i14) {
            case 0:
                if (str != null && str.equals("dismissed_activity_trend_prompts")) {
                    ArrayList arrayListH = t0Var.h();
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    String strK = androidx.room.a0.k("getActivityTrendDismissedPrompts changed -> ", arrayListH);
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardPreferences", strK);
                    tVar.i(arrayListH);
                    break;
                }
                break;
            case 1:
                if (str != null && str.equals("today_dismissed_cards")) {
                    int i15 = t0.f33354b;
                    List<String> listK = t0Var.k();
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DashboardPreferences", "getTodayDismissedCards changed -> " + listK);
                    tVar.i(listK);
                    break;
                }
                break;
            default:
                if (str != null && str.equals("whats_new_cards")) {
                    Set<String> setL1 = t0Var.f33355a.L1("whats_new_cards");
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DashboardPreferences", "getWhatsNewCards changed -> " + setL1);
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : setL1) {
                        j70.a0.f97472p.getClass();
                        j70.a0 a0VarA = j70.a0.b.a(str2);
                        if (a0VarA != null) {
                            arrayList.add(a0VarA);
                        }
                    }
                    tVar.i(arrayList);
                    break;
                }
                break;
        }
    }
}

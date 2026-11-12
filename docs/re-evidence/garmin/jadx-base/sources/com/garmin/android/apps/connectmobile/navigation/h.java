package com.garmin.android.apps.connectmobile.navigation;

import am.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/h;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f39377a = new h();

    private h() {
    }

    public static String[] a() {
        bv.b.f21239a.getClass();
        bv.b.a();
        if (k1.f37122a.z0()) {
            g.f39372a.getClass();
            return g.a.f39376d;
        }
        g.f39372a.getClass();
        return g.a.f39375c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0168, code lost:
    
        if (r2.equals("MY_DEVICE") == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01d8, code lost:
    
        if (r2.equals("MY_DEVICE_CUSTOMIZABLE") == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01fd, code lost:
    
        return r3.getString(com.garmin.android.apps.connectmobile.R.string.lbl_my_device_abbr);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str, l22.a aVar) {
        str.getClass();
        switch (str.hashCode()) {
            case -2087167758:
                break;
            case -1774023816:
                if (str.equals("NUTRITION")) {
                    return aVar.getString(R.string.nutrition);
                }
                String strM = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "NavigationUtil", strM);
                return aVar.getString(R.string.no_value);
            case -1761269779:
                if (str.equals("ACTIVITIES")) {
                    return aVar.getString(R.string.concept_activities);
                }
                String strM2 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "NavigationUtil", strM2);
                return aVar.getString(R.string.no_value);
            case -1642752747:
                if (str.equals("LIFESTYLE_LOGGING")) {
                    return aVar.getString(R.string.lbl_lifestyle_log);
                }
                String strM3 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var3, "NavigationUtil", strM3);
                return aVar.getString(R.string.no_value);
            case -1361772903:
                if (str.equals("GARMIN_DIVE")) {
                    return aVar.getString(R.string.diving_app_title);
                }
                String strM4 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var4, "NavigationUtil", strM4);
                return aVar.getString(R.string.no_value);
            case -1361678073:
                if (str.equals("GARMIN_GOLF")) {
                    return aVar.getString(R.string.lbl_garmin_golf_app);
                }
                String strM5 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar6 = i2.f36769a;
                a2 a2Var5 = a2.GENERAL;
                aVar6.getClass();
                i2.a.f(a2Var5, "NavigationUtil", strM5);
                return aVar.getString(R.string.no_value);
            case -1178148982:
                if (str.equals("NEWS_FEED")) {
                    return aVar.getString(R.string.concept_news_feed_abbr);
                }
                String strM6 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar7 = i2.f36769a;
                a2 a2Var6 = a2.GENERAL;
                aVar7.getClass();
                i2.a.f(a2Var6, "NavigationUtil", strM6);
                return aVar.getString(R.string.no_value);
            case -817099703:
                break;
            case -791872467:
                if (str.equals("CIQ_STORE")) {
                    return aVar.getString(R.string.connect_iq_short_title);
                }
                String strM7 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar8 = i2.f36769a;
                a2 a2Var7 = a2.GENERAL;
                aVar8.getClass();
                i2.a.f(a2Var7, "NavigationUtil", strM7);
                return aVar.getString(R.string.no_value);
            case -520278998:
                if (str.equals("TRAINING_AND_PLANNING")) {
                    return aVar.getString(R.string.lbl_training);
                }
                String strM8 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar9 = i2.f36769a;
                a2 a2Var8 = a2.GENERAL;
                aVar9.getClass();
                i2.a.f(a2Var8, "NavigationUtil", strM8);
                return aVar.getString(R.string.no_value);
            case -89243750:
                if (str.equals("PACEPRO")) {
                    return aVar.getString(R.string.pacepro_title);
                }
                String strM9 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar10 = i2.f36769a;
                a2 a2Var9 = a2.GENERAL;
                aVar10.getClass();
                i2.a.f(a2Var9, "NavigationUtil", strM9);
                return aVar.getString(R.string.no_value);
            case 2223327:
                if (str.equals("HOME")) {
                    return aVar.getString(R.string.lbl_home);
                }
                String strM10 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar11 = i2.f36769a;
                a2 a2Var10 = a2.GENERAL;
                aVar11.getClass();
                i2.a.f(a2Var10, "NavigationUtil", strM10);
                return aVar.getString(R.string.no_value);
            case 2372437:
                if (str.equals("MORE")) {
                    return aVar.getString(R.string.label_more);
                }
                String strM11 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar12 = i2.f36769a;
                a2 a2Var11 = a2.GENERAL;
                aVar12.getClass();
                i2.a.f(a2Var11, "NavigationUtil", strM11);
                return aVar.getString(R.string.no_value);
            case 175968485:
                if (str.equals("GOLF_SCORECARD")) {
                    return aVar.getString(R.string.golf_scorecard_abbr);
                }
                String strM12 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar13 = i2.f36769a;
                a2 a2Var12 = a2.GENERAL;
                aVar13.getClass();
                i2.a.f(a2Var12, "NavigationUtil", strM12);
                return aVar.getString(R.string.no_value);
            case 365972667:
                if (str.equals("GOLF_COURSES")) {
                    return aVar.getString(R.string.golf_course_stats_abbr);
                }
                String strM13 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar14 = i2.f36769a;
                a2 a2Var13 = a2.GENERAL;
                aVar14.getClass();
                i2.a.f(a2Var13, "NavigationUtil", strM13);
                return aVar.getString(R.string.no_value);
            case 571516108:
                if (str.equals("MENSTRUAL_CYCLE")) {
                    return aVar.getString(R.string.mct_menstrual_cycle);
                }
                String strM14 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar15 = i2.f36769a;
                a2 a2Var14 = a2.GENERAL;
                aVar15.getClass();
                i2.a.f(a2Var14, "NavigationUtil", strM14);
                return aVar.getString(R.string.no_value);
            case 604302142:
                if (str.equals("CALENDAR")) {
                    return aVar.getString(R.string.concept_calendar_abbr);
                }
                String strM15 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar16 = i2.f36769a;
                a2 a2Var15 = a2.GENERAL;
                aVar16.getClass();
                i2.a.f(a2Var15, "NavigationUtil", strM15);
                return aVar.getString(R.string.no_value);
            case 672572432:
                if (str.equals("PERFORMANCE")) {
                    return aVar.getString(R.string.lbl_performance);
                }
                String strM16 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar17 = i2.f36769a;
                a2 a2Var16 = a2.GENERAL;
                aVar17.getClass();
                i2.a.f(a2Var16, "NavigationUtil", strM16);
                return aVar.getString(R.string.no_value);
            case 733948021:
                if (str.equals("GARMIN_COACH")) {
                    return aVar.getString(R.string.lbl_adaptive_training_plan);
                }
                String strM17 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar18 = i2.f36769a;
                a2 a2Var17 = a2.GENERAL;
                aVar18.getClass();
                i2.a.f(a2Var17, "NavigationUtil", strM17);
                return aVar.getString(R.string.no_value);
            case 818282870:
                if (str.equals("WORKOUTS")) {
                    return aVar.getString(R.string.concept_workouts);
                }
                String strM18 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar19 = i2.f36769a;
                a2 a2Var18 = a2.GENERAL;
                aVar19.getClass();
                i2.a.f(a2Var18, "NavigationUtil", strM18);
                return aVar.getString(R.string.no_value);
            case 1017052272:
                if (str.equals("CHALLENGES")) {
                    return aVar.getString(R.string.concept_challenges_abbr);
                }
                String strM19 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar110 = i2.f36769a;
                a2 a2Var19 = a2.GENERAL;
                aVar110.getClass();
                i2.a.f(a2Var19, "NavigationUtil", strM19);
                return aVar.getString(R.string.no_value);
            case 1327769563:
                if (str.equals("INSIGHTS")) {
                    return aVar.getString(R.string.title_insights);
                }
                String strM110 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar111 = i2.f36769a;
                a2 a2Var110 = a2.GENERAL;
                aVar111.getClass();
                i2.a.f(a2Var110, "NavigationUtil", strM110);
                return aVar.getString(R.string.no_value);
            case 1529020173:
                if (str.equals("PREGNANCY")) {
                    return aVar.getString(R.string.pregnancy_title);
                }
                String strM111 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar112 = i2.f36769a;
                a2 a2Var111 = a2.GENERAL;
                aVar112.getClass();
                i2.a.f(a2Var111, "NavigationUtil", strM111);
                return aVar.getString(R.string.no_value);
            case 1675931544:
                if (str.equals("COURSES")) {
                    return aVar.getString(R.string.concept_courses);
                }
                String strM112 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar113 = i2.f36769a;
                a2 a2Var112 = a2.GENERAL;
                aVar113.getClass();
                i2.a.f(a2Var112, "NavigationUtil", strM112);
                return aVar.getString(R.string.no_value);
            case 1838495648:
                if (str.equals("SEGMENTS")) {
                    return aVar.getString(R.string.card_segments_title);
                }
                String strM113 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar114 = i2.f36769a;
                a2 a2Var113 = a2.GENERAL;
                aVar114.getClass();
                i2.a.f(a2Var113, "NavigationUtil", strM113);
                return aVar.getString(R.string.no_value);
            case 1981765218:
                if (str.equals("GOLF_STATS")) {
                    return aVar.getString(R.string.golf_overall_stats_abbr);
                }
                String strM114 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar115 = i2.f36769a;
                a2 a2Var114 = a2.GENERAL;
                aVar115.getClass();
                i2.a.f(a2Var114, "NavigationUtil", strM114);
                return aVar.getString(R.string.no_value);
            case 2127033948:
                if (str.equals("HEALTH")) {
                    return aVar.getString(R.string.choose_exp_health);
                }
                String strM115 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar116 = i2.f36769a;
                a2 a2Var115 = a2.GENERAL;
                aVar116.getClass();
                i2.a.f(a2Var115, "NavigationUtil", strM115);
                return aVar.getString(R.string.no_value);
            default:
                String strM116 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar117 = i2.f36769a;
                a2 a2Var116 = a2.GENERAL;
                aVar117.getClass();
                i2.a.f(a2Var116, "NavigationUtil", strM116);
                return aVar.getString(R.string.no_value);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016b, code lost:
    
        if (r3.equals("MY_DEVICE") == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01db, code lost:
    
        if (r3.equals("MY_DEVICE_CUSTOMIZABLE") == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0200, code lost:
    
        return r2.getString(com.garmin.android.apps.connectmobile.R.string.lbl_my_device_abbr);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(l22.b bVar, String str) {
        str.getClass();
        bVar.getClass();
        switch (str.hashCode()) {
            case -2087167758:
                break;
            case -1774023816:
                if (str.equals("NUTRITION")) {
                    return bVar.getString(R.string.nutrition);
                }
                String strM = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "NavigationUtil", strM);
                return bVar.getString(R.string.no_value);
            case -1761269779:
                if (str.equals("ACTIVITIES")) {
                    return bVar.getString(R.string.concept_activities);
                }
                String strM2 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var2, "NavigationUtil", strM2);
                return bVar.getString(R.string.no_value);
            case -1642752747:
                if (str.equals("LIFESTYLE_LOGGING")) {
                    return bVar.getString(R.string.lbl_lifestyle_logging);
                }
                String strM3 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var3, "NavigationUtil", strM3);
                return bVar.getString(R.string.no_value);
            case -1361772903:
                if (str.equals("GARMIN_DIVE")) {
                    return bVar.getString(R.string.diving_app_title);
                }
                String strM4 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar4 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var4, "NavigationUtil", strM4);
                return bVar.getString(R.string.no_value);
            case -1361678073:
                if (str.equals("GARMIN_GOLF")) {
                    return bVar.getString(R.string.lbl_garmin_golf_app);
                }
                String strM5 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar5 = i2.f36769a;
                a2 a2Var5 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var5, "NavigationUtil", strM5);
                return bVar.getString(R.string.no_value);
            case -1178148982:
                if (str.equals("NEWS_FEED")) {
                    return bVar.getString(R.string.concept_news_feed_abbr);
                }
                String strM6 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar6 = i2.f36769a;
                a2 a2Var6 = a2.GENERAL;
                aVar6.getClass();
                i2.a.f(a2Var6, "NavigationUtil", strM6);
                return bVar.getString(R.string.no_value);
            case -817099703:
                break;
            case -791872467:
                if (str.equals("CIQ_STORE")) {
                    return bVar.getString(R.string.connect_iq_store_title);
                }
                String strM7 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar7 = i2.f36769a;
                a2 a2Var7 = a2.GENERAL;
                aVar7.getClass();
                i2.a.f(a2Var7, "NavigationUtil", strM7);
                return bVar.getString(R.string.no_value);
            case -520278998:
                if (str.equals("TRAINING_AND_PLANNING")) {
                    return bVar.getString(R.string.lbl_training);
                }
                String strM8 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar8 = i2.f36769a;
                a2 a2Var8 = a2.GENERAL;
                aVar8.getClass();
                i2.a.f(a2Var8, "NavigationUtil", strM8);
                return bVar.getString(R.string.no_value);
            case -89243750:
                if (str.equals("PACEPRO")) {
                    return bVar.getString(R.string.pacepro_title);
                }
                String strM9 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar9 = i2.f36769a;
                a2 a2Var9 = a2.GENERAL;
                aVar9.getClass();
                i2.a.f(a2Var9, "NavigationUtil", strM9);
                return bVar.getString(R.string.no_value);
            case 2223327:
                if (str.equals("HOME")) {
                    return bVar.getString(R.string.lbl_home);
                }
                String strM10 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar10 = i2.f36769a;
                a2 a2Var10 = a2.GENERAL;
                aVar10.getClass();
                i2.a.f(a2Var10, "NavigationUtil", strM10);
                return bVar.getString(R.string.no_value);
            case 2372437:
                if (str.equals("MORE")) {
                    return bVar.getString(R.string.label_more);
                }
                String strM11 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar11 = i2.f36769a;
                a2 a2Var11 = a2.GENERAL;
                aVar11.getClass();
                i2.a.f(a2Var11, "NavigationUtil", strM11);
                return bVar.getString(R.string.no_value);
            case 175968485:
                if (str.equals("GOLF_SCORECARD")) {
                    return bVar.getString(R.string.app_tour_scorecards_title);
                }
                String strM12 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar12 = i2.f36769a;
                a2 a2Var12 = a2.GENERAL;
                aVar12.getClass();
                i2.a.f(a2Var12, "NavigationUtil", strM12);
                return bVar.getString(R.string.no_value);
            case 365972667:
                if (str.equals("GOLF_COURSES")) {
                    return bVar.getString(R.string.golf_courses_stats_component_title);
                }
                String strM13 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar13 = i2.f36769a;
                a2 a2Var13 = a2.GENERAL;
                aVar13.getClass();
                i2.a.f(a2Var13, "NavigationUtil", strM13);
                return bVar.getString(R.string.no_value);
            case 571516108:
                if (str.equals("MENSTRUAL_CYCLE")) {
                    return bVar.getString(R.string.mct_menstrual_cycle);
                }
                String strM14 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar14 = i2.f36769a;
                a2 a2Var14 = a2.GENERAL;
                aVar14.getClass();
                i2.a.f(a2Var14, "NavigationUtil", strM14);
                return bVar.getString(R.string.no_value);
            case 604302142:
                if (str.equals("CALENDAR")) {
                    return bVar.getString(R.string.concept_calendar_abbr);
                }
                String strM15 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar15 = i2.f36769a;
                a2 a2Var15 = a2.GENERAL;
                aVar15.getClass();
                i2.a.f(a2Var15, "NavigationUtil", strM15);
                return bVar.getString(R.string.no_value);
            case 672572432:
                if (str.equals("PERFORMANCE")) {
                    return bVar.getString(R.string.lbl_performance_stats);
                }
                String strM16 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar16 = i2.f36769a;
                a2 a2Var16 = a2.GENERAL;
                aVar16.getClass();
                i2.a.f(a2Var16, "NavigationUtil", strM16);
                return bVar.getString(R.string.no_value);
            case 733948021:
                if (str.equals("GARMIN_COACH")) {
                    return bVar.getString(R.string.atp_lbl_plans_section_title);
                }
                String strM17 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar17 = i2.f36769a;
                a2 a2Var17 = a2.GENERAL;
                aVar17.getClass();
                i2.a.f(a2Var17, "NavigationUtil", strM17);
                return bVar.getString(R.string.no_value);
            case 818282870:
                if (str.equals("WORKOUTS")) {
                    return bVar.getString(R.string.concept_workouts);
                }
                String strM18 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar18 = i2.f36769a;
                a2 a2Var18 = a2.GENERAL;
                aVar18.getClass();
                i2.a.f(a2Var18, "NavigationUtil", strM18);
                return bVar.getString(R.string.no_value);
            case 1017052272:
                if (str.equals("CHALLENGES")) {
                    return bVar.getString(R.string.concept_challenges_abbr);
                }
                String strM19 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar19 = i2.f36769a;
                a2 a2Var19 = a2.GENERAL;
                aVar19.getClass();
                i2.a.f(a2Var19, "NavigationUtil", strM19);
                return bVar.getString(R.string.no_value);
            case 1327769563:
                if (str.equals("INSIGHTS")) {
                    return bVar.getString(R.string.title_insights);
                }
                String strM110 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar110 = i2.f36769a;
                a2 a2Var110 = a2.GENERAL;
                aVar110.getClass();
                i2.a.f(a2Var110, "NavigationUtil", strM110);
                return bVar.getString(R.string.no_value);
            case 1529020173:
                if (str.equals("PREGNANCY")) {
                    return bVar.getString(R.string.pregnancy_title);
                }
                String strM111 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar111 = i2.f36769a;
                a2 a2Var111 = a2.GENERAL;
                aVar111.getClass();
                i2.a.f(a2Var111, "NavigationUtil", strM111);
                return bVar.getString(R.string.no_value);
            case 1675931544:
                if (str.equals("COURSES")) {
                    return bVar.getString(R.string.concept_courses);
                }
                String strM112 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar112 = i2.f36769a;
                a2 a2Var112 = a2.GENERAL;
                aVar112.getClass();
                i2.a.f(a2Var112, "NavigationUtil", strM112);
                return bVar.getString(R.string.no_value);
            case 1838495648:
                if (str.equals("SEGMENTS")) {
                    return bVar.getString(R.string.card_segments_title);
                }
                String strM113 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar113 = i2.f36769a;
                a2 a2Var113 = a2.GENERAL;
                aVar113.getClass();
                i2.a.f(a2Var113, "NavigationUtil", strM113);
                return bVar.getString(R.string.no_value);
            case 1981765218:
                if (str.equals("GOLF_STATS")) {
                    return bVar.getString(R.string.golf_overall_stats_component_title);
                }
                String strM114 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar114 = i2.f36769a;
                a2 a2Var114 = a2.GENERAL;
                aVar114.getClass();
                i2.a.f(a2Var114, "NavigationUtil", strM114);
                return bVar.getString(R.string.no_value);
            case 2127033948:
                if (str.equals("HEALTH")) {
                    return bVar.getString(R.string.lbl_health_stats);
                }
                String strM115 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar115 = i2.f36769a;
                a2 a2Var115 = a2.GENERAL;
                aVar115.getClass();
                i2.a.f(a2Var115, "NavigationUtil", strM115);
                return bVar.getString(R.string.no_value);
            default:
                String strM116 = j.m("Title for NavigationScreen with ID ", str, " is not set! FIX ME");
                i2.a aVar116 = i2.f36769a;
                a2 a2Var116 = a2.GENERAL;
                aVar116.getClass();
                i2.a.f(a2Var116, "NavigationUtil", strM116);
                return bVar.getString(R.string.no_value);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:99:0x0130 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r3.equals("GOLF_STATS") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r3.equals("SEGMENTS") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r3.equals("COURSES") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r3.equals("CHALLENGES") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r3.equals("WORKOUTS") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        return r0.m0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        if (r3.equals("CALENDAR") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c1, code lost:
    
        if (r3.equals("GOLF_COURSES") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cb, code lost:
    
        if (r3.equals("GOLF_SCORECARD") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d2, code lost:
    
        return r0.z0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f5, code lost:
    
        if (r3.equals("NEWS_FEED") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fd, code lost:
    
        return !r0.z0();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(String str) {
        str.getClass();
        bv.b.f21239a.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        switch (str.hashCode()) {
            case -1774023816:
                if (str.equals("NUTRITION")) {
                    return k1Var.w0();
                }
                return true;
            case -1761269779:
                if (str.equals("ACTIVITIES")) {
                    return k1Var.S0();
                }
                return true;
            case -1361772903:
                if (str.equals("GARMIN_DIVE")) {
                    return k1Var.R0();
                }
                return true;
            case -1361678073:
                if (str.equals("GARMIN_GOLF")) {
                    return k1Var.L0();
                }
                return true;
            case -1178148982:
                break;
            case -791872467:
                if (str.equals("CIQ_STORE")) {
                    return k1Var.v0();
                }
                return true;
            case -89243750:
                if (str.equals("PACEPRO")) {
                    return k1Var.m0();
                }
                return true;
            case 175968485:
                break;
            case 365972667:
                break;
            case 571516108:
                if (str.equals("MENSTRUAL_CYCLE")) {
                    return k1Var.d();
                }
                return true;
            case 604302142:
                break;
            case 672572432:
                if (str.equals("PERFORMANCE")) {
                    return k1Var.R();
                }
                return true;
            case 733948021:
                if (str.equals("GARMIN_COACH") && !(k1Var.m0() && k1Var.g())) {
                    return false;
                }
                return true;
            case 818282870:
                break;
            case 1017052272:
                break;
            case 1327769563:
                if (str.equals("INSIGHTS")) {
                    return k1Var.S();
                }
                return true;
            case 1529020173:
                if (str.equals("PREGNANCY")) {
                    return k1Var.c();
                }
                return true;
            case 1675931544:
                break;
            case 1838495648:
                break;
            case 1981765218:
                break;
            case 2127033948:
                if (str.equals("HEALTH")) {
                    return k1Var.f0();
                }
                return true;
            default:
                return true;
        }
    }
}

package k31;

import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import d31.d;
import f72.a2;
import f72.a3;
import f72.ae;
import f72.f0;
import f72.fe;
import f72.g;
import f72.ha;
import f72.j0;
import f72.jd;
import f72.jf;
import f72.m2;
import f72.na;
import f72.o2;
import f72.ob;
import f72.s9;
import f72.w2;
import f72.x1;
import f72.x2;
import f72.z2;
import f72.zd;
import j72.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k72.y;
import o72.t;
import oe2.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.w;
import p13.x;
import u62.e1;
import u62.f3;
import v62.a6;
import v62.b5;
import v62.d2;
import v62.e5;
import v62.g2;
import v62.h;
import v62.h6;
import v62.ia;
import v62.k7;
import v62.l9;
import v62.m9;
import v62.r2;
import v62.s;
import v62.v7;
import v62.w8;
import v62.y3;
import y62.i;
import y62.k;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 't' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dBÁ\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lk31/c;", "", "Ld31/d;", NotificationConstants.KEY_DATA_MIME_TYPE, "Ld31/b;", "associationType", "", "Le31/a;", "checks", "Lu4/d;", "icon", "", "nameResourceId", "setupNameResourceId", "setupDescriptionResourceId", "homeTitleResourceId", "homeDescriptionResourceId", "homeActionResourceId", "Lc22/g2;", "onDemandName", "onDemandSetupName", "onDemandSetupDescription", "onDemandHomeTitle", "onDemandHomeDescription", "fullImageResourceId", "Lk31/b;", "onboardingDeviceFilterTypes", "<init>", "(Ljava/lang/String;ILd31/d;Ld31/b;Ljava/util/List;Lu4/d;IIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILk31/b;)V", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public static final c F;
    public static final c H0;
    public static final c I;
    public static final c I0;
    public static final c J0;
    public static final c K0;
    public static final c L0;
    public static final c M0;
    public static final c N0;
    public static final c O0;
    public static final c P;
    public static final c P0;
    public static final c Q0;
    public static final c R0;
    public static final c S0;
    public static final c T;
    public static final c T0;
    public static final c U0;
    public static final c V0;
    public static final c W0;
    public static final c X;
    public static final c X0;
    public static final c Y;
    public static final c Y0;
    public static final c Z;
    public static final c Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final c f102613a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final c f102614b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final c f102615c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final c f102616d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final c f102617e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final c f102618f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final c f102619g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final c f102620h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final c f102621i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final c f102622j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final c f102623k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final c f102624k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final c f102625l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final c f102626m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final c f102627n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final c f102628o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final c f102629p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final c f102630q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f102631r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final c f102632r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final c f102633s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f102634t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final c f102635t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final c f102636u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f102637v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final c f102638v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f102639w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final /* synthetic */ c[] f102640w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f102641x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final /* synthetic */ w13.c f102642x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f102643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f102644z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f102645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d31.b f102646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e31.a> f102647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u4.d f102648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f102649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f102650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f102651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f102652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f102653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f102654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f102655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f102656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f102657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f102658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f102659o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f102660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f102661q;

    static {
        d dVar = d.AB_QUANTUM;
        d31.b bVar = d31.b.ANY_PAIRED_DEVICE;
        f102634t = new c("AB_QUANTUM", 0, dVar, bVar, w.c(e31.a.ENTERED_AB_QUANTUM), c10.b.a(), R.string.ab_quantum_app_name, R.string.ab_quantum_onboarding_item_title, R.string.ab_quantum_onboarding_item_caption, R.string.ab_quantum_onboarding_item_title, R.string.ab_quantum_onboarding_item_caption, 0, null, null, null, null, null, 0, null, 130560, null);
        f102637v = new c("AB_SYNAPSE", 1, d.AB_SYNAPSE, bVar, w.c(e31.a.ENTERED_AB_SYNAPSE), c10.b.a(), R.string.lbl_ab_synapse_app_name, R.string.ab_synapse_app_onboarding_item_title, R.string.ab_synapse_app_onboarding_item_caption, R.string.ab_synapse_app_onboarding_item_title, R.string.ab_synapse_app_onboarding_item_caption, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar2 = d.ACTIVATE_LTE_SERVICE;
        d31.b bVar2 = d31.b.EACH_PAIRED_DEVICE;
        List listC = w.c(e31.a.HAS_INREACH_SUBSCRIPTION);
        s62.a aVar = s62.a.f157643a;
        f102639w = new c("ACTIVATE_LTE_SERVICE", 2, dVar2, bVar2, listC, o2.a(oc.b.o(aVar)), R.string.onboarding_lte_service_item_title, R.string.onboarding_lte_service_item_list_title, R.string.onboarding_lte_service_item_list_caption, R.string.onboarding_lte_service_item_list_title, R.string.onboarding_lte_service_activation_description, 0, null, null, null, null, null, 0, null, 130560, null);
        f102641x = new c("ALARM", 3, d.ALARM, bVar2, w.c(e31.a.ENTERED_ALARMS), h.a(t.B(aVar)), R.string.device_setting_alarms, R.string.onboarding_device_setup_create_alarms_title, R.string.onboarding_device_setup_create_alarms_subtitle, R.string.onboarding_alarm_dialog_title, R.string.onboarding_alarm_dialog_body, 0, null, null, null, null, null, 0, null, 130560, null);
        f102643y = new c("AUTO_ACTIVITY_START", 4, d.AUTO_ACTIVITY_START, bVar2, w.c(e31.a.ENTERED_ACTIVITY_TRACKING_SCREEN), s.a(t.B(aVar)), R.string.auto_activity_start, R.string.startup_set_up_auto_activity_start, R.string.onboaring_auto_activities_subtitle, R.string.onboarding_activities_autostart_dialog_title, R.string.onboarding_activities_autostart_dialog_body, 0, null, null, null, null, null, 0, null, 130560, null);
        f102644z = new c("BIKE_ALARM", 5, d.BIKE_ALARM, bVar, w.c(e31.a.VISITED_BIKE_ALARM_TUTORIAL), a6.a(t.B(aVar)), R.string.lbl_bike_alarm, R.string.onboarding_widget_item_bike_alarm_title, R.string.onboarding_device_setup_bike_alarm_subtitle, R.string.onboarding_bike_alarm_remainder_dialog_title, R.string.onboarding_bike_alarm_launch_dialog_description, 0, null, null, null, null, null, 0, null, 130560, null);
        A = new c("BPM_REMINDERS", 6, d.BPM_REMINDERS, bVar, w.c(e31.a.ENTERED_BPM_REMINDERS), a6.a(t.B(aVar)), R.string.lbl_set_reminders, R.string.lbl_set_reminders, R.string.lbl_notify_reading, R.string.lbl_set_reminders, R.string.lbl_notify_reading, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar3 = d.CIQ_APPS;
        e31.a aVar2 = e31.a.HAS_CONNECT_IQ_APP_INSTALLED;
        B = new c("CIQ_APPS", 7, dVar3, bVar2, w.c(aVar2), w2.a(oc.b.o(aVar)), R.string.lbl_connect_iq, R.string.onboarding_device_setup_connect_iq_title_2, R.string.onboarding_device_setup_connect_iq_subtitle, R.string.onboarding_device_setup_connect_iq_title_2, R.string.onboarding_connect_iq_reminder_body, 0, null, null, null, null, null, 0, null, 130560, null);
        List listC2 = w.c(aVar2);
        u4.d dVarA = w2.a(oc.b.o(aVar));
        b bVar3 = b.DEDICATED_BIKE_COMPUTER;
        C = new c("CIQ_APPS_FOR_EDGE", 8, dVar3, bVar2, listC2, dVarA, R.string.lbl_connect_iq, R.string.onboarding_device_setup_connect_iq_title_2, R.string.onboarding_device_setup_connect_iq_search_subtitle, R.string.onboarding_device_setup_connect_iq_title_2, R.string.onboarding_connect_iq_search_reminder_body, 0, null, null, null, null, null, 0, bVar3, 65024, null);
        D = new c("CONNECTIONS", 9, d.CONNECTIONS, bVar, w.c(e31.a.ENTERED_MAKE_CONNECTIONS_SCREEN), l9.a(t.B(aVar)), R.string.social_find_friends, R.string.social_find_friends, R.string.msg_find_friends_description, R.string.onboarding_follow_others_title, R.string.onboarding_follow_others_description, 0, null, null, null, null, null, 0, null, 130560, null);
        E = new c("CONTACTS", 10, d.CONTACTS, bVar, w.c(e31.a.HAS_CONTACTS), d2.a(t.B(aVar)), R.string.contact_management_title_contacts, R.string.onboarding_menu_contacts_title, R.string.onboarding_menu_contacts_subtitle, R.string.onboarding_contacts_title, R.string.onboarding_contacts_reminde_body, 0, null, null, null, null, null, 0, null, 130560, null);
        F = new c("CREATE_COURSE", 11, d.CREATE_COURSE, bVar, w.c(e31.a.ENTERED_COURSES), g2.a(t.B(aVar)), R.string.concept_courses, R.string.lbl_create_a_course, R.string.onboarding_device_setup_create_course_subtitle, R.string.onboarding_courses_reminder_title, R.string.onboarding_courses_reminder_body, 0, null, null, null, null, null, 0, null, 130560, null);
        I = new c("DAILY_STATS", 12, d.DAILY_STATS, bVar2, w.c(e31.a.HAS_ENTERED_DAILY_STATS), a2.a(oc.b.o(aVar)), R.string.lbl_daily_stats, R.string.lbl_daily_stats, R.string.msg_daily_stats, R.string.lbl_daily_stats, R.string.msg_daily_stats, 0, null, null, null, null, null, 0, null, 130560, null);
        P = new c("DEVICE_DISPLAY_NAME", 13, d.DEVICE_DISPLAY_NAME, bVar2, w.c(e31.a.ENTERED_DEVICE_DISPLAY_NAME), r2.a(t.B(aVar)), R.string.lbl_display_name, R.string.device_display_name_title, R.string.device_display_name_subtitle, R.string.onboarding_device_display_name_title, R.string.onboarding_device_display_name_dialog_body, 0, null, null, null, null, null, 0, null, 130560, null);
        T = new c("DEZL_APP", 14, d.DEZL_APP, bVar, w.c(e31.a.HAS_DEZL_APP_INSTALLED), x2.a(oc.b.o(aVar)), R.string.dezl_title, R.string.onboarding_dezl_reminder_title, R.string.onboarding_dezl_reminder_body, R.string.onboarding_dezl_reminder_title, R.string.onboarding_dezl_reminder_body, 0, null, null, null, null, null, 0, null, 130560, null);
        X = new c("ELECTROCARDIOGRAM", 15, d.ECG, bVar2, w.c(e31.a.ECG_APP_ENABLED), j0.a(oc.b.o(aVar)), R.string.lbl_ecg_app, R.string.lbl_set_up_ecg_app, R.string.lbl_activate_the_ecg_app_on_your_device, R.string.onboarding_activate_ecg_title, R.string.msg_set_up_ecg_app, 0, null, null, null, null, null, 0, null, 130560, null);
        Y = new c("GARMIN_COACH", 16, d.GARMIN_COACH, bVar, w.c(e31.a.ENTERED_GARMIN_COACH), f72.s.a(oc.b.o(aVar)), R.string.lbl_adaptive_training_plan, R.string.onboarding_device_setup_garmin_coach_title, R.string.onboarding_device_setup_garmin_coach_subtitle, R.string.onboarding_garmin_coach_dialog_title, R.string.onboarding_garmin_coach_dialog_body, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar4 = d.GARMIN_DIVE;
        List listC3 = w.c(e31.a.GARMIN_DIVE_APP_ONBOARDING);
        oc.b.o(aVar).getClass();
        Z = new c("GARMIN_DIVE", 17, dVar4, bVar, listC3, g72.d.a(f0.f69546a), R.string.garmin_dive, R.string.onboarding_dive_menu_title, R.string.lbl_install_dive_subtitle, R.string.onboarding_dive_reminder_title, R.string.onboarding_dive_reminder_body, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar5 = d.GARMIN_MESSENGER;
        e31.a aVar3 = e31.a.ENTERED_GARMIN_MESSENGER;
        e31.a aVar4 = e31.a.HAS_MESSENGER_APP_INSTALLED;
        e31.a aVar5 = e31.a.INREACH_SUBSCRIPTION_ACTIVATED_ON_DEVICE;
        f102623k0 = new c("GARMIN_MESSENGER", 18, dVar5, bVar2, x.k(aVar3, aVar4, aVar5), s9.a(oc.b.o(aVar)), R.string.lbl_garmin_messenger_app_name, R.string.lbl_garmin_messenger_app_name, R.string.msg_get_inreach_direct_activation_settings, R.string.lbl_garmin_messenger_app_name, R.string.msg_get_inreach_direct_activation, 0, null, null, null, null, null, 0, b.INREACH_DIRECT_ACTIVATION_CAPABLE, 65024, null);
        H0 = new c("GARMIN_MESSENGER_OLD_DEVICES", 19, dVar5, bVar2, x.k(aVar3, aVar4, aVar5), s9.a(oc.b.o(aVar)), R.string.lbl_garmin_messenger_app_name, R.string.lbl_garmin_messenger_app_name, R.string.msg_get_inreach_old_devices, R.string.lbl_garmin_messenger_app_name, R.string.msg_get_inreach_old_devices, 0, null, null, null, null, null, 0, null, 130560, null);
        I0 = new c("GARMIN_PAY", 20, d.GARMIN_PAY, bVar2, w.c(e31.a.CREATED_GARMIN_PAY_WALLET), ae.a(oc.b.o(aVar)), R.string.wallet_garmin_pay, R.string.onboarding_device_setup_garmin_pay_title, R.string.onboarding_device_setup_garmin_pay_subtitle, R.string.onboarding_device_setup_garmin_pay_title, R.string.onboarding_garmin_pay_reminder_body, 0, null, null, null, null, null, 0, null, 130560, null);
        J0 = new c("GARMIN_PILOT", 21, d.GARMIN_PILOT, bVar2, w.c(e31.a.ENTERED_GARMIN_PILOT), e1.a(oi0.c.v(aVar)), R.string.garmin_pilot_name, R.string.lbl_garmin_pilot_onboarding_item_title, R.string.lbl_garmin_pilot_onboarding_item_caption, R.string.lbl_garmin_pilot_onboarding_item_title, R.string.lbl_garmin_pilot_onboarding_item_reminder_caption, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar6 = d.GROUP_OVERHAUL_NO_GROUP;
        d31.b bVar4 = d31.b.APP;
        K0 = new c("GROUP_OVERHAUL_NO_GROUP", 22, dVar6, bVar4, w.c(e31.a.ENTERED_GROUPS), m9.a(t.B(aVar)), R.string.lbl_groups, R.string.lbl_groups, R.string.onboarding_group_out_there_message, R.string.onboarding_group_out_there_title, R.string.onboarding_group_out_there_message, R.string.social_go_to_groups, null, null, null, null, null, 2131232849, null, 97280, null);
        L0 = new c("GROUP_RIDE", 23, d.GROUP_RIDE, bVar2, w.c(e31.a.ENTERED_GROUP_RIDE), x1.a(oc.b.o(aVar)), R.string.lbl_group_ride, R.string.onboarding_device_setup_group_ride_title, R.string.onboarding_device_setup_group_ride_subtitle, R.string.onboarding_group_ride_reminder_dialog_title, R.string.onboarding_group_ride_description, 0, null, null, null, null, null, 0, null, 130560, null);
        M0 = new c("HEART_RATE_ZONES", 24, d.HEART_RATE_ZONES, bVar, w.c(e31.a.HEART_RATE_ZONES_CONFIGURED), f72.d2.a(oc.b.o(aVar)), R.string.lbl_heart_rate_zones, R.string.lbl_review_hr_zones, R.string.msg_view_and_customize_zones, R.string.lbl_review_hr_zones, R.string.msg_set_heart_rate_zones, 0, null, null, null, null, null, 0, null, 130560, null);
        N0 = new c("INCIDENT_DETECTION", 25, d.INCIDENT_DETECTION, bVar2, w.c(e31.a.HAS_EMERGENCY_CONTACTS), k7.a(t.B(aVar)), R.string.onboarding_dialog_safety, R.string.device_settings_safety_features, R.string.onboarding_device_setup_assistance_subtitle_2, R.string.device_settings_safety_features, R.string.onboarding_safety_assistance_reminder_description, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar7 = d.INDEX_SCALE_CONNECTIONS;
        e31.a aVar6 = e31.a.ENTERED_MANAGE_PEOPLE_SCREEN;
        O0 = new c("INDEX_SCALE_CONNECTIONS", 26, dVar7, bVar2, w.c(aVar6), m2.a(oc.b.o(aVar)), R.string.onboarding_invite_connection_dialog_title, R.string.onboarding_menu_invitation_title, R.string.onboarding_friends_menu_invitation_subtitle, R.string.onboarding_share_device_title, R.string.onboarding_index_friends_description, 0, null, null, null, null, null, 0, b.SCALE, 65024, null);
        P0 = new c("INDEX_BPM_CONNECTIONS", 27, dVar7, bVar2, w.c(aVar6), g.a(oc.b.o(aVar)), R.string.onboarding_invite_connection_dialog_title, R.string.onboarding_invite_connection_dialog_title, R.string.lbl_share_device_with_others, R.string.onboarding_share_device_title, R.string.onboarding_index_friends_description, 0, null, null, null, null, null, 0, b.BLOOD_PRESSURE_MONITOR, 65024, null);
        Q0 = new c("DEVICE_WELCOME", 28, d.DEVICE_WELCOME, bVar2, w.c(e31.a.ONBOARDING_COMPLETE), v62.m2.a(t.B(aVar)), R.string.msg_congrats_on_new_device, R.string.msg_congrats_on_new_device, R.string.msg_device_onboarding_welcome, R.string.msg_congrats_on_new_device, R.string.msg_device_onboarding_welcome, 0, null, null, null, null, null, 0, null, 130560, null);
        R0 = new c("INTELLIGENT_TRAINING_PLAN", 29, d.INTELLIGENT_TRAINING_PLAN, bVar, w.c(e31.a.ENTERED_TRAINING_PLANS), jd.a(oc.b.o(aVar)), R.string.lbl_training_plans, R.string.onboarding_start_training_plan_title, R.string.onboarding_start_training_plan_description, R.string.onboarding_itp_title, R.string.onboarding_itp_body, 0, null, null, null, null, null, 0, null, 130560, null);
        S0 = new c("JET_LAG", 30, d.JET_LAG, bVar, w.c(e31.a.ENTERED_JET_LAG), x2.a(oc.b.o(aVar)), R.string.lbl_jet_lag_advisor, R.string.lbl_jet_lag_advisor, R.string.onboarding_jet_lag_short_description, R.string.lbl_jet_lag_advisor, R.string.onboarding_jet_lag_description, R.string.lbl_add_trip_details, null, null, null, null, null, 0, null, 130048, null);
        T0 = new c("KOMOOT", 31, d.KOMOOT, bVar, w.c(e31.a.ENTERED_KOMOOT), c10.d.a(), R.string.lbl_komoot, R.string.onboarding_item_komoot_title, R.string.onboarding_item_komoot_subtitle, R.string.onboarding_item_komoot_title, R.string.onboarding_komoot_description, 0, null, null, null, null, null, 0, null, 130560, null);
        U0 = new c("LIFESTYLE_LOGGING", 32, d.LIFESTYLE_LOGGING, bVar4, w.c(e31.a.HAS_ENTERED_LIFESTYLE_LOGGING), z2.a(oc.b.o(aVar)), R.string.lbl_lifestyle_logging, R.string.lbl_set_up_lifestyle_logging, R.string.msg_finish_set_up_lifestyle_logging, R.string.lbl_set_up_lifestyle_logging, R.string.msg_onboarding_set_up_lifestyle_logging, 0, null, null, null, null, null, 0, null, 130560, null);
        V0 = new c("LIVETRACK", 33, d.LIVE_TRACK, bVar2, w.c(e31.a.ENTERED_LIVE_TRACK), a3.a(oc.b.o(aVar)), R.string.title_live_track, R.string.onboarding_menu_livetrack_title, R.string.onboarding_device_setup_livetrack_subtitle, R.string.onboarding_livetrack_reminder_title, R.string.onboarding_course_capable_livetrack_reminder_body, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar8 = d.LTE;
        e31.a aVar7 = e31.a.ENTERED_LTE_SETUP;
        W0 = new c("LTE", 34, dVar8, bVar2, w.c(aVar7), b5.a(t.B(aVar)), R.string.onboarding_device_setup_lte_title, R.string.onboarding_device_setup_lte_title, R.string.onboarding_device_setup_lte_subtitle, R.string.onboarding_lte_reminder_title, R.string.onboarding_lte_reminder_body, 0, null, null, null, null, null, 0, null, 130560, null);
        X0 = new c("LTE_GENERIC", 35, d.LTE_GENERIC, bVar2, w.c(aVar7), b5.a(t.B(aVar)), R.string.device_settings_lte, R.string.lte_set_up_button_title, R.string.lte_onboarding_subtitle, R.string.lte_set_up_button_title, R.string.lte_generic_onboarding_descr, 0, null, null, null, null, null, 0, null, 130560, null);
        Y0 = new c("MENSTRUAL_CYCLE_TRACKING", 36, d.MENSTRUAL_CYCLE_TRACKING, bVar4, w.c(e31.a.ENTERED_MENSTRUAL_CYCLE_TRACKING), jf.a(oc.b.o(aVar)), R.string.onboarding_womens_health, R.string.onboarding_womens_health, R.string.onboarding_womens_health_description, R.string.pregnancy_womens_health_tracking, R.string.pregnancy_promotional_message, 0, null, null, null, null, null, 2131231747, null, 97792, null);
        d dVar9 = d.MORNING_REPORT;
        e31.a aVar8 = e31.a.HAS_ENTERED_MORNING_REPORT;
        List listC4 = w.c(aVar8);
        oc.b.o(aVar).getClass();
        Z0 = new c("MORNING_REPORT", 37, dVar9, bVar2, listC4, y.a(fe.f69560a), R.string.lbl_morning_report, R.string.lbl_morning_report, R.string.msg_morning_report, R.string.lbl_morning_report, R.string.msg_morning_report, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar10 = d.MUSIC;
        e31.a aVar9 = e31.a.HAS_INSTALLED_MUSIC_APPS;
        e31.a aVar10 = e31.a.STORED_WIFI_NETWORK;
        f102613a1 = new c("MUSIC", 38, dVar10, bVar2, x.k(aVar9, aVar10), m.a(o53.f0.x(oc.b.o(aVar))), R.string.device_screen_music, R.string.onboaring_device_setup_music_title, R.string.onboaring_device_setup_music_subtitle, R.string.onboarding_music_reminder_title, R.string.onboarding_music_reminder_body, 0, null, null, null, null, null, 0, null, 130560, null);
        f102614b1 = new c("PACE_PRO", 39, d.PACE_PRO, bVar, w.c(e31.a.ENTERED_PACE_PRO), ha.a(oc.b.o(aVar)), R.string.pacepro_title, R.string.onboarding_device_setup_pace_pro_title, R.string.onboarding_device_setup_pace_pro_subtitle, R.string.onboarding_pace_pro_reminder_dialog_title, R.string.onboarding_pace_pro_description, 0, null, null, null, null, null, 0, null, 130560, null);
        f102615c1 = new c("PARTNER_CHALLENGE_PROMOTE", 40, d.PARTNER_CHALLENGE_PROMOTE, bVar4, null, null, 0, 0, 0, 0, 0, 0, null, null, null, null, null, 0, null, 131068, null);
        f102616d1 = new c("POWER_GUIDE", 41, d.POWER_GUIDE, bVar, w.c(e31.a.ENTERED_POWER_GUIDE), v7.a(t.B(aVar)), R.string.power_guide_title, R.string.onboarding_device_setup_power_guide_title, R.string.onboarding_device_setup_power_guide_subtitle, R.string.onboarding_device_setup_power_guide_title, R.string.onboarding_power_guide_reminder_dialog_body, 0, null, null, null, null, null, 0, null, 130560, null);
        f102617e1 = new c("POWER_ZONES", 42, d.POWER_ZONES, bVar, w.c(e31.a.POWER_ZONES_CONFIGURED), v7.a(t.B(aVar)), R.string.device_settings_power_zones, R.string.lbl_review_power_zones, R.string.msg_view_and_customize_zones, R.string.lbl_review_power_zones, R.string.msg_update_power_zones, 0, null, null, null, null, null, 0, null, 130560, null);
        f102618f1 = new c("PRECISE_LOCATION_ACCESS", 43, d.PRECISE_LOCATION_ACCESS, bVar2, w.c(e31.a.HAS_PRECISE_LOCATION_ACCESS), k.a(e5.f175862a), R.string.label_allow_location_access, R.string.label_allow_location_access, R.string.msg_finish_set_up_location_access, R.string.lbl_location_access, R.string.msg_allow_location_access, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar11 = d.PULSE_OX;
        e31.a aVar11 = e31.a.ENTERED_PULSE_OX_SETTINGS;
        f102619g1 = new c("PULSE_OX", 44, dVar11, bVar2, w.c(aVar11), na.a(oc.b.o(aVar)), R.string.device_settings_pulse_ox, R.string.onboarding_device_setup_pulse_ox_title_2, R.string.onboarding_device_setup_ww_pulse_ox_subtitle_2, R.string.onboarding_device_setup_pulse_ox_title_2, R.string.onboarding_pulse_ox_dialog_body_2, 0, null, null, null, null, null, 0, null, 130560, null);
        f102620h1 = new c("PULSE_OX_JP", 45, d.PULSE_OX_JP, bVar2, w.c(aVar11), na.a(oc.b.o(aVar)), R.string.device_settings_blood_ox, R.string.onboarding_device_setup_blood_ox_title_2, R.string.onboarding_device_setup_pulse_ox_subtitle_2, R.string.onboarding_device_setup_blood_ox_title_2, R.string.onboarding_blood_ox_dialog_body_2, 0, null, null, null, null, null, 0, null, 130560, null);
        f102621i1 = new c("RECORD_ACTIVITIES", 46, d.RECORD_ACTIVITIES, bVar2, w.c(e31.a.HAS_ENTERED_RECORD_ACTIVITIES), f3.a(oi0.c.v(aVar)), R.string.lbl_record_activities_capitalised, R.string.lbl_record_activities_capitalised, R.string.msg_finish_set_up_record_activities, R.string.lbl_record_activities, R.string.msg_onboarding_record_activities, 0, null, null, null, null, null, 0, null, 130560, null);
        f102622j1 = new c("SET_GOALS", 47, d.SET_GOALS, bVar2, w.c(aVar8), y3.a(t.B(aVar)), R.string.user_settings_goals_section_title, R.string.user_settings_goals_section_title, R.string.msg_set_goals, R.string.set_goals_title, R.string.msg_set_goals, 0, null, null, null, null, null, 0, null, 130560, null);
        f102624k1 = new c("SELECT_ACTIVITY", 48, d.SELECT_ACTIVITY, bVar2, w.c(e31.a.HAS_ENTERED_SELECT_ACTIVITIES), u62.a.a(oi0.c.v(aVar)), R.string.onboarding_select_activity_section_title, R.string.onboarding_select_activity_setup_title, R.string.onboarding_select_activity_setup_description, R.string.activity_options_onboarding_title_one, R.string.activity_options_onboarding_description_one, 0, null, null, null, null, null, 0, null, 130560, null);
        f102625l1 = new c("SMART_WAKE_ALARM", 49, d.SMART_WAKE_ALARM, bVar2, w.c(e31.a.ENTERED_SMART_WAKE_ALARM), v62.g.a(t.B(aVar)), R.string.onboarding_smart_wake_alarm_title, R.string.onboarding_smart_wake_alarm_title, R.string.onboarding_smart_wake_alarm_subtitle, R.string.onboarding_smart_wake_alarm_title, R.string.onboarding_smart_wake_alarm_description, 0, null, null, null, null, null, 0, null, 130560, null);
        f102626m1 = new c("SOLAR_INTENSITY", 50, d.SOLAR_INTENSITY, bVar2, w.c(e31.a.ENTERED_SOLAR_INTENSITY), ob.a(oc.b.o(aVar)), R.string.onboarding_solar_intensity_title, R.string.onboarding_menu_solar_intensity_title, R.string.onboarding_device_setup_solar_intensity_subtitle, R.string.onboarding_solar_intensity_reminder_title, R.string.onboarding_edge_solar_charge_reminder_dialog_body, 0, null, null, null, null, null, 0, null, 130560, null);
        f102627n1 = new c("TOPOGRAPHICAL_MAPS", 51, d.TOPOGRAPHICAL_MAPS, bVar2, w.c(e31.a.HAS_TOPO_ACTIVE_MAPS_SUPPORT), i.a(f.u(t.B(aVar))), R.string.onboarding_topoactive_maps, R.string.onboarding_topoactive_maps_title, R.string.onboarding_topoactive_maps_subtitle, R.string.onboarding_topoactive_maps_title, R.string.onboarding_topoactive_maps_subtitle, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar12 = d.VO2MAX_TEST;
        List listC5 = w.c(e31.a.HAS_ENTERED_VO2MAX_TEST);
        u4.d dVarA2 = zd.a(oc.b.o(aVar));
        x0.f23314a.getClass();
        f102628o1 = new c("VO2MAX_TEST", 52, dVar12, bVar2, listC5, dVarA2, R.string.lbl_vo2max_estimate, R.string.lbl_vo2max_estimate, 0, R.string.lbl_vo2max_estimate_home, R.string.msg_onboarding_vo2max_test, 0, null, null, x0.f23659ub, null, null, 0, null, 126528, null);
        d dVar13 = d.VOICE_ASSISTANT;
        List listC6 = w.c(e31.a.OPENED_VOICE_ASSISTANT_SETUP_PAGE);
        t.B(aVar).getClass();
        h6 h6Var = h6.f175899a;
        f102629p1 = new c("VOICE_ASSISTANT", 53, dVar13, bVar2, listC6, a72.d.a(h6Var), R.string.lbl_phone_assistant, R.string.lbl_activate_voice_assistant, R.string.msg_activate_phone_assistant, R.string.lbl_activate_voice_assistant, R.string.msg_activate_phone_assistant, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar14 = d.VOICE_COMMAND;
        List listC7 = w.c(e31.a.OPENED_VOICE_COMMAND_SETUP_PAGE);
        t.B(aVar).getClass();
        f102630q1 = new c("VOICE_COMMAND", 54, dVar14, bVar2, listC7, a72.f.a(h6Var), R.string.lbl_voice_command, R.string.lbl_garmin_voice_command, R.string.msg_garmin_voice_command, R.string.lbl_garmin_voice_command, R.string.onboarding_garmin_voice_command_description, 0, null, null, null, null, null, 0, null, 130560, null);
        f102632r1 = new c("WATCH_FACE", 55, d.WATCH_FACE, bVar2, w.c(e31.a.ENTERED_CUSTOMIZE_WATCH_FACE), r2.a(t.B(aVar)), R.string.device_setting_watch_face, R.string.onboarding_device_setup_watch_face_title, R.string.onboarding_device_setup_watch_face_description, R.string.onboarding_watch_face_reminder_dialog_title, R.string.onboarding_watch_face_reminder_dialog_description, 0, null, null, null, null, null, 0, null, 130560, null);
        f102633s1 = new c("WIDGETS", 56, d.WIDGETS, bVar2, w.c(e31.a.ENTERED_WIDGETS_SETUP_SCREEN), v62.ha.a(t.B(aVar)), R.string.components_title, R.string.onboarding_device_setup_widget_list_title, R.string.onboarding_device_setup_widget_list_subtitle, R.string.onboarding_widget_list_dialog_title, R.string.onboarding_widget_list_dialog_body, 0, null, null, null, null, null, 0, null, 130560, null);
        d dVar15 = d.WIFI;
        f102635t1 = new c("WIFI", 57, dVar15, bVar2, w.c(aVar10), ia.a(t.B(aVar)), R.string.common_wifi, R.string.onboarding_wifi_menu_title, R.string.onboarding_wifi_menu_subtitle, R.string.onboarding_wifi_reminder_title, R.string.onboarding_wifi_reminder_body, 0, null, null, null, null, null, 0, null, 130560, null);
        f102636u1 = new c("WIFI_WITHOUT_MUSIC", 58, dVar15, bVar2, w.c(aVar10), ia.a(t.B(aVar)), R.string.common_wifi, R.string.onboarding_wifi_menu_title, R.string.onboarding_wifi_without_music_menu_subtitle, R.string.onboarding_wifi_reminder_title, R.string.onboarding_wifi_without_music_reminder_body, 0, null, null, null, null, null, 0, bVar3, 65024, null);
        f102638v1 = new c("WORKOUTS", 59, d.WORKOUTS, bVar, w.c(e31.a.ENTERED_WORKOUTS), w8.a(t.B(aVar)), R.string.concept_workouts, R.string.onboarding_workouts_menu_title, R.string.onboarding_workouts_menu_subtitle, R.string.onboarding_workouts_reminder_title, R.string.onboarding_workouts_description, 0, null, null, null, null, null, 0, null, 130560, null);
        c[] cVarArrA = a();
        f102640w1 = cVarArrA;
        f102642x1 = w13.b.g(cVarArrA);
        f102631r = new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String str, int i14, d dVar, d31.b bVar, List list, u4.d dVar2, int i15, int i16, int i17, int i18, int i19, int i24, String str2, String str3, String str4, String str5, String str6, int i25, b bVar2, int i26, j jVar) {
        u4.d dVarA;
        List list2 = (i26 & 4) != 0 ? p13.j0.f134944a : list;
        if ((i26 & 8) != 0) {
            s62.a.f157643a.getClass();
            dVarA = u62.a.a(t62.a.f162797a);
        } else {
            dVarA = dVar2;
        }
        this(str, i14, dVar, bVar, list2, dVarA, (i26 & 16) != 0 ? 0 : i15, (i26 & 32) != 0 ? 0 : i16, (i26 & 64) != 0 ? 0 : i17, (i26 & 128) != 0 ? 0 : i18, (i26 & 256) != 0 ? 0 : i19, (i26 & 512) != 0 ? R.string.smart_scale_label_get_started : i24, (i26 & 1024) != 0 ? null : str2, (i26 & 2048) != 0 ? null : str3, (i26 & 4096) != 0 ? null : str4, (i26 & 8192) != 0 ? null : str5, (i26 & 16384) != 0 ? null : str6, (32768 & i26) != 0 ? 0 : i25, (i26 & 65536) != 0 ? null : bVar2);
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f102634t, f102637v, f102639w, f102641x, f102643y, f102644z, A, B, C, D, E, F, I, P, T, X, Y, Z, f102623k0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, f102613a1, f102614b1, f102615c1, f102616d1, f102617e1, f102618f1, f102619g1, f102620h1, f102621i1, f102622j1, f102624k1, f102625l1, f102626m1, f102627n1, f102628o1, f102629p1, f102630q1, f102632r1, f102633s1, f102635t1, f102636u1, f102638v1};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f102640w1.clone();
    }

    public final String b(l22.a aVar, Object... objArr) {
        int i14 = this.f102653i;
        String str = this.f102659o;
        if (str == null) {
            if (i14 != 0) {
                return objArr.length == 0 ? aVar.getString(i14) : aVar.a(i14, Arrays.copyOf(objArr, objArr.length));
            }
            return "";
        }
        String strB = objArr.length == 0 ? aVar.b(c22.g2.b(str)) : aVar.d(c22.g2.b(str), Arrays.copyOf(objArr, objArr.length));
        if (d53.w.J(strB)) {
            strB = null;
        }
        if (strB != null) {
            return strB;
        }
        try {
            return objArr.length == 0 ? aVar.getString(i14) : aVar.a(i14, Arrays.copyOf(objArr, objArr.length));
        } catch (Exception unused) {
            return "";
        }
    }

    public final String c(l22.a aVar) {
        int i14 = this.f102652h;
        String str = this.f102658n;
        if (str == null) {
            return i14 != 0 ? aVar.getString(i14) : "";
        }
        String strB = aVar.b(c22.g2.b(str));
        if (d53.w.J(strB)) {
            strB = null;
        }
        if (strB != null) {
            return strB;
        }
        try {
            return aVar.getString(i14);
        } catch (Exception unused) {
            return "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk31/c$a;", "", "<init>", "()V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(d dVar, b bVar) {
            Object next;
            dVar.getClass();
            w13.c cVar = c.f102642x1;
            ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar2 = new p13.c.b();
            while (bVar2.hasNext()) {
                Object next2 = bVar2.next();
                if (((c) next2).f102645a == dVar) {
                    arrayListK.add(next2);
                }
            }
            if (arrayListK.size() <= 1) {
                return (c) h0.d0(arrayListK);
            }
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((c) next).f102661q == bVar) {
                    return (c) next;
                }
            }
            next = null;
            return (c) next;
        }

        private a() {
        }
    }

    private c(String str, int i14, d dVar, d31.b bVar, List list, u4.d dVar2, int i15, int i16, int i17, int i18, int i19, int i24, String str2, String str3, String str4, String str5, String str6, int i25, b bVar2) {
        super(str, i14);
        this.f102645a = dVar;
        this.f102646b = bVar;
        this.f102647c = list;
        this.f102648d = dVar2;
        this.f102649e = i15;
        this.f102650f = i16;
        this.f102651g = i17;
        this.f102652h = i18;
        this.f102653i = i19;
        this.f102654j = i24;
        this.f102655k = str2;
        this.f102656l = str3;
        this.f102657m = str4;
        this.f102658n = str5;
        this.f102659o = str6;
        this.f102660p = i25;
        this.f102661q = bVar2;
    }
}

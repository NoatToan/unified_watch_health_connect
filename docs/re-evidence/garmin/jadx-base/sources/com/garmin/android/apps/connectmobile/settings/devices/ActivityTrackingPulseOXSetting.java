package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.v;
import bd0.u;
import c22.b0;
import ch1.j3;
import ch1.k3;
import ch1.l4;
import ch1.n4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.h;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import mt0.b2;
import mt0.y;
import n82.i;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting;", "Lcom/garmin/android/apps/connectmobile/c;", "Ljava/util/Observer;", "<init>", "()V", "a", "b", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityTrackingPulseOXSetting extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f41786l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f41787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41789c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k3 f41791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f41795i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41797k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f41790d = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f41796j = m.b(new i(this, 5));

    public interface b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$b$a;", "Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$b;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f41798a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41799b = R.string.device_settings_blood_ox;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f41800c = R.string.lbl_all_day_blood_ox;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f41801d = R.string.msg_all_day_blood_ox_info;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f41802e = R.string.device_settings_blood_ox_tracking_alert_message;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f41803f = R.string.lbl_blood_ox_sleep_tracking;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f41804g = R.string.msg_blood_ox_sleep_tracking;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f41805h = R.string.device_settings_blood_ox_sleep_tracking_alert_message;

            private a() {
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int a() {
                return f41802e;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int b() {
                return f41803f;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int c() {
                return f41804g;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int d() {
                return f41801d;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int e() {
                return f41805h;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int f() {
                return f41800c;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int getTitle() {
                return f41799b;
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$b$b;", "Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$b;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0794b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0794b f41806a = new C0794b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41807b = R.string.device_settings_blood_ox;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f41808c = R.string.device_settings_pulse_ox_acclimation_label;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f41809d = R.string.device_settings_pulse_ox_acclimation_setting_detail;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f41810e = R.string.device_settings_blood_ox_tracking_alert_message;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f41811f = R.string.app_tour_sleep_tracking_title;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f41812g = R.string.device_settings_pulse_ox_tracking_help_text;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f41813h = R.string.device_settings_blood_ox_sleep_tracking_alert_message;

            private C0794b() {
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int a() {
                return f41810e;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int b() {
                return f41811f;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int c() {
                return f41812g;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int d() {
                return f41809d;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int e() {
                return f41813h;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int f() {
                return f41808c;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int getTitle() {
                return f41807b;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$b$c;", "Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$b;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f41814a = new c();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41815b = R.string.device_settings_pulse_ox;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f41816c = R.string.lbl_all_day_pulse_ox;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f41817d = R.string.msg_all_day_pulse_ox_info;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f41818e = R.string.device_settings_pulse_ox_tracking_alert_message;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f41819f = R.string.lbl_pulse_ox_sleep_tracking;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f41820g = R.string.msg_pulse_ox_sleep_tracking;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f41821h = R.string.device_settings_pulse_ox_sleep_tracking_alert_message;

            private c() {
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int a() {
                return f41818e;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int b() {
                return f41819f;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int c() {
                return f41820g;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int d() {
                return f41817d;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int e() {
                return f41821h;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int f() {
                return f41816c;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int getTitle() {
                return f41815b;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$b$d;", "Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$b;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f41822a = new d();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41823b = R.string.device_settings_pulse_ox;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f41824c = R.string.device_settings_pulse_ox_acclimation_label;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f41825d = R.string.device_settings_pulse_ox_acclimation_setting_detail_global;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f41826e = R.string.device_settings_pulse_ox_tracking_alert_message;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f41827f = R.string.app_tour_sleep_tracking_title;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f41828g = R.string.device_settings_pulse_ox_tracking_help_text_global;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f41829h = R.string.device_settings_pulse_ox_sleep_tracking_alert_message;

            private d() {
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int a() {
                return f41826e;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int b() {
                return f41827f;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int c() {
                return f41828g;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int d() {
                return f41825d;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int e() {
                return f41829h;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int f() {
                return f41824c;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting.b
            public final int getTitle() {
                return f41823b;
            }
        }

        int a();

        int b();

        int c();

        int d();

        int e();

        int f();

        int getTitle();
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41830a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.f203773m4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.f203780n4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.f203787o4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u0.f203794p4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u0.f203800q4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u0.f203806r4.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u0.f203811s4.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u0.f203817t4.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[u0.T2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[u0.U2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[u0.V2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[u0.W2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[u0.X2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[u0.Z2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[u0.Y2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[u0.X0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[u0.Y0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[u0.Z0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[u0.R0.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[u0.T0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[u0.Q0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[u0.S0.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[u0.G5.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[u0.H5.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[u0.J5.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[u0.K5.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[u0.f203694a3.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[u0.f203700b3.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[u0.f203706c3.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[u0.f203750j3.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[u0.f203712d3.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[u0.f203772m3.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[u0.f203779n3.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[u0.f203758k3.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[u0.f203765l3.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[u0.f203718e3.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[u0.f203723f3.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[u0.f203729g3.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[u0.f203736h3.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[u0.f203743i3.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[u0.f203823u5.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[u0.f203829v5.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[u0.f203847y5.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[u0.f203853z5.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[u0.U3.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[u0.f203805r3.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[u0.f203810s3.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[u0.f203816t3.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[u0.f203821u3.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[u0.f203833w3.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[u0.f203839x3.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[u0.f203845y3.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[u0.f203827v3.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[u0.f203851z3.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[u0.A3.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[u0.B3.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[u0.C3.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[u0.D3.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[u0.E3.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[u0.F3.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[u0.G3.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[u0.H3.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[u0.I3.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[u0.J3.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[u0.K3.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[u0.L3.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[u0.M3.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[u0.N3.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[u0.P3.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[u0.Q3.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[u0.O3.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[u0.R3.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[u0.S3.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[u0.T3.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[u0.B2.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[u0.A2.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[u0.C2.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[u0.D2.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[u0.f203717e2.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[u0.f203722f2.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[u0.f203792p2.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[u0.f203798q2.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[u0.f203804r2.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[u0.f203809s2.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[u0.f203815t2.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[u0.f203820u2.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[u0.f203826v2.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[u0.f203832w2.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[u0.f203728g2.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[u0.f203735h2.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[u0.f203742i2.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[u0.f203749j2.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[u0.f203757k2.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[u0.f203764l2.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            f41830a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$d", "Lbd0/u$b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements u.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f41831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActivityTrackingPulseOXSetting f41832b;

        public d(long j8, ActivityTrackingPulseOXSetting activityTrackingPulseOXSetting) {
            this.f41831a = j8;
            this.f41832b = activityTrackingPulseOXSetting;
        }

        @Override // bd0.u.b
        public final void b(yl2.e eVar) {
            ActivityTrackingPulseOXSetting activityTrackingPulseOXSetting = this.f41832b;
            activityTrackingPulseOXSetting.runOnUiThread(new ng1.b(activityTrackingPulseOXSetting, 0));
        }

        @Override // bd0.u.b
        public final void c() {
            ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).k(this.f41831a);
            ActivityTrackingPulseOXSetting activityTrackingPulseOXSetting = this.f41832b;
            activityTrackingPulseOXSetting.f41797k = true;
            activityTrackingPulseOXSetting.runOnUiThread(new ng1.b(activityTrackingPulseOXSetting, 1));
        }
    }

    public final void ca() {
        q1.b bVar = q1.f41066b;
        String str = this.f41788b;
        if (str == null) {
            str = "";
        }
        String string = getString(R.string.device_settings_set_as_preferred_activity_tracker_title_question, str);
        string.getClass();
        b bVar2 = this.f41795i;
        if (bVar2 == null) {
            s.m("translations");
            throw null;
        }
        int iE = bVar2.e();
        String str2 = this.f41788b;
        String string2 = getString(iE, str2 != null ? str2 : "");
        string2.getClass();
        b2 b2Var = new b2(this, 9);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, string2, R.string.lbl_yes, R.string.lbl_no, b2Var);
        q1VarC.setCancelable(false);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intentPutExtra = getIntent().putExtra("GCM_deviceSettings", this.f41787a);
        intentPutExtra.getClass();
        intentPutExtra.putExtra("GCM_updatedPAT", this.f41797k);
        setResult(-1, intentPutExtra);
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z14;
        b bVar;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_settings_activity_tracking_pulseox);
        Intent intent = getIntent();
        boolean z15 = false;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            this.f41787a = (DeviceSettingsDTO) (extras != null ? extras.get("GCM_deviceSettings") : null);
            Bundle extras2 = intent.getExtras();
            this.f41788b = (String) (extras2 != null ? extras2.get("GCM_deviceName") : null);
            Bundle extras3 = intent.getExtras();
            this.f41789c = (String) (extras3 != null ? extras3.get("GCM_deviceProductNbr") : null);
            intent.getBooleanExtra("GCM_saveAsExit", false);
        }
        u0 u0VarB = u0.b(this.f41789c);
        switch (u0VarB == null ? -1 : c.f41830a[u0VarB.ordinal()]) {
            default:
                switch (u0VarB == null ? -1 : c.f41830a[u0VarB.ordinal()]) {
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                        break;
                    default:
                        z14 = false;
                        break;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                z14 = true;
                break;
        }
        this.f41793g = z14;
        boolean zEqualsIgnoreCase = b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry());
        if (zEqualsIgnoreCase && this.f41793g) {
            bVar = b.a.f41798a;
        } else if (!zEqualsIgnoreCase || this.f41793g) {
            bVar = (zEqualsIgnoreCase || !this.f41793g) ? b.d.f41822a : b.c.f41814a;
        } else {
            bVar = b.C0794b.f41806a;
        }
        this.f41795i = bVar;
        if (bVar == null) {
            s.m("translations");
            throw null;
        }
        initActionBar(true, getString(bVar.getTitle()));
        if (this.f41787a == null) {
            finish();
            return;
        }
        this.f41791e = new k3(this);
        ArrayList<fb2.e> arrayList = this.f41790d;
        arrayList.clear();
        arrayList.add(new j3(this));
        k3 k3Var = this.f41791e;
        if (k3Var != null) {
            arrayList.add(k3Var);
        }
        arrayList.add(new n4(this));
        arrayList.add(new l4(this));
        for (fb2.e eVar : arrayList) {
            DeviceSettingsDTO deviceSettingsDTO = this.f41787a;
            deviceSettingsDTO.getClass();
            boolean zG = eVar.g(this, deviceSettingsDTO);
            eVar.addObserver(this);
            eVar.m(zG);
        }
        DeviceSettingsDTO deviceSettingsDTO2 = this.f41787a;
        if (deviceSettingsDTO2 != null) {
            long j8 = deviceSettingsDTO2.f33860a;
            ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).N(j8);
            l.f68084a.getClass();
            if (j8 != l.a.a().s4() && !this.f41793g) {
                ca();
            }
        }
        switch (u0VarB != null ? c.f41830a[u0VarB.ordinal()] : -1) {
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
                z15 = true;
                break;
        }
        this.f41794h = z15;
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_pulse_ox_acclimation_tracking);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_pulse_ox_sleep_tracking);
        b bVar2 = this.f41795i;
        if (bVar2 == null) {
            s.m("translations");
            throw null;
        }
        gCMComplexOneLineButton.setButtonLeftLabel(bVar2.f());
        b bVar3 = this.f41795i;
        if (bVar3 == null) {
            s.m("translations");
            throw null;
        }
        gCMComplexOneLineButton.setButtonBottomHint(bVar3.d());
        b bVar4 = this.f41795i;
        if (bVar4 == null) {
            s.m("translations");
            throw null;
        }
        gCMComplexOneLineButton2.setButtonLeftLabel(bVar4.b());
        b bVar5 = this.f41795i;
        if (bVar5 == null) {
            s.m("translations");
            throw null;
        }
        gCMComplexOneLineButton2.setButtonBottomHint(bVar5.c());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f41790d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        ((u) this.f41796j.getValue()).getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).D(this, b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry()));
        return true;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        boolean z14 = observable instanceof j3;
        u0 u0VarB = u0.b(this.f41789c);
        int i14 = u0VarB == null ? -1 : c.f41830a[u0VarB.ordinal()];
        ArrayList<fb2.e> arrayList = this.f41790d;
        switch (i14) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                if (!z14 || !(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                    if (!(observable instanceof k3) || !(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                        this.f41792f = false;
                        return;
                    }
                    if (!this.f41792f) {
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
                        b bVar = this.f41795i;
                        if (bVar == null) {
                            s.m("translations");
                            throw null;
                        }
                        androidx.appcompat.app.e.a title = aVar.setTitle(bVar.b());
                        b bVar2 = this.f41795i;
                        if (bVar2 == null) {
                            s.m("translations");
                            throw null;
                        }
                        title.setMessage(bVar2.c()).setPositiveButton(R.string.lbl_ok, new y(7)).show();
                    }
                    this.f41792f = false;
                    return;
                }
                this.f41792f = true;
                DeviceSettingsDTO deviceSettingsDTO = this.f41787a;
                if (deviceSettingsDTO != null) {
                    h hVar = deviceSettingsDTO.f33885m;
                    if (hVar != null) {
                        hVar.G(true);
                    }
                    for (fb2.e eVar : arrayList) {
                        if (eVar instanceof k3) {
                            ((k3) eVar).k(deviceSettingsDTO);
                        }
                    }
                }
                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(this);
                b bVar3 = this.f41795i;
                if (bVar3 == null) {
                    s.m("translations");
                    throw null;
                }
                androidx.appcompat.app.e.a title2 = aVar2.setTitle(bVar3.f());
                b bVar4 = this.f41795i;
                if (bVar4 != null) {
                    title2.setMessage(bVar4.d()).setPositiveButton(R.string.lbl_ok, new y(7)).show();
                    return;
                } else {
                    s.m("translations");
                    throw null;
                }
            default:
                Boolean bool = Boolean.TRUE;
                if (s.g(obj, bool)) {
                    b bVar5 = this.f41795i;
                    if (bVar5 == null) {
                        s.m("translations");
                        throw null;
                    }
                    u20.e eVarU6 = u20.e.u6(R.string.device_settings_pulse_ox_tracking_alert_title, bVar5.a());
                    eVarU6.setCancelable(false);
                    eVarU6.g(getSupportFragmentManager());
                }
                DeviceSettingsDTO deviceSettingsDTO2 = this.f41787a;
                if (deviceSettingsDTO2 != null && z14 && this.f41793g && this.f41794h) {
                    if (!s.g(obj, bool)) {
                        k3 k3Var = this.f41791e;
                        if (k3Var != null) {
                            k3Var.l(true);
                            return;
                        }
                        return;
                    }
                    h hVar2 = deviceSettingsDTO2.f33885m;
                    if (hVar2 != null ? s.g(hVar2.m(), Boolean.FALSE) : false) {
                        h hVar3 = deviceSettingsDTO2.f33885m;
                        if (hVar3 != null) {
                            hVar3.H(bool);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((fb2.e) it.next()).deleteObserver(this);
                        }
                        for (fb2.e eVar2 : arrayList) {
                            eVar2.m(eVar2.g(this, deviceSettingsDTO2));
                            eVar2.addObserver(this);
                        }
                    }
                    k3 k3Var2 = this.f41791e;
                    if (k3Var2 != null) {
                        k3Var2.l(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/ActivityTrackingPulseOXSetting$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(ng1.j jVar, DeviceSettingsDTO deviceSettingsDTO, String str, String str2) {
            Intent intent = new Intent(jVar, (Class<?>) ActivityTrackingPulseOXSetting.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
            intent.putExtra("GCM_saveAsExit", false);
            intent.putExtra("GCM_deviceName", str);
            intent.putExtra("GCM_deviceProductNbr", str2);
            jVar.startActivityForResult(intent, 10);
        }

        private a() {
        }
    }
}

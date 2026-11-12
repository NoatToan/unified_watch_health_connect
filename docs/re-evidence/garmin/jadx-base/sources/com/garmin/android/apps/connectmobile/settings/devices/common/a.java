package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import z6.k;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42812b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.devices.common.a$a, reason: collision with other inner class name */
    public enum EnumC0797a {
        BIKE_ALARM_ON,
        BIKE_ALARM_OFF,
        CONNECTION_LOST,
        CONNECTION_ESTABLISHED,
        BIKE_ALARM_ACTIVATED
    }

    public a(Context context, long j8) {
        this.f42811a = context;
        this.f42812b = j8;
    }

    public static int a(long j8) {
        int i14 = 0;
        while (j8 != 0) {
            int i15 = (int) (j8 % 10);
            j8 /= 10;
            i14 += i15;
        }
        return i14;
    }

    public static int c(long j8, EnumC0797a enumC0797a) {
        int iA;
        int iOrdinal;
        EnumC0797a enumC0797a2 = EnumC0797a.BIKE_ALARM_ON;
        if (enumC0797a == enumC0797a2 || enumC0797a == EnumC0797a.BIKE_ALARM_OFF) {
            iA = a(j8) + 24;
            iOrdinal = enumC0797a2.ordinal();
        } else {
            EnumC0797a enumC0797a3 = EnumC0797a.CONNECTION_ESTABLISHED;
            if (enumC0797a == enumC0797a3 || enumC0797a == EnumC0797a.CONNECTION_LOST) {
                iA = a(j8) + 24;
                iOrdinal = enumC0797a3.ordinal();
            } else {
                iA = a(j8) + 24;
                iOrdinal = enumC0797a.ordinal();
            }
        }
        return iOrdinal + iA;
    }

    public final void b(EnumC0797a enumC0797a) {
        String string;
        Class cls;
        int iOrdinal = enumC0797a.ordinal();
        String string2 = null;
        Context context = this.f42811a;
        if (iOrdinal == 0) {
            string = context.getString(R.string.bike_alarm_notif_setting_on_title);
        } else if (iOrdinal == 1) {
            string = context.getString(R.string.bike_alarm_notif_setting_off_title);
        } else if (iOrdinal == 2) {
            string = context.getString(R.string.edge_connection_lost_lbl);
        } else if (iOrdinal != 3) {
            string = iOrdinal != 4 ? null : context.getString(R.string.bike_alarm_notif_activated_title);
        } else {
            string = context.getString(R.string.edge_connection_established_lbl);
        }
        int iOrdinal2 = enumC0797a.ordinal();
        if (iOrdinal2 == 0) {
            string2 = context.getString(R.string.bike_alarm_notif_setting_on_description);
        } else if (iOrdinal2 == 1) {
            string2 = context.getString(R.string.bike_alarm_notif_setting_off_description);
        } else if (iOrdinal2 == 2) {
            string2 = context.getString(R.string.edge_connection_lost_description);
        } else if (iOrdinal2 == 3) {
            string2 = context.getString(R.string.edge_connection_established_description);
        } else if (iOrdinal2 == 4) {
            string2 = context.getString(R.string.bike_alarm_notif_activated_description);
        }
        sz0.e eVar = sz0.e.f161385z;
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(string);
        qVar.f202684f = q.e(string2);
        qVar.f202691m = 0;
        qVar.i(16, true);
        o oVar = new o();
        oVar.f202664e = q.e(string2);
        qVar.l(oVar);
        if (enumC0797a == EnumC0797a.BIKE_ALARM_ON || enumC0797a == EnumC0797a.BIKE_ALARM_OFF || enumC0797a == EnumC0797a.BIKE_ALARM_ACTIVATED) {
            cls = BikeAlarmSettingActivity.class;
        } else if (enumC0797a == EnumC0797a.CONNECTION_ESTABLISHED || enumC0797a == EnumC0797a.CONNECTION_LOST) {
            com.garmin.android.apps.connectmobile.navigation.b.b();
            cls = DashboardActivity.class;
        } else {
            cls = DeviceDetailsActivity.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        long j8 = this.f42812b;
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("BIKE_ALARM_NOTIFICATION_ID", c(j8, enumC0797a));
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        qVar.f202686h = activity;
        if (enumC0797a == EnumC0797a.BIKE_ALARM_ACTIVATED) {
            Intent intent2 = new Intent(context, (Class<?>) BikeAlarmNotificationReceiver.class);
            Bundle bundle = new Bundle();
            bundle.putLong("GCM_deviceUnitID", j8);
            bundle.putInt("BIKE_ALARM_NOTIFICATION_ID", c(j8, enumC0797a));
            intent2.putExtra("BIKE_ALARM_BUNDLE_KEY", bundle);
            intent2.setAction("ACTION_TURN_OFF_NOTIFICATION");
            qVar.b(new k(0, context.getString(R.string.bike_alarm_turn_off), PendingIntent.getBroadcast(context, 0, intent2, 201326592)));
            Intent intent3 = new Intent(context, (Class<?>) BikeAlarmNotificationReceiver.class);
            Bundle bundle2 = new Bundle();
            bundle2.putLong("GCM_deviceUnitID", j8);
            bundle2.putInt("BIKE_ALARM_NOTIFICATION_ID", c(j8, enumC0797a));
            intent3.setAction("ACTION_CANCEL_NOTIFICATION");
            intent3.putExtra("BIKE_ALARM_BUNDLE_KEY", bundle2);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent3, 201326592);
            qVar.b(new k(0, context.getString(R.string.lbl_settings), activity));
            qVar.b(new k(0, context.getString(R.string.clear_missed_call), broadcast));
        }
        qVar.N.deleteIntent = PendingIntent.getBroadcast(context, c(j8, enumC0797a), new Intent("ACTION_CANCEL_NOTIFICATION"), 1140850688);
        sz0.f.a(context, qVar.c(), c(j8, enumC0797a), eVar);
    }
}

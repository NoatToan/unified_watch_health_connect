package com.garmin.android.apps.connectmobile.devices;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.setup.GDIAuthPairingAndroidNotificationPressedActivity;
import g22.c;
import rd2.f;
import rd2.j;
import sz0.e;
import z6.o;
import z6.q;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public class b extends c<Void, Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f33834c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33835d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33836e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33837f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33838g = 30;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Intent f33839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f33840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GDIAuthPairingAndroidNotificationPressedActivity.b f33841j;

    public b(GarminDeviceGDIAuthenticationBroadcastReceiver garminDeviceGDIAuthenticationBroadcastReceiver, Intent intent, Context context, GDIAuthPairingAndroidNotificationPressedActivity.b bVar) {
        this.f33839h = intent;
        this.f33840i = context;
        this.f33841j = bVar;
    }

    @Override // g22.c
    public final Void b(Void[] voidArr) throws Throwable {
        Intent intent = this.f33839h;
        String stringExtra = intent.getStringExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
        this.f33837f = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        j jVar = f.a().f152045a;
        String str = this.f33837f;
        jVar.getClass();
        sd2.j jVarF = j.f(str);
        if (jVarF == null || TextUtils.isEmpty(jVarF.Z0)) {
            return null;
        }
        u0 u0Var = (u0) u0.f203782n6.get(jVarF.Z0);
        this.f33834c = u0Var;
        if (u0Var == null) {
            return null;
        }
        if (TextUtils.isEmpty(jVarF.f158683a1)) {
            this.f33835d = this.f33837f;
        } else {
            this.f33835d = jVarF.f158683a1;
        }
        this.f33836e = jVarF.Z0;
        this.f33838g = intent.getIntExtra("com.garmin.android.gdi.EXTRA_PAIRING_PASSKEY_TIMEOUT", 30);
        return null;
    }

    @Override // g22.c
    public final void d(Void r14) {
        String string;
        if (this.f33834c != null) {
            Context context = this.f33840i;
            Intent intent = new Intent(context, (Class<?>) GDIAuthPairingAndroidNotificationPressedActivity.class);
            intent.putExtra("GDIAuthPairingAndroidNotificationPressedActivity_extra_mac_address", this.f33837f);
            intent.putExtra("GDIAuthPairingAndroidNotificationPressedActivity_extra_product_number", this.f33836e);
            intent.putExtra("GDIAuthPairingAndroidNotificationPressedActivity_extra_product_displayname", this.f33835d);
            intent.putExtra("GDIAuthPairingAndroidNotificationPressedActivity_extra_pairing_passkey_timeout", this.f33838g);
            GDIAuthPairingAndroidNotificationPressedActivity.b bVar = this.f33841j;
            intent.putExtra("GDIAuthPairingAndroidNotificationPressedActivity_extra_setup_action_to_execute", bVar.name());
            intent.setFlags(1082130432);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
            int i14 = GarminDeviceGDIAuthenticationBroadcastReceiver.a.f33824a[bVar.ordinal()];
            if (i14 != 1) {
                string = i14 != 2 ? "" : context.getString(R.string.pairing_gdi_authentication_failure, this.f33835d);
            } else {
                string = context.getString(R.string.pairing_gdi_authentication_enter_number, this.f33835d);
            }
            e eVar = e.f161377p;
            q qVar = new q(context, eVar.f161386a);
            Notification notification = qVar.N;
            notification.icon = 2131232010;
            qVar.f202683e = q.e(context.getText(R.string.lbl_device_setup));
            qVar.f202684f = q.e(string);
            qVar.f202689k = q.e("");
            notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
            qVar.f202691m = 0;
            o oVar = new o();
            oVar.f202664e = q.e(string);
            qVar.l(oVar);
            qVar.f202686h = activity;
            qVar.i(16, true);
            Notification notificationC = qVar.c();
            sz0.f.f161394a.getClass();
            sz0.f.a.f(context, notificationC, 4, eVar);
        }
    }
}

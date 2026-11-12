package com.garmin.android.apps.connectmobile.permissions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.CodePackage;
import f12.l;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import w72.f;
import z6.a0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/permissions/PermissionRequestNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PermissionRequestNotificationReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40290b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f40291a = m.b(new f(9));

    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Integer num;
        String action;
        t tVar = this.f40291a;
        if (intent != null && (action = intent.getAction()) != null) {
            ((Logger) tVar.getValue()).debug("onReceive: setting shared preference to true for permission: ".concat(action));
            l.f68084a.getClass();
            l.a.a().Q1(action, true);
            int iHashCode = action.hashCode();
            if (iHashCode != -1611296843) {
                if (iHashCode != 76105038) {
                    if (iHashCode == 604302142 && action.equals("CALENDAR")) {
                        num = 14;
                    }
                } else if (action.equals("PHONE")) {
                    num = 30;
                }
            } else if (action.equals(CodePackage.LOCATION)) {
                num = 9;
            }
            if (context != null) {
                ((Logger) tVar.getValue()).warn("onReceive: context is null");
            } else if (num != null) {
                a0.a(context).f202582b.cancel(null, num.intValue());
            } else {
                ((Logger) tVar.getValue()).warn("onReceive: Could not identify a notificationId");
            }
        }
        ((Logger) tVar.getValue()).error("onReceive: No intent or action received, ignoring");
        num = null;
        if (context != null) {
            ((Logger) tVar.getValue()).warn("onReceive: context is null");
        } else if (num != null) {
            a0.a(context).f202582b.cancel(null, num.intValue());
        } else {
            ((Logger) tVar.getValue()).warn("onReceive: Could not identify a notificationId");
        }
    }
}

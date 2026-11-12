package com.garmin.android.apps.connectmobile;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/p0;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f39754a;

    static {
        new a(null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iUpdate;
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        String strM = am.j.m("Received action [", action, "].");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BluetoothStateChangedBroadcastReceiver", strM);
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            Bundle extras = intent.getExtras();
            if (10 == (extras != null ? extras.getInt("android.bluetooth.adapter.extra.STATE") : 0)) {
                rd2.f.a().f152047c.getClass();
                Logger logger = rd2.i.f152075b;
                try {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("is_connected", (Integer) 0);
                    iUpdate = rd2.a.b().update("devices", contentValues, null, null);
                } catch (Exception e4) {
                    logger.error("updateAllAsNotConnected", (Throwable) e4);
                    iUpdate = -1;
                }
                logger.debug("updateAllAsNotConnected: nbrRows [" + iUpdate + "]");
                rd2.i.e(iUpdate);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/p0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

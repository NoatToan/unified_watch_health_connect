package com.garmin.android.library.livetrack.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ds.e0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/device/AutoStartReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AutoStartReceiver extends BroadcastReceiver {
    static {
        new a(null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle bundle;
        String action = intent != null ? intent.getAction() : null;
        if (action == null || action.hashCode() != 697375182 || !action.equals("com.garmin.livetrack.ACTION_ON_START_LIVE_TRACK_REQUEST_RECEIVED")) {
            e0.v("onReceive: fix me developer, not handling action ", intent != null ? intent.getAction() : null, i2.a("AutoStartReceiver"));
            return;
        }
        i2.a("AutoStartReceiver").debug("Received ACTION_ON_START_LIVE_TRACK_REQUEST_RECEIVED from device.");
        Bundle extras = intent.getExtras();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (extras != null) {
            bundle = new Bundle();
            if (extras.containsKey("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID")) {
                bundle.putLong("extra_device_unit_id", extras.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L));
            }
        } else {
            bundle = null;
        }
        if (TextUtils.isEmpty("com.garmin.android.library.livetrack.ACTION_ON_START_LIVE_TRACK_REQUEST_RECEIVED")) {
            return;
        }
        Intent intent2 = new Intent("com.garmin.android.library.livetrack.ACTION_ON_START_LIVE_TRACK_REQUEST_RECEIVED");
        intent2.addFlags(268435456);
        if (bundle != null) {
            intent2.putExtras(bundle);
        }
        intent2.setPackage(applicationContext != null ? applicationContext.getPackageName() : null);
        i2.a("AutoStartReceiver").debug("Global broadcasting " + intent2.getAction() + StringUtils.SPACE + intent2.getExtras());
        if (applicationContext != null) {
            applicationContext.sendBroadcast(intent2, applicationContext.getPackageName() + ".permission.RECEIVE_BROADCASTS");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/livetrack/device/AutoStartReceiver$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

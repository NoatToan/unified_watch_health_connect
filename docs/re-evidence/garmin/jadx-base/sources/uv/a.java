package uv;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.y0;
import fw.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luv/a;", "", "Landroid/app/Activity;", "activity", "", "deviceId", "<init>", "(Landroid/app/Activity;J)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f172861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f172862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f172863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IntentFilter f172864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3228a f172865e;

    /* JADX INFO: renamed from: uv.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uv/a$a", "Landroid/content/BroadcastReceiver;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3228a extends BroadcastReceiver {
        public C3228a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            long longExtra = intent != null ? intent.getLongExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L) : -1L;
            a aVar = a.this;
            if (longExtra == aVar.f172862b) {
                String action = intent != null ? intent.getAction() : null;
                int i14 = 6;
                if (action != null) {
                    switch (action.hashCode()) {
                        case -1039788941:
                            if (action.equals("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_LOW")) {
                                i14 = 4;
                            }
                            break;
                        case -1039787329:
                            if (action.equals("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_NEW")) {
                                i14 = 1;
                            }
                            break;
                        case -824593514:
                            action.equals("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_INVALID");
                            break;
                        case 1535764928:
                            if (action.equals("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_CRITICAL")) {
                                i14 = 5;
                            }
                            break;
                        case 1629026493:
                            if (action.equals("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_OK")) {
                                i14 = 3;
                            }
                            break;
                        case 2126132062:
                            if (action.equals("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_GOOD")) {
                                i14 = 2;
                            }
                            break;
                    }
                }
                y0 y0Var = aVar.f172863c;
                y0Var.getClass();
                y0Var.m(m.a.g(m.f73767e, Integer.valueOf(i14), 1));
                z9.a.a(aVar.f172861a).d(this);
            }
        }
    }

    public a(Activity activity, long j8) {
        activity.getClass();
        this.f172861a = activity;
        this.f172862b = j8;
        this.f172863c = new y0();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_NEW");
        intentFilter.addAction("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_GOOD");
        intentFilter.addAction("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_OK");
        intentFilter.addAction("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_LOW");
        intentFilter.addAction("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_CRITICAL");
        intentFilter.addAction("com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_INVALID");
        this.f172864d = intentFilter;
        this.f172865e = new C3228a();
    }
}

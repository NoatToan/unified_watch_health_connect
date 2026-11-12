package com.garmin.android.apps.connectmobile.devices.settings.realtime;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity;
import com.garmin.android.apps.connectmobile.connectiq.l;
import hk0.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sd2.f;
import vu1.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/a;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0578a f34355a = new C0578a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f34356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Uri f34357c;

    static {
        int i14 = gt2.c.f79010a;
        f34356b = gt2.b.f79005a.h("RTS-RedirectRealTimeSettingsExternalIntent");
        f34357c = Uri.parse("https://www.garmin.com");
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.settings.realtime.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "", "GARMIN_FALLBACK_URL", "Ljava/lang/String;", "Landroid/net/Uri;", "GARMIN_FALLBACK_URI", "Landroid/net/Uri;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0578a {
        public /* synthetic */ C0578a(j jVar) {
            this();
        }

        public static Intent a(Context context, f fVar, l lVar) {
            boolean zK = p.k(fVar.getUnitID());
            if (!zK) {
                new e.a(context).setTitle(R.string.connect_iq_device_not_connected_title).setMessage(R.string.connect_iq_device_not_connected_msg).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).create().show();
            }
            if (!zK) {
                return null;
            }
            Intent intent = new Intent(context, (Class<?>) ConnectIQDownloadListActivity.class);
            intent.putExtra("CONNECT_IQ_CATEGORY", lVar);
            intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", fVar.getUnitID());
            return intent;
        }

        public static void b(Context context, String str) {
            new e.a(context).setTitle(context.getString(R.string.devices_not_connected)).setMessage(context.getString(R.string.device_not_connected_description, str)).setCancelable(false).setNeutralButton(R.string.go_to_support_center, new aj1.f(context, 3)).setNegativeButton(context.getString(R.string.lbl_close), new k(17)).create().show();
        }

        private C0578a() {
        }
    }
}

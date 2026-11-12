package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;

/* JADX INFO: loaded from: classes2.dex */
public class xxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f39572a = "update";

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f39572a);
        aje.b(context).c(broadcastReceiver, intentFilter);
    }

    public static void b(String str, String str2) {
        Application applicationA = vwr.g().a();
        Intent intent = new Intent(f39572a);
        intent.putExtra("appName", str);
        intent.putExtra(RnReportConst.ApiReport.PARAM_MODULE, str2);
        aje.b(applicationA).d(intent);
    }

    public static void c(Context context, BroadcastReceiver broadcastReceiver) {
        aje.b(context).e(broadcastReceiver);
    }
}

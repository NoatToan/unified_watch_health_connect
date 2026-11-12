package com.huawei.health.receiver;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.health.MainActivity;
import com.huawei.health.developerkit.TrackDeveloperKitProxy;
import com.huawei.health.devicemgr.api.constant.DataCallbackType;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.ecu;
import defpackage.fga;
import defpackage.iov;
import defpackage.ive;
import defpackage.iyn;
import defpackage.oav;
import defpackage.uce;
import defpackage.uwa;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes30.dex */
public class NormalizationStaticBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent == null || context == null) {
            LogUtil.j("Track_NormalizationStaticBroadcastReceiver", "intent == null || context == null");
            return;
        }
        String action = intent.getAction();
        if (!"com.huawei.health.track.broadcast".equals(action)) {
            LogUtil.j("Track_NormalizationStaticBroadcastReceiver", "action is not equals TRACK_BROADCAST");
            return;
        }
        try {
            stringExtra = intent.getStringExtra("command_type");
        } catch (Exception e) {
            LogUtil.e("Track_NormalizationStaticBroadcastReceiver", LogAnonymous.b(e));
            stringExtra = null;
        }
        ReleaseLogUtil.d("Track_NormalizationStaticBroadcastReceiver", "onReceive = ", action, " msg = ", stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        b(context, stringExtra, intent);
    }

    private boolean b(Context context) {
        try {
            return fga.d(context.getApplicationContext()).e().d() == 1;
        } catch (NullPointerException unused) {
            ReleaseLogUtil.a("Track_NormalizationStaticBroadcastReceiver", "isStepClassOne exception! ");
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    private void b(Context context, String str, Intent intent) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "com.huawei.health.background.start.sport":
                b2 = 0;
                break;
            case "com.huawei.health.track.exit_running":
                b2 = 1;
                break;
            case "com.huawei.health.track.running":
                b2 = 2;
                break;
            case "com.huawei.health.AUTO_TRACK_END":
                b2 = 3;
                break;
            case "com.huawei.health.track.fastwalking":
                b2 = 4;
                break;
            case "com.huawei.track.restart":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            ive.c().init(context);
            ive.c().setAdapter(PluginHealthTrackAdapterImpl.getInstance(context.getApplicationContext()));
            iyn.b(new TrackDeveloperKitProxy());
            return;
        }
        if (b2 == 1) {
            ive.c().b(context);
            return;
        }
        if (b2 == 2) {
            e(context, intent.getBundleExtra("paramsBundle"));
            return;
        }
        if (b2 == 3) {
            ive.c();
            ive.e(true);
            return;
        }
        if (b2 == 4) {
            c(context, intent.getBundleExtra("paramsBundle"));
            return;
        }
        if (b2 != 5) {
            e(context, str, intent);
        } else {
            if (ive.c().k()) {
                return;
            }
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.addFlags(268435456);
            intent2.putExtra("mLaunchSource", 4);
            iov.d(context, intent2);
        }
    }

    private void e(Context context, Bundle bundle) {
        if (ive.c().o()) {
            LogUtil.a("Track_NormalizationStaticBroadcastReceiver", "sport already started,fast running");
            return;
        }
        ive.c().init(context);
        ive.c().setAdapter(PluginHealthTrackAdapterImpl.getInstance(context.getApplicationContext()));
        ive.c().a(258, b(context), true, bundle);
    }

    private void c(Context context, Bundle bundle) {
        if (ive.c().o()) {
            LogUtil.a("Track_NormalizationStaticBroadcastReceiver", "sport already started,fast walking");
            return;
        }
        ive.c().init(context);
        ive.c().setAdapter(PluginHealthTrackAdapterImpl.getInstance(context.getApplicationContext()));
        ive.c().a(257, b(context), true, bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    private void e(Context context, String str, Intent intent) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "MY_PACKAGE_REPLACED_UPDATE_MODULES":
                b2 = 0;
                break;
            case "com.huawei.health.sync.coresleep":
                b2 = 1;
                break;
            case "PULL_RUN_DEEPLINK":
                b2 = 2;
                break;
            case "SYNC_FITNESS_DATA":
                b2 = 3;
                break;
            case "REVERSE_LINKAGE":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            b(context, true);
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                AppRouterUtils.b(context, intent);
                return;
            }
            if (b2 == 3) {
                ecu.d().registerDataCallback(null, DataCallbackType.SUGGESTION_AIDL, "Track_NormalizationStaticBroadcastReceiver");
                return;
            } else {
                if (b2 != 4) {
                    return;
                }
                LogUtil.a("Track_NormalizationStaticBroadcastReceiver", "reverse linkage");
                oav.d().handleRemoteException((ContentValues) intent.getParcelableExtra("key_broadcast_info"));
                return;
            }
        }
        LogUtil.a("Track_NormalizationStaticBroadcastReceiver", "BROADCAST_COMMAND_TYPE_SYNC_CORE_SLEEP Start!");
        long longExtra = intent.getLongExtra("fallAsleepTime", 0L);
        long longExtra2 = intent.getLongExtra("wakeTime", 0L);
        int intExtra = intent.getIntExtra(JsUtil.SCORE, 0);
        if (longExtra <= 0 || longExtra2 <= 0) {
            return;
        }
        LogUtil.a("Track_NormalizationStaticBroadcastReceiver", "handleSleepEvent Start!");
        uce.b(longExtra, longExtra2, intExtra);
        uwa.d(longExtra, longExtra2);
        LogUtil.a("Track_NormalizationStaticBroadcastReceiver", "handleSleepEvent Stop!");
    }

    private void b(Context context, boolean z) {
        if (z) {
            AppBundle.c().getSetting().setAllowDownloadModule(context, "PluginHiAiEngine", true);
        }
    }
}

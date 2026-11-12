package com.huawei.health.receiver;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwdevice.phoneprocess.service.HandleIntentService;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cio;
import defpackage.lsy;
import health.compact.a.CommonUtil;
import health.compact.a.DeviceUtil;

/* JADX INFO: loaded from: classes30.dex */
public class PromptReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8660a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            LogUtil.j("PromptReceiver", "PromptReceiver intent or context is null.");
            return;
        }
        if (!CommonUtil.bh()) {
            LogUtil.j("PromptReceiver", "PromptReceiver is other brand phone");
            return;
        }
        if (e(context)) {
            return;
        }
        try {
            if (!DeviceUtil.b()) {
                LogUtil.a("PromptReceiver", "PromptReceiver not has device");
                return;
            }
            LogUtil.a("PromptReceiver", "PromptReceiver action:", intent.getAction());
            if ("com.huawei.intelligent.action.NOTIFY_MSG".equalsIgnoreCase(intent.getAction())) {
                if (intent.hasExtra("phone_flag")) {
                    boolean booleanExtra = intent.getBooleanExtra("phone_flag", false);
                    this.f8660a = booleanExtra;
                    LogUtil.a("PromptReceiver", "PromptReceiver mIsForbiddenPrompt:", Boolean.valueOf(booleanExtra));
                    return;
                }
                if (this.f8660a) {
                    LogUtil.j("PromptReceiver", "PromptReceiver is synergy return");
                    return;
                }
                String stringExtra = intent.getStringExtra("type");
                String stringExtra2 = intent.getStringExtra("message_short");
                LogUtil.a("PromptReceiver", "PromptReceiver type:", stringExtra, ", messageShort:", stringExtra2);
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                    boolean zB = NotificationContentProviderUtil.b();
                    boolean zA = NotificationContentProviderUtil.a(cio.d);
                    LogUtil.a("PromptReceiver", "PromptReceiver mHwNotificationManager isAuthorizeEnabled:", Boolean.valueOf(zB), " isSwitchEnable:", Boolean.valueOf(zA));
                    if (zB && zA) {
                        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
                            LogUtil.a("PromptReceiver", "PromptReceiver switch not on, not need start service.");
                            return;
                        } else {
                            d(context, stringExtra, stringExtra2);
                            return;
                        }
                    }
                    return;
                }
                LogUtil.j("PromptReceiver", "PromptReceiver type or messageShort is empty.");
            }
        } catch (Exception unused) {
            LogUtil.e("PromptReceiver", "onReceive exception");
        }
    }

    private boolean e(Context context) {
        Object obj;
        if (CommonUtil.bg()) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(cio.d, 128);
                if (applicationInfo != null && applicationInfo.metaData != null && (obj = applicationInfo.metaData.get("oversea")) != null && TextUtils.equals(obj.toString(), "true")) {
                    LogUtil.a("PromptReceiver", "judgeAppOversea  value is true");
                    return true;
                }
            } catch (Exception unused) {
                LogUtil.e("PromptReceiver", "judgeAppOversea occur exception");
            }
        }
        LogUtil.a("PromptReceiver", "judgeAppOversea app is not oversea version");
        return false;
    }

    private void d(final Context context, final String str, final String str2) {
        lsy.a(new Runnable() { // from class: com.huawei.health.receiver.PromptReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                if (DeviceUtil.b()) {
                    LogUtil.a("PromptReceiver", "startHandleIntentService have device so start PhoneService");
                    Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
                    intent.setAction("com.huawei.intelligent.action.NOTIFY_MSG");
                    intent.putExtra("type", str);
                    intent.putExtra("message_short", str2);
                    try {
                        context.startService(intent);
                    } catch (IllegalStateException | SecurityException e) {
                        LogUtil.e("PromptReceiver", "startHandleIntentService:", ExceptionUtils.c(e));
                    }
                }
            }
        });
    }
}

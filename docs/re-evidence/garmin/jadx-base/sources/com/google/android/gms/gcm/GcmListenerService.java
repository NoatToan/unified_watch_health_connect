package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class GcmListenerService extends com.google.android.gms.iid.zze {
    private com.google.android.gms.internal.gcm.zzl zzg = com.google.android.gms.internal.gcm.zzm.zzdk;

    public static void zzd(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && next.startsWith(Constants.MessagePayloadKeys.RESERVED_CLIENT_LIB_PREFIX)) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.gms.iid.zze
    public void handleIntent(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            String strValueOf = String.valueOf(intent.getAction());
            if (strValueOf.length() != 0) {
                "Unknown intent action: ".concat(strValueOf);
            }
            return;
        }
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                Bundle extras = intent.getExtras();
                extras.remove(Constants.MessagePayloadKeys.MESSAGE_TYPE);
                extras.remove("androidx.contentpager.content.wakelockid");
                if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(zzd.zzd(extras, Constants.MessageNotificationKeys.ENABLE_NOTIFICATION)) || zzd.zzd(extras, Constants.MessageNotificationKeys.ICON) != null) {
                    if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                        int iMyPid = Process.myPid();
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                if (runningAppProcessInfo.pid == iMyPid) {
                                    if (runningAppProcessInfo.importance == 100) {
                                        Bundle bundle = new Bundle();
                                        Iterator<String> it = extras.keySet().iterator();
                                        while (it.hasNext()) {
                                            String next = it.next();
                                            String string = extras.getString(next);
                                            if (next.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD)) {
                                                next = next.replace(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD, Constants.MessageNotificationKeys.NOTIFICATION_PREFIX);
                                            }
                                            if (next.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX)) {
                                                if (!Constants.MessageNotificationKeys.ENABLE_NOTIFICATION.equals(next)) {
                                                    bundle.putString(next.substring(6), string);
                                                }
                                                it.remove();
                                            }
                                        }
                                        String string2 = bundle.getString("sound2");
                                        if (string2 != null) {
                                            bundle.remove("sound2");
                                            bundle.putString("sound", string2);
                                        }
                                        if (!bundle.isEmpty()) {
                                            extras.putBundle("notification", bundle);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    zzd.zzd(this).zze(extras);
                    break;
                }
                String string3 = extras.getString(Constants.MessagePayloadKeys.FROM);
                extras.remove(Constants.MessagePayloadKeys.FROM);
                zzd(extras);
                this.zzg.zzl("onMessageReceived");
                onMessageReceived(string3, extras);
                break;
            case "send_error":
                String stringExtra2 = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
                if (stringExtra2 == null) {
                    stringExtra2 = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
                }
                onSendError(stringExtra2, intent.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra(Constants.MessagePayloadKeys.MSGID));
                break;
            default:
                if (stringExtra.length() != 0) {
                    "Received message with unknown type: ".concat(stringExtra);
                    break;
                }
                break;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.google.android.gms.internal.gcm.zzm.zzab();
        this.zzg = com.google.android.gms.internal.gcm.zzm.zzdk;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(String str, Bundle bundle) {
    }

    public void onMessageSent(String str) {
    }

    public void onSendError(String str, String str2) {
    }
}

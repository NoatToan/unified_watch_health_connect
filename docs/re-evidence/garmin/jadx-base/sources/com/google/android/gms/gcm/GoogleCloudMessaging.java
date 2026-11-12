package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzaf;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p1.a;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class GoogleCloudMessaging {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String INSTANCE_ID_SCOPE = "GCM";

    @Deprecated
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";

    @Deprecated
    public static final String MESSAGE_TYPE_MESSAGE = "gcm";

    @Deprecated
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";

    @Deprecated
    public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
    private static GoogleCloudMessaging zzae;
    private static final AtomicInteger zzah = new AtomicInteger(1);
    private PendingIntent zzaf;
    private final Map<String, Handler> zzag = Collections.synchronizedMap(new a());
    private final BlockingQueue<Intent> zzai = new LinkedBlockingQueue();
    private final Messenger zzaj = new Messenger(new zzf(this, Looper.getMainLooper()));
    private Context zzl;

    @Deprecated
    public static synchronized GoogleCloudMessaging getInstance(Context context) {
        try {
            if (zzae == null) {
                zze(context);
                GoogleCloudMessaging googleCloudMessaging = new GoogleCloudMessaging();
                zzae = googleCloudMessaging;
                googleCloudMessaging.zzl = context.getApplicationContext();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return zzae;
    }

    @ShowFirstParty
    @VisibleForTesting
    @Deprecated
    private final synchronized String zzd(boolean z14, String... strArr) {
        try {
            String strZzl = zzaf.zzl(this.zzl);
            if (strZzl == null) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            if (strArr == null || strArr.length == 0) {
                throw new IllegalArgumentException("No senderIds");
            }
            StringBuilder sb3 = new StringBuilder(strArr[0]);
            for (int i14 = 1; i14 < strArr.length; i14++) {
                sb3.append(CoreConstants.COMMA_CHAR);
                sb3.append(strArr[i14]);
            }
            String string = sb3.toString();
            Bundle bundle = new Bundle();
            if (strZzl.contains(".gsf")) {
                bundle.putString("legacy.sender", string);
                return InstanceID.getInstance(this.zzl).getToken(string, "GCM", bundle);
            }
            bundle.putString(NotificationConstants.KEY_MESSAGE_SENDER, string);
            Intent intentZzd = zzd(bundle, z14);
            if (intentZzd == null) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            String stringExtra = intentZzd.getStringExtra("registration_id");
            if (stringExtra != null) {
                return stringExtra;
            }
            String stringExtra2 = intentZzd.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if (stringExtra2 != null) {
                throw new IOException(stringExtra2);
            }
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private final synchronized void zze(Intent intent) {
        try {
            if (this.zzaf == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                this.zzaf = PendingIntent.getBroadcast(this.zzl, 0, intent2, 0);
            }
            intent.putExtra("app", this.zzaf);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static int zzf(Context context) {
        String strZzl = zzaf.zzl(context);
        if (strZzl == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(strZzl, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private final synchronized void zzh() {
        PendingIntent pendingIntent = this.zzaf;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.zzaf = null;
        }
    }

    @Deprecated
    public void close() {
        zzae = null;
        zzd.zzk = null;
        zzh();
    }

    @Deprecated
    public String getMessageType(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        return stringExtra != null ? stringExtra : "gcm";
    }

    @Deprecated
    public synchronized String register(String... strArr) {
        return zzd(zzaf.zzk(this.zzl), strArr);
    }

    @Deprecated
    public void send(String str, String str2, long j8, Bundle bundle) throws IOException {
        if (str == null) {
            h.s("Missing 'to'");
            return;
        }
        String strZzl = zzaf.zzl(this.zzl);
        if (strZzl == null) {
            h.C("SERVICE_NOT_AVAILABLE");
            return;
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        zze(intent);
        intent.setPackage(strZzl);
        intent.putExtra(Constants.MessagePayloadKeys.TO, str);
        intent.putExtra(Constants.MessagePayloadKeys.MSGID, str2);
        intent.putExtra(Constants.MessagePayloadKeys.TTL, Long.toString(j8));
        int iIndexOf = str.indexOf(64);
        String strSubstring = iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
        InstanceID.getInstance(this.zzl);
        intent.putExtra("google.from", InstanceID.zzp().zzf("", strSubstring, "GCM"));
        if (!strZzl.contains(".gsf")) {
            this.zzl.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        Bundle bundle2 = new Bundle();
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj instanceof String) {
                String strValueOf = String.valueOf(str3);
                bundle2.putString(strValueOf.length() != 0 ? Constants.MessageNotificationKeys.RESERVED_PREFIX.concat(strValueOf) : new String(Constants.MessageNotificationKeys.RESERVED_PREFIX), (String) obj);
            }
        }
        bundle2.putString(Constants.MessagePayloadKeys.TO, str);
        bundle2.putString(Constants.MessagePayloadKeys.MSGID, str2);
        InstanceID.getInstance(this.zzl).zze("GCM", "upstream", bundle2);
    }

    @Deprecated
    public synchronized void unregister() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        InstanceID.getInstance(this.zzl).deleteInstanceID();
    }

    public static void zze(Context context) {
        new StringBuilder(String.valueOf(context.getPackageName()).length() + 48);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzd(Intent intent) {
        Handler handlerRemove;
        String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
            stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        }
        if (stringExtra == null || (handlerRemove = this.zzag.remove(stringExtra)) == null) {
            return false;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = intent;
        return handlerRemove.sendMessage(messageObtain);
    }

    @Deprecated
    private final Intent zzd(Bundle bundle, boolean z14) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (zzf(this.zzl) >= 0) {
                Intent intent = new Intent(z14 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
                intent.setPackage(zzaf.zzl(this.zzl));
                zze(intent);
                int andIncrement = zzah.getAndIncrement();
                StringBuilder sb3 = new StringBuilder(21);
                sb3.append("google.rpc");
                sb3.append(andIncrement);
                intent.putExtra(Constants.MessagePayloadKeys.MSGID, sb3.toString());
                intent.putExtras(bundle);
                intent.putExtra("google.messenger", this.zzaj);
                Context context = this.zzl;
                if (z14) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
                try {
                    return this.zzai.poll(30000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e4) {
                    h.C(e4.getMessage());
                    return null;
                }
            }
            h.C("Google Play Services missing");
            return null;
        }
        h.C("MAIN_THREAD");
        return null;
    }

    @Deprecated
    public void send(String str, String str2, Bundle bundle) throws IOException {
        send(str, str2, -1L, bundle);
    }
}

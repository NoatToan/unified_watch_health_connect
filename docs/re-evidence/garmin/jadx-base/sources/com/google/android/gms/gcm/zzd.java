package com.google.android.gms.gcm;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.v;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.google.firebase.messaging.Constants;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes14.dex */
final class zzd {
    static zzd zzk;
    private final Context zzl;
    private String zzm;
    private final AtomicInteger zzn = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private zzd(Context context) {
        this.zzl = context.getApplicationContext();
    }

    public static synchronized zzd zzd(Context context) {
        try {
            if (zzk == null) {
                zzk = new zzd(context);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return zzk;
    }

    private final Bundle zzf() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            applicationInfo = this.zzl.getPackageManager().getApplicationInfo(this.zzl.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? Bundle.EMPTY : bundle;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0067  */
    /* JADX WARN: Code duplicated, block: B:49:0x016d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0173 A[PHI: r7
      0x0173: PHI (r7v20 java.lang.String) = (r7v13 java.lang.String), (r7v17 java.lang.String), (r7v11 java.lang.String) binds: [B:54:0x0182, B:64:0x01bb, B:50:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x0180  */
    /* JADX WARN: Code duplicated, block: B:56:0x0185  */
    /* JADX WARN: Code duplicated, block: B:58:0x0197  */
    /* JADX WARN: Code duplicated, block: B:63:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01de  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202  */
    /* JADX WARN: Code duplicated, block: B:79:0x0206  */
    /* JADX WARN: Code duplicated, block: B:82:0x0222  */
    public final boolean zze(Bundle bundle) {
        int i14;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        String strZzd;
        q qVar;
        String strZzd2;
        NotificationManager notificationManager;
        String string;
        CharSequence charSequenceZze = zze(bundle, Constants.MessageNotificationKeys.TITLE);
        if (TextUtils.isEmpty(charSequenceZze)) {
            charSequenceZze = this.zzl.getApplicationInfo().loadLabel(this.zzl.getPackageManager());
        }
        String strZze = zze(bundle, Constants.MessageNotificationKeys.BODY);
        String strZzd3 = zzd(bundle, Constants.MessageNotificationKeys.ICON);
        if (TextUtils.isEmpty(strZzd3)) {
            i14 = this.zzl.getApplicationInfo().icon;
            if (i14 == 0) {
                i14 = android.R.drawable.sym_def_app_icon;
            }
            identifier = i14;
        } else {
            Resources resources = this.zzl.getResources();
            identifier = resources.getIdentifier(strZzd3, "drawable", this.zzl.getPackageName());
            if (identifier == 0 && (identifier = resources.getIdentifier(strZzd3, "mipmap", this.zzl.getPackageName())) == 0) {
                new StringBuilder(v.a(57, strZzd3));
                i14 = this.zzl.getApplicationInfo().icon;
                if (i14 == 0) {
                    i14 = android.R.drawable.sym_def_app_icon;
                }
                identifier = i14;
            }
        }
        String strZzd4 = zzd(bundle, Constants.MessageNotificationKeys.COLOR);
        String strZzd5 = zzd(bundle, Constants.MessageNotificationKeys.SOUND_2);
        String str = null;
        if (TextUtils.isEmpty(strZzd5)) {
            defaultUri = null;
        } else if ("default".equals(strZzd5) || this.zzl.getResources().getIdentifier(strZzd5, "raw", this.zzl.getPackageName()) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            String packageName = this.zzl.getPackageName();
            StringBuilder sb3 = new StringBuilder(v.a(v.a(24, packageName), strZzd5));
            sb3.append("android.resource://");
            sb3.append(packageName);
            sb3.append("/raw/");
            sb3.append(strZzd5);
            defaultUri = Uri.parse(sb3.toString());
        }
        String strZzd6 = zzd(bundle, Constants.MessageNotificationKeys.CLICK_ACTION);
        if (TextUtils.isEmpty(strZzd6)) {
            launchIntentForPackage = this.zzl.getPackageManager().getLaunchIntentForPackage(this.zzl.getPackageName());
            if (launchIntentForPackage == null) {
                activity = null;
            }
            strZzd = zzd(bundle, Constants.MessageNotificationKeys.CHANNEL);
            if (PlatformVersion.isAtLeastO() && this.zzl.getApplicationInfo().targetSdkVersion >= 26) {
                notificationManager = (NotificationManager) this.zzl.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strZzd)) {
                    strZzd = this.zzm;
                    if (strZzd != null) {
                        str = strZzd;
                    } else {
                        string = zzf().getString("com.google.android.gms.gcm.default_notification_channel_id");
                        this.zzm = string;
                        if (!TextUtils.isEmpty(string) || notificationManager.getNotificationChannel(this.zzm) == null) {
                            strZzd = CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
                            if (notificationManager.getNotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                                notificationManager.createNotificationChannel(new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, this.zzl.getString(R.string.gcm_fallback_notification_channel_label), 3));
                            }
                            this.zzm = CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
                            str = strZzd;
                        } else {
                            str = this.zzm;
                        }
                    }
                } else if (notificationManager.getNotificationChannel(strZzd) != null) {
                    str = strZzd;
                } else {
                    new StringBuilder(v.a(122, strZzd));
                    strZzd = this.zzm;
                    if (strZzd != null) {
                        str = strZzd;
                    } else {
                        string = zzf().getString("com.google.android.gms.gcm.default_notification_channel_id");
                        this.zzm = string;
                        if (TextUtils.isEmpty(string)) {
                        }
                        strZzd = CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
                        if (notificationManager.getNotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                            notificationManager.createNotificationChannel(new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, this.zzl.getString(R.string.gcm_fallback_notification_channel_label), 3));
                        }
                        this.zzm = CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
                        str = strZzd;
                    }
                }
            }
            qVar = new q(this.zzl);
            qVar.i(16, true);
            qVar.N.icon = identifier;
            if (!TextUtils.isEmpty(charSequenceZze)) {
                qVar.g(charSequenceZze);
            }
            if (!TextUtils.isEmpty(strZze)) {
                qVar.f(strZze);
                o oVar = new o();
                oVar.f202664e = q.e(strZze);
                qVar.l(oVar);
            }
            if (!TextUtils.isEmpty(strZzd4)) {
                qVar.D = Color.parseColor(strZzd4);
            }
            if (defaultUri != null) {
                qVar.k(defaultUri);
            }
            if (activity != null) {
                qVar.f202686h = activity;
            }
            if (str != null) {
                qVar.G = str;
            }
            Notification notificationC = qVar.c();
            strZzd2 = zzd(bundle, Constants.MessageNotificationKeys.TAG);
            NotificationManager notificationManager2 = (NotificationManager) this.zzl.getSystemService("notification");
            if (TextUtils.isEmpty(strZzd2)) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                StringBuilder sb4 = new StringBuilder(37);
                sb4.append("GCM-Notification:");
                sb4.append(jUptimeMillis);
                strZzd2 = sb4.toString();
            }
            notificationManager2.notify(strZzd2, 0, notificationC);
            return true;
        }
        launchIntentForPackage = new Intent(strZzd6);
        launchIntentForPackage.setPackage(this.zzl.getPackageName());
        launchIntentForPackage.setFlags(268435456);
        Bundle bundle2 = new Bundle(bundle);
        GcmListenerService.zzd(bundle2);
        launchIntentForPackage.putExtras(bundle2);
        for (String str2 : bundle2.keySet()) {
            if (str2.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) || str2.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD)) {
                launchIntentForPackage.removeExtra(str2);
            }
        }
        activity = PendingIntent.getActivity(this.zzl, this.zzn.getAndIncrement(), launchIntentForPackage, 1073741824);
        strZzd = zzd(bundle, Constants.MessageNotificationKeys.CHANNEL);
        if (PlatformVersion.isAtLeastO()) {
            notificationManager = (NotificationManager) this.zzl.getSystemService(NotificationManager.class);
            if (TextUtils.isEmpty(strZzd)) {
                strZzd = this.zzm;
                if (strZzd != null) {
                    str = strZzd;
                } else {
                    string = zzf().getString("com.google.android.gms.gcm.default_notification_channel_id");
                    this.zzm = string;
                    if (TextUtils.isEmpty(string)) {
                    }
                    strZzd = CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
                    if (notificationManager.getNotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, this.zzl.getString(R.string.gcm_fallback_notification_channel_label), 3));
                    }
                    this.zzm = CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
                    str = strZzd;
                }
            } else if (notificationManager.getNotificationChannel(strZzd) != null) {
                str = strZzd;
            } else {
                new StringBuilder(v.a(122, strZzd));
                strZzd = this.zzm;
                if (strZzd != null) {
                    str = strZzd;
                } else {
                    string = zzf().getString("com.google.android.gms.gcm.default_notification_channel_id");
                    this.zzm = string;
                    if (TextUtils.isEmpty(string)) {
                    }
                    strZzd = CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
                    if (notificationManager.getNotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, this.zzl.getString(R.string.gcm_fallback_notification_channel_label), 3));
                    }
                    this.zzm = CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
                    str = strZzd;
                }
            }
        }
        qVar = new q(this.zzl);
        qVar.i(16, true);
        qVar.N.icon = identifier;
        if (!TextUtils.isEmpty(charSequenceZze)) {
            qVar.g(charSequenceZze);
        }
        if (!TextUtils.isEmpty(strZze)) {
            qVar.f(strZze);
            o oVar2 = new o();
            oVar2.f202664e = q.e(strZze);
            qVar.l(oVar2);
        }
        if (!TextUtils.isEmpty(strZzd4)) {
            qVar.D = Color.parseColor(strZzd4);
        }
        if (defaultUri != null) {
            qVar.k(defaultUri);
        }
        if (activity != null) {
            qVar.f202686h = activity;
        }
        if (str != null) {
            qVar.G = str;
        }
        Notification notificationC2 = qVar.c();
        strZzd2 = zzd(bundle, Constants.MessageNotificationKeys.TAG);
        NotificationManager notificationManager3 = (NotificationManager) this.zzl.getSystemService("notification");
        if (TextUtils.isEmpty(strZzd2)) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            StringBuilder sb5 = new StringBuilder(37);
            sb5.append("GCM-Notification:");
            sb5.append(jUptimeMillis2);
            strZzd2 = sb5.toString();
        }
        notificationManager3.notify(strZzd2, 0, notificationC2);
        return true;
    }

    public static String zzd(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX, Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD)) : string;
    }

    private final String zze(Bundle bundle, String str) {
        String strZzd = zzd(bundle, str);
        if (!TextUtils.isEmpty(strZzd)) {
            return strZzd;
        }
        String strValueOf = String.valueOf(str);
        String strZzd2 = zzd(bundle, Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX.length() != 0 ? strValueOf.concat(Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX) : new String(strValueOf));
        if (TextUtils.isEmpty(strZzd2)) {
            return null;
        }
        Resources resources = this.zzl.getResources();
        int identifier = resources.getIdentifier(strZzd2, "string", this.zzl.getPackageName());
        if (identifier == 0) {
            String strValueOf2 = String.valueOf(str);
            new StringBuilder(v.a((Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX.length() != 0 ? strValueOf2.concat(Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX) : new String(strValueOf2)).substring(6).length() + 49, strZzd2));
            return null;
        }
        String strValueOf3 = String.valueOf(str);
        String strZzd3 = zzd(bundle, Constants.MessageNotificationKeys.TEXT_ARGS_SUFFIX.length() != 0 ? strValueOf3.concat(Constants.MessageNotificationKeys.TEXT_ARGS_SUFFIX) : new String(strValueOf3));
        if (TextUtils.isEmpty(strZzd3)) {
            return resources.getString(identifier);
        }
        try {
            JSONArray jSONArray = new JSONArray(strZzd3);
            int length = jSONArray.length();
            Object[] objArr = new String[length];
            for (int i14 = 0; i14 < length; i14++) {
                objArr[i14] = jSONArray.opt(i14);
            }
            return resources.getString(identifier, objArr);
        } catch (MissingFormatArgumentException unused) {
            new StringBuilder(v.a(v.a(58, strZzd2), strZzd3));
            return null;
        } catch (JSONException unused2) {
            String strValueOf4 = String.valueOf(str);
            new StringBuilder(v.a((Constants.MessageNotificationKeys.TEXT_ARGS_SUFFIX.length() != 0 ? strValueOf4.concat(Constants.MessageNotificationKeys.TEXT_ARGS_SUFFIX) : new String(strValueOf4)).substring(6).length() + 41, strZzd3));
            return null;
        }
    }
}

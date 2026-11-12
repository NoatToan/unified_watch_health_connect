package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.xiaomi.push.di;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public class am {
    private static final boolean a = Log.isLoggable("NCHelper", 3);

    private static int a(NotificationChannel notificationChannel) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) com.xiaomi.push.z.b((Object) notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (a) {
                h("isUserLockedChannel:" + iIntValue + " " + notificationChannel);
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3435a("NCHelper", "is user locked error" + e);
        }
        return iIntValue;
    }

    @TargetApi(26)
    public static String a(aq aqVar, String str, CharSequence charSequence, String str2, int i, int i2, String str3, String str4) {
        String strM3820a = aqVar.m3820a(str);
        boolean z = a;
        if (z) {
            h("createChannel: appChannelId:" + strM3820a + " serverChannelId:" + str + " serverChannelName:" + ((Object) charSequence) + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i + " serverChannelName:" + ((Object) charSequence) + " serverChannelImportance:" + i2 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel notificationChannel = new NotificationChannel(strM3820a, charSequence, i2);
        notificationChannel.setDescription(str2);
        notificationChannel.enableVibration((i & 2) != 0);
        notificationChannel.enableLights((i & 4) != 0);
        if ((i & 1) == 0) {
            notificationChannel.setSound(null, null);
        } else if (!TextUtils.isEmpty(str3)) {
            if (str3.startsWith("android.resource://" + aqVar.m3819a())) {
                notificationChannel.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (z) {
            h("create channel:" + notificationChannel);
        }
        g(aqVar, notificationChannel, str4);
        return strM3820a;
    }

    public static void a(Context context, String str) {
        if (!com.xiaomi.channel.commonutils.android.f.m3427a(context) || TextUtils.isEmpty(str)) {
            return;
        }
        l(context, str);
        z0.c(context, str);
    }

    @TargetApi(26)
    private static NotificationChannel b(String str, NotificationChannel notificationChannel) {
        NotificationChannel notificationChannel2 = new NotificationChannel(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannel2.setDescription(notificationChannel.getDescription());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannel2;
    }

    private static SharedPreferences c(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    public static void d(Context context, aq aqVar, NotificationChannel notificationChannel, int i, String str) {
        if (i <= 0) {
            aqVar.h(notificationChannel);
            return;
        }
        int iA = com.xiaomi.channel.commonutils.android.a.a(context) >= 2 ? z0.a(context.getPackageName(), str) : 0;
        NotificationChannel notificationChannelB = b(notificationChannel.getId(), notificationChannel);
        if ((i & 32) != 0) {
            if (notificationChannel.getSound() != null) {
                notificationChannelB.setSound(null, null);
            } else {
                notificationChannelB.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if ((i & 16) != 0) {
            if (notificationChannel.shouldVibrate()) {
                notificationChannelB.enableVibration(false);
            } else {
                notificationChannelB.enableVibration(true);
            }
        }
        if ((i & 8) != 0) {
            if (notificationChannel.shouldShowLights()) {
                notificationChannelB.enableLights(false);
            } else {
                notificationChannelB.enableLights(true);
            }
        }
        if ((i & 4) != 0) {
            int importance = notificationChannel.getImportance() - 1;
            if (importance <= 0) {
                importance = 2;
            }
            notificationChannelB.setImportance(importance);
        }
        if ((i & 2) != 0) {
            notificationChannelB.setLockscreenVisibility(notificationChannel.getLockscreenVisibility() - 1);
        }
        aqVar.h(notificationChannelB);
        aqVar.i(notificationChannel, true);
        z0.i(aqVar.m3819a(), notificationChannel.getId(), iA, 0);
    }

    private static void e(Context context, List<String> list) {
        if (a) {
            h("deleteCopiedChannelRecord:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = c(context).edit();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            editorEdit.remove(it2.next());
        }
        editorEdit.apply();
    }

    public static void f(di diVar) {
        Map<String, String> map;
        if (diVar == null || (map = diVar.f90a) == null || !map.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        diVar.a = 0;
        diVar.f90a.remove(OpenSdkPlayStatisticUpload.KEY_CHANNEL_ID);
        diVar.f90a.remove("channel_importance");
        diVar.f90a.remove("channel_name");
        diVar.f90a.remove("channel_description");
        diVar.f90a.remove("channel_perm");
        com.xiaomi.channel.commonutils.logger.b.m3434a("delete channel info by:" + diVar.f90a.get("REMOVE_CHANNEL_MARK"));
        diVar.f90a.remove("REMOVE_CHANNEL_MARK");
    }

    @TargetApi(26)
    private static void g(aq aqVar, NotificationChannel notificationChannel, String str) {
        int i;
        char c;
        int iA;
        Context contextA = aqVar.a();
        String id = notificationChannel.getId();
        String strA = aq.a(id, aqVar.m3819a());
        boolean z = a;
        if (z) {
            h("appChannelId:" + id + " oldChannelId:" + strA);
        }
        if (!com.xiaomi.channel.commonutils.android.f.m3427a(contextA) || TextUtils.equals(id, strA)) {
            NotificationChannel notificationChannelA = aqVar.a(id);
            if (z) {
                h("elseLogic getNotificationChannel:" + notificationChannelA);
            }
            if (notificationChannelA == null) {
                aqVar.h(notificationChannel);
            }
            i = 0;
            c = 0;
        } else {
            NotificationManager notificationManager = (NotificationManager) contextA.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(strA);
            NotificationChannel notificationChannelA2 = aqVar.a(id);
            if (z) {
                h("xmsfChannel:" + notificationChannel2);
                h("appChannel:" + notificationChannelA2);
            }
            if (notificationChannel2 != null) {
                NotificationChannel notificationChannelB = b(id, notificationChannel2);
                if (z) {
                    h("copyXmsf copyXmsfChannel:" + notificationChannelB);
                }
                if (notificationChannelA2 != null) {
                    iA = a(notificationChannelA2);
                    aqVar.i(notificationChannelB, iA == 0);
                    c = 3;
                } else {
                    iA = a(notificationChannel2);
                    d(contextA, aqVar, notificationChannelB, iA, notificationChannel2.getId());
                    c = 4;
                }
                k(contextA, id);
                notificationManager.deleteNotificationChannel(strA);
            } else if (notificationChannelA2 == null) {
                if (z) {
                    h("appHack createNotificationChannel:" + notificationChannel);
                }
                aqVar.h(notificationChannel);
                iA = 0;
                c = 1;
            } else if (j(contextA, id) || !i(notificationChannel, notificationChannelA2)) {
                iA = 0;
                c = 0;
            } else {
                if (z) {
                    h("appHack updateNotificationChannel:" + notificationChannel);
                }
                iA = a(notificationChannelA2);
                aqVar.i(notificationChannel, iA == 0);
                c = 2;
            }
            i = iA;
        }
        z0.d(aqVar.a(), aqVar.m3819a(), id, notificationChannel.getImportance(), str, c == 1 || c == 4 || c == 3, i);
    }

    private static void h(String str) {
        com.xiaomi.channel.commonutils.logger.b.m3435a("NCHelper", str);
    }

    @TargetApi(26)
    private static boolean i(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        boolean z;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        boolean z2 = true;
        if (TextUtils.equals(notificationChannel.getName(), notificationChannel2.getName())) {
            z = false;
        } else {
            if (a) {
                h("appHack channelConfigLowerCompare:getName");
            }
            z = true;
        }
        if (!TextUtils.equals(notificationChannel.getDescription(), notificationChannel2.getDescription())) {
            if (a) {
                h("appHack channelConfigLowerCompare:getDescription");
            }
            z = true;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            notificationChannel.setImportance(Math.min(notificationChannel.getImportance(), notificationChannel2.getImportance()));
            if (a) {
                h("appHack channelConfigLowerCompare:getImportance  " + notificationChannel.getImportance() + " " + notificationChannel2.getImportance());
            }
            z = true;
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            notificationChannel.enableVibration(false);
            if (a) {
                h("appHack channelConfigLowerCompare:enableVibration");
            }
            z = true;
        }
        if (notificationChannel.shouldShowLights() != notificationChannel2.shouldShowLights()) {
            notificationChannel.enableLights(false);
            if (a) {
                h("appHack channelConfigLowerCompare:enableLights");
            }
            z = true;
        }
        if ((notificationChannel.getSound() != null) != (notificationChannel2.getSound() != null)) {
            notificationChannel.setSound(null, null);
            if (a) {
                h("appHack channelConfigLowerCompare:setSound");
            }
        } else {
            z2 = z;
        }
        if (a) {
            h("appHack channelConfigLowerCompare:isDifferent:" + z2);
        }
        return z2;
    }

    private static boolean j(Context context, String str) {
        if (a) {
            h("checkCopeidChannel:newFullChannelId:" + str + "  " + c(context).getBoolean(str, false));
        }
        return c(context).getBoolean(str, false);
    }

    private static void k(Context context, String str) {
        if (a) {
            h("recordCopiedChannel:" + str);
        }
        c(context).edit().putBoolean(str, true).apply();
    }

    private static void l(Context context, String str) {
        try {
            aq aqVarA = aq.a(context, str);
            Set<String> setKeySet = c(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : setKeySet) {
                if (aqVarA.m3821a(str2)) {
                    arrayList.add(str2);
                    if (a) {
                        h("delete channel copy record:" + str2);
                    }
                }
            }
            e(context, arrayList);
        } catch (Exception unused) {
        }
    }
}

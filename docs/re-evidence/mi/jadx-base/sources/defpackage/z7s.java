package defpackage;

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
import com.xiaomi.push.g;
import com.xiaomi.push.io;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class z7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f40998a = Log.isLoggable("NCHelper", 3);

    public static int a(NotificationChannel notificationChannel) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) zbs.n(notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (f40998a) {
                j("isUserLockedChannel:" + iIntValue + " " + notificationChannel);
            }
        } catch (Exception e) {
            x9s.p("NCHelper", "is user locked error" + e);
        }
        return iIntValue;
    }

    @TargetApi(26)
    public static NotificationChannel b(String str, NotificationChannel notificationChannel) {
        NotificationChannel notificationChannel2 = new NotificationChannel(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannel2.setDescription(notificationChannel.getDescription());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannel2;
    }

    public static SharedPreferences c(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    @TargetApi(26)
    public static String d(p8s p8sVar, String str, CharSequence charSequence, String str2, int i, int i2, String str3, String str4) {
        String strI = p8sVar.i(str);
        boolean z = f40998a;
        if (z) {
            j("createChannel: appChannelId:" + strI + " serverChannelId:" + str + " serverChannelName:" + ((Object) charSequence) + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i + " serverChannelName:" + ((Object) charSequence) + " serverChannelImportance:" + i2 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel notificationChannel = new NotificationChannel(strI, charSequence, i2);
        notificationChannel.setDescription(str2);
        notificationChannel.enableVibration((i & 2) != 0);
        notificationChannel.enableLights((i & 4) != 0);
        if ((i & 1) == 0) {
            notificationChannel.setSound(null, null);
        } else if (!TextUtils.isEmpty(str3)) {
            if (str3.startsWith("android.resource://" + p8sVar.h())) {
                notificationChannel.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (z) {
            j("create channel:" + notificationChannel);
        }
        h(p8sVar, notificationChannel, str4);
        return strI;
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    public static void e(Context context, p8s p8sVar, NotificationChannel notificationChannel, int i, String str) {
        if (i <= 0) {
            p8sVar.o(notificationChannel);
            return;
        }
        int iC = g.a(context) >= 2 ? vus.c(context.getPackageName(), str) : 0;
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
        p8sVar.o(notificationChannelB);
        p8sVar.p(notificationChannel, true);
        vus.m(p8sVar.h(), notificationChannel.getId(), iC, 0);
    }

    public static void f(Context context, String str) {
        if (!y0t.j(context) || TextUtils.isEmpty(str)) {
            return;
        }
        n(context, str);
        vus.g(context, str);
    }

    public static void g(Context context, List<String> list) {
        if (f40998a) {
            j("deleteCopiedChannelRecord:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = c(context).edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    @TargetApi(26)
    public static void h(p8s p8sVar, NotificationChannel notificationChannel, String str) {
        int i;
        char c;
        int iA;
        Context contextD = p8sVar.d();
        String id = notificationChannel.getId();
        String strJ = p8s.j(id, p8sVar.h());
        boolean z = f40998a;
        if (z) {
            j("appChannelId:" + id + " oldChannelId:" + strJ);
        }
        if (!y0t.j(contextD) || TextUtils.equals(id, strJ)) {
            NotificationChannel notificationChannelB = p8sVar.b(id);
            if (z) {
                j("elseLogic getNotificationChannel:" + notificationChannelB);
            }
            if (notificationChannelB == null) {
                p8sVar.o(notificationChannel);
            }
            i = 0;
            c = 0;
        } else {
            NotificationManager notificationManager = (NotificationManager) contextD.getSystemService("notification");
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(strJ);
            NotificationChannel notificationChannelB2 = p8sVar.b(id);
            if (z) {
                j("xmsfChannel:" + notificationChannel2);
                j("appChannel:" + notificationChannelB2);
            }
            if (notificationChannel2 != null) {
                NotificationChannel notificationChannelB3 = b(id, notificationChannel2);
                if (z) {
                    j("copyXmsf copyXmsfChannel:" + notificationChannelB3);
                }
                if (notificationChannelB2 != null) {
                    iA = a(notificationChannelB2);
                    p8sVar.p(notificationChannelB3, iA == 0);
                    c = 3;
                } else {
                    iA = a(notificationChannel2);
                    e(contextD, p8sVar, notificationChannelB3, iA, notificationChannel2.getId());
                    c = 4;
                }
                m(contextD, id);
                notificationManager.deleteNotificationChannel(strJ);
            } else if (notificationChannelB2 == null) {
                if (z) {
                    j("appHack createNotificationChannel:" + notificationChannel);
                }
                p8sVar.o(notificationChannel);
                c = 1;
                iA = 0;
            } else if (l(contextD, id) || !k(notificationChannel, notificationChannelB2)) {
                iA = 0;
                c = 0;
            } else {
                if (z) {
                    j("appHack updateNotificationChannel:" + notificationChannel);
                }
                iA = a(notificationChannelB2);
                p8sVar.p(notificationChannel, iA == 0);
                c = 2;
            }
            i = iA;
        }
        vus.h(p8sVar.d(), p8sVar.h(), id, notificationChannel.getImportance(), str, c == 1 || c == 4 || c == 3, i);
    }

    public static void i(io ioVar) {
        Map<String, String> map;
        if (ioVar == null || (map = ioVar.f160a) == null || !map.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        ioVar.f156a = 0;
        ioVar.f160a.remove("channel_id");
        ioVar.f160a.remove("channel_importance");
        ioVar.f160a.remove("channel_name");
        ioVar.f160a.remove("channel_description");
        ioVar.f160a.remove("channel_perm");
        x9s.o("delete channel info by:" + ioVar.f160a.get("REMOVE_CHANNEL_MARK"));
        ioVar.f160a.remove("REMOVE_CHANNEL_MARK");
    }

    public static void j(String str) {
        x9s.p("NCHelper", str);
    }

    @TargetApi(26)
    public static boolean k(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        boolean z;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        boolean z2 = true;
        if (TextUtils.equals(notificationChannel.getName(), notificationChannel2.getName())) {
            z = false;
        } else {
            if (f40998a) {
                j("appHack channelConfigLowerCompare:getName");
            }
            z = true;
        }
        if (!TextUtils.equals(notificationChannel.getDescription(), notificationChannel2.getDescription())) {
            if (f40998a) {
                j("appHack channelConfigLowerCompare:getDescription");
            }
            z = true;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            notificationChannel.setImportance(Math.min(notificationChannel.getImportance(), notificationChannel2.getImportance()));
            if (f40998a) {
                j("appHack channelConfigLowerCompare:getImportance  " + notificationChannel.getImportance() + " " + notificationChannel2.getImportance());
            }
            z = true;
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            notificationChannel.enableVibration(false);
            if (f40998a) {
                j("appHack channelConfigLowerCompare:enableVibration");
            }
            z = true;
        }
        if (notificationChannel.shouldShowLights() != notificationChannel2.shouldShowLights()) {
            notificationChannel.enableLights(false);
            if (f40998a) {
                j("appHack channelConfigLowerCompare:enableLights");
            }
            z = true;
        }
        if ((notificationChannel.getSound() != null) != (notificationChannel2.getSound() != null)) {
            notificationChannel.setSound(null, null);
            if (f40998a) {
                j("appHack channelConfigLowerCompare:setSound");
            }
        } else {
            z2 = z;
        }
        if (f40998a) {
            j("appHack channelConfigLowerCompare:isDifferent:" + z2);
        }
        return z2;
    }

    public static boolean l(Context context, String str) {
        if (f40998a) {
            j("checkCopeidChannel:newFullChannelId:" + str + "  " + c(context).getBoolean(str, false));
        }
        return c(context).getBoolean(str, false);
    }

    public static void m(Context context, String str) {
        if (f40998a) {
            j("recordCopiedChannel:" + str);
        }
        c(context).edit().putBoolean(str, true).apply();
    }

    public static void n(Context context, String str) {
        try {
            p8s p8sVarE = p8s.e(context, str);
            Set<String> setKeySet = c(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : setKeySet) {
                if (p8sVarE.u(str2)) {
                    arrayList.add(str2);
                    if (f40998a) {
                        j("delete channel copy record:" + str2);
                    }
                }
            }
            g(context, arrayList);
        } catch (Exception unused) {
        }
    }
}

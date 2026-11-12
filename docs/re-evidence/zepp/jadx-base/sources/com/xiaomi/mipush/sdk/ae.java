package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import com.huami.message.api.WebConst;
import com.xiaomi.hm.health.sleep.eventbus.SlpHMDeviceSyncDataEventObserver;
import com.xiaomi.push.ad;
import com.xiaomi.push.av;
import com.xiaomi.push.aw;
import com.xiaomi.push.bg;
import com.xiaomi.push.cz;
import com.xiaomi.push.df;
import com.xiaomi.push.dh;
import com.xiaomi.push.di;
import com.xiaomi.push.dj;
import com.xiaomi.push.dl;
import com.xiaomi.push.dm;
import com.xiaomi.push.dp;
import com.xiaomi.push.dq;
import com.xiaomi.push.dr;
import com.xiaomi.push.ds;
import com.xiaomi.push.dt;
import com.xiaomi.push.dv;
import com.xiaomi.push.dx;
import com.xiaomi.push.dz;
import com.xiaomi.push.eb;
import com.xiaomi.push.ed;
import com.xiaomi.push.ee;
import com.xiaomi.push.ef;
import com.xiaomi.push.ej;
import com.xiaomi.push.service.at;
import com.xiaomi.push.service.au;
import com.xiaomi.push.service.bd;
import com.xiaomi.push.service.bj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes22.dex */
public class ae {
    private static ae b;
    private static Queue<String> c;
    private static Object d = new Object();
    private Context a;

    private ae(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        if (applicationContext == null) {
            this.a = context;
        }
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i) {
        return com.xiaomi.push.service.ag.b(context, str, map, i);
    }

    public static ae a(Context context) {
        if (b == null) {
            b = new ae(context);
        }
        return b;
    }

    public static void a(Context context, String str) {
        synchronized (d) {
            c.remove(str);
            a.m3457a(context);
            SharedPreferences sharedPreferencesA = a.a(context);
            String strA = ad.a(c, ",");
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("pref_msg_ids", strA);
            com.xiaomi.channel.commonutils.android.i.a(editorEdit);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    private PushMessageHandler.a b(dq dqVar, boolean z, byte[] bArr, String str, int i, Intent intent) {
        MiPushMessage miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        miPushMessage = null;
        ArrayList arrayList3 = null;
        miPushMessage = null;
        try {
            ef efVarA = aa.a(this.a, dqVar);
            if (efVarA == null) {
                com.xiaomi.channel.commonutils.logger.b.d("receiving an un-recognized message. " + dqVar.a);
                n.c(this.a, dqVar, z);
                return null;
            }
            cz czVarA = dqVar.a();
            com.xiaomi.channel.commonutils.logger.b.m3434a("processing a message, action=" + czVarA);
            switch (i.a[czVarA.ordinal()]) {
                case 1:
                    if (!dqVar.m3709b()) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt message(SendMessage).");
                        return null;
                    }
                    if (a.m3457a(this.a).m3467e() && !z) {
                        com.xiaomi.channel.commonutils.logger.b.m3434a("receive a message in pause state. drop it");
                        return null;
                    }
                    dx dxVar = (dx) efVarA;
                    dh dhVarA = dxVar.a();
                    if (dhVarA == null) {
                        com.xiaomi.channel.commonutils.logger.b.d("receive an empty message without push content, drop it");
                        n.d(this.a, dqVar, z);
                        return null;
                    }
                    int intExtra = intent.getIntExtra("notification_click_button", 0);
                    if (z) {
                        if (com.xiaomi.push.service.ag.m3818a(dqVar)) {
                            MiPushClient.reportIgnoreRegMessageClicked(this.a, dhVarA.m3662a(), dqVar.m3701a(), dqVar.b, dhVarA.b());
                        } else {
                            di diVar = dqVar.m3701a() != null ? new di(dqVar.m3701a()) : new di();
                            if (diVar.m3671a() == null) {
                                diVar.a(new HashMap());
                            }
                            diVar.m3671a().put("notification_click_button", String.valueOf(intExtra));
                            MiPushClient.reportMessageClicked(this.a, dhVarA.m3662a(), diVar, dhVarA.b());
                        }
                    }
                    if (!z) {
                        if (!TextUtils.isEmpty(dxVar.d()) && MiPushClient.aliasSetTime(this.a, dxVar.d()) < 0) {
                            MiPushClient.addAlias(this.a, dxVar.d());
                        } else if (!TextUtils.isEmpty(dxVar.c()) && MiPushClient.topicSubscribedTime(this.a, dxVar.c()) < 0) {
                            MiPushClient.addTopic(this.a, dxVar.c());
                        }
                    }
                    di diVar2 = dqVar.f120a;
                    String strM3662a = (diVar2 == null || diVar2.m3671a() == null) ? null : dqVar.f120a.f90a.get("jobkey");
                    String str2 = strM3662a;
                    if (TextUtils.isEmpty(strM3662a)) {
                        strM3662a = dhVarA.m3662a();
                    }
                    if (z || !j(this.a, strM3662a)) {
                        MiPushMessage miPushMessageGenerateMessage = PushMessageHelper.generateMessage(dxVar, dqVar.m3701a(), z);
                        if (miPushMessageGenerateMessage.getPassThrough() == 0 && !z && com.xiaomi.push.service.ag.a(miPushMessageGenerateMessage.getExtra())) {
                            com.xiaomi.push.service.ag.a(this.a, dqVar, bArr);
                            return null;
                        }
                        com.xiaomi.channel.commonutils.logger.b.m3434a("receive a message, msgid=" + dhVarA.m3662a() + ", jobkey=" + strM3662a + ", btn=" + intExtra);
                        String strA = com.xiaomi.push.service.ag.a(miPushMessageGenerateMessage.getExtra(), intExtra);
                        if (z && miPushMessageGenerateMessage.getExtra() != null && !TextUtils.isEmpty(strA)) {
                            Map<String, String> extra = miPushMessageGenerateMessage.getExtra();
                            if (intExtra != 0 && dqVar.m3701a() != null) {
                                ag.a(this.a).p(dqVar.m3701a().c(), intExtra);
                            }
                            if (com.xiaomi.push.service.ag.m3818a(dqVar)) {
                                Intent intentA = a(this.a, dqVar.b, extra, intExtra);
                                intentA.putExtra("eventMessageType", i);
                                intentA.putExtra(WebConst.QueryParam.MESSAGE_ID, str);
                                intentA.putExtra("jobkey", str2);
                                String strC = dhVarA.c();
                                if (!TextUtils.isEmpty(strC)) {
                                    intentA.putExtra("payload", strC);
                                }
                                this.a.startActivity(intentA);
                                n.a(this.a, dqVar);
                            } else {
                                Context context = this.a;
                                Intent intentA2 = a(context, context.getPackageName(), extra, intExtra);
                                if (intentA2 != null) {
                                    if (!strA.equals(bd.c)) {
                                        intentA2.putExtra(PushMessageHelper.KEY_MESSAGE, miPushMessageGenerateMessage);
                                        intentA2.putExtra("eventMessageType", i);
                                        intentA2.putExtra(WebConst.QueryParam.MESSAGE_ID, str);
                                        intentA2.putExtra("jobkey", str2);
                                    }
                                    this.a.startActivity(intentA2);
                                    n.a(this.a, dqVar);
                                    com.xiaomi.channel.commonutils.logger.b.m3434a("start activity succ");
                                    strA.equals(bd.c);
                                }
                            }
                            return null;
                        }
                        miPushMessage = miPushMessageGenerateMessage;
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.m3434a("drop a duplicate message, key=" + strM3662a);
                    }
                    if (dqVar.m3701a() == null && !z) {
                        h(dxVar, dqVar);
                    }
                    return miPushMessage;
                case 2:
                    dv dvVar = (dv) efVarA;
                    String str3 = a.m3457a(this.a).d;
                    if (TextUtils.isEmpty(str3) || !TextUtils.equals(str3, dvVar.m3730a())) {
                        com.xiaomi.channel.commonutils.logger.b.m3434a("bad Registration result:");
                        return null;
                    }
                    long jA = ag.a(this.a).a();
                    if (jA > 0 && SystemClock.elapsedRealtime() - jA > PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
                        com.xiaomi.channel.commonutils.logger.b.m3434a("The received registration result has expired.");
                        aw.a(this.a).a(this.a.getPackageName(), av.a(i), str, com.tencent.connect.common.Constants.VIA_REPORT_TYPE_CHAT_VIDEO);
                        return null;
                    }
                    a.m3457a(this.a).d = null;
                    if (dvVar.f143a == 0) {
                        a.m3457a(this.a).b(dvVar.e, dvVar.f, dvVar.l);
                        FCMPushHelper.persistIfXmsfSupDecrypt(this.a);
                    }
                    if (!TextUtils.isEmpty(dvVar.e)) {
                        arrayList3 = new ArrayList();
                        arrayList3.add(dvVar.e);
                    }
                    MiPushCommandMessage miPushCommandMessageGenerateCommandMessage = PushMessageHelper.generateCommandMessage(bg.COMMAND_REGISTER.f48a, arrayList3, dvVar.f143a, dvVar.d, null);
                    ag.a(this.a).d();
                    return miPushCommandMessageGenerateCommandMessage;
                case 3:
                    if (!dqVar.m3709b()) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                    if (((eb) efVarA).a == 0) {
                        a.m3457a(this.a).m3459a();
                        MiPushClient.clearExtras(this.a);
                    }
                    PushMessageHandler.a();
                    return miPushMessage;
                case 4:
                    dz dzVar = (dz) efVarA;
                    if (dzVar.a == 0) {
                        MiPushClient.addTopic(this.a, dzVar.b());
                    }
                    if (!TextUtils.isEmpty(dzVar.b())) {
                        arrayList2 = new ArrayList();
                        arrayList2.add(dzVar.b());
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("resp-cmd:");
                    bg bgVar = bg.COMMAND_SUBSCRIBE_TOPIC;
                    sb.append(bgVar);
                    sb.append(", ");
                    sb.append(dzVar.a());
                    com.xiaomi.channel.commonutils.logger.b.e(sb.toString());
                    return PushMessageHelper.generateCommandMessage(bgVar.f48a, arrayList2, dzVar.a, dzVar.d, dzVar.c());
                case 5:
                    ed edVar = (ed) efVarA;
                    if (edVar.a == 0) {
                        MiPushClient.removeTopic(this.a, edVar.b());
                    }
                    if (!TextUtils.isEmpty(edVar.b())) {
                        arrayList = new ArrayList();
                        arrayList.add(edVar.b());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("resp-cmd:");
                    bg bgVar2 = bg.COMMAND_UNSUBSCRIBE_TOPIC;
                    sb2.append(bgVar2);
                    sb2.append(", ");
                    sb2.append(edVar.a());
                    com.xiaomi.channel.commonutils.logger.b.e(sb2.toString());
                    return PushMessageHelper.generateCommandMessage(bgVar2.f48a, arrayList, edVar.a, edVar.d, edVar.c());
                case 6:
                    dp dpVar = (dp) efVarA;
                    String strB = dpVar.b();
                    List<String> listM3695a = dpVar.m3695a();
                    if (dpVar.a == 0) {
                        if (TextUtils.equals(strB, bg.COMMAND_SET_ACCEPT_TIME.f48a) && listM3695a != null && listM3695a.size() > 1) {
                            MiPushClient.addAcceptTime(this.a, listM3695a.get(0), listM3695a.get(1));
                            if ("00:00".equals(listM3695a.get(0)) && "00:00".equals(listM3695a.get(1))) {
                                a.m3457a(this.a).a(true);
                            } else {
                                a.m3457a(this.a).a(false);
                            }
                            listM3695a = a(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), listM3695a);
                        } else if (TextUtils.equals(strB, bg.COMMAND_SET_ALIAS.f48a) && listM3695a != null && listM3695a.size() > 0) {
                            MiPushClient.addAlias(this.a, listM3695a.get(0));
                        } else if (TextUtils.equals(strB, bg.COMMAND_UNSET_ALIAS.f48a) && listM3695a != null && listM3695a.size() > 0) {
                            MiPushClient.removeAlias(this.a, listM3695a.get(0));
                        } else if (TextUtils.equals(strB, bg.COMMAND_SET_ACCOUNT.f48a) && listM3695a != null && listM3695a.size() > 0) {
                            MiPushClient.addAccount(this.a, listM3695a.get(0));
                        } else if (TextUtils.equals(strB, bg.COMMAND_UNSET_ACCOUNT.f48a) && listM3695a != null && listM3695a.size() > 0) {
                            MiPushClient.removeAccount(this.a, listM3695a.get(0));
                        } else if (TextUtils.equals(strB, bg.COMMAND_CHK_VDEVID.f48a)) {
                            return null;
                        }
                    }
                    com.xiaomi.channel.commonutils.logger.b.e("resp-cmd:" + strB + ", " + dpVar.a());
                    return PushMessageHelper.generateCommandMessage(strB, listM3695a, dpVar.a, dpVar.d, dpVar.c());
                case 7:
                    if (efVarA instanceof dm) {
                        dm dmVar = (dm) efVarA;
                        String strA2 = dmVar.a();
                        com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + dmVar.b() + ", code:" + dmVar.a + ", " + strA2);
                        if (df.DisablePushMessage.f77a.equalsIgnoreCase(dmVar.d)) {
                            if (dmVar.a == 0) {
                                synchronized (x.class) {
                                    if (x.a(this.a).m3485a(strA2)) {
                                        x.a(this.a).c(strA2);
                                        x xVarA = x.a(this.a);
                                        am amVar = am.DISABLE_PUSH;
                                        if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(xVarA.a(amVar))) {
                                            x.a(this.a).a(amVar, "synced");
                                            MiPushClient.clearNotification(this.a);
                                            MiPushClient.clearLocalNotificationType(this.a);
                                            PushMessageHandler.a();
                                            ag.a(this.a).b();
                                        }
                                    }
                                }
                            } else if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a).a(am.DISABLE_PUSH))) {
                                synchronized (x.class) {
                                    if (x.a(this.a).m3485a(strA2)) {
                                        if (x.a(this.a).a(strA2) < 10) {
                                            x.a(this.a).b(strA2);
                                            ag.a(this.a).a(true, strA2);
                                        } else {
                                            x.a(this.a).c(strA2);
                                        }
                                    }
                                }
                            } else {
                                x.a(this.a).c(strA2);
                            }
                        } else if (df.EnablePushMessage.f77a.equalsIgnoreCase(dmVar.d)) {
                            if (dmVar.a == 0) {
                                synchronized (x.class) {
                                    if (x.a(this.a).m3485a(strA2)) {
                                        x.a(this.a).c(strA2);
                                        x xVarA2 = x.a(this.a);
                                        am amVar2 = am.ENABLE_PUSH;
                                        if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(xVarA2.a(amVar2))) {
                                            x.a(this.a).a(amVar2, "synced");
                                        }
                                    }
                                }
                            } else if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a).a(am.ENABLE_PUSH))) {
                                synchronized (x.class) {
                                    if (x.a(this.a).m3485a(strA2)) {
                                        if (x.a(this.a).a(strA2) < 10) {
                                            x.a(this.a).b(strA2);
                                            ag.a(this.a).a(false, strA2);
                                        } else {
                                            x.a(this.a).c(strA2);
                                        }
                                    }
                                }
                            } else {
                                x.a(this.a).c(strA2);
                            }
                        } else if (df.ThirdPartyRegUpdate.f77a.equalsIgnoreCase(dmVar.d)) {
                            e(dmVar);
                        }
                        break;
                    } else if (efVarA instanceof dt) {
                        dt dtVar = (dt) efVarA;
                        if ("registration id expired".equalsIgnoreCase(dtVar.d)) {
                            List<String> allAlias = MiPushClient.getAllAlias(this.a);
                            List<String> allTopic = MiPushClient.getAllTopic(this.a);
                            List<String> allUserAccount = MiPushClient.getAllUserAccount(this.a);
                            String acceptTime = MiPushClient.getAcceptTime(this.a);
                            com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + dtVar.d + ", " + dtVar.m3716a());
                            MiPushClient.reInitialize(this.a, dj.RegIdExpired);
                            for (String str4 : allAlias) {
                                MiPushClient.removeAlias(this.a, str4);
                                MiPushClient.setAlias(this.a, str4, null);
                            }
                            for (String str5 : allTopic) {
                                MiPushClient.removeTopic(this.a, str5);
                                MiPushClient.subscribe(this.a, str5, null);
                            }
                            for (String str6 : allUserAccount) {
                                MiPushClient.removeAccount(this.a, str6);
                                MiPushClient.setUserAccount(this.a, str6, null);
                            }
                            String[] strArrSplit = acceptTime.split(",");
                            if (strArrSplit.length == 2) {
                                MiPushClient.removeAcceptTime(this.a);
                                MiPushClient.addAcceptTime(this.a, strArrSplit[0], strArrSplit[1]);
                            }
                        } else if (!df.ClientInfoUpdateOk.f77a.equalsIgnoreCase(dtVar.d)) {
                            try {
                                if (df.NormalClientConfigUpdate.f77a.equalsIgnoreCase(dtVar.d)) {
                                    ds dsVar = new ds();
                                    ee.a(dsVar, dtVar.m3722a());
                                    au.a(at.a(this.a), dsVar);
                                } else if (df.CustomClientConfigUpdate.f77a.equalsIgnoreCase(dtVar.d)) {
                                    dr drVar = new dr();
                                    ee.a(drVar, dtVar.m3722a());
                                    au.a(at.a(this.a), drVar);
                                } else if (df.SyncInfoResult.f77a.equalsIgnoreCase(dtVar.d)) {
                                    an.a(this.a, dtVar);
                                } else if (df.CancelPushMessage.f77a.equals(dtVar.d)) {
                                    com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + dtVar.d + ", " + dtVar.m3716a());
                                    if (dtVar.m3717a() != null) {
                                        int i2 = -2;
                                        if (dtVar.m3717a().containsKey(bd.N)) {
                                            String str7 = dtVar.m3717a().get(bd.N);
                                            if (!TextUtils.isEmpty(str7)) {
                                                try {
                                                    i2 = Integer.parseInt(str7);
                                                } catch (NumberFormatException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                        if (i2 >= -1) {
                                            MiPushClient.clearNotification(this.a, i2);
                                        } else {
                                            MiPushClient.clearNotification(this.a, dtVar.m3717a().containsKey(bd.L) ? dtVar.m3717a().get(bd.L) : "", dtVar.m3717a().containsKey(bd.M) ? dtVar.m3717a().get(bd.M) : "");
                                        }
                                    }
                                    g(dtVar);
                                    break;
                                } else {
                                    try {
                                        if (df.HybridRegisterResult.f77a.equals(dtVar.d)) {
                                            dv dvVar2 = new dv();
                                            ee.a(dvVar2, dtVar.m3722a());
                                            MiPushClient4Hybrid.onReceiveRegisterResult(this.a, dvVar2);
                                        } else if (df.HybridUnregisterResult.f77a.equals(dtVar.d)) {
                                            eb ebVar = new eb();
                                            ee.a(ebVar, dtVar.m3722a());
                                            MiPushClient4Hybrid.onReceiveUnregisterResult(this.a, ebVar);
                                        } else if (com.xiaomi.push.service.i.a(dtVar)) {
                                            com.xiaomi.channel.commonutils.logger.b.b("receive notification handle by cpra");
                                        }
                                    } catch (ej e2) {
                                        com.xiaomi.channel.commonutils.logger.b.a(e2);
                                    }
                                }
                                break;
                            } catch (ej unused) {
                            }
                        } else if (dtVar.m3717a() != null && dtVar.m3717a().containsKey("app_version")) {
                            a.m3457a(this.a).m3460a(dtVar.m3717a().get("app_version"));
                        }
                    }
                    return miPushMessage;
                default:
                    return miPushMessage;
            }
        } catch (o e3) {
            com.xiaomi.channel.commonutils.logger.b.a(e3);
            f(dqVar);
            n.c(this.a, dqVar, z);
            return null;
        } catch (ej e4) {
            com.xiaomi.channel.commonutils.logger.b.a(e4);
            com.xiaomi.channel.commonutils.logger.b.d("receive a message which action string is not valid. is the reg expired?");
            n.c(this.a, dqVar, z);
            return null;
        }
    }

    private PushMessageHandler.a c(dq dqVar, byte[] bArr) {
        String str;
        String str2 = null;
        try {
            ef efVarA = aa.a(this.a, dqVar);
            if (efVarA == null) {
                com.xiaomi.channel.commonutils.logger.b.d("message arrived: receiving an un-recognized message. " + dqVar.a);
                return null;
            }
            cz czVarA = dqVar.a();
            com.xiaomi.channel.commonutils.logger.b.m3434a("message arrived: processing an arrived message, action=" + czVarA);
            if (i.a[czVarA.ordinal()] != 1) {
                return null;
            }
            if (dqVar.m3709b()) {
                dx dxVar = (dx) efVarA;
                dh dhVarA = dxVar.a();
                if (dhVarA != null) {
                    di diVar = dqVar.f120a;
                    if (diVar != null && diVar.m3671a() != null) {
                        str2 = dqVar.f120a.f90a.get("jobkey");
                    }
                    MiPushMessage miPushMessageGenerateMessage = PushMessageHelper.generateMessage(dxVar, dqVar.m3701a(), false);
                    miPushMessageGenerateMessage.setArrivedMessage(true);
                    com.xiaomi.channel.commonutils.logger.b.m3434a("message arrived: receive a message, msgid=" + dhVarA.m3662a() + ", jobkey=" + str2);
                    return miPushMessageGenerateMessage;
                }
                str = "message arrived: receive an empty message without push content, drop it";
            } else {
                str = "message arrived: receiving an un-encrypt message(SendMessage).";
            }
        } catch (o e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            str = "message arrived: receive a message but decrypt failed. report when click.";
        } catch (ej e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
            str = "message arrived: receive a message which action string is not valid. is the reg expired?";
        }
        com.xiaomi.channel.commonutils.logger.b.d(str);
        return null;
    }

    private void d() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("mipush_extra", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0L)) > BloodPressureCorrectViewModel.NEED_RETURN_TIME) {
            MiPushClient.reInitialize(this.a, dj.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, jCurrentTimeMillis).commit();
        }
    }

    private void e(dm dmVar) {
        Context context;
        c cVar;
        com.xiaomi.channel.commonutils.logger.b.c("ASSEMBLE_PUSH : " + dmVar.toString());
        String strA = dmVar.a();
        Map<String, String> mapM3685a = dmVar.m3685a();
        if (mapM3685a != null) {
            String str = mapM3685a.get(Constants.ASSEMBLE_PUSH_REG_INFO);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("brand:" + y.FCM.name())) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : receive fcm token sync ack");
                context = this.a;
                cVar = c.ASSEMBLE_PUSH_FCM;
            } else {
                if (str.contains("brand:" + y.HUAWEI.name())) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : receive hw token sync ack");
                    context = this.a;
                    cVar = c.ASSEMBLE_PUSH_HUAWEI;
                } else {
                    if (str.contains("brand:" + y.OPPO.name())) {
                        com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : receive COS token sync ack");
                        context = this.a;
                        cVar = c.ASSEMBLE_PUSH_COS;
                    } else {
                        if (!str.contains("brand:" + y.VIVO.name())) {
                            return;
                        }
                        com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                        context = this.a;
                        cVar = c.ASSEMBLE_PUSH_FTOS;
                    }
                }
            }
            g.b(context, cVar, str);
            i(strA, dmVar.a, cVar);
        }
    }

    private void f(dq dqVar) {
        com.xiaomi.channel.commonutils.logger.b.m3434a("receive a message but decrypt failed. report now.");
        dt dtVar = new dt(dqVar.m3701a().f89a, false);
        dtVar.c(df.DecryptMessageFail.f77a);
        dtVar.b(dqVar.m3702a());
        dtVar.d(dqVar.b);
        HashMap map = new HashMap();
        dtVar.f129a = map;
        map.put("regid", MiPushClient.getRegId(this.a));
        ag.a(this.a).a(dtVar, cz.Notification, false, null);
    }

    private void g(dt dtVar) {
        dm dmVar = new dm();
        dmVar.c(df.CancelPushMessageACK.f77a);
        dmVar.a(dtVar.m3716a());
        dmVar.a(dtVar.a());
        dmVar.b(dtVar.b());
        dmVar.e(dtVar.c());
        dmVar.a(0L);
        dmVar.d("success clear push message.");
        ag.a(this.a).a(dmVar, cz.Notification, false, true, null, false, this.a.getPackageName(), a.m3457a(this.a).m3458a(), false);
    }

    private void h(dx dxVar, dq dqVar) {
        di diVarM3701a = dqVar.m3701a();
        if (diVarM3701a != null) {
            diVarM3701a = bj.a(diVarM3701a.m3669a());
        }
        dl dlVar = new dl();
        dlVar.b(dxVar.b());
        dlVar.a(dxVar.m3738a());
        dlVar.a(dxVar.a().a());
        if (!TextUtils.isEmpty(dxVar.c())) {
            dlVar.c(dxVar.c());
        }
        if (!TextUtils.isEmpty(dxVar.d())) {
            dlVar.d(dxVar.d());
        }
        dlVar.a(ee.a(this.a, dqVar));
        ag.a(this.a).a(dlVar, cz.AckMessage, diVarM3701a);
    }

    private void i(String str, long j, c cVar) {
        am amVarA = j.a(cVar);
        if (amVarA == null) {
            return;
        }
        if (j == 0) {
            synchronized (x.class) {
                if (x.a(this.a).m3485a(str)) {
                    x.a(this.a).c(str);
                    if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a).a(amVarA))) {
                        x.a(this.a).a(amVarA, "synced");
                    }
                }
            }
            return;
        }
        if (!SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a).a(amVarA))) {
            x.a(this.a).c(str);
            return;
        }
        synchronized (x.class) {
            if (x.a(this.a).m3485a(str)) {
                if (x.a(this.a).a(str) < 10) {
                    x.a(this.a).b(str);
                    ag.a(this.a).a(str, amVarA, cVar);
                } else {
                    x.a(this.a).c(str);
                }
            }
        }
    }

    private static boolean j(Context context, String str) {
        synchronized (d) {
            a.m3457a(context);
            SharedPreferences sharedPreferencesA = a.a(context);
            if (c == null) {
                String[] strArrSplit = sharedPreferencesA.getString("pref_msg_ids", "").split(",");
                c = new LinkedList();
                for (String str2 : strArrSplit) {
                    c.add(str2);
                }
            }
            if (c.contains(str)) {
                return true;
            }
            c.add(str);
            if (c.size() > 25) {
                c.poll();
            }
            String strA = ad.a(c, ",");
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("pref_msg_ids", strA);
            com.xiaomi.channel.commonutils.android.i.a(editorEdit);
            return false;
        }
    }

    private boolean k(dq dqVar) {
        Map<String, String> mapM3671a = dqVar.m3701a() == null ? null : dqVar.m3701a().m3671a();
        if (mapM3671a == null) {
            return false;
        }
        String str = mapM3671a.get(Constants.EXTRA_KEY_PUSH_SERVER_ACTION);
        return TextUtils.equals(str, Constants.EXTRA_VALUE_HYBRID_MESSAGE) || TextUtils.equals(str, Constants.EXTRA_VALUE_PLATFORM_MESSAGE);
    }

    private void l(dq dqVar) {
        di diVarM3701a = dqVar.m3701a();
        if (diVarM3701a != null) {
            diVarM3701a = bj.a(diVarM3701a.m3669a());
        }
        dl dlVar = new dl();
        dlVar.b(dqVar.m3702a());
        dlVar.a(diVarM3701a.m3670a());
        dlVar.a(diVarM3701a.m3668a());
        if (!TextUtils.isEmpty(diVarM3701a.m3675b())) {
            dlVar.c(diVarM3701a.m3675b());
        }
        dlVar.a(ee.a(this.a, dqVar));
        ag.a(this.a).a(dlVar, cz.AckMessage, false, diVarM3701a);
    }

    public PushMessageHandler.a a(Intent intent) {
        String str;
        String str2;
        String str3;
        String action = intent.getAction();
        com.xiaomi.channel.commonutils.logger.b.m3434a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra(WebConst.QueryParam.MESSAGE_ID);
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if (!"com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            if ("com.xiaomi.mipush.ERROR".equals(action)) {
                MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
                dq dqVar = new dq();
                try {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
                    if (byteArrayExtra != null) {
                        ee.a(dqVar, byteArrayExtra);
                    }
                } catch (ej unused) {
                }
                miPushCommandMessage.setCommand(String.valueOf(dqVar.a()));
                miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
                miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
                com.xiaomi.channel.commonutils.logger.b.d("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
                return miPushCommandMessage;
            }
            if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra2 == null) {
                    str2 = "message arrived: receiving an empty message, drop";
                    com.xiaomi.channel.commonutils.logger.b.d(str2);
                    return null;
                }
                dq dqVar2 = new dq();
                try {
                    ee.a(dqVar2, byteArrayExtra2);
                    a aVarM3457a = a.m3457a(this.a);
                    if (com.xiaomi.push.service.ag.m3818a(dqVar2)) {
                        str = "message arrived: receive ignore reg message, ignore!";
                    } else if (!aVarM3457a.m3465c()) {
                        str = "message arrived: receive message without registration. need unregister or re-register!";
                    } else {
                        if (!aVarM3457a.m3465c() || !aVarM3457a.m3468f()) {
                            return c(dqVar2, byteArrayExtra2);
                        }
                        str = "message arrived: app info is invalidated";
                    }
                    com.xiaomi.channel.commonutils.logger.b.d(str);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.d("fail to deal with arrived message. " + e);
                }
            }
            return null;
        }
        byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
        if (byteArrayExtra3 == null) {
            str2 = "receiving an empty message, drop";
            com.xiaomi.channel.commonutils.logger.b.d(str2);
            return null;
        }
        dq dqVar3 = new dq();
        try {
            ee.a(dqVar3, byteArrayExtra3);
            a aVarM3457a2 = a.m3457a(this.a);
            di diVarM3701a = dqVar3.m3701a();
            cz czVarA = dqVar3.a();
            cz czVar = cz.SendMessage;
            if (czVarA == czVar && diVarM3701a != null && !aVarM3457a2.m3467e() && !booleanExtra) {
                diVarM3701a.a("mrt", stringExtra);
                diVarM3701a.a("mat", Long.toString(System.currentTimeMillis()));
                if (k(dqVar3)) {
                    com.xiaomi.channel.commonutils.logger.b.b("this is a mina's message, ack later");
                    diVarM3701a.a(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS, String.valueOf(diVarM3701a.m3668a()));
                    diVarM3701a.a(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS, String.valueOf((int) ee.a(this.a, dqVar3)));
                } else {
                    l(dqVar3);
                }
            }
            if (dqVar3.a() == czVar && !dqVar3.m3709b()) {
                if (com.xiaomi.push.service.ag.m3818a(dqVar3)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = dqVar3.b();
                    objArr[1] = diVarM3701a != null ? diVarM3701a.m3670a() : "";
                    str3 = String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", objArr);
                } else {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = dqVar3.b();
                    objArr2[1] = diVarM3701a != null ? diVarM3701a.m3670a() : "";
                    str3 = String.format("drop an un-encrypted messages. %1$s, %2$s", objArr2);
                }
                com.xiaomi.channel.commonutils.logger.b.m3434a(str3);
                n.a(this.a, dqVar3, booleanExtra);
                return null;
            }
            if (dqVar3.a() == czVar && dqVar3.m3709b() && com.xiaomi.push.service.ag.m3818a(dqVar3) && (!booleanExtra || diVarM3701a == null || diVarM3701a.m3671a() == null || !diVarM3701a.m3671a().containsKey("notify_effect"))) {
                Object[] objArr3 = new Object[2];
                objArr3[0] = dqVar3.b();
                objArr3[1] = diVarM3701a != null ? diVarM3701a.m3670a() : "";
                com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", objArr3));
                n.b(this.a, dqVar3, booleanExtra);
                return null;
            }
            if (aVarM3457a2.m3465c() || dqVar3.a == cz.Registration) {
                if (!aVarM3457a2.m3465c() || !aVarM3457a2.m3468f()) {
                    return b(dqVar3, booleanExtra, byteArrayExtra3, stringExtra2, intExtra, intent);
                }
                if (dqVar3.a != cz.UnRegistration) {
                    n.e(this.a, dqVar3, booleanExtra);
                    MiPushClient.unregisterPush(this.a);
                } else if (dqVar3.m3709b()) {
                    aVarM3457a2.m3459a();
                    MiPushClient.clearExtras(this.a);
                    PushMessageHandler.a();
                } else {
                    com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt unregistration message");
                }
            } else {
                if (com.xiaomi.push.service.ag.m3818a(dqVar3)) {
                    return b(dqVar3, booleanExtra, byteArrayExtra3, stringExtra2, intExtra, intent);
                }
                n.e(this.a, dqVar3, booleanExtra);
                boolean zM3466d = aVarM3457a2.m3466d();
                com.xiaomi.channel.commonutils.logger.b.d("receive message without registration. need re-register!registered?" + zM3466d);
                if (zM3466d) {
                    d();
                }
            }
            return null;
        } catch (ej | Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
        }
    }

    public List<String> a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long j = ((((Long.parseLong(list.get(0).split(":")[0]) * 60) + Long.parseLong(list.get(0).split(":")[1])) - rawOffset) + 1440) % 1440;
        long j2 = ((((Long.parseLong(list.get(1).split(":")[0]) * 60) + Long.parseLong(list.get(1).split(":")[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j / 60), Long.valueOf(j % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        return arrayList;
    }
}

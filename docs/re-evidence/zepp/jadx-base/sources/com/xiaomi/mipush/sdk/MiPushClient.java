package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.channel.commonutils.android.Region;
import com.xiaomi.hm.health.sleep.eventbus.SlpHMDeviceSyncDataEventObserver;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.Cdo;
import com.xiaomi.push.ad;
import com.xiaomi.push.bg;
import com.xiaomi.push.cz;
import com.xiaomi.push.df;
import com.xiaomi.push.di;
import com.xiaomi.push.dj;
import com.xiaomi.push.dt;
import com.xiaomi.push.du;
import com.xiaomi.push.dy;
import com.xiaomi.push.ea;
import com.xiaomi.push.ec;
import com.xiaomi.push.service.at;
import com.xiaomi.push.service.aw;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes22.dex */
public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    private static Context sContext;
    private static long sCurMsgId = System.currentTimeMillis();
    public static volatile Region sUserSetRegion = null;

    public static class CodeResult {
        private long a = -1;

        public long getResultCode() {
            return this.a;
        }

        public void setResultCode(long j) {
            this.a = j;
        }
    }

    public interface ICallbackResult<R> {
        void onResult(R r);
    }

    @Deprecated
    public static abstract class MiPushClientCallback {
        private String a;

        public String getCategory() {
            return this.a;
        }

        public void onCommandResult(String str, long j, String str2, List<String> list) {
        }

        public void onInitializeResult(long j, String str, String str2) {
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z) {
        }

        public void onSubscribeResult(long j, String str, String str2) {
        }

        public void onUnsubscribeResult(long j, String str, String str2) {
        }

        public void setCategory(String str) {
            this.a = str;
        }
    }

    public static class TokenResult {
        private String a = null;
        private long b = -1;

        public long getResultCode() {
            return this.b;
        }

        public String getToken() {
            return this.a;
        }

        public void setResultCode(long j) {
            this.b = j;
        }

        public void setToken(String str) {
            this.a = str;
        }
    }

    public interface UPSRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    public interface UPSTurnCallBack extends ICallbackResult<CodeResult> {
    }

    public interface UPSUnRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        return TextUtils.equals(getAcceptTime(context), str + "," + str2);
    }

    public static long accountSetTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("account_" + str, -1L);
    }

    public static synchronized void addAcceptTime(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString(Constants.EXTRA_KEY_ACCEPT_TIME, str + "," + str2);
        com.xiaomi.channel.commonutils.android.i.a(editorEdit);
    }

    public static synchronized void addAccount(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("account_" + str, System.currentTimeMillis()).commit();
    }

    public static synchronized void addAlias(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("alias_" + str, System.currentTimeMillis()).commit();
    }

    private static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putLong("last_pull_notification", System.currentTimeMillis());
        com.xiaomi.channel.commonutils.android.i.a(editorEdit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putLong("last_reg_request", System.currentTimeMillis());
        com.xiaomi.channel.commonutils.android.i.a(editorEdit);
    }

    public static synchronized void addTopic(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("topic_" + str, System.currentTimeMillis()).commit();
    }

    public static long aliasSetTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("alias_" + str, -1L);
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("param " + str + " is not nullable");
    }

    private static boolean checkRegionNotMIUIPhone(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = sContext.getSharedPreferences("mipush_region", 0);
        String string = sharedPreferences.getString("user_region", "");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (TextUtils.isEmpty(string)) {
            editorEdit.putString("user_region", str);
            String appRegion = getAppRegion(context);
            if (TextUtils.isEmpty(appRegion) || Region.Europe.name().equals(appRegion) || (!appRegion.equals(str) && (!"Singapore".equals(appRegion) || !Region.Global.name().equals(str)))) {
                editorEdit.putBoolean("req_hosts", true);
                z = true;
            }
        } else if (!str.equals(string)) {
            editorEdit.putString("user_region", str);
            editorEdit.putBoolean("req_hosts", true);
            z = true;
        }
        editorEdit.apply();
        com.xiaomi.channel.commonutils.logger.b.m3434a("current register region: " + str);
        return z;
    }

    public static void clearExtras(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    private static void clearExtrasForInitialize(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        Iterator<String> it2 = getAllAlias(context).iterator();
        while (it2.hasNext()) {
            editorEdit.remove("alias_" + it2.next());
        }
        Iterator<String> it3 = getAllUserAccount(context).iterator();
        while (it3.hasNext()) {
            editorEdit.remove("account_" + it3.next());
        }
        Iterator<String> it4 = getAllTopic(context).iterator();
        while (it4.hasNext()) {
            editorEdit.remove("topic_" + it4.next());
        }
        editorEdit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
        editorEdit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        ag.a(context).e();
    }

    public static void clearNotification(Context context) {
        ag.a(context).a(-1);
    }

    public static void clearNotification(Context context, int i) {
        ag.a(context).a(i);
    }

    public static void clearNotification(Context context, String str, String str2) {
        ag.a(context).a(str, str2);
    }

    public static void disablePush(Context context) {
        ag.a(context).a(true);
    }

    public static void enablePush(Context context) {
        ag.a(context).a(false);
    }

    public static String getAcceptTime(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString(Constants.EXTRA_KEY_ACCEPT_TIME, "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (a.m3457a(context).m3465c()) {
            return a.m3457a(context).f();
        }
        return null;
    }

    public static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, DbUtils.Const.Table.CONTEXT);
        return d.a(context).b(c.ASSEMBLE_PUSH_FCM);
    }

    public static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, DbUtils.Const.Table.CONTEXT);
        return d.a(context).b(c.ASSEMBLE_PUSH_HUAWEI);
    }

    public static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, DbUtils.Const.Table.CONTEXT);
        return d.a(context).b(c.ASSEMBLE_PUSH_COS);
    }

    public static boolean getOpenVIVOPush(Context context) {
        return d.a(context).b(c.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (a.m3457a(context).m3465c()) {
            return a.m3457a(context).c();
        }
        return null;
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback, String str3, ICallbackResult iCallbackResult, String str4) {
        boolean zCheckRegionNotMIUIPhone;
        try {
            com.xiaomi.channel.commonutils.logger.b.a(context.getApplicationContext());
            com.xiaomi.channel.commonutils.logger.b.e("sdk_version = 5_0_6-G");
            if (miPushClientCallback != null) {
                PushMessageHandler.a(miPushClientCallback);
            }
            if (iCallbackResult != null) {
                PushMessageHandler.a(iCallbackResult);
            }
            if (com.xiaomi.channel.commonutils.android.k.m3433a(sContext)) {
                p.a(sContext);
            }
            if (com.xiaomi.channel.commonutils.android.f.m3426a()) {
                zCheckRegionNotMIUIPhone = false;
            } else {
                if (TextUtils.isEmpty(str4)) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("please set region before registering");
                    return;
                }
                zCheckRegionNotMIUIPhone = checkRegionNotMIUIPhone(sContext, str4);
            }
            boolean z = a.m3457a(sContext).a() != Constants.a();
            if (!z && !shouldSendRegRequest(sContext)) {
                ag.a(sContext).m3471a();
                com.xiaomi.channel.commonutils.logger.b.m3434a("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z || !a.m3457a(sContext).a(str, str2) || a.m3457a(sContext).m3468f() || zCheckRegionNotMIUIPhone) {
                String strA = ad.a(6);
                a.m3457a(sContext).m3459a();
                a.m3457a(sContext).a(Constants.a());
                a.m3457a(sContext).a(str, str2, strA);
                clearExtras(sContext);
                clearNotification(context);
                du duVar = new du();
                duVar.a(aw.b());
                duVar.b(str);
                duVar.e(str2);
                duVar.d(sContext.getPackageName());
                duVar.f(strA);
                Context context2 = sContext;
                duVar.c(com.xiaomi.channel.commonutils.android.a.m3417a(context2, context2.getPackageName()));
                Context context3 = sContext;
                duVar.b(com.xiaomi.channel.commonutils.android.a.a(context3, context3.getPackageName()));
                duVar.h(BuildConfig.VERSION_NAME);
                duVar.a(BuildConfig.VERSION_CODE);
                duVar.a(dj.Init);
                if (!TextUtils.isEmpty(str3)) {
                    duVar.g(str3);
                }
                int iA = com.xiaomi.channel.commonutils.android.c.a();
                if (iA >= 0) {
                    duVar.c(iA);
                }
                ag.a(sContext).a(duVar, z, zCheckRegionNotMIUIPhone);
                sContext.getSharedPreferences("mipush_extra", 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == PushMessageHelper.getPushMode(sContext)) {
                    checkNotNull(miPushClientCallback, "callback");
                    miPushClientCallback.onInitializeResult(0L, null, a.m3457a(sContext).c());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a.m3457a(sContext).c());
                    PushMessageHelper.sendCommandMessageBroadcast(sContext, PushMessageHelper.generateCommandMessage(bg.COMMAND_REGISTER.f48a, arrayList, 0L, null, null));
                }
                ag.a(sContext).m3471a();
                if (a.m3457a(sContext).m3461a()) {
                    dt dtVar = new dt();
                    dtVar.b(a.m3457a(sContext).m3458a());
                    dtVar.c(df.ClientInfoUpdate.f77a);
                    dtVar.a(aw.a());
                    HashMap map = new HashMap();
                    dtVar.f129a = map;
                    Context context4 = sContext;
                    map.put("app_version", com.xiaomi.channel.commonutils.android.a.m3417a(context4, context4.getPackageName()));
                    Map<String, String> map2 = dtVar.f129a;
                    Context context5 = sContext;
                    map2.put(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(com.xiaomi.channel.commonutils.android.a.a(context5, context5.getPackageName())));
                    dtVar.f129a.put("push_sdk_vn", BuildConfig.VERSION_NAME);
                    dtVar.f129a.put("push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
                    String strE = a.m3457a(sContext).e();
                    if (!TextUtils.isEmpty(strE)) {
                        dtVar.f129a.put("deviceid", strE);
                    }
                    ag.a(sContext).a(dtVar, cz.Notification, false, null);
                }
                if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                    dt dtVar2 = new dt();
                    dtVar2.b(a.m3457a(sContext).m3458a());
                    dtVar2.c(df.PullOfflineMessage.f77a);
                    dtVar2.a(aw.a());
                    dtVar2.a(false);
                    ag.a(sContext).a(dtVar2, cz.Notification, false, null, false);
                    addPullNotificationTime(sContext);
                }
            }
            addRegRequestTime(sContext);
            scheduleOcVersionCheckJob();
            if (!sContext.getPackageName().equals(PkgNameConstants.XMSF)) {
                if (Logger.getUserLogger() != null) {
                    Logger.setLogger(sContext, Logger.getUserLogger());
                }
                com.xiaomi.channel.commonutils.logger.b.a(2);
            }
            operateSyncAction(context);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a(th);
        }
    }

    private static void operateSyncAction(Context context) {
        if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(sContext).a(am.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(sContext).a(am.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(sContext).a(am.UPLOAD_HUAWEI_TOKEN))) {
            syncAssemblePushToken(sContext);
        }
        if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(sContext).a(am.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(sContext).a(am.UPLOAD_COS_TOKEN))) {
            syncAssembleCOSPushToken(context);
        }
        if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(sContext).a(am.UPLOAD_FTOS_TOKEN))) {
            syncAssembleFTOSPushToken(context);
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    public static void reInitialize(Context context, dj djVar) {
        com.xiaomi.channel.commonutils.logger.b.e("re-register reason: " + djVar);
        String strA = ad.a(6);
        String strM3458a = a.m3457a(context).m3458a();
        String strB = a.m3457a(context).b();
        a.m3457a(context).m3459a();
        clearExtrasForInitialize(context);
        clearNotification(context);
        a.m3457a(context).a(Constants.a());
        a.m3457a(context).a(strM3458a, strB, strA);
        du duVar = new du();
        duVar.a(aw.b());
        duVar.b(strM3458a);
        duVar.e(strB);
        duVar.f(strA);
        duVar.d(context.getPackageName());
        duVar.c(com.xiaomi.channel.commonutils.android.a.m3417a(context, context.getPackageName()));
        duVar.b(com.xiaomi.channel.commonutils.android.a.a(context, context.getPackageName()));
        duVar.h(BuildConfig.VERSION_NAME);
        duVar.a(BuildConfig.VERSION_CODE);
        duVar.a(djVar);
        int iA = com.xiaomi.channel.commonutils.android.c.a();
        if (iA >= 0) {
            duVar.c(iA);
        }
        ag.a(context).a(duVar, false, false);
    }

    @Deprecated
    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            intentFilter.addCategory("android.intent.category.DEFAULT");
            com.xiaomi.channel.commonutils.android.g.a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter);
            com.xiaomi.channel.commonutils.android.g.a(context, NetworkStatusReceiver.class);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("dynamic register network status receiver failed:" + th);
        }
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new PushConfiguration());
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
        registerPush(context, str, str2, pushConfiguration, null, null);
    }

    private static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration, String str3, ICallbackResult iCallbackResult) {
        checkNotNull(context, DbUtils.Const.Table.CONTEXT);
        checkNotNull(str, SDKConstants.PARAM_APP_ID);
        checkNotNull(str2, "appToken");
        if (!com.xiaomi.channel.commonutils.android.f.m3426a()) {
            checkNotNull(sUserSetRegion, "region");
        }
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        com.xiaomi.channel.commonutils.android.k.a(context2);
        if (!NetworkStatusReceiver.a()) {
            registerNetworkReceiver(sContext);
        }
        d.a(sContext).a(pushConfiguration);
        com.xiaomi.push.o.a(context2).a(new e(str, str2, str3, iCallbackResult));
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new PushConfiguration(), str3, null);
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        registerPush(context, str, str2, new PushConfiguration(), null, uPSRegisterCallBack);
    }

    public static synchronized void removeAcceptTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
        com.xiaomi.channel.commonutils.android.i.a(editorEdit);
    }

    public static synchronized void removeAccount(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("account_" + str).commit();
    }

    public static synchronized void removeAlias(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("alias_" + str).commit();
    }

    public static synchronized void removeAllAccounts(Context context) {
        Iterator<String> it2 = getAllUserAccount(context).iterator();
        while (it2.hasNext()) {
            removeAccount(context, it2.next());
        }
    }

    public static synchronized void removeAllAliases(Context context) {
        Iterator<String> it2 = getAllAlias(context).iterator();
        while (it2.hasNext()) {
            removeAlias(context, it2.next());
        }
    }

    public static synchronized void removeAllTopics(Context context) {
        Iterator<String> it2 = getAllTopic(context).iterator();
        while (it2.hasNext()) {
            removeTopic(context, it2.next());
        }
    }

    public static synchronized void removeTopic(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("topic_" + str).commit();
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        if (a.m3457a(context).m3464b()) {
            df dfVar = z ? df.APP_SLEEP : df.APP_WAKEUP;
            dt dtVar = new dt();
            dtVar.b(a.m3457a(context).m3458a());
            dtVar.c(dfVar.f77a);
            dtVar.d(context.getPackageName());
            dtVar.a(aw.a());
            dtVar.a(false);
            ag.a(context).a(dtVar, cz.Notification, false, null, false);
        }
    }

    public static void reportIgnoreRegMessageClicked(Context context, String str, di diVar, String str2, String str3) {
        dt dtVar = new dt();
        if (TextUtils.isEmpty(str3)) {
            com.xiaomi.channel.commonutils.logger.b.d("do not report clicked message");
            return;
        }
        dtVar.b(str3);
        dtVar.c("bar:click");
        dtVar.a(str);
        dtVar.a(false);
        ag.a(context).a(dtVar, cz.Notification, false, true, diVar, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        di diVar = new di();
        diVar.a(miPushMessage.getMessageId());
        diVar.b(miPushMessage.getTopic());
        diVar.d(miPushMessage.getDescription());
        diVar.c(miPushMessage.getTitle());
        diVar.c(miPushMessage.getNotifyId());
        diVar.a(miPushMessage.getNotifyType());
        diVar.b(miPushMessage.getPassThrough());
        diVar.a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), diVar, null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    public static void reportMessageClicked(Context context, String str, di diVar, String str2) {
        dt dtVar = new dt();
        if (TextUtils.isEmpty(str2)) {
            if (!a.m3457a(context).m3464b()) {
                com.xiaomi.channel.commonutils.logger.b.d("do not report clicked message");
                return;
            }
            str2 = a.m3457a(context).m3458a();
        }
        dtVar.b(str2);
        dtVar.c("bar:click");
        dtVar.a(str);
        dtVar.a(false);
        ag.a(context).a(dtVar, cz.Notification, false, diVar);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleOcVersionCheckJob() {
        com.xiaomi.push.o.a(sContext).a(new w(sContext), 86400, 5);
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        if (i < 0 || i >= 24 || i3 < 0 || i3 >= 24 || i2 < 0 || i2 >= 60 || i4 < 0 || i4 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = ((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60;
        long j = ((((long) ((i * 60) + i2)) + rawOffset) + 1440) % 1440;
        long j2 = ((((long) ((i3 * 60) + i4)) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j / 60), Long.valueOf(j % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i), Integer.valueOf(i2)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i4)));
        if (!acceptTimeSet(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context, bg.COMMAND_SET_ACCEPT_TIME.f48a, (ArrayList<String>) arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.a(context, str, bg.COMMAND_SET_ACCEPT_TIME.f48a, 0L, null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(bg.COMMAND_SET_ACCEPT_TIME.f48a, arrayList2, 0L, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, bg.COMMAND_SET_ALIAS.f48a, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (1 == com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        com.xiaomi.mipush.sdk.PushMessageHandler.a(r12, r15, r13, 0, null, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        com.xiaomi.mipush.sdk.PushMessageHelper.sendCommandMessageBroadcast(r12, com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r0.f48a, r6, 0, null, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (1 == com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setCommand(Context context, String str, String str2, String str3) {
        StringBuilder sb;
        String str4;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        bg bgVar = bg.COMMAND_SET_ALIAS;
        if (!bgVar.f48a.equalsIgnoreCase(str) || Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) >= 86400000) {
            if (!bg.COMMAND_UNSET_ALIAS.f48a.equalsIgnoreCase(str) || aliasSetTime(context, str2) >= 0) {
                bgVar = bg.COMMAND_SET_ACCOUNT;
                if (!bgVar.f48a.equalsIgnoreCase(str) || Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) >= 3600000) {
                    if (!bg.COMMAND_UNSET_ACCOUNT.f48a.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
                        setCommand(context, str, (ArrayList<String>) arrayList, str3);
                        return;
                    } else {
                        sb = new StringBuilder();
                        str4 = "Don't cancel account for ";
                    }
                }
            } else {
                sb = new StringBuilder();
                str4 = "Don't cancel alias for ";
            }
            sb.append(str4);
            sb.append(ad.a(arrayList.toString(), 3));
            sb.append(" is unseted");
            com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
        }
    }

    public static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(a.m3457a(context).m3458a())) {
            return;
        }
        Cdo cdo = new Cdo();
        String strA = aw.a();
        cdo.a(strA);
        cdo.b(a.m3457a(context).m3458a());
        cdo.c(str);
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            cdo.m3692a(it2.next());
        }
        cdo.e(str2);
        cdo.d(context.getPackageName());
        com.xiaomi.channel.commonutils.logger.b.e("cmd:" + str + ", " + strA);
        ag.a(context).a(cdo, cz.Command, (di) null);
    }

    public static void setLocalNotificationType(Context context, int i) {
        ag.a(context).b(i & (-1));
    }

    public static void setRegion(Region region) {
        if (com.xiaomi.channel.commonutils.android.f.m3426a()) {
            return;
        }
        sUserSetRegion = region;
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, bg.COMMAND_SET_ACCOUNT.f48a, str, str2);
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1L)) > 300000;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1L)) > 5000;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return ag.a(context).m3472a();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (TextUtils.isEmpty(a.m3457a(context).m3458a()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) <= 86400000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(bg.COMMAND_SUBSCRIBE_TOPIC.f48a, arrayList, 0L, null, null));
            return;
        }
        dy dyVar = new dy();
        String strA = aw.a();
        dyVar.a(strA);
        dyVar.b(a.m3457a(context).m3458a());
        dyVar.c(str);
        dyVar.d(context.getPackageName());
        dyVar.e(str2);
        com.xiaomi.channel.commonutils.logger.b.e("cmd:" + bg.COMMAND_SUBSCRIBE_TOPIC + ", " + strA);
        ag.a(context).a(dyVar, cz.Subscription, (di) null);
    }

    public static void syncAssembleCOSPushToken(Context context) {
        ag.a(context).a((String) null, am.UPLOAD_COS_TOKEN, c.ASSEMBLE_PUSH_COS);
    }

    public static void syncAssembleFCMPushToken(Context context) {
        ag.a(context).a((String) null, am.UPLOAD_FCM_TOKEN, c.ASSEMBLE_PUSH_FCM);
    }

    public static void syncAssembleFTOSPushToken(Context context) {
        ag.a(context).a((String) null, am.UPLOAD_FTOS_TOKEN, c.ASSEMBLE_PUSH_FTOS);
    }

    public static void syncAssemblePushToken(Context context) {
        ag.a(context).a((String) null, am.UPLOAD_HUAWEI_TOKEN, c.ASSEMBLE_PUSH_HUAWEI);
    }

    public static long topicSubscribedTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("topic_" + str, -1L);
    }

    public static void turnOffPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        disablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void turnOnPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        enablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        unregisterPush(context);
        if (uPSUnRegisterCallBack != null) {
            TokenResult tokenResult = new TokenResult();
            tokenResult.setToken(null);
            tokenResult.getToken();
            tokenResult.setResultCode(0L);
            tokenResult.getResultCode();
            uPSUnRegisterCallBack.onResult(tokenResult);
        }
    }

    public static void unregisterPush(Context context) {
        g.c(context);
        at.a(context).a();
        if (a.m3457a(context).m3464b()) {
            ea eaVar = new ea();
            eaVar.a(aw.a());
            eaVar.b(a.m3457a(context).m3458a());
            eaVar.c(a.m3457a(context).c());
            eaVar.e(a.m3457a(context).b());
            eaVar.d(context.getPackageName());
            ag.a(context).a(eaVar);
            PushMessageHandler.a();
            PushMessageHandler.b();
            a.m3457a(context).m3463b();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, bg.COMMAND_UNSET_ALIAS.f48a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, bg.COMMAND_UNSET_ACCOUNT.f48a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (a.m3457a(context).m3464b()) {
            if (topicSubscribedTime(context, str) < 0) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("Don't cancel subscribe for " + str + " is unsubscribed");
                return;
            }
            ec ecVar = new ec();
            String strA = aw.a();
            ecVar.a(strA);
            ecVar.b(a.m3457a(context).m3458a());
            ecVar.c(str);
            ecVar.d(context.getPackageName());
            ecVar.e(str2);
            com.xiaomi.channel.commonutils.logger.b.e("cmd:" + bg.COMMAND_UNSUBSCRIBE_TOPIC + ", " + strA);
            ag.a(context).a(ecVar, cz.UnSubscription, (di) null);
        }
    }
}

package com.huawei.bone.ui.setting;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.media.RemoteController;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.media.MediaBrowserProtocol;
import androidx.media3.common.C;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.framework.common.LimitQueue;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.MusicInfo;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwdevice.phoneprocess.mgr.notification.HwNotificationConstant;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwdevice.phoneprocess.service.HandleIntentService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IMusicChangedCallback;
import com.huawei.hwservicesmgr.IMusicControllerAIDL;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.homewear21.R;
import com.huawei.up.model.UserInfomation;
import defpackage.cgl;
import defpackage.cgp;
import defpackage.cgr;
import defpackage.cgs;
import defpackage.cgt;
import defpackage.cgu;
import defpackage.chb;
import defpackage.chc;
import defpackage.cio;
import defpackage.cis;
import defpackage.cop;
import defpackage.eei;
import defpackage.eeq;
import defpackage.lmq;
import defpackage.lng;
import defpackage.lsb;
import defpackage.lsu;
import defpackage.lsy;
import defpackage.lzk;
import defpackage.mir;
import defpackage.ncp;
import defpackage.ndj;
import defpackage.nzz;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.DeviceUtil;
import health.compact.a.EmuiBuild;
import health.compact.a.EnvironmentInfo;
import health.compact.a.HarmonyBuild;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class NotificationPushListener extends NotificationListenerService implements RemoteController.OnClientUpdateListener {
    private long ab;
    private long ai;
    private RemoteController ao;
    private BroadcastReceiver i;
    private b j;
    private ContentObserver q;
    private lzk u;
    private c z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final chb f5388c = new chb();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Timer f5387b = new Timer("NotificPush");
    private final NotificationContentProviderUtil.NotificationLiveChangerListener al = new NotificationContentProviderUtil.NotificationLiveChangerListener() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.1
        @Override // com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil.NotificationLiveChangerListener
        public void onChanger(boolean z) throws Throwable {
            ReleaseLogUtil.d("Notify_NotificPush", "liveInfo listener onChanger start: ", Boolean.valueOf(z));
            NotificationPushListener notificationPushListener = NotificationPushListener.this;
            notificationPushListener.b((List<String>) notificationPushListener.e());
            NotificationPushListener.this.d(z);
        }
    };
    private final TimerTask g = new TimerTask() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.4
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    };
    private final TimerTask x = new TimerTask() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.3
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    };
    private int ad = 0;
    private int r = 0;
    private int af = 0;
    private int m = 240;
    private final Set<String> n = new HashSet(7);
    private final Set<String> ae = new HashSet(16);
    private final List<String> ah = Arrays.asList("com.facebook.orca", "com.viber.voip", "org.thoughtcrime.securesms", "com.skype.raider");
    private final Set<String> aj = new HashSet(16);
    private final Set<String> s = new HashSet(16);
    private final Set<String> y = new HashSet(16);
    private final Set<String> l = new HashSet(16);
    private final Set<Integer> ag = new HashSet(16);
    private final Map<String, String> h = new HashMap(16);
    private Map<String, a> aa = null;
    private Map<String, Long> k = null;
    private String ak = "";
    private String ap = "";
    private int am = 0;
    private boolean d = true;
    private IMusicChangedCallback an = null;
    private final Map<String, Long> ac = new HashMap(16);
    private final LimitQueue<String> w = new LimitQueue<>(10);
    private final LimitQueue<String> v = new LimitQueue<>(50);
    private final Set<String> o = new HashSet(16);
    private final cgu<String, Long> t = new cgu<>(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5389a = "xxx.xxx.xxx";
    private String as = "";
    private final Handler p = new Handler(Looper.getMainLooper()) { // from class: com.huawei.bone.ui.setting.NotificationPushListener.10
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 10:
                    LogUtil.a("NotificPush", "handleMessage remote control init!");
                    NotificationPushListener.this.r();
                    break;
                case 11:
                    LogUtil.a("NotificPush", "handleMessage remove sms");
                    NotificationPushListener.this.e(message);
                    break;
                case 12:
                    LogUtil.a("NotificPush", "handleMessage remove voip calling");
                    NotificationPushListener.this.a(message);
                    break;
                case 13:
                    LogUtil.a("NotificPush", "handleMessage remove telegramMissCallName");
                    NotificationPushListener.this.as = "";
                    break;
                case 14:
                    LogUtil.a("NotificPush", "handleMessage post line");
                    NotificationPushListener.this.d(message);
                    break;
            }
        }
    };
    private final IMusicControllerAIDL.Stub f = new IMusicControllerAIDL.Stub() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.8
        @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
        public void initMusic() {
            LogUtil.a("NotificPush", "musicInterface initMusic");
            NotificationPushListener.this.p.obtainMessage(10).sendToTarget();
        }

        @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
        public MusicInfo getCurrentMusicInfo() {
            AudioManager audioManager = (AudioManager) BaseApplication.getContext().getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            MusicInfo musicInfo = new MusicInfo();
            if (!NotificationPushListener.this.d) {
                musicInfo.setPlayState(NotificationPushListener.this.am);
                musicInfo.setSingerName(NotificationPushListener.this.ap);
                musicInfo.setSongName(NotificationPushListener.this.ak);
                musicInfo.setMaxVolume(streamMaxVolume);
                musicInfo.setCurrentVolume(streamVolume);
            } else {
                musicInfo.setPlayState(0);
                musicInfo.setSingerName("");
                musicInfo.setSongName("");
                musicInfo.setMaxVolume(0);
                musicInfo.setCurrentVolume(0);
            }
            LogUtil.a("NotificPush", "getCurrentMusicInfo: " + musicInfo.toString());
            return musicInfo;
        }

        @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
        public void controllMusic(int i) {
            LogUtil.a("NotificPush", "musicInterface controllMusic");
            if (NotificationPushListener.this.ao == null || NotificationPushListener.this.d) {
                if (NotificationPushListener.this.d) {
                    AudioManager audioManager = (AudioManager) NotificationPushListener.this.getSystemService("audio");
                    audioManager.dispatchMediaKeyEvent(new KeyEvent(0, i));
                    audioManager.dispatchMediaKeyEvent(new KeyEvent(1, i));
                    return;
                }
                LogUtil.a("NotificPush", "controllMusic is isPlayEnd!!!");
                return;
            }
            NotificationPushListener.this.ao.sendMediaKeyEvent(new KeyEvent(0, i));
            NotificationPushListener.this.ao.sendMediaKeyEvent(new KeyEvent(1, i));
            LogUtil.a("NotificPush", "controllMusic end");
        }

        @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
        public void setCallback(IMusicChangedCallback iMusicChangedCallback) {
            LogUtil.a("NotificPush", "musicInterface setCallback");
            NotificationPushListener.this.an = iMusicChangedCallback;
        }

        @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
        public void remoteListener() {
            LogUtil.a("NotificPush", "musicInterface remoteListener");
            NotificationPushListener.this.u();
        }
    };

    static /* synthetic */ int l(NotificationPushListener notificationPushListener) {
        int i = notificationPushListener.r;
        notificationPushListener.r = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", "SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", false);
        if (z && zB) {
            Intent intent = new Intent(this, (Class<?>) HandleIntentService.class);
            intent.setAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
            Bundle bundle = new Bundle();
            bundle.putString("notificationSwitchChangeType", "notificationLiveSwitchOpen");
            intent.putExtras(bundle);
            ReleaseLogUtil.d("Notify_NotificPush", "live notification switch open to push live app icon");
            try {
                startService(intent);
            } catch (IllegalStateException | SecurityException e2) {
                ReleaseLogUtil.a("Notify_NotificPush", "onNotificationPosted startService: ", ExceptionUtils.c(e2));
                xjt.ab("getLiveAppInfo occur exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof StatusBarNotification)) {
            LogUtil.j("NotificPush", "handLineNotificationPosed object not instanceof StatusBarNotification");
        } else {
            c((StatusBarNotification) obj);
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        LogUtil.a("NotificPush", "onUnbind enter...");
        return super.onUnbind(intent);
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public IBinder onBind(Intent intent) {
        if ("health".equals(intent.getAction())) {
            LogUtil.a("NotificPush", "onBind health !");
            String[] packagesForUid = BaseApplication.getContext().getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid != null) {
                for (String str : packagesForUid) {
                    if ("com.huawei.health".equals(str)) {
                        LogUtil.a("NotificPush", "Enter verifyPackageNameByUid true");
                        return this.f;
                    }
                }
            }
            return super.onBind(intent);
        }
        ReleaseLogUtil.d("Notify_NotificPush", "onBind super");
        return super.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zK = k();
        cgl.e("authorized", System.currentTimeMillis(), jCurrentTimeMillis);
        ReleaseLogUtil.d("Notify_NotificPush", "onCreate: The master switch of com.huawei.health is turn on? ", Boolean.valueOf(zK));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zB = DeviceUtil.b();
        cgl.e("deviceDbInfo", System.currentTimeMillis(), jCurrentTimeMillis2);
        if (zB) {
            if (!zK) {
                c();
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            int iE = eei.e();
            cgl.e("forbiddenValue", System.currentTimeMillis(), jCurrentTimeMillis3);
            if (iE == -1) {
                LogUtil.a("NotificPush", "onCreate isForbidden not init");
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                eei.b((Boolean) true);
                cgl.e("midWareValue", System.currentTimeMillis(), jCurrentTimeMillis4);
            }
            DeviceUtil.d(this, true, null);
            LogUtil.a("NotificPush", "start PhoneService");
            if (!EnvironmentInfo.l()) {
                LogUtil.a("NotificPush", "onCreate not hms3.0");
                c();
            } else {
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                NotificationContentProviderUtil.c(zK ? 1 : 0);
                cgl.e("freezeAuthorized", System.currentTimeMillis(), jCurrentTimeMillis5);
            }
        }
        d();
        ndj.d("NotificPush");
        y();
    }

    private void y() {
        lsy.a(new Runnable() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused) {
                    LogUtil.e("NotificPush", "sleep Exception");
                }
                int iCheckSelfPermission = ActivityCompat.checkSelfPermission(BaseApplication.getContext(), "android.permission.RECEIVE_SENSITIVE_NOTIFICATIONS");
                if (Build.VERSION.SDK_INT < 35 || iCheckSelfPermission != 0) {
                    return;
                }
                String strB = SharedPreferenceManager.b("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", "");
                ReleaseLogUtil.d("Notify_NotificPush", "sensitivePermissionStatus ? ", strB);
                if (SensitivePermissionStatus.RESTART.getValue().equals(strB)) {
                    SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", String.valueOf(SensitivePermissionStatus.COMPLETE));
                    ReleaseLogUtil.d("Notify_NotificPush", "sensitivePermissionStatus is COMPLETE.");
                }
            }
        });
    }

    private void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zH = NotificationContentProviderUtil.h();
        cgl.e("initAuthorized", System.currentTimeMillis(), jCurrentTimeMillis);
        if (!zH) {
            LogUtil.j("NotificPush", "initAuthorizeEnabled already set notification authorized");
            return;
        }
        if (mir.a()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            NotificationContentProviderUtil.c(1);
            cgl.e("initAuthorizedTrue", System.currentTimeMillis(), jCurrentTimeMillis2);
        } else {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            NotificationContentProviderUtil.c(0);
            cgl.e("initAuthorizedFalse", System.currentTimeMillis(), jCurrentTimeMillis3);
        }
    }

    private void d() {
        m();
        f5388c.e();
        l();
        f();
        b();
        this.aa = new HashMap(0);
        j();
        g();
        h();
        i();
        n();
        this.k = new ConcurrentHashMap(0);
        this.m = SharedPreferenceManager.c("CONTENT_LENGTH", "CONTENT_LENGTH_SIZE", -1);
        a();
        synchronized (e) {
            q();
        }
    }

    private void h() {
        this.l.add("com.whatsapp");
        this.l.add("com.gbox.com.whatsapp");
        this.l.add("com.viber.voip");
        this.l.add("com.instagram.android");
        this.l.add("com.gbox.com.instagram.android");
    }

    private void n() {
        this.ag.add(1);
        this.ag.add(2);
        this.ag.add(3);
        this.ag.add(11);
    }

    private void g() {
        this.o.add("com.tencent.mm");
        this.o.add("com.hihonor.android.totemweather");
    }

    private void j() {
        this.s.add("com.whatsapp");
        this.s.add("com.gbox.com.whatsapp");
        this.s.add("org.thoughtcrime.securesms");
        this.s.add("com.google.android.apps.messaging");
        this.s.add("com.vkontakte.android");
        this.s.add("com.tencent.mobileqq");
        this.s.add("com.huawei.health");
        this.s.add("org.telegram.messenger");
        this.s.add("com.huawei.android.totemweather");
        this.s.add("com.android.mms");
        this.s.add("com.android.deskclock");
        this.s.add("tv.danmaku.bili");
        this.s.add("com.tencent.mm");
        this.s.add("com.hihonor.mms");
        this.s.add("com.eg.android.AlipayGphone");
        this.s.add("com.twitter.android");
        this.s.add("com.sofascore.results");
        this.s.add("es.evobanco.bancamovil");
        this.s.add("com.android.contacts");
        this.s.add("com.discord");
        this.s.add("com.bbk.calendar");
        this.s.add("com.google.android.gm");
        this.s.add("com.hihonor.android.totemweather");
        this.s.add("jp.softbank.mb.plusmessage");
    }

    private void i() {
        this.y.add("com.tencent.mm");
        this.y.add("com.tencent.qqmusic");
        this.y.add("com.netease.cloudmusic");
        this.y.add("com.spotify.music");
    }

    private void b() {
        this.h.put("com.whatsapp", "silent_notifications_");
        this.h.put("com.gbox.com.whatsapp", "silent_notifications_");
    }

    private void f() {
        this.aj.add("com.whatsapp");
        this.aj.add("com.gbox.com.whatsapp");
        this.aj.add("com.whatsapp.w4b");
        this.aj.add("com.facebook.orca");
        this.aj.add("org.telegram.messenger");
        this.aj.add("org.telegram.messenger.web");
        this.aj.add("org.telegram.messenger.beta");
        this.aj.add("com.viber.voip");
        this.aj.add("jp.naver.line.android");
        this.aj.add("com.gbox.jp.naver.line.android");
        this.aj.add("com.instagram.android");
        this.aj.add("com.vkontakte.android");
        this.aj.add("com.skype.raider");
        this.aj.add("org.thoughtcrime.securesms");
        this.aj.add("com.twitter.android");
        this.aj.add("com.discord");
        this.aj.add("com.microsoft.teams");
        this.aj.add("com.zing.zalo");
    }

    private void a() {
        lzk lzkVarC = lzk.c(this);
        this.u = lzkVarC;
        this.ai = lzkVarC.b();
        this.ab = this.u.e();
        if (this.ai == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.ai = jCurrentTimeMillis;
            this.u.e(jCurrentTimeMillis);
            LogUtil.a("NotificPush", "init mUpdateReceivedTime");
        }
        if (this.ab == 0) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.ab = jCurrentTimeMillis2;
            this.u.b(jCurrentTimeMillis2);
            LogUtil.a("NotificPush", "init mReportBiTime");
        }
    }

    private void m() {
        this.n.add("com.android.server.telecom");
        this.n.add("com.android.phone");
        this.n.add("com.samsung.android.dialer");
        this.n.add("com.oneplus.dialer");
        this.n.add("com.android.dialer");
        this.n.add("com.google.android.dialer");
        this.n.add("com.android.contacts");
        this.n.add("com.huawei.contacts");
        this.n.add("com.hihonor.contacts");
        this.n.add("com.android.incallui");
    }

    private void l() {
        this.ae.add("com.whatsapp");
        this.ae.add("com.gbox.com.whatsapp");
        this.ae.add("com.tencent.mm");
        this.ae.add("org.telegram.messenger");
        this.ae.add("jp.naver.line.android");
        this.ae.add("com.gbox.jp.naver.line.android");
        this.ae.add("com.instagram.android");
        this.ae.add("com.gbox.com.instagram.android");
        this.ae.add("com.alibaba.android.rimet.aliding");
        this.ae.add("com.alibaba.android.rimet");
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() throws Throwable {
        if (o()) {
            boolean zB = b(e());
            ReleaseLogUtil.d("Notify_NotificPush", "onNotification register listenable-apps to phone: isSetFilter status is=", Boolean.valueOf(zB));
            if (zB) {
                NotificationContentProviderUtil.e(this.al);
                t();
            }
        } else {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotification register listenable-apps to phone Failed: SYSTEM_IS_NOT_HARMONY4!");
        }
        if (CommonUtil.bg()) {
            return;
        }
        SharedPreferenceManager.c("notifyModuleId", "onListenerStatus", String.valueOf(HwNotificationConstant.ListenerStatus.ON_LISTENER_CONNECTED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        String str;
        return HarmonyBuild.e && (str = HarmonyBuild.f36561a) != null && !str.isEmpty() && str.charAt(0) >= '4' && str.charAt(0) <= '9';
    }

    private void t() {
        if (this.i != null) {
            return;
        }
        this.i = new BroadcastReceiver() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.9
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) throws Throwable {
                DeviceInfo deviceInfo;
                if (context == null || intent == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) == null || NotificationPushListener.this.i == null) {
                    return;
                }
                ReleaseLogUtil.d("Notify_NotificPush", "mConnectStateChangedReceiver() status : ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                if (deviceConnectState == 2) {
                    NotificationPushListener notificationPushListener = NotificationPushListener.this;
                    notificationPushListener.b((List<String>) notificationPushListener.e());
                    NotificationContentProviderUtil.e(NotificationPushListener.this.al);
                } else if (deviceConnectState == 3) {
                    NotificationContentProviderUtil.d(NotificationPushListener.this.al);
                } else {
                    LogUtil.j("NotificPush", "Invalid device connect state.");
                }
            }
        };
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.i, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
        this.q = new ContentObserver(null) { // from class: com.huawei.bone.ui.setting.NotificationPushListener.7
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.7.5
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        boolean zA = NotificationContentProviderUtil.a("connect_wear");
                        LogUtil.a("NotificPush", "connect_wear is :", Boolean.valueOf(zA));
                        if (zA) {
                            ReleaseLogUtil.d("Notify_NotificPush", "notificationEnableChangeToSetFilter start.");
                            NotificationPushListener.this.b((List<String>) NotificationPushListener.this.e());
                        } else {
                            ReleaseLogUtil.d("Notify_NotificPush", "setNotificationFilterPackages defaultFilterPackage;");
                            NotificationPushListener.this.b((List<String>) Arrays.asList("xxx.xxx.xxx"));
                        }
                    }
                });
            }
        };
        BaseApplication.getContext().getContentResolver().registerContentObserver(Uri.parse(lsu.j), false, this.q);
        LogUtil.a("NotificPush", "register mDeviceStatusChangeCallback and mIsNotificationEnableChangeObserver success.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(List<String> list) throws Throwable {
        String str = "true";
        try {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        ReleaseLogUtil.d("Notify_NotificPush", "onNotification register listenable-apps to phone:packages size is: ", Integer.valueOf(list.size()));
                        getClass().getMethod("setNotificationFilterApps", List.class).invoke(this, list);
                        try {
                            ReleaseLogUtil.d("Notify_NotificPush", "onNotification register listenable-apps to phone success!");
                            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                            linkedHashMap.put("setNotificationFilterResult", "true");
                            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
                            LogUtil.a("NotificPush", "setNotificationFilterResult OpAnalytics finish");
                            return true;
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            ReleaseLogUtil.a("Notify_NotificPush", "onNotification register listenable-apps to phone throw exception: ", ExceptionUtils.c(e));
                            LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
                            linkedHashMap2.put("setNotificationFilterResult", str);
                            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap2);
                            LogUtil.a("NotificPush", "setNotificationFilterResult OpAnalytics finish");
                            return false;
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            ReleaseLogUtil.a("Notify_NotificPush", "onNotification register listenable-apps to phone throw exception: ", ExceptionUtils.c(e));
                            LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>();
                            linkedHashMap3.put("setNotificationFilterResult", str);
                            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap3);
                            LogUtil.a("NotificPush", "setNotificationFilterResult OpAnalytics finish");
                            return false;
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            ReleaseLogUtil.a("Notify_NotificPush", "onNotification register listenable-apps to phone throw exception: ", ExceptionUtils.c(e));
                            LinkedHashMap<String, String> linkedHashMap4 = new LinkedHashMap<>();
                            linkedHashMap4.put("setNotificationFilterResult", str);
                            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap4);
                            LogUtil.a("NotificPush", "setNotificationFilterResult OpAnalytics finish");
                            return false;
                        }
                    }
                } catch (IllegalAccessException e5) {
                    e = e5;
                    str = "false";
                    ReleaseLogUtil.a("Notify_NotificPush", "onNotification register listenable-apps to phone throw exception: ", ExceptionUtils.c(e));
                    LinkedHashMap<String, String> linkedHashMap5 = new LinkedHashMap<>();
                    linkedHashMap5.put("setNotificationFilterResult", str);
                    OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap5);
                    LogUtil.a("NotificPush", "setNotificationFilterResult OpAnalytics finish");
                    return false;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    str = "false";
                    ReleaseLogUtil.a("Notify_NotificPush", "onNotification register listenable-apps to phone throw exception: ", ExceptionUtils.c(e));
                    LinkedHashMap<String, String> linkedHashMap6 = new LinkedHashMap<>();
                    linkedHashMap6.put("setNotificationFilterResult", str);
                    OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap6);
                    LogUtil.a("NotificPush", "setNotificationFilterResult OpAnalytics finish");
                    return false;
                } catch (InvocationTargetException e7) {
                    e = e7;
                    str = "false";
                    ReleaseLogUtil.a("Notify_NotificPush", "onNotification register listenable-apps to phone throw exception: ", ExceptionUtils.c(e));
                    LinkedHashMap<String, String> linkedHashMap7 = new LinkedHashMap<>();
                    linkedHashMap7.put("setNotificationFilterResult", str);
                    OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap7);
                    LogUtil.a("NotificPush", "setNotificationFilterResult OpAnalytics finish");
                    return false;
                } catch (Throwable th) {
                    th = th;
                    str = "false";
                    LinkedHashMap<String, String> linkedHashMap8 = new LinkedHashMap<>();
                    linkedHashMap8.put("setNotificationFilterResult", str);
                    OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap8);
                    LogUtil.a("NotificPush", "setNotificationFilterResult OpAnalytics finish");
                    throw th;
                }
            }
            LogUtil.j("NotificPush", "onNotification register listenable-apps to phone failed: APPLIST_IS_EMPTY!");
            LinkedHashMap<String, String> linkedHashMap9 = new LinkedHashMap<>();
            linkedHashMap9.put("setNotificationFilterResult", "false");
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap9);
            LogUtil.a("NotificPush", "setNotificationFilterResult OpAnalytics finish");
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> e() {
        List<String> arrayList = new ArrayList<>();
        boolean zK = k();
        ReleaseLogUtil.d("Notify_NotificPush", "onNotification get listenable-apps list start:master switch is turn on?(isAuthorized=)", Boolean.valueOf(zK));
        if (zK) {
            arrayList = NotificationContentProviderUtil.j();
        }
        arrayList.addAll(this.n);
        LogUtil.a("NotificPush", "NotificationContentProviderUtil.isNotificationLiveEnabled()", Boolean.valueOf(NotificationContentProviderUtil.f()));
        d(arrayList);
        LogUtil.a("NotificPush", "onNotification getSubSwitchOnListAndAddLiveInfoApps listenable-apps including:", arrayList.toString());
        return arrayList;
    }

    private void d(List<String> list) {
        if (NotificationContentProviderUtil.f()) {
            boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_TYPE", "SUPPORT_NOTIFY_LIVE_TYPE", false);
            boolean zB2 = SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", "SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", false);
            String strB = SharedPreferenceManager.b("NOTIFY_LIVE_LEVEL_VALUE", "NOTIFY_LIVE_LEVEL_VALUE", "levelDefault");
            LogUtil.a("NotificPush", "getLiveNotificationCloudList hasNotifyLiveCapability is ", Boolean.valueOf(zB), ",  hasNotifyLiveLevelCapability is ", Boolean.valueOf(zB2), ",  notifyLiveLevel is " + strB);
            if (zB2) {
                list.addAll(NotificationContentProviderUtil.e(strB));
            } else if (zB) {
                list.addAll(NotificationContentProviderUtil.d());
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        ReleaseLogUtil.d("Notify_NotificPush", "onListenerDisconnected");
        if (CommonUtil.bg()) {
            return;
        }
        SharedPreferenceManager.c("notifyModuleId", "onListenerStatus", String.valueOf(HwNotificationConstant.ListenerStatus.ON_LISTENER_DICONNECTED));
        Intent intent = new Intent(this, (Class<?>) HandleIntentService.class);
        intent.setAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
        Bundle bundle = new Bundle();
        bundle.putString("notificationSwitchChangeType", String.valueOf(HwNotificationConstant.ListenerStatus.ON_LISTENER_DICONNECTED));
        intent.putExtras(bundle);
        try {
            startService(intent);
        } catch (IllegalStateException | SecurityException e2) {
            ReleaseLogUtil.a("Notify_NotificPush", "onListenerDisconnected startService: ", ExceptionUtils.c(e2));
            xjt.ab("onListenerDisconnected occur exception");
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("Notify_NotificPush", "onDestroy start");
        synchronized (e) {
            if (this.z != null) {
                BroadcastManagerUtil.d(BaseApplication.getContext(), this.z);
            }
            if (this.j != null) {
                BaseApplication.getContext().unregisterReceiver(this.j);
            }
        }
        stopForeground(true);
        lsb.d().e(20211231);
        if (this.i != null) {
            ReleaseLogUtil.d("Notify_NotificPush", "onDestroy unregister connectChangeReceiver");
            BaseApplication.getContext().unregisterReceiver(this.i);
            this.i = null;
        }
        if (this.q != null) {
            ReleaseLogUtil.d("Notify_NotificPush", "onDestroy unregister notificationEnableChange");
            BaseApplication.getContext().getContentResolver().unregisterContentObserver(this.q);
            this.q = null;
        }
        NotificationContentProviderUtil.NotificationLiveChangerListener notificationLiveChangerListener = this.al;
        if (notificationLiveChangerListener != null) {
            NotificationContentProviderUtil.d(notificationLiveChangerListener);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        if (statusBarNotification != null) {
            this.ad++;
            s();
            p();
            String strB = cgl.b(statusBarNotification);
            String strC = cgl.c(statusBarNotification.getNotification());
            LogUtil.a("NotificPush", "onNotificationPosted category: ", strC, " packageName: ", strB);
            if (TextUtils.equals("jp.naver.line.android", strB) && TextUtils.equals(NotificationCompat.CATEGORY_CALL, strC)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 14;
                messageObtain.obj = statusBarNotification;
                this.p.sendMessageDelayed(messageObtain, 200L);
                return;
            }
            c(statusBarNotification);
            return;
        }
        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted ERROR: StatusBarNotification is Null");
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        if (statusBarNotification != null) {
            String strB = cgl.b(statusBarNotification);
            String strC = cgl.c(statusBarNotification.getNotification());
            LogUtil.a("NotificPush", "onNotificationRemoved  category: ", strC, " packageName: ", strB);
            if (TextUtils.equals("jp.naver.line.android", strB) && TextUtils.equals(NotificationCompat.CATEGORY_CALL, strC) && this.p.hasMessages(14)) {
                LogUtil.a("NotificPush", "onNotificationRemoved filter line call remove");
                this.p.removeMessages(14);
                return;
            } else {
                d(statusBarNotification, false);
                return;
            }
        }
        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationRemoved ERROR: StatusBarNotification is Null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        String string;
        String strA;
        if (message == null) {
            LogUtil.j("NotificPush", "delaySendRemoveSms message is null");
            return;
        }
        Object obj = message.obj;
        if (!(obj instanceof StatusBarNotification)) {
            LogUtil.j("NotificPush", "delaySendRemoveSms object not instanceof StatusBarNotification");
            return;
        }
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        Notification notification = statusBarNotification.getNotification();
        if (notification != null) {
            Bundle bundle = notification.extras;
            if (bundle == null) {
                string = "";
                strA = "";
            } else {
                string = null;
                strA = cgl.a(bundle, NotificationCompat.EXTRA_TITLE, (String) null);
                CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT);
                if (charSequence != null) {
                    string = charSequence.toString();
                }
            }
            this.ac.remove(strA + string);
        }
        d(statusBarNotification, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (message == null) {
            LogUtil.j("NotificPush", "delaySendRemoveSms message is null");
            return;
        }
        Object obj = message.obj;
        if (!(obj instanceof StatusBarNotification)) {
            LogUtil.j("NotificPush", "delaySendRemoveSms object not instanceof StatusBarNotification");
        } else {
            d((StatusBarNotification) obj, true);
        }
    }

    private void d(final StatusBarNotification statusBarNotification, final boolean z) {
        lsy.a(new Runnable() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.13
            @Override // java.lang.Runnable
            public void run() {
                long j;
                ReleaseLogUtil.d("Notify_NotificPush", "Start onNotificationRemoved isJumpSmsCheck: ", Boolean.valueOf(z), " ,Notification is: ", statusBarNotification.toString());
                if (cgl.a()) {
                    return;
                }
                String strB = cgl.b(statusBarNotification);
                int id = statusBarNotification.getId();
                String key = statusBarNotification.getKey();
                Notification notification = statusBarNotification.getNotification();
                String strC = cgl.c(notification);
                if (notification != null) {
                    long j2 = notification.when;
                    ReleaseLogUtil.d("Notify_NotificPush", "onNotificationRemoved: ", strB, " removed msg when: ", Long.valueOf(j2), ",postTime: ", Long.valueOf(statusBarNotification.getPostTime()), "category", strC);
                    j = j2;
                } else {
                    j = 0;
                }
                if (!z && ndj.a(strB, id)) {
                    ReleaseLogUtil.e("Notify_NotificPush", "onNotificationRemoved filter EMUI 1390 sms");
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 11;
                    messageObtain.obj = statusBarNotification;
                    NotificationPushListener.this.p.sendMessageDelayed(messageObtain, 1200L);
                    return;
                }
                Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
                boolean z2 = false;
                int length = actionArr == null ? 0 : actionArr.length;
                if (NotificationCompat.CATEGORY_CALL.equals(strC)) {
                    NotificationPushListener.this.a(z, strB, length);
                    NotificationPushListener.this.c(strB);
                    if (!z && (("com.whatsapp".equals(strB) || "com.gbox.com.whatsapp".equals(strB)) && length == 2)) {
                        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationRemoved FILTERED because VOIP_CALLING!");
                        NotificationPushListener.this.p.removeMessages(12);
                        Message messageObtain2 = Message.obtain();
                        messageObtain2.what = 12;
                        messageObtain2.obj = statusBarNotification;
                        NotificationPushListener.this.p.sendMessageDelayed(messageObtain2, 1000L);
                        return;
                    }
                }
                if (NotificationCompat.CATEGORY_CALL.equalsIgnoreCase(strC) && (NotificationPushListener.this.ae.contains(strB) || NotificationPushListener.this.ah.contains(strB))) {
                    z2 = true;
                }
                if (cgl.a(notification, z2, strB)) {
                    return;
                }
                String tag = statusBarNotification.getTag();
                String strD = cgl.d(notification);
                Intent intent = new Intent();
                intent.putExtra("packagename", strB);
                intent.putExtra("data_tag", tag);
                intent.putExtra("data_channel_id", strD);
                intent.putExtra("data_noty_id", id);
                intent.putExtra("data_extra_noty_key", key);
                intent.putExtra("data_category", strC);
                if (notification != null && (notification.flags & 2) == 2 && z2 && "com.tencent.mm".equals(strB)) {
                    intent.putExtra("data_extra_remove_call", true);
                }
                NotificationPushListener.this.d(intent, notification, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (TextUtils.equals(str, "org.telegram.messenger") && !TextUtils.isEmpty(this.as)) {
            this.p.removeMessages(13);
            Message messageObtain = Message.obtain();
            messageObtain.what = 13;
            this.p.sendMessageDelayed(messageObtain, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str, int i) {
        if (!cgl.b(str)) {
            if (!cgl.o(str)) {
                return;
            }
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationRemoved clearResendLongVibrateCache param,isJumpSmsCheck is ", Boolean.valueOf(z), ", actionLength is ", Integer.valueOf(i));
            if ((!z || i != 2) && (z || i != 1)) {
                return;
            }
        }
        chb chbVar = f5388c;
        chb.e.remove(str);
        chbVar.c();
        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationRemoved clearResendLongVibrateCache!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent, Notification notification, long j) {
        int iA;
        if (intent == null) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationRemoved intent is null");
            return;
        }
        String strE = cgl.e(intent.getStringExtra("packagename"));
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationRemoved packageName is empty");
            return;
        }
        String stringExtra = intent.getStringExtra("data_tag");
        String stringExtra2 = intent.getStringExtra("data_channel_id");
        boolean zD = cgl.d(strE, j);
        if (cgl.f(strE)) {
            iA = cgl.a(strE, stringExtra, stringExtra2, zD);
        } else {
            if (!d(strE) && !cgr.d(notification, strE) && (!cgl.e(notification, strE) || !cgl.g(strE))) {
                ReleaseLogUtil.e("Notify_NotificPush", "onNotificationRemoved filter type is else");
                return;
            }
            iA = cgl.a(strE, "", "", zD);
        }
        Intent intent2 = new Intent(this, (Class<?>) HandleIntentService.class);
        String stringExtra3 = intent.getStringExtra("data_extra_noty_key");
        int intExtra = intent.getIntExtra("data_noty_id", -1);
        String stringExtra4 = intent.getStringExtra("data_category");
        boolean booleanExtra = intent.getBooleanExtra("data_extra_remove_call", false);
        intent2.setAction("com.huawei.bone.ACTION_NOTIFICATION_DELETE");
        intent2.putExtra("type", iA);
        intent2.putExtra("packagename", strE);
        intent2.putExtra("data_extra_noty_key", stringExtra3);
        intent2.putExtra("data_noty_id", intExtra);
        intent2.putExtra("data_channel_id", stringExtra2);
        intent2.putExtra("data_extra_remove_call", booleanExtra);
        intent2.putExtra("data_category", stringExtra4);
        ReleaseLogUtil.d("Notify_NotificPush", "onNotificationRemoved start to push notification msg");
        try {
            startService(intent2);
        } catch (IllegalStateException | NullPointerException | SecurityException e2) {
            ReleaseLogUtil.a("Notify_NotificPush", "onNotificationRemoved startService: ", ExceptionUtils.c(e2));
            xjt.ab("pushRemoveNotification occur exception");
        }
        LogUtil.a("NotificPush", "onNotificationRemoved startBroadcastToPhoneService success! tag: ", stringExtra, ",msgTypes: ", Integer.valueOf(iA));
    }

    private void c(final StatusBarNotification statusBarNotification) {
        lsy.a(new Runnable() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.5
            @Override // java.lang.Runnable
            public void run() {
                if (NotificationPushListener.this.b(statusBarNotification)) {
                    Bundle bundleE = NotificationPushListener.this.e(statusBarNotification);
                    boolean zB = NotificationPushListener.this.b(bundleE, statusBarNotification);
                    LogUtil.j("NotificPush", "onNotificationPosted finally filterResult: ", Boolean.valueOf(zB), ",key: ", statusBarNotification.getKey());
                    if (zB) {
                        return;
                    }
                    NotificationPushListener.l(NotificationPushListener.this);
                    NotificationPushListener.this.d(bundleE);
                    Bundle bundleE2 = NotificationPushListener.this.e(bundleE, statusBarNotification);
                    b(statusBarNotification, bundleE2);
                    NotificationPushListener.this.c(bundleE2);
                }
            }

            private void b(StatusBarNotification statusBarNotification2, Bundle bundle) {
                if (TextUtils.equals(statusBarNotification2.getPackageName(), "com.tencent.mobileqq") || TextUtils.equals(statusBarNotification2.getPackageName(), "com.tencent.mm")) {
                    LogUtil.a("NotificPush", "onNotificationPosted com.tencent.mobileqq or com.tencent.mm push msg DELAY_100MS");
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e2) {
                        LogUtil.e("NotificPush", "onNotificationPosted specialAppMsgHandling ERROR: ", ExceptionUtils.c(e2));
                    }
                }
                if (TextUtils.equals(statusBarNotification2.getPackageName(), "com.whatsapp")) {
                    if (2 == bundle.getInt("voip_type")) {
                        LogUtil.a("NotificPush", "onNotificationPosted com.whatsapp duringCalling push msg DELAY_100MS");
                        try {
                            Thread.sleep(100L);
                        } catch (InterruptedException e3) {
                            LogUtil.e("NotificPush", "onNotificationPosted specialAppMsgHandling ERROR: ", ExceptionUtils.c(e3));
                        }
                    }
                    String string = bundle.getString("notification_key");
                    String string2 = bundle.getString("data_category");
                    if (TextUtils.isEmpty(string2) || !string2.equals(NotificationCompat.CATEGORY_CALL) || TextUtils.isEmpty(string)) {
                        return;
                    }
                    ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted com.whatsapp missedCall category=", string2);
                    ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted com.whatsapp missedCall push msg 1s");
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e4) {
                        LogUtil.e("NotificPush", "onNotificationPosted specialAppMsgHandling ERROR: ", ExceptionUtils.c(e4));
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Bundle bundle) {
        String string = bundle.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME);
        long jCurrentTimeMillis = System.currentTimeMillis() - bundle.getLong("data_extra_noty_when");
        if (jCurrentTimeMillis > 60000) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(3);
            linkedHashMap.put("notificationDelayPkg", string);
            linkedHashMap.put("notificationDelayTime", String.valueOf(jCurrentTimeMillis));
            linkedHashMap.put("notificationDelaySystemInfo", ndj.a());
            Context context = BaseApplication.getContext();
            linkedHashMap.put("stepsNotifiState", String.valueOf("true".equals(b(context))));
            linkedHashMap.put("isAgreeWhite", String.valueOf(nzz.c(context)));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
            if (CommonUtil.ap()) {
                xjt.ab("Notification push delay one minute package:" + string + ", delayTime:" + jCurrentTimeMillis + ", phone:" + ndj.a());
            }
            if (CommonUtil.bg()) {
                return;
            }
            mir.d(true);
        }
    }

    public static String b(Context context) {
        SharedPreferences sharedPreferences;
        return (context == null || (sharedPreferences = context.getSharedPreferences("daemonService_perference_common", 0)) == null) ? UserInfomation.BIRTHDAY_UNSETED : sharedPreferences.getString("steps_notification_status", UserInfomation.BIRTHDAY_UNSETED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(StatusBarNotification statusBarNotification) {
        Notification.Action[] actionArr;
        if (statusBarNotification == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Start onNotificationPosted: ");
        sb.append(statusBarNotification);
        Notification notification = statusBarNotification.getNotification();
        if (notification != null && (actionArr = notification.actions) != null && actionArr.length > 0) {
            for (int i = 0; i < actionArr.length; i++) {
                if (actionArr[i] != null) {
                    sb.append(" ;actionButton");
                    sb.append(i + 1);
                    sb.append(" name: ");
                    sb.append(actionArr[i].title);
                    sb.append(actionArr[i].getRemoteInputs() == null ? "" : " support quickReply!");
                }
            }
        }
        ReleaseLogUtil.d("Notify_NotificPush", sb.toString());
        String strB = cgl.b(statusBarNotification);
        if (TextUtils.isEmpty(strB)) {
            return false;
        }
        if (cio.d.equalsIgnoreCase(strB)) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because INTELLIGENT_PACKAGE");
            return false;
        }
        boolean zB = b(strB, statusBarNotification);
        ReleaseLogUtil.d("Notify_NotificPush", strB, " onNotificationPosted isMeetPushConditions?(false=filtered): ", Boolean.valueOf(zB));
        return zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[PHI: r0 r5 r6 r7 r10 r15 r16 r17
      0x00ba: PHI (r0v6 java.lang.String) = (r0v5 java.lang.String), (r0v30 java.lang.String) binds: [B:33:0x00b0, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v9 java.lang.String) binds: [B:33:0x00b0, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v12 java.lang.String) binds: [B:33:0x00b0, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r7v1 long) = (r7v0 long), (r7v6 long) binds: [B:33:0x00b0, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r10v1 int) = (r10v0 int), (r10v4 int) binds: [B:33:0x00b0, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v7 java.lang.String) binds: [B:33:0x00b0, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v6 java.lang.String) binds: [B:33:0x00b0, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r17v1 java.lang.String) = (r17v0 java.lang.String), (r17v7 java.lang.String) binds: [B:33:0x00b0, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00ba, please report this as an issue */
    public Bundle e(StatusBarNotification statusBarNotification) {
        long j;
        int i;
        String strE;
        String strA;
        String strA2;
        String strB;
        String strA3;
        String strD;
        String strA4;
        Bundle bundle = new Bundle();
        String strB2 = cgl.b(statusBarNotification);
        String key = statusBarNotification.getKey();
        bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, strB2);
        bundle.putInt("data_noty_id", statusBarNotification.getId());
        bundle.putString("data_extra_noty_key", key);
        bundle.putLong("data_extra_noty_posttime", statusBarNotification.getPostTime());
        bundle.putString("data_tag", cgl.d(statusBarNotification));
        Notification notification = statusBarNotification.getNotification();
        String strA5 = "";
        if (notification != null) {
            d(bundle, key, notification, strB2);
            j = notification.when;
            i = notification.flags;
            Bundle bundle2 = notification.extras;
            if (bundle2 != null) {
                try {
                    strD = cgl.d(bundle2);
                    try {
                        strA4 = cgl.a(bundle2);
                        try {
                            strA2 = cgl.a(bundle2, "hw_notification_type", (String) null);
                            try {
                                strA5 = cgl.a(bundle2, "alertListenerPkg", (String) null);
                                strB = cgl.b(bundle2);
                                try {
                                    e(notification, bundle2, bundle);
                                    e(notification, bundle);
                                    strA3 = cgl.a(bundle2, "miui.focus.param", (String) null);
                                    try {
                                        b(strB2, bundle2, bundle);
                                    } catch (IllegalArgumentException e2) {
                                        e = e2;
                                        LogUtil.e("NotificPush", "packageMessage IllegalArgumentException: ", ExceptionUtils.c(e));
                                        xjt.ab("packageMessage occur exception");
                                    }
                                } catch (IllegalArgumentException e3) {
                                    e = e3;
                                    strA3 = null;
                                }
                            } catch (IllegalArgumentException e4) {
                                e = e4;
                                strB = null;
                                strA3 = null;
                                LogUtil.e("NotificPush", "packageMessage IllegalArgumentException: ", ExceptionUtils.c(e));
                                xjt.ab("packageMessage occur exception");
                                strE = e(notification, strA4, strB2, bundle2);
                                strA = a(strD, strB2);
                                if (notification.actions != null) {
                                }
                                bundle.putLong("data_extra_noty_when", j);
                                bundle.putInt("data_flags", i);
                                bundle.putString("data_extra_title", strA);
                                bundle.putString("data_extra_text", strE);
                                bundle.putString("data_extra_noty_type", strA2);
                                bundle.putString("data_extra_noty_harmony_alert", strA5);
                                bundle.putInt("data_extra_action_length", length);
                                bundle.putString("data_channel_id", cgl.d(notification));
                                bundle.putString("data_category", cgl.c(notification));
                                bundle.putString("data_groupKey", cgl.e(notification));
                                bundle.putString("data_extra_miniFocusParam", strA3);
                                bundle.putString("data_extra_selfDisplayName", strB);
                                if (cgl.e(notification, (String) null)) {
                                    cgl.b(notification.extras, bundle);
                                }
                                String strC = cop.c(strA);
                                String strE2 = cop.e(strE);
                                bundle.putString("log_title", strC);
                                bundle.putString("log_content", strE2);
                                ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted packageMessage: ", strB2, " push msg when: ", Long.valueOf(j), ",postTime: ", Long.valueOf(statusBarNotification.getPostTime()));
                                LogUtil.a("NotificPush", "onNotificationPosted packageMessage: ", key, " push msg title: ", strC, ",content: ", strE2);
                                return bundle;
                            }
                        } catch (IllegalArgumentException e5) {
                            e = e5;
                            strA2 = null;
                            strB = null;
                            strA3 = null;
                            LogUtil.e("NotificPush", "packageMessage IllegalArgumentException: ", ExceptionUtils.c(e));
                            xjt.ab("packageMessage occur exception");
                            strE = e(notification, strA4, strB2, bundle2);
                            strA = a(strD, strB2);
                            if (notification.actions != null) {
                            }
                            bundle.putLong("data_extra_noty_when", j);
                            bundle.putInt("data_flags", i);
                            bundle.putString("data_extra_title", strA);
                            bundle.putString("data_extra_text", strE);
                            bundle.putString("data_extra_noty_type", strA2);
                            bundle.putString("data_extra_noty_harmony_alert", strA5);
                            bundle.putInt("data_extra_action_length", length);
                            bundle.putString("data_channel_id", cgl.d(notification));
                            bundle.putString("data_category", cgl.c(notification));
                            bundle.putString("data_groupKey", cgl.e(notification));
                            bundle.putString("data_extra_miniFocusParam", strA3);
                            bundle.putString("data_extra_selfDisplayName", strB);
                            if (cgl.e(notification, (String) null)) {
                                cgl.b(notification.extras, bundle);
                            }
                            String strC2 = cop.c(strA);
                            String strE3 = cop.e(strE);
                            bundle.putString("log_title", strC2);
                            bundle.putString("log_content", strE3);
                            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted packageMessage: ", strB2, " push msg when: ", Long.valueOf(j), ",postTime: ", Long.valueOf(statusBarNotification.getPostTime()));
                            LogUtil.a("NotificPush", "onNotificationPosted packageMessage: ", key, " push msg title: ", strC2, ",content: ", strE3);
                            return bundle;
                        }
                    } catch (IllegalArgumentException e6) {
                        e = e6;
                        strA4 = null;
                        strA2 = null;
                        strB = null;
                        strA3 = null;
                        LogUtil.e("NotificPush", "packageMessage IllegalArgumentException: ", ExceptionUtils.c(e));
                        xjt.ab("packageMessage occur exception");
                        strE = e(notification, strA4, strB2, bundle2);
                        strA = a(strD, strB2);
                        if (notification.actions != null) {
                        }
                        bundle.putLong("data_extra_noty_when", j);
                        bundle.putInt("data_flags", i);
                        bundle.putString("data_extra_title", strA);
                        bundle.putString("data_extra_text", strE);
                        bundle.putString("data_extra_noty_type", strA2);
                        bundle.putString("data_extra_noty_harmony_alert", strA5);
                        bundle.putInt("data_extra_action_length", length);
                        bundle.putString("data_channel_id", cgl.d(notification));
                        bundle.putString("data_category", cgl.c(notification));
                        bundle.putString("data_groupKey", cgl.e(notification));
                        bundle.putString("data_extra_miniFocusParam", strA3);
                        bundle.putString("data_extra_selfDisplayName", strB);
                        if (cgl.e(notification, (String) null)) {
                            cgl.b(notification.extras, bundle);
                        }
                        String strC3 = cop.c(strA);
                        String strE4 = cop.e(strE);
                        bundle.putString("log_title", strC3);
                        bundle.putString("log_content", strE4);
                        ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted packageMessage: ", strB2, " push msg when: ", Long.valueOf(j), ",postTime: ", Long.valueOf(statusBarNotification.getPostTime()));
                        LogUtil.a("NotificPush", "onNotificationPosted packageMessage: ", key, " push msg title: ", strC3, ",content: ", strE4);
                        return bundle;
                    }
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    strD = null;
                }
            } else {
                strD = null;
                strA4 = null;
                strA2 = null;
                strB = null;
                strA3 = null;
            }
            strE = e(notification, strA4, strB2, bundle2);
            strA = a(strD, strB2);
            int length = notification.actions != null ? notification.actions.length : 0;
            bundle.putLong("data_extra_noty_when", j);
            bundle.putInt("data_flags", i);
            bundle.putString("data_extra_title", strA);
            bundle.putString("data_extra_text", strE);
            bundle.putString("data_extra_noty_type", strA2);
            bundle.putString("data_extra_noty_harmony_alert", strA5);
            bundle.putInt("data_extra_action_length", length);
            bundle.putString("data_channel_id", cgl.d(notification));
            bundle.putString("data_category", cgl.c(notification));
            bundle.putString("data_groupKey", cgl.e(notification));
            bundle.putString("data_extra_miniFocusParam", strA3);
            bundle.putString("data_extra_selfDisplayName", strB);
            if (cgl.e(notification, (String) null) && cgl.g(strB2)) {
                cgl.b(notification.extras, bundle);
            }
            String strC4 = cop.c(strA);
            String strE5 = cop.e(strE);
            bundle.putString("log_title", strC4);
            bundle.putString("log_content", strE5);
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted packageMessage: ", strB2, " push msg when: ", Long.valueOf(j), ",postTime: ", Long.valueOf(statusBarNotification.getPostTime()));
            LogUtil.a("NotificPush", "onNotificationPosted packageMessage: ", key, " push msg title: ", strC4, ",content: ", strE5);
            return bundle;
        }
        j = 0;
        i = -1;
        strE = null;
        strA = null;
        strA2 = null;
        strB = null;
        strA3 = null;
        bundle.putLong("data_extra_noty_when", j);
        bundle.putInt("data_flags", i);
        bundle.putString("data_extra_title", strA);
        bundle.putString("data_extra_text", strE);
        bundle.putString("data_extra_noty_type", strA2);
        bundle.putString("data_extra_noty_harmony_alert", strA5);
        bundle.putInt("data_extra_action_length", length);
        bundle.putString("data_channel_id", cgl.d(notification));
        bundle.putString("data_category", cgl.c(notification));
        bundle.putString("data_groupKey", cgl.e(notification));
        bundle.putString("data_extra_miniFocusParam", strA3);
        bundle.putString("data_extra_selfDisplayName", strB);
        if (cgl.e(notification, (String) null)) {
            cgl.b(notification.extras, bundle);
        }
        String strC5 = cop.c(strA);
        String strE6 = cop.e(strE);
        bundle.putString("log_title", strC5);
        bundle.putString("log_content", strE6);
        ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted packageMessage: ", strB2, " push msg when: ", Long.valueOf(j), ",postTime: ", Long.valueOf(statusBarNotification.getPostTime()));
        LogUtil.a("NotificPush", "onNotificationPosted packageMessage: ", key, " push msg title: ", strC5, ",content: ", strE6);
        return bundle;
    }

    private void b(String str, Bundle bundle, Bundle bundle2) {
        boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_SUB_TEXT_BIG_TEXT", "SUPPORT_NOTIFY_SUB_TEXT_BIG_TEXT", false);
        LogUtil.a("NotificPush", "getSubTextBigText hasNotifySubTextBigTextCapability=", Boolean.valueOf(zB));
        if (zB && TextUtils.equals(str, "com.google.android.gm")) {
            bundle2.putString("data_extra_sub_text", cgl.c(bundle));
            bundle2.putString("data_extra_big_text", cgl.e(bundle));
        }
    }

    private void e(Notification notification, Bundle bundle) {
        LogUtil.a("NotificPush", "getHealthSummaryFromTickerExtras isHarmony=", Boolean.valueOf(CommonUtil.bc()));
        CharSequence charSequence = notification.tickerText;
        if (TextUtils.isEmpty(charSequence) || !charSequence.toString().contains(JsbMapKeyNames.H5_EXTRAS)) {
            return;
        }
        String string = charSequence.toString();
        LogUtil.a("NotificPush", "getHealthSummaryFromTickerExtras extrasTickerText=", string);
        try {
            JSONObject jSONObject = new JSONObject(string);
            boolean zHas = jSONObject.has(JsbMapKeyNames.H5_EXTRAS);
            LogUtil.a("NotificPush", "getHealthSummaryFromTickerExtras isHasExtras=" + zHas);
            if (zHas) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(JsbMapKeyNames.H5_EXTRAS);
                LogUtil.a("NotificPush", "getDeepLinkFromTickerOrExtras extrasJson=", jSONObject2);
                bundle.putString(JsbMapKeyNames.H5_EXTRAS, jSONObject2.toString());
            }
        } catch (JSONException e2) {
            LogUtil.e("NotificPush", "getHealthSummaryFromTickerExtras: ", ExceptionUtils.c(e2));
        }
    }

    private void e(Notification notification, Bundle bundle, Bundle bundle2) {
        boolean zBc = CommonUtil.bc();
        LogUtil.a("NotificPush", "getDeepLinkFromTickerOrExtras isHarmony=", Boolean.valueOf(zBc));
        if (!zBc) {
            ReleaseLogUtil.e("NotificPush", "getDeepLinkFromTickerOrExtras phone is not harmony.");
            return;
        }
        CharSequence charSequence = notification.tickerText;
        if (!TextUtils.isEmpty(charSequence) && charSequence.toString().contains("ping_list")) {
            String string = charSequence.toString();
            LogUtil.a("NotificPush", "getDeepLinkFromTickerOrExtras tickerText=", string);
            try {
                JSONObject jSONObject = new JSONObject(string);
                boolean zHas = jSONObject.has("ping_list");
                LogUtil.a("NotificPush", "getDeepLinkFromTickerOrExtras isHasPingList=" + zHas);
                if (zHas) {
                    JSONArray jSONArray = jSONObject.getJSONArray("ping_list");
                    LogUtil.a("NotificPush", "getDeepLinkFromTickerOrExtras pingListValue=" + jSONArray.toString());
                    bundle2.putString("pingList", jSONArray.toString());
                    return;
                }
                return;
            } catch (JSONException e2) {
                LogUtil.e("NotificPush", "getDeepLinkFromTickerOrExtras: ", ExceptionUtils.c(e2));
                xjt.ab("getDeepLinkFromTickerOrExtras occur exception");
                return;
            }
        }
        LogUtil.j("NotificPush", "getDeepLinkFromExtras original ticker is empty.");
        if (CommonUtil.bu()) {
            return;
        }
        String strA = cgl.a(bundle, "ping_list", (String) null);
        if (!TextUtils.isEmpty(strA)) {
            LogUtil.a("NotificPush", "getDeepLinkFromExtras ticker is empty, extras pingList=", strA);
            bundle2.putString("pingList", strA);
        } else {
            LogUtil.a("NotificPush", "getDeepLinkFromExtras ticker is empty, extras pingList is empty");
        }
    }

    private void d(Bundle bundle, String str, Notification notification, String str2) {
        NotificationCompat.MessagingStyle.Message message;
        try {
            NotificationCompat.Style styleExtractStyleFromNotification = NotificationCompat.Style.extractStyleFromNotification(notification);
            if (styleExtractStyleFromNotification instanceof NotificationCompat.MessagingStyle) {
                NotificationCompat.MessagingStyle messagingStyle = (NotificationCompat.MessagingStyle) styleExtractStyleFromNotification;
                List<NotificationCompat.MessagingStyle.Message> messages = messagingStyle.getMessages();
                if (messages.size() >= 1 && (message = messages.get(messages.size() - 1)) != null) {
                    cgt.b(BaseApplication.getContext(), bundle, message);
                    boolean z = message.getPerson() != null;
                    LogUtil.j("NotificPush", "onNotificationPosted packageMessage: MSG_SENDER_EXIST ? ", Boolean.valueOf(z), ",key: ", str);
                    if (z) {
                        bundle.putString("notification_sender", message.getPerson().toString());
                        b(bundle, str2, messagingStyle, message);
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            LogUtil.e("NotificPush", "setSenderIntoBundle IllegalArgumentException: ", ExceptionUtils.c(e2));
        } catch (RuntimeException e3) {
            LogUtil.e("NotificPush", "setSenderIntoBundle RuntimeException: ", ExceptionUtils.c(e3));
        }
    }

    private void b(Bundle bundle, String str, NotificationCompat.MessagingStyle messagingStyle, NotificationCompat.MessagingStyle.Message message) {
        Person user;
        if (!TextUtils.isEmpty(str) && str.equals("com.twitter.android") && (user = messagingStyle.getUser()) != null && message.getPerson() != null) {
            String key = user.getKey();
            String key2 = message.getPerson().getKey();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(key2)) {
                bundle.putString("msgStyleUserKey", key);
                bundle.putString("msgPersonKey", key2.toString());
            }
        }
        if ((TextUtils.isEmpty(str) || !str.equals("com.whatsapp.w4b")) && !TextUtils.equals(str, "com.whatsapp")) {
            return;
        }
        CharSequence name = message.getPerson().getName();
        if (TextUtils.isEmpty(name)) {
            return;
        }
        bundle.putString("msgPersonName", name.toString());
    }

    private String a(String str, String str2) {
        return (TextUtils.equals(str2, "org.telegram.messenger") && TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.as)) ? this.as : str;
    }

    private String e(Notification notification, String str, String str2, Bundle bundle) {
        if (TextUtils.equals(str2, "org.telegram.messenger")) {
            LogUtil.j("NotificPush", "onNotificationPosted dealWithTelegramMissedCall Start get androidText!");
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (!CollectionUtils.d(parcelableArray)) {
                String strA = cgl.a((Bundle) parcelableArray[parcelableArray.length - 1], "text", (String) null);
                LogUtil.j("NotificPush", "onNotificationPosted dealWithTelegramMissedCall androidText is: ", cop.e(strA));
                if (!TextUtils.isEmpty(strA)) {
                    return strA;
                }
            }
            LogUtil.j("NotificPush", "onNotificationPosted dealWithTelegramMissedCallandroidText list is null or empty!continue getView");
            View viewA = a(BaseApplication.getContext(), notification);
            if (viewA == null) {
                LogUtil.j("NotificPush", "onNotificationPosted dealWithTelegramMissedCall view is null");
                return str;
            }
            String strA2 = a(viewA);
            boolean zEquals = TextUtils.equals(strA2, str);
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted getLastViewContent empty? ", Boolean.valueOf(TextUtils.isEmpty(strA2)), ",lastContentValue equals notificationText? ", Boolean.valueOf(zEquals));
            if (!zEquals) {
                return strA2;
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #1 {Exception -> 0x0064, blocks: (B:15:0x0053, B:17:0x005a), top: B:21:0x0053 }] */
    private static View a(Context context, Notification notification) {
        RemoteViews remoteViewsCreateContentView;
        LogUtil.a("NotificPush", "onNotificationPosted getContentView enter");
        View viewApply = null;
        try {
            if (notification.contentView != null) {
                LogUtil.a("NotificPush", "onNotificationPosted getContentView notification.contentView is not null");
                remoteViewsCreateContentView = notification.contentView;
            } else {
                LogUtil.a("NotificPush", "onNotificationPosted getContentView Build.VERSION.SDK_INT >= 24");
                remoteViewsCreateContentView = Notification.Builder.recoverBuilder(context, notification).createContentView();
            }
        } catch (SecurityException e2) {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted getContentView SecurityException: ", ExceptionUtils.c(e2));
            remoteViewsCreateContentView = null;
        } catch (NoSuchElementException e3) {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted getContentView NoSuchElementException: ", ExceptionUtils.c(e3));
            remoteViewsCreateContentView = null;
        }
        if (remoteViewsCreateContentView != null) {
            try {
                viewApply = remoteViewsCreateContentView.apply(context, null);
                if (viewApply == null) {
                    LogUtil.j("NotificPush", "onNotificationPosted getContentView view is null.");
                }
            } catch (Exception unused) {
                LogUtil.e("NotificPush", "onNotificationPosted getContentView occur Exception");
            }
        } else if (viewApply == null) {
            LogUtil.j("NotificPush", "onNotificationPosted getContentView view is null.");
        }
        return viewApply;
    }

    private static String a(View view) {
        LogUtil.a("NotificPush", "onNotificationPosted getLastViewContent enter");
        StringBuilder sb = new StringBuilder();
        c(view, sb, 0);
        return sb.toString();
    }

    private static void c(View view, StringBuilder sb, int i) {
        if (i >= 50) {
            LogUtil.j("NotificPush", "onNotificationPosted getLastViewContent traversalView reach max recursive times");
            return;
        }
        if (view == null) {
            LogUtil.j("NotificPush", "onNotificationPosted getLastViewContent traversalView view is null");
            return;
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return;
            }
            sb.delete(0, sb.length());
            sb.append(text);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                c(viewGroup.getChildAt(i2), sb, i + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Bundle bundle, StatusBarNotification statusBarNotification) {
        return e(statusBarNotification, b(bundle, c(bundle, statusBarNotification.getNotification())));
    }

    private boolean c(Bundle bundle, Notification notification) {
        String strA = cgl.a(bundle, MediaBrowserProtocol.DATA_PACKAGE_NAME, (String) null);
        int i = bundle.getInt("liveType", 0);
        String strA2 = cgl.a(bundle, "liveEvent", "OTHER");
        if (SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_TYPE", "SUPPORT_NOTIFY_LIVE_TYPE", false) && i != 0 && cis.e.contains(strA2.toUpperCase(Locale.ROOT))) {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted continue: ", strA, " is a live type info");
            return false;
        }
        if (BaseActivity.isMiui() && !TextUtils.isEmpty(bundle.getString("data_extra_miniFocusParam"))) {
            if (TextUtils.equals(strA, "com.android.mms") || TextUtils.equals(strA, "com.android.server.telecom") || TextUtils.equals(strA, "com.android.calendar")) {
                ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted continue:miui sms or missCall notification");
                return false;
            }
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted FILTERED: Third-party mobile phone live notification");
            return true;
        }
        String strA3 = cgl.a(bundle, "data_category", (String) null);
        if (b(bundle, notification, true)) {
            if (TextUtils.equals(strA, "org.telegram.messenger")) {
                this.as = bundle.getString("telegramMissCallName", "");
            }
            bundle.putBoolean("data_extra_send_call_no_wechat", true);
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted continue: ", strA, " is voip CALLING");
            return false;
        }
        if (TextUtils.equals(strA, "com.whatsapp.w4b") || TextUtils.equals(strA, "com.whatsapp")) {
            String string = bundle.getString("msgPersonName");
            String string2 = bundle.getString("data_extra_selfDisplayName");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && TextUtils.equals(string, string2)) {
                LogUtil.a("NotificPush", "messageFilterStepOne msgPersonName and extraSelfDisplayName are the same");
                return true;
            }
        }
        if (TextUtils.equals(strA, "com.twitter.android")) {
            String string3 = bundle.getString("msgStyleUserKey");
            String string4 = bundle.getString("msgPersonKey");
            if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4) && TextUtils.equals(string3, string4)) {
                LogUtil.a("NotificPush", "messageFilterStepOne msgStyleUserKey and msgPersonKey are the same");
                return true;
            }
        }
        String strA4 = cgl.a(bundle, "data_tag", (String) null);
        String strA5 = cgl.a(bundle, "data_channel_id", (String) null);
        if (cgl.e(strA, strA4, strA5) || e(bundle, strA3, bundle.getInt("data_flags"), strA)) {
            return true;
        }
        String strA6 = cgl.a(bundle, "data_extra_noty_type", (String) null);
        int i2 = bundle.getInt("data_noty_id", -1);
        if (TextUtils.equals(strA6, "hang_up") && i2 != 1390) {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted FILTERED: ", strA, " is repeat");
            return true;
        }
        if (cgl.a(bundle, "notification_sender", (String) null) == null && TextUtils.equals("org.thoughtcrime.securesms", strA)) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED by SENDER_IS_NULL");
            return true;
        }
        String strA7 = cgl.a(bundle, "data_extra_noty_key", (String) null);
        String strA8 = cgl.a(bundle, "data_extra_text", (String) null);
        if (this.l.contains(strA) && e(strA8, strA7)) {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted FILTERED by KEY_WHEN_500MS,key: ", strA7);
            return true;
        }
        int i3 = bundle.getInt("data_extra_action_length");
        String str = this.h.get(strA);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strA5) && strA5.contains(str) && i3 == 1) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because HIT_CHANNEL_BLACK_LIST,pkg=", strA);
            return true;
        }
        if (!e(notification, strA, strA3)) {
            return false;
        }
        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because ACTION_LENGTH_IS_1,pkg=", strA);
        return true;
    }

    private boolean e(Notification notification, String str, String str2) {
        Notification.Action[] actionArr;
        ReleaseLogUtil.d("Notify_NotificPush", "isFilteredByActionLengthOne()");
        if (notification == null || (actionArr = notification.actions) == null || actionArr.length != 1 || cgl.h(str) || !this.aj.contains(str)) {
            return false;
        }
        if (CommonUtil.bu()) {
            Notification.Action action = actionArr[0];
            CharSequence charSequence = action == null ? "" : action.title;
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(3);
            linkedHashMap.put("actionsLengthPackageName", str);
            linkedHashMap.put("actionsLengthCategory", str2);
            linkedHashMap.put("actionsLengthTitle", TextUtils.isEmpty(charSequence) ? "" : charSequence.toString());
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
        }
        if (cgl.i(str) && NotificationCompat.CATEGORY_CALL.equalsIgnoreCase(str2)) {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted continue,pkg=", str, " is missedCall");
            return false;
        }
        if (TextUtils.equals("org.telegram.messenger", str)) {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted continue,Telegram actionLength=1 DO_NOT_FILTER");
            return false;
        }
        if (TextUtils.equals("org.thoughtcrime.securesms", str)) {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted continue,Signal actionLength=1 DO_NOT_FILTER");
            return false;
        }
        if (!TextUtils.equals("com.twitter.android", str)) {
            return true;
        }
        ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted continue,Twitter actionLength=1 DO_NOT_FILTER");
        return false;
    }

    private boolean b(Bundle bundle, boolean z) {
        long j;
        if (bundle == null || z) {
            return true;
        }
        String strA = cgl.a(bundle, "data_extra_title", (String) null);
        String strA2 = cgl.a(bundle, "data_extra_text", (String) null);
        String strA3 = cgl.a(bundle, MediaBrowserProtocol.DATA_PACKAGE_NAME, (String) null);
        String strA4 = cgl.a(bundle, "data_extra_noty_key", (String) null);
        int i = bundle.getInt("data_noty_id", -1);
        if (a(bundle)) {
            return true;
        }
        if (TextUtils.isEmpty(strA2) && i == 123) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because notificationId=123,key: ", strA4);
            return true;
        }
        if ("Push Service".equalsIgnoreCase(strA2) && "Push Service".equalsIgnoreCase(strA)) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because TITLE_CONTENT_IS_PUSH_SERVICE,pkg=", strA3);
            return true;
        }
        if (cgl.d() && d(strA3, strA, strA2)) {
            return true;
        }
        long j2 = bundle.getLong("data_extra_noty_posttime");
        if (this.w.contains(strA4 + j2)) {
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted FILTERED by KEY_POSTTIME,postTime: ", Long.valueOf(j2), ",key: ", strA4);
            return true;
        }
        this.w.offer(strA4 + j2);
        long j3 = bundle.getLong("data_extra_noty_when");
        String strA5 = cgl.a(bundle, "log_content", (String) null);
        if (c(i, strA3)) {
            j = j3;
            if (e(strA4, j3, strA2, strA5)) {
                if (!TextUtils.isEmpty(cgl.a(bundle, "imageName", (String) null))) {
                    return false;
                }
                ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted FILTERED by KeyWhenContent,when: ", Long.valueOf(j), ",key: ", strA4);
                return true;
            }
        } else {
            j = j3;
        }
        if (c(strA4, strA2, strA3, j)) {
            return true;
        }
        if (ndj.a(strA3)) {
            boolean zHasMessages = this.p.hasMessages(11);
            if (i == 1390) {
                this.ac.put(strA2 + j, Long.valueOf(SystemClock.elapsedRealtime()));
                e(zHasMessages);
            } else {
                Long lRemove = this.ac.remove(strA2 + j);
                if (lRemove == null) {
                    LogUtil.j("NotificPush", "onNotificationPosted continue,key: ", strA4, " lastSendTime is null");
                    return false;
                }
                if (SystemClock.elapsedRealtime() - lRemove.longValue() < 10000) {
                    ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because 1390_REPEAT_SMS", ",key: ", strA4, ";hasRemoveMessages is ", Boolean.valueOf(zHasMessages));
                    this.p.removeMessages(11);
                    return true;
                }
            }
        }
        return false;
    }

    private void e(boolean z) {
        if (z) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted SMS 1390 hasRemoveMessages.");
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("notificationSms1390", ndj.a());
        linkedHashMap.put("notificationSms1390hasRemoveMessages", String.valueOf(z));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
    }

    private boolean e(StatusBarNotification statusBarNotification, boolean z) {
        String packageName = statusBarNotification.getPackageName();
        if (!z && this.y.contains(packageName) && (z = TextUtils.equals(NotificationCompat.CATEGORY_TRANSPORT, cgl.c(statusBarNotification.getNotification())))) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because MEDIA_PLAY_ONGOING,key: ", statusBarNotification.getKey());
        }
        return z;
    }

    private boolean a(Bundle bundle) {
        if (bundle.getInt("liveType") != 0 || !TextUtils.isEmpty(cgl.a(bundle, "data_extra_text", ""))) {
            return false;
        }
        bundle.putString("data_extra_text", getString(R.string.IDS_notification_message_prompt));
        if (!TextUtils.isEmpty(cgl.a(bundle, "data_extra_title", ""))) {
            return false;
        }
        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because TITLE_IS_EMPTY,key: ", cgl.a(bundle, "data_extra_noty_key", ""));
        return true;
    }

    private boolean e(String str, long j, String str2, String str3) {
        LogUtil.a("NotificPush", "onNotificationPosted enter KeyWhenContent filter,when: ", Long.valueOf(j), ",content: ", str3, ",key: ", str);
        if (this.v.contains(str + j + str2)) {
            return true;
        }
        this.v.offer(str + j + str2);
        return false;
    }

    private boolean c(String str, String str2, String str3, long j) {
        if (!this.o.contains(str3)) {
            return false;
        }
        try {
            Long lB = this.t.b(str + str2);
            if (lB == null) {
                this.t.d(str + str2, Long.valueOf(j));
                return false;
            }
            if (j - lB.longValue() <= 500) {
                ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted FILTERED because key and content is same within 500ms");
                return true;
            }
            this.t.d(str + str2, Long.valueOf(j));
            return false;
        } catch (ClassCastException e2) {
            ReleaseLogUtil.a("Notify_NotificPush", "isDuplicateMessageWithin500ms ClassCastException: ", ExceptionUtils.c(e2));
            return false;
        } catch (NumberFormatException e3) {
            ReleaseLogUtil.a("Notify_NotificPush", "isDuplicateMessageWithin500ms NumberFormatException: ", ExceptionUtils.c(e3));
            return false;
        }
    }

    private boolean c(int i, String str) {
        String strE = cgl.e(str);
        if (this.s.contains(str)) {
            return true;
        }
        return i != 1390 && TextUtils.equals(strE, "com.android.mms") && CommonUtil.bg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle e(Bundle bundle, StatusBarNotification statusBarNotification) {
        Bundle bundle2 = new Bundle();
        ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted startBroadcastToPhoneService method start!");
        e(bundle, bundle2);
        String strA = cgl.a(bundle, MediaBrowserProtocol.DATA_PACKAGE_NAME, (String) null);
        c(statusBarNotification, bundle2, strA);
        int i = bundle.getInt("voip_type");
        if (i == 1) {
            bundle2.putString("reject_button_key", bundle.getString("reject_button_key"));
            bundle2.putInt("incoming_type", bundle.getInt("incoming_type"));
        }
        long j = bundle.getLong("data_extra_noty_when", 0L);
        bundle2.putLong("data_extra_noty_when", j);
        int iA = cgl.a(strA, cgl.a(bundle, "data_tag", (String) null), cgl.a(bundle, "data_channel_id", (String) null), cgl.d(strA, j));
        bundle2.putInt("type", iA);
        if (iA == 14) {
            bundle2.putInt("incoming_type", 7);
        }
        bundle2.putString("packagename", strA);
        bundle2.putString("title", cgl.a(bundle, "data_extra_title", (String) null));
        bundle2.putInt("title_type", c(iA));
        bundle2.putString("data_category", cgl.a(bundle, "data_category", (String) null));
        if (this.m == -1) {
            this.m = SharedPreferenceManager.c("CONTENT_LENGTH", "CONTENT_LENGTH_SIZE", 240);
        }
        bundle2.putString("text", eeq.d(ncp.c(2, eeq.a(cgl.a(bundle, "data_extra_text", (String) null)), eeq.a("..."), this.m)));
        bundle2.putInt("text_type", 1);
        String strA2 = cgl.a(bundle, "data_extra_big_text", (String) null);
        LogUtil.a("NotificPush", "processPostedNotification notificationBigText=", strA2);
        if (!TextUtils.isEmpty(strA2)) {
            bundle2.putInt("big_text_type", 10);
            bundle2.putString("big_text", eeq.d(ncp.c(2, eeq.a(strA2), eeq.a("..."), this.m)));
        }
        String strA3 = cgl.a(bundle, "data_extra_sub_text", (String) null);
        LogUtil.a("NotificPush", "processPostedNotification notificationSubText=", strA3);
        if (!TextUtils.isEmpty(strA3)) {
            bundle2.putInt("sub_text_type", 9);
            bundle2.putString("sub_text", strA3);
        }
        bundle2.putInt("data_noty_id", bundle.getInt("data_noty_id", -1));
        bundle2.putString("data_extra_noty_key", cgl.a(bundle, "data_extra_noty_key", (String) null));
        bundle2.putString("data_extra_noty_harmony_alert", cgl.a(bundle, "data_extra_noty_harmony_alert", (String) null));
        bundle2.putBoolean("data_extra_send_call_no_wechat", bundle.getBoolean("data_extra_send_call_no_wechat", false));
        bundle2.putBoolean("data_extra_send_call_wechat", bundle.getBoolean("data_extra_send_call_wechat", false));
        if (bundle.getInt("liveType", 0) != 0) {
            LogUtil.a("NotificPush", "onNotificationPosted contains live body.");
            bundle2.putInt("liveOperation", bundle.getInt("liveOperation"));
            bundle2.putInt("liveKeepTime", bundle.getInt("liveKeepTime"));
            bundle2.putInt("liveType", bundle.getInt("liveType"));
            bundle2.putString("liveEvent", cgl.a(bundle, "liveEvent", (String) null));
            bundle2.putString("featureTitleText", cgl.a(bundle, "featureTitleText", (String) null));
            bundle2.putString("featureContentText", cgl.a(bundle, "featureContentText", (String) null));
            bundle2.putString("titleOverlay", cgl.a(bundle, "titleOverlay", (String) null));
            bundle2.putString("contentOverlay", cgl.a(bundle, "contentOverlay", (String) null));
            bundle2.putBoolean("externalEnable", bundle.getBoolean("externalEnable"));
            bundle2.putString("externalTitle", cgl.a(bundle, "externalTitle", (String) null));
            bundle2.putString("externalBody", cgl.a(bundle, "externalBody", (String) null));
        }
        if (i == 1 && TextUtils.isEmpty(cgl.a(bundle2, "reject_button_key", (String) null))) {
            bundle2.putInt("voip_type", 0);
        } else {
            bundle2.putInt("voip_type", i);
        }
        String strA4 = cgl.a(bundle, "pingList", (String) null);
        if (!TextUtils.isEmpty(strA4)) {
            bundle2.putString("pingList", strA4);
        }
        String string = bundle.getString(JsbMapKeyNames.H5_EXTRAS);
        if (!TextUtils.isEmpty(string)) {
            LogUtil.a("NotificPush", "tempBundle put extrasJsonValue=", string);
            bundle2.putString(JsbMapKeyNames.H5_EXTRAS, string);
        } else {
            LogUtil.a("NotificPush", "tempBundle put extrasJsonValue is empty");
        }
        String strA5 = cgl.a(bundle, "imageName", (String) null);
        if (!TextUtils.isEmpty(strA5)) {
            bundle2.putString("imageName", strA5);
            return bundle2;
        }
        LogUtil.a("NotificPush", "processPostedNotification imageName is empty");
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Bundle bundle) {
        Intent intent = new Intent(this, (Class<?>) HandleIntentService.class);
        intent.setAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
        intent.putExtras(bundle);
        try {
            startService(intent);
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted start to push notification msg");
        } catch (Exception e2) {
            ReleaseLogUtil.a("Notify_NotificPush", "onNotificationPosted startService: ", ExceptionUtils.c(e2));
            xjt.ab("startSendBroadcastToPhoneService occur exception");
        }
        if (CommonUtil.ai(BaseApplication.getContext())) {
            return;
        }
        LogUtil.a("NotificPush", "onNotificationPosted phoneService not running");
        lng.d(1001);
    }

    private int c(int i) {
        return this.ag.contains(Integer.valueOf(i)) ? 2 : 3;
    }

    private void e(Bundle bundle, Bundle bundle2) {
        int iB;
        if (bundle == null || bundle2 == null) {
            LogUtil.j("NotificPush", "onNotificationPosted processChannelPolicy inputBundle or tempBundle is null");
            return;
        }
        String strA = cgl.a(bundle, "data_channel_id", (String) null);
        bundle2.putString("data_channel_id", strA);
        for (cgp cgpVar : cgl.f1582b) {
            if (cgpVar == null) {
                LogUtil.j("NotificPush", "onNotificationPosted processChannelPolicy ChannelPolicy is null");
            } else {
                String strA2 = cgpVar.a();
                String strE = cgpVar.e();
                if (TextUtils.equals(cgl.a(bundle, MediaBrowserProtocol.DATA_PACKAGE_NAME, (String) null), strA2) && !TextUtils.isEmpty(strA) && strA.contains(strE)) {
                    LogUtil.a("NotificPush", "onNotificationPosted processChannelPolicy matched.");
                    iB = cgpVar.b();
                    bundle2.putInt("data_extra_reminder_status", iB);
                    ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted reminderStatus is(15=0x000F=vibrate): ", Integer.valueOf(iB));
                }
            }
        }
        iB = 15;
        bundle2.putInt("data_extra_reminder_status", iB);
        ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted reminderStatus is(15=0x000F=vibrate): ", Integer.valueOf(iB));
    }

    private boolean b(String str, StatusBarNotification statusBarNotification) {
        if (!DeviceUtil.b()) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because HAS_NO_DEVICE,pkg=", str);
            return false;
        }
        if (eei.e() == 1) {
            w();
            this.af++;
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because SYNERGY_IN_CHARGE,pkg=", str);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            linkedHashMap.put("notificationFilteredBySynergyChannelPkg", str);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
            return false;
        }
        if (!NotificationContentProviderUtil.i()) {
            DeviceUtil.d(this, true, null);
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because DEVICE_CAPABILITY_INCAPABLE,pkg=", str);
            return false;
        }
        if (!a(statusBarNotification, str)) {
            LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(1);
            linkedHashMap2.put("notificationFilteredByAppSubSwitchClosePkg", str);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap2);
            return false;
        }
        if (k()) {
            return true;
        }
        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because MASTER_SWITCH_TURN_OFF,pkg=", str);
        LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>(1);
        linkedHashMap3.put("notificationFilteredByMainSwitchClosePkg", str);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap3);
        return false;
    }

    private boolean d(String str) {
        if (NotificationContentProviderUtil.a(str)) {
            return true;
        }
        return this.n.contains(str);
    }

    private boolean k() {
        return NotificationContentProviderUtil.b();
    }

    private boolean a(StatusBarNotification statusBarNotification, String str) {
        Notification notification = statusBarNotification.getNotification();
        if (!EnvironmentInfo.g() || notification.extras == null || notification.extras.getInt("notification.live.type", 0) == 0) {
            if (d(str)) {
                return true;
            }
            d(statusBarNotification, str);
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because SUB_SWITCH_TURN_OFF,pkg=", str);
            return false;
        }
        boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_TYPE", "SUPPORT_NOTIFY_LIVE_TYPE", false);
        ReleaseLogUtil.d("Notify_NotificPush", "supportNotifyLiveType176 :", Boolean.valueOf(zB));
        if (cgr.d(notification, str)) {
            new cgs().e(statusBarNotification);
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because watchIsSupportLive is true,message send by LiveNotificationHandle,pkg=", str);
            return false;
        }
        if (zB && cgl.e(notification, str)) {
            return cgl.g(str);
        }
        ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted FILTERED because packageName is not liveInfoWhiteList or not supportNotifyLiveType,pkg=", str);
        return false;
    }

    private void d(StatusBarNotification statusBarNotification, String str) {
        Notification notification = statusBarNotification.getNotification();
        if (cgr.d(notification, str)) {
            String key = statusBarNotification.getKey();
            if (notification != null) {
                long j = notification.when;
                Bundle bundle = notification.extras;
                if (bundle != null) {
                    try {
                        String strD = cgl.d(bundle);
                        String strA = cgl.a(bundle);
                        String strC = cop.c(strD);
                        String strE = cop.e(strA);
                        ReleaseLogUtil.d("Notify_NotificPush", "addLogPrintForLiveLevelApp pkgName:", str, ", when:", Long.valueOf(j), ", postTime:", Long.valueOf(statusBarNotification.getPostTime()));
                        LogUtil.a("NotificPush", "addLogPrintForLiveLevelApp key:", key, ", title:", strC, ", content:", strE);
                    } catch (IllegalArgumentException e2) {
                        LogUtil.e("NotificPush", "packageMessage IllegalArgumentException: ", ExceptionUtils.c(e2));
                    }
                }
            }
        }
    }

    private void s() {
        if (this.u == null) {
            lzk lzkVarC = lzk.c(this);
            this.u = lzkVarC;
            this.ai = lzkVarC.b();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.ai >= 3600000) {
            this.u.e(jCurrentTimeMillis);
            this.ai = jCurrentTimeMillis;
            this.u.a(this.ad);
            this.u.c(this.r);
            this.u.d(this.af);
            LogUtil.a("NotificPush", "mReceivedMessageNumber number is: ", Integer.valueOf(this.ad), " ,mFilteredMessageNumber is: ", Integer.valueOf(this.r), " ,mSynergyMessageNumber is: ", Integer.valueOf(this.af));
            this.ad = 0;
            this.r = 0;
            this.af = 0;
        }
    }

    private void p() {
        if (this.u == null) {
            lzk lzkVarC = lzk.c(this);
            this.u = lzkVarC;
            this.ab = lzkVarC.e();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.ab >= 86400000) {
            this.u.b(jCurrentTimeMillis);
            this.ab = jCurrentTimeMillis;
            this.u.a();
        }
    }

    private void w() {
        if (CommonUtil.bg() || CommonUtil.bd()) {
            return;
        }
        if (this.u == null) {
            this.u = lzk.c(this);
        }
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            str = "1";
        }
        this.u.d("midware", str, OperationKey.NOTIFY_MIDWARE_USE_2129005.value());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    private boolean d(String str, String str2, String str3) {
        boolean z;
        a aVar = this.aa.get(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (aVar != null) {
            String strB = aVar.b();
            String strC = aVar.c();
            if (jCurrentTimeMillis - aVar.a() < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS && TextUtils.equals(str3, strB) && TextUtils.equals(str2, strC)) {
                ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because SAME_CONTENT_TITLE_IN_3S,pkg=", str);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        a aVar2 = new a();
        aVar2.d(jCurrentTimeMillis);
        aVar2.a(str2);
        aVar2.d(str3);
        this.aa.put(str, aVar2);
        a(this.g, this.aa, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, "isSameContent");
        return z;
    }

    private void a(TimerTask timerTask, Map map, long j, String str) {
        timerTask.cancel();
        LogUtil.a("NotificPush", str, " timerTask been canceled");
        try {
            f5387b.schedule(c(map, str), j);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            ReleaseLogUtil.a("NotificPush", "activeClearMapTimerTaskAfterGap exception: ", ExceptionUtils.c(e2));
        }
    }

    private TimerTask c(final Map map, final String str) {
        return new TimerTask() { // from class: com.huawei.bone.ui.setting.NotificationPushListener.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                map.clear();
                ReleaseLogUtil.d("Notify_NotificPush", str, " map been cleared");
            }
        };
    }

    private boolean e(String str, String str2) {
        Map<String, Long> map = this.k;
        if (map == null || map.size() == 0) {
            return false;
        }
        Long l = this.k.get(str2 + str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (l == null || jCurrentTimeMillis - l.longValue() > 500) {
            return false;
        }
        this.k.remove(str2 + str);
        LogUtil.a("NotificPush", "onNotificationPosted WARNING: ", str2 + str, " has same value,when: ", l);
        return true;
    }

    private boolean e(Bundle bundle, String str, int i, String str2) {
        boolean zE;
        if (TextUtils.isEmpty(str)) {
            zE = false;
        } else {
            if (cgl.a(str2) && str.equalsIgnoreCase(NotificationCompat.CATEGORY_CALL)) {
                ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because CATEGORY_IS_CALL,pkg=", str2);
                return true;
            }
            zE = e(bundle, str, str2, i);
            if (TextUtils.equals(str2, "com.whatsapp") && lmq.a() && zE) {
                ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted filter by samsung phone whatsapp voipCalling");
                return true;
            }
            if (TextUtils.equals(str2, "jp.naver.line.android") && lmq.a() && Build.VERSION.SDK_INT > 33 && zE) {
                ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted filter by samsung phone Line voipCalling");
                return true;
            }
            if (zE && !TextUtils.equals(str2, "com.tencent.mm")) {
                ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted continue: ", str2, " is NOT_WECHAT and received a RING_CALL");
                if (TextUtils.equals(str2, "org.telegram.messenger")) {
                    this.as = bundle.getString("data_extra_title", "");
                }
                bundle.putBoolean("data_extra_send_call_no_wechat", true);
                return false;
            }
        }
        if ((i & 32) == 32 && !zE) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_NO_CLEAR,pkg=", str2);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            linkedHashMap.put("notificationFilteredByNoClearPkg", str2);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
            return true;
        }
        if (("com.sdu.didi.psnger".equalsIgnoreCase(str2) || "com.ubercab".equalsIgnoreCase(str2) || "com.didiglobal.passenger".equalsIgnoreCase(str2)) && (i & 256) == 256) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_LOCAL_ONLY,pkg=", str2);
            return true;
        }
        if ((i & 2) == 2) {
            if (zE) {
                ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted continue: ", str2, " is WECHAT and received a RING_CALL");
                bundle.putBoolean("data_extra_send_call_wechat", true);
                return false;
            }
            if (c(cgl.a(bundle, "data_channel_id", (String) null), str2)) {
                LogUtil.a("NotificPush", "onNotificationPosted continue: ", str2, " channel is CHANNEL_ID_SHOW_BADGE");
                return false;
            }
            LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(1);
            linkedHashMap2.put("notificationFilteredByOngoingPkg", str2);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap2);
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_ONGOING_EVENT,pkg=", str2);
            return true;
        }
        if (d(bundle, str, i, str2) || a(bundle, str2)) {
            return true;
        }
        if ((i & 512) == 512 && !cgl.d() && !zE) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_GROUP_SUMMARY,pkg=", str2);
            LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>(1);
            linkedHashMap3.put("notificationFilteredByGroupSummaryPkg", str2);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap3);
            return true;
        }
        if (!TextUtils.equals(str2, "com.android.server.telecom") || i != 16) {
            return false;
        }
        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because PACKAGE_NAME_TELECOM && flags=0x10,pkg=", str2);
        return true;
    }

    private boolean c(String str, String str2) {
        return "com.tencent.mobileqq".equals(str2) && "CHANNEL_ID_SHOW_BADGE".equals(str);
    }

    private boolean d(Bundle bundle, String str, int i, String str2) {
        String strA = cgl.a(bundle, "data_channel_id", (String) null);
        if ("com.whatsapp".equals(str2) && i == 32768 && !TextUtils.isEmpty(str) && str.toLowerCase(Locale.ROOT).contains("progress") && !TextUtils.isEmpty(strA) && strA.toLowerCase(Locale.ROOT).contains("sending_media")) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_ONGOING_EVENT,pkg=", str2);
            return true;
        }
        if (!"com.huawei.photos".equals(str2) || !strA.toLowerCase(Locale.ROOT).contains("download")) {
            return false;
        }
        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_DEFAULT_VALUE,pkg=", str2);
        return true;
    }

    private boolean a(Bundle bundle, String str) {
        String strA = cgl.a(bundle, "data_channel_id", (String) null);
        d(str, strA);
        if ("com.cdrcbperson.mobilebank".equals(str) && "com.cdrcbperson.mobilebank.download".equals(strA)) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_ONGOING_EVENT,pkg=", str);
            return true;
        }
        if ("com.zeekrlife.mobile".equals(str) && "app_download_channel".equals(strA)) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_ONGOING_EVENT,pkg=", str);
            return true;
        }
        String strA2 = cgl.a(bundle, "data_groupKey", (String) null);
        int i = bundle.getInt("data_flags");
        if ("com.sankuai.meituan.takeoutnew".equals(str) && i == 0 && TextUtils.isEmpty(strA2)) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_DEFAULT_VALUE,pkg=", str);
            return true;
        }
        if ("com.sankuai.meituan".equals(str) && strA.contains("download")) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_DEFAULT_VALUE,pkg=", str);
            return true;
        }
        if ("com.taobao.taobao".equals(str) && strA.contains("update_channel")) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_DEFAULT_VALUE,pkg=", str);
            return true;
        }
        if ("com.MobileTicket".equals(str) && strA.toLowerCase(Locale.ROOT).contains("download")) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_DEFAULT_VALUE,pkg=", str);
            return true;
        }
        if ("cn.damai".equals(str) && strA.toLowerCase(Locale.ROOT).contains("update")) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_DEFAULT_VALUE,pkg=", str);
            return true;
        }
        if ("com.eg.android.AlipayGphone".equals(str) && strA.toLowerCase(Locale.ROOT).contains("download")) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_DEFAULT_VALUE,pkg=", str);
            return true;
        }
        if ("com.baidu.searchbox".equals(str) && strA.toLowerCase(Locale.ROOT).contains("download")) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because FLAG_DEFAULT_VALUE,pkg=", str);
            return true;
        }
        if ("com.tencent.mobileqq".equals(str) && "CHANNEL_ID_HIDE_BADGE".equals(strA)) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because QQ_CHANNEL_ID_HIDE_BADGE,pkg=", str);
            return true;
        }
        if (!"com.cib.cibmb".equals(str) || !"com.cib.cibmb".equals(strA)) {
            return false;
        }
        ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted FILTERED because CIBMB_CHANNEL_ID_COM.CIB.CIBMB,pkg=", str);
        return true;
    }

    private void d(String str, String str2) {
        String string;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("_")) {
            string = Arrays.asList(lowerCase.split("_")).toString();
        } else {
            string = lowerCase.contains(".") ? Arrays.asList(lowerCase.split("\\.")).toString() : lowerCase;
        }
        if (string != null) {
            if (string.contains("download") || string.contains("update")) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
                linkedHashMap.put("notificationFilterByUpgradePkg", str);
                linkedHashMap.put("notificationFilterByUpgradeValue", lowerCase);
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
            }
        }
    }

    private boolean b(Bundle bundle, Notification notification, boolean z) {
        if (!SystemInfo.d() || !EmuiBuild.f36544b || !CommonUtil.cm()) {
            LogUtil.j("NotificPush", "this phone is not HuaweiSeaOverlayPhone.");
            return false;
        }
        boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_VOIP_TYPE", "SUPPORT_NOTIFY_VOIP_TYPE", false);
        boolean zB2 = SharedPreferenceManager.b("SUPPORT_NOTIFY_VOIP_SIGNAL_TYPE", "SUPPORT_NOTIFY_VOIP_SIGNAL_TYPE", false);
        String strA = cgl.a(bundle, MediaBrowserProtocol.DATA_PACKAGE_NAME, (String) null);
        if (zB2 && "com.viber.voip".equals(strA)) {
            return chc.c(strA).isPushVoipCalling(f5388c, this.p, bundle, notification, z);
        }
        if (zB && Arrays.asList("com.whatsapp", "com.facebook.orca", "jp.naver.line.android", "com.instagram.android", "org.telegram.messenger").contains(strA)) {
            return chc.c(strA).isPushVoipCalling(f5388c, this.p, bundle, notification, z);
        }
        LogUtil.j("NotificPush", "device is not supportVoipType or package is not supportVoip.");
        return false;
    }

    private boolean e(Bundle bundle, String str, String str2, int i) {
        boolean z = false;
        if (str.equalsIgnoreCase(NotificationCompat.CATEGORY_CALL) && this.ae.contains(str2)) {
            String strA = cgl.a(bundle, "data_extra_noty_key", (String) null);
            boolean zE = cgl.o(str2) ? e(bundle, str2) : true;
            if (!cgl.i(str2)) {
                z = zE;
            } else if ((i & 2) == 2) {
                z = true;
            }
            ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted ", strA, " isRingCallAndNeedPosted? ", Boolean.valueOf(z));
        }
        return z;
    }

    private boolean e(Bundle bundle, String str) {
        chb chbVar = f5388c;
        if (chb.e.containsKey(str)) {
            ReleaseLogUtil.e("Notify_NotificPush", "onNotificationPosted WILL FILTERED because whatsappResendLongVibrate!");
            return false;
        }
        chbVar.d(str);
        return TextUtils.equals("call_notification_group", cgl.a(bundle, "data_groupKey", (String) null));
    }

    private void c(StatusBarNotification statusBarNotification, Bundle bundle, String str) {
        if (TextUtils.isEmpty(str) || !this.aj.contains(str)) {
            return;
        }
        Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
        String key = statusBarNotification.getKey();
        if (actionArr == null || actionArr.length == 0) {
            LogUtil.j("NotificPush", "onNotificationPosted quickReply INCAPABLE! ", str, " has no action button in statusBar");
            return;
        }
        for (int i = 0; i < actionArr.length; i++) {
            Notification.Action action = actionArr[i];
            if (action != null) {
                if (action.getRemoteInputs() != null) {
                    ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted quickReply SUPPORT by No.", Integer.valueOf(i + 1), " button named ", actionArr[i].title, ",key: ", key);
                    bundle.putString("notification_key", key);
                    return;
                }
                ReleaseLogUtil.d("Notify_NotificPush", "onNotificationPosted quickReply INCAPABLE by No.", Integer.valueOf(i + 1), " button named ", actionArr[i].title, " in ", str);
            }
        }
    }

    private void q() {
        if (this.z == null) {
            this.z = new c();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.health.action.ACTION_NOTIFICATION_PUSH");
            intentFilter.addAction("com.huawei.health.action.ACTION_NOTIFICATION_LEVEL");
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.z, intentFilter);
        }
        if (this.j == null) {
            this.j = new b();
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addDataScheme("package");
            BroadcastManagerUtil.c(BaseApplication.getContext(), this.j, intentFilter2, LocalBroadcast.f36595c, null);
        }
    }

    protected static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f5399a = 0;
        private String e = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5400c = "";

        protected a() {
        }

        public long a() {
            return this.f5399a;
        }

        public void d(long j) {
            this.f5399a = j;
        }

        public String b() {
            return this.f5400c;
        }

        public void d(String str) {
            this.f5400c = str;
        }

        public String c() {
            return this.e;
        }

        public void a(String str) {
            this.e = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = this.l.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next())) {
                return true;
            }
        }
        return false;
    }

    class c extends BroadcastReceiver {
        private c() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:39:0x0090  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            byte b2;
            if (intent == null) {
                LogUtil.j("NotificPush", "deviceReply broadcast get intent is null");
                return;
            }
            if (!"com.huawei.health.action.ACTION_NOTIFICATION_PUSH".equals(intent.getAction()) && !"com.huawei.health.action.ACTION_NOTIFICATION_LEVEL".equals(intent.getAction())) {
                LogUtil.j("NotificPush", "deviceReply broadcast get intent NOT_ACTION_NOTIFICATION_PUSH_WARNING is: ", intent.getAction());
                return;
            }
            String stringExtra = intent.getStringExtra("action_type");
            if (TextUtils.isEmpty(stringExtra)) {
                LogUtil.j("NotificPush", "deviceReply broadcast get type is null.");
                return;
            }
            stringExtra.hashCode();
            switch (stringExtra) {
                case "CONTENT_MAIN_SWITCH_CHANGE":
                    b2 = 0;
                    break;
                case "VOIP":
                    b2 = 1;
                    break;
                case "key_replay":
                    b2 = 2;
                    break;
                case "CONTENT_LENGTH":
                    b2 = 3;
                    break;
                case "NOTIFICATION_LEVEL":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 == 1) {
                    c(intent);
                    return;
                }
                if (b2 == 2) {
                    e(intent);
                    return;
                }
                if (b2 == 3) {
                    NotificationPushListener.this.m = intent.getIntExtra("CONTENT_LENGTH_SIZE", 240);
                    LogUtil.j("NotificPush", "deviceReply broadcast mContentLength: ", Integer.valueOf(NotificationPushListener.this.m));
                    return;
                } else if (b2 != 4) {
                    LogUtil.j("NotificPush", "deviceReply broadcast get type is other.");
                    return;
                }
            }
            LogUtil.a("NotificPush", "onReceive ", stringExtra, "register");
            if (!NotificationPushListener.this.o()) {
                LogUtil.a("NotificPush", "harmony less 4.0 not support filter");
            } else {
                NotificationPushListener notificationPushListener = NotificationPushListener.this;
                notificationPushListener.b((List<String>) notificationPushListener.e());
            }
        }

        private void c(Intent intent) {
            String stringExtra = intent.getStringExtra("key_replay_destination");
            String stringExtra2 = intent.getStringExtra("key_replay_content");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
                LogUtil.j("NotificPush", "sendVoipAction broadcast EMPTY_WARNING content: ", stringExtra2, ",key: ", stringExtra);
                return;
            }
            LogUtil.a("NotificPush", "sendVoipAction DaemonService get content: ", stringExtra2, ",key: ", stringExtra);
            StatusBarNotification statusBarNotificationB = b(stringExtra);
            if (statusBarNotificationB != null) {
                d(statusBarNotificationB, stringExtra2);
            }
        }

        private StatusBarNotification b(String str) {
            try {
                for (StatusBarNotification statusBarNotification : NotificationPushListener.this.getActiveNotifications()) {
                    if (statusBarNotification != null && str.equals(statusBarNotification.getKey())) {
                        return statusBarNotification;
                    }
                }
                return null;
            } catch (SecurityException e) {
                LogUtil.e("NotificPush", "packageMessage occur exception:", ExceptionUtils.c(e));
                xjt.ab("getStatusBarNotification occur exception");
                return null;
            }
        }

        public void d(StatusBarNotification statusBarNotification, String str) {
            LogUtil.j("NotificPush", "deviceVOIPNotification");
            if (statusBarNotification == null) {
                LogUtil.j("NotificPush", "deviceReply StatusBarNotification is null");
                return;
            }
            Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
            String packageName = statusBarNotification.getPackageName();
            if (actionArr == null || actionArr.length == 0) {
                LogUtil.a("NotificPush", "VOIP " + packageName, " has no action button so that deviceReply INCAPABLE!");
                return;
            }
            for (Notification.Action action : actionArr) {
                if (action != null) {
                    PendingIntent pendingIntent = action.actionIntent;
                    try {
                        Intent intent = (Intent) PendingIntent.class.getDeclaredMethod("getIntent", new Class[0]).invoke(pendingIntent, new Object[0]);
                        LogUtil.a("NotificPush", "VOIP  intent.getAction() is ", intent.getAction());
                        a(str, packageName, pendingIntent, intent);
                        if (!"jp.naver.line.android".equals(packageName) && intent.getAction() != null && intent.getAction().equals(str)) {
                            Intent intent2 = new Intent();
                            intent2.setAction(str);
                            intent2.setPackage(packageName);
                            pendingIntent.send(BaseApplication.getContext(), 0, intent);
                        }
                    } catch (Exception e) {
                        LogUtil.e("NotificPush", "packageMessage occur exception:", ExceptionUtils.c(e));
                        xjt.ab("deviceVOIPNotification occur exception");
                    }
                }
            }
        }

        private void a(String str, String str2, PendingIntent pendingIntent, Intent intent) throws PendingIntent.CanceledException {
            if ("jp.naver.line.android".equals(str2)) {
                if (intent.getComponent().getClassName() != null && "com.linecorp.voip2.common.VoIPActionReceiver".equals(intent.getComponent().getClassName())) {
                    Intent intent2 = new Intent();
                    intent2.setAction(str);
                    intent2.setComponent(new ComponentName(str2, "com.linecorp.voip2.common.VoIPActionReceiver"));
                    intent2.setPackage(str2);
                    pendingIntent.send(BaseApplication.getContext(), 0, intent);
                    return;
                }
                if (intent.getAction() == null || !intent.getAction().equals(str)) {
                    return;
                }
                Intent intent3 = new Intent();
                intent3.setAction(str);
                intent3.setPackage(str2);
                pendingIntent.send(BaseApplication.getContext(), 0, intent);
            }
        }

        private void e(Intent intent) {
            String stringExtra = intent.getStringExtra("key_replay_destination");
            String stringExtra2 = intent.getStringExtra("key_replay_content");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
                LogUtil.j("NotificPush", "deviceReply broadcast EMPTY_WARNING content: ", stringExtra2, ",key: ", stringExtra);
                return;
            }
            LogUtil.a("NotificPush", "deviceReply DaemonService get content: ", cop.e(stringExtra2), ",key: ", stringExtra);
            StatusBarNotification statusBarNotificationB = b(stringExtra);
            if (statusBarNotificationB != null) {
                if (NotificationPushListener.this.b(statusBarNotificationB.getPackageName())) {
                    NotificationPushListener.this.b(stringExtra, stringExtra2);
                }
                mir.b(statusBarNotificationB, stringExtra2);
                ReleaseLogUtil.d("Notify_NotificPush", "deviceReply broadcast succeed in replying");
                return;
            }
            ReleaseLogUtil.d("Notify_NotificPush", "deviceReply broadcast get StatusBarNotification is null by key: ", stringExtra);
            Intent intent2 = new Intent(NotificationPushListener.this, (Class<?>) HandleIntentService.class);
            intent2.setAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
            Bundle bundle = new Bundle();
            bundle.putString("notificationSwitchChangeType", "notificationReplayChangeType");
            intent2.putExtras(bundle);
            try {
                NotificationPushListener.this.startService(intent2);
                ReleaseLogUtil.d("Notify_NotificPush", "deviceReply broadcast build one intent successfully");
            } catch (IllegalStateException | SecurityException e) {
                ReleaseLogUtil.a("Notify_NotificPush", "deviceReply broadcast startService ERROR: ", ExceptionUtils.c(e));
                xjt.ab("quickReplyProcedure occur exception");
            }
        }
    }

    class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            String str;
            if (intent == null) {
                LogUtil.j("NotificPush", "mAppInstalledReceiver intent is null");
                return;
            }
            if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
                LogUtil.j("NotificPush", "mAppInstalledReceiver is:", intent.getAction());
                return;
            }
            String dataString = intent.getDataString();
            LogUtil.a("NotificPush", "intentInfo is :", dataString);
            if (TextUtils.isEmpty(dataString)) {
                LogUtil.j("NotificPush", "appInstalled intentInfo is empty.");
                return;
            }
            String[] strArrSplit = dataString.split(":");
            if (strArrSplit.length > 1) {
                str = strArrSplit[1];
            } else {
                str = strArrSplit[0];
            }
            LogUtil.a("NotificPush", "mAppInstalledReceiver packageName:", str);
            if (NotificationContentProviderUtil.f()) {
                boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_TYPE", "SUPPORT_NOTIFY_LIVE_TYPE", false);
                boolean zB2 = SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", "SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", false);
                String strB = SharedPreferenceManager.b("NOTIFY_LIVE_LEVEL_VALUE", "NOTIFY_LIVE_LEVEL_VALUE", "levelDefault");
                LogUtil.a("NotificPush", "getLiveNotificationCloudList hasNotifyLiveCapability is ", Boolean.valueOf(zB), ",  hasNotifyLiveLevelCapability is ", Boolean.valueOf(zB2), ",  notifyLiveLevel is " + strB);
                List arrayList = new ArrayList();
                if (zB2) {
                    arrayList = NotificationContentProviderUtil.e(strB);
                } else if (zB) {
                    arrayList = NotificationContentProviderUtil.d();
                }
                if (arrayList.contains(str)) {
                    NotificationPushListener notificationPushListener = NotificationPushListener.this;
                    notificationPushListener.b((List<String>) notificationPushListener.e());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.k.put(str + str2, Long.valueOf(jCurrentTimeMillis));
        a(this.x, this.k, 500L, "initDeviceReplyResendFilter");
        LogUtil.a("NotificPush", "deviceReply initDeviceReplyResendFilter success,entry.key: ", str + str2, " deviceReplyTime: ", Long.valueOf(jCurrentTimeMillis));
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientChange(boolean z) {
        IMusicChangedCallback iMusicChangedCallback;
        LogUtil.a("NotificPush", "onClientChange result: ", Boolean.valueOf(z));
        this.d = z;
        if (!z || (iMusicChangedCallback = this.an) == null) {
            return;
        }
        try {
            iMusicChangedCallback.onMusicChanged();
        } catch (RemoteException unused) {
            LogUtil.a("NotificPush", "onClientChange error");
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i) {
        LogUtil.a("NotificPush", "onClientPlaybackStateUpdate result: ", Integer.valueOf(i));
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i, long j, long j2, float f) {
        LogUtil.a("NotificPush", "onClientPlaybackStateUpdate state: ", Integer.valueOf(i));
        if (this.am != i) {
            this.am = i;
            IMusicChangedCallback iMusicChangedCallback = this.an;
            if (iMusicChangedCallback != null) {
                try {
                    iMusicChangedCallback.onMusicChanged();
                } catch (RemoteException unused) {
                    LogUtil.a("NotificPush", "onClientMetadataUpdate error");
                }
            }
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientTransportControlUpdate(int i) {
        LogUtil.a("NotificPush", "onClientTransportControlUpdate ", Integer.valueOf(i));
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientMetadataUpdate(RemoteController.MetadataEditor metadataEditor) {
        LogUtil.a("NotificPush", "onClientMetadataUpdate");
        if (TextUtils.equals(this.ak, metadataEditor.getString(7, ""))) {
            return;
        }
        LogUtil.a("NotificPush", "onClientMetadataUpdate has name");
        c(metadataEditor);
        IMusicChangedCallback iMusicChangedCallback = this.an;
        if (iMusicChangedCallback != null) {
            try {
                iMusicChangedCallback.onMusicChanged();
            } catch (RemoteException unused) {
                LogUtil.a("NotificPush", "onClientMetadataUpdate error");
            }
        }
    }

    public void c(RemoteController.MetadataEditor metadataEditor) {
        String string = metadataEditor.getString(7, "");
        this.ak = string;
        LogUtil.a("NotificPush", "musicTitle is ", string);
        String string2 = metadataEditor.getString(2, "");
        this.ap = string2;
        LogUtil.a("NotificPush", "singerName is ", string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.a("NotificPush", "enter registerRemoteController");
        this.ao = new RemoteController(this, this);
        LogUtil.a("NotificPush", "registerRemoteController result: ", Boolean.valueOf(((AudioManager) getSystemService("audio")).registerRemoteController(this.ao)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        LogUtil.a("NotificPush", "enter unregistRemoteController");
        if (this.ao != null) {
            ((AudioManager) getSystemService("audio")).unregisterRemoteController(this.ao);
        }
        this.an = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.a("NotificPush", "onStartCommand");
        super.onStartCommand(intent, i, i2);
        LogUtil.a("NotificPush", "onStartCommand notification");
        Notification.Builder builderC = lsb.d().c();
        builderC.setAutoCancel(true);
        builderC.setPriority(0);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setGroup("NotificPush");
        startForeground(20211231, builderC.build());
        return 2;
    }
}

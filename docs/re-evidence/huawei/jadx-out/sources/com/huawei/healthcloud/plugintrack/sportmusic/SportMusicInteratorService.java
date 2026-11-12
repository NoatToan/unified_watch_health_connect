package com.huawei.healthcloud.plugintrack.sportmusic;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;

/* JADX INFO: loaded from: classes10.dex */
public class SportMusicInteratorService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SportMusicController f10638c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SportMusicInteratorBroadcastReceiver f10636a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f10637b = new a();
    private LocalBroadcastManager d = null;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.a("Track_SportMusicInteratorService", "onStartCommand ", Integer.valueOf(i), " ", Integer.valueOf(i2));
        super.onStartCommand(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        try {
            LocalBroadcastManager localBroadcastManager = this.d;
            if (localBroadcastManager == null) {
                LogUtil.j("Track_SportMusicInteratorService", "onDestroy mLocalBroadcastManager is null");
            } else {
                localBroadcastManager.unregisterReceiver(this.f10636a);
            }
        } catch (IllegalArgumentException e) {
            LogUtil.j("Track_SportMusicInteratorService", "onDestroy ", e.getMessage());
        }
        LogUtil.a("Track_SportMusicInteratorService", "onDestroy");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f10638c = SportMusicController.c();
        this.f10636a = new SportMusicInteratorBroadcastReceiver(this.f10637b);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_stop_play_sport_music");
        intentFilter.addAction("action_send_steprate_to_hwmusic");
        intentFilter.addAction("action_next_song");
        intentFilter.addAction("action_pause_song");
        intentFilter.addAction("action_play_song");
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        this.d = localBroadcastManager;
        if (localBroadcastManager == null) {
            LogUtil.j("Track_SportMusicInteratorService", "onCreate mLocalBroadcastManager is null");
        } else {
            localBroadcastManager.registerReceiver(this.f10636a, intentFilter);
        }
        LogUtil.a("Track_SportMusicInteratorService", "onCreate");
    }

    public static class SportMusicInteratorBroadcastReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f10639b;

        public SportMusicInteratorBroadcastReceiver(Handler handler) {
            this.f10639b = handler;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("Track_SportMusicInteratorService", "intent or action is null");
                return;
            }
            if (this.f10639b == null) {
                LogUtil.j("Track_SportMusicInteratorService", "mHandler is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("Track_SportMusicInteratorService", intent.getPackage(), ":", action);
            if ("action_stop_play_sport_music".equals(action)) {
                Message messageObtainMessage = this.f10639b.obtainMessage(2002);
                Bundle bundleExtra = intent.getBundleExtra("extroInfo");
                messageObtainMessage.setData(bundleExtra);
                if (bundleExtra == null) {
                    messageObtainMessage.arg1 = -1;
                }
                this.f10639b.sendMessage(messageObtainMessage);
                this.f10639b.sendMessageDelayed(this.f10639b.obtainMessage(2006), 100L);
                return;
            }
            if ("action_send_steprate_to_hwmusic".equals(action)) {
                Message messageObtainMessage2 = this.f10639b.obtainMessage(2003);
                messageObtainMessage2.arg1 = intent.getIntExtra("stepRate", 0);
                this.f10639b.sendMessage(messageObtainMessage2);
            } else if ("action_next_song".equals(action)) {
                this.f10639b.sendMessage(this.f10639b.obtainMessage(2001));
            } else if ("action_pause_song".equals(action)) {
                this.f10639b.sendMessage(this.f10639b.obtainMessage(2004));
            } else if (!"action_play_song".equals(action)) {
                LogUtil.e("Track_SportMusicInteratorService", "other action");
            } else {
                this.f10639b.sendMessage(this.f10639b.obtainMessage(2005));
            }
        }
    }

    class a extends Handler {
        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            LogUtil.a("Track_SportMusicInteratorService", "handle msg : ", Integer.valueOf(message.what));
            if (message.what == 2006) {
                try {
                    d();
                    return;
                } catch (IllegalArgumentException e) {
                    LogUtil.e("Track_SportMusicInteratorService", "handler ", e.getMessage());
                    return;
                }
            }
            if (SportMusicInteratorService.this.f10638c == null) {
                LogUtil.j("Track_SportMusicInteratorService", "mController is null");
            }
            switch (message.what) {
                case 2001:
                    SportMusicInteratorService.this.f10638c.a(3, (String) null);
                    break;
                case 2002:
                    if (message.arg1 == -1) {
                        SportMusicInteratorService.this.f10638c.d((Bundle) null);
                    } else {
                        SportMusicInteratorService.this.f10638c.d(message.getData());
                    }
                    break;
                case 2003:
                    SportMusicInteratorService.this.f10638c.b(message.arg1);
                    break;
                case 2004:
                    SportMusicInteratorService.this.f10638c.a(1, (String) null);
                    break;
                case 2005:
                    SportMusicInteratorService.this.f10638c.a(2, (String) null);
                    break;
            }
        }

        private void d() {
            if (SportMusicInteratorService.this.f10638c != null) {
                SportMusicInteratorService.this.f10638c.e();
            }
            Intent intent = new Intent(SportMusicInteratorService.this.getApplicationContext(), (Class<?>) SportMusicInteratorService.class);
            intent.setAction("action_stop_sport_music_interator_service");
            SportMusicInteratorService.this.getApplicationContext().stopService(intent);
        }
    }

    public static void d() {
        LogUtil.a("Track_SportMusicInteratorService", "startSportMusicService");
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) SportMusicInteratorService.class);
        intent.setAction("action_start_sport_music_interator_service");
        try {
            BaseApplication.getContext().startService(intent);
        } catch (IllegalArgumentException | IllegalStateException e) {
            LogUtil.e("Track_SportMusicInteratorService", "startSportMusicService ", LogAnonymous.b(e));
        }
    }

    public static void a() {
        LogUtil.a("Track_SportMusicInteratorService", "stopSportMusicService");
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) SportMusicInteratorService.class);
        intent.setAction("action_stop_sport_music_interator_service");
        try {
            BaseApplication.getContext().stopService(intent);
        } catch (IllegalArgumentException | IllegalStateException e) {
            LogUtil.e("Track_SportMusicInteratorService", "stopSportMusicService ", LogAnonymous.b(e));
        }
    }
}

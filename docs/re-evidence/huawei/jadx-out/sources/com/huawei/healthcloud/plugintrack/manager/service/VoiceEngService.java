package com.huawei.healthcloud.plugintrack.manager.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.healthcloud.plugintrack.manager.voice.PrimaryVoicePlayManager;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.iyb;
import defpackage.jau;
import defpackage.lso;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceEngService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f10475a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f10477c;
    private Handler d;
    private Context e;
    private PrimaryVoicePlayManager j;
    private long g = 0;
    private long f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10476b = false;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("Track_VoiceEngService", "onCreate");
        this.e = getApplicationContext();
        this.d = new Handler();
        IntentFilter intentFilter = new IntentFilter("action_voice_soundpool_enge");
        intentFilter.addAction("action_play_voice");
        intentFilter.addAction("action_stop_voice");
        intentFilter.addAction("action_start_audio");
        intentFilter.addAction("action_pause_audio");
        intentFilter.addAction("action_resume_audio");
        intentFilter.addAction("action_mute_audio_volume");
        intentFilter.addAction("action_resume_audio_volume");
        intentFilter.addAction("action_stop_service");
        intentFilter.addAction("ACTION_RESET_MEDIA_IDLE");
        a aVar = new a();
        this.f10477c = aVar;
        iyb.d(this.e, aVar, intentFilter);
        this.j = new PrimaryVoicePlayManager(this.e);
        if (this.f10475a == null) {
            this.f10475a = new c(this);
        }
        lso.d(this.e, true, (lso.e) this.f10475a);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.d("Track_VoiceEngService", "onDestroy");
        iyb.a(this.e, this.f10477c);
        if (this.f < this.g && !CommonUtil.x(this.e)) {
            b();
        }
        PrimaryVoicePlayManager primaryVoicePlayManager = this.j;
        if (primaryVoicePlayManager != null) {
            primaryVoicePlayManager.c();
        }
        lso.d(this.e, false, (lso.e) this.f10475a);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.d("Track_VoiceEngService", "onStartCommand");
        super.onStartCommand(intent, i, i2);
        a(intent);
        this.g = System.currentTimeMillis();
        this.d.removeCallbacksAndMessages(null);
        a();
        return 2;
    }

    class a extends BroadcastReceiver {
        private a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("Track_VoiceEngService", "onReceive", "intent = null");
            }
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("player_name_key");
            ReleaseLogUtil.d("Track_VoiceEngService", "onReceive action = ", action, " player name:", stringExtra);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "defaultPlayer";
            }
            action.hashCode();
            switch (action) {
                case "action_mute_audio_volume":
                    VoiceEngService.this.j.d(stringExtra);
                    break;
                case "action_play_voice":
                    if (VoiceEngService.this.f10476b) {
                        LogUtil.j("Track_VoiceEngService", "is Calling.do not insert voice.");
                        break;
                    } else {
                        VoiceEngService.this.j.a(stringExtra, intent);
                        break;
                    }
                    break;
                case "action_start_audio":
                    VoiceEngService.this.j.d(stringExtra, intent.getStringExtra("param_long_audio_url"));
                    break;
                case "action_pause_audio":
                    VoiceEngService.this.j.b(stringExtra);
                    break;
                case "ACTION_RESET_MEDIA_IDLE":
                    VoiceEngService.this.j.c(stringExtra);
                    break;
                case "action_stop_voice":
                    VoiceEngService.this.j.j(stringExtra);
                    break;
                case "action_resume_audio":
                    VoiceEngService.this.j.a(stringExtra);
                    break;
                case "action_resume_audio_volume":
                    VoiceEngService.this.j.e(stringExtra);
                    break;
                case "action_stop_service":
                    VoiceEngService.this.e();
                    break;
                default:
                    LogUtil.a("Track_VoiceEngService", "Invalid action");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("Track_VoiceEngService", "stopEngine() enter");
        this.d.postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.manager.service.VoiceEngService.2
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("Track_VoiceEngService", "stopEngine() run");
                VoiceEngService.this.f = System.currentTimeMillis();
                jau.c().e(false);
                VoiceEngService.this.stopSelf();
            }
        }, 25000L);
    }

    private void a(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("player_name_key");
        int intExtra = intent.getIntExtra("player_type_key", 0);
        ReleaseLogUtil.d("Track_VoiceEngService", "handleIntent", "intent action = ", action, " playerType:", Integer.valueOf(intExtra), " playerName:", stringExtra);
        if ("action_voice_soundpool_enge".equals(action)) {
            this.j.d(intExtra, stringExtra);
        }
    }

    private void b() {
        LogUtil.a("Track_VoiceEngService", "restartVoiceService() run");
        Intent intent = new Intent(this, (Class<?>) VoiceEngService.class);
        intent.setAction("action_voice_soundpool_enge");
        startService(intent);
    }

    private void a() {
        Intent intent = new Intent("checkserviceaction");
        Bundle bundle = new Bundle();
        bundle.putInt("SERVICETYPE", 1);
        intent.putExtras(bundle);
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    static class c extends lso.e {
        private final WeakReference<VoiceEngService> e;

        c(VoiceEngService voiceEngService) {
            this.e = new WeakReference<>(voiceEngService);
        }

        @Override // lso.e, android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            LogUtil.a("Track_VoiceEngService", "onCallStateChanged() enter , state is ", Integer.valueOf(i));
            VoiceEngService voiceEngService = this.e.get();
            if (voiceEngService == null) {
                LogUtil.j("Track_VoiceEngService", "voiceEngService == null");
                return;
            }
            if (i != 0) {
                if (i == 1 || i == 2) {
                    a(voiceEngService);
                    return;
                }
                return;
            }
            voiceEngService.f10476b = false;
            PrimaryVoicePlayManager primaryVoicePlayManager = voiceEngService.j;
            if (primaryVoicePlayManager != null) {
                primaryVoicePlayManager.d();
            }
        }

        private void a(VoiceEngService voiceEngService) {
            voiceEngService.f10476b = true;
            PrimaryVoicePlayManager primaryVoicePlayManager = voiceEngService.j;
            if (primaryVoicePlayManager != null) {
                primaryVoicePlayManager.a();
            }
        }
    }
}

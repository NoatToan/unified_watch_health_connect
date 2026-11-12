package com.huawei.healthcloud.plugintrack.trackanimation.recorder;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jev;
import defpackage.jfy;
import defpackage.jgg;
import defpackage.lsb;
import defpackage.qrs;
import defpackage.xjl;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class TrackRecordService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f10662c;
    private boolean d;
    private Handler e;
    private Intent f;
    private String g;
    private long h;
    private int i;
    private TrackRecorder j;
    private Uri n;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.e = new Handler(Looper.getMainLooper()) { // from class: com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecordService.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 15790320) {
                    LogUtil.a("Suggestion_TrackRecordService", "handleMessage: ", Integer.valueOf(message.what));
                    if (TrackRecordService.this.j != null) {
                        TrackRecordService trackRecordService = TrackRecordService.this;
                        trackRecordService.b(true ^ trackRecordService.j.isRunSuccess(), TrackRecordService.this.j.getVideoDuration());
                    } else {
                        TrackRecordService.this.b(true, 0L);
                    }
                    TrackRecordService.this.b();
                    TrackRecordService.this.stopSelf();
                }
            }
        };
        b();
        c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ats_track_record_stop");
        intentFilter.addAction("ats_track_record_stop_when_pause");
        LocalBroadcastManager.getInstance().registerReceiver(this.f10662c, intentFilter);
    }

    private void c() {
        this.f10662c = new BroadcastReceiver() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecordService.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    ReleaseLogUtil.e("Suggestion_TrackRecordService", "onReceive: intent is null");
                    return;
                }
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    ReleaseLogUtil.e("Suggestion_TrackRecordService", "onReceive: action is empty");
                    return;
                }
                ReleaseLogUtil.d("Suggestion_TrackRecordService", "onReceive: action : ", action);
                action.hashCode();
                if (!action.equals("ats_track_record_stop")) {
                    if (action.equals("ats_track_record_stop_when_pause") && TrackRecordService.this.j != null) {
                        TrackRecordService.this.j.stopScreenOnActive();
                        return;
                    }
                    return;
                }
                if (TrackRecordService.this.j != null) {
                    TrackRecordService.this.j.stopScreen();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, long j) {
        ReleaseLogUtil.d("Suggestion_TrackRecordService", "notifyRecordFinish: isRecordError = ", Boolean.valueOf(z), " videoDuration = ", Long.valueOf(j));
        Intent intent = new Intent("sta_track_record_finish");
        intent.putExtra("data_key_video_duration", j);
        intent.putExtra("data_key_video_record_error", z);
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f10662c != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.f10662c);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        b(intent);
        if (this.f == null) {
            LogUtil.j("Suggestion_TrackRecordService", "onStartCommand: mResultData is null");
            return 2;
        }
        a();
        Object systemService = getSystemService("media_projection");
        MediaProjectionManager mediaProjectionManager = systemService instanceof MediaProjectionManager ? (MediaProjectionManager) systemService : null;
        if (mediaProjectionManager != null) {
            e(mediaProjectionManager.getMediaProjection(this.i, this.f));
        }
        return 2;
    }

    private void b(Intent intent) {
        this.i = intent.getIntExtra("resultCode", -1);
        this.f = (Intent) intent.getParcelableExtra("data");
        this.h = intent.getLongExtra("duration", 0L);
        this.d = intent.getBooleanExtra("isShort", false);
        String stringExtra = intent.getStringExtra("mMusicResourcePath");
        String strB = jev.b();
        if (!TextUtils.isEmpty(stringExtra) && xjl.a(new File(stringExtra), strB)) {
            this.f10661b = stringExtra;
        }
        String stringExtra2 = intent.getStringExtra("mVideoPath");
        String strD = new jgg().d();
        if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(strD) && xjl.a(new File(stringExtra2), strD)) {
            this.g = stringExtra2;
        }
        LogUtil.a("Suggestion_TrackRecordService", "getDataFromIntent dynamicCloudConfigPathPrefix ", strB, " musicResourcePath ", stringExtra, " savedDirectory ", strD, " videoPath ", stringExtra2);
        this.f10660a = intent.getBooleanExtra("isHdVideoType", false);
        this.n = null;
        String stringExtra3 = intent.getStringExtra("mVideoUri");
        if (!TextUtils.isEmpty(stringExtra3)) {
            try {
                this.n = Uri.parse(stringExtra3);
                return;
            } catch (IllegalArgumentException e) {
                ReleaseLogUtil.e("Suggestion_TrackRecordService", "getDataFromIntent: uri parse error ", LogAnonymous.b(e));
                return;
            }
        }
        ReleaseLogUtil.d("Suggestion_TrackRecordService", "getDataFromIntent: uri is empty=true, videoPath is = ", Boolean.valueOf(TextUtils.isEmpty(this.g)));
    }

    private void e(MediaProjection mediaProjection) {
        if (mediaProjection == null) {
            LogUtil.j("Suggestion_TrackRecordService", "initRecorder: mediaProjection is null");
            return;
        }
        LocalBroadcastManager.getInstance().sendBroadcast(new Intent("sta_track_record_start"));
        boolean zAf = qrs.af(this);
        try {
            if (this.n != null && PermissionUtil.e()) {
                d(mediaProjection, zAf);
            } else if (TextUtils.isEmpty(this.g)) {
                ReleaseLogUtil.e("Suggestion_TrackRecordService", "initRecorder: os is ", Integer.valueOf(Build.VERSION.SDK_INT), " videoPath is empty ,uri is null");
            } else {
                this.j = new jfy().c(this.d).e(this.h).b(mediaProjection, this.g, zAf, this.f10660a).setAudioFilePath(this.f10661b).setHandler(this.e);
            }
            TrackRecorder trackRecorder = this.j;
            if (trackRecorder == null) {
                ReleaseLogUtil.e("Suggestion_TrackRecordService", "initRecorder: mRecorder is null");
                b(true, 0L);
            } else {
                trackRecorder.start();
            }
        } catch (IllegalArgumentException e) {
            ReleaseLogUtil.a("Suggestion_TrackRecordService", "initRecorder error ", LogAnonymous.b(e));
            b(true, 0L);
        }
    }

    private void d(MediaProjection mediaProjection, boolean z) {
        if (this.n == null) {
            LogUtil.j("Suggestion_TrackRecordService", "buildRecorderInR: fileDescriptor is null");
        } else {
            this.j = new jfy().c(this.d).e(this.h).b(mediaProjection, this.n, z, this.f10660a).setAudioFilePath(this.f10661b).setHandler(this.e);
        }
    }

    private void a() {
        Notification notificationBuild = lsb.d().c().setContentIntent(PendingIntent.getService(this, 0, new Intent().setPackage(BaseApplication.getAppPackage()), 201326592)).setSmallIcon(R.drawable.healthlogo_ic_notification).setContentTitle(getResources().getString(R.string.IDS_plugin_motion_track_dynamic)).setContentText(getResources().getString(R.string.IDS_notification_recording_track)).setWhen(System.currentTimeMillis()).build();
        notificationBuild.flags = 32;
        lsb.d().c(20211229, notificationBuild);
        try {
            if (PermissionUtil.a()) {
                startForeground(20211229, notificationBuild, 32);
            } else {
                startForeground(20211229, notificationBuild);
            }
        } catch (Exception e) {
            ReleaseLogUtil.e("Suggestion_TrackRecordService", "startForeground error exception ", LogAnonymous.b(e));
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        TrackRecorder trackRecorder = this.j;
        if (trackRecorder != null) {
            trackRecorder.stopScreen();
            this.j = null;
        }
        b();
        stopForeground(true);
    }
}

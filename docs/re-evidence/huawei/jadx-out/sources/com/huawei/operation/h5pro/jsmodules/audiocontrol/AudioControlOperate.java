package com.huawei.operation.h5pro.jsmodules.audiocontrol;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.R;
import com.huawei.operation.service.NotificationService;
import defpackage.jhl;
import defpackage.lsb;
import defpackage.lsy;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class AudioControlOperate {
    public static final String EVENT_KEY_AUDIO = "EVENT_KEY_AUDIO";
    public static final int EVENT_VALUE_AUDIO_PAUSE = 2;
    public static final int EVENT_VALUE_AUDIO_PLAY = 1;
    public static final String IS_AUDIO_START_SERVICE = "IS_AUDIO_START_SERVICE";
    private static final String TAG = "H5PRO_AudioControlOperation";
    private static volatile boolean isStartForeground = true;
    private final int audioImageRound = jhl.c(BaseApplication.getContext(), 8.0f);
    private volatile String mAudioData;
    private volatile Notification.Builder mNotificationBuilder;
    private volatile RemoteViews mRemoteViews;
    private static final Object EVENT_LOCK_AUDIO = new Object();
    public static final AudioControlOperate INSTANCE = new AudioControlOperate();

    private AudioControlOperate() {
    }

    private void createNotificationBuilder() {
        if (this.mNotificationBuilder != null) {
            return;
        }
        LogUtil.i(TAG, "createNotificationBuilder");
        this.mNotificationBuilder = lsb.d().c();
        this.mNotificationBuilder.setSmallIcon(R.drawable.healthlogo_ic_notification);
        this.mNotificationBuilder.setOngoing(true);
        this.mNotificationBuilder.setAutoCancel(false);
        lsb.d().c(this.mNotificationBuilder);
        Iterator<ActivityManager.AppTask> it = ((ActivityManager) BaseApplication.getContext().getSystemService(ActivityManager.class)).getAppTasks().iterator();
        while (it.hasNext()) {
            ComponentName componentName = it.next().getTaskInfo().topActivity;
            if (componentName != null && TextUtils.equals(BaseApplication.getAppPackage(), componentName.getPackageName())) {
                Intent intent = new Intent();
                intent.setPackage(componentName.getPackageName());
                intent.setComponent(componentName);
                this.mNotificationBuilder.setContentIntent(PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 67108864));
                return;
            }
        }
    }

    public void play(String str) {
        synchronized (EVENT_LOCK_AUDIO) {
            if (!isActiveControl()) {
                this.mAudioData = str;
                Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) NotificationService.class);
                intent.setPackage(BaseApplication.getAppPackage());
                intent.putExtra(IS_AUDIO_START_SERVICE, true);
                isStartForeground = false;
                LogUtil.i(TAG, "play: startForegroundService");
                BaseApplication.getContext().startForegroundService(intent);
                return;
            }
            updateControlToPlay(str, null);
        }
    }

    public void play(Service service) {
        synchronized (EVENT_LOCK_AUDIO) {
            Notification notificationUpdateControlToPlay = updateControlToPlay(this.mAudioData, service);
            if (notificationUpdateControlToPlay != null) {
                service.startForeground(NotificationService.NOTIFICATION_ID, notificationUpdateControlToPlay);
                isStartForeground = true;
                LogUtil.i(TAG, "play: startForeground");
            }
        }
    }

    private Notification updateControlToPlay(String str, Service service) {
        Notification notificationUnHosUpdateControlToPlay;
        createNotificationBuilder();
        if (EnvironmentInfo.g()) {
            notificationUnHosUpdateControlToPlay = hosUpdateControlToPlay(str);
        } else {
            notificationUnHosUpdateControlToPlay = unHosUpdateControlToPlay(str);
        }
        if (notificationUnHosUpdateControlToPlay == null) {
            exceptionStopService(service);
        }
        return notificationUnHosUpdateControlToPlay;
    }

    private Notification hosUpdateControlToPlay(String str) {
        AudioControlParamObj audioControlParamObj = (AudioControlParamObj) GsonUtil.parseJson(str, AudioControlParamObj.class);
        if (audioControlParamObj == null) {
            LogUtil.w(TAG, "hosUpdateControl: audioControlObj is null");
            return null;
        }
        if (!TextUtils.isEmpty(audioControlParamObj.getSource())) {
            this.mNotificationBuilder.setContentTitle(qre.a(R.string.IDS_operation_music_playing_title, audioControlParamObj.getName(), audioControlParamObj.getSource()));
        } else {
            this.mNotificationBuilder.setContentTitle(audioControlParamObj.getName());
        }
        this.mNotificationBuilder.setContentText(qre.a(R.string.IDS_operation_music_playing, audioControlParamObj.getName()));
        Notification notificationBuild = this.mNotificationBuilder.build();
        lsb.d().c(NotificationService.NOTIFICATION_ID, notificationBuild);
        return notificationBuild;
    }

    private Notification unHosUpdateControlToPlay(String str) {
        final AudioControlParamObj audioControlParamObj = (AudioControlParamObj) GsonUtil.parseJson(str, AudioControlParamObj.class);
        if (audioControlParamObj == null) {
            LogUtil.w(TAG, "unHosUpdateControl: audioControlObj is null");
            return null;
        }
        this.mRemoteViews = new RemoteViews(BaseApplication.getAppPackage(), R.layout.layout_audio_control_notification);
        this.mRemoteViews.setTextViewText(R.id.tv_audioName, TextUtils.isEmpty(audioControlParamObj.getName()) ? "" : audioControlParamObj.getName());
        this.mRemoteViews.setTextViewText(R.id.tv_audioSource, TextUtils.isEmpty(audioControlParamObj.getSource()) ? "" : audioControlParamObj.getSource());
        this.mNotificationBuilder.setContent(this.mRemoteViews);
        lsy.a(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.audiocontrol.AudioControlOperate$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1601x508d40a8(audioControlParamObj);
            }
        });
        return setAudioEventViewStatus(1);
    }

    /* JADX INFO: renamed from: lambda$unHosUpdateControlToPlay$0$com-huawei-operation-h5pro-jsmodules-audiocontrol-AudioControlOperate, reason: not valid java name */
    /* synthetic */ void m1601x508d40a8(AudioControlParamObj audioControlParamObj) {
        Bitmap bitmapC = qqf.c(BaseApplication.getContext(), audioControlParamObj.getImage());
        Bitmap bitmapD = bitmapC == null ? null : qqf.d(bitmapC, bitmapC.getWidth(), bitmapC.getHeight(), this.audioImageRound);
        if (this.mRemoteViews == null) {
            LogUtil.w(TAG, "unHosUpdateControlToPlay: remoteView is null");
            return;
        }
        if (bitmapD == null) {
            this.mRemoteViews.setImageViewResource(R.id.iv_audioImage, R.mipmap.healthlogo_hw_show_app);
            this.mRemoteViews.setViewVisibility(R.id.iv_audioLogo, 4);
        } else {
            this.mRemoteViews.setImageViewBitmap(R.id.iv_audioImage, bitmapD);
            this.mRemoteViews.setViewVisibility(R.id.iv_audioLogo, 0);
        }
        lsb.d().c(NotificationService.NOTIFICATION_ID, this.mNotificationBuilder.build());
    }

    private Notification setAudioEventViewStatus(int i) {
        LogUtil.i(TAG, "setAudioEventViewStatus: audioEvent -> " + i);
        if (this.mRemoteViews == null) {
            LogUtil.w(TAG, "setAudioEventViewStatus: mRemoteViews is null");
            return null;
        }
        if (qqs.e(BaseApplication.getContext())) {
            this.mRemoteViews.setImageViewResource(R.id.iv_audioStatus, i == 1 ? R.drawable.hiad_linked_video_pause : R.drawable.hiad_linked_video_play);
        } else {
            this.mRemoteViews.setImageViewResource(R.id.iv_audioStatus, i == 1 ? R.drawable.hiad_pause : R.drawable.hiad_play);
        }
        Intent intent = new Intent("BROADCAST_ACTION_UPDATE_H5_AUDIO_PAGE");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.putExtra(EVENT_KEY_AUDIO, i == 1 ? 2 : 1);
        this.mRemoteViews.setOnClickPendingIntent(R.id.rl_audioStatus, PendingIntent.getBroadcast(BaseApplication.getContext(), 0, intent, 201326592));
        Notification notificationBuild = this.mNotificationBuilder.build();
        lsb.d().c(NotificationService.NOTIFICATION_ID, notificationBuild);
        return notificationBuild;
    }

    public void pause() {
        synchronized (EVENT_LOCK_AUDIO) {
            if (isActiveControl()) {
                if (EnvironmentInfo.g()) {
                    this.mNotificationBuilder.setContentText(qre.f(R.string.IDS_motiontrack_offlinemap_download_pause));
                    lsb.d().c(NotificationService.NOTIFICATION_ID, this.mNotificationBuilder.build());
                    return;
                }
                setAudioEventViewStatus(2);
            }
        }
    }

    public void stopServiceSynchronized() {
        synchronized (EVENT_LOCK_AUDIO) {
            stopService();
        }
    }

    private void exceptionStopService(Service service) {
        if (service != null) {
            service.startForeground(NotificationService.NOTIFICATION_ID, this.mNotificationBuilder.build());
            isStartForeground = true;
            LogUtil.i(TAG, "exceptionStopService: startForeground");
        }
        stopService();
    }

    private void stopService() {
        final Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) NotificationService.class);
        intent.setPackage(BaseApplication.getAppPackage());
        if (isStartForeground) {
            BaseApplication.getContext().stopService(intent);
            LogUtil.i(TAG, "stopService: isStartForeground -> true");
        } else {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.audiocontrol.AudioControlOperate$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AudioControlOperate.lambda$stopService$1(intent);
                }
            }, 300L);
        }
    }

    static /* synthetic */ void lambda$stopService$1(Intent intent) {
        BaseApplication.getContext().stopService(intent);
        LogUtil.i(TAG, "stopService: isStartForeground -> false");
    }

    public void closeControl(Service service) {
        synchronized (EVENT_LOCK_AUDIO) {
            this.mRemoteViews = null;
            service.stopForeground(true);
            lsb.d().e(NotificationService.NOTIFICATION_ID);
        }
    }

    public void release() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.audiocontrol.AudioControlOperate$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1600x51618847();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$release$2$com-huawei-operation-h5pro-jsmodules-audiocontrol-AudioControlOperate, reason: not valid java name */
    /* synthetic */ void m1600x51618847() {
        synchronized (EVENT_LOCK_AUDIO) {
            if (isActiveControl()) {
                LogUtil.i(TAG, "release");
                lsb.d().e(NotificationService.NOTIFICATION_ID);
                stopService();
            }
        }
    }

    private static boolean isActiveControl() {
        StatusBarNotification[] activeNotifications;
        NotificationManager notificationManagerL = CommonUtil.l();
        if (notificationManagerL != null && (activeNotifications = notificationManagerL.getActiveNotifications()) != null && activeNotifications.length != 0) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == 20210309) {
                    return true;
                }
            }
        }
        return false;
    }
}

package com.liulishuo.filedownloader.services;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.liulishuo.filedownloader.PauseAllMarker;
import com.liulishuo.filedownloader.download.CustomComponentHolder;
import com.liulishuo.filedownloader.i.IFileDownloadIPCService;
import com.liulishuo.filedownloader.util.ExtraKeys;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadProperties;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"Registered"})
public class FileDownloadService extends Service {
    private c a;
    private PauseAllMarker b;

    public static class SeparateProcessService extends FileDownloadService {
    }

    public static class SharedMainProcessService extends FileDownloadService {
    }

    private void a(Intent intent) {
        if (intent != null && intent.getBooleanExtra(ExtraKeys.IS_FOREGROUND, false)) {
            ForegroundServiceConfig foregroundConfigInstance = CustomComponentHolder.getImpl().getForegroundConfigInstance();
            if (foregroundConfigInstance.isNeedRecreateChannelId() && Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(foregroundConfigInstance.getNotificationChannelId(), foregroundConfigInstance.getNotificationChannelName(), 2);
                NotificationManager notificationManager = (NotificationManager) getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
                if (notificationManager == null) {
                    return;
                } else {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            startForeground(foregroundConfigInstance.getNotificationId(), foregroundConfigInstance.getNotification(this));
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "run service foreground with config: %s", foregroundConfigInstance);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        FileDownloadHelper.holdContext(this);
        try {
            FileDownloadUtils.setMinProgressStep(FileDownloadProperties.getImpl().downloadMinProgressStep);
            FileDownloadUtils.setMinProgressTime(FileDownloadProperties.getImpl().downloadMinProgressTime);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        a aVar = new a();
        if (FileDownloadProperties.getImpl().processNonSeparate) {
            this.a = new FDServiceSharedHandler(new WeakReference(this), aVar);
        } else {
            this.a = new FDServiceSeparateHandler(new WeakReference(this), aVar);
        }
        PauseAllMarker.clearMarker();
        PauseAllMarker pauseAllMarker = new PauseAllMarker((IFileDownloadIPCService) this.a);
        this.b = pauseAllMarker;
        pauseAllMarker.startPauseAllLooperCheck();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.b.stopPauseAllLooperCheck();
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.a.onStartCommand(intent, i, i2);
        a(intent);
        return 1;
    }
}

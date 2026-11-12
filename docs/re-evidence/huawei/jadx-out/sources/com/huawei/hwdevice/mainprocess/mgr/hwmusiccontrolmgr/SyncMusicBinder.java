package com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr;

import android.app.Notification;
import android.os.Binder;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwdevice.mainprocess.service.SyncMusicService;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SyncMusicBinder extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SyncMusicStatusListener f17260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SyncMusicService f17261b;

    public interface SyncMusicStatusListener {
        void onBlueToothDisconnect(List<MusicSong> list, List<MusicSong> list2);

        void onGetSyncMusicNameAndTotalProgress(String str, String str2);

        void onGetSyncMusicProgress(int i);

        void onGetSyncTaskRunningStatus(boolean z, int i);

        void onSyncAllMusicsFinished(List<MusicSong> list, List<MusicSong> list2);

        void onSyncMusicFailWhenNoSpace(List<MusicSong> list, List<MusicSong> list2);

        void onSyncOneMusicFinished(MusicSong musicSong);
    }

    public SyncMusicBinder(SyncMusicService syncMusicService) {
        this.f17261b = syncMusicService;
    }

    public void setSyncMusicListener(SyncMusicStatusListener syncMusicStatusListener) {
        this.f17260a = syncMusicStatusListener;
    }

    public SyncMusicService getService() {
        return this.f17261b;
    }

    public void notifyUiIsSyncMusicTaskRunning() {
        SyncMusicService syncMusicService;
        SyncMusicStatusListener syncMusicStatusListener = this.f17260a;
        if (syncMusicStatusListener == null || (syncMusicService = this.f17261b) == null || syncMusicService.a() == null) {
            return;
        }
        syncMusicStatusListener.onGetSyncTaskRunningStatus(this.f17261b.f(), this.f17261b.a().getMusicAppType());
    }

    public void notifyUiCancelSyncMusicTask() {
        SyncMusicService syncMusicService;
        SyncMusicStatusListener syncMusicStatusListener = this.f17260a;
        if (syncMusicStatusListener == null || (syncMusicService = this.f17261b) == null || syncMusicService.a() == null) {
            return;
        }
        syncMusicStatusListener.onGetSyncTaskRunningStatus(false, this.f17261b.a().getMusicAppType());
    }

    public void notifyUiCurrentMusicNameAndTotalProgress() {
        SyncMusicService syncMusicService;
        SyncMusicStatusListener syncMusicStatusListener = this.f17260a;
        if (syncMusicStatusListener == null || (syncMusicService = this.f17261b) == null) {
            return;
        }
        syncMusicStatusListener.onGetSyncMusicNameAndTotalProgress(syncMusicService.c(), this.f17261b.d());
    }

    public void notifyUiCurrentMusicProgress() {
        SyncMusicService syncMusicService;
        SyncMusicStatusListener syncMusicStatusListener = this.f17260a;
        if (syncMusicStatusListener == null || (syncMusicService = this.f17261b) == null) {
            return;
        }
        syncMusicStatusListener.onGetSyncMusicProgress(syncMusicService.b());
    }

    public void notifyUiCurrentMusicFinish() {
        SyncMusicService syncMusicService;
        SyncMusicStatusListener syncMusicStatusListener = this.f17260a;
        if (syncMusicStatusListener == null || (syncMusicService = this.f17261b) == null) {
            return;
        }
        syncMusicStatusListener.onSyncOneMusicFinished(syncMusicService.a());
    }

    public void notifyUiAllMusicsFinish() {
        SyncMusicService syncMusicService;
        SyncMusicStatusListener syncMusicStatusListener = this.f17260a;
        if (syncMusicStatusListener == null || (syncMusicService = this.f17261b) == null) {
            return;
        }
        syncMusicStatusListener.onSyncAllMusicsFinished(syncMusicService.h(), this.f17261b.g());
    }

    public void notifyUiWhenNoSpace() {
        SyncMusicService syncMusicService;
        SyncMusicStatusListener syncMusicStatusListener = this.f17260a;
        if (syncMusicStatusListener == null || (syncMusicService = this.f17261b) == null) {
            return;
        }
        syncMusicStatusListener.onSyncMusicFailWhenNoSpace(syncMusicService.h(), this.f17261b.g());
    }

    public void notifyServiceCancel() {
        this.f17261b.e();
    }

    public void notifyUiBlueToothDisconnect() {
        SyncMusicService syncMusicService;
        SyncMusicStatusListener syncMusicStatusListener = this.f17260a;
        if (syncMusicStatusListener == null || (syncMusicService = this.f17261b) == null) {
            return;
        }
        syncMusicStatusListener.onBlueToothDisconnect(syncMusicService.h(), this.f17261b.g());
    }

    public void startForeground(int i, Notification notification) {
        try {
            if (PermissionUtil.a()) {
                this.f17261b.startForeground(i, notification, 16);
            } else {
                this.f17261b.startForeground(i, notification);
            }
        } catch (Exception e) {
            ReleaseLogUtil.d("DEVMGR_SyncMusicBinder", "startForeground Exception = ", ExceptionUtils.c(e));
        }
    }

    public void stopForeground() {
        this.f17261b.stopForeground(true);
    }
}

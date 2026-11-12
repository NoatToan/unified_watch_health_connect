package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.os.RemoteException;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushImpl$sendRpkFile$taskId$1;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.im9;
import defpackage.xc6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushImpl$sendRpkFile$taskId$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MusicPushImpl$sendRpkFile$taskId$1 implements SyncStateListener {
    final /* synthetic */ MusicBean $musicBean;
    final /* synthetic */ MusicPushImpl this$0;

    public MusicPushImpl$sendRpkFile$taskId$1(MusicPushImpl musicPushImpl, MusicBean musicBean) {
        this.this$0 = musicPushImpl;
        this.$musicBean = musicBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSyncing$lambda$0(MusicPushImpl this$0, int i, MusicBean musicBean) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(musicBean, "$musicBean");
        this$0.currentPosition = i;
        if (this$0.isCancel) {
            return;
        }
        this$0.sendCmd(1, musicBean, i);
    }

    @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
    public void onFinish(String did, int code) {
        Intrinsics.checkNotNullParameter(did, "did");
        im9.z(this.this$0.getCacheFile());
        xc6.b("sendRpkFile onFinish " + did + " " + code + " success:" + (code == 0));
        if (code == 0) {
            this.$musicBean.setDownLoadSuccess(true);
            MusicPushImpl.sendPushRet$default(this.this$0, this.$musicBean, false, 2, null);
        } else {
            this.$musicBean.setDownLoadSuccess(false);
            MusicPushImpl.sendPushRet$default(this.this$0, this.$musicBean, false, 2, null);
        }
    }

    @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
    public void onStart(String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        xc6.b("sendRpkFile onStart");
    }

    @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
    public void onSyncing(String did, final int progress) {
        Intrinsics.checkNotNullParameter(did, "did");
        xc6.a("sendRpkFile onProgress " + progress);
        MusicPushImpl$handler$1 musicPushImpl$handler$1 = this.this$0.handler;
        final MusicPushImpl musicPushImpl = this.this$0;
        final MusicBean musicBean = this.$musicBean;
        musicPushImpl$handler$1.post(new Runnable() { // from class: tbg
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                MusicPushImpl$sendRpkFile$taskId$1.onSyncing$lambda$0(musicPushImpl, progress, musicBean);
            }
        });
    }
}

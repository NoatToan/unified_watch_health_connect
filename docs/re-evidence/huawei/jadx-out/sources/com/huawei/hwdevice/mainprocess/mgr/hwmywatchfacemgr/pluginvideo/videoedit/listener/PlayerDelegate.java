package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener;

import android.os.Handler;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.operation.Operation;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.MagicStateChangedCallBack;
import com.huawei.watchface.videoedit.presenter.ModelVisitor;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface PlayerDelegate {
    void addListener(PlayerProgressCallBack.BackProgressListener backProgressListener);

    void applyOperation(Operation operation);

    long getCurrentTime();

    Handler getMagicPlayerHandler();

    boolean isRunning();

    void pause();

    void play();

    void registerMagicStateChangedCb(MagicStateChangedCallBack magicStateChangedCallBack);

    void registerModelVisitor(List<ModelVisitor> list);

    void removeListener(PlayerProgressCallBack.BackProgressListener backProgressListener);

    void seekTo(int i);

    void seekTo(int i, int i2);

    void seekTo(int i, boolean z);

    void start();

    void stop();

    void toggle();

    void unRegisterMagicStateChangedCb(MagicStateChangedCallBack magicStateChangedCallBack);

    void unregisterModelVisitor(ModelVisitor modelVisitor);
}

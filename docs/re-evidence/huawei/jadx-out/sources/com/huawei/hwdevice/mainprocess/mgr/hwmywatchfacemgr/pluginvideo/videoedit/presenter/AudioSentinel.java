package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.AudioPlayer;
import com.huawei.watchface.videoedit.param.PlayerBean;
import com.huawei.watchface.videoedit.param.TimeLineImpl;
import com.huawei.watchface.videoedit.presenter.AudioPlayVisitor;
import com.huawei.watchface.videoedit.presenter.ModelVisitor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AudioSentinel extends StateSentinel {
    private static final int MSG_PATROL = 1;
    private static final int MSG_PAUSE = 2;
    private static final int MSG_RELEASE = 5;
    private static final int MSG_RESUME = 3;
    private static final int MSG_SEEK_TO = 4;
    private AudioPlayer audioPlayer;
    private AudioSentinelHandler audioSentinelHandler;
    private boolean isAudioActive;
    private boolean isPauseReceived;
    private boolean isSeekReceived;
    private PlayerBean mActivePlayerBean;
    private HandlerThread mHandlerThread;
    private TimeLineImpl mTimeLine;
    private AudioPlayVisitor visitor;

    class AudioSentinelHandler extends Handler {
        private AudioSentinelHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                AudioSentinel.this.handleUpdate();
                return;
            }
            if (i == 2) {
                AudioSentinel.this.handlePause();
                return;
            }
            if (i == 3) {
                AudioSentinel.this.handleResume();
                return;
            }
            if (i == 4) {
                AudioSentinel.this.handleSeekTo(message.arg1);
            } else if (i == 5) {
                AudioSentinel.this.handleRelease();
            } else {
                throw new IllegalArgumentException(" msg.what is unkown " + message.what);
            }
        }
    }

    public AudioSentinel(int i, Handler handler, TimeLineImpl timeLineImpl) {
        super(i, handler);
        this.mTimeLine = timeLineImpl;
        this.visitor = new AudioPlayVisitor(i, "audio");
        this.audioPlayer = new AudioPlayerImpl();
        HandlerThread handlerThread = new HandlerThread("AudioSentinel");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.audioSentinelHandler = new AudioSentinelHandler(this.mHandlerThread.getLooper());
        this.isAudioActive = false;
        this.isSeekReceived = false;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void seekTo(int i) {
        AudioSentinelHandler audioSentinelHandler = this.audioSentinelHandler;
        audioSentinelHandler.sendMessage(audioSentinelHandler.obtainMessage(4, i, 0));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void pause() {
        this.audioSentinelHandler.sendEmptyMessage(2);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void resume() {
        this.audioSentinelHandler.sendEmptyMessage(3);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void update(int i) {
        AudioSentinelHandler audioSentinelHandler = this.audioSentinelHandler;
        audioSentinelHandler.sendMessage(audioSentinelHandler.obtainMessage(1, i, 0));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void release() {
        this.audioSentinelHandler.sendEmptyMessage(5);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.Sentinel
    public List<ModelVisitor> getModelVisitor() {
        return Collections.singletonList(this.visitor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUpdate() {
        int currentTime = (int) this.mTimeLine.getCurrentTime();
        List<PlayerBean> playerBeansByTime = this.visitor.getVisitorModel().getPlayerBeansByTime(currentTime, "audio");
        if (playerBeansByTime.size() != 1) {
            if (this.isAudioActive) {
                this.audioPlayer.stop();
                return;
            }
            return;
        }
        PlayerBean playerBean = playerBeansByTime.get(0);
        if (playerBean.equals(this.mActivePlayerBean) && !this.isSeekReceived) {
            if (this.isPauseReceived) {
                this.audioPlayer.resume();
                this.audioPlayer.setVolume(playerBean.getVolume(currentTime));
                this.isPauseReceived = false;
            }
            this.audioPlayer.setVolume(playerBean.getVolume(currentTime));
            return;
        }
        int start = playerBean.getTargetTimeRange().getStart();
        int start2 = playerBean.getSourceTimeRange().getStart();
        this.isSeekReceived = false;
        this.isAudioActive = true;
        this.audioPlayer.setDataPath(playerBean.getPath(), start2 + (currentTime - start), playerBean.getVolume(currentTime));
        this.audioPlayer.resume();
        this.mActivePlayerBean = playerBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePause() {
        if (this.isAudioActive) {
            this.isPauseReceived = true;
            this.audioPlayer.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResume() {
        if (this.isAudioActive) {
            handleUpdate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRelease() {
        if (this.isAudioActive) {
            this.audioPlayer.stop();
            this.isAudioActive = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSeekTo(int i) {
        this.isSeekReceived = true;
    }
}

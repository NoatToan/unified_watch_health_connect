package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener;

import android.os.Handler;
import android.os.Message;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render.StateMachine;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.MagicPlayer2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class PlayerProgressCallBack {
    private static final int INTVEL_TIME = 33;
    private static final int MSG_PROGRESS_SET = 1;
    private final Handler mHandler;
    private final ArrayList<BackProgressListener> mListeners;
    private final MagicPlayer2 mPlayer;
    private int mCurrentTimeMs = 0;
    private int mWholeTimeMs = 0;

    public interface BackProgressListener {
        void onPlayBack(int i, int i2, boolean z);

        void onPlayWholeTime(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgProgress() {
        if (this.mPlayer.getStateMachine() == StateMachine.READY || this.mPlayer.getStateMachine() == StateMachine.RUNNING) {
            int durationTime = (int) this.mPlayer.getDurationTime();
            notifyWholeTime(durationTime);
            int currentTime = (int) this.mPlayer.getCurrentTime();
            if (this.mWholeTimeMs == durationTime && this.mCurrentTimeMs == currentTime) {
                return;
            }
            notifyCurrentTime(currentTime, durationTime, this.mPlayer.getStateMachine() == StateMachine.RUNNING);
            this.mCurrentTimeMs = currentTime;
            this.mWholeTimeMs = durationTime;
        }
    }

    public PlayerProgressCallBack(MagicPlayer2 magicPlayer2) {
        Handler handler = new Handler() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerProgressCallBack.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                PlayerProgressCallBack.this.setMsgProgress();
                sendEmptyMessageDelayed(1, 33L);
            }
        };
        this.mHandler = handler;
        this.mListeners = new ArrayList<>();
        this.mPlayer = magicPlayer2;
        handler.sendEmptyMessage(1);
    }

    public void addListener(BackProgressListener backProgressListener) {
        if (this.mListeners.contains(backProgressListener)) {
            return;
        }
        this.mListeners.add(backProgressListener);
    }

    public void removeListener(BackProgressListener backProgressListener) {
        if (backProgressListener == null) {
            return;
        }
        this.mListeners.remove(backProgressListener);
    }

    public void destroy() {
        this.mListeners.clear();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    private void notifyWholeTime(int i) {
        int size = this.mListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mListeners.get(i2).onPlayWholeTime(i);
        }
    }

    private void notifyCurrentTime(long j, long j2, boolean z) {
        int size = this.mListeners.size();
        for (int i = 0; i < size; i++) {
            this.mListeners.get(i).onPlayBack((int) j, ((int) j2) - 33, z);
        }
    }
}

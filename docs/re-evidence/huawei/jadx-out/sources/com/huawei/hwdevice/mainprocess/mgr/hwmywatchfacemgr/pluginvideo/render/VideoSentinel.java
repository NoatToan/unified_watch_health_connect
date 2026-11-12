package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.manager.PlayVideoSurfaceManager2;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.videoedit.param.PlayerBean;
import com.huawei.watchface.videoedit.param.PlayerModel;
import com.huawei.watchface.videoedit.param.TargetTimeRange;
import com.huawei.watchface.videoedit.presenter.ModelVisitor;
import com.huawei.watchface.videoedit.presenter.PresenterUtils;
import com.huawei.watchface.videoedit.presenter.VideoPlayVisitor;
import com.huawei.watchface.videoedit.utils.BitmapUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoSentinel extends StateSentinel implements SurfacePool {
    private static final int CONST_NEGATIVE_1 = -1;
    private static final int INVALID_INDEX = -1;
    private static final int MSG_PATROL = 1;
    private static final int MSG_PAUSE = 2;
    private static final int MSG_RELEASE = 5;
    private static final int MSG_RESUME = 3;
    private static final int MSG_SEEK_TO = 4;
    public static final int MSG_VIDEO_SEEK_COMPLETE = 0;
    private static final int SCREEN_HEIGHT = 1920;
    private static final int SCREEN_WIDTH = 1080;
    private static final int SURFACE_SUM = 4;
    private static final String TAG = "VideoSentinel";
    private static final int VIDEO_ADVANCE_TIME = 50;
    private Context mContext;
    private HandlerThread mHandlerThread;
    private RenderSurfaceListener mSurfaceListener;
    private StateMachine stateMachine;
    private final List<PlayVideoSurfaceManager2> surfaceManagers;
    private VideoSentinelHandler videoSentinelHandler;
    private VideoPlayVisitor visitor;
    private boolean[] waitingSeekingTimeFlags;
    private int[] waitingSeekingTimes;

    class VideoSentinelHandler extends Handler {
        private VideoSentinelHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            int i = message.what;
            if (i == 0) {
                VideoSentinel.this.handleSeekComplete(message.arg1, message.arg2);
                return;
            }
            if (i == 1) {
                VideoSentinel.this.handleUpdate(message.arg1);
                return;
            }
            if (i == 2) {
                VideoSentinel.this.handlePause();
                return;
            }
            if (i == 3) {
                VideoSentinel.this.handleResume();
                return;
            }
            if (i == 4) {
                VideoSentinel.this.handleSeekTo(message.arg1);
            } else if (i == 5) {
                VideoSentinel.this.handleRelease();
            } else {
                throw new IllegalArgumentException(" msg.what is unkown " + message.what);
            }
        }
    }

    public VideoSentinel(int i, Handler handler, Context context) {
        super(i, handler);
        this.surfaceManagers = new ArrayList();
        this.waitingSeekingTimes = new int[4];
        this.waitingSeekingTimeFlags = new boolean[4];
        this.visitor = new VideoPlayVisitor(i, "video");
        this.stateMachine = StateMachine.INIT;
        this.mContext = context;
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.videoSentinelHandler = new VideoSentinelHandler(this.mHandlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSeekComplete(int i, int i2) {
        if (this.stateMachine == StateMachine.SEEKING) {
            if (seekComplete(i, i2)) {
                LogUtil.a(TAG, "handleSeekComplete seekComplete return true");
                sendSeekCompleteToMagic();
                this.stateMachine = StateMachine.READY;
            }
            LogUtil.a(TAG, "handleSeekComplete seekComplete return false ", Arrays.toString(this.waitingSeekingTimeFlags));
            return;
        }
        LogUtil.e(TAG, "handleSeekComplete stateMachine ", this.stateMachine);
    }

    private boolean isAllSurfaceClear() {
        for (boolean z : this.waitingSeekingTimeFlags) {
            Boolean.valueOf(z).getClass();
            if (z) {
                return false;
            }
        }
        return true;
    }

    private boolean seekComplete(int i, int i2) {
        int length = this.waitingSeekingTimeFlags.length;
        LogUtil.a(TAG, "seekComplete surfaceIndex ", Integer.valueOf(i), " seekTime is", Integer.valueOf(i2));
        if (i < length && i >= 0) {
            int[] iArr = this.waitingSeekingTimes;
            if (iArr.length != 0) {
                boolean z = this.waitingSeekingTimeFlags[i];
                if (!z) {
                    LogUtil.e(TAG, "seekComplete waitingSeekingTimeFlags unmatched ", Boolean.valueOf(z));
                    return false;
                }
                LogUtil.d(TAG, "seekComplete waitingSeekingTimes[surfaceIndex] is ", Integer.valueOf(iArr[i]), " seekTime is ", Integer.valueOf(i2));
                if (this.waitingSeekingTimes[i] != i2) {
                    return false;
                }
                this.waitingSeekingTimeFlags[i] = false;
                return isAllSurfaceClear();
            }
        }
        LogUtil.e(TAG, "seekComplete surfaceIndex ", Integer.valueOf(i), " is invalid maxIndex is", Integer.valueOf(length));
        return false;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.Sentinel
    public List<ModelVisitor> getModelVisitor() {
        return Arrays.asList(this.visitor);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void seekTo(int i) {
        VideoSentinelHandler videoSentinelHandler = this.videoSentinelHandler;
        videoSentinelHandler.sendMessage(videoSentinelHandler.obtainMessage(4, i, 0));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void pause() {
        this.videoSentinelHandler.sendEmptyMessage(2);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void resume() {
        this.videoSentinelHandler.sendEmptyMessage(3);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void update(int i) {
        VideoSentinelHandler videoSentinelHandler = this.videoSentinelHandler;
        videoSentinelHandler.sendMessage(videoSentinelHandler.obtainMessage(1, i, 0));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void release() {
        this.videoSentinelHandler.sendEmptyMessage(5);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render.SurfacePool
    public void setSurfacePool(List<Surface> list, RenderSurfaceListener renderSurfaceListener) {
        if (list == null || renderSurfaceListener == null) {
            LogUtil.e(TAG, "setSurfacePool surfaces is null or surfaceListener is null");
            return;
        }
        synchronized (this.surfaceManagers) {
            this.surfaceManagers.clear();
            this.mSurfaceListener = renderSurfaceListener;
            this.waitingSeekingTimes = new int[list.size()];
            this.waitingSeekingTimeFlags = new boolean[list.size()];
            int i = 0;
            for (Surface surface : list) {
                LogUtil.a(TAG, "setSurfacePool surfaces hashcode is ", Integer.valueOf(surface.hashCode()));
                this.surfaceManagers.add(new PlayVideoSurfaceManager2(surface, i, renderSurfaceListener, this.mContext, this.videoSentinelHandler));
                i++;
            }
        }
    }

    private void loadPhotos(int i) throws Throwable {
        List<PlayerBean> playerBeansByTime = this.visitor.getVisitorModel().getPlayerBeansByTime(i, PresenterUtils.PHOTO);
        if (this.mSurfaceListener == null) {
            return;
        }
        for (PlayerBean playerBean : playerBeansByTime) {
            if (!this.mSurfaceListener.queryBitmapIsCached(playerBean.getId())) {
                Bitmap bitmapLoadImage = BitmapUtils.loadImage(playerBean.getPath(), BitmapUtils.getFullScreenNailScale(playerBean.getWidth(), playerBean.getHeight(), 1080.0f, 1920.0f));
                if (bitmapLoadImage != null) {
                    this.mSurfaceListener.onBitmapLoaded(bitmapLoadImage, playerBean.getId());
                }
            }
        }
    }

    private void loadVideos(int i) {
        PlayerModel visitorModel = this.visitor.getVisitorModel();
        List<PlayerBean> playerBeansByTime = visitorModel.getPlayerBeansByTime(i, "video");
        playerBeansByTime.addAll(visitorModel.getPlayerBeansByTime(i, "video_musk"));
        rescueVideoResource(playerBeansByTime, i);
        findSurfaceForVideo(playerBeansByTime, i);
        if (isAllSurfaceClear()) {
            sendSeekCompleteToMagic();
            this.stateMachine = StateMachine.READY;
        }
    }

    private void findSurfaceForVideo(List<PlayerBean> list, int i) {
        for (PlayerBean playerBean : list) {
            for (PlayVideoSurfaceManager2 playVideoSurfaceManager2 : this.surfaceManagers) {
                if (playVideoSurfaceManager2.isSurfaceAviliable()) {
                    int index = playVideoSurfaceManager2.getIndex();
                    LogUtil.a(TAG, "findSurfaceForVideo surfaceIndex is ", Integer.valueOf(index), " positionMs is ", Integer.valueOf(i));
                    this.waitingSeekingTimeFlags[index] = i >= 0;
                    this.waitingSeekingTimes[index] = playVideoSurfaceManager2.onSurfaceBindWithTime(playerBean, i);
                    LogUtil.a(TAG, " findSurfaceForVideo seekComplete flags ", Arrays.toString(this.waitingSeekingTimeFlags));
                    LogUtil.a(TAG, " findSurfaceForVideo seekComplete Times", Arrays.toString(this.waitingSeekingTimes));
                    break;
                }
            }
        }
    }

    private void filterAlreadyArrangedVideo(List<PlayerBean> list) {
        int iFindMatchedBeanIndex;
        for (PlayVideoSurfaceManager2 playVideoSurfaceManager2 : this.surfaceManagers) {
            if (playVideoSurfaceManager2.isSurfaceBusying()) {
                PlayerBean playerBean = playVideoSurfaceManager2.getPlayerBean();
                if (playVideoSurfaceManager2.isSurfaceBusying() && (iFindMatchedBeanIndex = findMatchedBeanIndex(playerBean, list)) >= 0) {
                    updateVolume(playVideoSurfaceManager2, list.get(iFindMatchedBeanIndex));
                    list.remove(iFindMatchedBeanIndex);
                }
            }
        }
    }

    private void updateVolume(PlayVideoSurfaceManager2 playVideoSurfaceManager2, PlayerBean playerBean) {
        playVideoSurfaceManager2.setVolume(playerBean.getVolume());
    }

    private void rescueVideoResource(List<PlayerBean> list, int i) {
        for (PlayVideoSurfaceManager2 playVideoSurfaceManager2 : this.surfaceManagers) {
            if (!playVideoSurfaceManager2.isSurfaceAviliable()) {
                PlayerBean playerBean = playVideoSurfaceManager2.getPlayerBean();
                int index = playVideoSurfaceManager2.getIndex();
                if (findMatchedPlayerBean(playerBean, list)) {
                    this.waitingSeekingTimeFlags[index] = true;
                    this.waitingSeekingTimes[index] = playVideoSurfaceManager2.syncVideoToTime(i);
                    LogUtil.a(TAG, "rescueVideoResource surfaceIndex is ", Integer.valueOf(index), " positionMs is ", Integer.valueOf(i));
                    LogUtil.a(TAG, "rescueVideoResource seekComplete flags ", Arrays.toString(this.waitingSeekingTimeFlags));
                    LogUtil.a(TAG, "rescueVideoResource seekComplete Times", Arrays.toString(this.waitingSeekingTimes));
                } else {
                    this.waitingSeekingTimeFlags[index] = false;
                    playVideoSurfaceManager2.onSurfaceUnBind();
                }
            }
        }
    }

    private boolean findMatchedPlayerBean(PlayerBean playerBean, List<PlayerBean> list) {
        int iFindMatchedBeanIndex = findMatchedBeanIndex(playerBean, list);
        if (iFindMatchedBeanIndex < 0) {
            return false;
        }
        list.remove(iFindMatchedBeanIndex);
        return true;
    }

    private int findMatchedBeanIndex(PlayerBean playerBean, List<PlayerBean> list) {
        String id = playerBean.getId();
        int start = playerBean.getSourceTimeRange().getStart();
        TargetTimeRange targetTimeRange = playerBean.getTargetTimeRange();
        for (int i = 0; i < list.size(); i++) {
            PlayerBean playerBean2 = list.get(i);
            if (id.equals(playerBean2.getId()) && start == playerBean2.getSourceTimeRange().getStart() && targetTimeRange.equals(playerBean2.getTargetTimeRange())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUpdate(int i) throws Throwable {
        if (this.stateMachine != StateMachine.RUNNING) {
            LogUtil.e(TAG, "handleUpdate stateMachine is ", this.stateMachine);
            return;
        }
        loadPhotos(i);
        refreshSurfaceState(i);
        List<PlayerBean> playerBeansByTime = this.visitor.getVisitorModel().getPlayerBeansByTime(i, "video");
        filterAlreadyArrangedVideo(playerBeansByTime);
        findSurfaceForVideo(playerBeansByTime, -1);
    }

    private void refreshSurfaceState(int i) {
        for (PlayVideoSurfaceManager2 playVideoSurfaceManager2 : this.surfaceManagers) {
            if (playVideoSurfaceManager2.isSurfaceBusying()) {
                int start = playVideoSurfaceManager2.getPlayerBean().getTargetTimeRange().getStart();
                if (playVideoSurfaceManager2.getPlayerBean().getTargetTimeRange().getDuration() + start < i) {
                    playVideoSurfaceManager2.onSurfaceUnBind();
                } else if (Math.abs(start - i) < 50) {
                    playVideoSurfaceManager2.getVideoPlayer().resume();
                } else {
                    LogUtil.a(TAG, "refreshSurfaceState stateMachine is ", Integer.valueOf(start), " currentTime ", Integer.valueOf(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePause() {
        if (this.stateMachine != StateMachine.RUNNING) {
            LogUtil.e(TAG, "handlePause stateMachine is ", this.stateMachine);
            return;
        }
        this.stateMachine = StateMachine.READY;
        for (PlayVideoSurfaceManager2 playVideoSurfaceManager2 : this.surfaceManagers) {
            if (playVideoSurfaceManager2.isSurfaceBusying()) {
                playVideoSurfaceManager2.getVideoPlayer().pause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResume() {
        if (this.stateMachine != StateMachine.READY) {
            LogUtil.e(TAG, "handleResume stateMachine is ", this.stateMachine);
            return;
        }
        this.stateMachine = StateMachine.RUNNING;
        for (PlayVideoSurfaceManager2 playVideoSurfaceManager2 : this.surfaceManagers) {
            if (playVideoSurfaceManager2.isSurfaceBusying()) {
                playVideoSurfaceManager2.getVideoPlayer().resume();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSeekTo(int i) throws Throwable {
        if (this.stateMachine != StateMachine.READY && this.stateMachine != StateMachine.INIT) {
            LogUtil.e(TAG, "handleSeekTo stateMachine is ", this.stateMachine);
            return;
        }
        this.stateMachine = StateMachine.SEEKING;
        loadPhotos(i);
        loadVideos(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRelease() {
        this.stateMachine = StateMachine.RELEASED;
        this.mHandlerThread.quit();
        Iterator<PlayVideoSurfaceManager2> it = this.surfaceManagers.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceUnBind();
        }
    }
}

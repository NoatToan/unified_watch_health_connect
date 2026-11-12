package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.manager;

import android.content.Context;
import android.os.Handler;
import android.view.Surface;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.ExoPlayerAdapter;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.VideoSurfaceManager2;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener;
import com.huawei.watchface.videoedit.param.PlayerBean;

/* JADX INFO: loaded from: classes10.dex */
public class PlayVideoSurfaceManager2 extends VideoSurfaceManager2 {
    private Context mContext;
    private Handler mHandle;
    private VideoPlayer mVideoPlayer;

    public PlayVideoSurfaceManager2(Surface surface, int i, RenderSurfaceListener renderSurfaceListener, Context context, Handler handler) {
        super(surface, i, renderSurfaceListener);
        this.mContext = context;
        this.mHandle = handler;
    }

    public VideoPlayer getVideoPlayer() {
        return this.mVideoPlayer;
    }

    public int syncVideoToTime(int i) {
        int iCalSeekTime = calSeekTime(i, this.mPlayerBean);
        VideoPlayer videoPlayer = this.mVideoPlayer;
        if (videoPlayer != null) {
            videoPlayer.seekTo(iCalSeekTime);
        }
        return iCalSeekTime;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.VideoSurfaceManager2
    public void onSurfaceBind(PlayerBean playerBean) {
        onSurfaceBindWithTime(playerBean, -1);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.VideoSurfaceManager2
    public void onSurfaceUnBind() {
        super.onSurfaceUnBind();
        VideoPlayer videoPlayer = this.mVideoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setSurface(null).clean();
            this.mVideoPlayer = null;
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.VideoSurfaceManager2
    public void onSurfaceRelease() {
        super.onSurfaceRelease();
        VideoPlayer videoPlayer = this.mVideoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setSurface(null);
            this.mVideoPlayer.stop();
        }
    }

    public int onSurfaceBindWithTime(PlayerBean playerBean, int i) {
        int iCalSeekTime;
        if (i < 0) {
            iCalSeekTime = playerBean.getSourceTimeRange().getStart();
        } else {
            iCalSeekTime = calSeekTime(i, playerBean);
        }
        this.mVideoPlayer = new ExoPlayerAdapter(this.mContext, this.mHandle, this.mIndex);
        super.onSurfaceBind(playerBean);
        this.mVideoPlayer.setSurface(this.mSurface).setPlaySpeed(playerBean.getSpeed()).setVolume((float) (((double) playerBean.getVolume()) / 100.0d)).setSeekTime(iCalSeekTime).setDataPath(playerBean.getPath());
        return iCalSeekTime;
    }

    public void setVolume(int i) {
        VideoPlayer videoPlayer = this.mVideoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setVolume((float) (((double) i) / 100.0d));
        }
    }

    private int calSeekTime(int i, PlayerBean playerBean) {
        return (int) ((Math.max(i - playerBean.getTargetTimeRange().getStart(), 0) * playerBean.getSpeed()) + playerBean.getSourceTimeRange().getStart());
    }
}

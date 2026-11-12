package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter;

import android.view.Surface;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener;
import com.huawei.watchface.videoedit.param.PlayerBean;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public abstract class VideoSurfaceManager2 {
    private static final int SURFACE_IDLE = 0;
    private static final int SURFACE_RELEASED = 2;
    private static final int SURFACE_USED = 1;
    private static final String TAG = "VideoSurfaceManager2";
    protected int mIndex;
    protected PlayerBean mPlayerBean;
    protected Surface mSurface;
    protected RenderSurfaceListener surfaceListener;
    protected int surfaceStatus = 0;

    public VideoSurfaceManager2(Surface surface, int i, RenderSurfaceListener renderSurfaceListener) {
        this.mSurface = surface;
        this.mIndex = i;
        this.surfaceListener = renderSurfaceListener;
    }

    public PlayerBean getPlayerBean() {
        return this.mPlayerBean;
    }

    public int getIndex() {
        return this.mIndex;
    }

    public boolean isSurfaceAviliable() {
        return this.surfaceStatus == 0;
    }

    public boolean isSurfaceBusying() {
        return this.surfaceStatus == 1;
    }

    public void onSurfaceBind(PlayerBean playerBean) {
        if (playerBean == null) {
            LogUtil.d(TAG, "onSurfaceBind playerBean is null.");
            return;
        }
        this.mPlayerBean = new PlayerBean(playerBean);
        LogUtil.b(TAG, "onSurfaceBind");
        this.surfaceStatus = 1;
        RenderSurfaceListener renderSurfaceListener = this.surfaceListener;
        if (renderSurfaceListener != null) {
            renderSurfaceListener.onSurfaceBind(this.mPlayerBean.getId(), this.mIndex);
        }
    }

    public void onSurfaceUnBind() {
        this.surfaceStatus = 0;
        if (this.mPlayerBean == null) {
            return;
        }
        LogUtil.b(TAG, "onSurfaceUnBind");
        RenderSurfaceListener renderSurfaceListener = this.surfaceListener;
        if (renderSurfaceListener != null) {
            renderSurfaceListener.onSurfaceUnBind(this.mPlayerBean.getId(), this.mIndex);
        }
    }

    public void onSurfaceRelease() {
        this.surfaceStatus = 2;
        PlayerBean playerBean = this.mPlayerBean;
        if (playerBean == null) {
            return;
        }
        RenderSurfaceListener renderSurfaceListener = this.surfaceListener;
        if (renderSurfaceListener != null) {
            renderSurfaceListener.onSurfaceUnBind(playerBean.getId(), this.mIndex);
        }
        this.mPlayerBean = null;
    }
}

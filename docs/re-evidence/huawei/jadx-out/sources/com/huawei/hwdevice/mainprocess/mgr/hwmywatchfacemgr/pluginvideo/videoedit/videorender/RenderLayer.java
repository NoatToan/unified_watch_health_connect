package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender;

import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.MagicPlayer;
import com.huawei.watchface.videoedit.gles.drawer.RenderNode;
import com.huawei.watchface.videoedit.gles.videorender.RenderDataManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public abstract class RenderLayer implements Comparable<RenderLayer> {
    protected int mHeight;
    private MagicPlayer.Mode mMode;
    private RenderNode mRoot;
    protected int mWidth;
    protected int mZorder;

    public abstract void draw(long j);

    public abstract void handleDataChange(RenderDataManager renderDataManager);

    public abstract void init(int i, int i2);

    public abstract void onSizeChanged(int i, int i2);

    public abstract void release();

    public abstract void updateAnimVertex();

    public int getZorder() {
        return this.mZorder;
    }

    public void setZorder(int i) {
        this.mZorder = i;
    }

    public RenderNode getRoot() {
        return this.mRoot;
    }

    public void setRoot(RenderNode renderNode) {
        this.mRoot = renderNode;
    }

    @Override // java.lang.Comparable
    public int compareTo(RenderLayer renderLayer) {
        if (renderLayer == null) {
            return 1;
        }
        return getZorder() - renderLayer.getZorder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.mZorder == ((RenderLayer) obj).mZorder;
    }

    public int hashCode() {
        int i = this.mZorder;
        int i2 = this.mWidth;
        int i3 = this.mHeight;
        return Objects.hash(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), this.mMode);
    }

    public RenderLayer setMode(MagicPlayer.Mode mode) {
        this.mMode = mode;
        return this;
    }
}

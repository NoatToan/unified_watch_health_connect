package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender;

import android.opengl.Matrix;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.videoedit.gles.drawer.RenderNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RenderNodeSelector implements RenderNodeSelectListener {
    private List<RenderLayer> mRenderLayers;
    private float[] mMvpMatrix = new float[16];
    private List<RenderNode> mSelectedNodes = new ArrayList(16);

    public RenderNodeSelector(List<RenderLayer> list) {
        this.mRenderLayers = list;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderNodeSelectListener
    public List<RenderNode> selectNode(float f, float f2, long j) {
        if (this.mRenderLayers == null) {
            HwLog.e(HwLog.TAG, "Render layers is null.");
            return new ArrayList(0);
        }
        this.mSelectedNodes.clear();
        Iterator<RenderLayer> it = this.mRenderLayers.iterator();
        while (it.hasNext()) {
            checkCollision(it.next().getRoot(), f, f2, j);
        }
        HwLog.d(HwLog.TAG, "selected node num:" + this.mSelectedNodes.size());
        return this.mSelectedNodes;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderNodeSelectListener
    public List<RenderNode> selectNode(String str) {
        if (this.mRenderLayers == null || str == null) {
            return new ArrayList(0);
        }
        this.mSelectedNodes.clear();
        Iterator<RenderLayer> it = this.mRenderLayers.iterator();
        while (it.hasNext()) {
            findChild(it.next().getRoot(), str);
        }
        HwLog.d(HwLog.TAG, "selected node num:" + this.mSelectedNodes.size());
        return this.mSelectedNodes;
    }

    private void findChild(RenderNode renderNode, String str) {
        if (renderNode == null) {
            return;
        }
        if (str.equals(renderNode.getId())) {
            this.mSelectedNodes.add(renderNode);
        }
        Iterator<RenderNode> it = renderNode.getChildren().iterator();
        while (it.hasNext()) {
            findChild(it.next(), str);
        }
    }

    private void checkCollision(RenderNode renderNode, float f, float f2, long j) {
        if (renderNode == null) {
            return;
        }
        if (renderNode.getTimeRange().contains(j)) {
            Matrix.multiplyMM(this.mMvpMatrix, 0, renderNode.getVpMatrix(), 0, renderNode.getModelMatrix(), 0);
            float[] fArr = this.mMvpMatrix;
            float f3 = fArr[12];
            float f4 = fArr[13];
            float f5 = fArr[0];
            float f6 = fArr[4];
            float f7 = fArr[1];
            float f8 = fArr[5];
            if (Math.abs(f - f3) < f5 + f6 && Math.abs(f2 - f4) < f7 + f8) {
                HwLog.d(HwLog.TAG, "Add node " + renderNode.getClass().getName());
                this.mSelectedNodes.add(renderNode);
            }
        }
        HwLog.d(HwLog.TAG, "check children " + renderNode.getChildren().size());
        Iterator<RenderNode> it = renderNode.getChildren().iterator();
        while (it.hasNext()) {
            checkCollision(it.next(), f, f2, j);
        }
    }
}

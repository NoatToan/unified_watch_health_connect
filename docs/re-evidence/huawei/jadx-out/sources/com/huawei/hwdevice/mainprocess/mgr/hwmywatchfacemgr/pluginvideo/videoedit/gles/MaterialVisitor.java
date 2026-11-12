package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.gles;

import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.TemplateUtil;
import com.huawei.watchface.videoedit.gles.glutils.TimeRange;
import com.huawei.watchface.videoedit.gles.template.Material;
import com.huawei.watchface.videoedit.gles.template.RenderListener;
import com.huawei.watchface.videoedit.gles.template.RenderModel;
import com.huawei.watchface.videoedit.param.CanvasInfo;
import com.huawei.watchface.videoedit.param.Segments;
import com.huawei.watchface.videoedit.param.TargetTimeRange;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.param.Tracks;
import com.huawei.watchface.videoedit.param.Videos;
import com.huawei.watchface.videoedit.presenter.ModelVisitor;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialVisitor extends ModelVisitor<RenderModel> {
    private static final String TAG = "MaterialVisitor";
    private final RenderListener mListener;

    public MaterialVisitor(int i, String str, RenderListener renderListener) {
        super(i);
        this.mListener = renderListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.huawei.watchface.videoedit.gles.template.RenderModel] */
    @Override // com.huawei.watchface.videoedit.presenter.ModelVisitor
    public void onDataSetChanged(TemplateModel templateModel) {
        if (templateModel == null) {
            LogUtil.d(TAG, "onDataSetChanged newModel is null.");
            return;
        }
        LogUtil.b(TAG, "onDataSetChanged");
        this.selfStorage = new RenderModel(generatePlayList(templateModel));
        this.mListener.onMaterialChanged((RenderModel) this.selfStorage);
    }

    private List<Material> generatePlayList(TemplateModel templateModel) {
        ArrayList arrayList = new ArrayList(10);
        Tracks tracksOrElse = TemplateUtil.findVideoTrack(templateModel).orElse(null);
        if (tracksOrElse == null) {
            LogUtil.b(TAG, "generatePlayList play track is null, can not generate playList.");
            return arrayList;
        }
        for (Segments segments : tracksOrElse.getSegments()) {
            TargetTimeRange segmentsTargetTimerange = segments.getSegmentsTargetTimerange();
            if (segmentsTargetTimerange == null) {
                LogUtil.b(TAG, "generatePlayList segment: ", segments.getId(), ", targetTimeRange is null.");
            } else {
                Material material = new Material(segments.getId(), segments.getMaterialId(), new TimeRange(segmentsTargetTimerange));
                material.setRenderIndex(segments.getRenderIndex());
                material.setBackgroundType(getBackgroundType(templateModel.getCanvasInfo(), segments.getExtraMaterialRefs()));
                arrayList.add(material);
            }
        }
        setMaterialInfo(templateModel, arrayList);
        return arrayList;
    }

    private int getBackgroundType(List<CanvasInfo> list, List<String> list2) {
        if (list2 == null || list2.size() == 0 || list == null) {
            return 0;
        }
        for (String str : list2) {
            for (CanvasInfo canvasInfo : list) {
                if (canvasInfo.getId().equals(str) && "blur".equals(canvasInfo.getType())) {
                    return 1;
                }
            }
        }
        return 0;
    }

    private void setMaterialInfo(TemplateModel templateModel, List<Material> list) {
        Videos next;
        List<Videos> videos = templateModel.getMaterials().getVideos();
        if (videos == null || videos.size() < 1) {
            LogUtil.b(TAG, "setMaterialInfo videos in newModel is invalid.");
            return;
        }
        for (Material material : list) {
            Iterator<Videos> it = videos.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!material.getMaterialId().equals(next.getId()));
            if (next == null) {
                LogUtil.b(TAG, "setMaterialInfo curVideo is null, can not init material info.");
                return;
            }
            material.setWidth(next.getWidth()).setHeight(next.getHeight()).setRotation((int) next.getRotation()).setMaterialType(next.getType());
        }
    }
}

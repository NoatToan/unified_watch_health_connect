package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import com.google.gson.Gson;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.GenerateTemplateModel;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.DefaultGenerator;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.FrameRatioEnum;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.ThemeGenerator;
import com.huawei.watchface.videoedit.param.CanvasConfig;
import com.huawei.watchface.videoedit.param.MaterialInfo;
import com.huawei.watchface.videoedit.param.Materials;
import com.huawei.watchface.videoedit.param.Segments;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.param.Tracks;
import com.huawei.watchface.videoedit.param.Videos;
import com.huawei.watchface.videoedit.sysc.Optional;
import com.huawei.watchface.videoedit.utils.SafeIntent;
import com.huawei.watchface.videoedit.utils.UuidManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TemplateModelGenerator implements GenerateTemplateModel {
    private static final String VIDEO = "video";
    private Context mContext;

    public TemplateModelGenerator(Context context) {
        this.mContext = context;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.GenerateTemplateModel
    public TemplateModel generateMode(Intent intent) throws IllegalStateException {
        Trace.beginSection("generateMode");
        TemplateModel templateModelGenModelForSingelVideoEdit = genModelForSingelVideoEdit(new SafeIntent(intent));
        Trace.endSection();
        if (templateModelGenModelForSingelVideoEdit != null) {
            return templateModelGenModelForSingelVideoEdit;
        }
        throw new IllegalStateException("create model fail");
    }

    private void fillOriginModelInfo(TemplateModel templateModel, MaterialInfo[] materialInfoArr) {
        templateModel.setId(templateModel.getUuidManager().generateNewId());
        templateModel.withTracks(new ArrayList());
        FrameRatioEnum frameRatioEnum = FrameRatioEnum._1_1;
        CanvasConfig canvasConfig = new CanvasConfig("default");
        canvasConfig.setRatio(frameRatioEnum.getRatioStr());
        canvasConfig.setWidth(frameRatioEnum.getWidth());
        canvasConfig.setHeight(frameRatioEnum.getHeight());
        templateModel.withCanvasConfig(canvasConfig);
        initVideoConfig(templateModel, materialInfoArr, templateModel.withMaterials(new Materials()).getMaterials().withVideos(new ArrayList()));
    }

    private void initVideoConfig(TemplateModel templateModel, MaterialInfo[] materialInfoArr, Materials materials) {
        Tracks tracks = new Tracks();
        tracks.withId(templateModel.getUuidManager().generateNewId()).withType("video").withSegments(new ArrayList());
        List<Videos> videos = materials.getVideos();
        for (MaterialInfo materialInfo : materialInfoArr) {
            String strGenerateNewId = templateModel.getUuidManager().generateNewId();
            Videos videos2 = new Videos(materialInfo);
            videos2.setId(strGenerateNewId);
            videos.add(videos2);
            Segments segments = new Segments(templateModel.getUuidManager().generateNewId(), strGenerateNewId);
            segments.setVolume(100);
            tracks.getSegments().add(segments);
        }
        templateModel.getTracks().add(tracks);
    }

    private TemplateModel genModelForSingelVideoEdit(SafeIntent safeIntent) {
        MaterialInfo[] materialInfoArr = (MaterialInfo[]) new Gson().fromJson(safeIntent.getStringExtra(TemplateUtil.TEMPLATE_MEDIA_INFO), MaterialInfo[].class);
        TemplateModel templateModel = new TemplateModel(new UuidManager());
        fillOriginModelInfo(templateModel, materialInfoArr);
        TemplateModel themeParameters = setThemeParameters(templateModel, new DefaultGenerator());
        flushVideoSizeToCanvasConfig(themeParameters);
        themeParameters.setType(TemplateUtil.MODEL_TYPE_FREE);
        return themeParameters;
    }

    private TemplateModel setThemeParameters(TemplateModel templateModel, ThemeGenerator themeGenerator) {
        TemplateModel templateModelGenerateModel = themeGenerator.generateModel(this.mContext, templateModel);
        templateModel.setName("Origin");
        templateModel.setIsFormedByTheme(true);
        return templateModelGenerateModel;
    }

    private void flushVideoSizeToCanvasConfig(TemplateModel templateModel) {
        CanvasConfig canvasConfig = templateModel.getCanvasConfig();
        if (canvasConfig == null) {
            return;
        }
        canvasConfig.flushCanvasWithVideo(getFirstVideoMaterialFromId(templateModel));
    }

    public static Optional<Videos> getFirstVideoMaterialFromId(TemplateModel templateModel) {
        if (templateModel == null) {
            return Optional.empty();
        }
        List<Videos> videos = templateModel.getMaterials().getVideos();
        if (videos.size() > 0) {
            return Optional.of(videos.get(0));
        }
        return Optional.empty();
    }
}

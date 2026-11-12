package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit;

import android.content.Context;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.TemplateUtil;
import com.huawei.watchface.videoedit.gles.Constant;
import com.huawei.watchface.videoedit.param.Segments;
import com.huawei.watchface.videoedit.param.SourceTimeRange;
import com.huawei.watchface.videoedit.param.TargetTimeRange;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.param.Tracks;
import com.huawei.watchface.videoedit.param.Videos;
import com.huawei.watchface.videoedit.utils.ListUtil;
import com.huawei.watchface.videoedit.utils.TrackUtils;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ThemeGenerator {
    protected static final String AUDIO = "audio";
    protected static final String PHOTO = "photo";
    private static final String TAG = "ThemeGenerator";
    protected static final String VIDEO = "video";
    TemplateModel mModel;

    public TemplateModel generateModel(Context context, TemplateModel templateModel) {
        this.mModel = templateModel;
        clearFormat(templateModel);
        clearMaterialVolume(templateModel);
        return this.mModel;
    }

    private static void clearMaterialVolume(TemplateModel templateModel) {
        List<Segments> videoSegments = TrackUtils.getVideoSegments(templateModel);
        if (ListUtil.isEmpty(videoSegments)) {
            return;
        }
        Iterator<Segments> it = videoSegments.iterator();
        while (it.hasNext()) {
            it.next().setVolume(0);
        }
    }

    int checkAndSetEssentialTimeRage() {
        TemplateModel templateModel = this.mModel;
        int duration = 0;
        if (templateModel == null || !TemplateUtil.MODEL_TYPE_ESSENTIAL.equals(templateModel.getType())) {
            return 0;
        }
        Videos videos = this.mModel.getMaterials().getVideos().get(0);
        List<Segments> videoSegments = TrackUtils.getVideoSegments(this.mModel);
        videoSegments.clear();
        for (SourceTimeRange sourceTimeRange : this.mModel.getEssentialTimeRanges()) {
            Segments segments = new Segments(this.mModel.getUuidManager().generateNewId(), videos.getId());
            segments.setSourceTimerange(new SourceTimeRange(sourceTimeRange.getStart(), sourceTimeRange.getDuration()));
            segments.setTargetTimerange(new TargetTimeRange(duration, sourceTimeRange.getDuration()));
            videoSegments.add(segments);
            duration += sourceTimeRange.getDuration();
        }
        return duration;
    }

    static void setModelDuration(TemplateModel templateModel, int i) {
        Tracks next;
        templateModel.setDuration(i);
        Iterator<Tracks> it = templateModel.getTracks().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Constant.FILTER.equals(next.getType()));
        if (next == null) {
            return;
        }
        next.getSegments().get(0).getSegmentsSourceTimeRange().setDuration(i);
        next.getSegments().get(0).getSegmentsTargetTimerange().setDuration(i);
    }

    public static void setModelDuration(TemplateModel templateModel, int i, int i2) {
        List list = (List) TrackUtils.getVideoTracks(templateModel).map(new ThemeGenerator$$ExternalSyntheticLambda0()).orElse(new ArrayList());
        if (ListUtil.isEmpty(list)) {
            LogUtil.b(TAG, "setModelDuration handleTemplate empty segment list.");
            return;
        }
        int size = ListUtil.size(list);
        for (int i3 = 0; i3 < size; i3++) {
            SourceTimeRange segmentsSourceTimeRange = ((Segments) list.get(i3)).getSegmentsSourceTimeRange();
            TargetTimeRange segmentsTargetTimerange = ((Segments) list.get(i3)).getSegmentsTargetTimerange();
            segmentsSourceTimeRange.setStart(i);
            segmentsSourceTimeRange.setDuration(i2);
            segmentsTargetTimerange.setDuration(i2);
        }
        templateModel.setDuration(i2);
    }

    static void clearFormat(TemplateModel templateModel) {
        if (templateModel == null || templateModel.getMaterials() == null) {
            return;
        }
        for (int i = 0; i < templateModel.getTracks().size(); i++) {
            if ("audio".equals(templateModel.getTracks().get(i).getType())) {
                templateModel.getTracks().remove(i);
            }
        }
    }
}

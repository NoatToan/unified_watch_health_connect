package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit;

import android.content.Context;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.TemplateUtil;
import com.huawei.watchface.videoedit.param.Segments;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.param.Tracks;
import com.huawei.watchface.videoedit.param.Videos;
import com.huawei.watchface.videoedit.presenter.PresenterUtils;
import com.huawei.watchface.videoedit.utils.ListUtil;
import com.huawei.watchface.videoedit.utils.MaterialUtil;
import com.huawei.watchface.videoedit.utils.TrackUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultGenerator extends ThemeGenerator {
    private static final int PHOTO_DEFAULT_DURATION = 3000;

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.ThemeGenerator
    public TemplateModel generateModel(Context context, TemplateModel templateModel) {
        this.mModel = templateModel;
        clearFormat(templateModel);
        Tracks tracks = null;
        for (Tracks tracks2 : templateModel.getTracks()) {
            if ("video".equals(tracks2.getType())) {
                tracks = tracks2;
            }
        }
        int iCheckAndSetEssentialTimeRage = 0;
        if (tracks != null && !TemplateUtil.MODEL_TYPE_ESSENTIAL.equals(this.mModel.getType())) {
            int duration = 0;
            for (Segments segments : tracks.getSegments()) {
                if (segments.getExtraMaterialRefs() == null) {
                    segments.setExtraMaterialRefs(new ArrayList());
                } else {
                    segments.getExtraMaterialRefs().clear();
                }
                segments.setOverlapGapAtTop(0);
                segments.setOverlapGapAtLast(0);
                Videos videosOrElse = MaterialUtil.getVideoFromId(templateModel, segments.getMaterialId()).orElse(null);
                if (videosOrElse != null) {
                    if (PresenterUtils.PHOTO.equals(videosOrElse.getType())) {
                        segments.getSegmentsTargetTimerange().withStart(duration).withDuration(3000);
                        segments.getSegmentsSourceTimeRange().withStart(0).withDuration(3000);
                        duration += 3000;
                    } else {
                        segments.getSegmentsTargetTimerange().withStart(duration).withDuration(videosOrElse.getDuration());
                        segments.getSegmentsSourceTimeRange().withStart(0).withDuration(videosOrElse.getDuration());
                        duration += videosOrElse.getDuration();
                    }
                }
            }
            iCheckAndSetEssentialTimeRage = duration;
        }
        if (TemplateUtil.MODEL_TYPE_ESSENTIAL.equals(this.mModel.getType())) {
            iCheckAndSetEssentialTimeRage = checkAndSetEssentialTimeRage();
        }
        List<Segments> videoSegments = TrackUtils.getVideoSegments(templateModel);
        if (!ListUtil.isEmpty(videoSegments)) {
            Iterator<Segments> it = videoSegments.iterator();
            while (it.hasNext()) {
                it.next().setVolume(100);
            }
        }
        setModelDuration(templateModel, iCheckAndSetEssentialTimeRage);
        return this.mModel;
    }
}

package defpackage;

import com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData;
import com.huawei.healthcloud.plugintrack.model.ITrackSummaryDataFactory;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jbz implements ITrackSummaryDataFactory {
    @Override // com.huawei.healthcloud.plugintrack.model.ITrackSummaryDataFactory
    public AbstractTrackSummaryData createSingleTrackSummaryData(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("Track_TrackSummaryDataFactory", "The sport data is null");
            return null;
        }
        switch (motionPathSimplify.requestSportType()) {
            case 258:
                return new jbi(motionPathSimplify);
            case 259:
                return new jbl(motionPathSimplify);
            case 260:
            case 261:
            case 263:
            default:
                LogUtil.j("Track_TrackSummaryDataFactory", "the sport type is not surpport");
                return null;
            case 262:
                return new jbm(motionPathSimplify);
            case 264:
                return new jbe(motionPathSimplify);
            case OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE /* 265 */:
                return new jbh(motionPathSimplify);
            case OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM /* 266 */:
                return new jbk(motionPathSimplify);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.model.ITrackSummaryDataFactory
    public AbstractTrackSummaryData createSingleTrackSummaryData(RelativeSportData relativeSportData) {
        if (relativeSportData == null) {
            LogUtil.j("Track_TrackSummaryDataFactory", "The sport data is null");
            return null;
        }
        switch (relativeSportData.getSportType()) {
            case 258:
                return new jbi(relativeSportData);
            case 259:
                return new jbl(relativeSportData);
            case 260:
            case 261:
            case 263:
            default:
                LogUtil.j("Track_TrackSummaryDataFactory", "the sport type is not support");
                return null;
            case 262:
                return new jbm(relativeSportData);
            case 264:
                return new jbe(relativeSportData);
            case OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE /* 265 */:
                return new jbh(relativeSportData);
            case OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM /* 266 */:
                return new jbk(relativeSportData);
        }
    }
}

package com.huawei.healthcloud.plugintrack.model;

import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;

/* JADX INFO: loaded from: classes10.dex */
public interface ITrackSummaryDataFactory {
    AbstractTrackSummaryData createSingleTrackSummaryData(RelativeSportData relativeSportData);

    AbstractTrackSummaryData createSingleTrackSummaryData(MotionPathSimplify motionPathSimplify);
}

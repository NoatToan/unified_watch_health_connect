package com.huami.moving.ui.sport.detail.segment.factory.impl;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huami.moving.ui.sport.detail.segment.SportDetailSegmentContainerFragment;
import com.huami.moving.ui.sport.detail.segment.SportSegmentParams;
import com.huami.moving.ui.sport.detail.segment.factory.ISportDetailSegmentFgFactory;
import com.huami.moving.webapi.SportWebParams;

/* JADX INFO: loaded from: classes4.dex */
public class SportDetailSegmentContainerManualFgFactory implements ISportDetailSegmentFgFactory {
    @Override // com.huami.moving.ui.sport.detail.segment.factory.ISportDetailSegmentFgFactory
    public Fragment create(SportSegmentParams sportSegmentParams) {
        SportDetailSegmentContainerFragment sportDetailSegmentContainerFragment = new SportDetailSegmentContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("trackid", sportSegmentParams.getTrackId());
        bundle.putInt("source", sportSegmentParams.getDeviceSource());
        bundle.putInt("type", sportSegmentParams.getSportType());
        bundle.putInt("segment_type", 0);
        bundle.putBoolean(SportWebParams.PARAMA_METRIC, sportSegmentParams.isMetric());
        bundle.putBoolean(SportWebParams.PARAM_SEGMENT_EDIT, sportSegmentParams.isEdit());
        bundle.putBoolean(SportWebParams.PARAM_SEGMENT_SHOW_EDIT_BOX, sportSegmentParams.isShowEditBox());
        sportDetailSegmentContainerFragment.setArguments(bundle);
        return sportDetailSegmentContainerFragment;
    }
}

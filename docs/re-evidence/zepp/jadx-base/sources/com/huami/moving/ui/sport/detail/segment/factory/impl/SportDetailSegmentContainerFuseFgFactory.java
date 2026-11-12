package com.huami.moving.ui.sport.detail.segment.factory.impl;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huami.moving.ui.sport.detail.segment.SportDetailSegmentContainerFragment;
import com.huami.moving.ui.sport.detail.segment.SportSegmentParams;
import com.huami.moving.ui.sport.detail.segment.factory.ISportDetailSegmentFgFactory;
import com.huami.moving.webapi.SportWebParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/factory/impl/SportDetailSegmentContainerFuseFgFactory;", "Lcom/huami/moving/ui/sport/detail/segment/factory/ISportDetailSegmentFgFactory;", "Lcom/huami/moving/ui/sport/detail/segment/SportSegmentParams;", "params", "Landroidx/fragment/app/Fragment;", "create", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetailSegmentContainerFuseFgFactory implements ISportDetailSegmentFgFactory {
    @Override // com.huami.moving.ui.sport.detail.segment.factory.ISportDetailSegmentFgFactory
    @NotNull
    public Fragment create(@Nullable SportSegmentParams params) {
        SportDetailSegmentContainerFragment sportDetailSegmentContainerFragment = new SportDetailSegmentContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("trackid", params.getTrackId());
        bundle.putInt("source", params.getDeviceSource());
        bundle.putInt("type", params.getSportType());
        bundle.putInt("segment_type", 5);
        bundle.putBoolean(SportWebParams.PARAMA_METRIC, params.isMetric());
        bundle.putBoolean(SportWebParams.PARAM_SEGMENT_EDIT, params.isEdit());
        bundle.putBoolean(SportWebParams.PARAM_SEGMENT_SHOW_EDIT_BOX, params.isShowEditBox());
        sportDetailSegmentContainerFragment.setArguments(bundle);
        return sportDetailSegmentContainerFragment;
    }
}

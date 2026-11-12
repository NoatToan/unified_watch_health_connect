package com.huami.moving.ui.utils;

import com.huami.mifit.sportlib.core.Geohash;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.watch.dataflow.sync.util.SyncConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "", "segmentData2NetFormat", "moving_release"}, k = 2, mv = {1, 5, 1})
public final class LapConvertUtilsKt {
    @NotNull
    public static final String segmentData2NetFormat(@NotNull SportSegmentData sportSegmentData) {
        StringBuilder sb = new StringBuilder();
        sb.append(sportSegmentData.getIndex() - 1);
        sb.append(",");
        sb.append(sportSegmentData.getCostTime());
        sb.append(",");
        sb.append(sportSegmentData.getDistance());
        sb.append(",");
        if (sportSegmentData.getGeohash() == null) {
            sb.append(Geohash.encode(sportSegmentData.getLatitude() / 3000000.0d, sportSegmentData.getLongitude() / 3000000.0d));
            sb.append(",");
        } else {
            sb.append(sportSegmentData.getGeohash());
            sb.append(",");
        }
        sb.append(sportSegmentData.getAvgHR());
        sb.append(",");
        sb.append(sportSegmentData.getOffsetTime());
        sb.append(",");
        sb.append(SyncConst.ALTITUDE_INVALID_VALUE);
        sb.append(",");
        sb.append(-1);
        sb.append(",");
        sb.append(-1);
        sb.append(",");
        sb.append(sportSegmentData.getAvgPace());
        sb.append(",");
        sb.append(sportSegmentData.getMaxPace());
        sb.append(",");
        sb.append(-1);
        sb.append(",");
        sb.append(sportSegmentData.getStrokeSpeed());
        sb.append(",");
        sb.append(sportSegmentData.getStrokes());
        sb.append(",");
        sb.append(sportSegmentData.getSwolf());
        sb.append(",");
        sb.append(sportSegmentData.getCal());
        sb.append(",");
        sb.append(sportSegmentData.getAvgStepFreq());
        sb.append(",");
        sb.append(-1);
        sb.append(",");
        sb.append(sportSegmentData.getType());
        sb.append(",");
        sb.append(sportSegmentData.getRopeSkippingCount());
        sb.append(",");
        sb.append(0);
        sb.append(",");
        sb.append(sportSegmentData.getWeight());
        sb.append(",");
        sb.append(sportSegmentData.getCount());
        sb.append(",");
        sb.append(sportSegmentData.getUnit());
        sb.append(",");
        sb.append(sportSegmentData.getFloor());
        sb.append(",");
        sb.append(sportSegmentData.getFloorPerMin());
        sb.append(",");
        sb.append(sportSegmentData.getSwimStyle());
        sb.append(",");
        sb.append(sportSegmentData.getTrainGroupType());
        sb.append(",");
        sb.append(sportSegmentData.getStrengthTrainType());
        sb.append(";");
        return sb.toString();
    }
}

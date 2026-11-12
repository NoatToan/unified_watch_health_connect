package com.xiaomi.hm.health.ui.sportfitness.watermark;

import android.content.Context;
import com.huami.moving.ui.watermark.WatermarkDelegate;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.hm.health.watermarkcamera.ui.activity.WatermarkActivity;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkShareDataUtil;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/watermark/WatermarkDelegateImpl;", "Lcom/huami/moving/ui/watermark/WatermarkDelegate;", "", "name", "", "setDeviceName", "", "from", "setFromSportSummary", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "trackId", "", "source", "startWatermarkActivity", "requestWatermarkApi", "sportType", TdmillHmFragment.ARG_IS_METRIC, "fillDataToValueMap", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatermarkDelegateImpl implements WatermarkDelegate {
    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void fillDataToValueMap(long trackId, int source, int sportType, boolean isMetric) {
        WatermarkShareDataUtil.fillDataToValueMap(trackId, source, sportType, isMetric);
    }

    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void requestWatermarkApi() {
        GetWatermarkAPI.getWebWatermark(false);
        GetWatermarkAPI.getWebStickerWatermark(false);
    }

    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void setDeviceName(@NotNull String name) {
        WatermarkShareDataUtil.setDeviceName(name);
    }

    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void setFromSportSummary(boolean from) {
        WatermarkShareDataUtil.setFromSportSummary(from);
    }

    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void startWatermarkActivity(@NotNull Context context, long trackId, int source) {
        WatermarkActivity.start(context, trackId, source);
    }
}

package com.xiaomi.hm.health.ui.sportfitness.watermark;

import com.huami.moving.ui.utils.DataFormatter;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataFormatterAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkDataFormatterAdapter implements DataFormatterAdapter {
    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataFormatterAdapter
    public String formatTimeInSportForm(long seconds) {
        return DataFormatter.formatTimeInSportFormForPace(seconds);
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataFormatterAdapter
    public String getConsumeTime(long seconds) {
        return DataFormatter.getConsumeTime(seconds);
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataFormatterAdapter
    public String parseRawKilometerToFormatKilometer(float distance) {
        return DataFormatter.parseRawKilometerToFormatKilometer(distance);
    }
}

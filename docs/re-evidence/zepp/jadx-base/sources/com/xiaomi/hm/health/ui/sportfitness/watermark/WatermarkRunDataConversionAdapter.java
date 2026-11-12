package com.xiaomi.hm.health.ui.sportfitness.watermark;

import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.RunDataConversionAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkRunDataConversionAdapter implements RunDataConversionAdapter {
    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.RunDataConversionAdapter
    public long convertTospkm(float data) {
        return RunDataConversion.convertTospkm(data);
    }
}

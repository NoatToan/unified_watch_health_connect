package com.xiaomi.hm.health.utils;

import android.content.Context;
import com.huami.moving.ui.watermark.WatermarkClient;
import com.xiaomi.hm.health.ui.sportfitness.watermark.WatermarkDataFormatterAdapter;
import com.xiaomi.hm.health.ui.sportfitness.watermark.WatermarkDataTypeSourceAdapter;
import com.xiaomi.hm.health.ui.sportfitness.watermark.WatermarkDelegateImpl;
import com.xiaomi.hm.health.ui.sportfitness.watermark.WatermarkGPSAddressConversionAdapter;
import com.xiaomi.hm.health.ui.sportfitness.watermark.WatermarkRunDataConversionAdapter;
import com.xiaomi.hm.health.ui.sportfitness.watermark.WatermarkTrackRecordManagerAdapter;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.DataFormatterProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.DataTypeSourceProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.GPSAddressConversionProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.RunDataConversionProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.TrackRecordManagerProxy;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkLib {
    public static void init(Context context) {
        DataFormatterProxy.getInstance().setAdapter(new WatermarkDataFormatterAdapter());
        DataTypeSourceProxy.getInstance().setAdapter(new WatermarkDataTypeSourceAdapter());
        RunDataConversionProxy.getInstance().setAdapter(new WatermarkRunDataConversionAdapter());
        TrackRecordManagerProxy.getInstance().setAdapter(new WatermarkTrackRecordManagerAdapter());
        GPSAddressConversionProxy.getInstance().setAdapter(new WatermarkGPSAddressConversionAdapter());
        WatermarkClient.INSTANCE.getInstance().delegate = new WatermarkDelegateImpl();
    }
}

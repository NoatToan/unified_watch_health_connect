package com.xiaomi.hm.health.ui.sportfitness.watermark;

import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataTypeSourceAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkDataTypeSourceAdapter implements DataTypeSourceAdapter {
    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataTypeSourceAdapter
    public int getRunSourceValue(int sourceType) {
        if (sourceType == 0) {
            return DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue();
        }
        if (sourceType == 1) {
            return DataTypeSource.RunSource.RUN_SOURCE_WATCH.getValue();
        }
        if (sourceType == 2) {
            return DataTypeSource.RunSource.RUN_SOURCE_CHAOHU.getValue();
        }
        if (sourceType == 3) {
            return DataTypeSource.RunSource.RUN_SOURCE_TEMPO.getValue();
        }
        if (sourceType != 4) {
            return sourceType != 5 ? DataTypeSource.RunSource.RUN_SOURCE_DEFAULT.getValue() : DataTypeSource.RunSource.RUN_SOURCE_WATCH_2S.getValue();
        }
        return DataTypeSource.RunSource.RUN_SOURCE_WATCH_2.getValue();
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataTypeSourceAdapter
    public int getRunType(int runType) {
        switch (runType) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            default:
                return -1;
        }
    }
}

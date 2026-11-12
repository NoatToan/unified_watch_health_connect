package com.xiaomi.hm.health.watermarkcamera.utils.proxy;

import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataTypeSourceAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class DataTypeSourceProxy implements DataTypeSourceAdapter {
    public static final int RUN_SOURCE_CHAOHU = 2;
    public static final int RUN_SOURCE_DEFAULT = -1;
    public static final int RUN_SOURCE_PHONE = 0;
    public static final int RUN_SOURCE_TEMPO = 3;
    public static final int RUN_SOURCE_WATCH = 1;
    public static final int RUN_SOURCE_WATCH_2 = 4;
    public static final int RUN_SOURCE_WATCH_2S = 5;
    public static final int RUN_TYPE_CALORIE = 4;
    public static final int RUN_TYPE_CROSSCOUNTRY = 7;
    public static final int RUN_TYPE_DISTANCE = 2;
    public static final int RUN_TYPE_INDOOR = 8;
    public static final int RUN_TYPE_INTERVAL = 5;
    public static final int RUN_TYPE_OUTDOOR = 1;
    public static final int RUN_TYPE_STRIDES = 6;
    public static final int RUN_TYPE_TIME = 3;
    public static final int SPORT_TYPE_BIKE = 9;
    public static final int SPORT_TYPE_BIKE_INDOOR_RIDE = 10;
    public static final int SPORT_TYPE_ELLIPTICAL_TRAINER = 12;
    public static final int SPORT_TYPE_SKI = 11;
    private DataTypeSourceAdapter a;

    public static class a {
        private static final DataTypeSourceProxy a = new DataTypeSourceProxy();

        private a() {
        }
    }

    private DataTypeSourceProxy() {
    }

    public static DataTypeSourceProxy getInstance() {
        return a.a;
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataTypeSourceAdapter
    public int getRunSourceValue(int i) {
        return this.a.getRunSourceValue(i);
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataTypeSourceAdapter
    public int getRunType(int i) {
        return this.a.getRunType(i);
    }

    public void setAdapter(DataTypeSourceAdapter dataTypeSourceAdapter) {
        this.a = dataTypeSourceAdapter;
    }
}

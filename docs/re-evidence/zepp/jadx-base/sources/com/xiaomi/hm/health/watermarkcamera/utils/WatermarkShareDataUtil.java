package com.xiaomi.hm.health.watermarkcamera.utils;

import androidx.annotation.DrawableRes;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.DataFormatterProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.DataTypeSourceProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.RunDataConversionProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.TrackRecordManagerProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.TrackRecordManagerAdapter;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkShareDataUtil {
    public static final int WATERMARK_CATEGORY_SPORT = 16;
    public static final int WATERMARK_CATEGORY_STICKER = 17;
    private static int a = 0;
    private static int b = 0;
    private static long c = -1;
    private static int d = -1;
    private static int e = 0;
    private static String f = null;
    private static int g = 0;
    private static boolean h = false;
    private static boolean i = false;
    private static Map<String, String> j = new HashMap();
    private static boolean k = false;

    public static void fillDataToValueMap(long j2, int i2, int i3, boolean z) {
        setRunType(i3);
        j.clear();
        k = z;
        MeasurementAdapterFactory.ILengthMeasurementAdapter iLengthMeasurementAdapterCreateLengthMeasurementAdapter = MeasurementAdapterFactory.createLengthMeasurementAdapter(z);
        TrackRecordManagerAdapter.SimpleTrackRecord trackRecordById = TrackRecordManagerProxy.getInstance().getTrackRecordById(j2, i2);
        if (trackRecordById == null || trackRecordById.getTrackid() == null) {
            return;
        }
        String str = MeasurementAdapterFactory.MeasurementStandard.British == iLengthMeasurementAdapterCreateLengthMeasurementAdapter.getStandard() ? "mi" : SportAnalytics.ParamValue.MapButtonType.KM;
        j.put(GetWatermarkAPI.KEY_NAME_MILEAGE, DataFormatterProxy.getInstance().parseRawKilometerToFormatKilometer((float) iLengthMeasurementAdapterCreateLengthMeasurementAdapter.getLength(((double) trackRecordById.getDistance().intValue()) / 1000.0d).mMeasure) + str);
        double d2 = iLengthMeasurementAdapterCreateLengthMeasurementAdapter.getPace((double) RunDataConversionProxy.getInstance().convertTospkm(trackRecordById.getPace().floatValue())).mMeasure;
        j.put("pace", String.valueOf(DataFormatterProxy.getInstance().formatTimeInSportForm((long) d2)));
        j.put("speed", DataFormatterProxy.getInstance().parseRawKilometerToFormatKilometer((float) iLengthMeasurementAdapterCreateLengthMeasurementAdapter.getSpeed(d2 > 0.0d ? (1.0d / d2) * 3600.0d : 0.0d).mMeasure));
        j.put(GetWatermarkAPI.KEY_NAME_FOREFOOT, trackRecordById.getFfpercent() != null ? trackRecordById.getFfpercent() + "%" : "--");
        j.put("heart_rate", trackRecordById.getAvghr() != null ? String.valueOf(trackRecordById.getAvghr()) : "--");
        j.put("time", DataFormatterProxy.getInstance().getConsumeTime(trackRecordById.getCosttime().intValue()));
        j.put("cadence", String.valueOf(trackRecordById.getSfreq()));
        j.put(GetWatermarkAPI.KEY_NAME_CONSUME, trackRecordById.getCal() + "Cal");
        j.put("altitude", (trackRecordById.getAltitudeAscend() == null ? 0 : trackRecordById.getAltitudeAscend().intValue()) + "m");
        j.put(GetWatermarkAPI.KEY_NAME_STEPS, String.valueOf(trackRecordById.getTotalStep() == null ? 0 : trackRecordById.getTotalStep().intValue()));
        j.put("stride", (trackRecordById.getAvgStrideLength() == null ? 0 : trackRecordById.getAvgStrideLength().intValue()) + "cm");
        for (Map.Entry<String, String> entry : j.entrySet()) {
            HMLog.d("WatermarkShareDataUtil", entry.getKey() + "==" + entry.getValue(), new Object[0]);
        }
    }

    public static long getCurrTrackId() {
        return c;
    }

    public static String getDeviceName() {
        return f;
    }

    public static int getDeviceSource() {
        return d;
    }

    public static int getLogoDrawableId() {
        return g;
    }

    public static int getRunType() {
        return e;
    }

    public static int getWatermarkShareHeight() {
        return b;
    }

    public static int getWatermarkShareWidth() {
        return a;
    }

    public static Map<String, String> getWatermarkValueMap() {
        return j;
    }

    public static boolean isFromSportSummary() {
        return h;
    }

    public static boolean isFromTrainingSummary() {
        return i;
    }

    public static boolean isMetric() {
        return k;
    }

    public static boolean isRunInternal() {
        return e == DataTypeSourceProxy.getInstance().getRunType(8) || e == DataTypeSourceProxy.getInstance().getRunType(10) || e == DataTypeSourceProxy.getInstance().getRunType(12);
    }

    public static void setCurrTrackId(long j2) {
        c = j2;
    }

    public static void setDeviceName(String str) {
        f = str;
    }

    public static void setDeviceSource(int i2) {
        d = i2;
    }

    public static void setFromSportSummary(boolean z) {
        h = z;
        i = false;
    }

    public static void setFromTrainingSummary(boolean z) {
        i = z;
        h = false;
    }

    public static void setLogoDrawableId(@DrawableRes int i2) {
        g = i2;
    }

    public static void setRunType(int i2) {
        e = i2;
    }

    public static void setWatermarkShareH(int i2) {
        b = i2;
    }

    public static void setWatermarkShareW(int i2) {
        a = i2;
    }
}

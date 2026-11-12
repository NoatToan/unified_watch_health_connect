package com.huami.watch.companion.weather.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.cloud.bean.CloudWeatherForecast;
import com.huami.watch.companion.cloud.bean.CloudWeatherRealtime;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.util.FormatUtil;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.UnitUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class WeatherUtil {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 7;
    private static final int i = 8;
    private static final int j = 9;
    private static final int k = 10;
    private static final int l = 11;
    private static final int m = 12;
    private static final int n = 13;
    private static final int o = 14;
    private static final int p = 15;
    private static final int q = 16;
    private static final int r = 17;
    private static final int s = 18;
    private static final int t = 19;
    private static final int u = 20;
    private static final int v = 21;
    private static final int w = 22;
    private static final int x = 23;

    private WeatherUtil() {
    }

    public static String formatHumidity(CloudWeatherRealtime.UnitValue unitValue) {
        if (unitValue == null) {
            return null;
        }
        return unitValue.getValue() + unitValue.getUnit();
    }

    public static String formatTemperature(String str, CloudWeatherForecast.FromTo fromTo) {
        if (fromTo == null || !"℃".equalsIgnoreCase(str)) {
            return null;
        }
        return fromTo.getFrom() + str + Constants.WAVE_SEPARATOR + fromTo.getTo() + str;
    }

    public static String formatUV(Context context, int i2) {
        Resources resources = context.getResources();
        if (i2 >= 0 && i2 <= 2) {
            return resources.getString(R.string.uv_power_weakest);
        }
        if (3 <= i2 && i2 <= 4) {
            return resources.getString(R.string.uv_power_weak);
        }
        if (5 <= i2 && i2 <= 6) {
            return resources.getString(R.string.uv_power_litter_strong);
        }
        if (7 <= i2 && i2 <= 9) {
            return resources.getString(R.string.uv_power_strong);
        }
        if (i2 >= 10) {
            return resources.getString(R.string.uv_power_very_strong);
        }
        return null;
    }

    public static String formatWeather(int i2) {
        if (i2 == 49) {
            return "强浓雾";
        }
        if (i2 == 99) {
            return "无";
        }
        switch (i2) {
            case 0:
                return "晴";
            case 1:
                return "多云";
            case 2:
                return "阴";
            case 3:
                return "阵雨";
            case 4:
                return "雷阵雨";
            case 5:
                return "冰雹";
            case 6:
                return "雨夹雪";
            case 7:
                return "小雨";
            case 8:
                return "中雨";
            case 9:
                return "大雨";
            case 10:
                return "暴雨";
            case 11:
                return "大暴雨";
            case 12:
                return "特大暴雨";
            case 13:
                return "阵雪";
            case 14:
                return "小雪";
            case 15:
                return "中雪";
            case 16:
                return "大雪";
            case 17:
                return "暴雪";
            case 18:
                return "雾";
            case 19:
                return "冻雨";
            case 20:
                return "沙尘暴";
            case 21:
                return "小到中雨";
            case 22:
                return "中到大雨";
            case 23:
                return "大到暴雨";
            case 24:
                return "暴雨到大暴雨";
            case 25:
                return "大暴雨到特大暴雨";
            case 26:
                return "小到中雪";
            case 27:
                return "中到大雪";
            case 28:
                return "大到暴雪";
            case 29:
                return "浮尘";
            case 30:
                return "扬沙";
            case 31:
                return "强沙尘暴";
            case 32:
                return "浓雾";
            default:
                switch (i2) {
                    case 53:
                        return "霾";
                    case 54:
                    case 55:
                        return "中度霾";
                    case 56:
                        return "严重霾";
                    case 57:
                        return "大雾";
                    case 58:
                        return "特强浓雾";
                    default:
                        return null;
                }
        }
    }

    public static String formatWindDirection(Context context, CloudWeatherRealtime.UnitValue unitValue) {
        if (unitValue == null) {
            return null;
        }
        Resources resources = context.getResources();
        if (!"°".equals(unitValue.getUnit())) {
            return null;
        }
        float fFloatValue = -1.0f;
        try {
            fFloatValue = Float.valueOf(unitValue.getValue()).floatValue();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (fFloatValue == 360.0f) {
            return resources.getString(R.string.wind_breeze);
        }
        if (fFloatValue == 361.0f) {
            return resources.getString(R.string.wind_rotating);
        }
        double d2 = fFloatValue;
        if ((d2 > 337.5d && fFloatValue < 360.0f) || (fFloatValue >= 0.0f && d2 < 22.5d)) {
            return resources.getString(R.string.wind_N);
        }
        if (d2 >= 22.5d && d2 <= 67.5d) {
            return resources.getString(R.string.wind_NE);
        }
        if (d2 > 67.5d && d2 < 112.5d) {
            return resources.getString(R.string.wind_E);
        }
        if (d2 >= 112.5d && d2 <= 157.5d) {
            return resources.getString(R.string.wind_SE);
        }
        if (d2 > 157.5d && d2 < 202.5d) {
            return resources.getString(R.string.wind_S);
        }
        if (d2 >= 202.5d && d2 <= 247.5d) {
            return resources.getString(R.string.wind_SW);
        }
        if (d2 > 247.5d && d2 < 292.5d) {
            return resources.getString(R.string.wind_W);
        }
        if (d2 < 292.5d || d2 > 337.5d) {
            return null;
        }
        return resources.getString(R.string.wind_NW);
    }

    public static float formatWindDirectionAngle(Context context, CloudWeatherRealtime.UnitValue unitValue) {
        if (unitValue == null || !"°".equals(unitValue.getUnit())) {
            return -1.0f;
        }
        try {
            return Float.valueOf(unitValue.getValue()).floatValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1.0f;
        }
    }

    public static String formatWindForce(Context context, CloudWeatherRealtime.UnitValue unitValue) {
        if (unitValue == null) {
            return null;
        }
        float fFloatValue = -1.0f;
        try {
            fFloatValue = Float.valueOf(unitValue.getValue()).floatValue();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (fFloatValue < 0.0f) {
            return null;
        }
        if (isGlobal(context)) {
            if (!"km/h".equalsIgnoreCase(unitValue.getUnit()) || UnitManager.isDistanceKM(context)) {
                return unitValue.getValue() + unitValue.getUnit();
            }
            return FormatUtil.in(UnitUtil.kmToMi(fFloatValue)).scale(1).out() + "mph";
        }
        if (!"km/h".equalsIgnoreCase(unitValue.getUnit())) {
            return null;
        }
        Resources resources = context.getResources();
        if (fFloatValue < 1.0f && fFloatValue >= 0.0f) {
            return resources.getString(R.string.wind_breeze);
        }
        if (fFloatValue >= 1.0f && fFloatValue < 6.0f) {
            return resources.getString(R.string.wind_power, 1);
        }
        if (fFloatValue >= 6.0f && fFloatValue < 12.0f) {
            return resources.getString(R.string.wind_power, 2);
        }
        if (fFloatValue >= 12.0f && fFloatValue < 20.0f) {
            return resources.getString(R.string.wind_power, 3);
        }
        if (fFloatValue >= 20.0f && fFloatValue < 29.0f) {
            return resources.getString(R.string.wind_power, 4);
        }
        if (fFloatValue >= 29.0f && fFloatValue < 39.0f) {
            return resources.getString(R.string.wind_power, 5);
        }
        if (fFloatValue >= 39.0f && fFloatValue < 50.0f) {
            return resources.getString(R.string.wind_power, 6);
        }
        if (fFloatValue >= 50.0f && fFloatValue < 62.0f) {
            return resources.getString(R.string.wind_power, 7);
        }
        if (fFloatValue >= 62.0f && fFloatValue < 75.0f) {
            return resources.getString(R.string.wind_power, 8);
        }
        if (fFloatValue >= 75.0f && fFloatValue < 89.0f) {
            return resources.getString(R.string.wind_power, 9);
        }
        if (fFloatValue >= 89.0f && fFloatValue < 103.0f) {
            return resources.getString(R.string.wind_power, 10);
        }
        if (fFloatValue >= 103.0f && fFloatValue < 118.0f) {
            return resources.getString(R.string.wind_power, 11);
        }
        if (fFloatValue >= 118.0f) {
            return resources.getString(R.string.wind_power_12);
        }
        return null;
    }

    public static int formatWindForceValue(CloudWeatherRealtime.UnitValue unitValue) {
        if (unitValue == null) {
            return -1;
        }
        float fFloatValue = -1.0f;
        try {
            fFloatValue = Float.valueOf(unitValue.getValue()).floatValue();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (fFloatValue < 0.0f || !"km/h".equalsIgnoreCase(unitValue.getUnit())) {
            return -1;
        }
        if (fFloatValue < 1.0f && fFloatValue >= 0.0f) {
            return 0;
        }
        if (fFloatValue >= 1.0f && fFloatValue < 6.0f) {
            return 1;
        }
        if (fFloatValue >= 6.0f && fFloatValue < 12.0f) {
            return 2;
        }
        if (fFloatValue >= 12.0f && fFloatValue < 20.0f) {
            return 3;
        }
        if (fFloatValue >= 20.0f && fFloatValue < 29.0f) {
            return 4;
        }
        if (fFloatValue >= 29.0f && fFloatValue < 39.0f) {
            return 5;
        }
        if (fFloatValue >= 39.0f && fFloatValue < 50.0f) {
            return 6;
        }
        if (fFloatValue >= 50.0f && fFloatValue < 62.0f) {
            return 7;
        }
        if (fFloatValue >= 62.0f && fFloatValue < 75.0f) {
            return 8;
        }
        if (fFloatValue >= 75.0f && fFloatValue < 89.0f) {
            return 9;
        }
        if (fFloatValue >= 89.0f && fFloatValue < 103.0f) {
            return 10;
        }
        if (fFloatValue < 103.0f || fFloatValue >= 118.0f) {
            return fFloatValue >= 118.0f ? 12 : -1;
        }
        return 11;
    }

    public static boolean isGlobal(Context context) {
        String localeStr = I18nUtil.getLocaleStr(context);
        return (TextUtils.isEmpty(localeStr) || localeStr.contains("CN")) ? false : true;
    }

    public static Calendar parsePubTime(String str) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault()).parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int toOurWeatherCode(String str) {
        int iIntValue;
        try {
            iIntValue = Integer.valueOf(str).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            iIntValue = 99;
        }
        if (iIntValue != 49) {
            if (iIntValue != 301) {
                switch (iIntValue) {
                    case 0:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 5;
                    case 4:
                        return 6;
                    case 5:
                        return 14;
                    case 6:
                        return 12;
                    case 7:
                        break;
                    case 8:
                    case 21:
                        return 8;
                    case 9:
                    case 22:
                        return 9;
                    case 10:
                    case 11:
                    case 23:
                    case 24:
                        return 10;
                    case 12:
                    case 25:
                        return 11;
                    case 13:
                        return 19;
                    case 14:
                    case 33:
                        return 15;
                    case 15:
                    case 26:
                        return 16;
                    case 16:
                    case 27:
                        return 17;
                    case 17:
                    case 28:
                        return 18;
                    case 18:
                    case 32:
                        break;
                    case 19:
                        return 13;
                    case 20:
                        return 22;
                    case 29:
                        return 20;
                    case 30:
                        return 21;
                    case 31:
                        return 23;
                    default:
                        switch (iIntValue) {
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                                return 4;
                            case 57:
                            case 58:
                                break;
                            default:
                                return -1;
                        }
                        break;
                }
            }
            return 7;
        }
        return 3;
    }
}

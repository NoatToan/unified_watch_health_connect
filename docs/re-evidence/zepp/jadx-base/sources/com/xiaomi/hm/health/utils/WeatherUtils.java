package com.xiaomi.hm.health.utils;

import android.content.Context;
import android.content.res.Configuration;
import com.huami.account.HMLoginManager;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.locweather.model.AqiInfo;
import com.xiaomi.hm.health.locweather.model.ForecastWeatherInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class WeatherUtils {
    private static final int A = 26;
    public static final int AIR_QUAL_EXCELLENT = 50;
    public static final int AIR_QUAL_GOOD = 100;
    public static final int AIR_QUAL_HEAVY_POLLUTION = 300;
    public static final int AIR_QUAL_LEGAL = 0;
    public static final int AIR_QUAL_LIGHT_POLLUTION = 150;
    public static final int AIR_QUAL_MEDIUM_POLLUTION = 200;
    private static final int B = 27;
    private static final int C = 28;
    private static final int D = 29;
    private static final int E = 30;
    private static final int F = 31;
    private static final int G = 32;
    private static final int H = 33;
    private static final int I = 49;
    private static final int J = 53;
    private static final int K = 54;
    private static final int L = 55;
    private static final int M = 56;
    private static final int N = 57;
    private static final int O = 58;
    private static final int P = 99;
    private static final float Q = 0.2f;
    private static final float R = 1.5f;
    private static final float S = 3.3f;
    private static final float T = 5.4f;
    private static final float U = 7.9f;
    private static final float V = 10.7f;
    private static final float W = 13.8f;
    public static final int WEATHER_RAIN = 301;
    private static final float X = 17.1f;
    private static final float Y = 20.7f;
    private static final float Z = 24.4f;
    private static final int a = 0;
    private static final float a0 = 28.4f;
    private static final int b = 1;
    private static final float b0 = 32.6f;
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
    private static final int y = 24;
    private static final int z = 25;

    private static Context a(Context context, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }

    private static String b(Context context, Locale locale, int i2) {
        return a(context, locale).getResources().getString(i2);
    }

    private static String c(Context context, Locale locale, int i2, Object... objArr) {
        return a(context, locale).getResources().getString(i2, objArr);
    }

    private static String d(Locale locale, int i2) {
        int i3;
        if (i2 == 49) {
            i3 = R.string.weather_extra_fog;
        } else if (i2 != 301) {
            switch (i2) {
                case 0:
                    i3 = R.string.weather_sunny;
                    break;
                case 1:
                    i3 = R.string.weather_cloudy;
                    break;
                case 2:
                    i3 = R.string.weather_overcast;
                    break;
                case 3:
                    i3 = R.string.weather_shower;
                    break;
                case 4:
                    i3 = R.string.weather_thunder_shower;
                    break;
                case 5:
                    i3 = R.string.weather_hail;
                    break;
                case 6:
                    i3 = R.string.weather_sleet;
                    break;
                case 7:
                    i3 = R.string.weather_light_rain;
                    break;
                case 8:
                    i3 = R.string.weather_moderate_rain;
                    break;
                case 9:
                    i3 = R.string.weather_heavy_rain;
                    break;
                case 10:
                    i3 = R.string.weather_rainstorm;
                    break;
                case 11:
                    i3 = R.string.weather_heavy_rainstorm;
                    break;
                case 12:
                    i3 = R.string.weather_extra_rainstorm;
                    break;
                case 13:
                    i3 = R.string.weather_snow_shower;
                    break;
                case 14:
                    i3 = R.string.weather_light_snow;
                    break;
                case 15:
                    i3 = R.string.weather_moderate_snow;
                    break;
                case 16:
                    i3 = R.string.weather_heavy_snow;
                    break;
                case 17:
                    i3 = R.string.weather_snowstorm;
                    break;
                case 18:
                    i3 = R.string.weather_fog;
                    break;
                case 19:
                    i3 = R.string.weather_freezing_rain;
                    break;
                case 20:
                    i3 = R.string.weather_sand_dust_storm;
                    break;
                case 21:
                    i3 = R.string.weather_light_to_moderate_rain;
                    break;
                case 22:
                    i3 = R.string.weather_moderate_to_heavy_rain;
                    break;
                case 23:
                    i3 = R.string.weather_heavy_rain_to_rainstorm;
                    break;
                case 24:
                    i3 = R.string.weather_normal_to_heavy_rainstorm;
                    break;
                case 25:
                    i3 = R.string.weather_heavy_to_extra_rainstorm;
                    break;
                case 26:
                    i3 = R.string.weather_light_to_moderate_snow;
                    break;
                case 27:
                    i3 = R.string.weather_moderate_to_heavy_snow;
                    break;
                case 28:
                    i3 = R.string.weather_heavy_snow_to_snowstorm;
                    break;
                case 29:
                    i3 = R.string.weather_floating_dust;
                    break;
                case 30:
                    i3 = R.string.weather_sand_blowing;
                    break;
                case 31:
                    i3 = R.string.weather_heavy_sand_and_dust_storm;
                    break;
                case 32:
                    i3 = R.string.weather_heavy_fog;
                    break;
                case 33:
                    i3 = R.string.weather_snow;
                    break;
                default:
                    switch (i2) {
                        case 53:
                            i3 = R.string.weather_haze;
                            break;
                        case 54:
                            i3 = R.string.weather_moderate_haze;
                            break;
                        case 55:
                            i3 = R.string.weather_heavy_haze;
                            break;
                        case 56:
                            i3 = R.string.weather_severe_haze;
                            break;
                        case 57:
                            i3 = R.string.weather_large_fog;
                            break;
                        case 58:
                            i3 = R.string.weather_extra_heavy_fog;
                            break;
                        default:
                            i3 = R.string.weather_unkonwn;
                            break;
                    }
                    break;
            }
        } else {
            i3 = R.string.weather_rain;
        }
        return b(DeviceXFunctionsKt.getContext(), locale, i3);
    }

    public static String getAqiDescription(Locale locale, AqiInfo aqiInfo) {
        return getAqiDescription(locale, aqiInfo.getAqi());
    }

    public static String getForecastWeatherDescription(Locale locale, int i2, int i3) {
        if (i2 == i3 || !Language.isChinese()) {
            return d(locale, i2);
        }
        String strD = d(locale, i2);
        String strD2 = d(locale, i3);
        String strB = b(DeviceXFunctionsKt.getContext(), locale, R.string.weather_unkonwn);
        if (strD.equals(strB) || strD2.equals(strB)) {
            return null;
        }
        return c(DeviceXFunctionsKt.getContext(), locale, R.string.weather_description, strD, strD2);
    }

    public static String getHumidity(Locale locale, float f2) {
        int i2 = (int) f2;
        return f2 == ((float) i2) ? c(DeviceXFunctionsKt.getContext(), locale, R.string.pyh_weather_humidity, Integer.valueOf(i2)) : c(DeviceXFunctionsKt.getContext(), locale, R.string.pyh_weather_humidity, Float.valueOf(f2));
    }

    public static String getRealtimeWeatherDescription(Locale locale, int i2) {
        String strD = d(locale, i2);
        if (strD.equals(b(DeviceXFunctionsKt.getContext(), locale, R.string.weather_unkonwn))) {
            return null;
        }
        return strD;
    }

    public static String getWindDescription(Locale locale, int i2, float f2) {
        int i3;
        if (i2 == 0) {
            return b(DeviceXFunctionsKt.getContext(), locale, R.string.no_wind);
        }
        if (f2 == 0.0f) {
            i3 = R.string.wind_north;
        } else if (f2 < 90.0f) {
            i3 = R.string.wind_east_north;
        } else if (f2 == 90.0f) {
            i3 = R.string.wind_east;
        } else if (f2 < 180.0f) {
            i3 = R.string.wind_east_south;
        } else if (f2 == 180.0f) {
            i3 = R.string.wind_south;
        } else if (f2 < 270.0f) {
            i3 = R.string.wind_west_south;
        } else if (f2 == 270.0f) {
            i3 = R.string.wind_west;
        } else {
            i3 = f2 < 360.0f ? R.string.wind_west_north : -1;
        }
        if (i3 == -1) {
            return null;
        }
        return c(DeviceXFunctionsKt.getContext(), locale, R.string.wind_descrption, b(DeviceXFunctionsKt.getContext(), locale, i3), Integer.valueOf(i2));
    }

    public static int getWindGrade(float f2) {
        float f3 = (float) (((double) f2) / 3.6d);
        if (f3 <= 0.2f) {
            return 0;
        }
        if (f3 <= 1.5f) {
            return 1;
        }
        if (f3 <= S) {
            return 2;
        }
        if (f3 <= T) {
            return 3;
        }
        if (f3 <= U) {
            return 4;
        }
        if (f3 <= V) {
            return 5;
        }
        if (f3 <= W) {
            return 6;
        }
        if (f3 <= X) {
            return 7;
        }
        if (f3 <= Y) {
            return 8;
        }
        if (f3 <= Z) {
            return 9;
        }
        if (f3 <= a0) {
            return 10;
        }
        return f3 <= b0 ? 11 : 12;
    }

    public static boolean isKoreaUser() {
        return HMLoginManager.isInKR() && HMDeviceConfig.hasFeatureKoreanDisableAutoLocate();
    }

    public static boolean isXiaomiSeries() {
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        return boundDeviceSource == HMDeviceSource.MILI_WUHAN || boundDeviceSource == HMDeviceSource.MILI_CHONGQING || boundDeviceSource == HMDeviceSource.MILI_RIO || boundDeviceSource == HMDeviceSource.MILI_CINCO || boundDeviceSource == HMDeviceSource.MILI_CINCO_L || boundDeviceSource == HMDeviceSource.MILI_KONGMING || boundDeviceSource == HMDeviceSource.MILI_KONGMING_L || boundDeviceSource == HMDeviceSource.MILI_KONGMING_LITE || boundDeviceSource == HMDeviceSource.MILI_KONGMING_PRO || boundDeviceSource == HMDeviceSource.MILI_KONGMING_PRO_L || boundDeviceSource == HMDeviceSource.MILI_PANGU_L || boundDeviceSource == HMDeviceSource.MILI_PANGU || HMDeviceConfig.isL66Series();
    }

    public static String getAqiDescription(Locale locale, int i2) {
        int i3;
        if (i2 < 0) {
            return null;
        }
        if (i2 <= 50) {
            i3 = R.string.air_qual_excellent;
        } else if (i2 <= 100) {
            i3 = R.string.air_qual_good;
        } else if (i2 <= 150) {
            i3 = R.string.air_qual_light_pollution;
        } else if (i2 <= 200) {
            i3 = R.string.air_qual_medium_pollution;
        } else {
            i3 = i2 <= 300 ? R.string.air_qual_heavy_pollution : R.string.air_qual_severe_pollution;
        }
        return b(DeviceXFunctionsKt.getContext(), locale, i3);
    }

    public static String getForecastWeatherDescription(Locale locale, ForecastWeatherInfo forecastWeatherInfo) {
        return getForecastWeatherDescription(locale, forecastWeatherInfo.getWeatherFrom(), forecastWeatherInfo.getWeatherTo());
    }
}

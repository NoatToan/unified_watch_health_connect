package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.entity.CardUIInfo;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class WeatherResp {
    public int code = -1;
    public String message;
    public Weather result;

    public static class Alert {

        @SerializedName("alertId")
        public String alertId;

        @SerializedName("detail")
        public String detail;

        @SerializedName("images")
        public Image images;

        @SerializedName("level")
        public String level;

        @SerializedName("locationKey")
        public String locationKey;

        @SerializedName("pubTime")
        public String pubTime;

        @SerializedName("title")
        public String title;

        @SerializedName("type")
        public String type;

        public static class Image {

            @SerializedName("icon")
            public String icon;

            @SerializedName("notice")
            public String notice;
        }
    }

    public static class Aqi {

        @SerializedName("aqi")
        public String aqi;

        @SerializedName("brandInfo")
        public BrandInfo brandInfo;

        @SerializedName(CommonConstants.KEY_COUNTRY)
        public String co;

        @SerializedName("no2")
        public String no2;

        @SerializedName("o3")
        public String o3;

        @SerializedName("pm10")
        public String pm10;

        @SerializedName("pm25")
        public String pm25;

        @SerializedName("primary")
        public String primary;

        @SerializedName("pubTime")
        public String pubTime;

        @SerializedName("so2")
        public String so2;

        @SerializedName("src")
        public String src;

        @SerializedName("status")
        public Integer status;
    }

    public static class BrandInfo {

        @SerializedName("brands")
        public List<Brand> brands;

        public static class Brand {

            @SerializedName(SDKConstants.KEY_BRAND_ID)
            public String brandId;

            @SerializedName(CardUIInfo.KEY_LOGO)
            public String logo;

            @SerializedName("names")
            public Names names;

            @SerializedName("url")
            public String url;

            public static class Names {

                @SerializedName("en_US")
                public String en_US;

                @SerializedName("zh_CN")
                public String zh_CN;

                @SerializedName("zh_TW")
                public String zh_TW;
            }
        }
    }

    public static class DailyForecast {

        @SerializedName("aqi")
        public ForecastAqi aqi;

        @SerializedName("aqi_level")
        public List<String> aqi_level;

        @SerializedName(DialWidgetType.PRECIPITATION_PROBABILITY)
        public PrecipitationProbability precipitationProbability;

        @SerializedName("pubTime")
        public String pubTime;

        @SerializedName("status")
        public Integer status;

        @SerializedName("sunRiseSet")
        public SunRiseSet sunRiseSet;

        @SerializedName("temperature")
        public Temperature temperature;

        @SerializedName("weather")
        public Weather weather;

        @SerializedName("weather_status")
        public List<StringFromTo> weather_status;

        @SerializedName("wind")
        public Wind wind;

        @SerializedName("wind_info")
        public WindInfo wind_info;

        public static class PrecipitationProbability {

            @SerializedName("status")
            public Integer status;

            @SerializedName("value")
            public List<String> value;
        }

        public static class SunRiseSet {

            @SerializedName("status")
            public Integer status;

            @SerializedName("value")
            public List<StringFromTo> value;
        }

        public static class Temperature {

            @SerializedName("status")
            public Integer status;

            @SerializedName("unit")
            public String unit;

            @SerializedName("value")
            public List<StringFromTo> value;
        }

        public static class Weather {

            @SerializedName("status")
            public Integer status;

            @SerializedName("value")
            public List<StringFromTo> value;
        }

        public static class Wind {

            @SerializedName("direction")
            public Direction direction;

            @SerializedName("speed")
            public Speed speed;

            public static class Direction {

                @SerializedName("status")
                public Integer status;

                @SerializedName("unit")
                public String unit;

                @SerializedName("value")
                public List<StringFromTo> value;
            }

            public static class Speed {

                @SerializedName("status")
                public Integer status;

                @SerializedName("unit")
                public String unit;

                @SerializedName("value")
                public List<StringFromTo> value;
            }
        }

        public static class WindInfo {

            @SerializedName("direction")
            public List<StringFromTo> direction;

            @SerializedName("speed")
            public List<StringFromTo> speed;
        }
    }

    public static class ForecastAqi {

        @SerializedName("brandInfo")
        public BrandInfo brandInfo;

        @SerializedName("pubTime")
        public String pubTime;

        @SerializedName("status")
        public Integer status;

        @SerializedName("value")
        public List<Integer> value;
    }

    public static class HourlyForecast {

        @SerializedName("aqi")
        public ForecastAqi aqi;

        @SerializedName("aqi_level")
        public List<String> aqi_level;

        @SerializedName("desc")
        public String desc;

        @SerializedName("status")
        public Integer status;

        @SerializedName("temperature")
        public Temperature temperature;

        @SerializedName("weather")
        public Weather weather;

        @SerializedName("weather_status")
        public List<String> weather_status;

        @SerializedName("wind")
        public Wind wind;

        @SerializedName("wind_info")
        public List<WindInfo> wind_info;

        public static class Temperature {

            @SerializedName("pubTime")
            public String pubTime;

            @SerializedName("status")
            public Integer status;

            @SerializedName("unit")
            public String unit;

            @SerializedName("value")
            public List<Integer> value;
        }

        public static class Weather {

            @SerializedName("pubTime")
            public String pubTime;

            @SerializedName("status")
            public Integer status;

            @SerializedName("value")
            public List<Integer> value;
        }

        public static class Wind {

            @SerializedName("status")
            public Integer status;

            @SerializedName("value")
            public List<Value> value;

            public static class Value {

                @SerializedName("datetime")
                public String datetime;

                @SerializedName("direction")
                public String direction;

                @SerializedName("speed")
                public String speed;
            }
        }

        public static class WindInfo {

            @SerializedName("direction")
            public String direction;

            @SerializedName("speed")
            public String speed;
        }
    }

    public static class Indice {

        @SerializedName("channelId")
        public String channelId;

        @SerializedName("details")
        public List<String> details;

        @SerializedName("extra")
        public String extra;

        @SerializedName("images")
        public Images images;

        @SerializedName("imgs")
        public List<String> imgs;

        @SerializedName("level")
        public String level;

        @SerializedName("status")
        public Integer status;

        @SerializedName("summary")
        public String summary;

        @SerializedName("title")
        public String title;

        @SerializedName("type")
        public String type;

        @SerializedName("url")
        public String url;

        public static class Images {

            @SerializedName("bg")
            public String bg;
        }
    }

    public static class Indices {

        @SerializedName("carWash")
        public Indice carWash;

        @SerializedName("clothing")
        public Indice clothing;

        @SerializedName("restriction")
        public Indice restriction;

        @SerializedName("sports")
        public Indice sports;

        @SerializedName("umbrella")
        public Indice umbrella;

        @SerializedName("uvIndex")
        public Indice uvIndex;
    }

    public static class StringFromTo {

        @SerializedName("from")
        public String from;

        @SerializedName("to")
        public String to;
    }

    public static class UnitValue {

        @SerializedName("unit")
        public String unit;

        @SerializedName("value")
        public String value;
    }

    public static class Weather {

        @SerializedName("affiliation")
        public String affiliation;

        @SerializedName("alerts")
        public List<Alert> alerts;

        @SerializedName("aqi")
        public Aqi aqi;

        @SerializedName("aqi_level")
        public String aqi_level;

        @SerializedName(Home.JSON_KEY_LOCATIONID)
        public Integer city_id;

        @SerializedName("city_name")
        public String city_name;

        @SerializedName("daily_forecast")
        public DailyForecast daily_forecast;

        @SerializedName("feelsLike")
        public UnitValue feelsLike;

        @SerializedName("hourly_forecast")
        public HourlyForecast hourly_forecast;

        @SerializedName(DialWidgetType.HUMIDITY)
        public UnitValue humidity;

        @SerializedName("indices")
        public Indices indices;

        @SerializedName("locationKey")
        public String locationKey;

        @SerializedName("location_name")
        public String location_name;

        @SerializedName("pressure")
        public UnitValue pressure;

        @SerializedName("pubTime")
        public String pubTime;

        @SerializedName("temperature")
        public UnitValue temperature;

        @SerializedName("uvIndex")
        public String uvIndex;

        @SerializedName("visibility")
        public UnitValue visibility;

        @SerializedName("weather")
        public String weather;

        @SerializedName("weather_status")
        public String weather_status;

        @SerializedName("wind")
        public Wind wind;

        @SerializedName("wind_info")
        public WindInfo wind_info;

        public String toString() {
            return "Weather{city_id=" + this.city_id + ", city_name='" + this.city_name + "', locationKey='" + this.locationKey + "', location_name='" + this.location_name + "', feelsLike=" + this.feelsLike + ", humidity=" + this.humidity + ", pressure=" + this.pressure + ", pubTime='" + this.pubTime + "', temperature=" + this.temperature + ", uvIndex='" + this.uvIndex + "', visibility=" + this.visibility + ", weather='" + this.weather + "', weather_status='" + this.weather_status + "', wind=" + this.wind + ", wind_info=" + this.wind_info + ", aqi=" + this.aqi + ", aqi_level='" + this.aqi_level + "', alerts=" + this.alerts + ", indices=" + this.indices + ", daily_forecast=" + this.daily_forecast + ", hourly_forecast=" + this.hourly_forecast + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class Wind {

        @SerializedName("direction")
        public UnitValue direction;

        @SerializedName("speed")
        public UnitValue speed;
    }

    public static class WindInfo {

        @SerializedName("direction")
        public String direction;

        @SerializedName("speed")
        public String speed;
    }
}

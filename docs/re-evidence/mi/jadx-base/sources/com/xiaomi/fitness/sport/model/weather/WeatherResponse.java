package com.xiaomi.fitness.sport.model.weather;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.entity.CardUIInfo;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\r\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse;", "", "<init>", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "result", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Weather;", "getResult", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Weather;", "setResult", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Weather;)V", "Weather", "UnitValue", "Wind", "WindInfo", "Aqi", "BrandInfo", "Alert", "Indices", "Indice", "DailyForecast", "HourlyForecast", "ForecastAqi", "StringFromTo", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeatherResponse {
    private int code = -1;

    @Nullable
    private String message;

    @Nullable
    private Weather result;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR \u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Alert;", "", "<init>", "()V", "alertId", "", "getAlertId", "()Ljava/lang/String;", "setAlertId", "(Ljava/lang/String;)V", "detail", "getDetail", "setDetail", "images", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Alert$Image;", "getImages", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Alert$Image;", "setImages", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Alert$Image;)V", "level", "getLevel", "setLevel", "locationKey", "getLocationKey", "setLocationKey", "pubTime", "getPubTime", "setPubTime", "title", "getTitle", "setTitle", "type", "getType", "setType", AIApiConstants.Image.NAME, "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Alert {

        @SerializedName("alertId")
        @Nullable
        private String alertId;

        @SerializedName("detail")
        @Nullable
        private String detail;

        @SerializedName("images")
        @Nullable
        private Image images;

        @SerializedName("level")
        @Nullable
        private String level;

        @SerializedName("locationKey")
        @Nullable
        private String locationKey;

        @SerializedName("pubTime")
        @Nullable
        private String pubTime;

        @SerializedName("title")
        @Nullable
        private String title;

        @SerializedName("type")
        @Nullable
        private String type;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Alert$Image;", "", "<init>", "()V", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "notice", "getNotice", "setNotice", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Image {

            @SerializedName("icon")
            @Nullable
            private String icon;

            @SerializedName("notice")
            @Nullable
            private String notice;

            @Nullable
            public final String getIcon() {
                return this.icon;
            }

            @Nullable
            public final String getNotice() {
                return this.notice;
            }

            public final void setIcon(@Nullable String str) {
                this.icon = str;
            }

            public final void setNotice(@Nullable String str) {
                this.notice = str;
            }
        }

        @Nullable
        public final String getAlertId() {
            return this.alertId;
        }

        @Nullable
        public final String getDetail() {
            return this.detail;
        }

        @Nullable
        public final Image getImages() {
            return this.images;
        }

        @Nullable
        public final String getLevel() {
            return this.level;
        }

        @Nullable
        public final String getLocationKey() {
            return this.locationKey;
        }

        @Nullable
        public final String getPubTime() {
            return this.pubTime;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public final void setAlertId(@Nullable String str) {
            this.alertId = str;
        }

        public final void setDetail(@Nullable String str) {
            this.detail = str;
        }

        public final void setImages(@Nullable Image image) {
            this.images = image;
        }

        public final void setLevel(@Nullable String str) {
            this.level = str;
        }

        public final void setLocationKey(@Nullable String str) {
            this.locationKey = str;
        }

        public final void setPubTime(@Nullable String str) {
            this.pubTime = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR \u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR \u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR \u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR \u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\"\u0010+\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Aqi;", "", "<init>", "()V", "aqi", "", "getAqi", "()Ljava/lang/String;", "setAqi", "(Ljava/lang/String;)V", "brandInfo", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo;", "getBrandInfo", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo;", "setBrandInfo", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo;)V", CommonConstants.KEY_COUNTRY, "getCo", "setCo", "no2", "getNo2", "setNo2", "o3", "getO3", "setO3", "pm10", "getPm10", "setPm10", "pm25", "getPm25", "setPm25", "primary", "getPrimary", "setPrimary", "pubTime", "getPubTime", "setPubTime", "so2", "getSo2", "setSo2", "src", "getSrc", "setSrc", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Aqi {

        @SerializedName("aqi")
        @Nullable
        private String aqi;

        @SerializedName("brandInfo")
        @Nullable
        private BrandInfo brandInfo;

        @SerializedName(CommonConstants.KEY_COUNTRY)
        @Nullable
        private String co;

        @SerializedName("no2")
        @Nullable
        private String no2;

        @SerializedName("o3")
        @Nullable
        private String o3;

        @SerializedName("pm10")
        @Nullable
        private String pm10;

        @SerializedName("pm25")
        @Nullable
        private String pm25;

        @SerializedName("primary")
        @Nullable
        private String primary;

        @SerializedName("pubTime")
        @Nullable
        private String pubTime;

        @SerializedName("so2")
        @Nullable
        private String so2;

        @SerializedName("src")
        @Nullable
        private String src;

        @SerializedName("status")
        @Nullable
        private Integer status;

        @Nullable
        public final String getAqi() {
            return this.aqi;
        }

        @Nullable
        public final BrandInfo getBrandInfo() {
            return this.brandInfo;
        }

        @Nullable
        public final String getCo() {
            return this.co;
        }

        @Nullable
        public final String getNo2() {
            return this.no2;
        }

        @Nullable
        public final String getO3() {
            return this.o3;
        }

        @Nullable
        public final String getPm10() {
            return this.pm10;
        }

        @Nullable
        public final String getPm25() {
            return this.pm25;
        }

        @Nullable
        public final String getPrimary() {
            return this.primary;
        }

        @Nullable
        public final String getPubTime() {
            return this.pubTime;
        }

        @Nullable
        public final String getSo2() {
            return this.so2;
        }

        @Nullable
        public final String getSrc() {
            return this.src;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        public final void setAqi(@Nullable String str) {
            this.aqi = str;
        }

        public final void setBrandInfo(@Nullable BrandInfo brandInfo) {
            this.brandInfo = brandInfo;
        }

        public final void setCo(@Nullable String str) {
            this.co = str;
        }

        public final void setNo2(@Nullable String str) {
            this.no2 = str;
        }

        public final void setO3(@Nullable String str) {
            this.o3 = str;
        }

        public final void setPm10(@Nullable String str) {
            this.pm10 = str;
        }

        public final void setPm25(@Nullable String str) {
            this.pm25 = str;
        }

        public final void setPrimary(@Nullable String str) {
            this.primary = str;
        }

        public final void setPubTime(@Nullable String str) {
            this.pubTime = str;
        }

        public final void setSo2(@Nullable String str) {
            this.so2 = str;
        }

        public final void setSrc(@Nullable String str) {
            this.src = str;
        }

        public final void setStatus(@Nullable Integer num) {
            this.status = num;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo;", "", "<init>", "()V", "brands", "", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo$Brand;", "getBrands", "()Ljava/util/List;", "setBrands", "(Ljava/util/List;)V", "Brand", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BrandInfo {

        @SerializedName("brands")
        @Nullable
        private List<Brand> brands;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo$Brand;", "", "<init>", "()V", SDKConstants.KEY_BRAND_ID, "", "getBrandId", "()Ljava/lang/String;", "setBrandId", "(Ljava/lang/String;)V", CardUIInfo.KEY_LOGO, "getLogo", "setLogo", "names", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo$Brand$Names;", "getNames", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo$Brand$Names;", "setNames", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo$Brand$Names;)V", "url", "getUrl", "setUrl", "Names", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Brand {

            @SerializedName(SDKConstants.KEY_BRAND_ID)
            @Nullable
            private String brandId;

            @SerializedName(CardUIInfo.KEY_LOGO)
            @Nullable
            private String logo;

            @SerializedName("names")
            @Nullable
            private Names names;

            @SerializedName("url")
            @Nullable
            private String url;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo$Brand$Names;", "", "<init>", "()V", "en_US", "", "getEn_US", "()Ljava/lang/String;", "setEn_US", "(Ljava/lang/String;)V", "zh_TW", "getZh_TW", "setZh_TW", "zh_CN", "getZh_CN", "setZh_CN", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Names {

                @SerializedName("en_US")
                @Nullable
                private String en_US;

                @SerializedName("zh_CN")
                @Nullable
                private String zh_CN;

                @SerializedName("zh_TW")
                @Nullable
                private String zh_TW;

                @Nullable
                public final String getEn_US() {
                    return this.en_US;
                }

                @Nullable
                public final String getZh_CN() {
                    return this.zh_CN;
                }

                @Nullable
                public final String getZh_TW() {
                    return this.zh_TW;
                }

                public final void setEn_US(@Nullable String str) {
                    this.en_US = str;
                }

                public final void setZh_CN(@Nullable String str) {
                    this.zh_CN = str;
                }

                public final void setZh_TW(@Nullable String str) {
                    this.zh_TW = str;
                }
            }

            @Nullable
            public final String getBrandId() {
                return this.brandId;
            }

            @Nullable
            public final String getLogo() {
                return this.logo;
            }

            @Nullable
            public final Names getNames() {
                return this.names;
            }

            @Nullable
            public final String getUrl() {
                return this.url;
            }

            public final void setBrandId(@Nullable String str) {
                this.brandId = str;
            }

            public final void setLogo(@Nullable String str) {
                this.logo = str;
            }

            public final void setNames(@Nullable Names names) {
                this.names = names;
            }

            public final void setUrl(@Nullable String str) {
                this.url = str;
            }
        }

        @Nullable
        public final List<Brand> getBrands() {
            return this.brands;
        }

        public final void setBrands(@Nullable List<Brand> list) {
            this.brands = list;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0006EFGHIJB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010)\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010/\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R&\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000e\"\u0004\b8\u0010\u0010R \u00109\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010?\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast;", "", "<init>", "()V", "aqi", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$ForecastAqi;", "getAqi", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$ForecastAqi;", "setAqi", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$ForecastAqi;)V", "aqi_level", "", "", "getAqi_level", "()Ljava/util/List;", "setAqi_level", "(Ljava/util/List;)V", DialWidgetType.PRECIPITATION_PROBABILITY, "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$PrecipitationProbability;", "getPrecipitationProbability", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$PrecipitationProbability;", "setPrecipitationProbability", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$PrecipitationProbability;)V", "pubTime", "getPubTime", "()Ljava/lang/String;", "setPubTime", "(Ljava/lang/String;)V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sunRiseSet", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$SunRiseSet;", "getSunRiseSet", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$SunRiseSet;", "setSunRiseSet", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$SunRiseSet;)V", "temperature", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Temperature;", "getTemperature", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Temperature;", "setTemperature", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Temperature;)V", "weather", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Weather;", "getWeather", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Weather;", "setWeather", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Weather;)V", "weather_status", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$StringFromTo;", "getWeather_status", "setWeather_status", "wind", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind;", "getWind", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind;", "setWind", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind;)V", "wind_info", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$WindInfo;", "getWind_info", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$WindInfo;", "setWind_info", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$WindInfo;)V", "PrecipitationProbability", "SunRiseSet", "Temperature", "Weather", "Wind", "WindInfo", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DailyForecast {

        @SerializedName("aqi")
        @Nullable
        private ForecastAqi aqi;

        @SerializedName("aqi_level")
        @Nullable
        private List<String> aqi_level;

        @SerializedName(DialWidgetType.PRECIPITATION_PROBABILITY)
        @Nullable
        private PrecipitationProbability precipitationProbability;

        @SerializedName("pubTime")
        @Nullable
        private String pubTime;

        @SerializedName("status")
        @Nullable
        private Integer status;

        @SerializedName("sunRiseSet")
        @Nullable
        private SunRiseSet sunRiseSet;

        @SerializedName("temperature")
        @Nullable
        private Temperature temperature;

        @SerializedName("weather")
        @Nullable
        private Weather weather;

        @SerializedName("weather_status")
        @Nullable
        private List<StringFromTo> weather_status;

        @SerializedName("wind")
        @Nullable
        private Wind wind;

        @SerializedName("wind_info")
        @Nullable
        private WindInfo wind_info;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$PrecipitationProbability;", "", "<init>", "()V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PrecipitationProbability {

            @SerializedName("status")
            @Nullable
            private Integer status;

            @SerializedName("value")
            @Nullable
            private List<String> value;

            @Nullable
            public final Integer getStatus() {
                return this.status;
            }

            @Nullable
            public final List<String> getValue() {
                return this.value;
            }

            public final void setStatus(@Nullable Integer num) {
                this.status = num;
            }

            public final void setValue(@Nullable List<String> list) {
                this.value = list;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$SunRiseSet;", "", "<init>", "()V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$StringFromTo;", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SunRiseSet {

            @SerializedName("status")
            @Nullable
            private Integer status;

            @SerializedName("value")
            @Nullable
            private List<StringFromTo> value;

            @Nullable
            public final Integer getStatus() {
                return this.status;
            }

            @Nullable
            public final List<StringFromTo> getValue() {
                return this.value;
            }

            public final void setStatus(@Nullable Integer num) {
                this.status = num;
            }

            public final void setValue(@Nullable List<StringFromTo> list) {
                this.value = list;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Temperature;", "", "<init>", "()V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "unit", "", "getUnit", "()Ljava/lang/String;", "setUnit", "(Ljava/lang/String;)V", "value", "", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$StringFromTo;", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Temperature {

            @SerializedName("status")
            @Nullable
            private Integer status;

            @SerializedName("unit")
            @Nullable
            private String unit;

            @SerializedName("value")
            @Nullable
            private List<StringFromTo> value;

            @Nullable
            public final Integer getStatus() {
                return this.status;
            }

            @Nullable
            public final String getUnit() {
                return this.unit;
            }

            @Nullable
            public final List<StringFromTo> getValue() {
                return this.value;
            }

            public final void setStatus(@Nullable Integer num) {
                this.status = num;
            }

            public final void setUnit(@Nullable String str) {
                this.unit = str;
            }

            public final void setValue(@Nullable List<StringFromTo> list) {
                this.value = list;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Weather;", "", "<init>", "()V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$StringFromTo;", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Weather {

            @SerializedName("status")
            @Nullable
            private Integer status;

            @SerializedName("value")
            @Nullable
            private List<StringFromTo> value;

            @Nullable
            public final Integer getStatus() {
                return this.status;
            }

            @Nullable
            public final List<StringFromTo> getValue() {
                return this.value;
            }

            public final void setStatus(@Nullable Integer num) {
                this.status = num;
            }

            public final void setValue(@Nullable List<StringFromTo> list) {
                this.value = list;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind;", "", "<init>", "()V", "direction", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind$Direction;", "getDirection", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind$Direction;", "setDirection", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind$Direction;)V", "speed", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind$Speed;", "getSpeed", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind$Speed;", "setSpeed", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind$Speed;)V", "Direction", "Speed", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Wind {

            @SerializedName("direction")
            @Nullable
            private Direction direction;

            @SerializedName("speed")
            @Nullable
            private Speed speed;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind$Direction;", "", "<init>", "()V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "unit", "", "getUnit", "()Ljava/lang/String;", "setUnit", "(Ljava/lang/String;)V", "value", "", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$StringFromTo;", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Direction {

                @SerializedName("status")
                @Nullable
                private Integer status;

                @SerializedName("unit")
                @Nullable
                private String unit;

                @SerializedName("value")
                @Nullable
                private List<StringFromTo> value;

                @Nullable
                public final Integer getStatus() {
                    return this.status;
                }

                @Nullable
                public final String getUnit() {
                    return this.unit;
                }

                @Nullable
                public final List<StringFromTo> getValue() {
                    return this.value;
                }

                public final void setStatus(@Nullable Integer num) {
                    this.status = num;
                }

                public final void setUnit(@Nullable String str) {
                    this.unit = str;
                }

                public final void setValue(@Nullable List<StringFromTo> list) {
                    this.value = list;
                }
            }

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$Wind$Speed;", "", "<init>", "()V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "unit", "", "getUnit", "()Ljava/lang/String;", "setUnit", "(Ljava/lang/String;)V", "value", "", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$StringFromTo;", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Speed {

                @SerializedName("status")
                @Nullable
                private Integer status;

                @SerializedName("unit")
                @Nullable
                private String unit;

                @SerializedName("value")
                @Nullable
                private List<StringFromTo> value;

                @Nullable
                public final Integer getStatus() {
                    return this.status;
                }

                @Nullable
                public final String getUnit() {
                    return this.unit;
                }

                @Nullable
                public final List<StringFromTo> getValue() {
                    return this.value;
                }

                public final void setStatus(@Nullable Integer num) {
                    this.status = num;
                }

                public final void setUnit(@Nullable String str) {
                    this.unit = str;
                }

                public final void setValue(@Nullable List<StringFromTo> list) {
                    this.value = list;
                }
            }

            @Nullable
            public final Direction getDirection() {
                return this.direction;
            }

            @Nullable
            public final Speed getSpeed() {
                return this.speed;
            }

            public final void setDirection(@Nullable Direction direction) {
                this.direction = direction;
            }

            public final void setSpeed(@Nullable Speed speed) {
                this.speed = speed;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast$WindInfo;", "", "<init>", "()V", "direction", "", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$StringFromTo;", "getDirection", "()Ljava/util/List;", "setDirection", "(Ljava/util/List;)V", "speed", "getSpeed", "setSpeed", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WindInfo {

            @SerializedName("direction")
            @Nullable
            private List<StringFromTo> direction;

            @SerializedName("speed")
            @Nullable
            private List<StringFromTo> speed;

            @Nullable
            public final List<StringFromTo> getDirection() {
                return this.direction;
            }

            @Nullable
            public final List<StringFromTo> getSpeed() {
                return this.speed;
            }

            public final void setDirection(@Nullable List<StringFromTo> list) {
                this.direction = list;
            }

            public final void setSpeed(@Nullable List<StringFromTo> list) {
                this.speed = list;
            }
        }

        @Nullable
        public final ForecastAqi getAqi() {
            return this.aqi;
        }

        @Nullable
        public final List<String> getAqi_level() {
            return this.aqi_level;
        }

        @Nullable
        public final PrecipitationProbability getPrecipitationProbability() {
            return this.precipitationProbability;
        }

        @Nullable
        public final String getPubTime() {
            return this.pubTime;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        public final SunRiseSet getSunRiseSet() {
            return this.sunRiseSet;
        }

        @Nullable
        public final Temperature getTemperature() {
            return this.temperature;
        }

        @Nullable
        public final Weather getWeather() {
            return this.weather;
        }

        @Nullable
        public final List<StringFromTo> getWeather_status() {
            return this.weather_status;
        }

        @Nullable
        public final Wind getWind() {
            return this.wind;
        }

        @Nullable
        public final WindInfo getWind_info() {
            return this.wind_info;
        }

        public final void setAqi(@Nullable ForecastAqi forecastAqi) {
            this.aqi = forecastAqi;
        }

        public final void setAqi_level(@Nullable List<String> list) {
            this.aqi_level = list;
        }

        public final void setPrecipitationProbability(@Nullable PrecipitationProbability precipitationProbability) {
            this.precipitationProbability = precipitationProbability;
        }

        public final void setPubTime(@Nullable String str) {
            this.pubTime = str;
        }

        public final void setStatus(@Nullable Integer num) {
            this.status = num;
        }

        public final void setSunRiseSet(@Nullable SunRiseSet sunRiseSet) {
            this.sunRiseSet = sunRiseSet;
        }

        public final void setTemperature(@Nullable Temperature temperature) {
            this.temperature = temperature;
        }

        public final void setWeather(@Nullable Weather weather) {
            this.weather = weather;
        }

        public final void setWeather_status(@Nullable List<StringFromTo> list) {
            this.weather_status = list;
        }

        public final void setWind(@Nullable Wind wind) {
            this.wind = wind;
        }

        public final void setWind_info(@Nullable WindInfo windInfo) {
            this.wind_info = windInfo;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$ForecastAqi;", "", "<init>", "()V", "brandInfo", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo;", "getBrandInfo", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo;", "setBrandInfo", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$BrandInfo;)V", "pubTime", "", "getPubTime", "()Ljava/lang/String;", "setPubTime", "(Ljava/lang/String;)V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ForecastAqi {

        @SerializedName("brandInfo")
        @Nullable
        private BrandInfo brandInfo;

        @SerializedName("pubTime")
        @Nullable
        private String pubTime;

        @SerializedName("status")
        @Nullable
        private Integer status;

        @SerializedName("value")
        @Nullable
        private List<Integer> value;

        @Nullable
        public final BrandInfo getBrandInfo() {
            return this.brandInfo;
        }

        @Nullable
        public final String getPubTime() {
            return this.pubTime;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        public final List<Integer> getValue() {
            return this.value;
        }

        public final void setBrandInfo(@Nullable BrandInfo brandInfo) {
            this.brandInfo = brandInfo;
        }

        public final void setPubTime(@Nullable String str) {
            this.pubTime = str;
        }

        public final void setStatus(@Nullable Integer num) {
            this.status = num;
        }

        public final void setValue(@Nullable List<Integer> list) {
            this.value = list;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00046789B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R&\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R \u0010,\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R&\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010\u0010¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast;", "", "<init>", "()V", "aqi", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$ForecastAqi;", "getAqi", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$ForecastAqi;", "setAqi", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$ForecastAqi;)V", "aqi_level", "", "", "getAqi_level", "()Ljava/util/List;", "setAqi_level", "(Ljava/util/List;)V", "desc", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "temperature", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Temperature;", "getTemperature", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Temperature;", "setTemperature", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Temperature;)V", "weather", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Weather;", "getWeather", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Weather;", "setWeather", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Weather;)V", "weather_status", "getWeather_status", "setWeather_status", "wind", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Wind;", "getWind", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Wind;", "setWind", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Wind;)V", "wind_info", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$WindInfo;", "getWind_info", "setWind_info", "Temperature", "Weather", "Wind", "WindInfo", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HourlyForecast {

        @SerializedName("aqi")
        @Nullable
        private ForecastAqi aqi;

        @SerializedName("aqi_level")
        @Nullable
        private List<String> aqi_level;

        @SerializedName("desc")
        @Nullable
        private String desc;

        @SerializedName("status")
        @Nullable
        private Integer status;

        @SerializedName("temperature")
        @Nullable
        private Temperature temperature;

        @SerializedName("weather")
        @Nullable
        private Weather weather;

        @SerializedName("weather_status")
        @Nullable
        private List<String> weather_status;

        @SerializedName("wind")
        @Nullable
        private Wind wind;

        @SerializedName("wind_info")
        @Nullable
        private List<WindInfo> wind_info;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Temperature;", "", "<init>", "()V", "pubTime", "", "getPubTime", "()Ljava/lang/String;", "setPubTime", "(Ljava/lang/String;)V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "unit", "getUnit", "setUnit", "value", "", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Temperature {

            @SerializedName("pubTime")
            @Nullable
            private String pubTime;

            @SerializedName("status")
            @Nullable
            private Integer status;

            @SerializedName("unit")
            @Nullable
            private String unit;

            @SerializedName("value")
            @Nullable
            private List<Integer> value;

            @Nullable
            public final String getPubTime() {
                return this.pubTime;
            }

            @Nullable
            public final Integer getStatus() {
                return this.status;
            }

            @Nullable
            public final String getUnit() {
                return this.unit;
            }

            @Nullable
            public final List<Integer> getValue() {
                return this.value;
            }

            public final void setPubTime(@Nullable String str) {
                this.pubTime = str;
            }

            public final void setStatus(@Nullable Integer num) {
                this.status = num;
            }

            public final void setUnit(@Nullable String str) {
                this.unit = str;
            }

            public final void setValue(@Nullable List<Integer> list) {
                this.value = list;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Weather;", "", "<init>", "()V", "pubTime", "", "getPubTime", "()Ljava/lang/String;", "setPubTime", "(Ljava/lang/String;)V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Weather {

            @SerializedName("pubTime")
            @Nullable
            private String pubTime;

            @SerializedName("status")
            @Nullable
            private Integer status;

            @SerializedName("value")
            @Nullable
            private List<Integer> value;

            @Nullable
            public final String getPubTime() {
                return this.pubTime;
            }

            @Nullable
            public final Integer getStatus() {
                return this.status;
            }

            @Nullable
            public final List<Integer> getValue() {
                return this.value;
            }

            public final void setPubTime(@Nullable String str) {
                this.pubTime = str;
            }

            public final void setStatus(@Nullable Integer num) {
                this.status = num;
            }

            public final void setValue(@Nullable List<Integer> list) {
                this.value = list;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Wind;", "", "<init>", "()V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Wind$Value;", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "Value", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Wind {

            @SerializedName("status")
            @Nullable
            private Integer status;

            @SerializedName("value")
            @Nullable
            private List<Value> value;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$Wind$Value;", "", "<init>", "()V", "datetime", "", "getDatetime", "()Ljava/lang/String;", "setDatetime", "(Ljava/lang/String;)V", "direction", "getDirection", "setDirection", "speed", "getSpeed", "setSpeed", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Value {

                @SerializedName("datetime")
                @Nullable
                private String datetime;

                @SerializedName("direction")
                @Nullable
                private String direction;

                @SerializedName("speed")
                @Nullable
                private String speed;

                @Nullable
                public final String getDatetime() {
                    return this.datetime;
                }

                @Nullable
                public final String getDirection() {
                    return this.direction;
                }

                @Nullable
                public final String getSpeed() {
                    return this.speed;
                }

                public final void setDatetime(@Nullable String str) {
                    this.datetime = str;
                }

                public final void setDirection(@Nullable String str) {
                    this.direction = str;
                }

                public final void setSpeed(@Nullable String str) {
                    this.speed = str;
                }
            }

            @Nullable
            public final Integer getStatus() {
                return this.status;
            }

            @Nullable
            public final List<Value> getValue() {
                return this.value;
            }

            public final void setStatus(@Nullable Integer num) {
                this.status = num;
            }

            public final void setValue(@Nullable List<Value> list) {
                this.value = list;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast$WindInfo;", "", "<init>", "()V", "direction", "", "getDirection", "()Ljava/lang/String;", "setDirection", "(Ljava/lang/String;)V", "speed", "getSpeed", "setSpeed", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WindInfo {

            @SerializedName("direction")
            @Nullable
            private String direction;

            @SerializedName("speed")
            @Nullable
            private String speed;

            @Nullable
            public final String getDirection() {
                return this.direction;
            }

            @Nullable
            public final String getSpeed() {
                return this.speed;
            }

            public final void setDirection(@Nullable String str) {
                this.direction = str;
            }

            public final void setSpeed(@Nullable String str) {
                this.speed = str;
            }
        }

        @Nullable
        public final ForecastAqi getAqi() {
            return this.aqi;
        }

        @Nullable
        public final List<String> getAqi_level() {
            return this.aqi_level;
        }

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        public final Temperature getTemperature() {
            return this.temperature;
        }

        @Nullable
        public final Weather getWeather() {
            return this.weather;
        }

        @Nullable
        public final List<String> getWeather_status() {
            return this.weather_status;
        }

        @Nullable
        public final Wind getWind() {
            return this.wind;
        }

        @Nullable
        public final List<WindInfo> getWind_info() {
            return this.wind_info;
        }

        public final void setAqi(@Nullable ForecastAqi forecastAqi) {
            this.aqi = forecastAqi;
        }

        public final void setAqi_level(@Nullable List<String> list) {
            this.aqi_level = list;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setStatus(@Nullable Integer num) {
            this.status = num;
        }

        public final void setTemperature(@Nullable Temperature temperature) {
            this.temperature = temperature;
        }

        public final void setWeather(@Nullable Weather weather) {
            this.weather = weather;
        }

        public final void setWeather_status(@Nullable List<String> list) {
            this.weather_status = list;
        }

        public final void setWind(@Nullable Wind wind) {
            this.wind = wind;
        }

        public final void setWind_info(@Nullable List<WindInfo> list) {
            this.wind_info = list;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR \u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\"\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010&\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR \u0010)\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR \u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR \u0010/\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\t¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indice;", "", "<init>", "()V", "channelId", "", "getChannelId", "()Ljava/lang/String;", "setChannelId", "(Ljava/lang/String;)V", "details", "", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "extra", "getExtra", "setExtra", "images", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indice$Images;", "getImages", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indice$Images;", "setImages", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indice$Images;)V", "imgs", "getImgs", "setImgs", "level", "getLevel", "setLevel", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "summary", "getSummary", "setSummary", "title", "getTitle", "setTitle", "type", "getType", "setType", "url", "getUrl", "setUrl", "Images", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Indice {

        @SerializedName("channelId")
        @Nullable
        private String channelId;

        @SerializedName("details")
        @Nullable
        private List<String> details;

        @SerializedName("extra")
        @Nullable
        private String extra;

        @SerializedName("images")
        @Nullable
        private Images images;

        @SerializedName("imgs")
        @Nullable
        private List<String> imgs;

        @SerializedName("level")
        @Nullable
        private String level;

        @SerializedName("status")
        @Nullable
        private Integer status;

        @SerializedName("summary")
        @Nullable
        private String summary;

        @SerializedName("title")
        @Nullable
        private String title;

        @SerializedName("type")
        @Nullable
        private String type;

        @SerializedName("url")
        @Nullable
        private String url;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indice$Images;", "", "<init>", "()V", "bg", "", "getBg", "()Ljava/lang/String;", "setBg", "(Ljava/lang/String;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Images {

            @SerializedName("bg")
            @Nullable
            private String bg;

            @Nullable
            public final String getBg() {
                return this.bg;
            }

            public final void setBg(@Nullable String str) {
                this.bg = str;
            }
        }

        @Nullable
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        public final List<String> getDetails() {
            return this.details;
        }

        @Nullable
        public final String getExtra() {
            return this.extra;
        }

        @Nullable
        public final Images getImages() {
            return this.images;
        }

        @Nullable
        public final List<String> getImgs() {
            return this.imgs;
        }

        @Nullable
        public final String getLevel() {
            return this.level;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        public final String getSummary() {
            return this.summary;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setChannelId(@Nullable String str) {
            this.channelId = str;
        }

        public final void setDetails(@Nullable List<String> list) {
            this.details = list;
        }

        public final void setExtra(@Nullable String str) {
            this.extra = str;
        }

        public final void setImages(@Nullable Images images) {
            this.images = images;
        }

        public final void setImgs(@Nullable List<String> list) {
            this.imgs = list;
        }

        public final void setLevel(@Nullable String str) {
            this.level = str;
        }

        public final void setStatus(@Nullable Integer num) {
            this.status = num;
        }

        public final void setSummary(@Nullable String str) {
            this.summary = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indices;", "", "<init>", "()V", "restriction", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indice;", "getRestriction", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indice;", "setRestriction", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indice;)V", "clothing", "getClothing", "setClothing", "umbrella", "getUmbrella", "setUmbrella", "uvIndex", "getUvIndex", "setUvIndex", "sports", "getSports", "setSports", "carWash", "getCarWash", "setCarWash", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Indices {

        @SerializedName("carWash")
        @Nullable
        private Indice carWash;

        @SerializedName("clothing")
        @Nullable
        private Indice clothing;

        @SerializedName("restriction")
        @Nullable
        private Indice restriction;

        @SerializedName("sports")
        @Nullable
        private Indice sports;

        @SerializedName("umbrella")
        @Nullable
        private Indice umbrella;

        @SerializedName("uvIndex")
        @Nullable
        private Indice uvIndex;

        @Nullable
        public final Indice getCarWash() {
            return this.carWash;
        }

        @Nullable
        public final Indice getClothing() {
            return this.clothing;
        }

        @Nullable
        public final Indice getRestriction() {
            return this.restriction;
        }

        @Nullable
        public final Indice getSports() {
            return this.sports;
        }

        @Nullable
        public final Indice getUmbrella() {
            return this.umbrella;
        }

        @Nullable
        public final Indice getUvIndex() {
            return this.uvIndex;
        }

        public final void setCarWash(@Nullable Indice indice) {
            this.carWash = indice;
        }

        public final void setClothing(@Nullable Indice indice) {
            this.clothing = indice;
        }

        public final void setRestriction(@Nullable Indice indice) {
            this.restriction = indice;
        }

        public final void setSports(@Nullable Indice indice) {
            this.sports = indice;
        }

        public final void setUmbrella(@Nullable Indice indice) {
            this.umbrella = indice;
        }

        public final void setUvIndex(@Nullable Indice indice) {
            this.uvIndex = indice;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$StringFromTo;", "", "<init>", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "to", "getTo", "setTo", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StringFromTo {

        @SerializedName("from")
        @Nullable
        private String from;

        @SerializedName("to")
        @Nullable
        private String to;

        @Nullable
        public final String getFrom() {
            return this.from;
        }

        @Nullable
        public final String getTo() {
            return this.to;
        }

        public final void setFrom(@Nullable String str) {
            this.from = str;
        }

        public final void setTo(@Nullable String str) {
            this.to = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$UnitValue;", "", "<init>", "()V", "unit", "", "getUnit", "()Ljava/lang/String;", "setUnit", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnitValue {

        @SerializedName("unit")
        @Nullable
        private String unit;

        @SerializedName("value")
        @Nullable
        private String value;

        @Nullable
        public final String getUnit() {
            return this.unit;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public final void setUnit(@Nullable String str) {
            this.unit = str;
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010f\u001a\u00020\fH\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R \u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR \u0010 \u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR \u0010#\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R \u0010&\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR \u0010)\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R \u0010,\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR \u0010/\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R \u00102\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000e\"\u0004\b4\u0010\u0010R \u00105\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R \u0010;\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010A\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR \u0010G\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000e\"\u0004\bI\u0010\u0010R \u0010J\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u000e\"\u0004\bL\u0010\u0010R&\u0010M\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR \u0010T\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR \u0010Z\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R \u0010`\u001a\u0004\u0018\u00010a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Weather;", "", "<init>", "()V", Home.JSON_KEY_LOCATIONID, "", "getCity_id", "()Ljava/lang/Integer;", "setCity_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "city_name", "", "getCity_name", "()Ljava/lang/String;", "setCity_name", "(Ljava/lang/String;)V", "locationKey", "getLocationKey", "setLocationKey", "location_name", "getLocation_name", "setLocation_name", "feelsLike", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$UnitValue;", "getFeelsLike", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$UnitValue;", "setFeelsLike", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$UnitValue;)V", DialWidgetType.HUMIDITY, "getHumidity", "setHumidity", "pressure", "getPressure", "setPressure", "pubTime", "getPubTime", "setPubTime", "temperature", "getTemperature", "setTemperature", "uvIndex", "getUvIndex", "setUvIndex", "visibility", "getVisibility", "setVisibility", "weather", "getWeather", "setWeather", "weather_status", "getWeather_status", "setWeather_status", "wind", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Wind;", "getWind", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Wind;", "setWind", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Wind;)V", "wind_info", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$WindInfo;", "getWind_info", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$WindInfo;", "setWind_info", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$WindInfo;)V", "aqi", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Aqi;", "getAqi", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Aqi;", "setAqi", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Aqi;)V", "aqi_level", "getAqi_level", "setAqi_level", "affiliation", "getAffiliation", "setAffiliation", "alerts", "", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Alert;", "getAlerts", "()Ljava/util/List;", "setAlerts", "(Ljava/util/List;)V", "indices", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indices;", "getIndices", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indices;", "setIndices", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Indices;)V", "daily_forecast", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast;", "getDaily_forecast", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast;", "setDaily_forecast", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$DailyForecast;)V", "hourly_forecast", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast;", "getHourly_forecast", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast;", "setHourly_forecast", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$HourlyForecast;)V", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Weather {

        @SerializedName("affiliation")
        @Nullable
        private String affiliation;

        @SerializedName("alerts")
        @Nullable
        private List<Alert> alerts;

        @SerializedName("aqi")
        @Nullable
        private Aqi aqi;

        @SerializedName("aqi_level")
        @Nullable
        private String aqi_level;

        @SerializedName(Home.JSON_KEY_LOCATIONID)
        @Nullable
        private Integer city_id;

        @SerializedName("city_name")
        @Nullable
        private String city_name;

        @SerializedName("daily_forecast")
        @Nullable
        private DailyForecast daily_forecast;

        @SerializedName("feelsLike")
        @Nullable
        private UnitValue feelsLike;

        @SerializedName("hourly_forecast")
        @Nullable
        private HourlyForecast hourly_forecast;

        @SerializedName(DialWidgetType.HUMIDITY)
        @Nullable
        private UnitValue humidity;

        @SerializedName("indices")
        @Nullable
        private Indices indices;

        @SerializedName("locationKey")
        @Nullable
        private String locationKey;

        @SerializedName("location_name")
        @Nullable
        private String location_name;

        @SerializedName("pressure")
        @Nullable
        private UnitValue pressure;

        @SerializedName("pubTime")
        @Nullable
        private String pubTime;

        @SerializedName("temperature")
        @Nullable
        private UnitValue temperature;

        @SerializedName("uvIndex")
        @Nullable
        private String uvIndex;

        @SerializedName("visibility")
        @Nullable
        private UnitValue visibility;

        @SerializedName("weather")
        @Nullable
        private String weather;

        @SerializedName("weather_status")
        @Nullable
        private String weather_status;

        @SerializedName("wind")
        @Nullable
        private Wind wind;

        @SerializedName("wind_info")
        @Nullable
        private WindInfo wind_info;

        @Nullable
        public final String getAffiliation() {
            return this.affiliation;
        }

        @Nullable
        public final List<Alert> getAlerts() {
            return this.alerts;
        }

        @Nullable
        public final Aqi getAqi() {
            return this.aqi;
        }

        @Nullable
        public final String getAqi_level() {
            return this.aqi_level;
        }

        @Nullable
        public final Integer getCity_id() {
            return this.city_id;
        }

        @Nullable
        public final String getCity_name() {
            return this.city_name;
        }

        @Nullable
        public final DailyForecast getDaily_forecast() {
            return this.daily_forecast;
        }

        @Nullable
        public final UnitValue getFeelsLike() {
            return this.feelsLike;
        }

        @Nullable
        public final HourlyForecast getHourly_forecast() {
            return this.hourly_forecast;
        }

        @Nullable
        public final UnitValue getHumidity() {
            return this.humidity;
        }

        @Nullable
        public final Indices getIndices() {
            return this.indices;
        }

        @Nullable
        public final String getLocationKey() {
            return this.locationKey;
        }

        @Nullable
        public final String getLocation_name() {
            return this.location_name;
        }

        @Nullable
        public final UnitValue getPressure() {
            return this.pressure;
        }

        @Nullable
        public final String getPubTime() {
            return this.pubTime;
        }

        @Nullable
        public final UnitValue getTemperature() {
            return this.temperature;
        }

        @Nullable
        public final String getUvIndex() {
            return this.uvIndex;
        }

        @Nullable
        public final UnitValue getVisibility() {
            return this.visibility;
        }

        @Nullable
        public final String getWeather() {
            return this.weather;
        }

        @Nullable
        public final String getWeather_status() {
            return this.weather_status;
        }

        @Nullable
        public final Wind getWind() {
            return this.wind;
        }

        @Nullable
        public final WindInfo getWind_info() {
            return this.wind_info;
        }

        public final void setAffiliation(@Nullable String str) {
            this.affiliation = str;
        }

        public final void setAlerts(@Nullable List<Alert> list) {
            this.alerts = list;
        }

        public final void setAqi(@Nullable Aqi aqi) {
            this.aqi = aqi;
        }

        public final void setAqi_level(@Nullable String str) {
            this.aqi_level = str;
        }

        public final void setCity_id(@Nullable Integer num) {
            this.city_id = num;
        }

        public final void setCity_name(@Nullable String str) {
            this.city_name = str;
        }

        public final void setDaily_forecast(@Nullable DailyForecast dailyForecast) {
            this.daily_forecast = dailyForecast;
        }

        public final void setFeelsLike(@Nullable UnitValue unitValue) {
            this.feelsLike = unitValue;
        }

        public final void setHourly_forecast(@Nullable HourlyForecast hourlyForecast) {
            this.hourly_forecast = hourlyForecast;
        }

        public final void setHumidity(@Nullable UnitValue unitValue) {
            this.humidity = unitValue;
        }

        public final void setIndices(@Nullable Indices indices) {
            this.indices = indices;
        }

        public final void setLocationKey(@Nullable String str) {
            this.locationKey = str;
        }

        public final void setLocation_name(@Nullable String str) {
            this.location_name = str;
        }

        public final void setPressure(@Nullable UnitValue unitValue) {
            this.pressure = unitValue;
        }

        public final void setPubTime(@Nullable String str) {
            this.pubTime = str;
        }

        public final void setTemperature(@Nullable UnitValue unitValue) {
            this.temperature = unitValue;
        }

        public final void setUvIndex(@Nullable String str) {
            this.uvIndex = str;
        }

        public final void setVisibility(@Nullable UnitValue unitValue) {
            this.visibility = unitValue;
        }

        public final void setWeather(@Nullable String str) {
            this.weather = str;
        }

        public final void setWeather_status(@Nullable String str) {
            this.weather_status = str;
        }

        public final void setWind(@Nullable Wind wind) {
            this.wind = wind;
        }

        public final void setWind_info(@Nullable WindInfo windInfo) {
            this.wind_info = windInfo;
        }

        @NotNull
        public String toString() {
            return "Weather{city_id=" + this.city_id + ", city_name='" + this.city_name + "', locationKey='" + this.locationKey + "', location_name='" + this.location_name + "', feelsLike=" + this.feelsLike + ", humidity=" + this.humidity + ", pressure=" + this.pressure + ", pubTime='" + this.pubTime + "', temperature=" + this.temperature + ", uvIndex='" + this.uvIndex + "', visibility=" + this.visibility + ", weather='" + this.weather + "', weather_status='" + this.weather_status + "', wind=" + this.wind + ", wind_info=" + this.wind_info + ", aqi=" + this.aqi + ", aqi_level='" + this.aqi_level + "', alerts=" + this.alerts + ", indices=" + this.indices + ", daily_forecast=" + this.daily_forecast + ", hourly_forecast=" + this.hourly_forecast + "}";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Wind;", "", "<init>", "()V", "direction", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$UnitValue;", "getDirection", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$UnitValue;", "setDirection", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$UnitValue;)V", "speed", "getSpeed", "setSpeed", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Wind {

        @SerializedName("direction")
        @Nullable
        private UnitValue direction;

        @SerializedName("speed")
        @Nullable
        private UnitValue speed;

        @Nullable
        public final UnitValue getDirection() {
            return this.direction;
        }

        @Nullable
        public final UnitValue getSpeed() {
            return this.speed;
        }

        public final void setDirection(@Nullable UnitValue unitValue) {
            this.direction = unitValue;
        }

        public final void setSpeed(@Nullable UnitValue unitValue) {
            this.speed = unitValue;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$WindInfo;", "", "<init>", "()V", "direction", "", "getDirection", "()Ljava/lang/String;", "setDirection", "(Ljava/lang/String;)V", "speed", "getSpeed", "setSpeed", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WindInfo {

        @SerializedName("direction")
        @Nullable
        private String direction;

        @SerializedName("speed")
        @Nullable
        private String speed;

        @Nullable
        public final String getDirection() {
            return this.direction;
        }

        @Nullable
        public final String getSpeed() {
            return this.speed;
        }

        public final void setDirection(@Nullable String str) {
            this.direction = str;
        }

        public final void setSpeed(@Nullable String str) {
            this.speed = str;
        }
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Weather getResult() {
        return this.result;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setResult(@Nullable Weather weather) {
        this.result = weather;
    }
}

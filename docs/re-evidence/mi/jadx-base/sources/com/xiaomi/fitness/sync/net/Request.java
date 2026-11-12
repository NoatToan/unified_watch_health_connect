package com.xiaomi.fitness.sync.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.ai.api.intent.AIApiConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sync/net/Request;", "", "<init>", "()V", "GetWeather", "GetStockDetail", "GetAgpsUrl", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Request {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sync/net/Request$GetAgpsUrl;", "", "source", "", "days", "", "<init>", "(Ljava/lang/String;I)V", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "getDays", "()I", "setDays", "(I)V", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GetAgpsUrl {
        private int days;

        @Nullable
        private String source;

        public GetAgpsUrl(@Nullable String str, int i) {
            this.source = str;
            this.days = i;
        }

        public final int getDays() {
            return this.days;
        }

        @Nullable
        public final String getSource() {
            return this.source;
        }

        public final void setDays(int i) {
            this.days = i;
        }

        public final void setSource(@Nullable String str) {
            this.source = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sync/net/Request$GetStockDetail;", "", "<init>", "()V", "items", "", "Lcom/xiaomi/fitness/sync/net/Request$GetStockDetail$Stock;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", AIApiConstants.Stock.NAME, "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GetStockDetail {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @SerializedName("items")
        @Nullable
        private List<Stock> items;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sync/net/Request$GetStockDetail$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fitness/sync/net/Request$GetStockDetail;", "symbols", "", "", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final GetStockDetail create(@NotNull List<String> symbols) {
                Intrinsics.checkNotNullParameter(symbols, "symbols");
                GetStockDetail getStockDetail = new GetStockDetail();
                getStockDetail.setItems(new ArrayList());
                for (String str : symbols) {
                    List<Stock> items = getStockDetail.getItems();
                    Intrinsics.checkNotNull(items);
                    items.add(new Stock(str));
                }
                return getStockDetail;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sync/net/Request$GetStockDetail$Stock;", "", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Stock {

            @SerializedName("symbol")
            @NotNull
            private String symbol;

            public Stock(@NotNull String symbol) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                this.symbol = symbol;
            }

            @NotNull
            public final String getSymbol() {
                return this.symbol;
            }

            public final void setSymbol(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.symbol = str;
            }
        }

        @Nullable
        public final List<Stock> getItems() {
            return this.items;
        }

        public final void setItems(@Nullable List<Stock> list) {
            this.items = list;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001e\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001e\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001e\u0010\"\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001e\u0010%\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u001e\u0010(\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001c\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001c\u0010.\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\t¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/sync/net/Request$GetWeather;", "", "<init>", "()V", "locationKey", "", "getLocationKey", "()Ljava/lang/String;", "setLocationKey", "(Ljava/lang/String;)V", "longitude", "", "getLongitude", "()D", "setLongitude", "(D)V", "latitude", "getLatitude", "setLatitude", "get_current", "", "getGet_current", "()Z", "setGet_current", "(Z)V", "get_aqi", "getGet_aqi", "setGet_aqi", "get_alerts", "getGet_alerts", "setGet_alerts", "get_indices", "getGet_indices", "setGet_indices", "get_daily_forecast", "getGet_daily_forecast", "setGet_daily_forecast", "get_hourly_forecast", "getGet_hourly_forecast", "setGet_hourly_forecast", "get_city_location", "getGet_city_location", "setGet_city_location", "model", "getModel", "setModel", "fw_ver", "getFw_ver", "setFw_ver", "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GetWeather {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private String fw_ver;

        @SerializedName("latitude")
        private double latitude;

        @SerializedName("locationKey")
        @Nullable
        private String locationKey;

        @SerializedName("longitude")
        private double longitude;

        @Nullable
        private String model;

        @SerializedName("get_current")
        private boolean get_current = true;

        @SerializedName("get_aqi")
        private boolean get_aqi = true;

        @SerializedName("get_alerts")
        private boolean get_alerts = true;

        @SerializedName("get_indices")
        private boolean get_indices = true;

        @SerializedName("get_daily_forecast")
        private boolean get_daily_forecast = true;

        @SerializedName("get_hourly_forecast")
        private boolean get_hourly_forecast = true;

        @SerializedName("get_city_location")
        private boolean get_city_location = true;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sync/net/Request$GetWeather$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fitness/sync/net/Request$GetWeather;", "locationKey", "", "longitude", "", "latitude", "model", "fw_ver", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/sync/net/Request$GetWeather;", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final GetWeather create(@Nullable String locationKey, @Nullable Double longitude, @Nullable Double latitude, @Nullable String model, @Nullable String fw_ver) {
                GetWeather getWeather = new GetWeather();
                getWeather.setLocationKey(locationKey);
                getWeather.setLongitude(longitude != null ? longitude.doubleValue() : 0.0d);
                getWeather.setLatitude(latitude != null ? latitude.doubleValue() : 0.0d);
                getWeather.setModel(model);
                getWeather.setFw_ver(fw_ver);
                return getWeather;
            }
        }

        @Nullable
        public final String getFw_ver() {
            return this.fw_ver;
        }

        public final boolean getGet_alerts() {
            return this.get_alerts;
        }

        public final boolean getGet_aqi() {
            return this.get_aqi;
        }

        public final boolean getGet_city_location() {
            return this.get_city_location;
        }

        public final boolean getGet_current() {
            return this.get_current;
        }

        public final boolean getGet_daily_forecast() {
            return this.get_daily_forecast;
        }

        public final boolean getGet_hourly_forecast() {
            return this.get_hourly_forecast;
        }

        public final boolean getGet_indices() {
            return this.get_indices;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        @Nullable
        public final String getLocationKey() {
            return this.locationKey;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        @Nullable
        public final String getModel() {
            return this.model;
        }

        public final void setFw_ver(@Nullable String str) {
            this.fw_ver = str;
        }

        public final void setGet_alerts(boolean z) {
            this.get_alerts = z;
        }

        public final void setGet_aqi(boolean z) {
            this.get_aqi = z;
        }

        public final void setGet_city_location(boolean z) {
            this.get_city_location = z;
        }

        public final void setGet_current(boolean z) {
            this.get_current = z;
        }

        public final void setGet_daily_forecast(boolean z) {
            this.get_daily_forecast = z;
        }

        public final void setGet_hourly_forecast(boolean z) {
            this.get_hourly_forecast = z;
        }

        public final void setGet_indices(boolean z) {
            this.get_indices = z;
        }

        public final void setLatitude(double d) {
            this.latitude = d;
        }

        public final void setLocationKey(@Nullable String str) {
            this.locationKey = str;
        }

        public final void setLongitude(double d) {
            this.longitude = d;
        }

        public final void setModel(@Nullable String str) {
            this.model = str;
        }
    }
}

package com.xiaomi.fitness.sync.net;

import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.sync.export.model.LocationByNameResp;
import com.xiaomi.fitness.sync.export.model.PressureResp;
import com.xiaomi.fitness.sync.export.model.StockModel;
import com.xiaomi.fitness.sync.export.model.WeatherResp;
import com.xiaomi.fitness.sync.model.StockHostResp;
import com.xiaomi.fitness.sync.model.StockTokenRes;
import defpackage.dl9;
import defpackage.emb;
import defpackage.g43;
import defpackage.kdq;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.yfi;
import defpackage.zlb;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ&\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007J.\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00052\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010H§@¢\u0006\u0002\u0010\u0011J0\u0010\u0012\u001a\u00020\u00132\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010H§@¢\u0006\u0002\u0010\u0011J2\u0010\u0014\u001a\u00020\u00152\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018H§@¢\u0006\u0002\u0010\u0019J<\u0010\u001a\u001a\u00020\u001b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00102\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sync/net/SyncApiService;", "", "getWeather", "Lcom/xiaomi/fitness/sync/export/model/WeatherResp;", "locale", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPressure", "Lcom/xiaomi/fitness/sync/export/model/PressureResp;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCityNameByLocation", "Lcom/xiaomi/fitness/sync/export/model/LocationByNameResp;", "getStockHost", "Lcom/xiaomi/fitness/sync/model/StockHostResp;", "url", "Ljava/util/HashMap;", "(Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStockToken", "Lcom/xiaomi/fitness/sync/model/StockTokenRes;", "getStockInfo", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockInfo;", "author", "requestBody", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStockSuggest", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SyncApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sync/net/SyncApiService$Companion;", "", "<init>", "()V", "PATH", "", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String PATH = "healthapp/";

        private Companion() {
        }
    }

    @Nullable
    @uua("weather/get_city_location_info")
    Object getCityNameByLocation(@Nullable @xfi("data") String str, @Nullable @xfi("locale") String str2, @NotNull Continuation<? super LocationByNameResp> continuation);

    @Nullable
    @uua("weather/get_weather_pressure_v2")
    Object getPressure(@NotNull @xfi("data") String str, @NotNull Continuation<? super PressureResp> continuation);

    @emb({"RegionTag:ignore"})
    @Nullable
    @uua
    Object getStockHost(@kdq @NotNull String str, @yfi @NotNull HashMap<String, String> map, @NotNull Continuation<? super StockHostResp> continuation);

    @ngh
    @emb({"RegionTag:ignore"})
    @Nullable
    Object getStockInfo(@kdq @Nullable String str, @Nullable @zlb("Authorization") String str2, @g43 @Nullable RequestBody requestBody, @NotNull Continuation<? super StockModel.StockInfo> continuation);

    @emb({"RegionTag:ignore"})
    @Nullable
    @uua
    Object getStockSuggest(@kdq @Nullable String str, @yfi @NotNull HashMap<String, String> map, @Nullable @zlb("Authorization") String str2, @NotNull Continuation<? super StockModel.StockSuggestResult> continuation);

    @ngh
    @emb({"RegionTag:ignore"})
    @Nullable
    @u0a
    Object getStockToken(@kdq @Nullable String str, @dl9 @NotNull HashMap<String, String> map, @NotNull Continuation<? super StockTokenRes> continuation);

    @Nullable
    @uua("weather/get_weather_info_v3")
    Object getWeather(@Nullable @xfi("locale") String str, @Nullable @xfi("data") String str2, @NotNull Continuation<? super WeatherResp> continuation);
}

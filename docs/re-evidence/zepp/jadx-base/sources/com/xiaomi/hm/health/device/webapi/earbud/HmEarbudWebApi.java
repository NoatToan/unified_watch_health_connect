package com.xiaomi.hm.health.device.webapi.earbud;

import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.data.OriginSportDataApi;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.passport.AccountManager;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.m;
import org.cybergarage.upnp.device.ST;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010IJ\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004*\u00020\nH\u0002J&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fJ \u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017J$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001dR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010!R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010!R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010!R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010!R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010!R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010!R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010!R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010!R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b)\u0010>R\u001d\u0010C\u001a\u00020@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\b%\u0010BR\u001d\u0010G\u001a\u00020D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\b'\u0010F¨\u0006J"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/earbud/HmEarbudWebApi;", "Lorg/koin/core/component/KoinComponent;", "", AbstractJSONTokenResponse.RESPONSE, "", "Lcom/xiaomi/hm/health/databases/model/EarbudDateData;", "h", "data", "g", "f", "Lorg/json/JSONArray;", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfo;", "i", "startDay", "endDay", "", "withData", "Lcom/xiaomi/hm/health/device/webapi/earbud/DownloadEarbudHealthDataCallback;", "callback", "", "getData", "isSync", "updateDateDatas", "", "deviceSource", "page", "perPage", "Lcom/xiaomi/hm/health/device/webapi/earbud/EarbudCloudMusicData;", "getMusicList", "", "ids", "getMusicListById", "a", "Ljava/lang/String;", "TAG", "b", "KEY_START_DAY", "c", "KEY_END_DAY", GoogleApiAvailabilityLight.a, "KEY_QUERY_TYPE", "e", "KEY_DEVICE_TYPE", "KEY_USER_ID", "KEY_PAGE", "KEY_PER_PAGE", "KEY_USER_COUNTRY", z.j, "KEY_USER_REGION", hl.k, "KEY_AUDIS_IDS", "l", "DATA_URL", "m", "MUSIC_URL", GoogleApiAvailabilityLight.b, "MUSIC_UR_BUILTIN", "o", "QUERY_TYPE_DETAIL", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", b.r, "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/data/PropertyStoreApi;", "propertyStoreApi", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", DTransferConstants.SEARCH_KEY, "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi", "Lcom/huami/devicex/injection/data/OriginSportDataApi;", "r", "()Lcom/huami/devicex/injection/data/OriginSportDataApi;", "originSportDataApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudWebApi implements KoinComponent {

    @NotNull
    public static final HmEarbudWebApi INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "HmEarbudWebApi";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_START_DAY = "fromDate";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_END_DAY = "toDate";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_QUERY_TYPE = "tag";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_DEVICE_TYPE = "deviceType";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_USER_ID = "userid";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_PAGE = "page";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_PER_PAGE = "per_page";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_USER_COUNTRY = "user_country";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_USER_REGION = "user_region";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_AUDIS_IDS = "left_channel_builtin_ids";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final String DATA_URL = "users/%s/headsetData";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final String MUSIC_URL = "market/devices/%d/audios";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private static final String MUSIC_UR_BUILTIN = "market/devices/%d/audios/builtin";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private static final String QUERY_TYPE_DETAIL = "detail";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private static final Lazy propertyStoreApi;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceTimeStoreApi;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private static final Lazy originSportDataApi;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final HmEarbudWebApi hmEarbudWebApi = new HmEarbudWebApi();
        INSTANCE = hmEarbudWebApi;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        propertyStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<PropertyStoreApi>() { // from class: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.data.PropertyStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PropertyStoreApi invoke() {
                KoinComponent koinComponent = hmEarbudWebApi;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(PropertyStoreApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        deviceTimeStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceTimeStoreApi>() { // from class: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.DeviceTimeStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceTimeStoreApi invoke() {
                KoinComponent koinComponent = hmEarbudWebApi;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        originSportDataApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<OriginSportDataApi>() { // from class: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.data.OriginSportDataApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final OriginSportDataApi invoke() {
                KoinComponent koinComponent = hmEarbudWebApi;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(OriginSportDataApi.class), objArr4, objArr5);
            }
        });
    }

    private HmEarbudWebApi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(EarbudDateData earbudDateData, EarbudDateData earbudDateData2) {
        return SportDay.fromString(earbudDateData.getDate()).before(SportDay.fromString(earbudDateData2.getDate())) ? -1 : 1;
    }

    private final DeviceTimeStoreApi c() {
        return (DeviceTimeStoreApi) deviceTimeStoreApi.getValue();
    }

    private final OriginSportDataApi d() {
        return (OriginSportDataApi) originSportDataApi.getValue();
    }

    private final PropertyStoreApi e() {
        return (PropertyStoreApi) propertyStoreApi.getValue();
    }

    private final String f(String data) {
        JSONObject jSONObject;
        String strOptString;
        if (TextUtils.isEmpty(data)) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(data);
            return (jSONArray.length() <= 0 || (jSONObject = jSONArray.getJSONObject(0)) == null || (strOptString = jSONObject.optString("value", "")) == null) ? "" : strOptString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private final String g(String data) {
        return (TextUtils.isEmpty(data) || m.startsWith$default(data, "[", false, 2, null)) ? data : d().netSportDataStringToJson(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<EarbudDateData> h(String response) {
        int length;
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = new JSONObject(response).optJSONArray("items");
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    EarbudDateData earbudDateData = new EarbudDateData();
                    earbudDateData.setDate(jSONObject.optString("date"));
                    earbudDateData.setType(Integer.valueOf(jSONObject.optInt("deviceType", HMDeviceType.EARBUD.getValue())));
                    earbudDateData.setSource(Integer.valueOf(jSONObject.optInt("source", HMDeviceSource.EARBUD_CHOPIN.getValue())));
                    earbudDateData.setSummary(jSONObject.optString("summary"));
                    earbudDateData.setData(INSTANCE.g(jSONObject.optString("data")));
                    earbudDateData.setDeviceId(jSONObject.optString("deviceId"));
                    earbudDateData.setSync(1);
                    Unit unit = Unit.INSTANCE;
                    arrayList.add(earbudDateData);
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (Exception e) {
            HMLog.e(TAG, "parse result error", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<EarbudMusicInfo> i(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                EarbudMusicInfo earbudMusicInfo = new EarbudMusicInfo();
                earbudMusicInfo.setId(Long.valueOf(jSONObject.optInt("left_channel_builtin_id")));
                earbudMusicInfo.setName(jSONObject.optString("name"));
                earbudMusicInfo.setDescription(jSONObject.optString("description"));
                earbudMusicInfo.setOfficialBuiltin(Boolean.valueOf(jSONObject.optBoolean("official_builtin", false)));
                earbudMusicInfo.setIsFree(Boolean.valueOf(jSONObject.optBoolean("is_free", true)));
                earbudMusicInfo.setPrice(Float.valueOf((float) jSONObject.optDouble(FirebaseAnalytics.Param.PRICE, 0.0d)));
                earbudMusicInfo.setSkuId(jSONObject.optString("sku_id"));
                earbudMusicInfo.setDownloadAble(Boolean.valueOf(jSONObject.optBoolean("downloadable", true)));
                earbudMusicInfo.setThumb(jSONObject.optString("thumb"));
                earbudMusicInfo.setImage(jSONObject.optString("image"));
                earbudMusicInfo.setBanner(jSONObject.optString("banner"));
                earbudMusicInfo.setAudio(jSONObject.optString("audio"));
                earbudMusicInfo.setLeftChannel(jSONObject.optString("left_channel"));
                earbudMusicInfo.setRightChannel(jSONObject.optString("right_channel"));
                earbudMusicInfo.setLocalStatus(0);
                earbudMusicInfo.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
                Unit unit = Unit.INSTANCE;
                arrayList.add(earbudMusicInfo);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public final void getData(@NotNull String startDay, @NotNull String endDay, final boolean withData, @NotNull DownloadEarbudHealthDataCallback callback) {
        SportDay sportDayFromString = SportDay.fromString(startDay);
        SportDay sportDayFromString2 = SportDay.fromString(endDay);
        ArrayList arrayList = new ArrayList();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final ArrayList arrayList2 = new ArrayList();
        String currentUid = AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCurrentUid();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String url = HMServerDef.getUrl(String.format(DATA_URL, Arrays.copyOf(new Object[]{currentUid}, 1)));
        while (sportDayFromString2.after(sportDayFromString)) {
            SportDay sportDayAddDay = withData ? sportDayFromString2.addDay(-3) : sportDayFromString2.addMonth(-1);
            if (sportDayAddDay.before(sportDayFromString)) {
                sportDayAddDay = sportDayFromString;
            }
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("fromDate", sportDayAddDay.getKey());
            systemParams.put("toDate", sportDayFromString2.getKey());
            if (withData) {
                systemParams.put("tag", "detail");
            }
            systemParams.put("deviceType", Integer.valueOf(HMDeviceType.EARBUD.getValue()));
            HMHttpRequestData hMHttpRequestData = new HMHttpRequestData(url, systemParams, Support.RequestSupport.GET);
            arrayList.add(hMHttpRequestData);
            linkedHashMap.put(hMHttpRequestData.getTag(), systemParams);
            sportDayFromString2 = sportDayAddDay.getPreDay();
        }
        HMWebUtil.doRequestList(arrayList, true, true, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi.getData.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi$getData$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;
                public final /* synthetic */ HMHttpResponseData b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z, HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = z;
                    this.b = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    boolean z = this.a;
                    HMHttpResponseData hMHttpResponseData = this.b;
                    return "download earbud data,with data=" + z + ", result=" + (hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                HMLog.e(HmEarbudWebApi.TAG, "request earbud data list error", throwable);
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                String responseString;
                HMLog.info(HmEarbudWebApi.TAG, new a(withData, item));
                if (item == null || (responseString = item.getResponseString()) == null) {
                    return;
                }
                Map<String, Object> map = linkedHashMap;
                List<EarbudDateData> list = arrayList2;
                List listH = HmEarbudWebApi.INSTANCE.h(responseString);
                if (listH == null) {
                    return;
                }
                map.remove(item.getTag());
                list.addAll(listH);
            }
        });
        g.sortWith(arrayList2, new Comparator() { // from class: k74
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HmEarbudWebApi.b((EarbudDateData) obj, (EarbudDateData) obj2);
            }
        });
        callback.downloadHealthDataResult(linkedHashMap.isEmpty(), arrayList2);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final EarbudCloudMusicData getMusicList(int deviceSource, int page, int perPage) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String currentUid = AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCurrentUid();
        String countryCode = AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCountryCode();
        String currentRegion = AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCurrentRegion();
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("page", Integer.valueOf(page));
        systemParams.put(KEY_PER_PAGE, Integer.valueOf(perPage));
        systemParams.put("userid", currentUid);
        systemParams.put("user_country", countryCode);
        systemParams.put("user_region", currentRegion);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        HMWebUtil.doRequest(HMServerDef.getUrl(String.format(MUSIC_URL, Arrays.copyOf(new Object[]{Integer.valueOf(deviceSource)}, 1))), systemParams, Support.RequestSupport.GET, true, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi.getMusicList.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi$getMusicList$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "earbud musicList = " + this.a.getResponseString();
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                HMLog.e(HmEarbudWebApi.TAG, "Get earbud music list error", throwable);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [T, com.xiaomi.hm.health.device.webapi.earbud.EarbudCloudMusicData] */
            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                if (item == null) {
                    return;
                }
                Ref.ObjectRef<EarbudCloudMusicData> objectRef2 = objectRef;
                try {
                    HMLog.info(HmEarbudWebApi.TAG, new a(item));
                    JSONObject jSONObject = new JSONObject(item.getResponseString());
                    ?? earbudCloudMusicData = new EarbudCloudMusicData();
                    earbudCloudMusicData.setPage(jSONObject.optInt("page"));
                    earbudCloudMusicData.setPerPage(jSONObject.optInt(HmEarbudWebApi.KEY_PER_PAGE));
                    earbudCloudMusicData.setTotalPage(jSONObject.optInt(DTransferConstants.TOTAL_PAGE));
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                    earbudCloudMusicData.setData(jSONArrayOptJSONArray == null ? null : HmEarbudWebApi.INSTANCE.i(jSONArrayOptJSONArray));
                    Unit unit = Unit.INSTANCE;
                    objectRef2.element = earbudCloudMusicData;
                } catch (Exception e) {
                    HMLog.e(HmEarbudWebApi.TAG, "parse earbud cloud music data error", e);
                }
            }
        });
        return (EarbudCloudMusicData) objectRef.element;
    }

    @Nullable
    public final List<EarbudMusicInfo> getMusicListById(int deviceSource, @NotNull final List<Integer> ids) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String currentUid = AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCurrentUid();
        String countryCode = AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCountryCode();
        String currentRegion = AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCurrentRegion();
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(KEY_AUDIS_IDS, TextUtils.join(",", ids));
        systemParams.put("userid", currentUid);
        systemParams.put("user_country", countryCode);
        systemParams.put("user_region", currentRegion);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        HMWebUtil.doRequest(HMServerDef.getUrl(String.format(MUSIC_UR_BUILTIN, Arrays.copyOf(new Object[]{Integer.valueOf(deviceSource)}, 1))), systemParams, Support.RequestSupport.GET, true, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi.getMusicListById.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi$getMusicListById$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ List<Integer> a;
                public final /* synthetic */ HMHttpResponseData b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(List<Integer> list, HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = list;
                    this.b = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "earbud musicList by ids " + TextUtils.join(",", this.a) + " = " + this.b.getResponseString();
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                HMLog.e(HmEarbudWebApi.TAG, "Get earbud music list error", throwable);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [T, java.util.List] */
            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                if (item == null) {
                    return;
                }
                Ref.ObjectRef<List<EarbudMusicInfo>> objectRef2 = objectRef;
                HMLog.info(HmEarbudWebApi.TAG, new a(ids, item));
                try {
                    objectRef2.element = HmEarbudWebApi.INSTANCE.i(new JSONArray(item.getResponseString()));
                } catch (Exception e) {
                    HMLog.e(HmEarbudWebApi.TAG, "parse earbud cloud music data error", e);
                }
            }
        });
        return (List) objectRef.element;
    }

    public final boolean updateDateDatas(boolean isSync) {
        List mutableList;
        String currentUid = AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCurrentUid();
        final EarbudDateDataDao earbudDateDataDao = HMDaoManager.getInstance().getEarbudDateDataDao();
        List<EarbudDateData> list = earbudDateDataDao.queryBuilder().where(EarbudDateDataDao.Properties.Sync.eq(0), new WhereCondition[0]).build().forCurrentThread().list();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        long timeInMillis = c().getBoundDeviceSyncTime(HMDeviceType.EARBUD).getTimeInMillis() / ((long) 1000);
        if (list == null) {
            mutableList = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (EarbudDateData earbudDateData : list) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                HmEarbudWebApi hmEarbudWebApi = INSTANCE;
                linkedHashMap2.put("data", hmEarbudWebApi.f(earbudDateData.getData()));
                linkedHashMap2.put("date", earbudDateData.getDate());
                String deviceId = earbudDateData.getDeviceId();
                if (deviceId == null) {
                    deviceId = EcgData.DEFAULT_DIGIT_VALUE;
                }
                linkedHashMap2.put("deviceId", deviceId);
                linkedHashMap2.put("deviceType", earbudDateData.getType());
                linkedHashMap2.put("source", earbudDateData.getSource());
                String summary = earbudDateData.getSummary();
                if (summary == null) {
                    summary = "";
                }
                linkedHashMap2.put("summary", summary);
                linkedHashMap2.put(ST.UUID_DEVICE, hmEarbudWebApi.e().handleUUID());
                linkedHashMap2.put("lastSyncTime", Long.valueOf(timeInMillis));
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String url = HMServerDef.getUrl(String.format(DATA_URL, Arrays.copyOf(new Object[]{currentUid, String.valueOf(HMDeviceType.EARBUD.getValue())}, 2)));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new Gson().toJson(linkedHashMap2));
                linkedHashSet.add("application/json");
                HMHttpRequestData hMHttpRequestData = new HMHttpRequestData(url, linkedHashSet, Support.RequestSupport.POST);
                linkedHashMap.put(hMHttpRequestData.getTag(), earbudDateData);
                arrayList.add(hMHttpRequestData);
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        }
        if (mutableList == null) {
            mutableList = new ArrayList();
        }
        HMWebUtil.doRequestList(mutableList, true, isSync, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi.updateDateDatas.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi$updateDateDatas$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ JSONObject a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(JSONObject jSONObject) {
                    super(0);
                    this.a = jSONObject;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "sync result:" + this.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi$updateDateDatas$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ EarbudDateData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(EarbudDateData earbudDateData) {
                    super(0);
                    this.a = earbudDateData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "上传成功，修改同步状态 date == :" + this.a.getDate();
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                HMLog.e(HmEarbudWebApi.TAG, "上传earbud活动数据失败", throwable);
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                EarbudDateData earbudDateDataRemove;
                if (item == null) {
                    return;
                }
                Map<String, EarbudDateData> map = linkedHashMap;
                EarbudDateDataDao earbudDateDataDao2 = earbudDateDataDao;
                try {
                    JSONObject jSONObject = new JSONObject(new String(item.getResponseBody(), Charsets.UTF_8));
                    HMLog.info(HmEarbudWebApi.TAG, new a(jSONObject));
                    if (jSONObject.has("date") && jSONObject.has("data") && (earbudDateDataRemove = map.remove(item.getTag())) != null) {
                        HMLog.info(HmEarbudWebApi.TAG, new b(earbudDateDataRemove));
                        earbudDateDataRemove.setSync(1);
                        earbudDateDataDao2.update(earbudDateDataRemove);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return linkedHashMap.isEmpty();
    }
}

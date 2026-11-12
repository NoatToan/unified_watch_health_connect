package com.xiaomi.hm.health.device.watchskinstore.api;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.ResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.exception.GettingTokenErrorException;
import com.huami.network.hmnetwork.exception.GettingTokenInUIThreadException;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.device.watchskinstore.bean.PayOrder;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchResult;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinCategory;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinPage;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0007J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0007J'\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0002J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\u0006\u0010 \u001a\u00020\u001fR\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\"R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\"R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\"R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\"R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\"R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\"R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010\"R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\"R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010\"¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/api/WatchSkinApi;", "", "", "device", "", "page", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchResult;", "", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinCategory;", "loadAllWatchSkin", "categoryId", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinPage;", "loadWatchSkinByCategory", "watchSkinId", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean;", "loadWatchSkinDetail", "", "collect", "updateCollectStatus", "perPage", "loadCollectWatchSkin", "reportDownload", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Ljava/lang/reflect/Type;", "type", "c", "(Lcom/huami/network/base/model/HMHttpResponseData;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "", "a", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder;", "payOrder", "generatePayOrder", "Ljava/lang/String;", "TAG", "b", "KEY_PER_PAGE", "KEY_PAGE", GoogleApiAvailabilityLight.a, "KEY_IDS", "e", "KEY_DEVICE", "f", LogUtil.I, "DEFAULT_PER_PAGE", "g", "API_WATCH_CATEGORIES", "h", "API_WATCH_CATEGORIES_DETAIL", "i", "API_WATCH_SKIN_DETAIL", z.j, "API_WATCH_SKIN_COLLECT", hl.k, "API_WATCH_SKIN_CANCEL_COLLECT", "l", "API_WATCH_SKIN_COLLECT_LIST", "m", "URL_REPORT_DOWNLOAD", GoogleApiAvailabilityLight.b, "API_PAY_ORDER", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinApi {

    @NotNull
    public static final WatchSkinApi INSTANCE = new WatchSkinApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WatchSkinApi";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_PER_PAGE = "per_page";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_PAGE = "page";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_IDS = "ids";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_DEVICE = "device";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int DEFAULT_PER_PAGE = 30;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String API_WATCH_CATEGORIES = "market/devices/{device}/watch/category-apps";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String API_WATCH_CATEGORIES_DETAIL = "market/devices/{device}/watch/category-apps/{category_id}";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String API_WATCH_SKIN_DETAIL = "market/devices/{device}/watch/apps/{id}";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String API_WATCH_SKIN_COLLECT = "market/devices/{device}/watch/favorites?userid={userid}";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final String API_WATCH_SKIN_CANCEL_COLLECT = "market/devices/{device}/watch/favorites/delete?userid={userid}";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final String API_WATCH_SKIN_COLLECT_LIST = "market/devices/{device}/watch/favorites";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final String URL_REPORT_DOWNLOAD = "market/watch/download-report?userid={userid}";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private static final String API_PAY_ORDER = "users/{userId}/orders";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "generatePayOrder:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ GettingTokenInUIThreadException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GettingTokenInUIThreadException gettingTokenInUIThreadException) {
            super(0);
            this.a = gettingTokenInUIThreadException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "generatePayOrder:result:GettingTokenInUIThreadException!!!" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ GettingTokenErrorException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GettingTokenErrorException gettingTokenErrorException) {
            super(0);
            this.a = gettingTokenErrorException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "generatePayOrder:result:GettingTokenErrorException!!!" + this.a;
        }
    }

    private WatchSkinApi() {
    }

    private final Map<String, Object> a(int page, int perPage) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        if (page != -1) {
            systemParams.put(KEY_PER_PAGE, Integer.valueOf(perPage));
            systemParams.put("page", Integer.valueOf(page));
        }
        systemParams.put("user_region", HMLoginManager.getRegion());
        systemParams.put("user_country", DeviceXFunctionsKt.getAppStateApi().getAreaBySave());
        return systemParams;
    }

    public static /* synthetic */ Map b(WatchSkinApi watchSkinApi, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = 30;
        }
        return watchSkinApi.a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T c(HMHttpResponseData response, Type type) throws Exception {
        if (!response.isSuccess()) {
            throw response.getError();
        }
        try {
            return (T) new Gson().fromJson(new String(response.getResponseBody(), StandardCharsets.UTF_8), type);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @JvmStatic
    @NotNull
    public static final WatchResult<List<WatchSkinCategory>> loadAllWatchSkin(@NotNull String device, int page) {
        final WatchResult<List<WatchSkinCategory>> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        HMWebUtil.doRequest(HMServerDef.getUrl(m.replace$default(API_WATCH_CATEGORIES, "{device}", device, false, 4, (Object) null)), b(INSTANCE, page, 0, 2, null), Support.RequestSupport.GET, true, new ResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi.loadAllWatchSkin.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadAllWatchSkin$1$a */
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
                    return "loadAllWatchSkin:result:ERROR!!!" + this.a.getError();
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadAllWatchSkin$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "loadAllWatchSkin:result:" + (hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadAllWatchSkin$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    Throwable th = this.a;
                    return "loadAllWatchSkin:result:ERROR!!" + (th == null ? null : th.getMessage());
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                watchResult.setMError(item.getError());
                HMLog.info(WatchSkinApi.TAG, new a(item));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinApi.TAG, new b(item));
                try {
                    List<WatchSkinCategory> list = (List) WatchSkinApi.INSTANCE.c(item, new TypeToken<List<? extends WatchSkinCategory>>() { // from class: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadAllWatchSkin$1$onSuccess$data$1
                    }.getType());
                    watchResult.setMoreEnd(list == null || list.size() < 30);
                    watchResult.setData(list);
                    watchResult.setSuccessful(item.getSuccess());
                } catch (Throwable th) {
                    th.printStackTrace();
                    watchResult.setMError(th);
                    HMLog.info(WatchSkinApi.TAG, new c(th));
                }
            }
        });
        return watchResult;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final WatchResult<WatchSkinPage> loadCollectWatchSkin(@NotNull String str, int i) {
        return loadCollectWatchSkin$default(str, i, 0, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final WatchResult<WatchSkinPage> loadCollectWatchSkin(@NotNull String device, int page, int perPage) {
        final WatchResult<WatchSkinPage> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        HMWebUtil.doRequest(HMServerDef.getUrl(m.replace$default(API_WATCH_SKIN_COLLECT_LIST, "{device}", device, false, 4, (Object) null)), INSTANCE.a(page, perPage), Support.RequestSupport.GET, true, new ResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi.loadCollectWatchSkin.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadCollectWatchSkin$1$a */
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
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "loadCollectWatchSkin:result:ERROR!!!" + (hMHttpResponseData == null ? null : hMHttpResponseData.getError());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadCollectWatchSkin$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "loadCollectWatchSkin:result:" + (hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadCollectWatchSkin$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    Throwable th = this.a;
                    return "loadCollectWatchSkin:result:ERROR!!" + (th == null ? null : th.getMessage());
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                watchResult.setMError(item.getError());
                HMLog.info(WatchSkinApi.TAG, new a(item));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinApi.TAG, new b(item));
                try {
                    WatchSkinPage watchSkinPage = (WatchSkinPage) WatchSkinApi.INSTANCE.c(item, WatchSkinPage.class);
                    watchResult.setMoreEnd(watchSkinPage == null || watchSkinPage.getPage() >= watchSkinPage.getTotalPage());
                    watchResult.setData(watchSkinPage);
                    watchResult.setSuccessful(item.getSuccess());
                } catch (Throwable th) {
                    th.printStackTrace();
                    watchResult.setMError(th);
                    HMLog.info(WatchSkinApi.TAG, new c(th));
                }
            }
        });
        return watchResult;
    }

    public static /* synthetic */ WatchResult loadCollectWatchSkin$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 30;
        }
        return loadCollectWatchSkin(str, i, i2);
    }

    @JvmStatic
    @NotNull
    public static final WatchResult<WatchSkinPage> loadWatchSkinByCategory(@NotNull String device, @NotNull String categoryId, int page) {
        final WatchResult<WatchSkinPage> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        HMWebUtil.doRequest(HMServerDef.getUrl(m.replace$default(m.replace$default(API_WATCH_CATEGORIES_DETAIL, "{device}", device, false, 4, (Object) null), "{category_id}", categoryId, false, 4, (Object) null)), b(INSTANCE, page, 0, 2, null), Support.RequestSupport.GET, true, new ResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi.loadWatchSkinByCategory.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadWatchSkinByCategory$1$a */
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
                    return "loadWatchSkinByCategories:result:ERROR!!!" + this.a.getError();
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadWatchSkinByCategory$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "loadWatchSkinByCategories:result:" + (hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadWatchSkinByCategory$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    Throwable th = this.a;
                    return "loadWatchSkinByCategories:result:ERROR!!" + (th == null ? null : th.getMessage());
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                watchResult.setMError(item.getError());
                HMLog.info(WatchSkinApi.TAG, new a(item));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinApi.TAG, new b(item));
                try {
                    WatchSkinPage watchSkinPage = (WatchSkinPage) WatchSkinApi.INSTANCE.c(item, WatchSkinPage.class);
                    watchResult.setMoreEnd(watchSkinPage == null || watchSkinPage.getPage() >= watchSkinPage.getTotalPage());
                    watchResult.setData(watchSkinPage);
                    watchResult.setSuccessful(item.getSuccess());
                } catch (Throwable th) {
                    th.printStackTrace();
                    watchResult.setMError(th);
                    HMLog.info(WatchSkinApi.TAG, new c(th));
                }
            }
        });
        return watchResult;
    }

    @JvmStatic
    @NotNull
    public static final WatchResult<WatchSkinBean> loadWatchSkinDetail(@NotNull String device, @NotNull String watchSkinId) {
        final WatchResult<WatchSkinBean> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        HMWebUtil.doRequest(HMServerDef.getUrl(m.replace$default(m.replace$default(API_WATCH_SKIN_DETAIL, "{device}", device, false, 4, (Object) null), "{id}", watchSkinId, false, 4, (Object) null)), b(INSTANCE, 0, 0, 3, null), Support.RequestSupport.GET, true, new ResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi.loadWatchSkinDetail.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadWatchSkinDetail$1$a */
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
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "loadWatchSkinDetail:result:ERROR!!!" + (hMHttpResponseData == null ? null : hMHttpResponseData.getError());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadWatchSkinDetail$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "loadWatchSkinDetail:result:" + (hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$loadWatchSkinDetail$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    Throwable th = this.a;
                    return "loadWatchSkinDetail:result:ERROR!!" + (th == null ? null : th.getMessage());
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                watchResult.setMError(item.getError());
                HMLog.info(WatchSkinApi.TAG, new a(item));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinApi.TAG, new b(item));
                try {
                    WatchSkinBean watchSkinBean = (WatchSkinBean) WatchSkinApi.INSTANCE.c(item, WatchSkinBean.class);
                    watchResult.setSuccessful(item.isSuccess());
                    watchResult.setData(watchSkinBean);
                } catch (Throwable th) {
                    th.printStackTrace();
                    watchResult.setMError(th);
                    HMLog.info(WatchSkinApi.TAG, new c(th));
                }
            }
        });
        return watchResult;
    }

    @JvmStatic
    @NotNull
    public static final WatchResult<Boolean> reportDownload(@NotNull String device, @NotNull String watchSkinId) {
        final WatchResult<Boolean> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("device", device);
        systemParams.put("ids", watchSkinId);
        HMWebUtil.doRequest(HMServerDef.getUrl(m.replace$default(URL_REPORT_DOWNLOAD, "{userid}", HMWebUtil.getUserId(), false, 4, (Object) null)), systemParams, Support.RequestSupport.POST, false, new ResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi.reportDownload.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$reportDownload$1$a */
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
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "reportDownload:result:ERROR!!!" + (hMHttpResponseData == null ? null : hMHttpResponseData.getError());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$reportDownload$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "reportDownload:result: " + this.a;
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinApi.TAG, new a(item));
                watchResult.setMError(item.getError());
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinApi.TAG, new b(item));
                watchResult.setSuccessful(item.isSuccess());
                watchResult.setData(Boolean.valueOf(item.isSuccess()));
            }
        });
        return watchResult;
    }

    @JvmStatic
    @NotNull
    public static final WatchResult<Boolean> updateCollectStatus(@NotNull String device, @NotNull String watchSkinId, boolean collect) {
        final WatchResult<Boolean> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        String url = HMServerDef.getUrl(m.replace$default(m.replace$default(collect ? API_WATCH_SKIN_COLLECT : API_WATCH_SKIN_CANCEL_COLLECT, "{device}", device, false, 4, (Object) null), "{userid}", HMWebUtil.getUserId(), false, 4, (Object) null));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("ids", watchSkinId);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, true, new ResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi.updateCollectStatus.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$updateCollectStatus$1$a */
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
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "updateCollectStatus:result:ERROR!!!" + (hMHttpResponseData == null ? null : hMHttpResponseData.getError());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$updateCollectStatus$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "updateCollectStatus:result:" + (hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinApi.TAG, new a(item));
                watchResult.setMError(item.getError());
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinApi.TAG, new b(item));
                watchResult.setSuccessful(item.isSuccess());
                watchResult.setData(Boolean.valueOf(item.isSuccess()));
            }
        });
        return watchResult;
    }

    @NotNull
    public final WatchResult<PayOrder> generatePayOrder(@NotNull PayOrder payOrder) {
        final WatchResult<PayOrder> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        String strReplace$default = m.replace$default(HMServerDef.getUrl("users/{userId}/orders"), "{userId}", HMWebUtil.getUserId(), false, 4, (Object) null);
        try {
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            String json = new Gson().toJson(payOrder);
            HMLog.debug(TAG, new a(json));
            HashSet hashSet = new HashSet();
            hashSet.add("application/json");
            hashSet.add(json);
            HMWebUtil.doSeparateRequest(strReplace$default, systemHeader, (Set<Object>) hashSet, Support.RequestSupport.POST, true, true, (IHMBasicHttpResponseHandler) new ResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi.generatePayOrder.2

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$generatePayOrder$2$a */
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
                        HMHttpResponseData hMHttpResponseData = this.a;
                        return "generatePayOrder:result:ERROR!!!" + (hMHttpResponseData == null ? null : hMHttpResponseData.getError());
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$generatePayOrder$2$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ HMHttpResponseData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(HMHttpResponseData hMHttpResponseData) {
                        super(0);
                        this.a = hMHttpResponseData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "generatePayOrder:result: " + this.a;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi$generatePayOrder$2$c */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function0<String> {
                    public final /* synthetic */ Throwable a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(Throwable th) {
                        super(0);
                        this.a = th;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "generatePayOrder:result:ERROR!!" + this.a;
                    }
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onFailure(@NotNull HMHttpResponseData item) {
                    HMLog.info(WatchSkinApi.TAG, new a(item));
                    watchResult.setMError(item.getError());
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onSuccess(@NotNull HMHttpResponseData item) {
                    HMLog.info(WatchSkinApi.TAG, new b(item));
                    try {
                        PayOrder payOrder2 = (PayOrder) WatchSkinApi.INSTANCE.c(item, PayOrder.class);
                        watchResult.setSuccessful(item.isSuccess());
                        watchResult.setData(payOrder2);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        HMLog.info(WatchSkinApi.TAG, new c(th));
                        watchResult.setMError(th);
                    }
                }
            }, new HMHttpConfig[0]);
        } catch (GettingTokenErrorException e) {
            e.printStackTrace();
            HMLog.info(TAG, new c(e));
            watchResult.setMError(e);
        } catch (GettingTokenInUIThreadException e2) {
            e2.printStackTrace();
            HMLog.info(TAG, new b(e2));
            watchResult.setMError(e2);
        }
        return watchResult;
    }
}

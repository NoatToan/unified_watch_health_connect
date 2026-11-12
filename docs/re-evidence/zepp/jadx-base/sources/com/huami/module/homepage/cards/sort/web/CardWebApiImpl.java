package com.huami.module.homepage.cards.sort.web;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.module.homepage.cards.sort.sp.CustomSortDeviceSourceManager;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.passport.Configs;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u000f\u0012\u0006\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u0004H\u0002J\f\u0010\u000f\u001a\u00020\f*\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002J\u0012\u0010\u0012\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016J\u0016\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006&"}, d2 = {"Lcom/huami/module/homepage/cards/sort/web/CardWebApiImpl;", "Lcom/huami/module/homepage/cards/sort/web/CardWebApi;", "Lcom/huami/http/HttpKit;", "", "Lcom/huami/module/homepage/cards/sort/web/CardShowEntry;", "c", "", "addDefault", "a", "", "body", GoogleApiAvailabilityLight.a, "Lorg/json/JSONObject;", "h", "Lcom/huami/module/homepage/cards/sort/web/CardExpandEntry;", "g", "", "e", "f", "loadCardSort", WebConst.QueryParam.SORT_LIST, "uploadCardSort", "loadCardExpand", "expandList", "uploadCardExpand", "Lcom/huami/module/homepage/cards/sort/sp/CustomSortDeviceSourceManager;", "Lcom/huami/module/homepage/cards/sort/sp/CustomSortDeviceSourceManager;", "deviceSourceManager", "b", "Ljava/lang/String;", "url", "sortPropertiesName", "expandPropertiesName", "cardSettingName", "userId", "<init>", "(Ljava/lang/String;)V", "Companion", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class CardWebApiImpl implements CardWebApi, HttpKit {

    @NotNull
    public static final String HOME_CARD_DEFAULT_KEY = "default";

    @NotNull
    public static final String HOME_CARD_DEVICE_SOURCE_KEY = "deviceSource";

    @NotNull
    public static final String HOME_CARD_EXPAND_MIFIT = "huami.zepplife.user.home.card.expand";

    @NotNull
    public static final String HOME_CARD_EXPAND_ZEPP = "huami.mifit.user.home.card.expand";

    @NotNull
    public static final String HOME_CARD_SETTING = "huami.mifit.user.home.card";

    @NotNull
    public static final String HOME_CARD_SETTING_MIFIT = "huami.zepplife.user.home.card";

    @NotNull
    public static final String HOME_CARD_SORT_KEY = "sort";

    @NotNull
    public static final String HOME_CARD_SORT_MIFIT = "huami.zepplife.user.home.card.sort";

    @NotNull
    public static final String HOME_CARD_SORT_ZEPP = "huami.mifit.user.home.card.sort";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CustomSortDeviceSourceManager deviceSourceManager = new CustomSortDeviceSourceManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String sortPropertiesName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String expandPropertiesName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String cardSettingName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;
        public final /* synthetic */ Map<String, String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Response response, Map<String, String> map) {
            super(0);
            this.a = response;
            this.b = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setting sort response:" + this.a + ", parse res:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "appSetting:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取客户端配置失败：" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;
        public final /* synthetic */ Map<String, String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Response response, Map<String, String> map) {
            super(0);
            this.a = response;
            this.b = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "custom sort response:" + this.a + ", parse res:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "custom sort:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取自定义排序失败：" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取卡片折叠状态失败：" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上传失败：" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "body--->" + this.a;
        }
    }

    public CardWebApiImpl(@NotNull String str) {
        this.url = "users/" + str + "/properties";
        this.sortPropertiesName = HomeUtils.isMifitApp() ? HOME_CARD_SORT_MIFIT : HOME_CARD_SORT_ZEPP;
        this.expandPropertiesName = HomeUtils.isMifitApp() ? HOME_CARD_EXPAND_MIFIT : HOME_CARD_EXPAND_ZEPP;
        this.cardSettingName = HomeUtils.isMifitApp() ? HOME_CARD_SETTING_MIFIT : HOME_CARD_SETTING;
    }

    private final List<CardShowEntry> a(boolean addDefault) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("settingName", this.cardSettingName);
        linkedHashMap.put("mode", "SINGLE");
        try {
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "apps/" + HMAppConfig.getPackageName() + "/settings", linkedHashMap, null, 4, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            Map map = (Map) converter.convert(responseBodyBody, new TypeToken<Map<String, ? extends String>>() { // from class: com.huami.module.homepage.cards.sort.web.CardWebApiImpl$getAppSettingData$$inlined$deserializeOrThrow$1
            }.getType());
            HMLog.info("HomeCard", new a(responseHttpGet$default, map));
            String str = (String) map.get(this.cardSettingName);
            if (str == null) {
                arrayList = null;
            } else {
                HMLog.info("HomeCard", new b(str));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONObject jSONObject = new JSONObject(str);
                if (addDefault) {
                    linkedHashSet.addAll((Collection) new Gson().fromJson(jSONObject.optString("default"), new TypeToken<List<? extends String>>() { // from class: com.huami.module.homepage.cards.sort.web.CardWebApiImpl$getAppSettingData$lambda-7$$inlined$parseJson$1
                    }.getType()));
                    Iterator<T> it2 = this.deviceSourceManager.getPresentBoundAndActivateDeviceSource().iterator();
                    while (it2.hasNext()) {
                        String strOptString = jSONObject.optString((String) it2.next());
                        if (strOptString.length() > 0) {
                            linkedHashSet.addAll((Collection) new Gson().fromJson(strOptString, new TypeToken<List<? extends String>>() { // from class: com.huami.module.homepage.cards.sort.web.CardWebApiImpl$getAppSettingData$lambda-7$lambda-4$$inlined$parseJson$1
                            }.getType()));
                        }
                    }
                } else {
                    Iterator<T> it3 = this.deviceSourceManager.getHasNoCustomSortDeviceSourceValue().iterator();
                    while (it3.hasNext()) {
                        String strOptString2 = jSONObject.optString((String) it3.next());
                        if (strOptString2.length() > 0) {
                            linkedHashSet.addAll((Collection) new Gson().fromJson(strOptString2, new TypeToken<List<? extends String>>() { // from class: com.huami.module.homepage.cards.sort.web.CardWebApiImpl$getAppSettingData$lambda-7$lambda-5$$inlined$parseJson$1
                            }.getType()));
                        }
                    }
                }
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    arrayList.add(new CardShowEntry((String) it4.next(), true));
                }
            }
            return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
        } catch (Exception e2) {
            HMLog.error$default("HomeCard", null, null, new c(e2), 6, null);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public static /* synthetic */ List b(CardWebApiImpl cardWebApiImpl, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return cardWebApiImpl.a(z);
    }

    private final List<CardShowEntry> c() {
        List<CardShowEntry> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("propertyName", this.sortPropertiesName);
        linkedHashMap.put("mode", "SINGLE");
        try {
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, this.url, linkedHashMap, null, 4, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            Map map = (Map) converter.convert(responseBodyBody, new TypeToken<Map<String, ? extends String>>() { // from class: com.huami.module.homepage.cards.sort.web.CardWebApiImpl$getCustomSortData$$inlined$deserializeOrThrow$1
            }.getType());
            HMLog.info("HomeCard", new d(responseHttpGet$default, map));
            String str = (String) map.get(this.sortPropertiesName);
            if (str == null) {
                list = null;
            } else {
                HMLog.info("HomeCard", new e(str));
                JSONObject jSONObject = new JSONObject(str);
                this.deviceSourceManager.addDeviceSource((List) new Gson().fromJson(jSONObject.optString("deviceSource"), new TypeToken<List<? extends String>>() { // from class: com.huami.module.homepage.cards.sort.web.CardWebApiImpl$getCustomSortData$lambda-3$$inlined$parseJson$1
                }.getType()));
                list = (List) new Gson().fromJson(jSONObject.optString("sort"), new TypeToken<List<? extends CardShowEntry>>() { // from class: com.huami.module.homepage.cards.sort.web.CardWebApiImpl$getCustomSortData$lambda-3$$inlined$parseJson$2
                }.getType());
            }
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        } catch (Exception e2) {
            HMLog.error$default("HomeCard", null, null, new f(e2), 6, null);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    private final boolean d(String body) {
        try {
            return HttpKitKtxKt.httpPost$default(this, this.url, RequestBody.create(MediaType.parse("application/json"), body), null, null, 12, null).isSuccessful();
        } catch (Exception e2) {
            HMLog.error$default("HomeCard", null, null, new h(e2), 6, null);
            return false;
        }
    }

    private final String e(Collection<CardExpandEntry> collection) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.expandPropertiesName;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(g((CardExpandEntry) it2.next()));
        }
        jSONObject2.put(str, new JSONArray((Collection) arrayList));
        Unit unit = Unit.INSTANCE;
        jSONObject.put(Configs.Params.PROPERTIES, jSONObject2);
        return jSONObject.toString();
    }

    private final String f(Collection<CardShowEntry> collection) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(h((CardShowEntry) it2.next()));
        }
        jSONObject3.put("sort", new JSONArray((Collection) arrayList));
        jSONObject3.put("deviceSource", new JSONArray((Collection) this.deviceSourceManager.getAllHasCustomSortDeviceSource()));
        jSONObject2.put(this.sortPropertiesName, jSONObject3.toString());
        Unit unit = Unit.INSTANCE;
        jSONObject.put(Configs.Params.PROPERTIES, jSONObject2);
        return jSONObject.toString();
    }

    private final JSONObject g(CardExpandEntry cardExpandEntry) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", cardExpandEntry.getType());
        jSONObject.put("expand", cardExpandEntry.getExpand());
        return jSONObject;
    }

    private final JSONObject h(CardShowEntry cardShowEntry) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", cardShowEntry.getType());
        jSONObject.put("show", cardShowEntry.getShow());
        return jSONObject;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.module.homepage.cards.sort.web.CardWebApi
    @NotNull
    public List<CardExpandEntry> loadCardExpand() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("propertyName", this.expandPropertiesName);
        linkedHashMap.put("mode", "SINGLE");
        try {
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, this.url, linkedHashMap, null, 4, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            String str = (String) ((Map) converter.convert(responseBodyBody, new TypeToken<Map<String, ? extends String>>() { // from class: com.huami.module.homepage.cards.sort.web.CardWebApiImpl$loadCardExpand$$inlined$deserializeOrThrow$1
            }.getType())).get(this.expandPropertiesName);
            List<CardExpandEntry> list = str == null ? null : (List) new Gson().fromJson(str, new TypeToken<List<? extends CardExpandEntry>>() { // from class: com.huami.module.homepage.cards.sort.web.CardWebApiImpl$loadCardExpand$$inlined$parseJson$1
            }.getType());
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        } catch (Exception e2) {
            HMLog.error$default("HomeCard", null, null, new g(e2), 6, null);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @Override // com.huami.module.homepage.cards.sort.web.CardWebApi
    @NotNull
    public List<CardShowEntry> loadCardSort() {
        List<CardShowEntry> listC = c();
        if (listC.isEmpty()) {
            return a(true);
        }
        List<CardShowEntry> listA = a(false);
        if (listA.isEmpty()) {
            return listC;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listC) {
            if (((CardShowEntry) obj).getShow()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll((Collection) pair.getFirst());
        linkedHashSet.addAll(listA);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((CardShowEntry) it2.next()).getType());
        }
        for (CardShowEntry cardShowEntry : (Iterable) pair.getSecond()) {
            if (!arrayList3.contains(cardShowEntry.getType())) {
                linkedHashSet.add(cardShowEntry);
            }
        }
        return CollectionsKt___CollectionsKt.toList(linkedHashSet);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.module.homepage.cards.sort.web.CardWebApi
    public boolean uploadCardExpand(@NotNull List<CardExpandEntry> expandList) {
        return d(e(expandList));
    }

    @Override // com.huami.module.homepage.cards.sort.web.CardWebApi
    public boolean uploadCardSort(@NotNull List<CardShowEntry> sortList) throws JSONException {
        String strF = f(sortList);
        HMLog.error$default("HomeCard", null, null, new i(strF), 6, null);
        return d(strF);
    }
}

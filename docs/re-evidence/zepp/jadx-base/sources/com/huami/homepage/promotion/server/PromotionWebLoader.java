package com.huami.homepage.promotion.server;

import com.huami.account.service.AreaService;
import com.huami.account.service.AreaServiceExtKt;
import com.huami.homepage.promotion.beans.Extension;
import com.huami.homepage.promotion.beans.NavigateInfo;
import com.huami.homepage.promotion.beans.PromotionVo;
import com.huami.homepage.promotion.net.WebUtils;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0004R\u001f\u0010\u000e\u001a\u0004\u0018\u00010\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/homepage/promotion/server/PromotionWebLoader;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/homepage/promotion/server/PromotionType;", "promotionType", "", "request", "", "Lcom/huami/homepage/promotion/beans/PromotionVo;", "toPromotionVoList", "Lcom/huami/homepage/promotion/server/WeatherDataSupport;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/homepage/promotion/server/WeatherDataSupport;", "weatherDataSupport", "Lcom/huami/account/service/AreaService;", "()Lcom/huami/account/service/AreaService;", "areaService", "<init>", "()V", "promotion_release"}, k = 1, mv = {1, 5, 1})
public final class PromotionWebLoader implements KoinComponent {

    @NotNull
    public static final PromotionWebLoader INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy weatherDataSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy areaService;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final PromotionWebLoader promotionWebLoader = new PromotionWebLoader();
        INSTANCE = promotionWebLoader;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        weatherDataSupport = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<WeatherDataSupport>() { // from class: com.huami.homepage.promotion.server.PromotionWebLoader$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.homepage.promotion.server.WeatherDataSupport, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WeatherDataSupport invoke() {
                KoinComponent koinComponent = promotionWebLoader;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WeatherDataSupport.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        areaService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<AreaService>() { // from class: com.huami.homepage.promotion.server.PromotionWebLoader$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.service.AreaService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AreaService invoke() {
                KoinComponent koinComponent = promotionWebLoader;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AreaService.class), objArr2, objArr3);
            }
        });
    }

    private PromotionWebLoader() {
    }

    private final AreaService a() {
        return (AreaService) areaService.getValue();
    }

    private final WeatherDataSupport b() {
        return (WeatherDataSupport) weatherDataSupport.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final String request(@NotNull PromotionType promotionType) throws IOException {
        String url = HMServerDef.getUrl(("discovery/" + HMAppConfig.getSocial() + "/cards/") + promotionType.getValue());
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("appname", HMAppConfig.getPackageName());
        systemParams.put("appplatform", HMAppConfig.getDeviceType());
        WeatherDataSupport weatherDataSupportB = b();
        systemParams.put("adcode", weatherDataSupportB == null ? null : weatherDataSupportB.getAddressCode());
        AreaService areaServiceA = a();
        systemParams.put("user_region", areaServiceA == null ? null : AreaServiceExtKt.userRegion(areaServiceA));
        AreaService areaServiceA2 = a();
        systemParams.put("user_country", areaServiceA2 != null ? areaServiceA2.userCountryCode() : null);
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(url, systemParams);
        if (hMHttpResponseData.isSuccess()) {
            return new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8);
        }
        if (hMHttpResponseData.getError() != null) {
            throw new IOException("首页推广位数据请求失败", hMHttpResponseData.getError());
        }
        throw new IOException("首页推广位数据请求失败");
    }

    @NotNull
    public final List<PromotionVo> toPromotionVoList(@NotNull String str) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString("id");
                String strOptString2 = jSONObject.optString("title");
                String strOptString3 = jSONObject.optString("sub_title");
                String strOptString4 = jSONObject.optString("image");
                int iOptInt = jSONObject.optInt("mode");
                String strOptString5 = jSONObject.optString("target");
                ArrayList arrayList2 = null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(GPXTrackPoint.XML.TAG_EXTENSIONS);
                if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("device_sources")) != null) {
                    arrayList2 = new ArrayList();
                    int length2 = jSONArrayOptJSONArray.length();
                    if (length2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i3)));
                            if (i4 >= length2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                }
                arrayList.add(new PromotionVo(strOptString, strOptString4, strOptString2, strOptString3, new NavigateInfo(iOptInt, strOptString5), new Extension(arrayList2)));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }
}

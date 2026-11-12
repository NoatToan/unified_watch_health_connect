package com.xiaomi.hm.health.sleep.manger;

import android.content.Context;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.passport.AccountManager;
import com.huami.sleep.sleephome.promotion.NavigateInfo;
import com.huami.sleep.sleephome.promotion.SleepPromotionVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.api.WebUtils;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/sleep/manger/PromotionWebLoader;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/sleep/manger/PromotionType;", "promotionType", "", "request", "", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "toPromotionVoList", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PromotionWebLoader {

    @NotNull
    public static final PromotionWebLoader INSTANCE = new PromotionWebLoader();

    private PromotionWebLoader() {
    }

    @NotNull
    public final String request(@NotNull Context context, @NotNull PromotionType promotionType) throws IOException {
        String url = HMServerDef.getUrl(("discovery/" + HMAppConfig.getSocial() + "/cards/") + promotionType.getValue());
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("appname", HMAppConfig.getPackageName());
        systemParams.put("appplatform", HMAppConfig.getDeviceType());
        systemParams.put("adcode", LocWeatherManager.getInstance().getLocationAddressCode());
        AccountManager accountManager = AccountManager.getDefault(context);
        systemParams.put("user_region", accountManager.getCurrentRegion());
        systemParams.put("user_country", accountManager.getCountryCode());
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
    public final List<SleepPromotionVo> toPromotionVoList(@NotNull String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new SleepPromotionVo(jSONObject.optString("id"), jSONObject.optString("image"), jSONObject.optString("title"), jSONObject.optString("sub_title"), new NavigateInfo(jSONObject.optInt("mode"), jSONObject.optString("target"))));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }
}

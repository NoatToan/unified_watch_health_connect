package com.xiaomi.hm.health.webapi;

import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/webapi/PreLaunchApi;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PreLaunchApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "apps/%s/settings";

    @NotNull
    private static final String b = "settingName";

    @NotNull
    private static final String c = "mode";

    @NotNull
    private static final String d = "adcode";

    @NotNull
    private static final String e = "PreLaunchApi";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/webapi/PreLaunchApi$Companion;", "", "", "wrapper", "key", "", "Lcom/xiaomi/hm/health/webapi/PreLaunchItem;", "a", "preLaunch", "getPreLaunch", "mode", "getAppSetting", "PARAM_AD_CODE", "Ljava/lang/String;", "PARAM_MODE", "PARAM_PRE_LAUNCH_SETTING_NAME", "TAG", "WEB_PRE_LAUNCH", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "解析预上线配置错误:" + this.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, PreLaunchItem> a(String wrapper, String key) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject jSONObject = new JSONObject(new JSONObject(wrapper).getString(key));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, new PreLaunchItem(jSONObject.getJSONObject(next).getString("type"), jSONObject.getJSONObject(next).getString("description"), jSONObject.getJSONObject(next).getString("value")));
                }
                return linkedHashMap;
            } catch (Exception e) {
                HMLog.info(PreLaunchApi.e, new a(e));
                return r.emptyMap();
            }
        }

        public static /* synthetic */ String getAppSetting$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "SINGLE";
            }
            return companion.getAppSetting(str, str2);
        }

        @NotNull
        public final String getAppSetting(@NotNull String key, @NotNull String mode) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String url = HMServerDef.getUrl(String.format("apps/%s/settings", Arrays.copyOf(new Object[]{HMAppConfig.getPackageName()}, 1)));
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("settingName", key);
            systemParams.put("mode", mode);
            systemParams.put("adcode", LocWeatherManager.getInstance().getLocationAddressCode());
            final HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
            HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, true, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.webapi.PreLaunchApi$Companion$getAppSetting$1
                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCancel(int type) {
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCompleted() {
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onError(@NotNull Throwable throwable) {
                }

                @Override // com.huami.network.base.handler.IHMHttpResponseHandler
                public void onItem(@NotNull HMHttpResponseData item) {
                    hMHttpResponseData.copy(item);
                }
            });
            return hMHttpResponseData.getResponseBody() != null ? new String(hMHttpResponseData.getResponseBody(), Charsets.UTF_8) : "";
        }

        @NotNull
        public final Map<String, PreLaunchItem> getPreLaunch(@NotNull String preLaunch) {
            String str = "huami.preLaunch." + preLaunch;
            return a(getAppSetting$default(this, str, null, 2, null), str);
        }
    }
}

package com.huami.device.core.agps.impl.store;

import android.text.TextUtils;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.market.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/device/core/agps/impl/store/SonyAgpsBackupStore;", "Lcom/huami/device/core/agps/impl/store/SonyAGPSFirmwareStore;", "", "url", "", "", "params", "fetchDownloadUrl", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "<init>", "(Lcom/xiaomi/hm/health/bt/profile/feature/Feature;)V", "Companion", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class SonyAgpsBackupStore extends SonyAGPSFirmwareStore {
    private static final String j = "Agps-SonyBackupStore";

    public SonyAgpsBackupStore(@NotNull Feature feature) {
        super(feature);
    }

    @Override // com.huami.device.core.agps.impl.store.SonyAGPSFirmwareStore
    @NotNull
    public String fetchDownloadUrl(@NotNull String url, @NotNull Map<String, Object> params) {
        final StringBuilder sb = new StringBuilder();
        HMWebUtil.doRequest(url, params, Support.RequestSupport.GET, true, new IHMSimpleHttpResponseHandler() { // from class: com.huami.device.core.agps.impl.store.SonyAgpsBackupStore.fetchDownloadUrl.1

            /* JADX INFO: renamed from: com.huami.device.core.agps.impl.store.SonyAgpsBackupStore$fetchDownloadUrl$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(String str) {
                    super(0);
                    this.a = str;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "yesterdayFileUrl --> " + this.a;
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                HMLog.i(SonyAgpsBackupStore.j, "onFailure:" + item, new Object[0]);
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(@NotNull WebResponse response, @NotNull HMHttpResponseData item) {
                HMLog.i(SonyAgpsBackupStore.j, "onSuccess:" + item, new Object[0]);
                try {
                    JSONArray jSONArray = new JSONArray(new String(item.getResponseBody(), Charsets.UTF_8));
                    if (jSONArray.length() == 0) {
                        return;
                    }
                    String string = jSONArray.getJSONObject(0).getString("yesterdayFileUrl");
                    HMLog.info(SonyAgpsBackupStore.j, new a(string));
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    sb.append(string);
                } catch (Exception unused) {
                    HMLog.e(SonyAgpsBackupStore.j, "error of fetch yesterdayFileUrl", new Object[0]);
                }
            }
        });
        HMLog.i(j, "download url:" + ((Object) sb), new Object[0]);
        return sb.toString();
    }
}

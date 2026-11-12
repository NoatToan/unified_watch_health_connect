package com.xiaomi.hm.health.device.webapi.device.api;

import com.huami.account.HMLoginManager;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/device/api/NewDeviceBindApi;", "Lcom/xiaomi/hm/health/device/webapi/device/api/IDeviceBindApi;", "Lcom/xiaomi/hm/health/device/webapi/device/HMWebBindInfo;", "info", "", "sync", "Lcom/huami/network/base/handler/IHMBasicHttpResponseHandler;", "handler", "", "request", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class NewDeviceBindApi implements IDeviceBindApi {

    @NotNull
    private static final String a = "DeviceBindApiV2";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Set<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set<Object> set) {
            super(0);
            this.a = set;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "entity:" + this.a;
        }
    }

    @Override // com.xiaomi.hm.health.device.webapi.device.api.IDeviceBindApi
    public void request(@NotNull HMWebBindInfo info, boolean sync, @NotNull IHMBasicHttpResponseHandler handler) throws JSONException {
        if (info.getBindType() != 0) {
            throw new IllegalArgumentException("Only support bind request, not support " + info.getBindType());
        }
        JSONObject jSONObject = new JSONObject();
        String huamiId = HMLoginManager.getHuamiId();
        HMDeviceWebAPI.setupBindParams(huamiId, jSONObject, info);
        HashSet hashSet = new HashSet();
        hashSet.add("application/json");
        hashSet.add(jSONObject.toString());
        HMLog.info(a, new a(hashSet));
        HMWebUtil.doSeparateRequest(HMServerDef.getRestfulUrl(HMDeviceWebAPI.WEB_API_DEVICE_LIST, huamiId), HMWebUtil.getSystemHeader(), (Set<Object>) hashSet, Support.RequestSupport.POST, true, sync, handler, new HMHttpConfig[0]);
    }
}

package com.huami.device.core.agps.impl.store;

import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.agps.AgpsUpgradeBuilder;
import com.huami.device.core.agps.comm.AGPSGroup;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J$\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\"\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/device/core/agps/impl/store/HuamiOsSonyStore;", "Lcom/huami/device/core/agps/impl/store/SonyAGPSFirmwareStore;", "", "Lcom/huami/device/core/agps/comm/AGPSGroup;", "types", "target", "", GoogleApiAvailabilityLight.a, "", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "getAGPSFirmwares", "", "url", "", "", "params", "fetchDownloadUrl", "fetchBackup", z.j, "Ljava/lang/Iterable;", hl.k, "Z", "isBackupStore", "<init>", "(Ljava/lang/Iterable;Z)V", "Companion", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class HuamiOsSonyStore extends SonyAGPSFirmwareStore {

    @NotNull
    public static final String TAG = "AGPS-HuamiOsSonyStore";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Iterable<AGPSGroup> types;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isBackupStore;

    /* JADX WARN: Multi-variable type inference failed */
    public HuamiOsSonyStore(@NotNull Iterable<? extends AGPSGroup> iterable, boolean z) {
        super(new Feature());
        this.types = iterable;
        this.isBackupStore = z;
    }

    private final boolean d(Iterable<? extends AGPSGroup> types, AGPSGroup target) {
        Iterator<? extends AGPSGroup> it2 = types.iterator();
        if (!it2.hasNext()) {
            return false;
        }
        while (it2.hasNext()) {
            if (it2.next() == target) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String fetchBackup(@NotNull String url, @NotNull Map<String, Object> params) {
        final StringBuilder sb = new StringBuilder();
        HMWebUtil.doRequest(url, params, Support.RequestSupport.GET, true, new IHMSimpleHttpResponseHandler() { // from class: com.huami.device.core.agps.impl.store.HuamiOsSonyStore.fetchBackup.1

            /* JADX INFO: renamed from: com.huami.device.core.agps.impl.store.HuamiOsSonyStore$fetchBackup$1$a */
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
                HMLog.i(HuamiOsSonyStore.TAG, "onFailure:" + item, new Object[0]);
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(@NotNull WebResponse response, @NotNull HMHttpResponseData item) {
                HMLog.i(HuamiOsSonyStore.TAG, "onSuccess:" + item, new Object[0]);
                try {
                    JSONArray jSONArray = new JSONArray(new String(item.getResponseBody(), Charsets.UTF_8));
                    if (jSONArray.length() == 0) {
                        return;
                    }
                    String string = jSONArray.getJSONObject(0).getString("yesterdayFileUrl");
                    HMLog.info(HuamiOsSonyStore.TAG, new a(string));
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    sb.append(string);
                } catch (Exception unused) {
                    HMLog.e(HuamiOsSonyStore.TAG, "error of fetch yesterdayFileUrl", new Object[0]);
                }
            }
        });
        HMLog.i(TAG, "download url:" + ((Object) sb), new Object[0]);
        AgpsUpgradeBuilder.INSTANCE.getOnMessage$agps_impl_release().invoke("download backup file: " + ((Object) sb), 0);
        return sb.toString();
    }

    @Override // com.huami.device.core.agps.impl.store.SonyAGPSFirmwareStore
    @NotNull
    public String fetchDownloadUrl(@NotNull String url, @NotNull Map<String, Object> params) {
        return this.isBackupStore ? fetchBackup(url, params) : super.fetchDownloadUrl(url, params);
    }

    @Override // com.huami.device.core.agps.impl.store.SonyAGPSFirmwareStore, com.huami.device.core.agps.impl.upgrade.AGPSFirmwareStore
    @NotNull
    public List<HMFirmwareInfo> getAGPSFirmwares() throws Exception {
        if (this.types.iterator().hasNext()) {
            return getAGPS(d(this.types, AGPSGroup.GLONASS_ALMANAC), d(this.types, AGPSGroup.GPS_LLE_GPS), true);
        }
        throw new Exception("types is empty");
    }
}

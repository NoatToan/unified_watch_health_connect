package com.xiaomi.hm.health.device.watchskinnew.api;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.passport.AccountManager;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.dial.DialInfoBean;
import com.xiaomi.hm.health.device.watchskinnew.bean.Data;
import com.xiaomi.hm.health.device.watchskinnew.bean.Metas;
import com.xiaomi.hm.health.device.watchskinnew.bean.MetasNew;
import com.xiaomi.hm.health.device.watchskinnew.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinnew.bean.WatchSkinBeanNew;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\u001a-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002\u001a-\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\t\u001a\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002\u001a!\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016\"\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0016\u0010\u001b\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016\"\u0016\u0010\u001d\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016\"\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016\"\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0016\"\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0016\"\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0016\"\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0016\"\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0016\"\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0016\"\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0016\"\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0016\"\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00101\"\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0016\"\u0016\u00106\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u0016¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "page", "", "diy", "", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "getSelectedWatchSkins", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;IZ)[Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "id", "", "reportDownload", "getSelectedWatchSkinsNew", "source", "skinId", "", "getWatchSkinDetailInfo", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBeanNew;", "dialInfoNew", "a", "(Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBeanNew;)[Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "Ljava/lang/String;", "TAG", "b", "URL_WATCH_SKIN_LIST", "c", "URL_REPORT_DOWNLOAD", GoogleApiAvailabilityLight.a, "URL_WATCH_SKIN_DETAIL", "e", "URL_WATCH_SKIN_LIST_NEW", "f", "KEY_DIY", "g", "KEY_DEVICE", "h", "KEY_IDS", "i", "KEY_PAGE", z.j, "KEY_PER_PAGE", hl.k, "KEY_USER_COUNTRY", "l", "KEY_USER_REGION", "m", "KEY_WATCH_SKIN_ID", GoogleApiAvailabilityLight.b, LogUtil.I, "DEFAULT_PER_PAGE", "o", "VALUE_ENABLE", com.google.android.exoplayer2.text.ttml.b.r, "VALUE_DISABLE", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class WatchSkinAPIKt {

    @NotNull
    private static final String a = "WatchSkinAPI";

    @NotNull
    private static final String b = "market/watch/apps/1";

    @NotNull
    private static final String c = "market/watch/download-report";

    @NotNull
    private static final String d = "/market/devices/%d/watch/builtin";

    @NotNull
    private static final String e = "/market/devices/%d/watch";

    @NotNull
    private static final String f = "customizable";

    @NotNull
    private static final String g = "device";

    @NotNull
    private static final String h = "ids";

    @NotNull
    private static final String i = "page";

    @NotNull
    private static final String j = "per_page";

    @NotNull
    private static final String k = "user_country";

    @NotNull
    private static final String l = "user_region";

    @NotNull
    private static final String m = "builtin_ids";
    private static final int n = 36;

    @NotNull
    private static final String o = "enable";

    @NotNull
    private static final String p = "disable";

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
            return "getSelectedWatchSkinsNew: " + this.a;
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
            return "getWatchSkinDetailInfo url: " + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchSkinBean[] a(WatchSkinBeanNew watchSkinBeanNew) {
        if (watchSkinBeanNew == null) {
            return null;
        }
        Data[] data = watchSkinBeanNew.getData();
        boolean z = true;
        if (data != null) {
            if (!(data.length == 0)) {
                z = false;
            }
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Data[] data2 = watchSkinBeanNew.getData();
        if (data2 != null) {
            for (Data data3 : data2) {
                WatchSkinBean watchSkinBean = new WatchSkinBean();
                watchSkinBean.setId(data3.getId());
                watchSkinBean.setName(data3.getName());
                Long size = data3.getSize();
                watchSkinBean.setSize(size == null ? 0 : (int) size.longValue());
                watchSkinBean.setImage(data3.getImage());
                watchSkinBean.setDownloadUrl(data3.getDownloadUrl());
                watchSkinBean.setDownloadTimes(0);
                Metas metas = new Metas();
                MetasNew metas2 = data3.getMetas();
                metas.setMinimumFirmwareVersion(metas2 == null ? null : metas2.getMinimumFirmwareVersion());
                MetasNew metas3 = data3.getMetas();
                metas.setGif(metas3 == null ? null : metas3.getGif());
                MetasNew metas4 = data3.getMetas();
                metas.setTransparentBg(metas4 == null ? null : metas4.getTransparentBg());
                arrayList.add(watchSkinBean);
            }
        }
        Object[] array = arrayList.toArray(new WatchSkinBean[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (WatchSkinBean[]) array;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final WatchSkinBean[] getSelectedWatchSkins(@NotNull HMDeviceSource hMDeviceSource, int i2, boolean z) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(f, z ? "enable" : "disable");
        systemParams.put("device", Integer.valueOf(hMDeviceSource.getValue()));
        systemParams.put("page", Integer.valueOf(i2));
        systemParams.put(j, 36);
        systemParams.put("user_country", DeviceXFunctionsKt.getAppStateApi().getAreaBySave());
        systemParams.put("user_region", AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCurrentRegion());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HMWebUtil.doRequest(HMServerDef.getUrl(b), systemParams, Support.RequestSupport.GET, true, new IHMBasicHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt.getSelectedWatchSkins.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt$getSelectedWatchSkins$1$a */
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
                    return "item: " + this.a.getResponseString();
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinAPIKt.a, new a(item));
                if (item.isSuccess()) {
                    objectRef.element = new Gson().fromJson(item.getResponseString(), WatchSkinBean[].class);
                }
            }
        });
        return (WatchSkinBean[]) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final WatchSkinBean[] getSelectedWatchSkinsNew(@NotNull HMDeviceSource hMDeviceSource, int i2, boolean z) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(e, Arrays.copyOf(new Object[]{Integer.valueOf(hMDeviceSource.getValue())}, 1));
        HMLog.info(a, new a(str));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(f, z ? "enable" : "disable");
        systemParams.put("device", Integer.valueOf(hMDeviceSource.getValue()));
        systemParams.put("page", Integer.valueOf(i2));
        systemParams.put(j, 36);
        systemParams.put("user_country", DeviceXFunctionsKt.getAppStateApi().getAreaBySave());
        systemParams.put("user_region", AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCurrentRegion());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HMWebUtil.doRequest(HMServerDef.getUrl(str), systemParams, Support.RequestSupport.GET, true, new IHMBasicHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt.getSelectedWatchSkinsNew.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt$getSelectedWatchSkinsNew$2$a */
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
                    return "getSelectedWatchSkinsNew item: " + this.a.getResponseString();
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
            }

            /* JADX WARN: Type inference failed for: r3v4, types: [T, com.xiaomi.hm.health.device.watchskinnew.bean.WatchSkinBean[]] */
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinAPIKt.a, new a(item));
                if (item.isSuccess()) {
                    WatchSkinBeanNew watchSkinBeanNew = (WatchSkinBeanNew) new Gson().fromJson(item.getResponseString(), WatchSkinBeanNew.class);
                    objectRef.element = WatchSkinAPIKt.a(watchSkinBeanNew);
                }
            }
        });
        return (WatchSkinBean[]) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final String getWatchSkinDetailInfo(@NotNull HMDeviceSource hMDeviceSource, int i2) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(d, Arrays.copyOf(new Object[]{Integer.valueOf(hMDeviceSource.getValue())}, 1));
        HMLog.info(a, new b(str));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("device", Integer.valueOf(hMDeviceSource.getValue()));
        systemParams.put(m, Integer.valueOf(i2));
        systemParams.put("user_region", AccountManager.getDefault(DeviceXFunctionsKt.getContext()).getCurrentRegion());
        systemParams.put("user_country", DeviceXFunctionsKt.getAppStateApi().getAreaBySave());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HMWebUtil.doRequest(HMServerDef.getUrl(str), systemParams, Support.RequestSupport.GET, true, new IHMBasicHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt.getWatchSkinDetailInfo.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt$getWatchSkinDetailInfo$2$a */
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
                    return "getWatchSkinDetailInfo item: " + this.a.getResponseString();
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
            }

            /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.String] */
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                ?? image;
                HMLog.info(WatchSkinAPIKt.a, new a(item));
                if (item.isSuccess()) {
                    DialInfoBean[] dialInfoBeanArr = (DialInfoBean[]) new Gson().fromJson(item.getResponseString(), DialInfoBean[].class);
                    boolean z = true;
                    if (dialInfoBeanArr != null) {
                        if (!(dialInfoBeanArr.length == 0)) {
                            z = false;
                        }
                    }
                    if (z || (image = dialInfoBeanArr[0].getImage()) == 0) {
                        return;
                    }
                    objectRef.element = image;
                }
            }
        });
        return (String) objectRef.element;
    }

    public static final void reportDownload(int i2, int i3) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("device", Integer.valueOf(i2));
        systemParams.put("ids", String.valueOf(i3));
        HMWebUtil.doRequest(HMServerDef.getUrl("market/watch/download-report?userid=" + HMWebUtil.getUserId()), systemParams, Support.RequestSupport.POST, false, new IHMBasicHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt.reportDownload.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt$reportDownload$1$a */
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
                    return "item: " + this.a.getResponseString();
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinAPIKt.a, new a(item));
                item.isSuccess();
            }
        });
    }
}

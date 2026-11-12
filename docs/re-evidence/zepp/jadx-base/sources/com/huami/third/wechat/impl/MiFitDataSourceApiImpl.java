package com.huami.third.wechat.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huami.account.HMLoginManager;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.third.wechat.ApiResult;
import com.huami.third.wechat.api.DataSourceApi;
import com.huami.third.wechat.entity.AppDeviceInfo;
import com.huami.third.wechat.entity.DeviceListApiEntity;
import com.huami.tools.log.HMLog;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.cybergarage.upnp.DeviceList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0003\u0006\u0019\u0007B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/third/wechat/impl/MiFitDataSourceApiImpl;", "Lcom/huami/third/wechat/api/DataSourceApi;", "Lcom/huami/http/HttpKit;", "", "c", "", "a", "b", "", "checkBindState", "getQRContent", "", "Lcom/huami/third/wechat/entity/AppDeviceInfo;", DeviceList.ELEM_NAME, "Lcom/huami/third/wechat/entity/DeviceListApiEntity;", "checkDeviceSupport", "", "deviceSource", "deviceSN", "getBindTicket", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "deviceID", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Companion", "wechat_release"}, k = 1, mv = {1, 5, 1})
public final class MiFitDataSourceApiImpl implements DataSourceApi, HttpKit {

    @NotNull
    private static final String b = "v1/weixin/user/infos.json";

    @NotNull
    private static final String c = "huami.health.createwxqr.json";

    @NotNull
    private static final String d = "userid";

    @NotNull
    private static final String e = "thirdPartyId";

    @NotNull
    private static final String f = "deviceid";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> deviceID;

    /* JADX INFO: renamed from: com.huami.third.wechat.impl.MiFitDataSourceApiImpl$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"com/huami/third/wechat/impl/MiFitDataSourceApiImpl$a", "", "", "a", "isBind", "Lcom/huami/third/wechat/impl/MiFitDataSourceApiImpl$a;", "b", "", "toString", "", "hashCode", "other", "equals", "Z", GoogleApiAvailabilityLight.a, "()Z", "<init>", "(Z)V", "wechat_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class BindState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("isbind")
        private final boolean isBind;

        public BindState(boolean z) {
            this.isBind = z;
        }

        public static /* synthetic */ BindState c(BindState bindState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bindState.isBind;
            }
            return bindState.b(z);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsBind() {
            return this.isBind;
        }

        @NotNull
        public final BindState b(boolean isBind) {
            return new BindState(isBind);
        }

        public final boolean d() {
            return this.isBind;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindState) && this.isBind == ((BindState) other).isBind;
        }

        public int hashCode() {
            boolean z = this.isBind;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @NotNull
        public String toString() {
            return "BindState(isBind=" + this.isBind + ")";
        }
    }

    /* JADX INFO: renamed from: com.huami.third.wechat.impl.MiFitDataSourceApiImpl$b, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"com/huami/third/wechat/impl/MiFitDataSourceApiImpl$b", "", "", "a", "", "b", "total", "qrContent", "Lcom/huami/third/wechat/impl/MiFitDataSourceApiImpl$b;", "c", "toString", "hashCode", "other", "", "equals", LogUtil.I, "f", "()I", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "wechat_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class WeChatQRResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("total")
        private final int total;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("list")
        @NotNull
        private final String qrContent;

        public WeChatQRResult(int i, @NotNull String str) {
            this.total = i;
            this.qrContent = str;
        }

        public static /* synthetic */ WeChatQRResult d(WeChatQRResult weChatQRResult, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = weChatQRResult.total;
            }
            if ((i2 & 2) != 0) {
                str = weChatQRResult.qrContent;
            }
            return weChatQRResult.c(i, str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getTotal() {
            return this.total;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getQrContent() {
            return this.qrContent;
        }

        @NotNull
        public final WeChatQRResult c(int total, @NotNull String qrContent) {
            return new WeChatQRResult(total, qrContent);
        }

        @NotNull
        public final String e() {
            return this.qrContent;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeChatQRResult)) {
                return false;
            }
            WeChatQRResult weChatQRResult = (WeChatQRResult) other;
            return this.total == weChatQRResult.total && Intrinsics.areEqual(this.qrContent, weChatQRResult.qrContent);
        }

        public final int f() {
            return this.total;
        }

        public int hashCode() {
            return (this.total * 31) + this.qrContent.hashCode();
        }

        @NotNull
        public String toString() {
            return "WeChatQRResult(total=" + this.total + ", qrContent=" + this.qrContent + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResult<BindState> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ApiResult<BindState> apiResult) {
            super(0);
            this.a = apiResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "mifit wechat bind state: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResult<WeChatQRResult> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ApiResult<WeChatQRResult> apiResult) {
            super(0);
            this.a = apiResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "mifit wechat qrResult:" + this.a;
        }
    }

    public MiFitDataSourceApiImpl(@NotNull Function0<String> function0) {
        this.deviceID = function0;
    }

    private final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String huamiId = HMLoginManager.getHuamiId();
        if (huamiId != null) {
            linkedHashMap.put("userid", huamiId);
        }
        return linkedHashMap;
    }

    private final String b() {
        if (HMLoginManager.isHuamiSDKLogin()) {
            return HMLoginManager.getThirdId();
        }
        return null;
    }

    private final String c() {
        if (!HMLoginManager.isHuamiSDKLogin()) {
            return this.deviceID.invoke();
        }
        return "mifit_" + HMLoginManager.getHuamiId() + "_huami_" + HMLoginManager.getThirdId() + "_thirdpartyId";
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.third.wechat.api.DataSourceApi
    public boolean checkBindState() {
        Object objM3845constructorimpl;
        BindState bindState;
        Object objM3845constructorimpl2;
        String url = HMServerDef.getUrl(b);
        Map<String, String> mapA = a();
        String strB = b();
        if (strB != null) {
            mapA.put("thirdPartyId", strB);
        }
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, url, mapA, null, 4, null);
            try {
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (responseHttpGet$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpGet$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl2 = converter.convert(responseBodyBody, new TypeToken<ApiResult<BindState>>() { // from class: com.huami.third.wechat.impl.MiFitDataSourceApiImpl$checkBindState$lambda-1$$inlined$deserialize$1
                    }.getType());
                } else {
                    objM3845constructorimpl2 = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                        objM3845constructorimpl2 = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            objM3845constructorimpl = Result.m3845constructorimpl((ApiResult) objM3845constructorimpl2);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        ApiResult apiResult = (ApiResult) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        HMLog.info("wechat", new c(apiResult));
        return (apiResult == null || (bindState = (BindState) apiResult.getData()) == null || !bindState.d()) ? false : true;
    }

    @Override // com.huami.third.wechat.api.DataSourceApi
    @Nullable
    public List<DeviceListApiEntity> checkDeviceSupport(@NotNull List<AppDeviceInfo> deviceList) {
        return null;
    }

    @Override // com.huami.third.wechat.api.DataSourceApi
    @Nullable
    public String getBindTicket(int deviceSource, @NotNull String deviceSN) {
        return null;
    }

    @Override // com.huami.third.wechat.api.DataSourceApi
    @Nullable
    public String getQRContent() {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        String url = HMServerDef.getUrl(c);
        Map<String, String> mapA = a();
        mapA.put("deviceid", c());
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, url, mapA, null, 4, null);
            try {
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (responseHttpGet$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpGet$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl2 = converter.convert(responseBodyBody, new TypeToken<ApiResult<WeChatQRResult>>() { // from class: com.huami.third.wechat.impl.MiFitDataSourceApiImpl$getQRContent$lambda-3$$inlined$deserialize$1
                    }.getType());
                } else {
                    objM3845constructorimpl2 = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                        objM3845constructorimpl2 = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            objM3845constructorimpl = Result.m3845constructorimpl((ApiResult) objM3845constructorimpl2);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        ApiResult apiResult = (ApiResult) objM3845constructorimpl;
        HMLog.info("wechat", new d(apiResult));
        WeChatQRResult weChatQRResult = apiResult == null ? null : (WeChatQRResult) apiResult.getData();
        if (weChatQRResult == null) {
            return null;
        }
        return weChatQRResult.e();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}

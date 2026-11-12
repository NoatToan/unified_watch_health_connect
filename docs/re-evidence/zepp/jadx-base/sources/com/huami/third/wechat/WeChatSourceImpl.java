package com.huami.third.wechat;

import android.graphics.Bitmap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.OkHttpKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.third.wechat.entity.AppDeviceInfo;
import com.huami.third.wechat.entity.DeviceListApiEntity;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.cybergarage.upnp.DeviceList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\"\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J*\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¨\u0006\u001d"}, d2 = {"Lcom/huami/third/wechat/WeChatSourceImpl;", "Lcom/huami/third/wechat/WeChatSource;", "Lcom/huami/http/HttpKit;", "", "userId", "name", "brandName", "Lcom/huami/third/wechat/ApiResult;", "Lcom/huami/third/wechat/QRResult;", "getQRCode", "Lcom/huami/third/wechat/UserResult;", "getUser", "getQRContent", "", "size", "Landroid/graphics/Bitmap;", "loadQR", "checkAuth", "", "Lcom/huami/third/wechat/entity/AppDeviceInfo;", DeviceList.ELEM_NAME, "Lcom/huami/third/wechat/entity/DeviceListApiEntity;", "checkDeviceSupport", "deviceSource", "deviceSN", "getBindTicket", "<init>", "()V", "Companion", "wechat_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatSourceImpl implements WeChatSource, HttpKit {

    @NotNull
    public static final String TAG = "WeChartSourceImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkAuth-检测微信是否已授权";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkAuth-微信未授权";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkAuth-微信已授权,nickname = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请求支持微信运动绑定的设备列表失败：" + this.a.message();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请求支持微信运动绑定的设备列表失败,body为null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkSupport:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请求支持微信运动绑定的设备列表失败,代码异常：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请求微信绑定的ticket失败：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请求微信绑定的ticket，代码异常：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getQRCode-获取微信二维码内容链接";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResult<QRResult> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ApiResult<QRResult> apiResult) {
            super(0);
            this.a = apiResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getQRCode- data = null,msg = " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getQRCode-获取微信二维码内容链接失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getUser-获取微信用户信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResult<UserResult> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ApiResult<UserResult> apiResult) {
            super(0);
            this.a = apiResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getUser- data = null,msg = " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getUser-获取微信用户信息失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadQR-获取绑定二维码";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadQR-获取绑定二维码成功，内容:" + this.a;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    @Override // com.huami.third.wechat.WeChatSource
    @Nullable
    public String checkAuth(@NotNull String userId, @NotNull String name) {
        UserResult data;
        String nickname;
        HMLog.info(TAG, a.a);
        ApiResult<UserResult> user = getUser(userId, name);
        String str = null;
        if (user != null && (data = user.getData()) != null) {
            if (data.isBind() == 1) {
                if (data.getNickname().length() == 0) {
                    nickname = "UNKNOWN";
                } else if (data.isBind() == 1) {
                    nickname = data.getNickname();
                } else {
                    HMLog.info(TAG, b.a);
                }
                str = nickname;
            } else if (data.isBind() == 1) {
                nickname = data.getNickname();
                str = nickname;
            } else {
                HMLog.info(TAG, b.a);
            }
            if (str != null) {
                HMLog.info(TAG, new c(str));
            }
        }
        return str;
    }

    @Override // com.huami.third.wechat.WeChatSource
    @Nullable
    public List<DeviceListApiEntity> checkDeviceSupport(@NotNull List<AppDeviceInfo> deviceList) {
        Object next;
        Gson gsonCreate = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, Api.INSTANCE.getURL_CHECK_DEVICE_SUPPORT(), RequestBody.create(MediaType.parse("application/json"), gsonCreate.toJson(deviceList).toString()), null, null, 12, null);
            if (!responseHttpPost$default.isSuccessful()) {
                HMLog.error$default(TAG, null, null, new d(responseHttpPost$default), 6, null);
                return null;
            }
            ResponseBody responseBodyBody = responseHttpPost$default.body();
            if (responseBodyBody == null) {
                HMLog.error$default(TAG, null, null, e.a, 6, null);
                return null;
            }
            Type type = new TypeToken<List<? extends DeviceListApiEntity>>() { // from class: com.huami.third.wechat.WeChatSourceImpl$checkDeviceSupport$1$type$1
            }.getType();
            String strString = responseBodyBody.string();
            HMLog.info(TAG, new f(strString));
            List<DeviceListApiEntity> list = (List) gsonCreate.fromJson(strString, type);
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (DeviceListApiEntity deviceListApiEntity : list) {
                Iterator<T> it2 = deviceList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((AppDeviceInfo) next).getSn(), deviceListApiEntity.getSn()));
                AppDeviceInfo appDeviceInfo = (AppDeviceInfo) next;
                arrayList.add(DeviceListApiEntity.copy$default(deviceListApiEntity, null, 0, 0, null, appDeviceInfo.getDeviceDisplayName(), appDeviceInfo.getBleAddress(), appDeviceInfo.isActive(), 15, null));
            }
            return arrayList;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(Result.m3845constructorimpl(ResultKt.createFailure(th)));
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(TAG, null, null, new g(thM3848exceptionOrNullimpl), 6, null);
            }
            return null;
        }
    }

    @Override // com.huami.third.wechat.WeChatSource
    @Nullable
    public String getBindTicket(int deviceSource, @NotNull String deviceSN) {
        Object objM3845constructorimpl;
        JsonElement jsonElement;
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, Api.INSTANCE.getURL_BIND_DEVICE_TICKET(), OkHttpKtxKt.buildRequestJsonBody((Map<String, ? extends Object>) r.mapOf(TuplesKt.to("deviceSource", Integer.valueOf(deviceSource)), TuplesKt.to("sn", deviceSN))), null, null, 12, null);
            if (!responseHttpPost$default.isSuccessful()) {
                HMLog.error$default(TAG, null, null, new h(responseHttpPost$default), 6, null);
                return null;
            }
            ResponseBody responseBodyBody = responseHttpPost$default.body();
            if (responseBodyBody == null) {
                objM3845constructorimpl = Result.m3845constructorimpl(null);
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.error$default(TAG, null, null, new i(thM3848exceptionOrNullimpl), 6, null);
                }
                return null;
            }
            JsonObject asJsonObject = new JsonParser().parse(responseBodyBody.string()).getAsJsonObject();
            if (asJsonObject != null && (jsonElement = asJsonObject.get("ticket")) != null) {
                return jsonElement.getAsString();
            }
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.huami.third.wechat.WeChatSource
    @Nullable
    public ApiResult<QRResult> getQRCode(@NotNull String userId, @NotNull String name, @NotNull String brandName) {
        Object objM3845constructorimpl;
        try {
            HMLog.info(TAG, j.a);
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, Api.INSTANCE.getURL_QR(), r.mapOf(TuplesKt.to("wxname", name), TuplesKt.to("brandName", brandName), TuplesKt.to("userid", userId)), null, 4, null);
            try {
                Result.Companion companion = Result.Companion;
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (responseHttpGet$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpGet$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl = converter.convert(responseBodyBody, new TypeToken<ApiResult<QRResult>>() { // from class: com.huami.third.wechat.WeChatSourceImpl$getQRCode$$inlined$deserialize$1
                    }.getType());
                } else {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            ApiResult<QRResult> apiResult = (ApiResult) objM3845constructorimpl;
            if (apiResult == null) {
                return null;
            }
            if (apiResult.getData() == null) {
                HMLog.error$default(TAG, null, null, new k(apiResult), 6, null);
            }
            return apiResult;
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, l.a, 2, null);
            return null;
        }
    }

    @Override // com.huami.third.wechat.WeChatSource
    @Nullable
    public String getQRContent(@NotNull String userId, @NotNull String name, @NotNull String brandName) {
        QRResult data;
        ApiResult<QRResult> qRCode = getQRCode(userId, name, brandName);
        if (qRCode == null || (data = qRCode.getData()) == null) {
            return null;
        }
        return data.getTicket();
    }

    @Override // com.huami.third.wechat.WeChatSource
    @Nullable
    public ApiResult<UserResult> getUser(@NotNull String userId, @NotNull String name) {
        Object objM3845constructorimpl;
        try {
            HMLog.info(TAG, m.a);
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, Api.INSTANCE.getURL_USER(), r.mapOf(TuplesKt.to("wxname", name), TuplesKt.to("userid", userId)), null, 4, null);
            try {
                Result.Companion companion = Result.Companion;
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (responseHttpGet$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpGet$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl = converter.convert(responseBodyBody, new TypeToken<ApiResult<UserResult>>() { // from class: com.huami.third.wechat.WeChatSourceImpl$getUser$$inlined$deserialize$1
                    }.getType());
                } else {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            ApiResult<UserResult> apiResult = (ApiResult) objM3845constructorimpl;
            if (apiResult == null) {
                return null;
            }
            if (apiResult.getData() == null) {
                HMLog.error$default(TAG, null, null, new n(apiResult), 6, null);
            }
            return apiResult;
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, o.a, 2, null);
            return null;
        }
    }

    @Override // com.huami.third.wechat.WeChatSource
    @Nullable
    public Bitmap loadQR(@NotNull String userId, @NotNull String name, @NotNull String brandName, int size) {
        HMLog.info(TAG, p.a);
        String qRContent = getQRContent(userId, name, brandName);
        if (qRContent == null) {
            return null;
        }
        HMLog.info(TAG, new q(qRContent));
        return UtilKt.createQR(qRContent, size);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}

package com.huami.moving.sport.ui.webapi.impl;

import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.moving.sport.ui.utils.SerialzationKtxKt;
import com.huami.moving.sport.ui.webapi.ApiResult;
import com.huami.moving.sport.ui.webapi.DeviceMeta;
import com.huami.moving.sport.ui.webapi.DeviceSettingApi;
import com.huami.moving.sport.ui.webapi.ErrorCode;
import com.huami.moving.sport.ui.webapi.WebProvider;
import com.huami.tools.log.HMLog;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0003H\u0002J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0002J\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/moving/sport/ui/webapi/impl/DeviceSettingApiImpl;", "Lcom/huami/moving/sport/ui/webapi/DeviceSettingApi;", "Lcom/huami/http/HttpKit;", "Lkotlinx/serialization/json/JsonElement;", "", "Lcom/huami/moving/sport/ui/webapi/DeviceMeta;", "f", "Lkotlinx/serialization/json/JsonObject;", "e", "", "key", "", "b", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;)Ljava/lang/Integer;", "c", "", "a", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;)Ljava/lang/Boolean;", "Lkotlinx/serialization/json/JsonPrimitive;", GoogleApiAvailabilityLight.a, "sourceId", "Lcom/huami/moving/sport/ui/webapi/ApiResult;", "queryMeta", "Lcom/huami/moving/sport/ui/webapi/WebProvider;", "Lcom/huami/moving/sport/ui/webapi/WebProvider;", "webProvider", "<init>", "(Lcom/huami/moving/sport/ui/webapi/WebProvider;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceSettingApiImpl implements DeviceSettingApi, HttpKit {

    @Deprecated
    @NotNull
    public static final String MATE_SETTINGS_PATH = "device/settings/meta";

    @Deprecated
    @NotNull
    public static final String META_KEY_BLUETOOTH = "bluetooth";

    @Deprecated
    @NotNull
    public static final String META_KEY_CATEGORY = "category";

    @Deprecated
    @NotNull
    public static final String META_KEY_GPS = "gps";

    @Deprecated
    @NotNull
    public static final String META_KEY_NFC = "nfc";

    @Deprecated
    @NotNull
    public static final String META_KEY_PRODUCT_ID = "productId";

    @Deprecated
    @NotNull
    public static final String META_KEY_PRODUCT_NAME = "productName";

    @Deprecated
    @NotNull
    public static final String META_KEY_PRODUCT_VERSION = "productVersion";

    @Deprecated
    @NotNull
    public static final String META_KEY_SOURCE = "deviceSource";

    @Deprecated
    @NotNull
    public static final String META_KEY_THUMBNAIL = "thumbnail";

    @Deprecated
    @NotNull
    public static final String PARAMS_SOURCE = "deviceSources";

    @Deprecated
    @NotNull
    public static final String TAG = "DeviceSettingApiImpl";

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WebProvider webProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"com/huami/moving/sport/ui/webapi/impl/DeviceSettingApiImpl$a", "", "", "MATE_SETTINGS_PATH", "Ljava/lang/String;", "META_KEY_BLUETOOTH", "META_KEY_CATEGORY", "META_KEY_GPS", "META_KEY_NFC", "META_KEY_PRODUCT_ID", "META_KEY_PRODUCT_NAME", "META_KEY_PRODUCT_VERSION", "META_KEY_SOURCE", "META_KEY_THUMBNAIL", "PARAMS_SOURCE", "TAG", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Integer> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Query meta: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Integer, CharSequence> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @NotNull
        public final CharSequence a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public DeviceSettingApiImpl(@NotNull WebProvider webProvider) {
        this.webProvider = webProvider;
    }

    private final Boolean a(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitiveD = d(jsonObject, str);
        if (jsonPrimitiveD == null) {
            return null;
        }
        return JsonElementKt.getBooleanOrNull(jsonPrimitiveD);
    }

    private final Integer b(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitiveD = d(jsonObject, str);
        if (jsonPrimitiveD == null) {
            return null;
        }
        return JsonElementKt.getIntOrNull(jsonPrimitiveD);
    }

    private final String c(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitiveD = d(jsonObject, str);
        if (jsonPrimitiveD == null) {
            return null;
        }
        return JsonElementKt.getContentOrNull(jsonPrimitiveD);
    }

    private final JsonPrimitive d(JsonObject jsonObject, String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) str);
            objM3845constructorimpl = Result.m3845constructorimpl(jsonElement == null ? null : JsonElementKt.getJsonPrimitive(jsonElement));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (JsonPrimitive) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    private final DeviceMeta e(JsonObject jsonObject) {
        Integer numB = b(jsonObject, "deviceSource");
        return new DeviceMeta(numB == null ? -1 : numB.intValue(), c(jsonObject, META_KEY_PRODUCT_NAME), c(jsonObject, "productId"), c(jsonObject, "productVersion"), c(jsonObject, META_KEY_BLUETOOTH), c(jsonObject, "category"), c(jsonObject, META_KEY_THUMBNAIL), a(jsonObject, META_KEY_NFC), a(jsonObject, "gps"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<DeviceMeta> f(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonArray)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement2 : (Iterable) jsonElement) {
            if (jsonElement2 instanceof JsonObject) {
                arrayList.add(e((JsonObject) jsonElement2));
            }
        }
        return arrayList;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.moving.sport.ui.webapi.DeviceSettingApi
    @NotNull
    public ApiResult<List<DeviceMeta>> queryMeta(@NotNull List<Integer> sourceId) {
        Object objM3845constructorimpl;
        String strString;
        HMLog.info(TAG, new b(sourceId));
        if (sourceId.isEmpty()) {
            return new ApiResult.Failed(ErrorCode.InvalidParams.INSTANCE);
        }
        String strHost = this.webProvider.host();
        if (m.isBlank(strHost)) {
            return new ApiResult.Failed(new ErrorCode.InvalidUrl(strHost));
        }
        String str = null;
        if (!StringsKt__StringsKt.endsWith$default((CharSequence) strHost, '/', false, 2, (Object) null)) {
            strHost = strHost + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        }
        Uri.Builder builderBuildUpon = Uri.parse(strHost + MATE_SETTINGS_PATH).buildUpon();
        builderBuildUpon.appendQueryParameter(PARAMS_SOURCE, CollectionsKt___CollectionsKt.joinToString$default(sourceId, ",", null, null, 0, null, c.a, 30, null));
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpGet$default(this, builderBuildUpon.build().toString(), null, null, 6, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Response response = (Response) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        if (response == null) {
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            return new ApiResult.Failed(new ErrorCode.Error(thM3848exceptionOrNullimpl != null ? thM3848exceptionOrNullimpl.getMessage() : null));
        }
        if (!response.isSuccessful()) {
            return new ApiResult.Failed(new ErrorCode.ApiError(String.valueOf(response.code()), response.message()));
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null && (strString = responseBodyBody.string()) != null && (!m.isBlank(strString))) {
            str = strString;
        }
        if (str == null) {
            return new ApiResult.Failed(ErrorCode.NoneData.INSTANCE);
        }
        try {
            return new ApiResult.Success(f(SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).parseToJsonElement(str)));
        } catch (Exception e) {
            return new ApiResult.Failed(new ErrorCode.ParseError(e.getLocalizedMessage()));
        }
    }
}
